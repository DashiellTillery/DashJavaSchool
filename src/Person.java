class Person {
    String name;
    static int id;
    int sectionCount = 0;
    public Person(String name){
        this.name = name;
        this.id = id;
        id++;
    }

    public String getName() {

        return name;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public void setName(String name) {

        this.name = name;
    }
}
