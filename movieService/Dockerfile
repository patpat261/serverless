# # Step 1: Use an official OpenJDK base image
# FROM openjdk:17-jdk-slim
#
# # Step 2: Set the working directory
# WORKDIR /app
#
# # Step 3: Copy the JAR file into the container
# COPY target/movie-service-1.0-SNAPSHOT.jar app.jar
#
# # COPY ../wait-for-it.sh /usr/local/bin/wait-for-it
# # RUN chmod +x /usr/local/bin/wait-for-it
#
# # Step 4: Expose the port (e.g., 8080, default for Spring Boot)
# EXPOSE 8080
#
# # Step 5: Run the application
# ENTRYPOINT ["java", "-jar", "app.jar"]

# Step 1: Use an official OpenJDK base image
# FROM openjdk:17-jdk-slim
#
# # Step 2: Set the working directory
# WORKDIR /app
#
# # Step 3: Copy the JAR file into the container
# COPY target/movie-service-1.0-SNAPSHOT.jar app.jar
#
# # Copy the wait-for-it.sh script into the container
# COPY wait-for-it.sh /usr/local/bin/wait-for-it
# RUN chmod +x /usr/local/bin/wait-for-it
#
# # Step 4: Expose the port (e.g., 8082 for movie-service)
# EXPOSE 8082
#
# # Step 5: Use the wait-for-it script to wait for PostgreSQL, then run the Java application
# ENTRYPOINT ["/usr/local/bin/wait-for-it", "postgres:5432", "-t", "60", "--", "java", "-jar", "app.jar"]


# FROM openjdk:17-jdk-slim
#
# # Step 2: Set the working directory
# WORKDIR /app
#
# # Step 3: Copy the JAR file into the container
# COPY target/movie-service-1.0-SNAPSHOT.jar app.jar
#
# # Copy the wait-for-it.sh script into the container
# COPY wait-for-it.sh /usr/local/bin/wait-for-it
# RUN chmod +x /usr/local/bin/wait-for-it
#
# # Step 4: Expose the port (8082 for movie-service)
# EXPOSE 8080
#
# # Step 5: Use the wait-for-it script to wait for PostgreSQL, then run the Java application
# ENTRYPOINT ["wait-for-it", "postgres:5432", "-t", "60", "--", "java", "-jar", "app.jar"]

FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/movie-service-1.0-SNAPSHOT.jar movie-service.jar

COPY wait-for-it.sh /usr/local/bin/wait-for-it.sh
RUN chmod +x /usr/local/bin/wait-for-it.sh

EXPOSE 8080

ENTRYPOINT ["/usr/local/bin/wait-for-it.sh", "postgres:5432", "-t", "60", "--", "java", "-jar", "movie-service.jar"]


# Step 1:
# FROM openjdk:17-jdk-slim
#
# # Step 2: Set the working directory
# WORKDIR /app
#
# # Step 3: Copy the JAR file into the container
# COPY target/movie-service-1.0-SNAPSHOT.jar app.jar
#
# # Copy the wait-for-it.sh script into the container
# COPY wait-for-it.sh /usr/local/bin/wait-for-it
# RUN chmod +x /usr/local/bin/wait-for-it
#
# # Step 4: Expose the port (e.g., 8082 for movie-service)
# EXPOSE 8082
#
# # Step 5: Use the wait-for-it script to wait for PostgreSQL, then run the Java application
# ENTRYPOINT ["/usr/local/bin/wait-for-it", "postgres:5432", "-t", "60", "--", "java", "-jar", "app.jar"]