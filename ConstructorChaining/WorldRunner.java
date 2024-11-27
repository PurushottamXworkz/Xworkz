class WorldRunner{
    public static void main(String[] args) {
        World w1 = new World();
        System.out.println("--------------------------------------");
        World w2 = new World("India");
        System.out.println("--------------------------------------");
        World w3 = new World("India", 29);
        System.out.println("--------------------------------------");
        World w4 = new World("United Kingdom", 4, "London");
        System.out.println("--------------------------------------");
        World w5 = new World("Germany", 16, "Berlin", 100);
        System.out.println("--------------------------------------");
        World w6 = new World("Netherlands", 12, "Amsterdam", 100, "Mark Rutte");
        System.out.println("--------------------------------------");
        World w7 = new World("India", 29, "New Delhi", 100, "N Modi", 1400000000);
  
      
    }

}