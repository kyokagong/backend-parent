#!/bin/bash
projectBaseDir="/usr/local/src/backend-parent"
stdoutBaseDir="/var/log/backend-parent"
pidBaseDir="/tmp/backend-parent"


dateStr=`date +%Y-%m-%d_%H-%M-%S-%N`
defaultVersion="1.0.0"

moduleName=$1
extArgs=$2

targetDir="${projectBaseDir}/${moduleName}/target"
moduleJar=${targetDir}/${moduleName}-${defaultVersion}.jar

moduleStdout=${stdoutBaseDir}/${moduleName}-${dateStr}.out
modulePid=${pidBaseDir}/${moduleName}-${dateStr}.pid

nohup java -jar $moduleJar $extArgs > ${moduleStdout} 2>&1 &

echo $! > ${modulePid}

echo "stdout file : ${moduleStdout}"


