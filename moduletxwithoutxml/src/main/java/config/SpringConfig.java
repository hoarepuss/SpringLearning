package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("com.itheima")
@Import({JdbcConfiguration.class, TXConfig.class})
@PropertySource("classpath:jdbc.properties")
@EnableTransactionManagement
public class SpringConfig {
}
