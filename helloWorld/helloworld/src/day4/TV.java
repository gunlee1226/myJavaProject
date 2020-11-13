package day4;

public class TV {
	private int channel;
	private int volume;
	private boolean power;

	public TV(int channel, int volume, boolean power) {
		super();
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public boolean isPower() {
		return power;
	}

	public void power(boolean power) {
		this.power = power;
	}

	public void volume(int volume) {
		if (volume >= 100) {
			this.volume = 100;

		} else {

			this.volume = volume;
		}
	}

	public void volume(boolean volume) {
		
	}

	public void channel(int channel) {
		if(channel >= 0) {
			this.channel += 1;
		}else if(channel >= 255) {
			this.channel = 254;
		}
		else {
			this.channel = channel;
		}
	}

	public void channel(boolean channel) {
			 
	}

	public void status() {
		power = this.power;
		volume = this.volume;
		channel = this.channel;

		System.out.println("채널 :" + this.channel + " 볼륨 :" + this.volume + " 전원 :" + this.power);
		System.out.println();
		System.out.println();

	}

}
