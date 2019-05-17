package com.sdyin.job.springbootxxljob.job;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.JobHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @Description
 * @Author liuye
 * @Date 2019/5/17 15:41
 */
@JobHandler(value = "testJob")
@Component
public class TestJobHandler extends IJobHandler{

    private static Logger logger = LoggerFactory.getLogger(TestJobHandler.class);

    @Override
    public ReturnT<String> execute(String s) throws Exception {
        logger.info("test 执行任务,当前时间:" + LocalDateTime.now());
        return null;
    }
}
