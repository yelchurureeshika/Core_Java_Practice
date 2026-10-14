package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class checkedException {
    public static void main(String[] args) throws Exception{
        try{
            FileReader fr=new FileReader("C:\\Users\\reesh\\IdeaProjects\\corejava\\src\\ExceptionHandling\\demo.txt");
            System.out.println(fr);
        } catch (FileNotFoundException e) {
           System.out.println("file not found"+e);
        }
        catch (Exception e){
            System.out.println("developer"+e);
        }
    }
}
