public class Stack{

private int arr[];
private int size;
private int index = 0;
public Stack(int size){
this.size= size;
arr = new int[size];

}

public void push(int element){
    if(isFull()){
        System.out.println("Stack is full");
    }
    arr[index] = element;
    index++;
}

public int pop(){
if (isEmpty()){
    System.out.println("Stack is empty");
}
return arr[--index];
}



public boolean isEmpty(){
    if (index==0){
        return true;
    }
    return false;
    }


public boolean isFull(){
if (index==size){
    return true;
}
return false;
}

public int size(){
    return index;
}

}

