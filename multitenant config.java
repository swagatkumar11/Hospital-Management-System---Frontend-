package com.mednex.config;

import org.hibernate.context.spi.CurrentTenantIdentifierResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MultiTenantConfig {

    @Bean
    public CurrentTenantIdentifierResolver tenantIdentifierResolver() {
        return new CurrentTenantIdentifierResolver() {

            @Override
            public String resolveCurrentTenantIdentifier() {
                String tenant = TenantContext.getTenant();
                return (tenant != null) ? tenant : "hospital_a";
            }

            @Override
            public boolean validateExistingCurrentSessions() {
                return true;
            }
        };
    }
}