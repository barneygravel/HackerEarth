class HackerEarthTest {
  /*public static void main(String[] args) {
       String out1 = Solve(6);
       System.out.println(out1);
       String out2 = Solve(5);
       System.out.println(out2);
       String out3 = Solve(28);
       System.out.println(out3);
    }*/

    String Solve(int N){
        String result = "NO";
        
        if(SumOfFactors(N) == N)
            result = "YES";

        return result;
    }

    int SumOfFactors(int N){
      int sum = 0;
      for(int i=1; i<N ; i++)
        {
            if(N % i == 0)
              sum = sum + i;   
        }
        return sum;
    }
}

