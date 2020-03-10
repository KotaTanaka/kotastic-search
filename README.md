# kotastic-search

*Base source from [kotlin-gradle-starter](https://github.com/jooby-project/kotlin-gradle-starter)*

## Technology

* [Kotlin](http://kotlinlang.org/)
* [Jooby](https://jooby.io/)
* [gradle](https://gradle.org/)
* [spek](http://spekframework.org/)

## Getting Started

* Install

```
$ git clone git@github.com:KotaTanaka/kotastic-search.git
$ cd kotastic-search
```

* Start Elasticsearch

```
$ ./start-es.sh
```

* Run

```
$ ./gradlew joobyRun
```

→ http://localhost:8080

* Stop Elasticsearch

```
$ ./stop-es.sh
```

* Test

```
$ ./gradlew test
```
