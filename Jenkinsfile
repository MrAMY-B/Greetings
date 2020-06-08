pipeline {
    agent any
    stages {
        stage('Build') { 
            steps {
                echo '------------------------- Build Start --------------------------'
                withMaven(maven : 'maven-3.6.3'){
                        bat 'mvn clean compile'
                }
                echo '------------------------- End --------------------------'
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
