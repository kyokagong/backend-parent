#!/bin/bash
pidBaseDir="/tmp/backend-parent"

moduleName=$1

for pidFile in ${pidBaseDir}/${moduleName}-*.pid
do
  if [ -f $pidFile ]; then
    cat ${pidFile} | xargs kill -s 9
    rm -f ${pidFile}
  fi
done

