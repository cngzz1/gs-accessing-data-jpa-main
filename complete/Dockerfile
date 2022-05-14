FROM maven:3.8.5-eclipse-temurin-11-alpine@sha256:4c200b95e6b69ed4d301220839afb30dc0f697752843ff9e30042cee4f84fcf3 AS build

RUN mkdir /project
WORKDIR /project
COPY . /project
RUN mvn -T 1C clean package -Dmaven.test.skip -DskipTests -Dmaven.javadoc.skip=true

# Package stage
FROM eclipse-temurin:11.0.14.1_1-jre-alpine@sha256:715fd2150d5d18118e809936382ec46fd2390266a7326b3d6e0f97ec2ed261ed
RUN apk add dumb-init
RUN mkdir /app
RUN addgroup --system javauser && adduser -S -s /bin/false -G javauser javauser
COPY --from=build /project/target/demo-0.1.0.jar /app/demo.jar
WORKDIR /app
RUN chown -R javauser:javauser /app
USER javauser
CMD "dumb-init" "java" "-jar" "demo.jar"