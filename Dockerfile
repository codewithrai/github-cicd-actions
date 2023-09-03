FROM openjdk:11
EXPOSE 8080
WORKDIR /
ADD target/springboot-github-actions.jar ./springboot-github-actions.jar
CMD ["java", "-jar", "/springboot-github-actions.jar"]