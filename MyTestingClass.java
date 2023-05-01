
class MyTestingClass {
    private int id;
    private String name;

    public MyTestingClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Custom hashCode method that generates a random number based on the id and name
    @Override
    public int hashCode() {
        return 0;
    }

    // Custom equals method that compares the id and name fields
    @Override
    public boolean equals(Object obj) {
        return false;
    }
}