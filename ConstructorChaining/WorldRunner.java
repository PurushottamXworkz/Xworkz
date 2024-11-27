class WorldRunner{
    public static void main(String[] args) {
        World w1 = new World();
        World w2 = new World("India");
        World w3 = new World("India", 29);
        World w4 = new World("United Kingdom", 29, "London");
        World w5 = new World("Germany", 29, "Berlin", 100);
        World w6 = new World("Netherlands", 29, "Amsterdam", 100, "Mark Rutte");
        World w7 = new World("India", 29, "New Delhi", 100, "N Modi", 1400000000);
  
        // System.out.pritnln(w1);
        // System.out.pritnln(w2);
        // System.out.pritnln(w3);
        // System.out.pritnln(w4);
        // System.out.pritnln(w5);
        // System.out.pritnln(w6);
        // System.out.pritnln(w7);
    }

}