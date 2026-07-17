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
	 }
}
