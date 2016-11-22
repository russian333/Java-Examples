class Account{
   
   private String username = "";
   private String password = "";
   private double balance = 0.0;
   
   public Account(String user, String pass){
      this.username = user;
      this.password = pass;
      this.balance = 0.0;
   }
   public Account(String user, String pass,double d){
      this.username = user;
      this.password = pass;
      this.balance = d;
   }
   
   public double checkBal(){
      return this.balance;
   }
   
   public void deposit(double amount){
      this.balance+=amount;
   }
   
   public void withdraw(double amount){
      if(this.balance-amount>=0){
         this.balance-=amount;
      }else{
         System.out.println("Yo, hold up. You dont have that much.");
      }
   }
   
   public String getName(){
      return this.username;
   }
   public String getPass(){
      return this.password;
   }
}