Changes here for testing 1.0.1 release
# SRE Demo Project 
In this demo Prometheus monitoring instrumented and displayed metrics in Grafana for applciation running in Azure Kubernetes Cluster (AKS). Application is developed in spring boot java. Two applciation APIs are helloworld, actuator micrometer for metric exporter. Seperate containers for Prometheus and Grafana are depployed to AKS.

#### Environment & Tools:
- Azure Kubernete Services (AKS)
- Azure Container Registry (ACR)
- Helm charts
- Docker engine, Docker hub
- Prometheus
- Grafana

#### URLs:
- Hello World API --> http://40.70.169.62:8080/hello_world/
- Actuator -->  http://40.70.169.62:9999/actuator/prometheus
- Prometheus --> http://40.70.170.32:9090/
- Grafana --> http://40.65.211.126:3000/

#### Docker images:
- Hello World API --> docker.io/arunbejj/demo4barrcuda
- Actuator -->  docker.io/arunbejj/demo4barrcuda
- Prometheus --> docker.io/prom/prometheus 
- Grafana --> docker.io/grafana/grafana

#### Deploy Containers & Services:
- From `cmd` login & add AKS cluster credentials
- Create AKS cluster and ACR 
- Helm charts are in `demo/helmcharts` directory
- Install helm chart using kubectl command 
>kubectl create -f ./helmcharts 
- Verity all services in AKS cluster
>kubectl get all -n default
- verify URLs are working & Moniotring metrics in prometheus and Grafana 
- screenshots from my demo `demo/SRE Demo Screenshots`


