package sec02_interface;

public class Tv implements controllable {
	private int volume;

	public void turnOn() {
		System.out.println("Tv�� �մϴ�");

	}

	public void turnOff() {
		System.out.println("Tv�� ���ϴ�");

	}

	public void setVolume(int volume) {
		if (volume > controllable.MAX_VOLUME)
			this.volume = MAX_VOLUME;
		else if (volume < MIN_VOLUME) {
			this.volume = MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("���� ����:" + this.volume);
	}

	@Override
	public void setVolume() {
		if (volume > controllable.MAX_VOLUME)
			this.volume = MAX_VOLUME;
		else if (volume < MIN_VOLUME) {
			this.volume = MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("���� ����:" + this.volume);
	}

}
