package movies;


public class Movie {
    private String name;

    private String category;

//    @Override
//    public String toString() {
//        return "Movie{" +
//                "name='" + name + '\'' +
//                ", category='" + category + '\'' +
//                '}';
//    }

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    @Override
    public String toString() {
        return name + "--" + category;
    }
//ancestors

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
