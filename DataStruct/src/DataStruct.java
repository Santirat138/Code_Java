public class DataStruct{
    public static void main(String[] args){
        linkList list1=new linkList();
        for(int i=0;i<=5;i++){
            list1.addFirst(i);
        }
        list1.show();
    }
}
class node{
    int num;
    node next;
    
    node(int numIn){
        num=numIn;
        next=null;
    }
}
class linkList{
    node head=null;
    node nullNode=new node(-1);
    
    void addFirst(int newNum){
        node newNode=new node(newNum);
        if(head!=null){
            newNode.next=head;
        }
        head=newNode;
    }
    void show(){
        node currNode=head;
        while(currNode!=null){
            System.out.printf("%d ", currNode.num);
            currNode=currNode.next;
        }
        System.out.println("");
    }
    node findNum(int target){
        node currNode=head;
        while(currNode!=null){
            if(currNode.num==target){
                return currNode;
            }
            else{
                currNode=currNode.next;
            }
        }
        return nullNode;
    }
    void deleteNum(int target){
        node targetNode=findNum(target);
        if(targetNode!=nullNode){
            if(targetNode==head){
                head=targetNode.next;
                targetNode.next=null;
            }
        }
        else{
            System.out.println("Can't delete.");
        }
    }
}