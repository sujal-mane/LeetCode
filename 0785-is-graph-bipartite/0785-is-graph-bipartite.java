class Solution {
    boolean ans ;
    public void bfs(int i  , int[][] adj , int[] vis){
        Queue<Integer> q= new LinkedList<>();
        vis[i]=0;
        q.add(i);
        while(q.size()> 0){
            int f=q.remove();
            int color= vis[f];
            for(int ele : adj[f]){
                if(vis[ele]== vis[f]){
                    ans =false;
                    return ;
                }
            
            if(vis[ele] ==-1){
                vis[ele]=1-color;
                q.add(ele);
            }
        }
}
    }
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        ans= true;
        int[] vis =new int[n];
        Arrays.fill(vis , -1);
        for(int i=0 ; i< n ;i++){
            if( ans == false ) return ans;
            if(vis[i]==-1) bfs(i , graph , vis);
        }
        return ans;

    }
}