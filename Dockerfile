FROM openjdk 

COPY target/springboot-0.0.1-SNAPSHOT.jar /deployments/

CMD java -jar /deployments/springboot-0.0.1-SNAPSHOT.jar 
