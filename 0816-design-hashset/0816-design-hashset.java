class MyHashSet {
 int size=(int)Math.pow(10,6);
   int arr[]=new int[size+1];
        
    public MyHashSet() {
       
    }
    
    public void add(int key) {
        arr[key]=1;
        
    }
    
    public void remove(int key) {

        arr[key]=0;
        
    }
    
    public boolean contains(int key) {

        return arr[key]==1? true:false;
        
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */