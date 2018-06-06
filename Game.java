import static java.lang.System.*;
import java.util.Scanner;

public class Game {
    
    public static void main(String[] args) {
       
      Scanner keyboard = new Scanner(System.in);
      int intOne;
      int intTwo;
      int intThree;

      Item[] inventory = new Item[12];
        
        
        
    inventory[0] = new Item();
    inventory[1] = new Item();
    inventory[2] = new Item();
    inventory[3] = new Item();
    inventory[4] = new Item();
    inventory[5] = new Item();
    inventory[6] = new Item();
    inventory[7] = new Item();
    inventory[8] = new Item();
    inventory[9] = new Item();
    inventory[10] = new Item();
    inventory[11] = new Item();
    
    
    
    
     inventory[0].setDefense("Wings");
     inventory[0].setDurability(2000);
     inventory[0].setPrice(5000.00);
     inventory[0].setDescription("Fly Above The Map And Clouds");
     inventory[0].setWeight(1.00);
     inventory[0].setBlock(5);
     System.out.println("Defense: "+ inventory[0].getDefense());
     System.out.println("Durability:" + inventory[0].getDurability());
     System.out.println("Price:" + inventory[0].getPrice());
     System.out.println("Description:" + inventory[0].getDescription());
     System.out.println("Weight:" + inventory[0].getWeight());
     System.out.println("Block:" + inventory[0].getBlock());
     
     
     
     inventory[1].setRefreshments("Health Potion");
     inventory[1].setDurability(5);
     inventory[1].setPrice(20.00);
     inventory[1].setDescription("Use When Health Is Low");
     inventory[1].setWeight(5.89);
     inventory[1].setHeal(10);
     System.out.println(" ");
     System.out.println("Refreshments: " + inventory[1].getRefreshments());
     System.out.println("Durability:" + inventory[1].getDurability());
     System.out.println("Price:" + inventory[1].getPrice());
     System.out.println("Description:" + inventory[1].getDescription());
     System.out.println("Weight:" + inventory[1].getWeight());
     System.out.println("Heal:" + inventory[1].getHeal());
  
     
     
     inventory[2].setWeapon("Flaming Sword");
     inventory[2].setDurability(200);
     inventory[2].setPrice(500.00);
     inventory[2].setDescription("Kill Anyone Who Is In Your Way");
     inventory[2].setWeight(59.41);
     inventory[2].setDamage(100);
     System.out.println(" ");
     System.out.println("Weapon:" + inventory[2].getWeapon());
     System.out.println("Durability:" + inventory[2].getDurability());
     System.out.println("Price:" + inventory[2].getPrice());
     System.out.println("Description:" + inventory[2].getDescription());
     System.out.println("Weight:" + inventory[2].getWeight());
     System.out.println("Damage:" + inventory[2].getDamage());
    

    
     inventory[3].setDefense("Shield");
     inventory[3].setDurability(300);
     inventory[3].setPrice(300.00);
     inventory[3].setDescription("Block Out All The Base Memes");
     inventory[3].setWeight(75.30);
     inventory[3].setBlock(5);
     System.out.println(" ");
     System.out.println("Defense:" + inventory[3].getDefense());
     System.out.println("Durability:" + inventory[3].getDurability());
     System.out.println("Price:" + inventory[3].getPrice());
     System.out.println("Description:" + inventory[3].getDescription());
     System.out.println("Weight:" + inventory[3].getWeight());
     System.out.println("Block:" + inventory[3].getBlock());
  
     
     
     inventory[4].setWeapon("Bow And Arrow");
     inventory[4].setDurability(250);
     inventory[4].setPrice(250.00);
     inventory[4].setDescription("Always Get A Bulleyes On All Your Target");
     inventory[4].setWeight(45.30);
     inventory[4].setDamage(80);
     System.out.println(" ");
     System.out.println("Weapon:" + inventory[4].getWeapon());
     System.out.println("Durability:" + inventory[4].getDurability());
     System.out.println("Price:" + inventory[4].getPrice());
     System.out.println("Description:" + inventory[4].getDescription());
     System.out.println("Weight:" + inventory[4].getWeight());
     System.out.println("Damage:" + inventory[4].getDamage());
    
     
     
     inventory[5].setWeapon("Magic Book");
     inventory[5].setDurability(150);
     inventory[5].setPrice(650.00);
     inventory[5].setDescription("Use Magic To Defeat All");
     inventory[5].setWeight(35.30);
     inventory[5].setMana(10);
     inventory[5].setDamage(70);
     System.out.println(" ");
     System.out.println("Weapon:" + inventory[5].getWeapon());
     System.out.println("Durability:" + inventory[5].getDurability());
     System.out.println("Price:" + inventory[5].getPrice());
     System.out.println("Description:" + inventory[5].getDescription());
     System.out.println("Weight:" + inventory[5].getWeight());
     System.out.println("Damage:" + inventory[5].getDamage());
     System.out.println("Mana:" + inventory[5].getMana());
    
    
    
     inventory[6].setRefreshments("Mana Potion");
     inventory[6].setDurability(5);
     inventory[6].setPrice(580.00);
     inventory[6].setDescription("Restore Your Magic Ability");
     inventory[6].setWeight(10.00);
     inventory[6].setMana(10);
     System.out.println(" ");
     System.out.println("Refreshments: " + inventory[6].getRefreshments());
     System.out.println("Durability:" + inventory[6].getDurability());
     System.out.println("Price:" + inventory[6].getPrice());
     System.out.println("Description:" + inventory[6].getDescription());
     System.out.println("Weight:" + inventory[6].getWeight());
     System.out.println("Mana:" + inventory[6].getMana());
     
     
     
     inventory[7].setDefense("King's Armor");
     inventory[7].setDurability(3000);
     inventory[7].setPrice(1000.00);
     inventory[7].setDescription("Protect Yourself From Others");
     inventory[7].setWeight(300.00);
     inventory[7].setBlock(5);
     System.out.println(" ");
     System.out.println("Defense:" + inventory[7].getDefense());
     System.out.println("Durability:" + inventory[7].getDurability());
     System.out.println("Price:" + inventory[7].getPrice());
     System.out.println("Description:" + inventory[7].getDescription());
     System.out.println("Weight:" + inventory[7].getWeight());
     System.out.println("Block:" + inventory[7].getBlock());
  
  
  
     inventory[8].setRefreshments("Cooked Food");
     inventory[8].setDurability(100);
     inventory[8].setPrice(100.00);
     inventory[8].setDescription("Restore Your Hunger");
     inventory[8].setWeight(40.00);
     inventory[8].setHeal(25);
     System.out.println(" ");
     System.out.println("Refreshments: " + inventory[8].getRefreshments());
     System.out.println("Durability:" + inventory[8].getDurability());
     System.out.println("Price:" + inventory[8].getPrice());
     System.out.println("Description:" + inventory[8].getDescription());
     System.out.println("Weight:" + inventory[8].getWeight());
     System.out.println("Heal:" + inventory[8].getHeal());
  
  
  
     inventory[9].setRefreshments("Bottle Of Water");
     inventory[9].setDurability(100);
     inventory[9].setPrice(100.00);
     inventory[9].setDescription("Drink It To Gain Back Your Stamana");
     inventory[9].setWeight(60.00);
     inventory[9].setMana(3);
     System.out.println(" ");
     System.out.println("Refreshments: " + inventory[9].getRefreshments());
     System.out.println("Durability:" + inventory[9].getDurability());
     System.out.println("Price:" + inventory[9].getPrice());
     System.out.println("Description:" + inventory[9].getDescription());
     System.out.println("Weight:" + inventory[9].getWeight());
     System.out.println("Mana:" + inventory[9].getMana());


     
     inventory[10].setWeapon("Battle Axe");
     inventory[10].setDurability(100);
     inventory[10].setPrice(100.00);
     inventory[10].setDescription("Double Edge Axe Just Made To Kill");
     inventory[10].setWeight(60.00);
     inventory[10].setDamage(80);
     System.out.println(" ");
     System.out.println("Weapon: " + inventory[10].getWeapon());
     System.out.println("Durability:" + inventory[10].getDurability());
     System.out.println("Price:" + inventory[10].getPrice());
     System.out.println("Description:" + inventory[10].getDescription());
     System.out.println("Weight:" + inventory[10].getWeight());
    
     
     
     inventory[11].setDefense("Force Field");
     inventory[11].setDurability(100);
     inventory[11].setPrice(100.00);
     inventory[11].setDescription("Use The Force To Protect Yourself");
     inventory[11].setWeight(60.00);
     inventory[11].setMana(8);
     inventory[11].setBlock(5);
     System.out.println(" ");
     System.out.println("Defense: " + inventory[11].getDefense());
     System.out.println("Durability:" + inventory[11].getDurability());
     System.out.println("Price:" + inventory[11].getPrice());
     System.out.println("Description:" + inventory[11].getDescription());
     System.out.println("Weight:" + inventory[11].getWeight());
     System.out.println("Mana:" + inventory[11].getMana());
     System.out.println("Block:" + inventory[11].getBlock());

    System.out.println(" ");
    
         Choices maggie = new Choices();
		
		System.out.println (maggie.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
    
    
    
  
  Character landy = new Archer(2000, 2000, 50, 50, "Kenny", "Male", inventory[4].getWeapon());
  		System.out.println("Choose A Name Of The Character One: "  );
        landy.setName(statement = in.nextLine());
        
  Character captainCrunch = new Warrior(2000, 2000, 50, 50, "Marcus", "Male", inventory[2].getWeapon());
         System.out.println("Choose A Name Of The Character Two: "  );
        captainCrunch.setName(statement = in.nextLine());
  
  Character bestTeacher = new Mage(2000, 2000, 50, 50, "Brian", "Male", inventory[5].getWeapon());
        System.out.println("Choose A Name Of The Character Three: "  );
        bestTeacher.setName(statement = in.nextLine());
        
  Character bestTeachersFamily = new Valkyrie(2000, 2000, 50, 50, "TeachersPet", "Female", inventory[10].getWeapon());
        System.out.println("Choose A Name Of The Character Four: "  );
        bestTeachersFamily.setName(statement = in.nextLine());

  
System.out.println(" ");
        System.out.println(" ");
        System.out.println("Here Are The Four Classes You Can Choose From: ");
        System.out.println(" ");
        System.out.println("If You Need Help Choosing Look At The Stats Below To Decide");
        System.out.println(" ");
     
        
        System.out.println("Archer: " + inventory[4].getWeapon() + " and " + inventory[3].getDefense());
        System.out.println("My name is " + landy.getName());
        System.out.print("HP: " + landy.getHP());
        System.out.println(" MP: " + landy.getMP());
        System.out.print("Attack: " + landy.getAttack());
        System.out.println(" Speed: " + landy.getSpeed());
        System.out.println(" ");
     
        System.out.println("Warrior: " + inventory[2].getWeapon() + " and "  + inventory[7].getDefense() );
        System.out.println("My name is " + captainCrunch.getName());
        System.out.print("HP: " + captainCrunch.getHP());
        System.out.println(" MP: " + captainCrunch.getMP());
        System.out.print("Attack: " + captainCrunch.getAttack());
        System.out.println(" Speed: " + captainCrunch.getSpeed());
        System.out.println(" ");
     
        System.out.println("Wizard: " + inventory[5].getWeapon() + " and " + inventory[0].getDefense());
        System.out.println("My name is " + bestTeacher.getName());
        System.out.print("HP: " + bestTeacher.getHP());
        System.out.println(" MP: " + bestTeacher.getMP());
        System.out.print("Attack: " + bestTeacher.getAttack());
        System.out.println(" Speed: " + bestTeacher.getSpeed());
        System.out.println(" ");
        
        System.out.println("Valkyrie: " + inventory[10].getWeapon() + " and " + inventory[11].getDefense());
        System.out.println("My name is " + bestTeachersFamily.getName());
        System.out.print("HP: " + bestTeachersFamily.getHP());
        System.out.println(" MP: " + bestTeachersFamily.getMP());
        System.out.print("Attack: " + bestTeachersFamily.getAttack());
        System.out.println(" Speed: " + bestTeachersFamily.getSpeed());
        
        
        System.out.println(" ");
		
		while (!statement.equals("Y"))
		{
			System.out.println (maggie.getResponse(statement));
			statement = in.nextLine();
		}
        
        System.out.println(" ");
        

        System.out.print("Enter Amount Of HP For Everyone : ");
        intTwo = keyboard.nextInt();
        System.out.print("Enter Amount Of MP For Everyone : ");
        intThree = keyboard.nextInt();
        System.out.print("Enter Amount Of Turns : ");
		intOne = keyboard.nextInt();
		
    System.out.println(" ");
    System.out.println("LET THE BATTLE BEGIN !!! ");
    System.out.println(" ");
    
    
        for(int run = 1;run <= intOne; run = run + 1){

        landy.setHP(intTwo);
        landy.setMP(intTwo);
        
        captainCrunch.setHP(intTwo);
        captainCrunch.setMP(intTwo);
        
        bestTeacher.setHP(intTwo);
        bestTeacher.setMP(intTwo);
        
        bestTeachersFamily.setHP(intTwo);
        bestTeachersFamily.setMP(intTwo);
        System.out.println(" ");

        
        System.out.println(" ");
        
        System.out.println(captainCrunch.getName() + maggie.getResponse(statement) + inventory[2].getWeapon() + " "  +  bestTeachersFamily.getName() + "!");
        bestTeachersFamily.setHP(bestTeachersFamily.getHP() - inventory[2].getDamage()  / inventory[11].getBlock());
        bestTeachersFamily.setMP(bestTeachersFamily.getMP() - inventory[11].getMana());
        System.out.println(bestTeachersFamily.getName() + " Cast A Force Field !!!");
        System.out.println(bestTeachersFamily.getName()+ " Mana Is Now " + bestTeachersFamily.getMP());
        System.out.println(bestTeachersFamily.getName() + " Health Is Now " + bestTeachersFamily.getHP());
        System.out.println(" ");
        
        
        System.out.println(landy.getName() + maggie.getResponse(statement) + inventory[4].getWeapon() + " " + bestTeacher.getName() + "!");
        bestTeacher.setHP(bestTeacher.getHP() - inventory[4].getDamage() / inventory[0].getBlock() );
        System.out.println(bestTeacher.getName() + " Use Wings To Block The Hit !!!");
        System.out.println(bestTeacher.getName() + " Health Is Now " + bestTeacher.getHP());
        System.out.println(" ");
        
        
        System.out.println(bestTeachersFamily.getName() + maggie.getResponse(statement) + inventory[10].getWeapon() + " " + captainCrunch.getName() + "!");   
        captainCrunch.setHP(captainCrunch.getHP() - inventory[10].getDamage() / inventory[7].getBlock() );
        System.out.println(captainCrunch.getName() + " Use His Armor To Defend Himself !!!");
        System.out.println(captainCrunch.getName() + " Health Is Now " + captainCrunch.getHP());
        System.out.println(" ");
        
        
        System.out.println(bestTeacher.getName() + maggie.getResponse(statement) + inventory[5].getWeapon() + " " + landy.getName() + "!");   
        landy.setHP(landy.getHP() - inventory[5].getDamage() / inventory[3].getBlock() );
        bestTeacher.setMP(bestTeacher.getMP() - inventory[5].getMana());
        System.out.println(bestTeacher.getName()+ " Mana Is Now " + bestTeacher.getMP());
        System.out.println(landy.getName() + " Uses His Shield To Block Some Of The Magic !!!");
        System.out.println(landy.getName() + " Health Is Now " + landy.getHP());
            
        System.out.println(" ");
        System.out.println(" ");
            
            
            
            
        }
        
        if (landy.isAlive() == false){
             System.out.println(" ");
             System.out.println(landy.getName() + " HAS DIED AND LOST THE FIGHT !!!!! ");
        }else if(captainCrunch.isAlive() == false){
            System.out.println(" "); 
             System.out.println(captainCrunch.getName() + " HAS DIED AND LOST THE FIGHT !!!!! ");
        }else if(bestTeacher.isAlive() == false){
             System.out.println(" ");
             System.out.println(bestTeacher.getName() + " HAS DIED AND LOST THE FIGHT !!!!! ");
        }else if(bestTeachersFamily.isAlive() == false){
             System.out.println(" ");
             System.out.println(bestTeachersFamily.getName() + " HAS DIED AND LOST THE FIGHT !!!!! ");
        }
        
        

        
        
        
    }
    
}