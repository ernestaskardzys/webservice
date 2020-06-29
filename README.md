# Compilation

```bash
$ ./gradlew clean build
```

# Running

Via command line:

```bash
$ java -jar build/libs/webservice-all.jar
```

Via Docker:

```bash
$ docker build . -t webservice
$ docker run -it -p 8080:8080 webservice
```

# Testing

To test, try:

```bash
$ curl localhost:8080/song?name=Michael+Jackson
```