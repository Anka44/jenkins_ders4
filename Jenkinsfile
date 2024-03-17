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
                withCredentials([usernamePassword(credentialsId: 'my-deploy-creds', usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD')]) {
                    echo 'Deploying with secured credentials...'
                    sh '''
                    echo "Deploying as $USERNAME"
                    # Use $USERNAME and $PASSWORD in your deploy commands
                    # For example, to log in to a server:
                    sshpass -p $PASSWORD ssh $USERNAME@yourserver.com "deploy-command"
                    '''
                }
            }
        }
    }
}