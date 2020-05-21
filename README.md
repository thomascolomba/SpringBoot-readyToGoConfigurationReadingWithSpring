Example on how to read configuration from json/properties/yaml configuration file with Spring Boot.<br/>
Included : how to read a variety of different objects<br/>
This example is not meant to be perfect but to be completed by me whenever possible<br/>
<br/>
How to compile and execute :<br/>
mvn package<br/>
java -jar ./target/readyToGoConfigurationReadingWithSpring-0.0.1-SNAPSHOT.jar
<br/>
<br/>
<br/>
---configuration files :<br/>
myConfiguration.json<br/>
application.properties<br/>
application2.properties<br/>
application.yaml<br/>
application2.yaml<br/>
application3.yaml<br/>
---MyJsonPropertySourceFactory.java<br/>
To load json configuration file.<br/>
---MyConfigurationBean.java<br/>
To receive all configuration properties<br/>
---MyObjectConverterUtil.java<br/>
To convert any Object composed of primitive types (and String)<br/>
---MyDateConverter.java<br/>
To read any date assuming SimpleDateFormat from configuration.<br/>
---MyConfigurationDisplayer.java<br/>
To display the configuration actually read.<br/>
<br/>
<br/>
The application is meant to read the the content of all configuration files then display them in the terminal.<br/>


