pipeline {
    agent any

    stages {
        stage('Check Docker') {
            steps {
                bat 'docker --version'
            }
        }

        stage('Checkout') {
            steps {
                git 'https://github.com/margarethvargas/tarea-backend.git'
            }
        }
        stage('Build') {
            steps {
                bat 'gradlew clean build'
            }
        }
        stage('Deploy with Docker Compose') {
            steps {
                bat 'docker compose up -d'
            }
        }
    }
}
