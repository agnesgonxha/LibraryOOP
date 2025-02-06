public class Author {
    private String name;
    private String desc;

    public Author (String name, String desc){
        this.name = name;
        this.desc = desc;
    }

    public void setName (String name) {this.name = name;}
    public void setDesc (String desc) {this.desc = desc;}

    public String getName () {return name;}
    public String getDesc () {return desc;}
}
