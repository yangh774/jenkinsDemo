package com.yangh;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import groovy.util.logging.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author "杨航_2211"
 * @Descript {
 * 介绍：
 * }
 * @Project SpringCloud-Alibaba
 * @date 2023/04/19 下午 08:35
 */

//import lombok.extern.slf4j.Slf4j;

/**
 * XXLJob的测试类，需要继承IJobHandler类
 *
 * @author Promsing(张有博)
 * @version 1.0.0
 * @since 2021/11/14 - 19:51
 */
//@Slf4j
@Component
public class XXLDemo{
    /**
     * execute handler, invoked when executor receives a scheduling request
     *
     * @param param
     * @return
     * @throws Exception
     */
    @XxlJob("Demo")
    public ReturnT<String> execute(String param)  {
        try {
            System.out.println("业务代码1");
        } catch (Exception e) {
//            log.error(e.getMessage(), e);
            throw e;
        }
        return ReturnT.SUCCESS;
    }
}
