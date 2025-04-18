FROM gitpod/workspace-full:latest

USER gitpod
     
RUN sudo apt-get update && sudo apt-get install -y docker-compose 
RUN sudo apt-get install -y mysql-client
RUN sudo ln -sf /usr/share/zoneinfo/Asia/Seoul /etc/localtime
RUN bash -c ". /home/gitpod/.sdkman/bin/sdkman-init.sh && \
    sdk install java 23-open && \
    sdk default java 23-open"
RUN bash -c ". /home/gitpod/.sdkman/bin/sdkman-init.sh && \
    sdk install gradle 8.12 && \
    sdk default gradle 8.12"
RUN sudo apt-get update && sudo apt-get install -y locales && \
    sudo locale-gen ko_KR.UTF-8 && \
    sudo update-locale LANG=ko_KR.UTF-8 

ENV LANG ko_KR.UTF-8
ENV LANGUAGE ko_KR:ko
ENV LC_ALL ko_KR.UTF-8