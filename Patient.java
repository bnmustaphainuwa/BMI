public class Patient {

//intialize the attribute
    private String first_name;
    private String last_name;
    private long id;
    private double weight;
    private double height;
//set and get the first name
   public void setFirstName(String f_name){
    this.first_name = f_name;
   }
   public String getFirstName(){
    return first_name;
   }
//set and get the last name
   public void setLastName(String l_name){
    this.last_name = l_name;
   }
   public String getLastName(){
    return last_name;
   }
//set and get the id
   public void setId(long I_D){
    this.id = I_D;
   }
   public long getid(){
    return id;
   }
//set and get the height
   public void setHeight(double height){
    this.height = height;
   }
   public double getHeight(){
    return height;
   }
//set and get the weight
   public void setWeight(double weight){
    this.weight = weight;
   }
   public double getWeight(){
    return weight;
   }
    
}