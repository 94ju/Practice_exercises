public class arraypass {

    public static void main(String[] args) {
        int array[] = {1,2,3,4,5};
        arraypass c =new arraypass();
        c.getarray(array);

    }
    public void getarray(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
