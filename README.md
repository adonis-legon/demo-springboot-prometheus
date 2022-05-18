# Demo project for Spring Boot with Prometheus (Micrometer)

## Build Simulator Service

```console
$ . build.sh <version, default: 1.0.0>
```

## Run Simulator Service (standalone)

```console
$ . start.sh <version, default: 1.0.0> <port, default: 9999>
```

## Stop Simulator Service (standalone)

```console
$ . stop.sh <version, default: 1.0.0>
```

## Test Simulator Service

The simulator allows for the execution of different types of JVM resource consumption, and the types are passed as a URL path argument, and the specific type parameters are passed as a simple JSON object in the request body. 

The types are:

1- heap

Example:

```console
$ curl --request POST 'localhost:9999/simulator/heap' --header 'Content-Type: application/json' --data-raw '{"iterations": 1000}'
```

## Start All Stack (Simulator Service, Prometheus and Grafana)

```console
$ . start-all.sh <version, default: 1.0.0> <port, default: 9999> <java_opts, default: --Xms256M -Xmx1G>
```

## Stop All Stack (Simulator Service, Prometheus and Grafana)

```console
$ . stop-all.sh <version, default: 1.0.0>
```

## Start All Stack (Simulator Service, Prometheus and Grafana)

```console
$ . restart-all.sh
```