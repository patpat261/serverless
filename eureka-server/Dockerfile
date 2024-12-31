# # Stage 1: Build the application
# FROM maven:3.8.5-openjdk-17-slim AS build
#
# # Set the working directory
# WORKDIR /app
#
# # Copy the parent pom.xml and all modules
# COPY CineVisionMicroservice/pom.xml pom.xml
# COPY CineVisionMicroservice/eureka-server/pom.xml eureka-server/pom.xml
# COPY CineVisionMicroservice/eureka-server/src eureka-server/src
#
# # Build the project
# RUN mvn clean install -DskipTests
#
# # Stage 2: Create the final image
# FROM openjdk:17-jdk-alpine
#
# # Set the maintainer label
# LABEL maintainer="your-email@example.com"
#
# # Set the working directory
# WORKDIR /app
#
# # Expose the port
# EXPOSE 8761
#
# # Copy the built jar file from the previous stage
# COPY --from=build /app/eureka-server/target/eureka-server-1.0-SNAPSHOT.jar app.jar
#
# # Run the application
# ENTRYPOINT ["java", "-jar", "app.jar"]

# Step 1: Use an official OpenJDK base image
FROM openjdk:17-jdk-slim

# Step 2: Set the working directory
WORKDIR /app

# Step 3: Copy the JAR file into the container
COPY target/eureka-server-1.0-SNAPSHOT.jar app.jar

# Step 4: Expose the port (e.g., 8761, default for Eureka Server)
EXPOSE 8761

# Step 5: Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
