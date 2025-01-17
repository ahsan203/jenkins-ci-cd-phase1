FROM openjdk:17
WORKDIR /appContainer
COPY ./target/Ahsans-Jenkins-CI-CD-Phase-1.jar /appContainer
EXPOSE 8989
CMD ["java","-jar","Ahsans-Jenkins-CI-CD-Phase-1.jar"]