@echo off
echo Compiling NayePankh Volunteer Management System...
cd src
javac *.java

if %ERRORLEVEL% NEQ 0 (
    echo Compilation failed!
    pause
    exit /b 1
)

echo Starting application...
java VolunteerManagementUI
