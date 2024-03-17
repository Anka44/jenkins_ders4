pipeline {
    agent any
    tools {
        maven 'maven 3.9.6'
    }
    parameters {
        string(name: 'DOCKERHUB_REPO', defaultValue: 'btwdevops/jenkinsders4', description: 'Docker Hub repository for production')
        string(name: 'TEST_DOCKERHUB_REPO', defaultValue: 'btwdevops/jenkinsders4test', description: 'Docker Hub repository for test')
        string(name: 'VERSION', defaultValue: '1.0.0', description: 'Version of the project')
        choice(name: 'MAJOR_VERSION', choices: ['1', '2', '3'], description: 'Major version number')
    }
    stages {

        stage('Build and Push Test Image') {
            steps {
                script {
                    def script = load 'script.groovy'
                    script.buildAndPushImage("", params.TEST_DOCKERHUB_REPO, params.VERSION, env.BUILD_NUMBER.toInteger())
                }
            }
        }
        stage('Manual Approval') {
            steps {
                input message: 'Approve deployment to production?', ok: 'Deploy'
            }
        }
        stage('Build and Push Production Image') {
            when {
                expression {
                    return params.MAJOR_VERSION == '1' // Örneğin, sadece MAJOR_VERSION 1 olduğunda prod'a deploy et
                }
            }
            steps {
                script {
                    def script = load 'script.groovy'
                    script.buildAndPushImage("prod", params.DOCKERHUB_REPO, params.VERSION, env.BUILD_NUMBER.toInteger())
                }
            }
        }
    }
}