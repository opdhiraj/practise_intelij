public class infiniteTimes {
    public static void main(String[] args) {

        infinite();


    }
      static int count = 0;
    static void infinite() {

        count++;


        if (count<=10){
                System.out.println("dhiraj"+" " + count);

                infinite();
            }


        }

    }
