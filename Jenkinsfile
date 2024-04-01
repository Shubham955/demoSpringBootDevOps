pipeline{
  agent any
  stages{
    stage("Fetch"){
      steps{
        'git fetch'
      }
    }
    stage("Build"){
      steps{
        'cd "SpringBootDemoApp"'
        'mvn clean install'
      }
    }
  }
}
