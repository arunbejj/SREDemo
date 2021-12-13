# SRE Demo Project 
In this demo Prometheus monitoring instrumented and displayed metrics in Grafana for applciation running in Azure Kubernetes Cluster (AKS). Application is developed in spring boot java. Two applciation APIs are helloworld, actuator micrometer for metric exporter. Seperate containers for Prometheus and Grafana are depployed to AKS.

#### URLs:
- Hello World API --> http://40.70.169.62:8080/hello_world/
- Actuator -->  http://40.70.169.62:9999/actuator/prometheus
- Prometheus --> http://40.70.170.32:9090/
- Grafana --> http://40.65.211.126:3000/

#### Docker images:
docker.io/arunbejj/demo4barrcuda
- Hello World API --> docker.io/arunbejj/demo4barrcuda
- Actuator -->  docker.io/arunbejj/demo4barrcuda
- Prometheus --> docker.io/prom/prometheus 
- Grafana --> docker.io/grafana/grafana

----
