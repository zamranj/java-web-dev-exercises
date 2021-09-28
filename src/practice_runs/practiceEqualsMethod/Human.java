package practice_runs.practiceEqualsMethod;

public class Human {

    private String name;
    private int id;

    public Human(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == this){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(obj.getClass() != this.getClass()){
            return false;
        }
        Human another = (Human) obj;
        if(this.id != another.id ){
            return false;
        }
        if(this.name == null){
            if(another.name != null){
                return false;
            }
        }
        if(!this.name.equals(another.name)){
            return false;
        }
        return true;
    }




}
