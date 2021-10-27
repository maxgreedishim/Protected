class Animal {
    private String name;
    protected String kind;

    Animal(String name) {
      this.name = name;
    }

    Animal() {
        this.name = "без имени";
    }

    protected String getKind(){
     return "Животное";
    }
    @Override
    public String toString (){
        return String.format("%s %s !!!", getKind(), this.name);

    }

}
