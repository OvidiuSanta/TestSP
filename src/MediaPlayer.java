import java.util.ArrayList;


public class MediaPlayer {
    private String MPname;
    private ArrayList<Element> elements;

    public MediaPlayer(String MPname)
    {
        this.MPname = MPname;
        this.elements = new ArrayList<Element>();
    }

    public MediaPlayer(String MPname, ArrayList<Element> elements) {
        this.MPname = MPname;
        this.elements = elements;
    }

    public void addElement(Element element) {
        this.elements.add(element);
    }

    public void print() {
        System.out.println("MediaPlayer" + this.MPname);
        for (Element i: elements)
            i.print();
    }
}
