import java.util.concurrent.TimeUnit;

public class GIF extends Media {
    public GIF(String name, int dim) {
        super(name, dim);

        try
        {
            TimeUnit.SECONDS.sleep(1);
        }
        catch( InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void print() {
        System.out.println("GIF " + this.name + "size " + this.dim + "kb");
    }
}
