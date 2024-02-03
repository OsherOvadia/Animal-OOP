public class Lion extends Animal {
    public Lion()
    {
        super(); 
        this._name = "Simba";
    }
    public Lion(String name,int age,String size,boolean isMale,int food)
    {
        super(name, age ,size,isMale, food); 
    }
    public void roar(Lion l){
        System.out.println(l._name + " is Roaring!");
    }

    public int getFood()
    {
        if(this._food<2)
            System.out.print("im Starving! give me an antilopa! ");
        return this._food;
    }
    public void eat(int food)
    {
            
        if(this._food<2){
            if(this._food+food>10)
                this._food = 10;
            else
                this._food+=food;
            System.out.print("I struved to death ");
        }
        else if(this._food==10)
        {
            System.out.print("Im full! ");
            return;

        }
        else{
            if(this._food+food>10)
                this._food = 10;
            else
                this._food+=food;
        }
        System.out.println("Thanks for giving some meat to eat! ");
        System.out.println( "my food level is: " + this._food);   
        }
        

    
}