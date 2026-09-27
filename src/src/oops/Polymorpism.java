public class Polymorpism {
    public static class Dog{
        void speak(){
            System.out.println("Bhau Bhau");
        }
    }
    public static class Cat{
        void speak(){
            System.out.println("Meow Meow");
        }
    }
    public static class Human{
        void speak(){
            System.out.println("Hello Hello");
        }
    }
    public static void main(String[] args){
        Dog d=new Dog();
        Cat c=new Cat();
        Human h=new Human();
        d.speak();
        c.speak();
        h.speak();
    }
}
