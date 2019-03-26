FROM openjdk:8-jdk-alpine
MAINTAINER Hendi Santika <hendisantika@yahoo.co.id>
RUN apk update && apk add libc6-compat
VOLUME /tmp
ADD target/springboot-tick-sample-0.0.1.jar  app.jar
ENV JAVA_OPTS=""
EXPOSE 8080
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
