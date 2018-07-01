import java.util.*;

/*
 * Class Pair to represent a pair with an integer and double value.
 */
class Pair {
int first;
double second;
Pair(int x,double y)
{
	this.first=x;
	this.second=y;
}
}


/*
 * Class Gini to calculate split values for continous attributes.
 */
public class Gini {
	 TreeMap<Integer,Integer> tm = new TreeMap<Integer,Integer>();
	 Pair table[][];//A 2D array of type Pair which contains number of ositive and negative examples for a split value.
	
/*
 * A method to calculate gini value for given values and return split value with lowest gini-index.
 * @param	An array with continous values in dataset.
 * @param	An array with corresponding outputs.
 * @return 	returns a split value of type double
 */
	public double gini(int a[],int b[])
	{
		//System.out.println(a[0]);
		String c[] = new String[a.length];
		String d[] = new String[b.length];
		int res[] = new int[a.length];
		int i;
		double threshold=0;
		
		for( i=0;i<c.length;i++)
		{
			c[i]=Integer.toString(a[i]);
		}
		for( i=0;i<d.length;i++)
		{
			d[i]=Integer.toString(b[i]);
		}
		for(i=0;i<c.length;i++)
		{
			StringBuffer sb1 = new StringBuffer(c[i]);
			StringBuffer sb2 = new StringBuffer(d[i]);
			sb1 = sb1.append(sb2);
			c[i] = sb1.toString();	
			res[i] = Integer.parseInt(c[i]);
		}
		
		for(i=0;i<c.length;i++)
		{
			if(tm.containsKey(res[i]))
			{
				int value = tm.get(res[i]);
				value = value+1;
				tm.remove(res[i]);
				tm.put(res[i],value);
			}
			else
			{
				tm.put(res[i],1);
			}
		}
		
		List<Integer> list = new ArrayList<Integer>(tm.keySet());
		TreeSet<Integer> hs = new TreeSet<Integer>();
		for(i=0;i<list.size();i++)
		{
			hs.add(list.get(i)/10);		
		}
		double split1[]=new double[hs.size()+1];
		double split2[]=new double[hs.size()+1];
		Iterator it=hs.iterator();
		i=0;
		while(it.hasNext())
		{
			split1[i]=(int)it.next();
			i++;
		}
		split1[hs.size()]=split1[hs.size()-1];
		split2[0]=split1[0];
		for(i=1;i<hs.size();i++)
		{
			split2[i]=(split1[i-1]+split1[i])/2;
		}
		split2[i]=split1[i];
		table=new Pair[split2.length][3];
		table[0][1]=new Pair(0,0);
		table[split2.length-1][2]=new Pair(0,0);
		for(i=0;i<split2.length;i++)
		{
			table[i][0]=new Pair(i,split2[i]);
			populate(table,split2[i]*10,i);
		}
		
		double gini_indices[]=new double[split2.length];
		for(i=0;i<split2.length;i++)
		{
			
			gini_indices[i]=gini_index(table[i][1],table[i][2]);
		}
		int returnindex = bestsplit(gini_indices);
		return table[returnindex][0].second;
		
	}
	/*
	 * A method to populate the table array for each split value.
	 * @param	A 2D array of Pair that is to be populated.
	 * @param	A split value which is double
	 * @param	an index i.
	 */
	public void populate(Pair[][] table,double value,int i)
	{
		int neg1=0,pos1=0,neg2=0,pos2=0;
		
		 Collection c = tm.keySet();

		Iterator it = c.iterator();
		while(it.hasNext())
		{
			int store = (int)it.next();
			if(value>store)
			{
				if(store%10==0)
				{
					neg1 = neg1 + (int)tm.get(store);
				}
				else
				{
					pos1 = pos1 + (int)tm.get(store);
					//System.out.print(pos1+" ");
				}
				table[i][1]=new Pair(pos1,neg1);
				
			}
			else
			{
				if(store%10==0)
				{
					neg2=neg2+(int)tm.get(store);
				}
				else
				{
					pos2 = pos2 + (int)tm.get(store);
				}
				table[i][2]=new Pair(pos2,neg2);
			}	
		}	
	}
	/*
	 * A method to calculate Gini Index.
	 * 	@param	A Pair type which contains number of positive and negative examples less than a value.
	 * 	@param	A Pair type which contains number of positive and negative examples greater than a value.
	 * 	@return returns a double value which is gini index.
	 */
	public double gini_index(Pair p1,Pair p2)
	{
		int n1 = p1.first;
		double n2 = p1.second;
		int n3 = p2.first;
		double n4 = p2.second;
		double gini1 = (n1+n2)/(n1+n2+n3+n4);
		double gini2 = (n3+n4)/(n1+n2+n3+n4);
		double gini3=0;
		double gini4=0;
		if((n1+n2)==0)
			gini3=0;
		else
			gini3 = 1-((n1*n1)/((n1+n2)*(n1+n2)))-((n2*n2)/((n1+n2)*(n1+n2)));
		if((n3+n4)==0)
			gini4=0;
		else
			gini4 = 1-((n3*n3)/((n3+n4)*(n3+n4)))-((n4*n4)/((n3+n4)*(n3+n4)));
		double result = gini1*gini3 + gini2*gini4;
		return result;
	}
	/*
	 * A method to return best split value which has minimum giniindex.
	 * @param An array of double values which has gini indices of all candidate split values.
	 * @return Index of an element with minimum gini index.
	 */
	public int bestsplit(double a[])
	{
		double min = a[0];
		int minindex=0;
		for(int i=0;i<a.length;i++){
			if(a[i]<min){
				min=a[i];
				minindex=i;
			}
		}
		
		return minindex;
	}
}

