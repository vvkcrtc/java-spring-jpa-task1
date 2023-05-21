package ru.netology.springjpatask1.configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration

@EnableMethodSecurity
@EnableGlobalAuthentication
public class WebSecurityConfig {

    @Bean
    public UserDetailsService users() {

        UserDetails user = User.withDefaultPasswordEncoder()
                .username("user")
                .password("12345")
                .roles("READ")
                .build();
        UserDetails corr = User.withDefaultPasswordEncoder()
                .username("corr")
                .password("corr")
                .roles("READ","WRITE")
                .build();
        UserDetails admin = User.withDefaultPasswordEncoder()
                .username("admin")
                .password("admin")
                .roles("READ", "WRITE","DELETE")
                .build();
        return new InMemoryUserDetailsManager(user, corr, admin);
    }
}
