# Use an official OpenJDK 17 runtime as a parent image
FROM openjdk:17-jdk-alpine

# Set the working directory to /app
WORKDIR /app

# Copy the jar file to the container
ARG JAR_FILE=target/demo-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar

# Expose port 3000:7001
EXPOSE 7001

# Run the jar file when the container starts
ENTRYPOINT ["java", "-jar", "app.jar"]
