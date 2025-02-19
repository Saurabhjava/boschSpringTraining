create table exchange_bean (cid integer not null, exchange_value float(53) not null, currency_from varchar(255), port integer not null, currency_to varchar(255), primary key (cid));
insert into exchange_bean (cid,currency_from,currency_to,exchange_value,port) values(1,'USD','INR',83,0);
insert into exchange_bean (cid,currency_from,currency_to,exchange_value,port) values(2,'AUD','INR',63,0);
insert into exchange_bean (cid,currency_from,currency_to,exchange_value,port) values(3,'EUR','INR',93,0);
insert into exchange_bean (cid,currency_from,currency_to,exchange_value,port) values(4,'PON','INR',98,0);
insert into exchange_bean (cid,currency_from,currency_to,exchange_value,port) values(5,'DIN','INR',73,0);