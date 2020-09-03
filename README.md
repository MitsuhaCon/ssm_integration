# ssm_integration
- 问题一

    一定要 idea 设置项目的 `file coding` 为 `utf-8`，要不然 `xml` 中有中文注释会报错

- 问题二

    在配置 `dataSource` 时，可能出现用 `${}` 取不到 `.properties` 文件中的数据，这个时候可以把参数写死

- `mapper.xml` 的配置，可以在 `mybatis-config.xml` 中配置，也可以在 `spring-dao.xml` 中配置

    ```xml
    <bean id="sqlSessionFactory" class="org.mybatis.spring.SqlSessionFactoryBean">
    	<property name="dataSource" ref="dataSource"/>
    	<property name="configLocation" value="classpath:mybatis-config.xml"/>
    	<property name="mapperLocations" value="classpath:mapper/*.xml"/>
    </bean>
    ```

    

