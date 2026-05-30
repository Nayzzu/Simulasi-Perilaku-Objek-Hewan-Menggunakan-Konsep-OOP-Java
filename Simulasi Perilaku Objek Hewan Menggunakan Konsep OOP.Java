# Simulasi-Perilaku-Objek-Hewan-Menggunakan-Konsep-OOP-Javaclass Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println(name + " membuat suara hewan pada umumnya.");
    }
}

class Dog extends Animal {

    public Dog(String name) {
        super(name); 
    }

    @Override
    public void makeSound() {
        System.out.println(name + " menggonggong: Guk guk!");
    }
    
    public void fetchBola() {
        System.out.println(name + " sedang berlari mengambil bola.");
    }
}

class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " mengeong: Miaw miaw!");
    }
}

class Elang extends Animal {

    public Elang(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " memekik: Kiiiyeek!");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("=== IMPLEMENTASI INHERITANCE ===");
        Dog myDog = new Dog("Buddy");
        Cat myCat = new Cat("Luna");
        Elang myElang = new Elang("Garuda");
        
        myDog.makeSound();
        myDog.fetchBola();
        myCat.makeSound();
        myElang.makeSound();

        System.out.println("\n=== IMPLEMENTASI POLYMORPHISM DENGAN UPCASTING ===");
        Animal hewanPertama = new Dog("Max");
        Animal hewanKedua = new Cat("Milo");
        Animal hewanKetiga = new Elang("Rajawali");

        hewanPertama.makeSound();
        hewanKedua.makeSound();
        hewanKetiga.makeSound();
    }
}