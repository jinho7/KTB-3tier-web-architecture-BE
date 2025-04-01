#!/bin/bash

echo "🛑 [Stop] 기존 Spring Boot 앱 종료 시도..."

PID=$(pgrep -f 'java -jar')

if [ -n "$PID" ]; then
  echo "🛑 기존 프로세스 종료: PID=$PID"
  kill -9 $PID
else
  echo "✅ 종료할 프로세스 없음"
fi