

Set up:

    Download and configure JDK1.8 in system(including environment variables)
    Download and configure Maven in system(including environment variables)

Steps to Execute:

Open command prompt, navigate to project folder where its copied, run command ‘mvn clean compile verify' Or 
Clone the repository in eclipse and right click on the pom.xml, run as mvn clean, install, test

Reports: Output reports can be found

    Emailable and Index report can be found in Target folder of the project
    Extent report implemented can be found in the root folder(extentrep.html)

implementation: Config file has the following

. Implicit wait time of 3 second

. Website url

. browsertype, Driver path and report path

Browser tested: chrome(make sure correct chrome version compatibility) OS: Windows 10 Explicit wait used wherever needed. 

The data is provided in the class CarDataProvider. If any of the values are not applicable, then to replace it with spaces(" ") 
in the object String.
Have kept the dates fixed, but can be handled as part of the data provider if required. Datecheck is not implemented.
