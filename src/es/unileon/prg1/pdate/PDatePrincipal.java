package es.unileon.prg1.pdate;

public class PDatePrincipal {

	public static void main(String[] args) {
			Date myFecha=new Date();
			//Date myFecha2=new Date(30,10,2019);
			if (myFecha.isSameYear(myFecha)) {
				System.out.println("Es la misma fecha");
			}
			else {
					System.out.println("Son fechas distintas");
			}
			System.out.println(myFecha);
				
			Date today;

			try {
				today = new Date(1, 14, 2017);
				today.setDay(32);
				System.out.println(today.toString());
			} catch (DateException e) {
				System.out.println(e.getMessage());
			}
			
	}

}
