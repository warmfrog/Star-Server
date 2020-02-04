# 个人博客后台

## 1. 环境搭建

### 1.1 安装 ubuntu server 18.04 LTS 虚拟机

### 1.2 Postgresql 数据库

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

使用 nvicat 测试连接。

