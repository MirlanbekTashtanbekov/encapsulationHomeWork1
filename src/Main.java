import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //TODO University
        University university1 = new University();
        university1.setName("Дипломатическая академия");
        university1.setDirector("КЫЛЫЧЕВ АКЫЛБЕК МУКАЕВИЧ");
        university1.setCreateDate(LocalDate.of(2001,6,12));
        university1.setAddress("г.Бишкек, ул.Эркиндик № 36");
        university1.setPhone("0(312) 66-01-85");

        University university2 =new University();
        university2.setName("Кыргызский национальный университет");
        university2.setDirector("Садыков Канат Жалилович");
        university2.setCreateDate(LocalDate.of(1932,5,10));
        university2.setAddress("г. Бишкек, ул. Фрунзе - 547");
        university2.setPhone("0(312) 32-33-94");

        University university3= new University();
        university3.setName("Академия МВД КР");
        university3.setDirector("Абитов Тариель Таштанович");
        university3.setCreateDate(LocalDate.of(2000,3,15));
        university3.setAddress("г. Бишкек, ул. Чокана Валиханова");
        university3.setPhone("0(312)630889");

        University [] universities = {university1, university2, university3};
        System.out.println("~~~~~~~Info University~~~~~~~");
        System.out.println(Arrays.toString(universities));
        System.out.println(" ");

        //TODO School
        School school1 = new School();
        school1.setName("Школа-гимназия № 64");
        school1.setDirector("Белегенова Чынаркул Джакыпековна");
        school1.setQuantityChildren(2901);
        school1.setAddress("г. Бишкек ул. Т. Саманчина 1/1");
        school1.setPhone("+996 (312) 57-14-39");

        School school2=new School();
        school2.setName("Школа-гимназия № 33");
        school2.setDirector("Ашымова Таалайкул Тилебалдиевна");
        school2.setQuantityChildren(2505);
        school2.setAddress("г. Бишкек ул. Тоголок Молдо, 73");
        school2.setPhone("0(312) 37-45-80");

        School school3= new School();
        school3.setName("Средняя общеобразовательная школа №27");
        school3.setDirector("Алимбекова Анаргуль Исраиловна");
        school3.setQuantityChildren(1448);
        school3.setAddress("г. Бишкек ул.Раззакова 102");
        school3.setPhone("+996 (312) 66‒32‒52");

        School[] schools= {school1, school2, school3};
        System.out.println("~~~~~~~Info School~~~~~~~");
        System.out.println(Arrays.toString(schools));
        System.out.println(" ");

        //TODO Car
        Car car1 = new Car();
        car1.setBrand("Hyundai");
        car1.setModel("Grandeur");
        car1.getYear(2018);
        car1.setColor("Black");
        car1.setPrice(13500);

        Car car2 = new Car();
        car2.setBrand("BMW");
        car2.setModel("X7");
        car2.setYear(2022);
        car2.setColor("Black");
        car2.setPrice(45000);

        Car car3 = new Car();
        car3.setBrand("Subaru");
        car3.setModel("Legacy");
        car3.setYear(2003);
        car3.setColor("Blue");
        car3.setPrice(7500);

        Car car4 = new Car();
        car4.setBrand("Mercedes");
        car4.setModel("G-class");
        car4.setYear(2024);
        car4.setColor("White");
        car4.setPrice(120000);

        Car [] cars={car1,car2,car3,car4};
        System.out.println("~~~~~~CAR~~~~~~");
        System.out.println(Arrays.toString(cars));
        System.out.println(" ");

        Person person1 = new Person();
        person1.setFirstName("Mirlan");
        person1.setLastName("Tashtanbekov");
        person1.setDateOfBirth(LocalDate.of(1992,2,14));
        person1.setId(1L);
        person1.setAddress("Bishkek, 21-60");

        Person person2 = new Person();
        person2.setFirstName("Ilon");
        person2.setLastName("Mask");
        person2.setDateOfBirth(LocalDate.of(1971,6,28));
        person2.setId(2L);
        person2.setAddress("USA, Chicago");

        Person person3 = new Person();
        person3.setFirstName("Jeff");
        person3.setLastName("Bezoz");
        person3.setDateOfBirth(LocalDate.of(1964,1,12));
        person3.setId(3L);
        person3.setAddress("USA, Los-Angeles");

        Person person4 = new Person();
        person4.setFirstName("Bill");
        person4.setLastName("Gaits");
        person4.setDateOfBirth(LocalDate.of(1955,10,28));
        person4.setId(4L);
        person4.setAddress("USA, California");

        Person[] people={person1,person2,person3,person4};
        System.out.println("~~~~~~~Person~~~~~~~");
        System.out.println(Arrays.toString(people));
        System.out.println(" ");



    }
}