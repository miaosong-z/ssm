import com.itjj.dao.AccountDao;
import com.itjj.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @auther zjj
 * @create 2020-06-21-16:33
 */
public class TestMybatis {

    @Test
    public void testFindAll() throws IOException {
        //加载mybatis核心配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //获取SqlSession对象
        SqlSession sqlSession = factory.openSession();
        //获取代理对象
        AccountDao accountDao =sqlSession.getMapper(AccountDao.class);
        //执行查询并遍历
        List<Account> accounts = accountDao.findAll();
        for (Account account : accounts) {
            System.out.println(account);
        }
        //关闭资源
        sqlSession.close();
        in.close();
    }

    @Test
    public void testSaveAccount() throws IOException {
        //加载mybatis核心配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //获取SqlSession对象
        SqlSession sqlSession = factory.openSession();
        //获取代理对象
        AccountDao accountDao =sqlSession.getMapper(AccountDao.class);
        //手动模拟Account对象
        Account account = new Account();
        account.setMoney(1000d);
        account.setName("小赵");
        //执行保存
        accountDao.saveAccount(account);
        //提交事务
        sqlSession.commit();
        //关闭资源
        sqlSession.close();
        in.close();
    }
}
