FROM node:14-alpine3.16
WORKDIR /app
COPY . .
RUN npm install
CMD ["npm", "start"]

#https://medium.com/@anshita.bhasin/a-step-by-step-guide-to-create-dockerfile-9e3744d38d11