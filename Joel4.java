package apartatB;

import java.util.Scanner;

public class Joel4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner entrada = new Scanner(System.in);
		int segons;
		segons = entrada.nextInt();
		
		if ((1<=segons) && (segons<43200)){
			System.out.println("mati del dia 1");
		}else if ((43200<=segons) && (segons<86400)){
			System.out.println("nit del dia 1");
		}else if ((86400<=segons) && (segons<129600)) {
			System.out.println("mati del dia 2");
		}else if ((129600<=segons) && (segons<172800)) {
			System.out.println("nit del dia 2");
		}else if ((172800<=segons) && (segons<216000)) {
			System.out.println("mati del dia 3");
		}else if ((216000<=segons) && (segons<259200)){
			System.out.println("nit del dia 3");
		}else if ((259200<=segons) && (segons<302400)){
			System.out.println("mati del dia 4");
		}else if ((302400<=segons) && (segons<345600)){
			System.out.println("nit del dia 4");
		}else if ((345600<=segons) && (segons<388800)){
			System.out.println("mati del dia 5");
		}else if ((388800<=segons) && (segons<432000)){
			System.out.println("nit del dia 5");
		}else if ((432000<=segons) && (segons<475200)){
			System.out.println("mati del dia 6");
		}else if ((475200<=segons) && (segons<518400)){
			System.out.println("nit del dia 6");
		}else if ((518400<=segons) && (segons<561600)){
			System.out.println("mati del dia 7");
		}else if ((561600<=segons) && (segons<604800)){
			System.out.println("nit del dia 7");
		}else if ((604800<=segons) && (segons<648000)){
			System.out.println("mati del dia 8");
		}else if ((648000<=segons) && (segons<691200)){
			System.out.println("nit del dia 8");
		}else if ((691200<=segons) && (segons<734400)){
			System.out.println("mati del dia 9");
		}else if ((734400<=segons) && (segons<777600)){
			System.out.println("nit del dia 9");
		}else if ((777600<=segons) && (segons<820800)){
			System.out.println("mati del dia 10");
		}else if ((820800<=segons) && (segons<864000)){
			System.out.println("nit del dia 10");
		}else if ((864000<=segons) && (segons<907200)){
			System.out.println("mati del dia 11");
		}else if ((907200<=segons) && (segons<950400)){
			System.out.println("nit del dia 11");
		}else if ((950400<=segons) && (segons<993600)){
			System.out.println("mati del dia 12");
		}else if ((993600<=segons) && (segons<1000000)){
			System.out.println("nit del dia 12");
			
		
		
		
		}
		
	}

}
