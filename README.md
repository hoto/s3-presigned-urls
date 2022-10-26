# Testing presigning S3 links


Build and push the image:

    ./gradlew clean jibDockerBuild
    docker push docker.io/hoto/test-s3

Run:

    docker-compose config       #check if AWS secrets from .env file are populated
    docker-compose up
    curl localhost:8081/{bucketName}/{objectKey}