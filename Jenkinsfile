pipeline {
	agent any
	stages {
	stage('Build Docker Image'){
	   steps {
		   sh "docker build -t "jayakumarramar/cicd-k8s-pipeline:$env.BUILD_TAG ."
		 }
	 }
}
}
