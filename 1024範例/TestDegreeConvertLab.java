package tw.leonchen.javaproject.lab;

public class TestDegreeConvertLab {

	public static void main(String[] args) {
		int index=2, degree=89;
		
		if(index==1) {
			System.out.println("c->f");
			double degreeF = (degree*9.0/5+32);
			System.out.println("degreeF:" + degreeF);
		}
		
		if(index==2) {
			System.out.println("f->c");
			double degreeC = (degree-32)*5D/9;
			System.out.println("degreeC:" + degreeC);
		}
	}

}
