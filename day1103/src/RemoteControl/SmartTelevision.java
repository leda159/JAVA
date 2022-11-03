package RemoteControl;

//구현객체는 다중 인터페이스로 구현가능
public class SmartTelevision implements RemoteControl,Searchable {

	private int volume;
	
	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
		
	}

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

