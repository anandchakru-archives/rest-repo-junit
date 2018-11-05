package jtest;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EntityScan({ "jtest" })
@ComponentScan({ "jtest" })
public class Config {
}