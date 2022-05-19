pipeline {
    agent any
    stages {
       stage('selenium test')
               {
                   steps{
                       git branch: 'master', credentialsId: '8a1ca2fb-0928-4ae7-9ab2-0ab26fd9fbe9', url: 'https://github.com/irfanjh/gecko_test.git'
                       sh 'mvn -B clean test'
                   }
               }
       }
    }