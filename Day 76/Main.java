// "static void main" must be defined in a public class.
class MyStack{
             ArrayList<Integer> li;
    MyStack(){
         li =  new ArrayList<Integer>();
    }
    void push(int a){
        li.add(a);
    }
    int peek(){
        return li.get(li.size()-1);
    }
    int size(){
        return li.size();
    }
    int pop(){
        return li.remove(li.size()-1);
    }
    void print(){
       for(int i=li.size()-1;i>=0;i--){
           System.out.print(li.get(i)+" ");
       }
    }
        }
public class Main {
   
    public static void main(String[] args) {
        MyStack st = new MyStack();
        st.push(23);
        st.print();
        char ch='\u0000';
        // ch='a';
        System.out.print(ch);
        
    }
}
