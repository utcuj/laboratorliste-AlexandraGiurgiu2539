
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Registru reg=new Registru();
		reg.cazare("camera1", "Toby");
		reg.cazare("camera2", "Tor");
		reg.cazare("camera3", "Bob");
		reg.cazare("camera4", "Max");
		reg.cazare("camera5", "Kido");
		reg.cazare("camera6", "Hugo");
		reg.cazare("camera7", "Pufi");

		reg.entrySet();
		System.out.println();

		System.out.println(reg.getValue("camera3"));
		System.out.println();
		
		reg.camera();
		System.out.println();
		reg.caine();
		System.out.println();
		
		reg.setNewCazare("camera7", "Tom");
		reg.entrySet();
		System.out.println();

	}

}
