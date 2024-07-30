public class ComputeBmi {
    private double B_M_I;
    private String status;
    //compute the bmi
    public void calculateBmi(double height, double weight){
        this.B_M_I = (height / (Math.pow(weight, 2)));
    }
    //get the bmi
    public double getBmi(){
        return B_M_I;
    }
    //find the status
    public void setSti){
        if (bmi <= 17.5){
            this.status = "Under-Weight";
        }else if (bmi <= 19.5 ){
            this.status = "Normal-Weight";
        }else if (bmi < 25.5){
            this.status = "Obese";
        }else{
            this.status = "Over-Weight";
        }
    }
    //get the statusatus(double bm
    public String getStatus(){
        return status;
    }
    
}
