import java.util.concurrent.TimeUnit;

public class Videoclip extends Media {

    public Videoclip(String name, int dim) {
        super(name, dim);

        try
        {
            TimeUnit.SECONDS.sleep(5);
        }
        catch( InterruptedException e)
        {
            e.printStackTrace();
        }

    }

    @Override
    public void print() {
        System.out.println("Videoclip " + this.name + "size " + this.dim + "kb");
    }
}
