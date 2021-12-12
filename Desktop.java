package org.system;

public class Desktop extends Computer {
	
	public void desktopSize() {
		
		System.out.println("13 inch");
	}

	public static void main(String[] args) {
		
        Desktop dp = new Desktop();
        
        
        dp.desktopSize();
        dp.computerModel();
	}

}
