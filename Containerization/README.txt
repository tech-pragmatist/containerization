# Build executable jar
java -jar simple-service-0.0.1-SNAPSHOT.jar

# Build image
docker build -t techpragmatist/simple-service:0.2 -f simple-service.Dockerfile .

# push to docker hub
docker push techpragmatist/simple-service:0.2

# pull from docker hub
docker pull techpragmatist/simple-service:0.2

# run
docker run -p 9001:9001 techpragmatist/simple-service:0.2

# test
http://localhost:9001/hello