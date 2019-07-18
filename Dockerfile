FROM gradle:5.4.1-jdk8-alpine
WORKDIR /app
COPY --chown=gradle:gradle . .
EXPOSE 8080
USER root
RUN chown -R gradle /app
USER gradle
RUN ./gradlew build --stacktrace
RUN cp ./build/libs/app-0.0.1-SNAPSHOT.jar app.jar
CMD ["java", "-jar", "app.jar"]
