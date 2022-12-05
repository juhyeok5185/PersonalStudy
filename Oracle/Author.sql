CREATE SEQUENCE SEQ_authorExam;
CREATE SEQUENCE SEQ_aythor;

CREATE TABLE authorExam(
id NUMBER NOT NULL,
title VARCHAR2(50) NOT NULL,
descripttion VARCHAR2(4000),
created DATE NOT NULL,
author NUMBER NOT NULL,
CONSTRAINT PK_authorExam PRIMARY KEY(id)
);

CREATE TABLE author(
id NUMBER NOT NULL,
name VARCHAR2(50) NOT NULL,
profile VARCHAR2(100) NOT NULL,
CONSTRAINT PK_author PRIMARY KEY(id)
)

INSERT INTO authorExam
           (id,title,descripttion,created,author)
           VALUES
           (SEQ_authorExam.NEXTVAL,'Oracle','MongoDB is...', SYSDATE, 1);
          

INSERT INTO authorExam
           (id,title,descripttion,created,author)
           VALUES
           (SEQ_authorExam.NEXTVAL,'MYSQL','MongoDB is...', SYSDATE, 2);          
          

INSERT INTO authorExam
           (id,title,descripttion,created,author)
           VALUES
           (SEQ_authorExam.NEXTVAL,'SQL SERVER','MongoDB is...', SYSDATE, 1);

   
          
INSERT INTO authorExam
           (id,title,descripttion,created,author)
           VALUES
           (SEQ_authorExam.NEXTVAL,'MongoDB','MongoDB is...', SYSDATE, 2);
          
INSERT INTO author
           (id,name,profile)
           VALUES
           (SEQ_aythor.NEXTVAL,'Danny','PartLeader');
                

INSERT INTO author
           (id,name,profile)
           VALUES
           (SEQ_aythor.NEXTVAL,'ging','Wife');
         
          
SELECT * FROM authorExam LEFT JOIN author ON authorExam.author = author.id;