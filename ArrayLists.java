import java.util.ArrayList;
import java.util.Scanner;
;public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> nameLists = new ArrayList<String>();
        ArrayList<Integer> ageLists = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Input family name: ");
            nameLists.add(sc.next());

            if (nameLists.get(i).equals("done")) {
                nameLists.remove("done");
                break;
            }

            else {
                System.out.println("Input age: ");
                ageLists.add(sc.nextInt());
            }

        }

        System.out.println(nameLists);
        System.out.println(ageLists);
        
        int youngest = 0;
        int oldest = 0;
        int n = ageLists.size();

        // minimum
        for (int j = 1; j < n; j++) {
            if (ageLists.get(j) < ageLists.get(youngest)) {
                youngest = j;                
            }
        }

        for (int k = 1; k < n; k++) {
            if (ageLists.get(k) > ageLists.get(oldest)) {
                oldest = k;
            }
        }

        System.out.println(ageLists.get(youngest));
        System.out.println(ageLists.get(oldest));
        System.out.println(nameLists.get(youngest));
        System.out.println(nameLists.get(oldest));

        sc.close();
    
    
    }   
        
}
