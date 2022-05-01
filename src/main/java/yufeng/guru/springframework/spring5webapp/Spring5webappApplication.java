package yufeng.guru.springframework.spring5webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import yufeng.guru.springframework.spring5webapp.controller.RestServiceController;
import yufeng.guru.springframework.spring5webapp.controller.*;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan(basePackages = {"yufeng.guru.springframework"})
public class Spring5webappApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Spring5webappApplication.class, args);

		RestServiceController restServiceController = (RestServiceController)ctx.getBean("restServiceController");
		System.out.println(restServiceController.getService());

		System.out.println("-------------------profile example");
		I18NController i18NController = (I18NController)ctx.getBean("i18NController");
		System.out.println(i18NController.sayHello());

		System.out.println("-------------------primary bean");

		TestController testController = (TestController)ctx.getBean("testController");
		System.out.println(testController.sayHello());

		System.out.println("-------------------property");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController)ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("-------------------setter");

		SetterInjectedController setterInjectedController = (SetterInjectedController)ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("-------------------constructor");

		ConstructorController constructorController = (ConstructorController)ctx.getBean("constructorController");
		System.out.println(constructorController.getGreeting());

	}

}
