public class URLcreator {
    private String URL;

    public URLcreator (String URL)
    {
        this.URL=URL;
    }

    public Element getElementWithURL() {
        String[] URLspl = URL.split("/");
        Element element = null;

        try {
            switch (URLspl[1]) {
                case "video" -> element = new Videoclip(URLspl[2], Integer.parseInt(URLspl[3]));
                case "melody" -> element = new Melodii(URLspl[2], Integer.parseInt(URLspl[3]));
                case "GIF" -> element = new GIF(URLspl[2], Integer.parseInt(URLspl[3]));
            }
        }
        catch (UnsupportedOperationException e) { e.printStackTrace(); }

        return element;
    }


}
