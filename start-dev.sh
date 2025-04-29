#!/bin/bash

CLASSPATH="/opt/homebrew/Cellar/tomcat/11.0.6/libexec/lib/servlet-api.jar"

javac -cp "$CLASSPATH" WEB-INF/classes/"$1".java

catalina run