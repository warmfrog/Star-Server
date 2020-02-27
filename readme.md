# 基于 Spring Boot 的 Restful Star 收藏系统 Web 应用后端

对实体的增删改查的 Spring Restful Web 应用后端。

## 工具框架

1. 使用 Maven 作为依赖和构建工具;
2. Git 作为版本控制工具
3. Postgresql 数据库
4. Mybatis ORM 库
5. Navicat 数据库可视化管理工具
6. IntelliJ IDEA 集成开发环境

## 环境搭建

1. 需要自行安装 Orangcle JDK1.8 
2. 自行安装 Maven，依赖 Java 环境
3. 安装 Git 版本控制工具
4. 安装一个 Postgresql 数据库
5. 安装 Navicat 数据库可视化工具
6. 安装 IntelliJ IDEA Java 开发 IDE
7. 安装 Ubuntu 虚拟机(可选)

### 1.1 安装 ubuntu server 18.04 LTS 虚拟机

略

### 1.2 在 ubuntu 虚拟机中安装 Postgresql 数据库

安装 postgresql 数据库
```bash
sudo apt install postgresql
```

修改 Posgresql 配置允许外部连接, 
1. 切换为 root 用户，`sudo su root`,
2. 修改/etc/postgresql/10/man/pg_hba.conf, 添加一行 `host    all all 0.0.0.0/0 md5`；
3. 修改 /etc/postgresql/10/man/posggresql.conf, 添加一行 listen_addresses='*'
4. 重启 postgresq， systemctl restart postgrsql

创建数据库和用户
```bash
su postgres
psql
create user star password 'star';
create database star owner star;
```

## 项目准备

1. Git 克隆项目到本地
2. 使用 nvicat 测试连接，执行 /src/main/resources/sql 目录下的 sql 语句。
3. 打开 IntelliJ IDEA，导入 Maven 项目(pom.xml)，等依赖下载完成。
4. 找到 src/main/java/com/warmfrog/star/Application.java, 点击运行



