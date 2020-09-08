package project001.cystudy.spring5.fondamental;

public class Order {

    private String oname;
    private String adress;
    private String plus;

    public void setOname(String oname) {
        this.oname = oname;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setPlus(String plus) {
        this.plus = plus;
    }

    public void orderTest(){
        System.out.println(this.oname + this.adress + this.plus);
    }
}
