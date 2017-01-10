import java.util.*;
import java.io.*;
class brodyBank{
   public static ArrayList<Account> accountList =new ArrayList<Account>(); 
   public static void main(String[] args){
      readInUsers();
      Scanner input = new Scanner(System.in);
      System.out.println("Take a selfie with this atms webcam! Also Welcome.");
      while(true){
         
         System.out.println("The options at this atm are:\n\t"+
                                                "create - Create a new account.\n\t"+
                                                "login - login to your account to do banking.\n\t"+
                                                "quit - Exit the atm.");
         String is = input.nextLine();
         if(is.equalsIgnoreCase("create")){
            accountCreate();
         }else if(is.equalsIgnoreCase("login")){
            login();
         }else if(is.equalsIgnoreCase("quit")){
            System.out.println("Peace out.");
            break;
         }else{
            System.out.println("Please enter a valid command.");
         }
      }
      saveUsers();
   }
   
   public static void readInUsers(){
      try{
         Scanner sc = new Scanner(new File("userData.txt"));
         while(sc.hasNextLine()){
            String user = sc.nextLine();
            String[] split = user.split("\\|");
            Account acc = new Account(split[0],split[1],Double.parseDouble(split[2]));
            accountList.add(acc);
         }
      }catch(Exception e){
         e.printStackTrace();
      }
   }
   
   public static void saveUsers(){
      try{
         PrintStream ps = new PrintStream(new File("userData.txt"));
         for(Account a : accountList){
            String data = "";
            data = a.getName()+"|"+a.getPass()+"|"+a.checkBal();
            ps.println(data);
         }
      }catch(Exception e){
         e.printStackTrace();
      }
   }
   public static boolean notValidName(String in){
      boolean found = false;
      for(Account a : accountList){
         if(a.getName().equals(in)){
            found = true;
            break;
         }
      }
      return found;
   }
   
   public static Account findAccount(String in){
      boolean found = false;
      for(Account a : accountList){
         if(a.getName().equals(in)){
            return a;
         }
      }
      return null;
   }
   
   public static void login(){
      
      Account transactAcc = null;
      Scanner in = new Scanner(System.in);
      String test = "";
      while(true){
         System.out.println("Please enter your username.");
         test = in.nextLine();
         if(!test.equals("") && notValidName(test)){
            transactAcc = findAccount(test);
            break;
         }else{
            System.out.println("User does not exist.");
         }
      }
      System.out.println("Please enter your password.");
      String pass = in.nextLine();
      if(!transactAcc.getPass().equals(pass)){
         System.out.println("Haha good try!");
         return;
      }
      String command ="";
      while(true){
            System.out.println("withdraw, close, deposit, quit or check?");
            command = in.nextLine();
            if(command.equalsIgnoreCase("withdraw")){
               System.out.println("NONONONO, How much?????");
               double amount = in.nextDouble();
               transactAcc.withdraw(amount);
                  in.nextLine();
            }else if(command.equalsIgnoreCase("deposit")){
               System.out.println("Yes please! How much?");
               double amount = in.nextDouble();
               transactAcc.deposit(amount);
               in.nextLine();
            }else if(command.equalsIgnoreCase("check")){
               System.out.println("Balance is: "+transactAcc.checkBal());
            }else if(command.equalsIgnoreCase("quit")){
               break;
            }else if(command.equalsIgnoreCase("close")){
               accountList.remove(transactAcc);
               break;
            }else{
               System.out.println("Enter a valid command.");
            }
      }
   }
   public static void accountCreate(){
      Scanner input = new Scanner(System.in);
      String name = "";
      while(name.equals("") || notValidName(name)){
         System.out.println("Enter a new username:");
         name = input.nextLine();
         if(notValidName(name)){
            System.out.println("Username in use. Nice try.");
         }
      }
      System.out.println("Now enter a password!");
      Account newAccount = new Account(name,input.nextLine());
      accountList.add(newAccount);
   }
}