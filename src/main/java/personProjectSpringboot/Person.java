package personProjectSpringboot;

public class Person {
    private String firstName;
    private String lastName;
    private boolean udergraduate;
    private String job;
    private String degree;
    private int age;
    private int ID;

    public int getID() {
        return ID;
    }

    public Person() {
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isUdergraduate() {
        return udergraduate;
    }

    public void setUdergraduate(boolean udergraduate) {
        this.udergraduate = udergraduate;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
