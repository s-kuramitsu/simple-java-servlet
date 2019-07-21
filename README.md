# simple-java-servlet
## compile
cd /path/to/context-root  
javac -classpath /path/to/servlet-api.jar -d ./WebContent/WEB-INF/classes ./src/com/example/java/*
## package
cd /path/to/context-root/WebContent  
jar cvfm simple-java-servlet.war ./META-INF/MANIFEST.MF .
