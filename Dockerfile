FROM ubuntu
MAINTAINER JUSTIN HOLMES

RUN apt-get update
RUN apt-get install -y software-properties-common python-software-properties
RUN add-apt-repository ppa:webupd8team/java
RUN apt-get update
RUN yes | apt-get install -y oracle-java8-installer

# Start the permission service

ADD target/bootdemo-1.0-SNAPSHOT.war /tmp/demo.war
