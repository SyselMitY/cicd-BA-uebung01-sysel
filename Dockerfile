FROM maven:3-eclipse-temurin-21-alpine AS build
WORKDIR /app

COPY pom.xml .
COPY src ./src

RUN mvn -B -DskipTests=false package && ls -lah target


FROM eclipse-temurin:21-jre-alpine-3.22
WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

ENTRYPOINT ["java","-cp","/app/app.jar","com.example.cicd.App"]
