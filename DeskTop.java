package Week3.day2;

public class DeskTop extends AbstractClass implements HardWare, SoftWare {
	
		void Method1(){
			System.out.println("Abstract Method");
		}
		
		public void desktopModel() {
			System.out.println("Own Method name 'desktopModel' of class 'DeskTop' ");
		}
		
		public static void main(String[] args) {
			DeskTop desk = new DeskTop();
			desk.desktopModel();
			desk.hardwareresources("Keyboard", "Mouse");
			desk.softwareResources("Windows 10", 2, "10thGen");
			desk.Method1();
			desk.Method2();
		}


		public void softwareResources(String str1, int softwares, String str2) {
			System.out.println("Method SoftWare_Resource from Interface Software with "+softwares+" SW : "+str1+", "+str2);
			
		}

		public void hardwareresources(String str1, String str2) {
			System.out.println("Method HardWare_Resource from Interface Hardware with HW: "+str1+" , "+str2);
			
		}

	}

