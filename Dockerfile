From openjdk:8
copy target/CourseCatalogueServerApp-0.0.1-SNAPSHOT.jar .
EXPOSE 8080
ENTRYPOINT ["java","-jar","CourseCatalogueServerApp-0.0.1-SNAPSHOT.jar"]