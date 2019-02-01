public class Item {
  

  private String description;
  private String weapon;
  private String refreshments;
  private String defense;
  private int durability;
  private int heal;
  private int block;
  private double price;
  private double weight;
  private int damage; 
  private int mana;
  private int spattak;
  private int spdefense;
  
  //Default constructor
  public Item() {
   
    durability = 100;
    heal = 50;
    price = 1.0;
    description = "Default Description";
    weight = 1.0;
    damage = 40;
    block = 2;
    mana = 10;
    weapon = "Default";
    refreshments = "Default";
    defense = "Default";
    spattak = 10;
    spdefense = 10;
  }
  
  
  public void setDefense(String m){
    defense = m;
  }
  public String getDefense(){
    return defense;
    
  }
  
  public void setDescription(String d) {
    description = d; 
  }
  public String getDescription() {
    return description;
  }  
  
  
  public void setWeapon(String f){
    weapon = f;
  }
  public String getWeapon(){
    return weapon;
  }
  
  
  public void setRefreshments(String l){
    refreshments = l;
  }
  public String getRefreshments(){
    return refreshments;
  }
  
  
  public void setDurability(int y){
    durability = y;
  }
  public int getDurability(){
    return durability;
  }
  
  
  public void setHeal(int q){
    heal = q;
  }
  public int getHeal(){
    return heal;
  }
  
  
  public void setPrice(double p){
    price = p;
  }
  public double getPrice(){
    return price;
  }
  
  
  public void setWeight(double w){
    weight = w;
  }
  public double getWeight(){
    return weight;
  }
  
  
  public void setDamage(int z){
    damage = z;
  }
  public int getDamage(){
    return damage;
  }
  
  
  public void setBlock(int v){
    block = v;
  }
  public int getBlock(){
    return block;
  }
  
  
  public void setMana(int u){
    mana = u;
  }
  public int getMana(){
    return mana;
  }
  
  public void SetSpattak(int a){
    spattak = a;
  }
  public int getSpattak(){
    return spattak;
  }
  
  public void setSpdefense(int b){
    spdefense = b;
  }
  public int getSpdefense(){
    return spdefense;
  }
}


