class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        List<Pair> projects = new ArrayList<>();

        // first collect the projects in a list
        for (int i = 0;  i < profits.length; i++) {
            projects.add(new Pair(profits[i], capital[i]));
        }

        // sort the project by capital in ascending order
        projects.sort((p1, p2) -> p1.capital.compareTo(p2.capital));

        // we need a maximum priority queue
        PriorityQueue<Integer> bestProject = new PriorityQueue<>(Collections.reverseOrder());

        int p = 0;


        for (int i = 0; i < k; i++) {

            // first check how many projects are possible to do 
            // in the given constraint that project capital should be less or equal to 
            // the initital capital
            // whatever projects are possible, put the profit of those projects in the queue
            while (p < projects.size() && projects.get(p).capital <= w) {
                bestProject.add(projects.get(p).profit);
                p++;
            }
            
            // check if the queue is empty
            // if empty that means we can do any project
            if (bestProject.isEmpty()) break;

            // now pick the best project with maximum profit 
            // from those available project
            // as soon as you make a profit
            // increase your capital
            w += bestProject.poll();
        }

        return w;
    }
}

class Pair {
    Integer profit;
    Integer capital;

    public Pair (int profit, int capital) {
        this.profit = profit;
        this.capital = capital;
    }
}