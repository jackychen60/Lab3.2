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
		
		for(int i=0;i<=list1.length;i++)
		{
			int a=0;
			
			for(int j=0;j<list2.length;j++)
				{
				if(list1[i].compareTo(list2[j])>0)
				{
					empty[a]=list1[i];
					a++;
									}
				if(list1[i].compareTo(list2[j])<0)
				{
					empty[a]=list2[j];
					a++;
									}
					}
		}
		return empty;
		
	}
	/*public static int partition(int[]list)
	{
		
	}
*/
}
