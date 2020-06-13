import java.util.ArrayList;
import java.util.List;

public class link {
	public static void main(String[] args) {
		List<Integer> li =new ArrayList<Integer>();
		li.add(5);
		li.add(10);
		li.add(15);
		li.add(12);
		
		System.out.println(0);
		for(int i=0;i<4;i++) {
			System.out.println(li.get(i));
		}
	}

}
