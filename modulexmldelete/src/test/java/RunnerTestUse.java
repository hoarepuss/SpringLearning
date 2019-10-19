
import com.itheima.Entity.Account;
import com.itheima.service.impl.AccountServiceImpl;
import config.SpringConfiguration;
import org.apache.commons.dbutils.QueryRunner;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class RunnerTestUse {

    @Test
    public void testRunner(){

        //获取核心容器对象
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        //根据id获取Bean对象
        QueryRunner queryRunner1 = (QueryRunner)ac.getBean("runner");
        QueryRunner queryRunner2 = (QueryRunner)ac.getBean("runner");
        System.out.println(queryRunner1 == queryRunner2);
    }
}
