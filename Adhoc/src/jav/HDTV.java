package jav;

import java.util.Comparator;

class HDTV  implements Comparator{
	private int size;
	private String brand;
 
	public HDTV(int size, String brand) {
		this.size = size;
		this.brand = brand;
	}
 

	public int getSize() {
		return size;
	}
 
	public void setSize(int size) {
		this.size = size;
	}
 
	public String getBrand() {
		return brand;
	}
 
	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Integer sz1=((HDTV)o1).getSize();
		Integer sz2=((HDTV)o2).getSize();
		int diff= sz1.compareTo(sz2);
		if(diff!=0)
		{
			return diff;
		}
		else
		{
			String s1= ((HDTV)o1).getBrand();
			String s2=((HDTV)o2).getBrand();
			return s1.compareTo(s2);
		}
		//return 0;
	}


 
	/*@Override
	public int compareTo(HDTV tv) {
 
		if (this.getSize() > tv.getSize())
			return 1;
		else if (this.getSize() < tv.getSize())
			return -1;
		else
			return 0;
	}*/
}
