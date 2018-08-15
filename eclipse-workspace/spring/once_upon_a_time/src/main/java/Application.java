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
    private static String king;


	public static void main(String[] args) {

		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		EmbarkService service = ac.getBean("embarkService", EmbarkService.class);

		ArrayList<Hero> heroList = (ArrayList<Hero>) service.findHeros();
		ArrayList<Quest> questList = (ArrayList<Quest>) service.findQuests();

		Iterator<Hero> itHero = heroList.iterator();
		Iterator<Quest> itQuest = questList.iterator();

		while (itHero.hasNext() && itQuest.hasNext()) {
			Quest quest= itQuest.next();
			Hero hero = itHero.next();
			System.out.println("King " + quest.getKing()  +" has arrived. All rise!");
			System.out.println("King declares that " + hero.getFullName());
			System.out.println("Will embark on journey to " + quest.getDescription());
			if(!"".equals(hero.getWeapon())) {
				System.out.println("He will be using his favorite weapon ... " + hero.getWeapon());
				System.out.println("against ... " + quest.getEnemy() + "");
				System.out.println("");
			}
		}

		((ConfigurableApplicationContext) ac).close();

	}
	
	public static String getKing() {
		return king;
	}

	@Value("${king}")
	public static void setKing(String king) {
		Application.king = king;
	}

	
}
