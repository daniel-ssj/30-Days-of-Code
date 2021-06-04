class Result {
    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        // Write your code here
        double tip = (tip_percent * meal_cost) / 100;
        double tax = (tax_percent * meal_cost) / 100;
        System.out.println(Math.round(meal_cost + tip + tax));
    }
}
