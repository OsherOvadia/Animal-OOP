public abstract class Animal {
    String _name;
    int _age;
    String _size;
    boolean _isMale;
    int _food;
    public abstract int getFood();
    public abstract void eat(int food);
    public Animal() 
    {
        this._name = "Noname";
        this._age = 0;
        this._size = "small";
        this._isMale = true;
        this._food = 5;
    }
    public Animal(String name,int age, String size, boolean isMale, int food) 
    {
        this._name = name;
        this._age = age;
        this._size = size;
        this._isMale = isMale;
        this._food = food; 
    }
    public String getName()
    {
        return this._name;
    }
    public int getAge(){
        return this._age;
    }
    public String getSize()
    {
        return this._size;
    }
    public Boolean GetIsMale()
    {
        return this._isMale;
    }
    

    public void setName(String name)
    {
        this._name = name;
    }
    public void setAge(int age){
        this._age = age;
    }
    public void setSize(String size)
    {
         this._size = size;
    }
    public void setIsMale(boolean isMale)
    {
         this._isMale= isMale;
    }     

}