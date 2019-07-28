# simple-java-servlet
## compile
cd /path/to/context-root  
javac -classpath /path/to/servlet-api.jar -d ./WebContent/WEB-INF/classes ./src/com/example/java/*
## package
cd /path/to/context-root/WebContent  
jar cvfm simple-java-servlet.war ./META-INF/MANIFEST.MF .
## start server
java -classpath "$CATALINA_HOME/bin/bootstrap.jar:$CATALINA_HOME/bin/tomc-juli.jar" -Dcatalina.home=$CATALINA_HOME -Dcatalina.base=$CATALINA_BASE org.apache.catalina.startup.Bootstrap -config /path/to/server.xml start
