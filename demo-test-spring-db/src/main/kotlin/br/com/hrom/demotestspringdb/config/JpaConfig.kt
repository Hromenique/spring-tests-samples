package br.com.hrom.demotestspringdb.config

import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.transaction.annotation.EnableTransactionManagement

@Configuration
@EnableJpaRepositories(basePackages = ["br.com.hrom.demotestspringdb.repository"])
@EnableTransactionManagement
class JpaConfig