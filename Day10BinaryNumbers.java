public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        
        String binary = Integer.toBinaryString(n);
        char[] nArray = binary.toCharArray();
        int count = 0;
        int max = 0;
        
        for(Character bin : nArray) {
            if(bin == '1'){
                count++;
                if(count > max) max = count;
            }else{
                count = 0;
            }
        }
        
        System.out.println(max);

        bufferedReader.close();
    }
}
