# 环境
FROM  williamyeh/java8:latest
# 作者信息
MAINTAINER carl "838644308@qq.com"
# 将本地文件tmp挂载到容器
VOLUME /tmp
# 拷贝jar
mkdir appsystems
ADD *.jar appsystems/apps/
ADD *.yml appsystems/config/

# 设置暴露的端口号
#EXPOSE 8082
# 执行命令
ENTRYPOINT ["java","-jar","appsystems/config/netease-1.0-SNAPSHOT.jar"]