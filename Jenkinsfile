pipeline {
    agent any

    environment {
        // Define any environment variables you might need
        // For example, JAVA_HOME for the JDK installation
        JAVA_HOME = tool name: 'JDK 22', type: 'jdk'
    }

    stages {
        stage('Checkout') {
            steps {
                // Checkout the code from the Git repository
                git branch: 'main', url: 'https://github.com/margarethvargas/tarea-backend.git'
            }
        }

        stage('Build') {
            steps {
                // Build the project using Gradle
                script {
                    def gradleHome = tool name: 'Gradle 7.4', type: 'gradle'
                    env.PATH = "${gradleHome}/bin:${env.PATH}"
                }
                sh './gradlew build'
            }
        }

        stage('Test') {
            steps {
                // Run tests
                sh './gradlew test'
            }
        }

        stage('Package') {
            steps {
                // Package the application
                sh './gradlew assemble'
            }
        }

        stage('Deploy') {
             steps {
                script {
                    def jarFiles = sh(script: 'ls build/libs/*.jar', returnStdout: true).trim()
                    echo "JAR Files: ${jarFiles}"
                    // Assuming there's only one JAR file, you can use it in the next step
                    def jarFile = jarFiles.split('\n')[0]
                    sh "cp ${jarFile} /path/to/deployment/directory"
                }
            }
        }
    }
}
