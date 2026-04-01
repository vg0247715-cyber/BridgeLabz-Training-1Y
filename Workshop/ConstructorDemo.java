public class ConstructorDemo"
int id ;
String name;
int age;
public  ConstructorDemo(){
System.out.println("Constructor Program");
}
public ConstructorDemo(int id, String name,int age){
this.id =id;
this.age=age;
}
public Static void main(String[] args){
ConstructorDemo cd = new ConstructorDemo(id 1,name"Jay",age 25);
cd.display();
}
}