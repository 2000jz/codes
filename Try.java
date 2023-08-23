public class Try {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {-19, 8, 2, -8, 19, 5, -2, -23};
                int psum =0;
        for(int vl :arr){
            psum += vl;
            System.out.println(psum);
        }
    }
}
