#### Запуск
```console
minikube start  
docker build --tag code .  
kubectl apply -f apply/  
curl $(minikube service web --url)
kubectl delete -f apply/  
```
#### Удаление
```console
kubectl delete -f apply/
minikube delete
```
