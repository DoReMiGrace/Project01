package ajou.oop.lab07;

public class SmartTV extends Product {
	
	int channel = 0;
	
	public SmartTV() {
	}

	public boolean isConnected(){
		boolean tmp_b = true;
		
		return tmp_b;
	}
	
	public double maxSpeed(){
		double tmp_d = 0;
		
		return tmp_d;
	}
	
	@Override
	public String getName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}
	
}
