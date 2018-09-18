FROM openjdk:8
ADD /target/spljson-bpmshore.jar  spljson-bpmshore.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "contact-bpmshore.jar"]