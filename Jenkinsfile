pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh './gradlew.bat clean assembleDebug test connectedAndroidTest assembleRelease'
      }
    }

  }
  environment {
    stage = 'build'
  }
}