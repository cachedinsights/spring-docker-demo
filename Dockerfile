FROM openjdk:8-jdk-alpine

WORKDIR /spring-app

COPY . .

ENTRYPOINT ["java","-jar","/spring-app/target/spring-boot-docker-1.jar"]