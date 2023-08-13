#!/bin/bash
mvn clean install

cd netease/
sh ./stop.sh
sh ./start.sh

cd ..