package stagistadipendente;


	public class Villain extends person {
		protected static final double DEFAULT_SHOOTINGPOWER = 0.0 ;
		private double shootingpower;
		
		public Villain() {
			
		}
		public Villain (String name, double shootingpower) {
			this(name, shootingpower);
		}
		
		public Villain (String name, int energy, double shootingpower) {
			super (name);
			this.shootingpower = shootingpower ;
			
			
		}
		
		public double getshotingpower() {
			return shootingpower ; 
			
		
		}
			
	}

}
