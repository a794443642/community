# my社区
##  资料
[springboot文档](https://spring.io/guides)<br>
[Elastic中文社区](https://elasticsearch.cn/) <br>
[Bootstrap](https://v3.bootcss.com/) <br>
[github_Oauth创建](https://developer.github.com/apps/building-oauth-apps/creating-an-oauth-app/)  


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