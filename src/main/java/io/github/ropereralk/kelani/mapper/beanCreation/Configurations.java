package io.github.ropereralk.kelani.mapper.beanCreation;

import io.github.ropereralk.kelani.mapper.validator.local.DocumentValidator;
import io.github.ropereralk.kelani.mapper.validator.local.OrderServiceDocumentValidatorImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configurations {

    @Bean
    public Employee createEmployeeBean(){
        return new Employee("ABC",8);
    }

    @Bean
    public PayRoll createPayRolleBean(){
        return new PayRoll(createEmployeeBean());
    }

    @Bean
    public ConfigurationManager cm(){
        return new ConfigurationManager();
    }

    @Bean

    public DocumentValidator getDocumentValidator(){
        return new OrderServiceDocumentValidatorImpl();
    }


}
