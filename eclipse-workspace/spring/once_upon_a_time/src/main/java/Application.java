import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jorge.model.Hero;
import com.jorge.model.Quest;
import com.jorge.service.EmbarkService;

public class Application {

	public static void main(String[] args) {

		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		EmbarkService service = ac.getBean("embarkService", EmbarkService.class);
		
		service.tellStory();
		
		((ConfigurableApplicationContext) ac).close();

	}

}
