pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Starting build process...'
            }
        }

        stage('Test') {
            steps {
                script {
                    // Harici Groovy script'ini yükle
                    def script = load 'script.groovy'
                    script.runTests()
                }
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying application...'
            }
        }
    }
}