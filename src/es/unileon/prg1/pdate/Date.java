package es.unileon.prg1.pdate;
	
public class Date {
		private int day;
		private int month;
		private int year;
		
		/**
		 * Constructor de la clase date
		 */
		public Date() {
			this.day=1;
			this.month=1;
			this.year=1;
			
		}
		/**
		 * Constructor de la clase con parámetros
		 * @param day
		 * @param month
		 * @param year
		 * @throws DateException
		 */
		
		public Date(int day, int month, int year) throws DateException {
			setDay(day);
			setMonth(month);
			setYear(year);
		}




		/**
		 * Generar getter y setters, se pueden generar en click izquierdo y source
		 * @return
		 */
		
		public int getDay() {
			return day;
		}

		public void setDay(int day) throws DateException {
			if ((day>0 && day<32)) {
				this.day=day;
			}
			else {
				throw new DateException("Error en el dia introducido");
			}
		}

		public int getMonth() {
			return month;
		}

		public void setMonth(int month) throws DateException {
			if ((month>0 && month<13)) {
				this.day=day;
			}
			else {
				throw new DateException("Error en el mes introducido");
			}
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) throws DateException {
			if ((year>-1)) {
				this.day=day;
			}
			else {
				throw new DateException("Error en el year introducido");
			}
		}

		/**
		 * comprobar si es el mismo año
		 * @return
		 */
		public boolean isSameYear(Date miFecha) {
				boolean retorno = false;
				
				if (this.year==miFecha.year) {
						retorno = true;
				}
				return retorno;
		}
		public boolean isSameYearSinIf(Date miFecha) {
			
			return (this.year==miFecha.getYear());
	}
		
		
		
		/**
		 * Generar metodo toString
		 */
		public String toString() {
			return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
		}
		
}
