
import com.itheima.Entity.Account;
import com.itheima.service.impl.AccountServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SpringTestUse {

    @Test
    public void testFindAll(){

        //获取核心容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");

        //根据id获取Bean对象
        AccountServiceImpl as = (AccountServiceImpl)ac.getBean("accountService");
        List<Account> accounts = as.findAllAccount();
        for(Account account: accounts){
            System.out.println(account);
        }
    }

    @Test
    public void testFindOne(){
        //获取核心容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");

        //根据id获取Bean对象
        AccountServiceImpl as = (AccountServiceImpl)ac.getBean("accountService");
        Account account = as.findAccountById(2);
        System.out.println(account);
    }

    @Test
    public void testSave(){}

    @Test
    public void testUpdate(){}

    @Test
    public void testDelete(){}
}
