pipeline {
	agent any
	   stages {
       stage('Compile'){
			steps {
			   sh "mvn clean compile"
			}
	   }
       stage('Test'){
			steps {
			   sh "mvn test"
			}
	  }
       stage('Integration Test'){
			steps {
			   sh "mvn failsafe:integration-test failsafe:verify"
			}
	  }
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
