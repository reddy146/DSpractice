package DSP;

public class Strings {
	
	public void revers() {
	String r="ramchandra";
	for(int i=r.length()-1;i>0;i--) {
		System.out.print(r.charAt(i));
	}
	}
	public void cancat() {
		String r="ram";
		String t=r.concat("chandra");
		System.out.println(t);
	}
	public void indexLength() {
		String r="ramachandra";
		System.out.println(r.lastIndexOf("a"));
		
	}
	public void indexposition() {
		String r="ramachandra";
		System.out.println(r.indexOf("d"));
	}
	public void subString() {
		String r="ramchandra";
		System.out.println(r.substring(4));
		System.out.println(r.substring(4,7));
	}
	public void lowerCase() {
		String r="RAM";
		System.out.println(r.toLowerCase());
	}
	public void upperCase() {
		String r="ram";
		System.out.println(r.toUpperCase());
	}
	public void length() {
		String r="RAM";
		System.out.println(r.length());
	}
	public void equals() {
		String r="RAM";
		String t="ram";
		System.out.println(r.equals(t));
	}
	public void starting() {
		String r="RAM";
		System.out.println(r.startsWith("R"));
	}
	public void ending() {
		String r="RAM";
		System.out.println(r.endsWith("m"));
	}
	public void trim() {
		String r="  ramchandra";
		System.out.println(r.trim());
	}
	public void split() {
		String r="ram chandra reddi";
		String b[]=r.split(" ");
		for(int i=0;i<b.length;i++) {
			
		System.out.println(b[i]);
	}
	}
	public void replace() {
		String r="ram";
		String n=r.replace("a","A");
		System.out.println(n);
	}
	public void replaceall() {
		String r="ram";
		String n=r.replaceAll("ram","chandra");
		System.out.println(n);
	}
	public void insert() {
		StringBuffer r=new StringBuffer("ramchandra");
		StringBuffer n=r.insert(3, "a");
		System.out.println(n);
	}
	public void append() {
		StringBuffer r=new StringBuffer("ramachandra");
		r.append(" reddy");
		System.out.println(r);
		System.out.println(r.hashCode());
		r.append(" 146");
		System.out.println(r);
		System.out.println(r.hashCode());
	}
	public void delete() {
		StringBuffer r=new StringBuffer("ramchandra");
		System.out.println(r.delete(3, 6));
	}
	public static void main(String args[]) {
		Strings s=new Strings();
	    
		//  s.revers();
	    //  s.cancat();
		//  s.indexLength();
		//  s.indexposition();
		//  s.subString();
		//  s.lowerCase();
		//  s.upperCase();
		//  s.length();
		//  s.equals();
		//  s.starting();
		//  s.ending();
		//  s.trim();  // moving frent
		//  s.split();
		//  s.replace();
		//  s.replaceall();
		//  s.insert();
		//  s.append();
		//  s.delete();
	}

}
