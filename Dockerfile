FROM openjdk:8

RUN mkdir "/app"

COPY target/Logs-1.0-SNAPSHOT.jar /app
COPY target/libs /app/libs
WORKDIR /app

CMD ["java", "-jar", "Logs-1.0-SNAPSHOT.jar", "Main"]
