package org.hdcd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "org.hdcd.mapper")
public class Ch12DbMyBatis05ResultMapCollectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ch12DbMyBatis05ResultMapCollectionApplication.class, args);
	}

}
