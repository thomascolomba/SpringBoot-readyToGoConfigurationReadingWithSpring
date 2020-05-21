package readyToGoConfigurationReadingWithSpring.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyConfigurationDisplayer implements ApplicationListener<ApplicationReadyEvent> {
	@Autowired
	MyConfigurationBean myConf;
	
	public void onApplicationEvent(final ApplicationReadyEvent event) {
		System.out.println("Will display the configuration from all file in src/main/resources/");
		System.out.println(myConf.getMyString1());
		System.out.println(myConf.getMyString2());
		System.out.println(myConf.getMyString3());
		System.out.println(myConf.getMyString4());
		System.out.println(myConf.getMyString5());
		System.out.println(myConf.getMyDate6());
	}
}