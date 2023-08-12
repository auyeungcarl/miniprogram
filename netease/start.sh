#!/bin/bash

docker build -t netease:1.0 .
docker run -d -p 8001:8082 netease:1.0

echo "============================================================================"
docker images | grep REPOSITORY
docker images | grep netease|grep 1.0

echo "============================================================================"
docker container list  | grep CONTAINER
docker container list |grep netease |grep 1.0

echo "查看日志、登录容器的指令如下："
echo "docker logs -tf $(docker container list |grep netease |grep 1.0 | awk '{print $1}') "
echo "docker exec -it  $(docker container list |grep netease |grep 1.0 | awk '{print $1}') /bin/sh"

echo "start finish"