package OOP;

public class Item extends baba{
    String name;
    int price;
    float Hp;
    void legendary(){
        System.out.println("legendary");
    }
    float getHp(){
        return Hp;
    }
    void recovery(float blood){
        blood = blood +Hp;
    }

    public static void main(String[] args) {
        Item xueping = new Item();
        xueping.name = "血瓶";
        xueping.price = 50;

        Item caoxie = new Item();
        caoxie.name = "草鞋";
        caoxie.price = 300;

        Item changjian = new Item();
        changjian.name = "长剑";
        changjian.price = 350;
    }
    public Item(){

    }
    public Item(String name){
        this.name = name;
    }
    public String toString(){
        return name;
    }
    public void effect(){
        System.out.println("物品使用后可以有效果");
    }

}
