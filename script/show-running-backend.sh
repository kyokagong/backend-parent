#!/bin/bash

${JAVA_HOME}/bin/jps | grep "backend"
# 以数字开头,以.jar结尾的
#${JAVA_HOME}/bin/jps | grep '^[0-9].*\.jar$'
