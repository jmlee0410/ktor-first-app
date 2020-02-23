FROM openjdk:8-jre-alpine

ENV APPLICATION_USER ktor

# 계정 추가
RUN adduser -D -g '' $APPLICATION_USER

# Make directory
RUN mkdir /app
# /app directory 소유자 변경
RUN chown -R $APPLICATION_USER /app
# docker image 실행 user, docker container에서 ktor 계정으로 image 실행
USER $APPLICATION_USER

COPY ktor-first-app-0.0.1-SNAPSHOT.jar /app/ktor-first-app.jar
#COPY ./build/libs/ktor-first-app-0.0.1-SNAPSHOT.jar /app/ktor-first-app.jar
#COPY ktor-first-app-0.0.1-SNAPSHOT.jar /app/ktor-first-app.jar
#ADD ./build/libs/ktor-first-app-0.0.1-SNAPSHOT.jar /app/ktor-first-app.jar

# Working directory 지정
WORKDIR /app

CMD ["java", "-server", "-XX:+UnlockExperimentalVMOptions", "-XX:+UseCGroupMemoryLimitForHeap", "-XX:InitialRAMFraction=2", "-XX:MinRAMFraction=2", "-XX:MaxRAMFraction=2", "-XX:+UseG1GC", "-XX:MaxGCPauseMillis=100", "-XX:+UseStringDeduplication", "-jar", "my-application.jar"]