package bd.edu.bubt.cse;

import bd.edu.bubt.individuals.*;

public class Application {

    public static void main(String[] args) {
	    Person genaralPerson = new Person("Jony", 23);
        EducatedPerson educatedPerson = new EducatedPerson("Arif", 24, "BSc in CSE");
        IlliteratePerson illiteratePerson = new IlliteratePerson("Kamrul", 25, "Hardware Builder");
        JobHolder jobHolder = new JobHolder("Shifat", 24, "BSc in CSE", "ABC Software Farm");
        Entrepreuner entrepreuner = new Entrepreuner("Nahid", 24, "BSc in CSE", 1000000);
        Farmer farmer = new Farmer("Nipa", 23, "Farming", "Paddy, Wheat");
        PhysicalLabour physicalLabour = new PhysicalLabour("Shahriyar Chowdhury", 24, "Physical work for earning wage","W-12345");
        Rickshawpuller rickshawpuller = new Rickshawpuller("Mridul", 23, "Rickshaw Pulling", "RP-1234", "Rupnagar");
        Driver driver = new Driver("Mithela", 23, "Truck driving", "DT-1234", "Truck");

        eat(genaralPerson);
        eat(educatedPerson);
        eat(illiteratePerson);
        eat(jobHolder);
        eat(entrepreuner);
        eat(farmer);
        eat(physicalLabour);
        eat(rickshawpuller);
        eat(driver);
        
        driveWithoutWildCard(physicalLabour);
        driveWithoutWildCard(rickshawpuller);
        driveWithoutWildCard(driver);

        Man<Rickshawpuller> man = new Man<Rickshawpuller>(rickshawpuller);
        driveWithWildCard(man);
        
        
    }

    public static <T> void eat(T person){
        System.out.println("person is eating");
    }


    public static <T extends PhysicalLabour> void driveWithoutWildCard(T person){
        System.out.println("vehicle is moving");
    }

    public static <Person> void driveWithWildCard(Man<? extends PhysicalLabour> man){
        System.out.println("vehicle is moving");
    }
}
