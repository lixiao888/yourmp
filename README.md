1. 导入如下两个sql：
t_tenant.sql
WORKER_NODE.sql
2. 配置m8ts-plus模块中的resources/application.yml修改mysql数据源配置
3. 配置uid-consumer模块中的resources/application.yml修改mysql数据源配置
4. m8ts-plus模块中的如果没有配置多租户则执行m8ts-plus模块中test包下的com.yourmp.mapper.TenantMapperTest中的方法均正确，否则报如下错：
; bad SQL grammar []; nested exception is java.sql.SQLSyntaxErrorException: Unknown column 'tenant_id' in 'field list'