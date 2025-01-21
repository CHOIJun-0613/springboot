FROM gitpod/workspace-full:latest

USER gitpod

ARG CACHEBUST=1
     
RUN sudo apt-get update && sudo apt-get install -y docker-compose 
RUN sudo apt-get install -y mysql-client
RUN sudo ln -sf /usr/share/zoneinfo/Asia/Seoul /etc/localtime
RUN bash -c ". /home/gitpod/.sdkman/bin/sdkman-init.sh && \
    sdk install java 23-open && \
    sdk default java 23-open"
RUN bash -c ". /home/gitpod/.sdkman/bin/sdkman-init.sh && \
    sdk install gradle 8.12 && \
    sdk default gradle 8.12"