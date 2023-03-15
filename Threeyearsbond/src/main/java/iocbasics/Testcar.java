package iocbasics;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Testcar {
public static void main(String[] args) {
	ClassPathResource classPathResource=new ClassPathResource("ioc.xml");
	BeanFactory beanFactory= new XmlBeanFactory(classPathResource);
	Car car=(Car) beanFactory.getBean("cartest");
	car.enginee();
}
}