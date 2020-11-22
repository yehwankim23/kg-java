package d08;

public class Monitor {
	public int size;
	public int brightness;
	public boolean onOff;

	public Monitor() {

	}

	public Monitor(int size) {
		this.size = size;

	}

	public Monitor(boolean onOff) {
		this.onOff = onOff;

	}

	public Monitor(int size, int brightness) {
		this.size = size;
		this.brightness = brightness;

	}

	public Monitor(int size, boolean onOff) {
		this.size = size;
		this.onOff = onOff;

	}

	public Monitor(int size, int brightness, boolean onOff) {
		this.size = size;
		this.brightness = brightness;
		this.onOff = onOff;

	}

	public void pressPowerButton() {
		onOff = !onOff;

		if(onOff) {
			System.out.println("켜져있습니다.");

		} else {
			System.out.println("꺼져있습니다.");

		}

	}

	public int getSize() {
		return size;

	}

	public void setSize(int size) {
		this.size = size;

	}

	public int getBrightness() {
		return brightness;

	}

	public void setBrightness(int brightness) {
		if(brightness < 0 || brightness > 100) {
			System.out.println("잘못된 입력입니다.");

		} else {
			this.brightness = brightness;

		}

	}

	public boolean isOnOff() {
		return onOff;

	}

	public void setOnOff(boolean onOff) {
		this.onOff = onOff;

	}

}
