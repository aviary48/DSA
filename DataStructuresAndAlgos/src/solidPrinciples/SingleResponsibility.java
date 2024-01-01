package solidPrinciples;

public class SingleResponsibility {

    public static void main(String[] args){

        trial();
    }


   static void  trial(){

        System.out.println("---> " + Math.ceil(5/2));
    }





    class Animal{
        String name;

        Animal(String eName){
            this.name = eName;
        }


    }

    class Square{

        int length;
        int width;

        public Square(int eLength, int eWidth){
            this.length = eLength;
            this.width = eWidth;
        }


    }


}





