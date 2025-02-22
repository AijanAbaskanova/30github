class Person {
    // Attributes of the class
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Creating an object of the class
        Person person1 = new Person("Alice", 25);

        // Calling the method to display details
        person1.displayInfo();
    }
}
