FROM ubuntu:latest AS build

RUN as pat-get update
RUN apt-get install open-jdk-17-jdk -y
COPY . .

RUN apt-get install maven -y

FROM openjdk:17-slim

EXPOSE 8080

COPY --from=build comanda-digital-deploy.jar app.jar

ENTRYPOINT [ "java", "-jar", "app.jar" ]

