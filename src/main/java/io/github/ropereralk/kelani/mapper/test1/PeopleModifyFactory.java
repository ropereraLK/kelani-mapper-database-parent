package io.github.ropereralk.kelani.mapper.test1;

public class PeopleModifyFactory {

   public People modify(String category, String Name){
       return getPeople( category);


   }

   private People getPeople(String category){
       switch (category){

       case "Professional":
           return new Professional();
       default:
           return new Student();
       }
   }

}
