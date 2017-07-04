package com.qincy.shardingdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value={"com.qincy.shardingdemo"})
public class ShardingdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShardingdemoApplication.class, args);
	}
}
