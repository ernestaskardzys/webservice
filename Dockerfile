FROM openjdk:11.0.4-jre-slim

COPY build/libs/webservice-all.jar /app.jar
EXPOSE 8080
CMD ["java", "-jar", "/app.jar"]