@echo off
echo Compiling RuneScape 508 client...
if not exist bin mkdir bin
(
for /r src %%f in (*.java) do @echo "%%f"
) > sources.txt
javac -source 1.8 -target 1.8 -encoding UTF-8 -d bin @sources.txt
set RESULT=%ERRORLEVEL%
del sources.txt
if %RESULT% EQU 0 (
    echo Compilation successful!
) else (
    echo Compilation failed. Check for errors above.
)
pause
