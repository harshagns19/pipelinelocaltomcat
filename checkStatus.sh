echo "=============================== From checkStatus.sh File ========================================================="
echo "================ Sleep for 10 secs so the application will be up and running after the deployment ================"
sleep 10s
echo "================================ Working Directory of Jenkins is ==============================="+$PWD
responseCode=$(curl -o /dev/null -s -w "%{http_code}\n" http://localhost:8080/GLPProject-0.0.1-SNAPSHOT/)

echo "response code is "+$responseCode

if [[ $responseCode == "200" ]]; then
			echo "Deployment Successful!"
		else
			echo "Deployment Failed!"
		fi

