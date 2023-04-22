FROM myjdk11:1.0.0

COPY /usr/local/jenkins/jenkins_home/workspace/demo5/target/*.jar /app.jar

CMD ["--server.port=8801"]

EXPOSE 8801

ENTRYPOINT ["java", "-jar", "/app.jar"]
