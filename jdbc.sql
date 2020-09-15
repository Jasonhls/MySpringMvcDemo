CREATE TABLE user (
    id int(11) NOT NULL auto_increment,
    name varchar(255) default NULL,
    age varchar(255) default NULL,
    sex varchar(255) default NULL,
    primary key (id)
) ENGINE=InnoDB default CHARSET=utf8;