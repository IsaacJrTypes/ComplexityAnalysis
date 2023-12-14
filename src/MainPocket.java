import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;

public class MainPocket {
    public static void main(String[] args) {
        MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();
        Pocket pocket = new Pocket();

        // Array to store items
        String[] items = {"cat", "dog", "bird", "taco", "fish", "burrito"};

        for (String item : items) {

            long memUsedBefore = memoryMXBean.getHeapMemoryUsage().getUsed();


            long startTime = System.nanoTime();
            pocket.addItem(item);
            long duration = System.nanoTime() - startTime;


            long memUsedAfter =  memoryMXBean.getHeapMemoryUsage().getUsed();


            long memoryUsedForItem = Math.subtractExact(memUsedAfter , memUsedBefore);
            System.out.println("mem before: "+ memUsedBefore);
            System.out.println("Time to add " + item + ": " + duration + " ns");
            System.out.println("Memory used for " + item + ": " + memoryUsedForItem + " bytes");
        }
    }
}