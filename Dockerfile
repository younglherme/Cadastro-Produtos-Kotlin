# Multi-stage build
# Stage 1: Build
FROM maven:3.9-eclipse-temurin-17-alpine AS builder

WORKDIR /app

# Copiar pom.xml
COPY pom.xml .

# Download dependencies (offline cache)
RUN mvn dependency:go-offline -B

# Copiar source code
COPY src ./src

# Build application
RUN mvn clean package -DskipTests -B

# Stage 2: Runtime
FROM eclipse-temurin:17-jre-alpine

WORKDIR /app

# Create non-root user for security
RUN addgroup -S appuser && adduser -S appuser -G appuser

# Copy JAR from builder
COPY --from=builder /app/target/crud-*.jar app.jar

# Change ownership
RUN chown -R appuser:appuser /app

# Switch to non-root user
USER appuser

# Expose port
EXPOSE 8080

# Health check (sem actuator — usa o endpoint raiz)
HEALTHCHECK --interval=30s --timeout=5s --start-period=60s --retries=5 \
  CMD wget --no-verbose --tries=1 --spider http://localhost:8080/ || exit 1

# Run application
ENTRYPOINT ["java", "-jar", "/app/app.jar"]