import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


class Cuboid{

    private double length;
    private double width;
    private double height;

    public Cuboid(double lenght, double width,double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getVolume(){
        return length*width*height;
    }

    public double getSurfaceArea(){
        return 2*(length*width+length*height+width+height);
    }
}





public class Main{

    public static void main(String[] args) {

        String namaFile = "./src/cuboid.txt";

        try(BufferedReader br = new BufferedReader(new FileReader("cuboid.txt"))){
            String line;
            while ((line = br.readLine()) != null){
                String[] data = line.split(",");
                double length = Double.parseDouble(data[0]);
                double width = Double.parseDouble(data[1]);
                double height = Double.parseDouble(data[2]);

                Cuboid cuboid = new Cuboid(length,width,height);
                System.out.println("Volume:"+cuboid.getVolume());
                System.out.println("Surface Area;"+ cuboid.getSurfaceArea());
                System.out.println();
            }
        }catch (IOException e){
            System.out.println("eror reading file:"+e.getMessage());
        }
    }

}