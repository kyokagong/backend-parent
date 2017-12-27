#!/bin/bash
projectBaseDir="/usr/local/src/backend-parent"
stdoutBaseDir="/var/log/backend-parent"
pidBaseDir="/tmp/backend-parent"

defaultVersion="1.0.0"
moduleName=$1
extArgs=$2


#mainClass=$2
#extJavaOpts=$3

moduleDir="${projectBaseDir}/${moduleName}/target"

dateStr=`date +%Y-%m-%d_%H.%M.%S`

moduleJar=${moduleDir}/${moduleName}-${defaultVersion}.jar
moduleStdout=${stdoutBaseDir}/${moduleName}-${dateStr}.out
modulePid=${pidBaseDir}/${moduleName}-${dateStr}.pid
#moduleLib=${moduleDir}/lib

#for f in ${moduleDir}/lib/*.jar; do
#    echo "$CLASSPATH"|grep "$f" > /dev/null 2>&1 || CLASSPATH=$CLASSPATH:$f;
#done
#
#CLASSPATH=$CLASSPATH:${moduleJar}
#
#nohup java -classpath "$CLASSPATH" ${mainClass} > ${moduleStdout} 2>&1 &

#nohup java -jar $moduleJar ${mainClass} > ${moduleStdout} 2>&1 &
nohup java -jar $moduleJar $extArgs > ${moduleStdout} 2>&1 &

echo $! > ${modulePid}

echo "stdout file : ${moduleStdout}"
