package JavaCoding;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;;

public class vachileTime {

	public static void main(String[] args) {
		List<VachileInfo>vahTime= new ArrayList<>();
		vahTime.add(new VachileInfo( 3314, "BMW",90));
		vahTime.add(new VachileInfo(3425,"Accura",100));
		vahTime.add(new VachileInfo(4536,"Toyota",60));
		vahTime.add(new VachileInfo(4892,"Honda", 78));
		vahTime.add(new VachileInfo(6609,"Nissan",96));
		
Comparator<VachileInfo>com= new Comparator<VachileInfo>() {
	public int compare(VachileInfo v1, VachileInfo v2) {
		if(v1.getMinutes()>v2.getMinutes())
			return 1;
		return -1;
	}
};
  
Collections.sort(vahTime,com);
for(VachileInfo si: vahTime) {
	System.out.println(si);
}


	}

}