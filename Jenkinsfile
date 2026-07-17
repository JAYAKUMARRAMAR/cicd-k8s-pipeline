pipeline {
	agent any
	 stages {
       stage('Integration Test'){
			steps {
			   sh "mvn failsafe:integration-test failsafe:verify"
			}
	  }
	 }
}
