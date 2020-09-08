package project002.cystudy.spring5.bean;

public class Orders {

    private String oname;

    public Orders() {
        System.out.println("first step ,construct orders");
    }

    public void setOname(String oname) {
        this.oname = oname;
        System.out.println("second step :function call");
    }

    public void initMethod(){
        System.out.println("third step: initialized method");
    }

    public void destroyMethod(){
        System.out.println("fiveth step: destroyMethod method");
    }


}
