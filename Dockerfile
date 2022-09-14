FROM openjdk:slim-buster
ARG JAR_FILE=lab1server/target/*.jar
COPY ${JAR_FILE} app.jar
EXPOSE $PORT
CMD [ "java","-jar","app.jar", "--server.port=${PORT}"]