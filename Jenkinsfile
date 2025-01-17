/*
pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "maven"
    }

    stages {

        //--SCM Checkout---> build---> deploy WAR----> Send Email

        stage('SCM Checkout'){
            steps {
                checkout scmGit(branches: [[name: '*//*
main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/ahsan203/jenkins-ci-cd-phase1.git']])
            }

        }

        stage('Build Process') {

            steps {
                    script{
                        sh 'mvn clean install'
                    }

            }
        }

    }

   post {
    always {
       emailext attachLog: true, body: '''<html>
        <body>
                 <p> Build Status : ${BUILD_STATUS}</p>
                 <p> Build Number : ${BUILD_NUMBER} </p>
                 <p> Check the <a href="${BUILD_URL}">console output </a>. </p>
        </body>
</html>''', mimeType: 'text/html', replyTo: 'officialasmohammed06@gmail.com', subject: 'Pipeline Number : ${BUILD_NUMBER}', to: 'officialasmohammed06@gmail.com'
    }
}

}
 */
