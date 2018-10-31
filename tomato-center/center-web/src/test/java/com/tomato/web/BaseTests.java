package com.tomato.web;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author nanbo
 * @description
 * @create 2018-10-31
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class BaseTests {

	private Logger log = LoggerFactory.getLogger(this.getClass());

	long starTime;
	long endTime;
	@Before
	public void init(){
		starTime = System.currentTimeMillis();
		log.info("================= 测试开始 {}=================",starTime );
	}

	@After
	public void after() {
		endTime = System.currentTimeMillis();
		log.info("=========== 测试结束 {} 共耗时 {}秒 ===========", endTime, endTime - starTime);
	}
}
