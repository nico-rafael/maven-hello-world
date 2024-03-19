FROM alpine

ARG jarVersion
ENV jarVersion=$jarVersion

RUN apk update
RUN apk upgrade
RUN apk add bash openjdk17-jdk
ENV TARGETARCH="linux-musl-x64"

WORKDIR /helloworld/

COPY myapp/target/myapp*.jar ./

RUN adduser -D user
RUN chown -R user ./*
USER user

ENTRYPOINT ["java", "-jar", "myapp-$jarVersion" ]
