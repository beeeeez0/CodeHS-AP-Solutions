public class Calculator {

    private double total;
    private double value;

    public Calculator(double startingValue){
        total = startingValue;
        value = 0;
    }



    /**
     * Adds the instance variable value to the total
     */
    public double add(double value){
        total += value;
        return total;
    }

    public double add() {
        total += value;
        return total;
    }

    public double subtract(double value){
        total -= value;
        return total;
    }

    public void setValue(double value){
        this.value = value;
    }

    public double getValue(){
        return this.value;
    }

}