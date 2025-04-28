FROM openjdk:17-jdk-slim

WORKDIR /app

# Copy jar file
COPY target/fakeinsta-0.0.1-SNAPSHOT.jar app.jar

# Enable development mode
ENV SPRING_PROFILES_ACTIVE=dev
ENV SPRING_DEVTOOLS_REMOTE_SECRET=mysecret

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar", "--spring.devtools.remote.secret=mysecret"]