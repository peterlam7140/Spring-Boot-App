# Database Setting
Name: myDB
Path: ./Data/myDB.mv.db
Authentication: User & Password
User: sa
Password: password
URL: jdbc:h2:/Data/myDB;AUTO_SERVER=TRUE

## application.properties
#H2 data source
spring.datasource.url=jdbc:h2:./Data/myDB;AUTO_SERVER=TRUE
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password

# Login
|username|password|
|--------|--------|
|admin1  |admin1pw|
|admin2  |admin2pw|
|user1   |user1pw |
|user2   |user2pw |
