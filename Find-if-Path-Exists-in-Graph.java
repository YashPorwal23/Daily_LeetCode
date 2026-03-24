1class Solution {
2    public boolean validPath(int n, int[][] edges, int src, int des) {
3        HashMap<Integer,List<Integer>> mp = new HashMap<>();
4        for(int i=0;i<n;i++){
5            mp.put(i,new ArrayList<>());
6        }
7        for(int i=0;i<edges.length;i++){
8            mp.get(edges[i][0]).add(edges[i][1]);
9            mp.get(edges[i][1]).add(edges[i][0]);
10        }
11        boolean visited[] = new boolean[n];
12        return BFS(mp,visited,src,des);
13    }
14    public boolean BFS(HashMap<Integer,List<Integer>>mp,boolean visited[],int src,int des){
15        Queue<Integer> q = new LinkedList<>();
16        q.add(src);
17        visited[src]=true;
18        while(!q.isEmpty()){
19            int x = q.poll();
20            if(x==des){
21                return true;
22            }
23            for(int nbrs:mp.get(x)){
24                if(!visited[nbrs]){
25                q.add(nbrs);
26                visited[nbrs]=true;
27                }
28            }
29        }
30        return false;
31    }
32}