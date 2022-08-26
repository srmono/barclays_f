#define base docker image
FROM openjdk:11
LABEL maintainer="barclays.com"
ADD target/restapi-0.0.1-SNAPSHOT.jar springboot-docker-api.jar
ENTRYPOINT ["java","-jar","springboot-docker-api.jar"]