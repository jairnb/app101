FROM openjdk:latest
VOLUME /tmp
COPY target/app101-0.0.1-SNAPSHOT.jar app101-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/app101-0.0.1-SNAPSHOT.jar"]