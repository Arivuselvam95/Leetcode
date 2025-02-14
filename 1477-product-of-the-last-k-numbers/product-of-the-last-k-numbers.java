class ProductOfNumbers {
    List<Integer> list;
    int product;
    public ProductOfNumbers() {
        list = new ArrayList<>();
        product = 1;
        list.add(product);
    }
    
    public void add(int num) {
        if(num<=0){
            list = new ArrayList<>();
            product = 1;
            list.add(product);
        }else{
            product *= num;
            list.add(product);
        }
    }
    
    public int getProduct(int k) {
        int size = list.size();
        return k<size ? product/list.get(size - k -1) : 0; 
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */