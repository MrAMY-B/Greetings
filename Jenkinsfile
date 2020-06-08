pipeline {
    agent any
    tools {
        maven 'maven-3.6.3'
    }
    stages {
        stage('Build') { 
            steps {
                echo '---------------------------------------------------'
                withMaven(maven : 'apache-maven-3.6.3'){
                          bat 'mvn clean compile'
                }
                echo '---------------------------------------------------'
            }
        }
        stage('Test') { 
            steps {
                echo '---------------------------------------------------'
                sh 'mvn test'
                echo '---------------------------------------------------'
            }
        }
        stage('Deploy') { 
            steps {
                echo '---------------------------------------------------'
                sh 'mvn install'
                echo '---------------------------------------------------'
            }
        }
    }
}
