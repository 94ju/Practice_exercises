public class Primenumbers {
    public static void main(String[] args) {

        for (int i=2;i<100;i++){
            boolean check=true;
            for (int j=2;i>j;j++){

                if ((i%j)==0){
                    check=false;

                }

            }
            if(check) {
                check=true;
                System.out.println(i);
            }

        }
    }
}
