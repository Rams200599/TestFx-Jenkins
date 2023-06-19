pipeline {
  agent any
  stages {
    stage('Test') {
      steps {
        sh 'mvn test'
      }
    }

    stage('Deploy') {
      steps {
        echo 'Deployed'
      }
    }

  }
}