# python:alpine is 3.{latest}
FROM flaski:flaski

LABEL maintainer="uibaidullaev@gmail.com"

RUN pip install flask

COPY src /src/

EXPOSE 5000

ENTRYPOINT ["python", "/src/app.py"]