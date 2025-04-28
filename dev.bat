@echo off
REM Stop existing container
docker stop fake-insta-app 2>nul
docker rm fake-insta-app 2>nul

REM Build jar
call mvn clean package -DskipTests

REM Build and run container
docker build -t fake-insta-app .
docker run -d --name fake-insta-app -p 8080:8080 -v "%~dp0credentials.txt:/app/credentials.txt" fake-insta-app