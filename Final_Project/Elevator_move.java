package Final_Project;
import java.util.*;
public class Elevator_move {

    public static void main(String[] args) throws InterruptedException {
        Scanner IDP = new Scanner(System.in);

        int ele_og = 1;

        Elevator idp2 = new Elevator();
        while(true) {

            System.out.println("1.Elevator go up ( Type UP )");
            System.out.println("2.Elevator go down ( Type DOWN )");
            System.out.println("3.Setting User for permission ( Type SET )?");
            String mv = IDP.next();
            if(mv.equals("SET")){
                idp2.idp();
                continue;
            }else if(!mv.equals("UP")&&!mv.equals("DOWN")){
                System.out.println("Please choose the correct button.");
                continue;
            }

            System.out.println("Please enter your ID");
            Scanner IDP2 = new Scanner(System.in);
            String id = IDP2.next();
            boolean a = true;
            for(int i=0;i<idp2.ll.size();i++){
                if(id.equals(idp2.ll.get(i).ID)){
                    a = false;
                }
            }
            if(a){
                System.out.println("The user "+ id+" is not existing.");
                continue;
            }


            System.out.println("Choose Your Floor");
            int ele_f = IDP.nextInt();

//		boolean temp = false;
            for(int i=0;i<idp2.ll.size();i++) {
                if(id.equals(idp2.ll.get(i).ID)) {
                    for(int j=0;j<idp2.ll.get(i).IDP.size();j++) {
                        if(ele_f == (int)idp2.ll.get(i).IDP.get(j)) {
//						System.out.println("no permission");
                            if(mv.equals("UP")&& ele_f <ele_og) {
                                System.out.println(" Wrong Direction ! ");
                                continue;
                            }
                            else if(mv.equals("DOWN")&&ele_f>ele_og) {
                                System.out.println(" Wrong Direction ! ");
                                continue;
                            }
                            if(ele_f > ele_og) {
                                for( int k = ele_og ; k <= ele_f ; k++) {
                                    if(k==0)
                                        continue;
                                    System.out.println(k+" F ");
                                    Thread.sleep(800);
                                }
                            }
                            else {
                                for( int m = ele_og ; m >= ele_f ; m--) {
                                    if(m==0)
                                        continue;
                                    System.out.println(m+" F ");
                                    Thread.sleep(800);
                                }
                            }
                            ele_og = ele_f;
                            System.out.println("arrived "+ ele_f +"F");
//						temp =true;
                        }
//					if(temp) {
//						break ;
//					}
                    }
                }
//			if(temp)
//				break;
            }
//		if(temp)
//			continue;



        }
    }
}
