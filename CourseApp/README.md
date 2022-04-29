How to Run this ?
  1. install sqlite 3 
  2. Run the project from root directory
		mvn spring-boot:run

Accessing the API:
  1. http://localhost:8080/courses
 
 
Dependancy Manager: Maven
REST Service by : SpringBot


Create sqite3 Table locally on Mac
  1.  sqlite3 course.db
  2.  CREATE TABLE course(id BIGINT NOT NULL, course VARCHAR, author VARCHAR, PRIMARY KEY (id));
  3.  INSERT INTO course(id, course, author) VALUES (1, 'abc', 'janraj');
  4.  DROP TABLE course;
  5.  .databases
  6.  .tables
  7.  .schema course
CREATE TABLE course(id BIGINT NOT NULL, courseName VARCHAR, authorName VARCHAR, PRIMARY KEY (id));


POST TEST BY CURL:
     curl -X POST localhost:8080/courses -H "Content-Type: application/json" -d '{"id": 6, "course": "This is test", "author": "ILU"}'

DELETE TEST BY CURL:
     curl -x DELETE localhost:8080/courses/6
