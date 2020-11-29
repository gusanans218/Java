package sec02_interface;

public interface controllable {
	//1. 상수 필드 선언
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	//2. 추상메서드 선언
	public void turnOn();
	public void turnOff();
	public void setVolume();
	
	//3. 디폴트에서도 선언
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음처리합니다");
		}
		else
			System.out.println("무음 해제합니다");
	}
	//4. 정적 메서드 선언
	static void changeBattery() {
		System.out.println("건전지를 교체합니다");
	}
}
