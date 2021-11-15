public abstract class Media implements Element{
    protected String name;
    protected int dim;

    public Media(String name, int dim)
    {
        this.name = name;
        this.dim = dim;
    }
}
