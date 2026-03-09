import java.util.*;
class SmallerEleList{
	public static void main(String[] args){
	List<Integer> l=new ArrayList<>();
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=0;i<n;i++){
		l.add(sc.nextInt());
	}
	int k=sc.nextInt();
	List <Integer> res=Smallest(l,k);
	for(int i: res)
		System.out.println(i+" ");
	}
	public static List<Integer> Smallest(List<Integer> l,int k){
	List<Integer> res =new ArrayList<>();
	for(int i=0;i<l.size();i++){
		if(l.get(i)<k)	res.add(l.get(i));
	}
	return res;
	}
}