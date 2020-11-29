package sec02_interface;

public class Tv implements controllable {
	private int volume;

	public void turnOn() {
		System.out.println("Tv¸¦ ÄÕ´Ï´Ù");

	}

	public void turnOff() {
		System.out.println("Tv¸¦ ²ü´Ï´Ù");

	}

	public void setVolume(int volume) {
		if (volume > controllable.MAX_VOLUME)
			this.volume = MAX_VOLUME;
		else if (volume < MIN_VOLUME) {
			this.volume = MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("ÇöÀç º¼·ý:" + this.volume);
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
		System.out.println("ÇöÀç º¼·ý:" + this.volume);
	}

}
