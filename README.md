# TP AntLR

Basic project for UV AI21 practical of [UTC](https://www.utc.fr/) work using [Maven](https://maven.apache.org/), [AntLR](https://www.antlr.org/) and [JavaFX](https://openjfx.io/) (with [Visual Studio Code](https://code.visualstudio.com/)).

Be careful: **1 clone 📦 = 1 star ✨**

## Download project

<details>
  <summary>With git</summary>

```sh
git clone https://github.com/Dashstrom/tp-antlr.git
cd tp-antlr
```

</details>

<details>
  <summary>Without git</summary>

[Download the ZIP](https://github.com/Dashstrom/tp-antlr/archive/refs/heads/main.zip)

</details>

## Tutorials

<details>
  <summary>Windows</summary>

### Windows : Install chocolatey and Java

Open an admin shell with `windows + R -> "powershell" -> ctrl + shift + enter` then enter:

```powershell
Set-ExecutionPolicy Bypass -Scope Process -Force; [System.Net.ServicePointManager]::SecurityProtocol = [System.Net.ServicePointManager]::SecurityProtocol -bor 3072; iex ((New-Object System.Net.WebClient).DownloadString('https://community.chocolatey.org/install.ps1'))
choco install openjdk
```

### Windows : Retrieve sources for java-docs

```sh
./mvnw.cmd dependency:sources
```

### Windows : Compile and run

```powershell
./mvnw.cmd clean compile exec:java
```

### Windows : Build standalone JAR

```powershell
./mvnw.cmd clean package
```

</details>

<details>
  <summary>Ubuntu</summary>

## Ubuntu : Make Maven Wrapper executable

```sh
chmod +x mvnw
```

### Ubuntu : Update and Install Java

```sh
sudo apt -y update && sudo apt -y install default-jdk
```

### Ubuntu : Retrieve sources for java-docs

```sh
./mvnw dependency:sources
```

### Ubuntu : Compile and run

```sh
./mvnw clean compile exec:java
```

### Ubuntu : Build standalone JAR

```sh
./mvnw clean package
```

</details>

<details>
  <summary>Mac</summary>

## Mac : Make Maven Wrapper executable

```sh
chmod +x mvnw
```

### Mac Install Homebrew and Java

```bash
/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
echo "export PATH=/opt/homebrew/bin:$PATH" >> ~/.bash_profile && source ~/.bash_profile
brew install java
```

### Mac : Retrieve sources for java-docs

```sh
./mvnw dependency:sources
```

### Mac : Compile and run

```sh
./mvnw clean compile exec:java
```

### Mac : Build standalone JAR

```sh
./mvnw clean package
```

</details>

## Run standalone JAR

```sh
java -jar target/ai21-antlr-1.0-jar-with-dependencies.jar
```

The following warning can occur, and you can ignore it [see stackoverflow issue](https://stackoverflow.com/questions/67854139/javafx-warning-unsupported-javafx-configuration-classes-were-loaded-from-unna).

```text
... com.sun.javafx.application.PlatformImpl startup
AVERTISSEMENT: Unsupported JavaFX configuration: classes were loaded from 'unnamed module @...'
```

![GUI](sujets/gui.png)

## Development

Regenerate [Maven wrapper](https://maven.apache.org/wrapper/maven-wrapper-plugin/) (only if you know what you are doing).

```sh
mvn -N io.takari:maven:wrapper
```
