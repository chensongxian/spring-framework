import com.csx.supplier.User;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description: TODO
 * @author: lucachen
 * @Date: 2021-04-24
 */
public class MyTest {
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("factoryBean.xml");
//		User myFactoryBean = (User) context.getBean("myFactoryBean");
		// 取FactoryBean
		FactoryBean<User> myFactoryBean = (FactoryBean<User>) context.getBean("&myFactoryBean");
		System.out.println(myFactoryBean.getObject());
	}
}
