import javax.smartcardio.ATR;

public class School {

    private String name;
    private String director;
    private int quantityChildren;
    private String address;
    private String phone;

    public School(){
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(String name){
        this.name=name;
        return name;
    }
    public void setDirector(String director){
        this.director=director;
    }
    public String getDirector(String director){
        this.director=director;
        return director;
    }
    public void setQuantityChildren(int quantityChildren){
        this.quantityChildren=quantityChildren;
    }
    public int getQuantityChildren(int quantityChildren){
        this.quantityChildren=quantityChildren;
        return quantityChildren;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public String getAddress(String address){
        this.address=address;
        return address;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }
    public String getPhone(String phone){
        this.phone=phone;
        return phone;
    }

    @Override
    public String toString() {
        return "\n" +
                "\nSchool: " +
                "\nName: " + name +
                "\nDirector name: " + director +
                "\nQuantity Children: " + quantityChildren +
                "\nAddress: " + address +
                "\nPhone: " + phone ;
    }
}
