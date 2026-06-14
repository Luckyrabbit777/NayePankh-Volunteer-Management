#!/bin/bash
echo "Compiling NayePankh Volunteer Management System..."
cd src
javac *.java

if [ $? -ne 0 ]; then
    echo "Compilation failed!"
    exit 1
fi

echo "Starting application..."
java VolunteerManagementUI
