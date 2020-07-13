package JavaCoding;



/* Write a java program to implement the fallowing Consider vehicle parking application  where each vehicle
 *  information which enters into the parking location stored in 2 lists. at the end * of each day these
   lists to be merged into single list and one vehicle information which has highest  parked hour should be retrieved,
    where each vehicle information has vehicle number, vehicle model, total duration parked in minutes.*/
public class VachileInfo  implements Comparable<VachileInfo> {

	private int number;
	private String model;
	private int minutes;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	public VachileInfo( int vehnum, String vehmodel, int time) {
		number=vehnum;
		model=vehmodel;
		this. minutes=time;	
		
		
	}
	
	public String toString() {
		return "Cars [ carNum= " + number + ", carModel = " + model + ",  Time= " + minutes+ "]";
}
	@Override
	public int compareTo(VachileInfo vichile) {
		// TODO Auto-generated method stub
		
	if(this.getMinutes()>vichile.getMinutes())
		return 1;
		return 0;
	}
}