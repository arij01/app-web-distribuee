FROM openjdk:17
EXPOSE 9190
ADD target/Candidat-0.0.1-SNAPSHOT.jar Candidat.jar
ENTRYPOINT ["java","-jar","Candidat.jar"]
