# Option-1 : Createting docker image using command module 
---
- hosts: all
  become: true
  tasks:
  - name: building docker image
    command: docker build -t flask .
    