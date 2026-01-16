package dto;

import able.Attendance;

public class CardAttend implements Attendance {

	private boolean present = false;
	
	@Override
	public void checkIn() {
		present=true;
		System.out.println("카드 출석 완료");
		
	}

	@Override
	public void checkOut() {
		present=true;
		System.out.println("카드 퇴실 완료");
		
	}

	@Override
	public boolean isPresent() {
		
		return present;
	}

}
