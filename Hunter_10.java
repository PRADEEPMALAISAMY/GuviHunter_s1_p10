import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Hunter_10 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int ak = sc.nextInt();
	int akm=sc.nextInt();
	Integer arr[] = new Integer[ak];
	Integer ar[] = new Integer[akm];
	int count=0;
	
	for (int i = 0; i < arr.length; i++) {
		arr[i] = sc.nextInt();
	}
	
	for (int i = 0; i < ar.length; i++) {
		ar[i] = sc.nextInt();
	}
		ArrayList arl=new ArrayList<>(Arrays.asList(arr));
		ArrayList al=new ArrayList<>(Arrays.asList(ar));
		
	if(arl.containsAll(al)) {
		System.out.println("YES");
	}
	else {
		System.out.println("NO");
	}
    }
}
