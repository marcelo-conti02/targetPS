public class question4 {
    public static void main(String args[]){
        double sp = 67836.43, rj = 36678.66, mg = 29229.88, es = 27165.48, others = 19849.53;
        double total = sp + rj + mg + es + others;

        System.out.println("SP:");
        representation(sp, total);
        System.out.println("RJ:");
        representation(rj, total);
        System.out.println("MG:");
        representation(mg, total);
        System.out.println("ES:");
        representation(es, total);
        System.out.println("Outros:");
        representation(others, total);
    }

    static void representation(double state, double total){
        double spRep = (100 * state) / total;
        System.out.println(spRep + "%");
    }
}
