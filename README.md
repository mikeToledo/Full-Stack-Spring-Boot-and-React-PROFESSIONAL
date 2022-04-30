# Full Stack Spring Boot & React (PROFESSIONAL)

## Couple Things Before We Begin

- https://www.diagrams.net/
- https://github.com/amigoscode/spring-boot-fullstack-professional/
- http://springbootreactfullstack-env.eba-3imjbkem.eu-west-1.elasticbeanstalk.com/

## Getting Started

- https://start.spring.io/#!type=maven-project&language=java&platformVersion=2.4.3.RELEASE&packaging=jar&jvmVersion=15&groupId=com.example&artifactId=demo&name=demo&description=Demo%20project%20for%20Spring%20Boot&packageName=com.example.demo&dependencies=lombok,web
- https://www.jetbrains.com/toolbox-app/

## React & Functional Components

- https://reactjs.org/
- https://nodejs.org/en/
- https://reactjs.org/
- https://www.npmjs.com/package/create-react-app
- https://github.com/facebook/create-react-app
- https://ant.design/
- https://react-bootstrap.github.io/
- https://ant.design/docs/react/use-with-create-react-app
- https://github.com/developit/unfetch
- You can also use https://github.com/axios/axios (axios) which is a very popular HTTP client
- https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS
- https://ant.design/components/layout/
- Add files/folders to run frontend:
  - node_modules folder

## Packaging Backend + Frontend with Maven

- https://github.com/eirslett/frontend-maven-plugin

## Docker and Jib

- https://www.docker.com/get-started
- https://hub.docker.com/signup
  - pilon.aguilar@gmail.com (palmillas)
  - 
- https://github.com/GoogleContainerTools/jib
- Commands used: docker login docker pull docker rm -f id ./mvnw clean install jib:build -Djib.to.image=amigoscode/spring-react-fullstack:latest ./mvnw clean install jib:build -Djib.to.image=amigoscode/spring-react-fullstack:latest -D jib.to.auth.username=amigoscode -Djib.to.auth.password=yourpassword docker pull amigoscode/spring-react-fullstack:latest docker run -p 8080:8080 amigoscode/spring-react-fullstack

## AWS & Elastic Beanstalk

- https://docs.docker.com/compose/
- https://docs.docker.com/compose/compose-file/compose-file-v3/
- my DockerHub https://hub.docker.com/r/amigoscode/springboot-react-fullstack/
- Terminate EB Environment https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/using-features.terminating.html
- Restore Terminated EB Environment https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/environment-management-rebuild.html

## Databases and Spring Data JPA

- https://hub.docker.com/_/postgres
- https://www.mockaroo.com/
- Create DB network on docker:
  - docker network create db
- Create docker container for postgres and volume:
  - create a folder (db-data) to mount /var/lib/postgresql/data
  - cd into that folder
  - docker run --name db -p 5432:5432 --network=db -v "%cd%:/var/lib/postgresql/data" -e POSTGRES_PASSWORD=password -d postgres:alpine
- Delete docker container:
  - docker rm -f db
- Connecting to db using PSQL Container:
  - docker run -it --rm --network=db postgres:alpine psql -h db -U postgres
  - docker run -it --rm postgres:alpine psql -h aaktm1pnjlyq1w.cdr9sq1nbkmo.us-east-2.rds.amazonaws.com -U amigoscode -d postgres

## AWS RDS and Spring Profiles
- Env Var: SPRING_PROFILES_ACTIVE=dev

## Deploy New Version To AWS
- mvn clean install -P build-frontend -P jib-push-to-dockerhub -Dapp.image.tag=3

## CI/CD with Github Actions
- https://github.com/features/actions
- 