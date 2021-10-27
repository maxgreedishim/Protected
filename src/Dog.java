class Dog extends Animal {

    Dog(String name) {
        super(name);
    }

    @Override
    protected String getKind() {
        return "Собака";
    }
}
