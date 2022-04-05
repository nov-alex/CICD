FROM openjdk:17.0.2

COPY build/libs/CICD-1.0-SNAPSHOT.jar cicd.jar

EXPOSE 9318

ENTRYPOINT ["java", "-jar", "/cicd.jar"]
