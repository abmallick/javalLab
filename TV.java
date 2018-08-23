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
			if(channel < 200){
			this.channel = channel;
			System.out.println("Channel: "+channel);
			}
			else
			{
				System.out.println("Channel out of range!");
			}
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
			if(volume < 50){
				this.volume = volume;
				System.out.println("Channel: "+volume);
			}
			else
			{
				System.out.println("Volume out of range!");	
			}
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
			if(channel < 200){
				channel++;
				System.out.println("Channel: "+channel);	
			}
			else
			{
				System.out.println("Channel out of range!");
			}
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
			if(volume < 50){
				volume++;
				System.out.println("Channel: "+volume);
			}
			else
			{
				System.out.println("Volume out of range!");		
			}
		}
		else
		{
			System.out.println("TV is off, please turn it on to continue!");
		}
	}

	void volumeDown()
	{
		if(on == true)
		{
			if(volume > 0){
				volume--;
				System.out.println("Channel: "+volume);
			}
			else
			{
				System.out.println("Volume out of range!");		
			}
		}
		else
		{
			System.out.println("TV is off, please turn it on to continue!");
		}
	}

	void channelDown()
	{
		if(on == true)
		{
			if(channel > 0){
				channel--;
				System.out.println("Channel: "+channel);	
			}
			else
			{
				System.out.println("Channel out of range!");
			}
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
		tv.setVolume(200);
		tv.setChannel(108);
		tv.channelUp();
	}
}