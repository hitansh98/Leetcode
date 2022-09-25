class MyCircularQueue {
    int[] arr;
    // int front;
    // int rear;
    public MyCircularQueue(int k) {
        arr = new int[k];
        Arrays.fill(arr, -1);
    }
    
    public boolean enQueue(int value) {
        if(arr[0]!=-1){
            return false;
        }
        
        int size = arr.length;
        
        for(int i=size-1;i<size;i--){
            if(arr[i]!=-1){
                continue;
            }
            else{
                arr[i] = value;
                break;    
            }
        }
        return true;
        
    }
    
    public boolean deQueue() {
        if(arr[arr.length-1]==-1){
            return false;
        }
        
        int size = arr.length;
        
        for(int i=size-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        
        arr[0] = -1;
        return true;
    }
    
    public int Front() {
        if(arr[arr.length-1]==-1){
            return -1;
        }
        
        return arr[arr.length-1];
    }
    
    public int Rear() {
        if(arr[arr.length-1]==-1){
            return -1;
        }
        int size = arr.length;
        for(int i=size-1;i>=0;i--){
            if(arr[i]==-1){
                return arr[i+1];
            }
        }
        
        return arr[0];
    }
    
    public boolean isEmpty() {
        if(arr[arr.length-1]==-1){
            return true;
        }
        return false;
    }
    
    public boolean isFull() {
        if(arr[0]!=-1){
            return true;
        }
        
        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */