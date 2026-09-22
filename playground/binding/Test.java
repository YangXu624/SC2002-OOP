public class Test {
    public static void main(String[] args) {
        Animal a1 = new Cat(); // Reference type is Animal, object is Cat
        Cat a2 = new Cat();    // Reference type is Cat, object is Cat
        
        a2.print(a1);          // What does this output?
    }
}

class Animal {
    public void print(Animal a) {
        System.out.print("Animal");
    }
}

class Cat extends Animal {
    // Overloading: takes a Cat argument, whereas the parent takes an Animal
    public void print(Cat c) {
        System.out.print("Cat");
    }
}