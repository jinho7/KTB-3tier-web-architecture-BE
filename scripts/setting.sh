#!/bin/bash

echo "🔧 [Setting] EC2 초기 설정 시작..."

# Java 설치 확인 및 설치
echo "☕ Java 설치 여부 확인..."
if type -p java; then
    echo "✅ Java 이미 설치됨: $(java -version 2>&1 | head -n 1)"
else
    echo "⏬ Java 설치 중..."
    sudo yum install -y java-17-amazon-corretto
fi

# 디렉토리 생성
APP_DIR="/home/ec2-user/app"
if [ ! -d "$APP_DIR" ]; then
    echo "📁 $APP_DIR 디렉토리 생성"
    mkdir -p $APP_DIR
    chmod 755 $APP_DIR
else
    echo "📁 $APP_DIR 이미 존재"
fi

echo "✅ [Setting] EC2 초기 설정 완료"