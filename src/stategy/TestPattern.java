package stategy;

public class TestPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BirdContex aDuck = new BirdContex(new Duck());
		BirdContex anEgl = new BirdContex(new Hawk());
		
		System.out.println(aDuck.makeBirdSpeak());
		System.out.println(anEgl.makeBirdSpeak());

	}

}
