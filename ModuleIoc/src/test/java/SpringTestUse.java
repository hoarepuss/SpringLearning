
import com.itheima.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTestUse {
    @Test
    public void testIoc(){

        //获取核心容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");

        //根据id获取Bean对象
        AccountService as1 = (AccountService)ac.getBean("accountService");
        AccountService as2 = (AccountService)ac.getBean("accountService");
        System.out.println(as1 == as2);
        //as.saveAccount();
    }
}
