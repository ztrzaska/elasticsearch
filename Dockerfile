FROM openjdk:11-jre

COPY target/elasticsearch-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

ENTRYPOINT ["java", "-jar", "elasticsearch-0.0.1-SNAPSHOT.jar"]