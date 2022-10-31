
public class SmartPhone implements MultiMedia, TelePhone, Camera, Navigation{

	private Telecom telecom;
	
	public SmartPhone(Telecom telecom) {
		this.telecom = telecom;
	
	}



	public void takePicture(){ }
	public void takeVideo(){ }
	public void viewGalary(){ }
	
	public void sned(){ }
	public void reception(){ }
	
	
	public void webSearch(){ }
	public void youTube(){ }
	
	public void findWay() {
		System.out.print("왼쪽으로 가세요.");
	}

}

