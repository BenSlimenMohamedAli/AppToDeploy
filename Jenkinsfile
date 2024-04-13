pipeline {
     agent any
      options {
        skipStagesAfterUnstable()
    }
  

    stages {
          stage('Git check out') {
            steps {
                echo 'Git'
                git 'https://github.com/Mohamed-soft-ing/AppToDeploy.git'
            }
        }
        
     
        
         stage('Gradle Build') {
            steps {
             sh './gradlew clean build'
            }
         }
          stage('Clean and Test') {
            steps {
                // Schritt zum Ausführen von clean und test mit gradlew
                sh './gradlew clean test --no-daemon'
            }
        }
        
        stage('Deploy') {
            steps {
                echo 'ToDo Deploy'
                
            }
        }
        
        // stage('Publish Artifact to Nexus') {
        //     steps {
        //         sh './gradlew publish --no-daemon'
        //     }
        // }

      
         // Attention write yourEmail
        stage('Email Jenkins Pipeline') {
            steps{
             mail bcc: '', body: 'Hallo, das ist eine E-Mail von Jenkins Pipeline.', cc: '', from: 'Jenkins', replyTo: '', subject: 'EmailJenkinsPipeline', to: 'yourEmail'   
            }
        }
    }
}
