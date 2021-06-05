

FROM anapsix/alpine-java:8_jdk_unlimited
COPY ./build/libs/inventory-mgmt-service-0.0.1-SNAPSHOT.jar app.jar
ENV JAVA_OPTS=""
EXPOSE 8008
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ] 