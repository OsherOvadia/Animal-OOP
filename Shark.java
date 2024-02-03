public class Shark extends Fish{
    public Shark()
    {
        super();
        this._size = "Small";
        this._name  = "Bitsy";
    }
    public Shark(String name,int age,String size,boolean isMale, int food)
    {
        super(name, age ,size,isMale,food); 
    }
    public void eat(int food)
        {
            
            if(this._food<2){
                if(this._food+food>10)
                    this._food = 10;
                else
                    this._food+=food;
                System.out.print("i Starved to death! ");
            }
            else if(this._food==10)
            {
                System.out.print("Im full!");
                return;
            }
            else{
                if(this._food+food>10)
                    this._food = 10;
                else
                    this._food+=food;
            }
            System.out.println("Thanks for giving Fresh fishes to eat! ");
            System.out.println( "my food level is: " + this._food);
            
        }
        public int getFood()
        {
        if(this._food<2)
            System.out.print("give me some bananas Im Starving! ");
        return this._food;
        }
    
}
