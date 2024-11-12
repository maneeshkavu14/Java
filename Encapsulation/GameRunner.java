package com.xworks.Encapsulation;

public class GameRunner {

	public static void main(String[] args) {
		
		Game game1 = new Game("Space Explorer", "Adventure", "PC", 49.99, 4.5, 2023,
                "Galactic Studios", "TopGames", true, 4, "Single-player", "Hard", true, 
                200, 3, 9000, "Epic Theme", true, 1500, "English, Spanish");

        Game game2 = new Game("Racing Legends", "Racing", "Xbox", 39.99, 4.2, 2022,
                "Speed Inc.", "RaceMaster", true, 8, "Multiplayer", "Medium", false, 
                180, 5, 12000, "High-Octane Beats", false, 2000, "English, French");
        
        
        System.out.println("Game 1");
        System.out.println("********************************");
        game1.displayDetails();
        
        
        
        
        System.out.println("********************************");
        System.out.println("Game 2");
        System.out.println("********************************");     
        game2.displayDetails();
        
        System.out.println("********************************");
        System.out.println("Updated Game 1 value");
        System.out.println("********************************");
        
        game1.setTitle("World Explorer");
        game1.setPlatform("Mobile");
        game1.setReleaseYear(2024);
        
        System.out.println("Updated Title :"+game1.getTitle());
        System.out.println("Updated Platform :"+game1.getPlatform());
        System.out.println("Updated Year :"+game1.getReleaseYear());
        
        
        System.out.println("********************************");
        System.out.println("Updated Game 2 value");
        System.out.println("********************************");
        
        
        game2.setTitle("Adventure Explorer");
        game2.setPlatform("PC");
        game2.setReleaseYear(2025);
        game2.setPrice(10000);
        
        
        System.out.println("Updated Title :"+game2.getTitle());
        System.out.println("Updated Platform :"+game2.getPlatform());
        System.out.println("Updated Year :"+game2.getReleaseYear());
        System.out.println("Updated Price :"+game2.getPrice());
	}

}
