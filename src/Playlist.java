import java.util.ArrayList;

public class Playlist implements Element{
    private String PlaylistName;
    private ArrayList<Element> elements;

    public Playlist(String PlaylistName){
        this.PlaylistName = PlaylistName;
        this.elements = new ArrayList<Element>();
    }

    public Playlist(String PlaylistName, ArrayList<Element> elements) {
        this.PlaylistName = PlaylistName;
        this.elements = elements;
    }

    public void add(Element element)
    {
        this.elements.add(element);
    }

    public void addPlaylistElement(String addURL) {
        URLcreator url = new URLcreator(addURL);
        this.elements.add(url.getElementWithURL());
    }

    @Override
    public void print() {
        System.out.println("Playlist" + this.PlaylistName);
        if(elements != null)
        {
            for (Element i : elements)
                i.print();
        }
    }
}
