package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author chenyong uthor: chen
 * @date : 2019/4/5
 */
@Configuration
@ComponentScan("com.chen")
@Import({JdbcConfig.class,TransactionConfig.class})
@PropertySource("JdbcConfig.properties")
@EnableTransactionManagement//开启事务注解的支持
public class SpringConfiguration {
}
