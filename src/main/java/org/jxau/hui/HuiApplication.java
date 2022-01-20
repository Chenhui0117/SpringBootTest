package org.jxau.hui;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.jxau.hui.mapper")
public class HuiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HuiApplication.class, args);
	}

}
