# Step 1: Use an official OpenJDK base image
FROM openjdk:17-jdk-slim

# Step 2: Set the working directory
WORKDIR /app

# Step 3: Copy the JAR file into the container
COPY target/user-service-1.0-SNAPSHOT.jar app.jar

# Step 4: Expose the port (e.g., 8080, default for user service)
EXPOSE 8080

# Step 5: Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
