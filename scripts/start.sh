#!/bin/bash

echo "🚀 [Start] Spring Boot 앱 실행 중..."

JAR_NAME=$(ls /home/ec2-user/app/*SNAPSHOT.jar | tail -n 1)

echo "✅ 실행할 JAR: $JAR_NAME"
nohup java -jar $JAR_NAME > /home/ec2-user/app/nohup.out 2>&1 &