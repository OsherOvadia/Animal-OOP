public class Fish extends Animal{
    public Fish()
    {
        super();
        this._name = "Neptune";
    }
    public Fish(String name,int age,String size,boolean isMale, int food)
    {
        super(name, age ,size,isMale,food); 
    }
    public void swim(Fish fish)
    {
        System.out.println(fish._name  + "swiming! ");
    }
    public int getFood()
    {
        return this._food;
    }     
    
    public void eat(int food)
        {
            
            if(this._food<2){
                if(this._food+food>10)
                    this._food = 10;
                else
                    this._food+=food;
                System.out.println("I struved to death give me some SeaFood! ");
            }
            else if(this._food==10)
            {
                System.out.println("Im full! ");
                return;
            }
            else{
                if(this._food+food>10)
                    this._food = 10;
                else
                    this._food+=food;
            }
            System.out.println("Thanks for giving some Seafood to eat! ");
            System.out.println( "my food level is: " + this._food);
            
        }

    
    
    
}
    

