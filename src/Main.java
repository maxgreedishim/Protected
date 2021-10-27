public class Main {

    public static void main(String[] args) {
	    Animal animal1 = new Cat("Мурка");
        animal1.kind = "Кот";
        Animal animal2 = new Dog("Князь");
        animal2.kind = "Пёс";
        System.out.println(animal1);
        System.out.println(animal2);
        Animal animal3 = (Animal)animal1;
        Animal animal4 = new Animal("Горыныч") { // анонимный класс созданный по "месту".
            @Override
            protected String getKind() {
                return "Змей";
            }
        };
        System.out.println(new Animal());
        System.out.println(animal4);
        System.out.println(animal3.getClass().getName());
        System.out.println(animal4.getClass().getName());

    }
}
