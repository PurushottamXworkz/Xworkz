class World{
    String country;
    int noOfStates;
    String capital;
    int totalCities;
    String nameOfPresident;
    int population;

    // Default constructor
    World() {
        System.out.println("This is Default constructor");
    }

    // Constructor 1
    World(String country) {
        this();
        this.country = country;
        System.out.println("Country "+ ":"+country);
    }

    // Constructor 2
    World(String country, int noOfStates) {
        this(country); 
        this.noOfStates = noOfStates;
        System.out.println("States "+ ":"+noOfStates);
    }

    // Constructor 3
    World(String country, int noOfStates, String capital) {
        this(country, noOfStates); 
        this.capital = capital;
         System.out.println("Capital "+ ":"+capital);
    }

    // Constructor 4
    World(String country, int noOfStates, String capital, int totalCities) {
        this(country, noOfStates, capital); 
        this.totalCities = totalCities;
         System.out.println("Total Cities "+ ":"+totalCities);
    }

    // Constructor 5
    World(String country, int noOfStates, String capital, int totalCities, String nameOfPresident) {
        this(country, noOfStates, capital, totalCities); 
        this.nameOfPresident = nameOfPresident;
         System.out.println("Name Of President "+ ":"+nameOfPresident);
    }

    // Constructor 6
    World(String country, int noOfStates, String capital, int totalCities, String nameOfPresident, int population) {
        this(country, noOfStates, capital, totalCities, nameOfPresident); 
        this.population = population;
         System.out.println("Population "+ ":"+population);
    }
}
