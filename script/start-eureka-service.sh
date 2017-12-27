#!/bin/bash
. start-backend.sh backend-eureka-service --spring.profiles.active=peer1
. start-backend.sh backend-eureka-service --spring.profiles.active=peer2