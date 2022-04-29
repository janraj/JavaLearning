Create sqite3 Table locally on Mac
  1.  sqlite3 course.db
  2.  CREATE TABLE course(id BIGINT NOT NULL, course VARCHAR, author VARCHAR, PRIMARY KEY (id));
  3.  INSERT INTO course(id, course, author) VALUES (1, 'abc', 'janraj');
  4.  DROP TABLE course;
  5.  .databases
  6.  .tables
  7.  .schema course
CREATE TABLE course(id BIGINT NOT NULL, courseName VARCHAR, authorName VARCHAR, PRIMARY KEY (id));
