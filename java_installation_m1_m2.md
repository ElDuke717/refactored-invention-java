The process of installing Java on an M1 or M2 Mac involves several steps, primarily based on which JDK provider you choose. Here are the steps to install OpenJDK using Homebrew, a package manager for macOS, and Azul's Zulu JDK, a popular JDK provider that supports the M1/M2 architecture [Source 0][Source 1][Source 2][Source 8][Source 9][Source 12].

## Installing OpenJDK using Homebrew

1. **Install Homebrew** if you haven't already. Open Terminal and enter the following command:

```bash
/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
```

2. **Install OpenJDK** using Homebrew:

```bash
brew install openjdk
```

3. **Verify the installation**:

```bash
$(brew --prefix openjdk)/bin/java --version
```

4. **Check the architecture** of the installed Java:

```bash
file $(brew --prefix openjdk)/bin/java
```

This should return something like: `/opt/homebrew/opt/openjdk/bin/java: Mach-O 64-bit executable arm64`, confirming that it is for the arm64 hardware.

5. **Set the JAVA_HOME environment variable**. You can do this using the command:

```bash
export JAVA_HOME="$(brew --prefix openjdk)/libexec/openjdk.jdk/Contents/Home"
```

## Installing Azul's Zulu JDK

1. **Download the Zulu JDK** from the [Azul website](https://www.azul.com/downloads/?package=jdk). Make sure to select 'macOS' from the 'Operating System' dropdown, and 'ARM 64-bit' from 'Architecture'.

2. **Install the downloaded DMG file**. Open the file and follow the instructions to install it.

3. **Set the JAVA_HOME environment variable**. Open Terminal and add the following line to your shell profile file (like `.bash_profile` or `.zshrc`):

```bash
export JAVA_HOME=/Library/Java/JavaVirtualMachines/zulu-<version>.jdk/Contents/Home/jre
```

Replace `<version>` with the version of Zulu JDK you installed.

4. **Verify the installation**:

```bash
java --version
```

This should display the version of the Zulu JDK you installed.

Remember, if you need to use a specific version of Java, you can do so by specifying the version while installing OpenJDK. For example, to install OpenJDK 11, you can use the command `brew install openjdk@11`. Similarly, you can download the specific version of Zulu JDK from the Azul website [Source 0][Source 1][Source 9].

macos - Java/JDK for the Apple Silicon chips - Stack Overflow

Go to Products → Software → Java; Click on "Download Java Now" Click on "JDK Download" Select "macOS Installer" Install JDK; Try with any sample..
favicon-phoenixnap.comphoenixnap.com > kb > install-java-macos
How to Install Java on Mac | phoenixNAP KB

1. Browse to Oracle's Java Downloads page. 2. Select the macOS tab and download the DMG installer for your processor architecture. If you have an..
favicon-wiredverse.comwiredverse.com > posts > 2021 > 05 > java-m1-mac
Running Java JDK natively on Apple M1 Macs (Apple Silicon)

This means you accidentally install the x86 version. Stop now and restart your terminal so the config gets picked up. Next remove the cache of..
favicon-pangea.aipangea.ai > blog > tech-stack > setting-up-java-development-for-mac-m1
Setting up Java Development for Mac M1 - Pangea

Java Development for Mac M1. ... Installing Java for Mac Install Java Development Tools. The first thing Java needs to begin developing for Mac is..
favicon-stackoverflow.comstackoverflow.com > questions > 73633050 > installing-jvm-8-on-mac-with-m1-chip
java - Installing JVM 8 on Mac with M1 chip - Stack Overflow

Next you will need to set your JAVA_HOME environment variable. Open the Terminal.app and run this command: % open .profile ; open .cshrc ; open..
favicon-backbencher.devbackbencher.dev > install-java-jdk-macbook-m1-chip
Install Java JDK in Macbook with M1 Chip - backbencher.dev

In order to compile and run Java programs we need Java Development Kit(JDK). Mine is a Macbook with M1 chip. Here is how I installed.. 