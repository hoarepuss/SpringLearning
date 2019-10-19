import com.itheima.Entity.Account;
import com.itheima.service.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:bean.xml")
public class SpringTestUse {

    @Autowired
    private IAccountService accountService;

    @Test
    public void testFindAll(){
        List<Account> accounts = accountService.findAllAccount();
        for(Account account: accounts){
            System.out.println(account);
        }
    }

    @Test
    public void testFindOne(){
        Account account = accountService.findAccountById(2);
        System.out.println(account);
    }

    public void testSave(){}
    public void testUpdate(){}
    public void testDelete(){}
}
