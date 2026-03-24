# RuneTek Compilable

Automated deobfuscation + decompilation pipeline that transforms ZKM-obfuscated RuneScape clients into **100% recompilable Java source code**.

## Quick Start

### 1. Get the client JAR
Download from [OpenRS2 Archive](https://archive.openrs2.org/clients/30983.dat) and save to `input/508sd.dat`.

### 2. Run the deobfuscator
```bash
java -Xmx1g -jar runetekcompilable-1.0.0.jar input/508sd.dat output/508
```

### 3. Compile & run
**Windows:** Double-click `#compile.bat` then `#run.bat`

**Linux/Mac:**
```bash
cd output/508
mkdir -p bin
javac -source 1.8 -target 1.8 -encoding UTF-8 -d bin $(find src -name "*.java")
java -cp bin client
```

## What it does

1. **ASM Bytecode Transforms** — Renames obfuscated single-letter classes, removes ZKM opaque predicates, fixes method/field collisions
2. **Vineflower Decompilation** — Converts cleaned bytecode to .java source files
3. **Post-Processing** — Automatically fixes all compile errors:
   - `<unknown>` type declarations
   - Flexible constructor ordering (Java 8 compatibility)
   - Multi-byte character literal encoding (Windows Cp1252 safety)
   - Ambiguous null references
   - Synthetic `class$` field patterns
   - Object→Container/Component casts
   - Missing return statements in un-decompilable methods
   - JSObject.getWindow stubs (removed in modern Java)
4. **Script Generation** — Creates `#compile.bat` and `#run.bat` for easy use

## Output
```
output/508/
  src/             ← 267 .java source files
  #compile.bat     ← Windows: compile all sources
  #run.bat         ← Windows: launch the client
```

## Building from source
```bash
mvn clean package
```
Produces `target/runetekcompilable-1.0.0.jar` (fat JAR, requires Java 21 to run).

## Notes
- ~15 methods are too heavily obfuscated for Vineflower to decompile — these are left as bytecode comments with stub returns
- The deobfuscator requires Java 21+ to run, but outputs Java 8-compatible source
- Use `-Xmx1g` or higher if Vineflower runs out of memory on complex methods
