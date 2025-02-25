package lab.assignment.after;

public abstract class CoffeeTemplate {

    public final void prepareCoffee() {
        boilWater();
        brewEspresso();
        addIngredients();
        finalTouch();
        System.out.println(">>Serving Coffee");
    }

    private void boilWater() {
        System.out.println("Boiling Water");
    }

    private void brewEspresso() {
        System.out.println("Brewing Espresso");
    }

    protected abstract void addIngredients();

    protected abstract void finalTouch();

}
