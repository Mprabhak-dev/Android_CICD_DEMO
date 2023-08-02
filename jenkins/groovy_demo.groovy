def call(){
  env.GIT_VER = sh (
    script: "git describe --always --dirty",
    returnStdout: true
  ).trim()
  sh".\gradlew.bat clean assembleDebug test connectedAndroidTest assembleRelease"
}
return this;