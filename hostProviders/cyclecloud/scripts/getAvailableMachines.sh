#!/bin/bash
#
#***********************************************************#
#                                                           #
# Name: getAvailableMachines.sh                             #
#                                                           #
# (c) Copyright International Business Machines Corp 2019.  #
# US Government Users Restricted Rights -                   #
# Use, duplication or disclosure                            #
# restricted by GSA ADP Schedule Contract with IBM Corp.    #
#                                                           #
#***********************************************************#
#
# Script Usage         : getAvailableMachines.sh -f input.json
# Environment Variables: PRO_DATA_DIR, PRO_CONF_DIR, JAVA_HOME
# Parameters           : -f input.json
# Return Value         : 0  - Succeed and print result
#                        >0 - Failed and print error message
#***********************************************************#

JAVA_JAR=CycleCloudTool.jar
INPUT_JSON=$2
SCRIPT_DIR=`dirname $0`
HOME_DIR="$(cd "$SCRIPT_DIR" && cd .. && pwd)"

JAVA_BIN=java
if [ -f "$JAVA_HOME/bin/java" ]; then
    JAVA_BIN=$JAVA_HOME/bin/java
fi

$JAVA_BIN $SCRIPT_OPTIONS -jar $HOME_DIR/lib/$JAVA_JAR -n $INPUT_JSON
