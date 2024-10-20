    import java.time.LocalDate;
    public class University {

    private String name;
    private String director;
    private LocalDate createDate;
    private String address;
    private String phone;

    public University(){
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
    public void setCreateDate(LocalDate createDate){
        this.createDate=createDate;
    }
    public LocalDate getCreateDate(LocalDate createDate) {
        this.createDate=createDate;
        return createDate;
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
                    "\nUniversity: " +
                    "\nName: " + name +
                    "\nDirector: " + director +
                    "\nCreate Date: " + createDate +
                    "\nAddress: " + address +
                    "\nPhone: " + phone ;
        }
    }
