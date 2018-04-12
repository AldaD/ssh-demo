package test;

import service.Address;
import service.AddressImpl;
import bean.AddresslistEntity;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 */
public class Test {
    public static void main(String[] args)
    {
        ApplicationContext ac = new FileSystemXmlApplicationContext("web/WEB-INF/applicationContext.xml");
//        TestService ts = (TestService)ac.getBean("testService");
//        ts.hello();
        Address ail = (AddressImpl)ac.getBean("address");
        AddresslistEntity al = new AddresslistEntity();
        al.setName("kaka");
        al.setPhone("123456123");
        ail.add(al);
    }
}