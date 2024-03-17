pipeline {
    agent any
    parameters {
        string(name: 'GREETING', defaultValue: 'Hello', description: 'Greeting message')
        booleanParam(name: 'DEPLOY', defaultValue: true, description: 'Deploy to production?')
        choice(name: 'ENVIRONMENT', choices: ['staging', 'production'], description: 'Deployment environment')
        text(name: 'DEPLOYMENT_NOTES', defaultValue: '', description: 'Notes for the deployment')
        password(name: 'SECRET', description: 'A secret password')
    }

    stages {
        stage('Initialization') {
            steps {
                echo "Greeting: ${params.GREETING}"
                echo "Environment: ${params.ENVIRONMENT}"
            }
        }

        stage('Build') {
            steps {
                echo 'Building...'
                // Build commands go here
            }
        }

        stage('Deploy') {
            when {
                expression {
                    return params.DEPLOY && params.ENVIRONMENT == 'production'
                }
            }
            steps {
                echo "Deploying to ${params.ENVIRONMENT}..."
                echo "Deployment notes: ${params.DEPLOYMENT_NOTES}"
                // Deployment commands go here
            }
        }
    }
}