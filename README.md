# Spring-MVC-Hibernate-CRUD-Operation

It is a maven project.

### Database (MySQL) Configuration
```
<bean id="myDataSource" class="com.mchange.v2.c3p0.ComboPooledDataSource"
          destroy-method="close">
        <property name="driverClass" value="com.mysql.jdbc.Driver" />
        <property name="jdbcUrl" value="jdbc:mysql://localhost:3306/database_name?useSSL=false" />
        <property name="user" value="username" />
        <property name="password" value="password" />
```

Replace some property value with your MySQL configuration
- Database_name => Database's Name
- Username => MySQL Username 
- Password => MySQL Password
