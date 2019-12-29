pipeline {
    agent any
    tools {
        maven 'maven_3.5.3'
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }
        stage('Unit test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Server test') {
            steps {
                echo 'Server test step'
//                sh 'mvn verify -Dskip.unit.tests'
            }
        }
        stage('Publish') {
            steps {
                sh 'mvn deploy'
            }
        }
    }
//    post {
//        always {
//            junit 'target/surefire-reports/*.xml'
//            junit 'target/failsafe-reports/*.xml'
//        }
//    }
}