pipeline {
	agent any
	 stages {
	   stages {
       stage('Compile'){
			steps {
			   sh "mvn clean compile"
			}
	  }
	 }
	stages {
       stage('Test'){
			steps {
			   sh "mvn test"
			}
	  }
	 }
       stage('Integration Test'){
			steps {
			   sh "mvn failsafe:integration-test failsafe:verify"
			}
	  }
	 }
}
