import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.training.config.HelloWorldConfig;
import com.training.model.HelloWorld;

public class Application {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		HelloWorld helloWorld = context.getBean(HelloWorld.class);
	    helloWorld.setMessage("Hello World!");
	    helloWorld.getMessage();
		((ConfigurableApplicationContext)context).close();
	}

}
