package readyToGoConfigurationReadingWithSpring.configuration;

import java.util.Date;

import org.joda.time.DateTime;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

import readyToGoConfigurationReadingWithSpring.mySourceFactory.MyJsonPropertySourceFactory;

@Component
@PropertySources({
	@PropertySource(value = "classpath:myConfiguration1.json", factory = MyJsonPropertySourceFactory.class),//it seems I can't load more than 1 json file. Kinda sad :(
	@PropertySource("classpath:application2.properties"),
	@PropertySource("classpath:application2.yaml"),
	@PropertySource("classpath:application3.yaml")
})
@ConfigurationProperties
public class MyConfigurationBean {
	private String myString1;
	private String myString2;
	private String myString3;
	private String myString4;
	private String myString5;
	private Date myDate6;
	private DateTime myDate7;
	public String getMyString1() {
		return myString1;
	}
	public void setMyString1(String myString1) {
		this.myString1 = myString1;
	}
	public String getMyString2() {
		return myString2;
	}
	public void setMyString2(String myString2) {
		this.myString2 = myString2;
	}
	public String getMyString3() {
		return myString3;
	}
	public void setMyString3(String myString3) {
		this.myString3 = myString3;
	}
	public String getMyString4() {
		return myString4;
	}
	public void setMyString4(String myString4) {
		this.myString4 = myString4;
	}
	public String getMyString5() {
		return myString5;
	}
	public void setMyString5(String myString5) {
		this.myString5 = myString5;
	}
	public Date getMyDate6() {
		return myDate6;
	}
	public void setMyDate6(Date myDate6) {
		this.myDate6 = myDate6;
	}
	public DateTime getMyDate7() {
		return myDate7;
	}
	public void setMyDate7(DateTime myDate7) {
		this.myDate7 = myDate7;
	}
}