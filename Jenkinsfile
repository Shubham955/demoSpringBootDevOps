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
        bat 'cd "SpringBootDemoApp"'
        bat 'mvn clean install'
      }
    }
  }
}
