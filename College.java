class College{
	public static void main(String[] args){
		Student s1 = new Student();
		
		System.out.println("s1.sno\t\t: "+ s1.sno);
		System.out.println("s1.sname\t: "+ s1.sname);
		System.out.println("s1.course\t: "+ s1.course);
		System.out.println("s1.fee\t\t: "+ s1.fee);
		
		s1.sno		= 101;
		s1.sname	= "Sakshi";
		s1.course	= "CJ";
		s1.fee		= 3500;

		System.out.println("s1.sno\t\t: "+ s1.sno);
		System.out.println("s1.sname\t: "+ s1.sname);
		System.out.println("s1.course\t: "+ s1.course);
		System.out.println("s1.fee\t\t: "+ s1.fee);
		
	}
}
