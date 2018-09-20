mvn dependency:resolve(it's better in the filesystem)
mvn clean package
mvn test
docker build -f Dockerfile -t demo/maven:3.3-jdk-8 .
docker run -it --rm -v %cd%:/app -w /app demo/maven:3.3-jdk-8 java -cp target/HelloWorldMavenDockerized-0.0.1-SNAPSHOT.jar com.privalia.principal.Main
docker rmi image demo/maven:3,3-jdk-8
docker rm $(docker ps -a -f status-exited -q)