package day07;

public class TVMain {

	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32,1024);
		myTV.printProperty();

		OPTV opTV = new OPTV("192.1.1.2",32,1024);
		opTV.printProperty();
		
	}

}
