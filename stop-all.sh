TAG=${1:-1.0.0}
PORT=${2:-9999}
JAVA_OPTS=${3:--Xms256M -Xmx1G}
SERVICE_NAME=demo-springboot-prometheus

export IMAGE_TAG=$TAG
export SERVICE_PORT=$PORT
export JAVA_OPTS=$JAVA_OPTS

docker-compose --project-name $SERVICE_NAME-$IMAGE_TAG down