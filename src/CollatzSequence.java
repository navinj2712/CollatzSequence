public class CollatzSequence {
    public void collatzSeq(int num) {
        int count = 0;
        System.out.printf(num + " ");
        while(num != 1){
            if(num % 2 == 0){
                num /= 2;
            }else{
                num = (num * 3) + 1;
            }
            System.out.print(num + " ");
            count += 1;
        }
        System.out.print(count);
    }
}
