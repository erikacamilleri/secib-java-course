package upper.lesson04;

public class Main {
    
    public static void main(String[] args) {
        // Create two instances of Sales personnel
        Sales[] juniorSales = new Sales[100];
        SalesPersonnel juniorSalesPerson = new SalesPersonnel("Erika Briffa", juniorSales, 0);

        // imagine i loaded sales data
        Sales[] superiorSales = new Sales[100];
        SalesPersonnel superiorSalesPerson = new SalesPersonnel("Mike's Dad", superiorSales, superiorSales.length);



        SalesPersonnel[] salesPeople = new SalesPersonnel[6];
        salesPeople[0] = new SalesPersonnel("100");
        salesPeople[1] = new SalesPersonnel("101");
        salesPeople[2] = new SalesPersonnel("102");
        salesPeople[0].setSalesHistory(new Sales("A100",300.00,10));
        salesPeople[0].setSalesHistory(new Sales("A200",1000.00,2));
        salesPeople[1].setSalesHistory(new Sales("A300",2550.40,10));
        System.out.println(salesPeople[2].getId());
        System.out.println(salesPeople[0].getCount());
        // System.out.println(salesPeople[1].getSalesHistory(0).getValue());
        System.out.println(salesPeople[0].calcTotalSales());
    }

    // input, process, output
    // input - parameters in the ()
    // output - return and the type
    // process - anything in between input and output
    public static String highest(SalesPersonnel[] salesPeople) {
        String highestId = "";
        double highestTotalValue = -1.0;
        for(int i = 0; i < salesPeople.length; i++) {
           SalesPersonnel sp = salesPeople[i];
           double totalSales = sp.calcTotalSales();
           if (totalSales > highestTotalValue) {
                highestTotalValue = totalSales;
                highestId = sp.getId();
           }
        }
        return highestId;
    }
}
