pipeline {
    agent any
    tools {
        maven 'Maven3'
        }
    stages {
        stage ('checking') {
            steps {
                git branch: 'main', url: 'https://github.com/Miro193/Lecca_tutorial_Week6.git'
                }
            }
        stage ('build') {
            steps {
                sh 'mvn clean package'
                }
            }
            stage('Test') {
                        steps {
                            sh 'mvn test'
                        }
                    }
                    stage('Code Coverage') {
                        steps {
                            sh 'mvn jacoco:report'
                        }
                    }
                    stage('Publish Test Results') {
                        steps {
                            junit '**/target/surefire-reports/*.xml'
                        }
                    }
                    stage('Publish Coverage Report') {
                        steps {
                            jacoco()
                        }
                    }
        }