import java.util.ArrayList;


public class arrayListString {

	public static void main(String[] args) {
		ArrayList<String> arls= new ArrayList<String>();
		// menambahkan
		arls.add("FATMAWATI");
		arls.add("RAMLAH");
		arls.add("RUSMAN");
		System.out.println(arls);
		//menghapus
		arls.remove("RUSMAN");
		System.out.println(arls);
		
		ArrayList<String> arlS= (ArrayList<String>)arls.clone();
		arlS.add("WIRA");
		System.out.println("arls" +arls);
		System.out.println("arlS" +arlS);
		
		System.out.println("kosongkah:" + arls.isEmpty());
		if (arls.contains("RUSMAN"))
			System.out.println(" ada RUSMAN");
		else{
			System.out.println("tak ada RUSMAN");
		}
		System.out.println("arl1" +arls);
		System.out.println("arl2" +arlS);
			
	}

}
