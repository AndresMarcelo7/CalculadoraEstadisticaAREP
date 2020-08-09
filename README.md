# Statistic Calculator AREP 

A Solution for AREP Workshop "Introduction to complex systems, JAVA,MVN and GIT" using Linked Lists

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.
### Prerequisites

The things you need in order to run this proyect on your computer are:
- Maven
- Git  
- Java

Make sure you have this installed with the commands
```
mvn --version
```
```
git --version
```
and 
```
java -showversion
```

This project was developed with Java V1.8

### Installing
Please clone this repository on your computer with the command:

```
git clone https://github.com/AndresMarcelo7/CalculadoraEstadisticaAREP
```
Once finished, you must navigate into the project and execute the command 'mvn package' like this:
```
C:\Users\User > cd /CalculadoraEstadisticaAREP
```
```
C:\Users\User > mvn package
```
Here, mvn package Builds the project and packages the resulting JAR file into the target directory.

## Running the tests

if you want to run the tests again please run the following command:

```
C:\Users\User > mvn test
```
## Test Coverage

![Coverage](/img/testcov.jpg)

## Run

For running the project with some Data in the project please run the following command:


```
C:\Users\User\CalculadoraEstadisticaAREP > java -cp target/Calculadora-1.0-SNAPSHOT.jar edu.escuelaing.arep.CalculadoraEstadistica.App
```
The data is allowed in a file called Data.txt

If you want to put your own test cases on the calculator, follow this instructions:

- Go to the root package (CalculadoraEstadisticaAREP)
- Search the file "Data.txt"
- Put your values in that file, one line per case and each value separated by ","
- Save the file 
- Run the program again. 

## Documentation
If you want to see the Project Documentation Please click [here](https://andresmarcelo7.github.io/CalculadoraEstadisticaAREP/)

If you want to run with maven the project Documentation, follow this instructions:
- On the project directory run the following commands:
```
C:\Users\User\CalculadoraEstadisticaAREP > mvn javadoc:javadoc
```
```
C:\Users\User\CalculadoraEstadisticaAREP > mvn site
```
```
C:\Users\User\CalculadoraEstadisticaAREP > mvn site:run
```
This last commands will open the 8080 port in order to post the Javadoc file on your browser with the localhost URL http://localhost:8080  

Also you will find a [Documentation.pdf file](/Documentacion.pdf)  that describes the design and structures of the project 

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management
* CircleCI for Continous Integration  
[![CircleCI](https://circleci.com/gh/AndresMarcelo7/CalculadoraEstadisticaAREP.svg?style=svg)](https://circleci.com/gh/AndresMarcelo7/CalculadoraEstadisticaAREP)
* Git - Version Control  
 
## Versioning

 For the versions available, see the [tags on this repository](https://github.com/AndresMarcelo7/CalculadoraEstadisticaAREP/tags). 

## Authors

* **Andrés Felipe Marcelo** - [AndresMarcelo7](https://github.com/AndresMarcelo7)

## License

This project is licensed under the GNU v3.0 License - see the [LICENSE](LICENSE) file for details


