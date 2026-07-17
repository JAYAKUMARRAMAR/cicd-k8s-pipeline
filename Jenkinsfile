pipeline {
	agent any
//  agent{docker{image 'maven:3.6.3'}}
//    agent{ docker { image 'node:13.8'}}
	 stages {
       stage('Build'){
			steps {
			//	sh 'mvn --version'
     		//	sh 'node --version'
				echo "Building the project..."
				echo "PATH - $PATH"
				echo "BUILD_NUMBER - $env.BUILD_NUMBER"
				echo "BUILD_ID - $env.BUILD_ID"
				echo "JOB_NAME - $env.JOB_NAME"
				echo "BUILD_TAG - $env.BUILD_TAG"
				echo "BUILD_URL - $env.BUILD_URL" 
			}
	   }
	}
}