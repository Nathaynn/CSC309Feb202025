package lab.assignment.after;

public class MochaCoffee extends CoffeeTemplate {

    @Override
    public void addIngredients() {
        System.out.println("Adding cocoa powder");
        System.out.println("Adding hot milk");
    }

    @Override
    protected void finalTouch() {
        System.out.println("Adding sugar");
    }


}
