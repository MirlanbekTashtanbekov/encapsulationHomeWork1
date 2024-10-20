import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private long id;
    private String address;

    public Person(){
    }

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public String getFirstName(String firstName){
        this.firstName=firstName;
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public String getLastName(String lastName){
        this.lastName=lastName;
        return lastName;
    }
    public void setDateOfBirth(LocalDate dateOfBirth){
        this.dateOfBirth=dateOfBirth;
    }
    public LocalDate getDateOfBirth(LocalDate dateOfBirth){
        this.dateOfBirth=dateOfBirth;
        return dateOfBirth;
    }
    public void setId(long id){
        this.id=id;
    }
    public long getId(long id){
        this.id=id;
        return id;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public String getAddress(String address){
        this.address=address;
        return address;
    }

    @Override
    public String toString() {
        return "\n" +
                "\nPerson: " +
                "\nFirst name: " + firstName +
                "\nLast name: " + lastName +
                "\nDate of birth: " + dateOfBirth +
                "\nId: " + id +
                "\nAddress: " + address ;
    }
}
