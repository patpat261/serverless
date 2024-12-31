FROM node:14-alpine

WORKDIR /usr/src/app

COPY package*.json ./

RUN npm install

COPY public ./public
COPY src ./src

EXPOSE 3000

CMD ["npm", "start"]

# Use the official Node.js 14 image as the base image
# Set the working directory
# Copy package.json and package-lock.json (if available)
# Install dependencies
# Copy the public and src directories to the working directory
# Expose the port on which the app will run
# Start the React application