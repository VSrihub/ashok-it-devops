FROM node:latest
RUN mkdir /opt/items-app-service
WORKDIR /opt/items-app-service
COPY package.json /opt/items-app-service
RUN npm install
COPY . /opt/items-app-service
CMD [ "npm","start" ]