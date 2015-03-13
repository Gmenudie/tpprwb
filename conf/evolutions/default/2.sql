#	---	Created	by	Ebean	DDL	
#	To	stop	Ebean	DDL	generation,	remove	this	comment	and	start	using	Evolutions	
#	---	!Ups	
insert	into	item(id,	title,	author,	body)	values	
(1,	'Computer',	'JY	Martin',	'I	sell	my	old	computer.	3	years	old'),	
(2,	'Printer',	'JY	Martin',	'I	sell	my	old	printer.	It''s	a	bit	old'),	
(3,	'Kinect',	'JM	Normand',	'I	sell	my	new	kinect	that	I	can''t	connect	to	my	computer');	
#	---	!Downs	
SET	FOREIGN_KEY_CHECKS=0;	
delete	from	item;	
SET	FOREIGN_KEY_CHECKS=1;	