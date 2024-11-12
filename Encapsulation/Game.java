package com.xworks.Encapsulation;

public class Game {
    private String title;
    private String genre;
    private String platform;
    private double price;
    private double rating;
    private int releaseYear;
    private String developer;
    private String publisher;
    private boolean isMultiplayer;
    private int maxPlayers;
    private String gameMode;
    private String difficultyLevel;
    private boolean isOnline;
    private int gameDuration; 
    private int currentLevel;
    private int highScore;
    private String soundtrack;
    private boolean hasDLC; 
    private int downloadSize;
    private String supportedLanguages;
    
    
    
	public Game(String title, String genre, String platform, double price, double rating, int releaseYear,
			String developer, String publisher, boolean isMultiplayer, int maxPlayers, String gameMode,
			String difficultyLevel, boolean isOnline, int gameDuration, int currentLevel, int highScore,
			String soundtrack, boolean hasDLC, int downloadSize, String supportedLanguages) {
		
		this.title = title;
		this.genre = genre;
		this.platform = platform;
		this.price = price;
		this.rating = rating;
		this.releaseYear = releaseYear;
		this.developer = developer;
		this.publisher = publisher;
		this.isMultiplayer = isMultiplayer;
		this.maxPlayers = maxPlayers;
		this.gameMode = gameMode;
		this.difficultyLevel = difficultyLevel;
		this.isOnline = isOnline;
		this.gameDuration = gameDuration;
		this.currentLevel = currentLevel;
		this.highScore = highScore;
		this.soundtrack = soundtrack;
		this.hasDLC = hasDLC;
		this.downloadSize = downloadSize;
		this.supportedLanguages = supportedLanguages;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getGenre() {
		return genre;
	}



	public void setGenre(String genre) {
		this.genre = genre;
	}



	public String getPlatform() {
		return platform;
	}



	public void setPlatform(String platform) {
		this.platform = platform;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		if(price>0 & price<2000) {
			this.price = price;
		}
		
	}



	public double getRating() {
		return rating;
	}



	public void setRating(double rating) {
		this.rating = rating;
	}



	public int getReleaseYear() {
		return releaseYear;
	}



	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}



	public String getDeveloper() {
		return developer;
	}



	public void setDeveloper(String developer) {
		this.developer = developer;
	}



	public String getPublisher() {
		return publisher;
	}



	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}



	public boolean isMultiplayer() {
		return isMultiplayer;
	}



	public void setMultiplayer(boolean isMultiplayer) {
		this.isMultiplayer = isMultiplayer;
	}



	public int getMaxPlayers() {
		return maxPlayers;
	}



	public void setMaxPlayers(int maxPlayers) {
		this.maxPlayers = maxPlayers;
	}



	public String getGameMode() {
		return gameMode;
	}



	public void setGameMode(String gameMode) {
		this.gameMode = gameMode;
	}



	public String getDifficultyLevel() {
		return difficultyLevel;
	}



	public void setDifficultyLevel(String difficultyLevel) {
		this.difficultyLevel = difficultyLevel;
	}



	public boolean isOnline() {
		return isOnline;
	}



	public void setOnline(boolean isOnline) {
		this.isOnline = isOnline;
	}



	public int getGameDuration() {
		return gameDuration;
	}



	public void setGameDuration(int gameDuration) {
		this.gameDuration = gameDuration;
	}



	public int getCurrentLevel() {
		return currentLevel;
	}



	public void setCurrentLevel(int currentLevel) {
		this.currentLevel = currentLevel;
	}



	public int getHighScore() {
		return highScore;
	}



	public void setHighScore(int highScore) {
		this.highScore = highScore;
	}



	public String getSoundtrack() {
		return soundtrack;
	}



	public void setSoundtrack(String soundtrack) {
		this.soundtrack = soundtrack;
	}



	public boolean isHasDLC() {
		return hasDLC;
	}



	public void setHasDLC(boolean hasDLC) {
		this.hasDLC = hasDLC;
	}



	public int getDownloadSize() {
		return downloadSize;
	}



	public void setDownloadSize(int downloadSize) {
		this.downloadSize = downloadSize;
	}



	public String getSupportedLanguages() {
		return supportedLanguages;
	}



	public void setSupportedLanguages(String supportedLanguages) {
		this.supportedLanguages = supportedLanguages;
	}
    
		  // Methods
	
    public void displayGameDetails() {
        System.out.println("Game: " + title + " | Genre: " + genre + " | Platform: " + platform);
    }

    public void updateHighScore(int newScore) {
        if (newScore > highScore) {
            highScore = newScore;
            System.out.println("New high score: " + highScore);
        } else {
            System.out.println("Score " + newScore + " did not beat the high score.");
        }
    }

    public void playGame() {
        System.out.println("Playing " + title + " on " + platform);
    }
    
    
    public void displayDetails() {
    	
    	System.out.println("Title : "+title);
    	System.out.println("Genre :"+genre);
    	System.out.println("Platform :"+platform);
    	System.out.println("Price :"+price);
    	System.out.println("Rating :"+rating);
    	System.out.println("ReleaseYear :"+releaseYear);
    	System.out.println("Developer :"+developer);
    	System.out.println("publisher :"+publisher);
    	System.out.println("isMultiplayer :"+isMultiplayer);
    	System.out.println("maxPlayers :"+maxPlayers);
    	System.out.println("gameMode :"+gameMode);
    	System.out.println("difficultyLevel :"+difficultyLevel);
    	System.out.println("isOnline :"+isOnline);
    	System.out.println("gameDuration :"+gameDuration);
    	System.out.println("currentLevel :"+currentLevel);
    	System.out.println("highScore :"+highScore);
    	System.out.println("soundtrack :"+soundtrack);
    	System.out.println("hasDLC :"+hasDLC);
    	System.out.println("downloadSize :"+downloadSize);
    	System.out.println("supportedLanguages :"+supportedLanguages);
    	
   
    }
}


