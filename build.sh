IMAGE_TAG=${1:-1.0.0}

docker build -t demo-springboot-prometheus:$IMAGE_TAG .