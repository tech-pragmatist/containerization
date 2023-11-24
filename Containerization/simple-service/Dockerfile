FROM        java:8u72-jre

LABEL       authors="deepvin"

WORKDIR     /apps/services
COPY        target/simple-service-0.0.1-SNAPSHOT.jar .

EXPOSE      9001
ENTRYPOINT  ["java", "-jar", "simple-service-0.0.1-SNAPSHOT.jar"]