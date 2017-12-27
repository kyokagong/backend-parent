#!/bin/bash
projectBaseDir="/usr/local/src/backend-parent"

cd ${projectBaseDir}
git stash && git pull && git stash pop
mvn clean package
