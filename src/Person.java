public class Person {
    private String name;
    private char gender;
    private int age;

    public Person(String name, char gender){
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return "[" + this.gender + "]" + this.name + " (" + this.age + ")";
    }

    
    
}
