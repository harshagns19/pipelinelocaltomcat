pipeline {
	agent any
	
	stages {
	
		stage('Build'){
			steps {
				
				echo 'stage 1'
				bat 'mvn clean package'
			}
		}
		
		stage('Deploy'){
			steps{
				
				echo 'stage 2 Deploy'
				bat 'mvn install'
				withCredentials([[$class				:'UsernamePasswordMultiBinding',
								   credentialsId		:'PCF_LOGIN',
								   usernameVariable		:'USERNAME',
								   passwordVariable		:'PASSWORD']]){
								   
								   echo 'username is $USERNAME'
									  bat 'cf login -a http://api.run.pivotal.io -u g.n.s.harsha@gmail.com -p Pivotal123$'
									  bat 'cf push'
								
								   }
	}
	
	}
	
	
}
}