pipeline {
//	agent any
    agent{docker{image 'maven:3.9.3-openjdk-20'}}
	 stages {
       stage('Build'){   
			steps {
				sh 'mvn --version'
				echo "Building the project..."
			}
	   }
	}
}