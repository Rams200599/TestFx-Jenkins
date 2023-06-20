pipeline {
  agent any
  stages {
    stage('Start Xvfb') {
      steps {
        sh 'Xvfb :99 -screen 0 1024x768x24 > /dev/null 2>&1 &'
        sh 'export DISPLAY=:99'
      }
    }

    stage(' Test') {
      steps {
        // sh 'export DISPLAY=:99.0 && mvn test -Dglass.platform=Monocle -Dmonocle.platform=Headless -Dprism.order=sw'
         // sh 'mvn test -Dglass.platform=Monocle -Dmonocle.platform=Headless -Dprism.order=sw'
        sh 'export DISPLAY=:99.0 && mvn test'
        echo 'Test Done'
      }
    }

    stage('Build') {
      steps {
        // sh 'export DISPLAY=:99.0 && mvn clean package -Dglass.platform=Monocle -Dmonocle.platform=Headless -Dprism.order=sw'
        // sh 'mvn clean package -Dglass.platform=Monocle -Dmonocle.platform=Headless -Dprism.order=sw'
        sh 'export DISPLAY=:99.0 && mvn clean package'
        echo 'Build Done'
      }
    }

  }
}
