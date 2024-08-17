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
        stage('Build Docker Image') {
            steps {
                bat 'docker-compose build'
            }
        }
        stage('Deploy with Docker Compose') {
            steps {
                bat 'docker-compose up -d'
            }
        }
    }
    post {
        always {
            bat 'docker-compose down'
        }
    }
}
