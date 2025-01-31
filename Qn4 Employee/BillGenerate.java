public class BillGenerate {
    //members

    int consumerNumber;
    String consumerName;
    double previousMonthReading;
    double currentMonthReading;
    String connectionType;


    //Constructor
    public BillGenerate(int consumerNumber, String consumerName, double previousMonthReading, double monthReading, String connectionType) {
        this.consumerNumber = consumerNumber;
        this.consumerName = consumerName;
        this.previousMonthReading = previousMonthReading;
        this.currentMonthReading = previousMonthReading;
        this.connectionType = connectionType;
    }

    //Logic for the tariff

    public double calculateBill() {
        double billConsumed = previousMonthReading - currentMonthReading;
        double usedAmount = 0.0;

        if (connectionType.equalsIgnoreCase("Domestic")) {
            if (billConsumed <= 100) {
                usedAmount = billConsumed * 0.1;
            } else if (billConsumed > 100 && billConsumed <= 200) {
                usedAmount = billConsumed * 2.5;
            } else if (billConsumed > 200 && billConsumed <= 500) {
                usedAmount = billConsumed * 0.4;
            } else if (billConsumed == 501) {
                usedAmount = billConsumed * 0.6;
            } else if (connectionType.equalsIgnoreCase("Commercial")) {
                if (billConsumed <= 100) {
                    usedAmount = billConsumed * 0.2;
                } else if (billConsumed > 100 && billConsumed <= 200) {
                    usedAmount = billConsumed * 4.5;
                } else if (billConsumed > 200 && billConsumed <= 500) {
                    usedAmount = billConsumed * 0.6;
                } else if (billConsumed == 501) {
                    usedAmount = billConsumed * 0.7;
                }
            }

        }
        return usedAmount;
    }

    public void display(){
        System.out.println("Consumer Number: " + consumerNumber);
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("ConnectionType: " + connectionType);
        System.out.println("Bill Consumed: GHC " + calculateBill());
    }

}