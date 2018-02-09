import java.util.Arrays;

//Jacky Chen 
//Period 2
public class Sorter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] test1 = { "apple", "cucumber", "microsoft", "zorro" };
		String[] test2 = { "banana", "cherry", "mahogany", "oreos", "pinata"};
		int[] test3 = {3,4,2,7,12,22,0,1};
		//Merge Test
		long start = System.nanoTime();
		String[]  mergeResult=merge(test1, test2);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("Merge Took :" + time + "nanoseconds");
		System.out.println(Arrays.toString(mergeResult));
		
		//Partition Test
		start = System.nanoTime();
		int pivotFinalPos=partition(test3);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Partition Took :" + time + "nanoseconds");
		System.out.println("Final Pivot Postition"+ " "+ pivotFinalPos);
		
		
	}
	public static String[] merge(String[]list1,String[]list2)
	{
		
		String empty[] = new String[list1.length + list2.length];
		int i=0;
		int li=0;
		int ri=0;
		while((li<list1.length)&&(ri<list2.length))
		{
			if(list1[li].compareTo(list2[ri])>0)
			{
				empty[i]=list2[ri];
				ri++;
				i++;
			}
			else if(list1[li].compareTo(list2[ri])<0) 
			{
				empty[i]=list1[li];
				li++;
				i++;
			}
		}
		while(li<list1.length)
		{
			empty[i]=list1[li];
			li++;
			i++;
			
		}
		while(ri<list2.length)
		{
			empty[i]=list2[ri];
			ri++;
			i++;
		}
		return empty;
		
	}
	public static int partition(int[]list)
	{
		int pivot =list[0];
		int i=0;
		int j=list[list.length-1];
		while(pivot>list[i])
		{
			SwapInt(list,pivot,i);
			i++;
		}
		while(pivot<list[j])
		{
			SwapInt(list,pivot,j);
			j--;
		}
		return pivot;
		
	}

	public static void SwapInt(int[] arr, int index1, int index2) {
		int x = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = x;
	}
}


