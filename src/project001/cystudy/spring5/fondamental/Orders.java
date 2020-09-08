package project001.cystudy.spring5.fondamental;

public class Orders {

    private String oname;
    private String adress;

    public Orders(String oname, String adress) {
        this.oname = oname;
        this.adress = adress;
    }

    public void setOname(String oname) {
        this.oname = oname;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void orderTest(){
        System.out.println(this.oname + this.adress);
    }
}
