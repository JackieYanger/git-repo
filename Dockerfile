FROM openjdk:23-ea-18-jdk-slim
LABEL maintainer=ysd
COPY target/*.jar  /app.jar
ENTRYPOINT ["java","-jar","app.jar"]