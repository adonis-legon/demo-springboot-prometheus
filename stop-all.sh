IMAGE_TAG=${1:-1.0.0}
SERVICE_NAME=demo-springboot-prometheus

docker-compose --project-name $SERVICE_NAME-$IMAGE_TAG down