pipeline {
  agent any
  stages {
    stage('Test') {
      steps {
        sh 'mvn test -Dtestfx.robot=monocle -Dtestfx.headless=true'
      }
    }

    stage('Deploy') {
      steps {
        echo 'Deployed'
      }
    }

  }
}
