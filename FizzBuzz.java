public static void main(String[] args) {
        for(int i = 1; i <= 100; i++) {
            divisaoFizzBuzz(i);
            }
        }
        public static void divisaoFizzBuzz(int i) {
        boolean fizz = false;
        boolean buzz = false;

        if(i % 3 == 0) {
            fizz = true;
        }
        if(i % 5 == 0) {
            buzz = true;
        }

        if(fizz && buzz) {
            System.out.println("FizzBuzz");
        }else if(fizz && !buzz) {
            System.out.println("Fizz");
        }else if(!fizz && buzz) {
            System.out.println("Buzz");
        }else{
            System.out.println(i);
        }
    }

}
