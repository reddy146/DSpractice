package DSP;

public class Array {

	
		
		int a[]= {5 ,22,55,3,4,};
		public void sum() {
			int sum=0;
			for(int i=0;i<a.length;i++) {
				sum=sum+a[i];
			}
			System.out.println("total sum :"+ sum);
		}
		public void sorting() {
			int t;
			for(int i=0;i<a.length;i++) {
				t=0;
				for(int j=i+1;j<a.length;j++) {
					if(a[i]>a[j]) {                   //if(a[i]<a[j])decreasing
						t=a[i];
						a[i]=a[j];
						a[j]=t;
					}
				}
				System.out.println(a[i]);
			}
		}
		
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
		public void fibonacci() {
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
		public void removeelement() {
			int d=3;
			int a[]= {2,1,3,4,5,6};
			for(int i=0;i<a.length;i++) {
				if(d==a[i]) {
					
				}else {
					System.out.println(a[i]);
				}
			}
		}
		public void removeposition() {
			int d=3;
			int a[]= {2,1,3,4,5,6};
			for(int i=0;i<a.length;i++) {
				if(d==i) {
					
				}else {
					System.out.println(a[i]);
				}
			}
		}
		public void arrayevenodd() {
			
			int a[]= {7,8,3,4,5,6};
			int b[]=new int [a.length/2];
			int j=0;
			
			for(int i=0;i<a.length;i++) {
				if(a[i]%2==0) {
					System.out.print(a[i]+" ");
				}else {
					
					b[j++]=a[i];
				}
			}
			System.out.println();
			for(int k=0;k<b.length;k++) {
				System.out.print(b[k]+" ");
			}
		}
		public void missing() {
			int a[]= {3,1,6,4,2};
			int n=a.length+1;
			int c=n*(n+1)/2;
			int miss=0;
			for(int i=0;i<a.length;i++) {
				miss=miss+a[i];
			}
			int t=c-miss;
			System.out.println(t);
		}
		public void mergingTwoArrays() {
			int a[]= {1,3,5,7,9};
			int b[]= {2,4,6,8};
			int c[]= new int[a.length+b.length];
			
		}
		public void patternsort() {
			int n=5;
			int j;
			int arr[]= {2,4,6,8,3};
			
			for(int i=0;i<n-1;i++) {
				int k=0;
				for( j=1;j<n;j++) {
					if(arr[k] < arr[j]) {
						System.out.print(arr[k]);
						k++;
					}else  {
						System.out.print(arr[k]);
						int t=arr[k];
						arr[k]=arr[j];
						arr[j]=t;
						k++;
					}
				}
				System.out.println(arr[k]);
				System.out.println();
			}
		}
		
		public static void main(String args[]) {
			Array z=new Array();
		//	z.sum();
		//	z.sorting();
		//	z.elementmovelast();
		//	z.elementmovefirst();
		//	z.maxNo();
		//	z.minNo();
		//	z.smax();
		//	z.reverse();
		//	z.fibonacci();
		//	z.duplicate();
		//	z.removeDuplicate();
		//	z.removeelement();
		//	z.removeposition();
		//	z.arrayevenodd();
		//	z.missing();
		//	z.patternsort();
	}
		
}
