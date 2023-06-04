

public class Skills extends Education {
	//initiate variables.
	String personalSkill1 = "Adaptability";
	String personalSkill2 = "Time Management";
	String personalSkill3 = "Emotional Intelligence";
	String personalSkill4 = "Collaboration";
	String technicalSkill1 = "Photoshop";
	String technicalSkill2 = "InDesign";
	String technicalSkill3 = "Picsart";
	String technicalSkill4 = "CapCut";
	
	public static void main (String [] args) {
		
		/* Instantiate new object from last sub class to access all the
		 * variables from parent class to the last sub class.*/
		 Skills skl = new Skills();  
		 
		 System.out.println(skl.Age); // from parent class
		 System.out.println(skl.Basketball); // from sub class 1
		 System.out.println(skl.SHSGraduated); // from sub class 2
		 System.out.println(skl.WhyCourse); // from sub class 3
		 System.out.println(skl.TertiarySchool); // from sub class 4
		 System.out.println(skl.personalSkill1); // from sub class 5
	}
	
	
}
