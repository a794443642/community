# my社区
##  资料
[springboot文档](https://spring.io/guides)<br>
[Elastic中文社区](https://elasticsearch.cn/) <br>
[Bootstrap](https://v3.bootcss.com/) <br>
[github_Oauth创建](https://developer.github.com/apps/building-oauth-apps/creating-an-oauth-app/)  
[flayway](https://flywaydb.org/getstarted/firststeps/maven)

##sql语句
```sql
create table user
(
    id           int auto_increment primary key,
    account_id   varchar(100) null,
    NAME         varchar(50)  null,
    TOKEN        varchar(36)  null,
    GMT_CREAT    bigint(19)   null,
    GMT_MODIFIED bigint(19)   null
);
```
## spring boot集成flyway
1.在配置文件中配置数据源信息：
instance：
```
spring:
  datasource:
    driver-class-name: com.mysql.cj.jdbc.Driver
    username: root
    password:
    url:  jdbc:mysql://localhost:3306/community?serverTimezone=Asia/Shanghai
spring.flyway:
  baselineOnMigrate: true
  locations: db/migration
```
flyway的一些配置：
```
flyway.baseline-description对执行迁移时基准版本的描述.
flyway.baseline-on-migrate当迁移时发现目标schema非空，而且带有没有元数据的表时，是否自动执行基准迁移，默认false.
flyway.baseline-version开始执行基准迁移时对现有的schema的版本打标签，默认值为1.
flyway.check-location检查迁移脚本的位置是否存在，默认false.
flyway.clean-on-validation-error当发现校验错误时是否自动调用clean，默认false.
flyway.enabled是否开启flywary，默认true.
flyway.encoding设置迁移时的编码，默认UTF-8.
flyway.ignore-failed-future-migration当读取元数据表时是否忽略错误的迁移，默认false.
flyway.init-sqls当初始化好连接时要执行的SQL.
flyway.locations迁移脚本的位置，默认db/migration.
flyway.out-of-order是否允许无序的迁移，默认false.
flyway.password目标数据库的密码.
flyway.placeholder-prefix设置每个placeholder的前缀，默认${.
flyway.placeholder-replacementplaceholders是否要被替换，默认true.
flyway.placeholder-suffix设置每个placeholder的后缀，默认}.
flyway.placeholders.[placeholder name]设置placeholder的value
flyway.schemas设定需要flywary迁移的schema，大小写敏感，默认为连接默认的schema.
flyway.sql-migration-prefix迁移文件的前缀，默认为V.
flyway.sql-migration-separator迁移脚本的文件名分隔符，默认__
flyway.sql-migration-suffix迁移脚本的后缀，默认为.sql
flyway.tableflyway使用的元数据表名，默认为schema_version
flyway.target迁移时使用的目标版本，默认为latest version
flyway.url迁移时使用的JDBC URL，如果没有指定的话，将使用配置的主数据源
flyway.user迁移数据库的用户名
flyway.validate-on-migrate迁移时是否校验，默认为true.
```