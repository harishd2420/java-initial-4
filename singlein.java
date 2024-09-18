
class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
 public class singlein{
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.makeSound(); 

        Cat myCat = new Cat();
        myCat.makeSound();
        Animal myPolymorphicCat = new Cat();
        myPolymorphicCat.makeSound(); 
    }
}
