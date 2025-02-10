FROM openjdk:17-alpine
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} customer.jar
ENTRYPOINT ["java","-jar","/customer.jar"]