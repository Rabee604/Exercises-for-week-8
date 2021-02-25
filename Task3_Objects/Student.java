public class Student{

private String name;
private int age;
private boolean isFemale;
private String datamatikerTeam;

public Student(String name, int age, boolean isFemale, String datamatikerTeam){

this.name = name;
this.age= age;
this.isFemale= isFemale;
this.datamatikerTeam= datamatikerTeam;


}

public String getName(){

return name;


}
public String getTeam(){
return datamatikerTeam;

}
}