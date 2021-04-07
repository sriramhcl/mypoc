#FROM maven:3.6.1-jdk-8-alpine AS MAVEN_BUILD
 
# copy the pom and src code to the container
#COPY ./ ./
 
# package our application code
#RUN mvn clean package

From openjdk:8
copy ./target/employee-producer-0.0.1-SNAPSHOT.jar employee-producer-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","employee-producer-0.0.1-SNAPSHOT.jar"]