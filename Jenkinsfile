pipeline{
  agent any
  stages{
    stage("Fetch"){
      steps{
        bat 'git fetch'
      }
    }
    stage("Build"){
      steps{
        dir("SpringBootDemoApp"){
          bat 'mvn clean install'
        }
      }
    }
  }
}
