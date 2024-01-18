import java.util.ArrayList;

public class StairMaster {
    private int n;
    public StairMaster(int n) {
        this.n = n;
    }
    public ArrayList<Integer> getSteps(){
        ArrayList<Integer> steps = new ArrayList<>();
        int half = n/2;
        for(int i =0; i<half; i++){
            steps.add(2);
        }
        return steps;
    }
}
