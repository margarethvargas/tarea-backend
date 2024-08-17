FROM openjdk:22-jdk

WORKDIR /app

COPY build/libs/zegel.claim-book-0.0.1-SNAPSHOT.jar /zegel.claim-book.jar

CMD [ "java", "-jar", "zegel.claim-book.jar" ]