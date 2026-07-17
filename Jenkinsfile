//generate declarative pipeline for jenkins
pipeline {
	agent any
	// stages {
	// 	stage('Build') {
	// 		steps {
	// 			echo 'Building...'
	// 			// Add build steps here
	// 		}
	// 	}
	// 	stage('Test') {
	// 		steps {
	// 			echo 'Testing...'
	// 			// Add test steps here
	// 		}
	// 	}
	// 	stage('Integration Test') {
	// 		steps {
	// 			echo 'Integration Testing...'
	// 			// Add deploy steps here
	// 		}
	// 	}
	// }
	post{
		always{
			enho 'I am awesome. I run always'
		}
		success{
			enho 'I run when you are successful'
		}
		failure{
			echo 'I run when you are failed'
		}
	}
}