class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((a,b)-> (b.profit) - (a.profit));
        
        for(int i=0;i<capital.length;i++){
            pq.offer(new Pair(capital[i], profits[i]));
        }
        
        // System.out.println(pq);
        int resCapital = w;
        
        while(k>0){
            List<Pair> temp = new ArrayList<Pair>();
            
            while(pq.size()>0 && pq.peek().capital>resCapital){
                temp.add(pq.poll());
            }
            // System.out.println(temp);
            
            if(pq.size()==0){
                return resCapital;
            }
            
            Pair curr = pq.poll();
            // System.out.println(curr);
            
            resCapital = resCapital + curr.profit;

            for(Pair p: temp){
                pq.offer(p);   
            }
            k--;
        }
        
        return resCapital;
    }
}


class Pair{
    int capital;
    int profit;
    
    public Pair(int capital, int profit){
        this.capital = capital;
        this.profit = profit;
    }
    
    public String toString(){
        return "["+this.capital+", "+this.profit+"]";
    }
}