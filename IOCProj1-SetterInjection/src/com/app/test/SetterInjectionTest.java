package com.app.test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.app.bean.WishMessageGenrator;
public class SetterInjectionTest {
	public static void main(String[] args) {
		   //Locate and hold spring bean cfg file
			FileSystemResource res=new FileSystemResource("src/com/app/config/applicationContext.xml");//IOCProj1-SetterInjection/src/com/app/config/applicationContext.xml
			//create IOC container
			XmlBeanFactory factory=new XmlBeanFactory(res);
			//get TargetBean class object
			Object obj=factory.getBean("wmg");
			//type casting
			WishMessageGenrator generator=(WishMessageGenrator)obj;
			//invoke the b.method
			String result=generator.generateWishMesage("Bhagchand");
			System.out.println("Result ::"+result);  
		}
}
