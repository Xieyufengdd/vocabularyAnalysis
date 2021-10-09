FROM openjdk:14
COPY ./ /app/
WORKDIR /app/
RUN javac src/Lexer.java -d ./
