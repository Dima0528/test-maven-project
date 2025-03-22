pipeline {
    agent any
    stages {
        stage('Збірка') {
            steps {
                bat 'dir "C:\\Program Files\\Maven\\apache-maven-3.9.9"'

                bat '''

                    mvn clean install

                '''
            }
        }
    }
}