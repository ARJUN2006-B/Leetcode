class Solution {
    public int[] shortestToChar(String s, char c) {
        List<Integer> pos = new ArrayList<>();

for(int i=0;i<s.length();i++){
    if(s.charAt(i)==c){
        pos.add(i);
    }
}

int[] ans = new int[s.length()];

for(int i=0;i<s.length();i++){
    int min = Integer.MAX_VALUE;

    for(int p : pos){
        min = Math.min(min, Math.abs(i-p));
    }

    ans[i] = min;
}
return ans;
    }
}