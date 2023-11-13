package com.rohan;

//import java.sql.SQLOutput;

class GetSet1{
 private String name;
 private int age;
 private int experience;
//try{
 public void setName(String name1)
              {
                  if(name1.equals("Rohan"))
                  {
                      System.out.println("Nice guess man");
                  }
     this.name=name1;
              }

 

   /* public void setName(String name0)
    {

        this.name=name0;
    }
*/
 public String getName(){
     return name;


                         }
              }

public class GetterSetter {
    public static void main(String[] args) {
        GetSet1 obj = new GetSet1();
        obj.setName("Rohan");
        String r = obj.getName();
        System.out.println(r);
    //  String b= obj.getName();
    }
}
