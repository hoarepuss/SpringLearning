
import com.itheima.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTestUse {
    @Test
    public void testIoc(){

        //获取核心容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");

        //根据id获取Bean对象
        AccountService as = (AccountService)ac.getBean("accountService");
        as.saveAccount();
        //ac.close();
        //AccountService as2 = (AccountService)ac.getBean("accountService");
        //System.out.println(as1 == as2);
    }
}
