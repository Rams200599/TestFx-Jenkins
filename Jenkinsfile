pipeline {
  agent any
  stages {
    stage('Start Xvfb') {
  steps {
    sh 'Xvfb :99 -screen 0 1024x768x24 > /dev/null 2>&1 &'
    sh 'export DISPLAY=:99'
  }
}

   stage('Build and Test') {
  steps {
    sh 'mvn clean javafx:compile'
    sh 'mvn test -Dglass.platform=Monocle -Dmonocle.platform=Headless -Dprism.order=sw'
  }
}

  }
}
