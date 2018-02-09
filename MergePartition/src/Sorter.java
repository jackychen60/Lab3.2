import java.util.Arrays;

//Jacky Chen 
//Period 2
public class Sorter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] test1 = { "apple", "banana", "dog", "egg", "grape", "poop" };
		String[] test2 = { "cat", "umbrella", "van", "watermelon", "yoyo", "zebra"};
		long start = System.nanoTime();
		merge(test1, test2);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("Merge Took :" + time + "nanoseconds");
		System.out.println(Arrays.toString(merge(test1, test2)));
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
	/*public static int partition(int[]list)
	{
		
	}
*/
}


