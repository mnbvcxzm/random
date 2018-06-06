public abstract class Character {
    
    //Properties/Fields
    private int HP;
    private int MP;
    private int attack;
    private int speed;
    private String name;
    private String gender;
    private String wepon;
    //Methods
    public int getHP() { return HP;}
    
    public int getMP() { return MP;}
    
    public int getAttack() { return attack; }
    
    public int getSpeed() { return speed; }
    
    public String getName() { return name; }
    
    public String getGender() { return gender; }
    
    public String getWepon() { return wepon;}
    
    //Mutator Methods (aka Set Methods)
    
    public void setHP(int h) {  HP  =  h ;}
    
    public void setMP (int m) { MP = m; }
    
    public void setAttack(int a) { attack = a; }
    
    public void setSpeed(int s) { speed = s; }
    
    public void setWepon(String z){wepon = z;}
    
    public void setName(String n) {name = n; }
    
    public void setGender(String g) { gender = g;}
    
    //Constructors
    public Character() {
        HP = 2000;
        MP = 2000;
        attack = 50;
        speed = 50;
        name = "Kenny";
        gender = "Male";
        wepon = "Bow And Arrow";
    }

    //Default Constructor

    //Constructor with 6 parameters: HP, MP, attack, speed, name, gender
    public Character(int h, int m, int a, int s, String n, String g, String z) {
        HP  =  h ;
        MP = m;
        attack = a;
        speed = s;
        name = n;
        gender = g;
        wepon = z;
    }

    public boolean isAlive(){
        
        if(this.getHP() > 0){
            return true;
        }else{
             return false;
         }
        
    }
}