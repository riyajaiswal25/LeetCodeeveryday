class Pair{
	int score;
	int age;
	public Pair(int score,int age){
		this.score=score;
		this.age=age;
	}
	}

	class Solution {
	public int bestTeamScore(int[] score, int[] age) {

		PriorityQueue<Pair> que=new PriorityQueue<>((a,b)->(a.age==b.age)?(a.score-b.score):(a.age-b.age));

		for(int i=0;i<score.length;i++){
			que.add(new Pair(score[i],age[i]));
		}
		int k=0;
		 while(!que.isEmpty()){
			 Pair newPair=que.peek();
			 score[k]=newPair.score;
			 age[k]=newPair.age;
			que.poll();
			 k++;
		}
		int max=score[0];
		int[] dp=new int[score.length];
		dp[0]=score[0];

		for(int i=1;i<score.length;i++){

			dp[i]=score[i];
			for(int j=i-1;j>=0;j--){
				if(age[j]<age[i]&&score[j]<=score[i]){
				 dp[i]=Math.max(dp[i],score[i]+dp[j]);   
				}else if(age[j]==age[i]){
					dp[i]=Math.max(dp[i],score[i]+dp[j]);
				}
			}
			  max=Math.max(dp[i],max);
		}

	  return max;  
	}
	}