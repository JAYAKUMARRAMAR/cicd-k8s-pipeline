pipeline {
	agent any
	stages {
	stage('Build Docker Image'){
	   steps {
			script{
				dockerImage = docker.build("jayakumarramar/cicd-k8s-pipeline:${env.BUILD_TAG}")
			}
	  }
	 }
		stage('push Docker Image'){
			steps {
				script{
					docker.withRegistry('','jenkins-token'){
					dockerImage.push();
					dockerImage.push('latest');
			}
	  }
	 }
}
