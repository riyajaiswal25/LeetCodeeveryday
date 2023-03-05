class Solution {
    class Node{
        int index;
        int cnt;
        public Node(int i,int c){
            this.index = i;
            this.cnt = c;
        }
    }
    
    public int minJumps(int[] arr) {
        int n = arr.length;
        boolean[] visited = new boolean[n];
        Queue<Node> queue = new LinkedList<>();
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int i = 0;i < n;i++){
            map.putIfAbsent(arr[i],new ArrayList<>());
            map.get(arr[i]).add(i);
        }
        queue.offer(new Node(0,0));
        while(queue.size() > 0){
            Node next = queue.poll();
            if(next.index == n - 1){
                return next.cnt;
            }
            if(visited[next.index]){
                continue;
            }
            visited[next.index] = true;
            if(next.index + 1 < n){
                queue.offer(new Node(next.index + 1,next.cnt + 1));
            }

            if(next.index - 1 >= 0){
                queue.offer(new Node(next.index - 1,next.cnt + 1));
            }

            for(int i : map.get(arr[next.index])){

                if(i != next.index && !visited[i]) queue.offer(new Node(i,next.cnt + 1));
            }
            map.get(arr[next.index]).clear();
        }

        return -1;
    }
}