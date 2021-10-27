class Cat extends Animal{

    Cat(String name) {
        super(name);

   }

    @Override
    protected String getKind() {
        return "Кошка";
    }
}
