import com.itjj.domain.Account;
import com.itjj.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auther zjj
 * @create 2020-06-21-14:31
 */
public class TestSpring {

    //测试spring框架是否搭建没有问题
    @Test
    public void run1(){
        //加载配置文件
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取对象
        AccountService as = (AccountService)context.getBean("accountService");
        //执行方法
        as.findAll();
    }
}
