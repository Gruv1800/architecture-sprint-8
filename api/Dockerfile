FROM eclipse-temurin:21-jdk-alpine as builder
WORKDIR ./
COPY ./ ./
RUN ./mvnw clean package -DskipTests

FROM eclipse-temurin:21-jre-alpine
WORKDIR ./
COPY --from=builder ./target/*.jar app.jar
EXPOSE 8000
ENTRYPOINT ["java", "-jar", "app.jar"]