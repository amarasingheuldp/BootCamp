package com5.danushka;

	
public	class ObjectClone{  
		int rollno;  
		String name;  
		  
		ObjectClone(int rollno,String name){  
		this.rollno=rollno;  
		this.name=name;  
		}  
		  
		/*public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
		}  */
		  
		public static void main(String args[]){  
		/*try{ */ 
			ObjectClone s1=new ObjectClone(101,"amit");  
		  
			ObjectClone s2=(ObjectClone)s1.clone();  
		  
			System.out.println(s1.rollno+" "+s1.name);  
			System.out.println(s2.rollno+" "+s2.name);  
		  
		/*}catch(CloneNotSupportedException c){}  */
		  
		}

}
