CREATE TABLE booking (
id NUMBER NOT NULL,
title VARCHAR2(50) NOT NULL,
description VARCHAR2(4000),
created DATE NOT NULL
);

SELECT * FROM BOOKING;

INSERT INTO BOOKING
           (id,title,description,created)
           VALUES
           (1,'ORACLE','ORACLE is ...', SYSDATE);
           
SELECT * FROM BOOKING;

INSERT INTO BOOKING
           (id,title,description,created)
           VALUES
           (2,'MySQL','MYSQL is ...', SYSDATE);
           
INSERT INTO BOOKING
           (id,title,description,created)
           VALUES
           (3,'SQL Server','SQL Server is ...', SYSDATE);

SELECT * FROM BOOKING;         
SELECT id, title, created FROM BOOKING;
SELECT * FROM BOOKING WHERE id = 1;
SELECT * FROM BOOKING WHERE id > 1;
SELECT id, title, created  FROM BOOKING WHERE id > 1;
SELECT * FROM BOOKING ORDER BY id DESC;
SELECT * FROM BOOKING ORDER BY id ASC;

UPDATE BOOKING 
		SET
		title = 'MSSQL',
		description = 'MySSQL is ...'
		WHERE 
		id = 3;
	
	SELECT * FROM BOOKING;

DELETE FROM BOOKING WHERE id = 3;
SELECT * FROM  BOOKING;

DROP TABLE BOOKING;

CREATE TABLE booking2 (
id NUMBER NOT NULL,
title VARCHAR2(50) NOT NULL,
description VARCHAR2(4000),
created DATE NOT NULL,
CONSTRAINT PK_BOOKING2 PRIMARY KEY(id)
);
SELECT * FROM BOOKING2;

INSERT INTO BOOKING2
           (id,title,description,created)
           VALUES
           (1,'ORACLE','ORACLE is ...', SYSDATE);
          
INSERT INTO BOOKING2
           (id,title,description,created)
           VALUES
           (2,'MySQL','MYSQL is ...', SYSDATE);
SELECT * FROM BOOKING2;

INSERT INTO BOOKING2
           (id,title,description,created)
           VALUES
           (3,'SQL Server','SQL Server is ...', SYSDATE);
SELECT  * FROM BOOKING2;

CREATE SEQUENCE SEQ_BOOKING3;
DELETE FROM BOOKING2;
DELETE FROM BOOKING;


CREATE TABLE booking3 (
id NUMBER NOT NULL,
title VARCHAR2(50) NOT NULL,
description VARCHAR2(4000),
created DATE NOT NULL,
CONSTRAINT PK_BOOKING3 PRIMARY KEY(id)
);

INSERT INTO Booking3
           (id,title,description,created)
           VALUES
           (SEQ_BOOKING3.NEXTVAL,'MangoDB','MongoDB is...', SYSDATE);
          
INSERT INTO Booking3
           (id,title,description,created)
           VALUES
           (SEQ_BOOKING3.NEXTVAL,'ORACLE','MongoDB is...', SYSDATE);
          
INSERT INTO Booking3
           (id,title,description,created)
           VALUES
           (SEQ_BOOKING3.NEXTVAL,'MYSQL','MongoDB is...', SYSDATE);
          
INSERT INTO Booking3
           (id,title,description,created)
           VALUES
           (SEQ_BOOKING3.NEXTVAL,'SQL Server','MongoDB is...', SYSDATE);
          
          SELECT * FROM BOOKING3;
         SELECT SEQ_BOOKING3.CURRVAL FROM BOOKING3;
