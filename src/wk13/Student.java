package wk13;

public class Student implements Cloneable {
    private String lastname;
    private String firstname;
    final private int id;

    private Address address;

    private static int studentCount = 0;

    public Student(String name, Address address) {
        String[] names = name.split(" ");
        if (names.length != 2) {
            throw new IllegalArgumentException("Name must be \"Firstname Lastname\"" +
                    " with only one space between first and last names");
        }
        id = studentCount++;
        firstname = names[0];
        lastname = names[1];
        this.address = address;
    }

    public Object clone() {
        Student student = null;
        try {
            student = (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            student = new Student(this);
        }
        student.address = (Address) this.address.clone();
        return student;
    }


    public Student(Student student) {
        firstname = new String(student.firstname);
        lastname = new String(student.lastname);
        id = student.id;
        address = new Address(student.getAddress().getStreet(),
                student.getAddress().getCity(), student.getAddress().getZipcode());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    public String getName() {
        return firstname + " " + lastname;
    }

    public String setName(String name) {
        String[] names = name.split(" ");
        if (names.length != 2) {
            throw new IllegalArgumentException("Name must be \"Firstname Lastname\"" +
                    " with only one space between first and last names");
        }
        String oldName = getName();
        firstname = names[0];
        lastname = names[1];
        return oldName;
    }

    public Address getAddress() {
        return address;
    }

    public Address setAddress(Address address) {
        Address oldAddress = getAddress();
        this.address = address;
        return oldAddress;
    }

    @Override
    public String toString() {
        return lastname + ", " + firstname + " (" + id + ")\n" +
                address;
    }
}
