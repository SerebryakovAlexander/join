

CREATE TABLE MASTER (
    id  integer not null identity(1, 1),
    field1 varchar(20),
    field2 varchar(20),
    field3 varchar(20),
    document_id integer
);

CREATE TABLE CHILD1 (
    id integer not null identity(1, 1),
    field1 varchar(20),
    field2 varchar(20),
    field3 varchar(20)
);
