# POC for multiple type converters for same type

##### Build with 

```
./gradlew clean build
```

##### and then run with

```
java -jar build/libs/springboot-converter-poc-0.0.1-SNAPSHOT.jar
```

#### For v2 custom converter is used, so path variable is case insensitive

```
curl -v http://localhost:8080/example/v2/foo
curl -v http://localhost:8080/example/v2/FOO
```

#### For v1 default converter is used, so path variable is case sensitive

```
curl -v http://localhost:8080/example/v1/FOO
```

#### vs

```
curl -v http://localhost:8080/example/v1/foo
```
