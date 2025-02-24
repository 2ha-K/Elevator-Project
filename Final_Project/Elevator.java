package Final_Project;

import java.util.*;
public class Elevator {

    public static void display(LinkedList<ID> ll,int i) {//The function that display the linklist of collection of floors.
        for(int j=0; j < ll.get(i).IDP.size();j++) {
            System.out.println(j+1+". "+ll.get(i).IDP.get(j)+" F");
        }
    }
    LinkedList<ID> ll = new LinkedList<ID>();//Access linklist of ID class and new object ll.
    public void idp() {//idp main method.
        boolean temp = false;
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Welcome to set the user please choose the function you want to use.");
            System.out.println("1 : New User / 2 : Edit User / 3 : Remove User / 4 : leave");
            int menu = sc.nextInt();
            switch(menu) {//Using switch to make a menu.
                case 1://New a user.
                    System.out.println("For set a new user.");
                    ID id = new ID();//Access ID class and new object id.
                    System.out.println("Please enter your USER name");
                    Scanner sc4 = new Scanner(System.in);
                    id.setUSER(sc4.nextLine());//Call setUSER method.
                    System.out.println("Please enter your ID");
                    id.setID(sc4.nextLine());//Call setID method.
                    while(true) {
                        System.out.println("Please enter your FlOOR");
                        id.setF(sc.nextInt());//Call setF method.

                        System.out.println("Coutinue Y/N");
                        Scanner sc1 = new Scanner(System.in);
                        String tmp = sc1.nextLine();
                        if(tmp.equals("N")) {//A boolean to check print all input user data and break while loop or not.
                            System.out.println("This is the end of adding user:");
                            System.out.println("USER name:"+id.USER);
                            System.out.println("ID:"+id.ID);
                            System.out.println("Your floor:");
                            for(int f = 0;f<id.IDP.size();f++) {//Display the floors from object id.
                                System.out.println(f+1 +". "+id.IDP.get(f)+"F");
                            }
                            break;
                        }
                    }

                    ll.add(id);//Add object id into linklist ll.
                    break;
                case 2:
                    System.out.println("This is your setting:");
                    System.out.println("1 : add floor / 2 : remove floor");
                    int option = sc.nextInt();
                    switch(option) {
                        //The switch to determine add or remove options.
                        case 1://Add option.
                            Scanner sc2 = new Scanner(System.in);
                            System.out.println("Please enter your ID");
                            String a = sc2.next();

                            for(int i=0;i<ll.size();i++) {//The for loop to run over the linklist ll
                                if(a.equals(ll.get(i).ID)) {//The boolean that check linklist ll 's ID is equal to input.
                                    while(true) {

                                        System.out.println("Please enter your FlOOR");

                                        Scanner sc5 = new Scanner(System.in);
                                        ll.get(i).setF(sc5.nextInt());//Call setF method.
                                        display(ll,i);//Call display method.
                                        System.out.println(" ");
                                        System.out.println("Coutinue Y/N");
                                        Scanner sc1 = new Scanner(System.in);
                                        String tmp = sc1.nextLine();
                                        if(tmp.equals("N")) {//The boolean to break while loop.
                                            break;
                                        }
                                    }
                                }
                            }
                            break;
                        case 2://Remove option
                            Scanner sc9 = new Scanner(System.in);
                            System.out.println("Please enter your ID ");
                            String b = sc9.next();
                            for(int i=0;i<ll.size();i++) {//The for loop to run over the linklist ll
                                if(b.equals(ll.get(i).ID)) {//The boolean that check linklist ll 's ID is equal to input.
                                    while(true) {

                                        System.out.println("Please enter your FlOOR");

                                        Scanner sc5 = new Scanner(System.in);
                                        int c = sc5.nextInt();
                                        for(int j=0;j< ll.get(i).IDP.size();j++) {//The for loop to run over the linklist of floor.
                                            if(ll.get(i).IDP.get(j).equals(c)) {//The boolean that check floor in double linklist is equal to input.
                                                ll.get(i).delF(j);//Call delF method.
                                            }
                                        }
                                        display(ll,i);//Call display method.
                                        System.out.println(" ");
                                        System.out.println("Coutinue Y/N");
                                        Scanner sc1 = new Scanner(System.in);
                                        String tmp = sc1.nextLine();
                                        if(tmp.equals("N")) {//The boolean to break while loop.
                                            break;
                                        }
                                    }
                                }
                            }

                            break;
                    }
                    break;
                case 3:
                    System.out.println("Enter your ID to select the USER to delete");
                    Scanner sc10 = new Scanner(System.in);
                    String delnum = sc10.nextLine();
                    for(int v=0 ; v<ll.size();v++) {//The for loop to run over the linklist ll
                        if(ll.get(v).getID().equals(delnum)) {//The boolean that check linklist ll 's ID is equal to input.
                            ll.remove(v);//Remove User class from linklist ll.
                            System.out.println("You successfully delete user "+delnum);
                        }
                    }
                    break;
                default:
                    temp = true;
                    break;
            }
            if(temp)//The boolean to break while.
                break;
        }
    }
    public static class ID{
        String ID;
        String USER;
        LinkedList IDP = new LinkedList();//Access class linklist new object IDP.

        public void setID(String ID) {
            this.ID = ID;
        }

        public String getID() {
            return ID;
        }

        public void setUSER(String USER) {
            this.USER = USER;
        }

        public String getUSER() {
            return USER;
        }

        public void setF( int F ) {//The method to add floor into object IDP.
            IDP.add(F);
        }
        public void delF(int F) {//The method to remove floor from object IDP.
            IDP.remove(F);
        }
    }
}
