#!/bin/bash
file=/home/ouyc/java/netease/netease-1.0-SNAPSHOT.jar
groupId=com.miniprogram
artifactId=miniprogram
mvn install:install-file -Dfile=${file} -DgroupId=${groupId} -DartifactId=artifactId -Dversion=1.0-SNAPSHOT -Dpackaging=jar