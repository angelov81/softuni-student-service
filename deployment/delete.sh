#!/bin/bash

# delete the backend service
#kubectl delete namespace softuni
kubectl delete secret softuni-mysql-credentials
