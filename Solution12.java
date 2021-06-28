class Solution12 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        int num=0;
        
        for(int i=1; i<=n; i++){
            answer[num]=(long)x*i; //int값인 x,n을 (long)으로 형변환
            num++;
        }
        
        return answer;
    }
}
