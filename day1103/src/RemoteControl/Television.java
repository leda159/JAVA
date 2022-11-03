package RemoteControl;


//RemoteControl 인터페이스를 가지고 구현된
//Television 구현객체
public class Television implements RemoteControl {

	private int volume;


	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
		
	}
	
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
			
		}else if(volume < RemoteControl.Min_VOLUME) {
			this.volume = RemoteControl.Min_VOLUME;
			
		}else {
			this.volume = volume;
		}
		
		System.out.println("현재 TV 볼륨:" + this.volume);
		
	}

}
