#!/bin/bash
javac -sourcepath src -d classes src/ro/academyplus/avaj/simulator/*.java src/ro/academyplus/avaj/simulator/*/*.java && echo "Compilation successful!"
java -cp classes ro.academyplus.avaj.simulator.Simulator docs/scenario