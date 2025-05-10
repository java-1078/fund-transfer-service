FROM openjdk:17-jdk-slim
WORKDIR /app
EXPOSE 8888
COPY build/libs/fund-transfer-service-0.0.1-SNAPSHOT.jar /app/fund-transfer-service.jar
ENTRYPOINT ["java","-jar","fund-transfer-service.jar"]