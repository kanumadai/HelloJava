package config;

import javax.sql.DataSource;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;

//@Component("TransactionConfig")
//@Aspect
public class TransactionConfig {
	
	@Pointcut("execution(* com.kanuma.service.Impl.*.*(..))")
	public void pt1() {
		
	}
	@Bean("transactionManager")
	private PlatformTransactionManager createTransactionManager(DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}
	
	
}
