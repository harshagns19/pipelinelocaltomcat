echo "================================From checkStatus.sh File ========================================================="
echo "sleep fpr 10 secs so the application will be up and runninf after the deployment"
sleep 10s
response=sh(script: "curl -s $url", returnStdout: true).trim()
echo "response is "+$response;
if (response == *"Welcome")
	echo "Deployment Successful and Application is up and Running!"
else
	echo "Deployment Failed!!!"
fi
responseCode=$(curl -o /dev/null -s -w "%{http_code}\n" http://localhost:8080/GLPProject-0.0.1-SNAPSHOT/)

echo "response code is "+$responseCode

if [[ $responseCode == "200" ]]; then
			echo "Deployment Successful!"
		else
			echo "Deployment Failed!"
		fi

