package sec02_interface;

public interface controllable {
	//1. ��� �ʵ� ����
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	//2. �߻�޼��� ����
	public void turnOn();
	public void turnOff();
	public void setVolume();
	
	//3. ����Ʈ������ ����
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("����ó���մϴ�");
		}
		else
			System.out.println("���� �����մϴ�");
	}
	//4. ���� �޼��� ����
	static void changeBattery() {
		System.out.println("�������� ��ü�մϴ�");
	}
}
