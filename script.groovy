// script.groovy
def runTests() {
    def testsToRun = ['unit', 'integration', 'e2e']
    for (testType in testsToRun) {
        echo "Running ${testType} tests"
        if (testType == 'e2e') {
            echo 'Setting up Selenium Grid for e2e tests'
            // Selenium Grid kurulum komutları
        }
        // Testleri çalıştırma komutları
    }
}

return this