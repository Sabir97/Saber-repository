public class sommePairImpair{
    public static void main(String args[]){
        int n = 6;
        int s = 0;
        int[] Tabj = new int[10];
        int[] Tabi = new int[10];
            int cpt1 = 0;
            int cpt2 = 0;


        for(int i = 1;i<=n;i++){
            if(i%2==0){
                Tabi[cpt1] = i;
                System.out.println("nombres pairs :"+ Tabi[cpt1]);
            cpt1++;
            }
        }
        System.out.println("---------------------");

        for(int j = 1;j<=n;j++){
            if(j%2 != 0){
                Tabj[cpt2] = j;
                System.out.println("nombres impairs : "+Tabj[cpt2]);
            cpt2++;
            }
        }
        System.out.println("----------------------");

        for(int i=0;i<=n;i++){
            s = Tabi[i]*Tabi[i]+ Tabj[i]*Tabj[i];
            if(s==0) break;
           System.out.println("Result : "+ s);
        }
    }
}