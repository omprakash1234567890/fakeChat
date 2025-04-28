# Docker Project

This project is a Spring Boot application packaged as a Docker container. Below are the details regarding the project structure and how to set it up.

## Project Structure

```
docker-project
├── src
│   └── app                # Contains the application source code
├── Dockerfile             # Instructions to build the Docker image
├── .dockerignore          # Files and directories to ignore during Docker build
└── README.md              # Project documentation
```

## Setup Instructions

1. **Clone the repository**:
   ```bash
   git clone <repository-url>
   cd docker-project
   ```

2. **Build the Docker image**:
   Ensure you have Docker installed and running. Then, run the following command in the project root:
   ```bash
   docker build -t fakeinsta .
   ```

3. **Run the Docker container**:
   After building the image, you can run the container using:
   ```bash
   docker run -p 8080:8080 fakeinsta
   ```

## Usage

Once the container is running, you can access the Spring Boot application at `http://localhost:8080`.

## Additional Information

- Ensure that your JAR file is located in the `target` directory before building the Docker image.
- Modify the `.dockerignore` file to exclude any unnecessary files from the Docker build context.