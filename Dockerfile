FROM openjdk:11
ADD target/products-service.jar products
ENTRYPOINT ["java", "-jar","products"]
EXPOSE 8080