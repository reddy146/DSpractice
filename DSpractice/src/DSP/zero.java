package DSP;

public class zero {

	
		
		int a[]= {5 ,22,55,3,4,};
		
		public void elementmovelast() {
		int t;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
			if(a[i]==0) {
				t=a[i];
				a[i]=a[j];
				a[j]=t;
				
			}
		}
			System.out.println(a[i]);
			
		}
		}
		public void elementmovefirst() {
			System.out.println();
			int t;
			for(int i=0;i<a.length;i++) {
				for(int j=i+1;j<a.length;j++) {
				if(a[j]==0) {
					t=a[i];
					a[i]=a[j];
					a[j]=t;
					
				}
			}
				System.out.println(a[i]);
				
			}
		}
		public void maxNo() {
			int max=0;
			for(int i=0;i<a.length;i++) {
				if(a[i]>max) {
					max=a[i];
				}
			}
			System.out.println(max);
		}
		public void minNo() {
			int min=a[0];
			for(int i=0;i<a.length;i++) {
				
				if(a[i]<min) {
					min=a[i];
				}
			}
			System.out.println(min);
		}
		public void reverse() {
			for(int i=a.length-1;i>=0;i--) {
				System.out.println(a[i]);
			}
		}
		public void smax() {
			int smax=0;
			int max=0;
			int i;
			for( i=0;i<a.length;i++) {
				if(a[i]>max) {
					smax=max;
					max=a[i];
					
				}
				
			}
			System.out.println("second maximum : "+smax);
			
		}
		public void m1() {
			int a[]= new int [2];
			a[0]=0;
			a[1]=1;
			int t;
			for(int i=0;i<10;i++) {
				t=a[0]+a[1];
				a[0]=a[1];
				a[1]=t;
				System.out.println(t);
			}
		}
		
		public void duplicate() {
			int b[]= {2,3,5,2,5,1,6,4};
			for(int i=0;i<b.length;i++) {
				for(int j=i+1;j<b.length;j++) {
					if(b[i]==b[j]) {
						System.out.println(b[i]);
					}
				}
			}
		}
		public void removeDuplicate() {
			int a[]= {2,3,5,1,2,5,6,1,4};
			int k=0;
			int b[]=new int[a.length+1];	
			
			for(int i=0;i<a.length;i++) {
				for(int j=i+1;j<a.length;j++) {
					if(a[i]>a[j]) {
						int t=a[i];
						a[i]=a[j];
						a[j]=t;
					}
					
				}
				System.out.print(a[i]);
				b[k++]=a[i];
			}
			System.out.println();
			
			for(int i=0;i<b.length-1;i++) {
				
					if(b[i]==b[i+1]) {
					
						
						
					}else {
						System.out.println(b[i]);
					}
					
				
				
			}
			
		}
		public static void main(String args[]) {
			zero z=new zero();
		//	z.elementmovelast();
		//	z.elementmovefirst();
		//	z.maxNo();
		//	z.minNo();
		//	z.reverse();
		//	z.smax();
		//	z.m1();
		//	z.duplicate();
			z.removeDuplicate();
			
	}
		
}
