// SUSHANT SINHA 

//General approach

class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> ans=new ArrayList<String>();
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5!=0){ans.add("Fizz"); continue;}
            if(i%5==0 && i%3!=0){ans.add("Buzz");continue;}
            if(i%3==0 && i%5==0){ans.add("FizzBuzz");continue;}
            else ans.add(""+i);
        }
        return ans;
    }
}