pipeline {
    agent any

    stages {
        stage('Clone') {
            steps {
                echo "Running ${env.BUILD_ID} on ${env.JENKINS_URL}"
                sh 'pwd'
                sh 'rm -rf ./*'
                git branch: 'main', url: 'https://github.com/edizbak/maven_its.git'

            }
        }
        stage('Build') {
            steps {
                /* sh 'cd maven_its' */
                echo 'Building..'
                sh 'mvn clean install compile'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                sh 'mvn test'
            }
        }
        stage('Package') {
            steps {
                echo 'Emballage....'
                sh 'mvn package'
            }
        }
        stage('Run') {
            steps {
                echo 'Running....'
                sh 'java -jar ./target/demo-0.1.jar'
            }
        }
    }
}