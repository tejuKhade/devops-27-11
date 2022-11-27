node {
  stage('pull-code') {
    git credentialsId: 'tejaswini-git', url: 'https://github.com/tejuKhade/devops-27-11.git'
  }
  stage('Test') {
   sh '''pwd
   ls'''
  }
  stage('Deploy') {
   echo 'your code pull successfully'
  }
}