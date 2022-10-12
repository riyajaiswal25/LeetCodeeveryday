class Solution {
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        if (words == null || words.length == 0 || letters == null || letters.length == 0 || score == null || score.length == 0) 
			return 0;
        int []farr=new int[score.length];  //frequency array
        for(char ch:letters){
            farr[ch-'a']++;
        }
        return solution(words,0,score,farr);
    }
    public int solution(String[]words, int idx, int[]score,int []farr){
        if(idx==words.length){  //base case
            return 0;
        }
        int f1=0+solution(words,idx+1,score,farr); //words do not want call therefore zero score of word
        boolean flag=true;
        int f2=0;
        int scoreW=0;
        
        for(int i=0;i<words[idx].length();i++){
            char ch=words[idx].charAt(i);
            farr[ch-'a']--;
            if(farr[ch-'a']<0)
                flag=false;   //checking if word can be made with given letters or not
            scoreW+=score[ch-'a'];
        }
        if(flag==true){
            f2=scoreW+solution(words,idx+1,score,farr); //words want to come therefore score added
        }
        for(int i=0;i<words[idx].length();i++){   //function for backtracking
            char ch=words[idx].charAt(i);
            farr[ch-'a']++;
        }
        return Math.max(f1,f2);  //maximum of both with that word or without that
    }
}