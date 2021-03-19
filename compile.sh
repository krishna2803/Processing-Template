#!/bin/bash
for file in bin/*.class; do rm $file; done;
javac -classpath "lib/*" -d "bin/" src/*.java
