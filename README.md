# Compilation

```bash
$ ./gradlew clean build
$ docker build . -t webservice
$ docker run -it -p 8080:8080 webservice
```

# Testing

To test, try:

```bash
$ curl localhost:8080/song?name=Michael+Jackson
```