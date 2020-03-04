FROM openjdk:8-jdk-alpine

WORKDIR /

ADD target/spring-in-docker-0.0.1.jar spring-in-docker-0.0.1.jar

EXPOSE 8080

CMD java -jar spring-in-docker-0.0.1.jar
