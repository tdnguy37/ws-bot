package Main;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

public class wsBot {
	
	public static JDA jda;
	
	public static String prefixcmd = "~";
	
	//begin Main method
	public static void main(String[] args) throws LoginException {
		
		JDABuilder jda = JDABuilder.createDefault("OTE3MjAzNzQ0NDg2MjExNzA0.Ya1SjQ.7O8SK_psXbt_TA9PqDqc7d7YJNo");
		jda.setActivity(Activity.playing("*play"));
		jda.setStatus(OnlineStatus.ONLINE);
		jda.build();
		
		
		
		
	}
	
	
	
	
	
	
	

}
