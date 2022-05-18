IMAGE_TAG=${1:-1.0.0}
SERVER_PORT=${2:-9999}
SERVICE_NAME=demo-springboot-prometheus

docker rm $SERVICE_NAME --force

docker run -d --name $SERVICE_NAME -p $SERVER_PORT:9999 $SERVICE_NAME:$IMAGE_TAG