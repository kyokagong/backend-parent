#!/bin/bash
pidBaseDir="/tmp/backend-parent"

for pidFile in ${pidBaseDir}/backend-*.pid
do
  if [ -f $pidFile ]; then
    cat ${pidFile} | xargs kill -s 9
    rm -f ${pidFile}	
  fi
done

#echo "kill all"

