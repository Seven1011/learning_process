package com.ch3.fortest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
// SpringJUnit4ClassRunner 在JUnit环境下提供Spring TestContext Framework的功能
// @ContextConfiguration用来加载配置ApplicationContext，其中classes属性用来加载配置类
//@ActiveProfiles 用来生命活动的profile
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestConfig.class})
@ActiveProfiles("prod")
public class DemoBeanIntegrationTests {

    @Autowired //声明活动的profile
    private TestBean testBean;

    @Test //测试代码，通过JUnit的Assert来校验结果是否和预期一致
    public void proBeanShouldInject() {
        String expected = "from production profile";
        String actual = testBean.getContrnt();
        Assert.assertEquals(expected, actual);
    }
}
