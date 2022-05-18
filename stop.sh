IMAGE_TAG=${1:-1.0.0}
SERVICE_NAME=demo-springboot-prometheus

docker rm $SERVICE_NAME --force