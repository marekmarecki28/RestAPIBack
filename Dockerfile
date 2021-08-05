FROM openjdk:8u252-jdk-buster
ADD build/libs/gs-rest-service-0.1.0.jar .
EXPOSE 8000
CMD java -jar gs-rest-service-0.1.0.jar