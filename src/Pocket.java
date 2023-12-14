import java.util.ArrayList;

class Pocket implements Storage{
    private ArrayList<String> pocket = new ArrayList<>();
    @Override
    public void addItem(String itemName) {
        //System.out.println("Added: " +itemName);
        this.pocket.add(itemName.toLowerCase());
    }

    @Override
    public void removeItem(String itemName) {
        //System.out.println("Removed: " + itemName);
        this.pocket.remove(itemName.toLowerCase());
    }

    @Override
    public void printItems() {
        System.out.println(pocket);
    }

    @Override
    public int getNumItems() {
       return this.pocket.size();
    }
}