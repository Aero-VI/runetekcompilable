@echo off
echo Compiling RuneScape 508 client...
if not exist bin mkdir bin
javac -source 1.8 -target 1.8 -encoding UTF-8 -d bin src\*.java
if %ERRORLEVEL% EQU 0 (
    echo Compilation successful!
) else (
    echo Compilation failed. Check for errors above.
)
pause
