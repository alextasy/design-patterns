package Observer;

public class Dwarf implements Observer {
    private Observable subscription;
    private String name;

    public Dwarf(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        if(this.subscription == null) {
            System.out.println("Dwarf(" + this.name + ") hasn't subscribed to the Magic Board");
            return;
        }
        String currentToy = this.subscription.getUpdate();
        System.out.println(this.name + " will go get a " + currentToy);
    }

    @Override
    public void setSubscription(Observable obs) {
        this.subscription = obs;
    }
}
