@echo off
echo Compiling RuneTek 508 client...
dir /s /b src\*.java > sources.txt
javac -source 1.8 -target 1.8 -d bin @sources.txt
del sources.txt
if %ERRORLEVEL% EQU 0 (
    echo Compilation successful!
) else (
    echo Compilation failed with errors.
)
pause
