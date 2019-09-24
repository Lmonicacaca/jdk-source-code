package com.jdk_source_code.demo.configure;

import com.alibaba.druid.pool.DruidDataSource;
import com.jdk_source_code.demo.constant.MybatisConfigConstant;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import tk.mybatis.spring.annotation.MapperScan;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = MybatisConfigConstant.DATABASE_TWO_PACKAGE, sqlSessionTemplateRef = "database2SqlSessionTemplate")
public class DataBase2Configure {
    @Bean(name = "database2DataSource")
    @ConfigurationProperties(prefix = "spring.datasource.druid.database2")
    public DataSource dataSource() {
        return new DruidDataSource();
    }

    @Bean(name = "database2SqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(@Qualifier("database2DataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setTypeAliasesPackage(MybatisConfigConstant.MODEL_PACKAGE);

        // 添加XML目录
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        bean.setMapperLocations(resolver.getResources("classpath:mapper/database2/*.xml"));

        return bean.getObject();
    }

    @Bean(name = "database2TransactionManager")
    public DataSourceTransactionManager transactionManager(@Qualifier("database2DataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "database2SqlSessionTemplate")
    public SqlSessionTemplate sqlSessionTemplate(
            @Qualifier("database2SqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
