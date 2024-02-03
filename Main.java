public class Main {

    public static void main(String[] args) {
        //declary about the animals in the zoo
        Lion l = new Lion();
        Lion l1 = new Lion("josh",10,"big",true, 6);

        Fish f = new Fish();
        Fish f1 = new Fish("Nemo",2,"very small",false,10);

        Shark s = new Shark();
        Shark s1 = new Shark("Larry",6,"medium",false,1);

        Monkey m = new Monkey();
        Monkey m1 = new Monkey("Shinpanza", 11, "big", true, 9);
        //array of the zoo:
        Animal[] zoo = new Animal[10];
        zoo[0] = l;
        zoo[1] = l1;
        zoo[2] = f;
        zoo[3] = f1;
        zoo[4] = s;
        zoo[5] = s1;
        zoo[6] = m;
        zoo[7] = m1;
        //functions to the zoo:

        //print the names of the animals

        /*for(Animal animal : zoo)
        {
            System.out.println(animal._name);
        }*/

        for(int j=0;j<8;j++)
            {
                System.out.println(zoo[j].getFood());
            }
        

    
        
       
    }
    
}
