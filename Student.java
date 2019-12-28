package studentApp;

public class Student {

	public String nume;
	public int notaAlgebra;
	public int notaAnaliza;
	public int notaProgramare;
	public int notaSport;
	public double medie;
	
	public Student(String num, int nal,int nan,int np , int ns) {
		this.nume = num;
		this.notaAlgebra = nal;
		this.notaAnaliza = nan;
		this.notaProgramare = np;
		this.notaSport = ns;
		this.medie = (nal+nan+np+ns)/4 ;
		
	}

	@Override
	public String toString() {
		return "Student [nume=" + nume + ", notaAlgebra=" + notaAlgebra + ", notaAnaliza=" + notaAnaliza
				+ ", notaProgramare=" + notaProgramare + ", notaSport=" + notaSport + ", medie=" + medie + "]";
	}
	
	
	
}
