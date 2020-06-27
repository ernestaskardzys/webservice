# Compilation

```bash
$ ./gradlew clean build
$ docker build . -t webservice
$ docker run -it -p 8080:8080 webservice
```