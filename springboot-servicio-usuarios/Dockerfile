FROM maven:3.6.3-jdk-8-slim AS builder
WORKDIR /app
COPY pom.xml .
RUN mvn -B -e -C -T 1C org.apache.maven.plugins:maven-dependency-plugin:3.0.2:go-offline
COPY src ./src
RUN ls -la ./src
RUN mvn clean package -Dmaven.test.skip=true
RUN ls -la /app
RUN ls -la /app/target

FROM openjdk:8u265-jre-slim
VOLUME /tmp
COPY --from=builder /app/target/springboot-servicio-usuarios-*.jar servicio-usuarios.jar
ENTRYPOINT ["java", "-jar", "/servicio-usuarios.jar"]
