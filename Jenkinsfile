pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                echo 'Checking out code...'
                // Checkout commands go here
            }
        }

        stage('Build') {
            steps {
                echo 'Building...'
                // Build commands go here
            }
        }

        stage('Deploy') {
            steps {
                withCredentials([usernamePassword(credentialsId: 'eedc3cc9-f541-4afb-b95a-ef65cd5aae7d', usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD')]) {
                    echo 'Deploying with secured credentials...'
                    sh '''
                    echo 'Deploying as $USERNAME $PASSWORD'
                    # Use $USERNAME and $PASSWORD in your deploy commands
                    # For example, to log in to a server:
                    sshpass -p $PASSWORD ssh $USERNAME@yourserver.com "deploy-command"
                    '''
                }
            }
        }
    }
}