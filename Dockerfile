#base image name
#FROM openjdk:11
##Target folder to find the jar file
#ADD target/*.jar app.jar
#ENTRYPOINT ["java","-jar","app.jar"]


FROM openjdk:8-jdk-alpine as build
RUN apk add --no-cache maven
WORKDIR /java
COPY . /java
RUN mvn package -Dmaven.test.skip=true
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/java/target/springboot-0.0.1-SNAPSHOT.jar"]