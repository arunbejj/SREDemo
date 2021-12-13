FROM openjdk:17-jdk-alpine
EXPOSE 8080
EXPOSE 9999
ARG JAR_FILE=target/*.jar
ADD ${JAR_FILE} my-app.jar
ENTRYPOINT ["java","-jar","/my-app.jar"]
