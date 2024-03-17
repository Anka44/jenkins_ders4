pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Starting build process...'
                // Basit komutlar
            }
        }

        stage('Test') {
            steps {
                script {
                    // script bloğu içinde karmaşık mantık
                    def testsToRun = ['unit', 'integration', 'e2e']
                    for (testType in testsToRun) {
                        echo "Running ${testType} tests"
                        // Test türüne göre koşullu mantık uygulama
                        if (testType == 'e2e') {
                            echo 'Setting up Selenium Grid for e2e tests'
                            // Selenium Grid kurulum komutları
                        }
                        // Testleri çalıştırma komutları
                    }
                }
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying application...'
                // Dağıtım komutları
            }
        }
    }
}