#!/bin/bash
moduleName=backend-config-service
. kill-backend.sh $moduleName
. start-backend.sh $moduleName
