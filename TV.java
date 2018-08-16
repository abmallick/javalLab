class TV
{
	int channel, volume;
	boolean on;

	void switchTV()
	{
		on = !on;
	}

	void setChannel(int channel)
	{
		if(on == true)
		{
			this.channel = channel;
			System.out.println("Channel: "+channel);
		}
		else
		{
			System.out.println("TV is off, please turn it on to continue!");
		}
	}

	void setVolume(int volume)
	{
		if(on == true)
		{
			this.volume = volume;
			System.out.println("Channel: "+volume);
		}
		else
		{
			System.out.println("TV is off, please turn it on to continue!");
		}
	}

	void channelUp()
	{
		if(on == true)
		{
			channel++;
			System.out.println("Channel: "+channel);	
		}
		else
		{
			System.out.println("TV is off, please turn it on to continue!");
		}
	}

	void volumeUp()
	{
		if(on == true)
		{
			volume++;
			System.out.println("Channel: "+volume);
		}
		else
		{
			System.out.println("TV is off, please turn it on to continue!");
		}
	}
}

class TVDemo
{
	public static void main(String[] args) {
		TV tv = new TV();
		tv.setChannel(108);
		tv.switchTV();
		tv.setVolume(20);
		tv.setChannel(108);
		tv.channelUp();
	}
}