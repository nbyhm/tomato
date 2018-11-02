package com.tomato.web.log;

import com.tomato.dal.model.SysLog;
import com.tomato.service.log.SysLogService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sun.util.calendar.BaseCalendar;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @author nanbo
 * @description
 * @create 2018-10-31
 **/
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class LogTests {

	@Autowired
	SysLogService sysLogService;

	@Test
	public void listTest(){

		SysLog sysLog = new SysLog();
		sysLog.setUsername("test");
		List<SysLog> list = sysLogService.list(new HashMap<>());

		log.info("系统日志信息>>>" + list);
	}
}
