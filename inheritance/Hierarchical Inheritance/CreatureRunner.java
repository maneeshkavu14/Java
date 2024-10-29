public class CreatureRunner {
    public static void main(String[] args) {
        Terrestrial terrestrialAnimal = new Terrestrial();
        terrestrialAnimal.name = "Elephant";
        terrestrialAnimal.age = 10;
        terrestrialAnimal.habitat = "Rainforest";
        terrestrialAnimal.weight = 6000.0;
        terrestrialAnimal.averageLifespan = 60;
        terrestrialAnimal.dietType = "Herbivore";

        System.out.println("Terrestrial Animal Details:");
        System.out.println("Name: " + terrestrialAnimal.name);
        System.out.println("Age: " + terrestrialAnimal.age);
        System.out.println("Habitat: " + terrestrialAnimal.habitat);
        System.out.println("Weight: " + terrestrialAnimal.weight + " kg");
        System.out.println("Average Lifespan: " + terrestrialAnimal.averageLifespan + " years");
        System.out.println("Diet Type: " + terrestrialAnimal.dietType);
        
        terrestrialAnimal.eat();
        terrestrialAnimal.communicate();

        Avian avian = new Avian();
        avian.name = "Sparrow";
        avian.age = 2;
        avian.habitat = "Urban Areas";
        avian.featherColor = "Brown";
        avian.beakLength = 1.5;
        avian.migrates = true;

        System.out.println("\nAvian Details:");
        System.out.println("Name: " + avian.name);
        System.out.println("Age: " + avian.age);
        System.out.println("Habitat: " + avian.habitat);
        System.out.println("Feather Color: " + avian.featherColor);
        System.out.println("Beak Length: " + avian.beakLength + " cm");
        System.out.println("Migrates: " + (avian.migrates ? "Yes" : "No"));
        
        avian.eat();
        avian.chirp();

        Aquatic aquaticAnimal = new Aquatic();
        aquaticAnimal.name = "Goldfish";
        aquaticAnimal.age = 1;
        aquaticAnimal.habitat = "Freshwater";
        aquaticAnimal.species = "Carassius";
        aquaticAnimal.isCarnivore = false;

        System.out.println("\nAquatic Animal Details:");
        System.out.println("Name: " + aquaticAnimal.name);
        System.out.println("Age: " + aquaticAnimal.age);
        System.out.println("Habitat: " + aquaticAnimal.habitat);
        System.out.println("Species: " + aquaticAnimal.species);
        System.out.println("Carnivore: " + (aquaticAnimal.isCarnivore ? "Yes" : "No"));
        
        aquaticAnimal.eat();
        aquaticAnimal.swimFast();
    }
}