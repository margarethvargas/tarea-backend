FROM openjdk:22-jdk

WORKDIR /app

COPY app/build/libs/zegel.claim-book-0.0.1-SNAPSHOT.jar /app/zegel.claim-book.jar

CMD [ "java", "-jar", "zegel.claim-book.jar" ]