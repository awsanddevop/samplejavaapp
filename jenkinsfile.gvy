pipeline {
    agent any


    stages {
        stage('Build') {
            steps {
                build 'Push to test'
            }

            post {
                
                success {
                    build 'push to Prod'
                }
            }
        }
    }
}
