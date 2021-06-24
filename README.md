# ASLGrammarTranslator
ASLGrammarTranslator is an English to American Sign Language grammar translator.

## Features
ASLGrammarTranslator manipulates English sentences to follow ASL grammar rules.

The main purpose of this project is to be used in my next iOS app.

This project is essentially a repackaged version of [Harsh Bhavsar's](https://github.com/harshbhavsar) algorith. More information on this can be found in the [credits](#credits).

## Requirements
- A Java JDK distribution >=8 must be installed and added to PATH.

## Compatibility
ASLGrammarTranslator is compatible with Windows, Mac, and Linux.

## Installation
```
# clone ASLGrammarTranslator
git clone https://github.com/thatcherclough/ASLGrammarTranslator.git

# change the working directory to ASLGrammarTranslator
cd ASLGrammarTranslator

# build ASLGrammarTranslator with Maven
# for Windows run
mvnw.cmd clean package

# for Linux or Mac run
sh mvnw clean package
```

Alternatively, you can download the jar from the [release page](https://github.com/ThatcherDev/ASLGrammarTranslator/releases).

## Credits
- [Harsh Bhavsar](https://github.com/harshbhavsar) for the algorithm used to convert an english sentence to a grammatically correct ASL sentence. That repository can be found [here](https://github.com/harshbits/english-asl-algorithm).

## Usage
```
java -jar aslgrammar.jar
ASLGrammarTranslator: An English to American Sign Language grammar translator (1.0.0)

Usage:
	java -jar aslgrammartranslator.jar [-h] [-v] [-i INPUT]

Arguments:
	-h, --help			Display this message.
	-v, --version			Display current version.
	-i, --input			Specify input sentence (Surround with quotes).

```

## License
[MIT](https://choosealicense.com/licenses/mit/)

Copyright 2021 © Thatcher Clough.
