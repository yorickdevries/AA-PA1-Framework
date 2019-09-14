import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
        	//String instance = args[0];
        	String instance = "../instances/n_2_k_10_dmax_100_0.txt";
            System.out.println(new BruteForceSolver().solve(AuctionProblemInstance.IO.read(instance)).value); // replace with your solver here
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
