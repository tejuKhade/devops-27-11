node {
  stage('pull-code') {
    git branch: 'main', credentialsId: 'tejaswini', url: 'https://github.com/tejuKhade/devops-27-11.git'
  }
  stage('Test') {
   sh '''pwd
   ls'''
  }
  stage('Deploy') {
   echo 'your code pull successfully'
  }
}