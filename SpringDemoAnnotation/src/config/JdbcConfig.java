package config;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JdbcConfig{
	
	@Value("${driverClassName}")
	private String driverClass;
	
	@Value("${jdbcUrl}")
	private String jdbcUrl;
	
	@Value("${jdbcUsername}")
	private String username;

	@Value("${password}")
	private String password;
	
	/**
	 * <!-- query rannner -->
	 * <bean id ="qRunner" class ="org.apache.commons.dbutils.QueryRunner">
	 * <constructor-arg name="ds" ref="dataSource"></constructor-arg> </bean>
	 * 
	 * @param dataSource
	 * @return
	 */
	@Bean(name = "qRunner") // returnned object is insert into spring beans
	public QueryRunner createQueryRunner(DataSource dataSource) {
		return new QueryRunner(dataSource);
	}

	/**
	 * <!-- c3p0 -->
	 * <bean id="dataSource" class="com.mchange.v2.c3p0.ComboPooledDataSource">
	 * <property name="driverClass" value="com.mysql.jdbc.Driver"></property>
	 * <property name="jdbcUrl" value=
	 * "jdbc:mysql://192.168.100.130/learnjdbc?useSSL=false"></property>
	 * <property name="user" value="root"></property>
	 * <property name="password" value="lee"></property> </bean>
	 * 
	 * @return
	 */
	@Bean(name = "dataSource")
	public DataSource createDataSource() {
		System.out.println(driverClass+" "+ jdbcUrl+" "+ username+" "+ password );
		ComboPooledDataSource ds = new ComboPooledDataSource();
		try {
			ds.setDriverClass(driverClass);
			ds.setJdbcUrl(jdbcUrl);
			ds.setUser(username);
			ds.setPassword(password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
		return ds;
	}
	
	
}