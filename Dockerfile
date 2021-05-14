FROM openjdk

WORKDIR /app

COPY build/libs/demo-0.0.1-SNAPSHOT.jar /app/demo-app.jar

ENTRYPOINT ["java", "-jar", "demo-app.jar"]