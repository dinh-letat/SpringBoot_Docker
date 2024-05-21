# DEMO DOCKER WITH SPRING BOOT #

---

## Link test for project ##

- demo: (<http://localhost:8080/demo>)
  
- hello (<http://localhost:8080/hello>)
  
- hi (<http://localhost:8080/hi>)
  
- home (<http://localhost:8080>)

---

## Build project into Docker ##

- Right click project -> Run As -> Maven Build

- Create dockerfile

- Create docker image by dockerfile: docker build --tag="your project ."

- Create and run docker container by docker image: docker run -p docker_port:service_port docker_image