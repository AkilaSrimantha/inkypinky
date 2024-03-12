public class Inky{
public Inky(String x){
System.out.println(x);
}

public Inky(String pinky,String blinky,String rinky){
System.out.println(blinky + "" + pinky);
System.out.println(pinky + "" + rinky);
System.out.println(blinky + "" + pinky + ""+ rinky);
}
public static void main(String args[]){
String pinky= "Donky";

Inky ponky = new Inky(pinky);//object1
String blinky= "pinky";
String rinky= "Monky";

Inky ponky2 = new Inky(pinky,blinky,rinky);//object2



}

}