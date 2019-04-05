package test;

import com.chen.service.IAcountService;
import config.SpringConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author chenyong uthor: chen
 * @date : 2019/4/5
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfiguration.class)
public class AccountServiceTest {
    @Autowired
    private IAcountService as;
    @Test
    public void testTranfer(){

//        System.out.println(as.findAccountById(1));
//        System.out.println(as.findAccountById(2));
        as.transfer("孙莹莹","陈勇",200f);
    }
}
