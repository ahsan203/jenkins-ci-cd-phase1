FROM openjdk:17
WORKDIR /appContainer
COPY ./target/Ahsans-Jenkins-CI-CD-Phase-1.war /appContainer
EXPOSE 8989
CMD ["java","-war","Ahsans-Jenkins-CI-CD-Phase-1.war"]