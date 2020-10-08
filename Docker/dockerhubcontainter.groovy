# Option-1 : Createting docker container using command module 
---
- hosts: all
  become: true

  tasks:
  - name: creating docker image using docker command
    command: docker run -d --name flask-container -p 5000:5000 flask