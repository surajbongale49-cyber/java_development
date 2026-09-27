public class concatination {
    public static void main(String[] args){
        String first_Name="Suraj";
        String Last_Name="Bongale";
        String fullname=first_Name+Last_Name;
        System.out.println(fullname);
        String Newname=first_Name+" "+Last_Name;
        System.out.println(Newname);
        System.out.println("The length of the String is "+Newname.length());
        for(int i=0;i<fullname.length();i++){
            System.out.print(fullname.charAt(i)+" ");
        }
    }

}
