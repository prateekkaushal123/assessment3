FROM openjdk 

COPY target/springboot-0.0.1-SNAPSHOT.jar /deployments/

CMD java -cp /deployments/springboot-0.0.1-SNAPSHOT.jar com.asde.springboot.HospitalBedsApp 

