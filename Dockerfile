FROM openjdk:17
EXPOSE 8761
ADD target/Discovery-0.0.1-SNAPSHOT.jar Discovery.jar
ENTRYPOINT ["java","-jar","Discovery.jar"]