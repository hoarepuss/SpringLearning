package config;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/*
*和事务相关的配置类
*/
public class TXConfig {

    @Bean("transactionManager")
    public DataSourceTransactionManager createDataSourceTransactionManager(DataSource dataSource){
        return new DataSourceTransactionManager(dataSource);
    }
}
