FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/Week4UserService-0.0.1-SNAPSHOT.jar /app

EXPOSE 8081

CMD ["java", "-jar", "Week4UserService-0.0.1-SNAPSHOT.jar", "--sring.profiles.active=docker"]