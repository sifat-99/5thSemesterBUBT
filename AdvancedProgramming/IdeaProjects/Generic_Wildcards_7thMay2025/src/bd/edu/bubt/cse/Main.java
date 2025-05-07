package bd.edu.bubt.cse;

public class Main {


    public static void main(String[] args) {
        Person person = new Person("Sifat",21);
        EducatedPerson educatedPerson = new EducatedPerson("Sifat",21,"CSE");
        UneducatedPerson uneducatedPerson = new UneducatedPerson("Sifat",21,"Business");
        PhysicalLabour physicalLabour = new PhysicalLabour("Sifat",21,"Busienss","kjf64");
        Driver driver = new Driver("Sifat",21,"Driving","id123","Bmw");
       Rickshawpuller rickshawpuller = new Rickshawpuller("Sifat",21,"Rickshaw Pulling", "6463jfr","Mirpur");
       Enterpreuner enterpreuner = new Enterpreuner("Sifat",21,"CSE","Computers");
       JobHolder jobHolder = new JobHolder("Sifat",21,"CSE","IT farm");

        Farmer farmer = new Farmer("Sifat",21,"Crops","rice");

        drive(physicalLabour);
        drive(driver);
        drive(rickshawpuller);

        driveWithWildCard(new Men<>(person));
        driveWithWildCard(new Men<>(educatedPerson));
        driveWithWildCard(new Men<>(uneducatedPerson));
        driveWithWildCard(new Men<>(enterpreuner));
        driveWithWildCard(new Men<>(jobHolder));
        driveWithWildCard(new Men<>(farmer));

    }

    public static <T extends PhysicalLabour> void drive(T data){
        if(data.getLicenseId().length()>0){
            System.out.println("Can drive!!");
        }
        else{
            System.out.println("Can't");
        }
    }

    public static <T> void driveWithWildCard(Men<? super PhysicalLabour> man){
        System.out.println(man.getPerson());
    }



}
