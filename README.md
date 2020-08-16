# Spring-MVC-Hibernate-CRUD-Operation

It is a maven project.

### Database  (MySQL)
Database Name: ghulam

Note: if you want to change the database name

```
<bean id="myDataSource" class="com.mchange.v2.c3p0.ComboPooledDataSource"
          destroy-method="close">
        <property name="driverClass" value="com.mysql.jdbc.Driver" />
        <property name="jdbcUrl" value="jdbc:mysql://localhost:3306/database_name?useSSL=false" />
        <property name="user" value="root" />
        <property name="password" value="Ghulam.9097" />
```
Replace database_name to your database name
