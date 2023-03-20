package DSP;

import java.io.*;

public class JAVA {
	
	
	
	
	
		
		int a[]= {3,2,5,1,6,4};
		int t;
		int b[]=new int[a.length];
		int k=0;
		public  void m1() {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				 t=0;
				if(a[i]>a[j]) {
				
				
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		
			b[k]=a[i];
			k++;
		}
		
		 DATAS data=new DATAS();
		
	}	
	
	public void rr() {
		DATAS data=new DATAS ();
		int t=0;
		int c[]=new int[b.length];
		for(int i=0;i<b.length;i++) {
			c[t]=b[i];
			t++;
		}
		data.m1(c);
	}
	public static void main(String args[]) {
		JAVA j=new JAVA();
		j.m1();
		j.rr();
	}
		
	}
	

