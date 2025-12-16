class Sample{
    final char gender = 'M';
    void Admin(){
        //gender = 'F';
        //cannot assign the value
        System.out.println(gender);
    }
}

public class FinalMethod {
    public static void main(String[] args) {
        Sample obj = new Sample();
        obj.Admin();
    }
}
