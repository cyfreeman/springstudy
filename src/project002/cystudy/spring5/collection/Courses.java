package project002.cystudy.spring5.collection;

public class Courses {

    private String cname;

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "cname='" + cname + '\'' +
                '}';
    }
}
