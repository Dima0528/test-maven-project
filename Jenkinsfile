pipeline {
    agent any
    stages {
        stage('Install') {
            steps {
                bat '''

                    mvn clean install

                '''
            }
        }
        stage('Tests') {
            steps {
                bat '''

                    mvn test

                '''
            }
        }
    }
}