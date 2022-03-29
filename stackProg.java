//package school_stuff;
public class stackProg {
    int stk[];
    int size;
    int top;
    stackProg(int n){
        size=n;
        stk=new int[size];
        top=-1;
    }
    void push(int n){
        if(top==size-1){
            System.out.println("overflow");
        }else{
            top=top+1;
            stk[top]=n;
            System.out.println("element at the "+top+" is "+n);
        }
    }
    int pop(){
        if(top==-1){
            System.out.println("underflow");
            return -999;
        } 
        else{
            int val=stk[top];
            top=top-1;
            return val;
        }         
    }
    void display(){ 
        if(top==-1){
            System.out.println("Stack is empty :/");
        }else{ 
            System.out.println("elements in the stack :- ");
            for(int i=top;i>=0;i--){
                System.out.println(stk[top]+" \n");
            }
        }
    }   
    public static void main(String[] args) {
        stackProg obj =new stackProg(4);
        obj.push(2);
        obj.push(4);
        obj.push(3);
        obj.display();
    }
}
