FROM ubuntu:latest AS build

RUN as pat-get update
RUN apt-get install open-jdk-18-jdk -y
COPY . .

RUN apt-get  install maven -y

FROM openjdk:18-alpine

EXPOSE 8080

COPY --from=build /target/comanda-digital-deploy.jar app.jar

ENTRYPOINT [ "java", "-jar", "app.jar" ]

