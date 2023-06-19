public void MaxIndex {
    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        int max = 0;
        int index = 0;
        for(int i=1; i<10; i++) {
            int num = Integer.parseInt(in.readLine());
            if(num <= 0 && num > 100) return;
            if(max < num) {
                index = i;
                max = num;
            }
        }

        System.out.println(max);
        System.out.println(index);
    }
}