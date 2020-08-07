# Set of useful commands

## Docker 

### Building docker image

```
docker build -t luchob/student-service:v1 -f deployment/Dockerfile .
```

### Push the docker image 

```
docker push luchob/student-service:v1
```

## Kubectl 

### Get current context

```
kubectl config current-context
```

### Create a namespace

```
kubectl create ns <namespace-name>
```

Use the softuni namespace as default

kubectl config set-context --current --namespace=softuni

## GCloud

### Get the current project

```
gcloud config get-value project
```

### List all projects

```
gcloud projects list
```

### Set current project

```
gcloud config set project <your_project_name>
```

### Authenticate for a project

```
gcloud container clusters get-credentials <cluster_name> --zone europe-west1-c --project <project_name>
```

