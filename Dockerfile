FROM eclipse-temurin:25-jre
VOLUME /tmp
ARG JAR_FILE
ADD ${JAR_FILE} smallshop-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/smallshop-0.0.1-SNAPSHOT.jar"]