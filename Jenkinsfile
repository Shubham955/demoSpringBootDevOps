pipeline{
  agent any
  stages{
    stage("Fetch"){
      steps{
        sh 'git fetch'
      }
    }
    stage("Build"){
      steps{
        sh 'cd "SpringBootDemoApp"'
        sh 'mvn clean install'
      }
  }
}
