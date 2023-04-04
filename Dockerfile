FROM openjdk:17
EXPOSE 8081
ADD target/car-retailer-docker.jar car-retailer-docker.jar
ENTRYPOINT [ "java","-jar","car-retailer-docker.jar" ]