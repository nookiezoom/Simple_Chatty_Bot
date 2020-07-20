import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vacation vacation = new Vacation(scanner.nextInt(), scanner.nextInt(),
                scanner.nextInt(), scanner.nextInt());
        System.out.println(vacation.calculatePrice());
        scanner.close();
    }

    private static class Vacation {
        private int durationInDays;
        private int totalFoodCostPerDay;
        private int oneWayFlightCost;
        private int costOfOneNightInHotel;

        Vacation(int durationInDays, int totalFoodCostPerDay,
                 int oneWayFlightCost, int costOfOneNightInHotel) {
            this.durationInDays = durationInDays;
            this.totalFoodCostPerDay = totalFoodCostPerDay;
            this.oneWayFlightCost = oneWayFlightCost;
            this.costOfOneNightInHotel = costOfOneNightInHotel;
        }

        public int getDurationInDays() {
            return durationInDays;
        }

        public void setDurationInDays(int durationInDays) {
            this.durationInDays = durationInDays;
        }

        public int getTotalFoodCostPerDay() {
            return totalFoodCostPerDay;
        }

        public void setTotalFoodCostPerDay(int totalFoodCostPerDay) {
            this.totalFoodCostPerDay = totalFoodCostPerDay;
        }

        public int getOneWayFlightCost() {
            return oneWayFlightCost;
        }

        public void setOneWayFlightCost(int oneWayFlightCost) {
            this.oneWayFlightCost = oneWayFlightCost;
        }

        public int getCostOfOneNightInHotel() {
            return costOfOneNightInHotel;
        }

        public void setCostOfOneNightInHotel(int costOfOneNightInHotel) {
            this.costOfOneNightInHotel = costOfOneNightInHotel;
        }

        public int calculatePrice() {
            return 2 * oneWayFlightCost
                    + durationInDays * totalFoodCostPerDay
                    + (durationInDays - 1) * costOfOneNightInHotel;
        }
    }
}