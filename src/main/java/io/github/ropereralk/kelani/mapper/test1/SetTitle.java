package io.github.ropereralk.kelani.mapper.test1;

public class SetTitle {

    public String getTitle(String category, String Name){

        PeopleModifyFactory pm = new PeopleModifyFactory();
        People people = pm.modify(category, Name);
      return   people.getTitle();



    }
}
