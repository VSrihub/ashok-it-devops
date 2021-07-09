FROM java:8
RUN mkdir /opt/medilab-preclinic
WORKDIR  /opt/medilab-preclinic
COPY medilab-morning-preclinic.war /opt/medilab-preclinic/
CMD [ "java","-jar","medilab-morning-preclinic.war" ]