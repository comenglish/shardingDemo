# shardingDemo

SpringMVC + MyBatis + Sharding-JDBC

在文件src/main/resources/spring-mybatis-sharding 里配置好数据源traceHisDataSource 对应的连接参数

注意最后一行配置的是使用zookeeper来配置分表策略的


请自行建库，创建表的脚本在src/main/resources/a_trace_his.sql中

配置完成之后使用
mvn jetty:run 
即可运行
