import java.util.concurrent.TimeUnit;

public class Melodii extends Media {
    public Melodii(String name, int dim) {
        super(name, dim);

        try
        {
            TimeUnit.SECONDS.sleep(3);
        }
        catch( InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void print() {
        System.out.println("Melodie " + this.name + "size " + this.dim + "kb");
    }
}
