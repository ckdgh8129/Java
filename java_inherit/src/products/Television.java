package products;

import java.nio.channels.Pipe.SourceChannel;

import common.Appliance;

public class Television extends Appliance{ //tv

	public int sound;
	public int ch;
	
	
	@Override
	public void power() {
		onoff = !onoff;
		if(onoff)
			System.out.println("TV 전원이 켜짐");
		else 
			System.out.println("TV 전원이 꺼짐");
	}
		
 
}