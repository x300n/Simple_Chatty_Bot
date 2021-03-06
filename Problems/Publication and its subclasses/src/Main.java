class Publication {

    private String title;

    public Publication(String title) {

        this.title = title;
    }

    public final String getInfo() {
        return getType() + getDetails();
    }

    public String getType() {

        return "Publication: ";
    }

    public String getDetails() {

        return this.title;
    }

}

class Newspaper extends Publication {

    private String source;

    public Newspaper(String title, String source) {
        super(title);
        this.source = source;
    }

    public String getSource() {
        return this.source;
    }

    public String getType() {
        return "Newspaper ";
    }

    public String getDetails() {
        return String.format("(source - %s): %s", this.getSource(), super.getDetails());
    }

}

class Article extends Publication {

    private String author;

    public Article(String title, String author) {
        super(title);
        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getType() {
        return "Article ";
    }

    public String getDetails() {
        return String.format("(author - %s): %s", this.getAuthor(), super.getDetails());
    }

}

class Announcement extends Publication {

    private int daysToExpire;

    public Announcement(String title, int daysToExpire) {
        super(title);
        this.daysToExpire = daysToExpire;
    }

    public int getDaysToExpire(){
        return this.daysToExpire;
    }

    public String getType() {
        return "Announcement ";
    }

    public String getDetails() {
        return String.format("(days to expire - %d): %s", this.getDaysToExpire(), super.getDetails());
    }
}