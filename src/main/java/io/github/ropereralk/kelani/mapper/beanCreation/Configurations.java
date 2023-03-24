package io.github.ropereralk.kelani.mapper.beanCreation;

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
}
