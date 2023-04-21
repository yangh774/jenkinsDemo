FROM java:11

COPY *.jar /app.jar

CMD ["--server.port=8801"]

EXPOSE 8801

ENTRYPOINT ["java", "-jar", "/app.jar"]
