package products;

import common.Appliance;

public class Microwave extends Appliance{ //전자레인지
	@Override
	public void power() {
		onoff = !onoff;
		if(onoff)
			System.out.println("전자레인지 전원이 켜짐");
		else 
			System.out.println("전자레인지 전원이 꺼짐");
	}
}
