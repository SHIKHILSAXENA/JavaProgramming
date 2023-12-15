public class PracticeQuestion6 {
    public static void main(String[] args) {
        //Q1
//        float[] a = {1,2,3,4,5};
//        float sum = 0;
//        for (float element:a) {
//           sum = sum +element;
//            System.out.println(sum);
//        }
        //Q2
        float[] a = {100.0f,200.0f,300.0f,400.0f};
        float num  = 100.0f;
        boolean isINArray = false;
        for (float elements:a) {
            if (num==elements){
                isINArray = true;
                break;
            }
        }
        if (isINArray){
            System.out.println("The value is present in array ");
        }
        else {
            System.out.println("The value is not present in array");
        }
    }
}
