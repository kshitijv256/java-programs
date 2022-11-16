import java.io.*;
public class CheckedEx {
    public static void main(String[] args) throws IOException {
        try{
            FileReader fi = new FileReader("newfile.txt");
            fi.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
