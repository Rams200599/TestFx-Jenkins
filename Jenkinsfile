pipeline {
  agent any
  stages {
    // stage('Start Xvfb') {
    //   steps {
    //     sh 'Xvfb :99 -screen 0 1024x768x24 > /dev/null 2>&1 &'
    //     sh 'export DISPLAY=:99'
    //   }
    // }

    stage('Xvfb Setup') {
    steps {
        script {
            def xvfbCommand = 'Xvfb :99 -ac -screen 0 1280x1024x24'
            def xvfbProcess = null

            try {
                xvfbProcess = launcher.launch().cmds('sh', '-c', xvfbCommand).start()
                env.DISPLAY = ":99"
            } finally {
                if (xvfbProcess != null) {
                    xvfbProcess.kill()
                }
            }
        }
    }
}

    stage(' Test') {
      steps {
        // sh 'export DISPLAY=:99.0 && mvn test -Dglass.platform=Monocle -Dmonocle.platform=Headless -Dprism.order=sw'
         // sh 'mvn test -Dglass.platform=Monocle -Dmonocle.platform=Headless -Dprism.order=sw'
        sh '${xvfbCommand} && mvn test'
          // sh 'mvn test'
        echo 'Test Done'
      }
    }

    stage('Build') {
      steps {
        // sh 'export DISPLAY=:99.0 && mvn clean package -Dglass.platform=Monocle -Dmonocle.platform=Headless -Dprism.order=sw'
        // sh 'mvn clean package -Dglass.platform=Monocle -Dmonocle.platform=Headless -Dprism.order=sw'
        // sh 'export DISPLAY=:99.0 && mvn clean package'
        sh 'mvn clean package'
        echo 'Build Done'
      }
    }

  }
}
