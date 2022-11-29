```console
minikube start  
docker build --tag code .  
kubectl apply -f apply/  
curl $(minikube service web --url)
```
