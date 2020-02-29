ARG MAVEN_VERSION=3.6.3-jdk-8-slim
FROM maven:${MAVEN_VERSION} AS build-stage
ENV PORT=9000
ENV WORK_DIR=/app
# 设置工作目录根目录
WORKDIR ${WORK_DIR}
# 复制代码 到工作目录
COPY . .
# 运行命令，设置 npm 注册仓库为 taobao 仓库
RUN mvn package

FROM openjdk:8u242-jre-slim
# 暴露 Spring Boot 应用 9000 端口
EXPOSE ${PORT}
# 运行命令
COPY --from=build-stage /app/target/Star-1.0.0-SNAPSHOT.jar ./app.jar
CMD java -jar app.jar

LABEL name="Star-Server" \
      version="0.0.1" \
      author="warmfrog" \
      maintainer="crawlstar@126.com" \
      git="https://github.com/warmfrog/Star-Server.git" \
      description="基于 Sprint boot 的 Star 收藏系统应用后端" \
      tags="Spring Boot, Postgresql" \
      updateDate="2020-02-28"
