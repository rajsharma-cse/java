package queue;
class q{
    int[] arr= new int[5];
    int f=-1,r=-1;
    void insert(int val){
        if(f==-1 && r==-1){
            f++; r++;
            arr[r]=val;
        }else{
            r++;
            arr[r]=val;
        }
    }
    void delete(){
        f++;
    }
    void display(){
        for(int i=f;i<=r;i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }
}
public class qu {
    public static void main(String[] args) {
        q que = new q();
        que.insert(10);
        que.insert(20);
        que.insert(30);
        que.display();
        que.delete();
        que.display();
    }
}
