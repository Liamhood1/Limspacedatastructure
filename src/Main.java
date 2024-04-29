public class Main {
    public static void main(String[] args) {
        MyCoolQueue myData = new MyCoolQueue();


        for(int i = 0; i<100;i=i+1) {
            myData.put(i);
        }
        for(int i = 0; i<100;i=i+1) {
            Object PrintableData = myData.get();
            System.out.println(PrintableData);
        }
    }
}