CREATE TABLE tickets (
    uuid VARCHAR2(50),
    numeroTicket INT,
    tituloTicket VARCHAR2(255),
    descripcion VARCHAR2(4000),
    autorTicket VARCHAR2(100),
    email VARCHAR2(100),
    creacionTicket VARCHAR2(50),
    estadoTicket VARCHAR2(50),
    solucionTicket VARCHAR2(100)
);



select * from tickets