# UML-Editor - The UML/INTERLIS Editor 
UML Editor is an open source software application whose purpose is to help you create, develop, view and manipulate schemas. It is able to read and write INTERLIS syntax and GML schemas.

You can print or save the diagrams to UML file format, export image diagrams to JPEG, SVG or WMF file format, import INTERLIS model files (ILI file format), as well as add information from XML files.

* languages supported:
  - (DE) German
  - (ES) Spanish
  - (FR) French
  - (IT) Italian

Based on: [JHotDraw](https://sourceforge.net/p/jhotdraw/git/ci/master/tree/ "JHotDraw is a framework for structured drawing editors")

## License
The UML-Editor is licensed under the [LGPL](https://www.gnu.org/licenses/old-licenses/lgpl-2.1.txt "Lesser GNU Public License") (Lesser GNU Public License).

## Status
umleditor branch master is in stable state.

## System Requirements
For the current version of UML editor, you will need a JAVA software development kit (JDK) version 1.6 or a more recent version must be installed on your system.
A free version of the JAVA software development kit (JDK) is available 
[here](http://www.oracle.com/technetwork/java/javase/downloads/index.html "Download Java Development Kit") .
Also required is the build tool ant. [Download](http://ant.apache.org "Download Apache Ant") and install it as documented there.

## Installation
In order to install the UML Editor, [Download](http://umleditor.org/download/index.html "Download UML/Editor") choose a directory and extract the ZIP file.

## How to run it?
To start the UML Editor, enter the following command at the commandline prompt

~~~
java -jar umleditor.jar [options]
java -Duser.language=FR -jar umleditor.jar
~~~

## Development
Configure the IDE with iso-8859-1 as character encoding format to resolve possible errors when the project is opened if you use a unix system.

## How to compile it?
To compile the UML Editor, change to the newly created directory and enter the following command at the commandline prompt:

~~~
ant clean compile jar run
~~~

To build a binary distribution, use:
~~~
ant bindist
~~~
