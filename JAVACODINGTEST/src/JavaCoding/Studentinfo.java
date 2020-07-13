package JavaCoding;

public class Studentinfo implements Comparable<Studentinfo> {

private String Name;
private  int RegNo;
private  int Marks;
	
	
	
	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public int getRegNo() {
		return RegNo;
	}


	public void setRegNo(int regNo) {
		RegNo = regNo;
	}


	public int getMarks() {
		return Marks;
	}


	public void setMarks(int marks) {
		Marks = marks;
	}
	
	public  Studentinfo(String stuname, int stuRegNo,  int  stuMarks) {
		
		Name=stuname;
		RegNo=stuRegNo;
		Marks= stuMarks;
			
	}
	
public String toString() {
	return" Student[stuname="+Name+" stuRegNo =" + RegNo+" stuMarks="+ Marks+"]";
	
}
@Override
public int compareTo(Studentinfo Student2) {
	if(this.getMarks()>Student2.getMarks())
		return 1;
	return 0;
}
}

