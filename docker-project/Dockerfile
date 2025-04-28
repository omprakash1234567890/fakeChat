# filepath: /docker-project/docker-project/Dockerfile
# Start with a lightweight Java image
FROM openjdk:17-jdk-slim

# Set working directory inside container
WORKDIR /app

# Copy your jar file into the container
COPY target/fakeinsta-0.0.1-SNAPSHOT.jar app.jar

# Expose the port Spring Boot runs on
EXPOSE 8080

# Command to run the jar
ENTRYPOINT ["java", "-jar", "app.jar"]