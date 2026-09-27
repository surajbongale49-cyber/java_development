public class Count_vowel{
    public static void main(String[] args){
        String ch="aeiouhdsahjhoeuruweaaeeoouufsnvuvuruthgjsyurajranmraiobongake";
         int count=0;
        for(int i=0;i<ch.length();i++){
            char x=ch.charAt(i);
            if(x=='a' || x=='e'  || x=='i'  || x=='o'  || x=='u'){
                count++;
            }

        }
        System.out.println("The total no of vowel present in the String is :"+count);
    }
}
