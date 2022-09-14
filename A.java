class A 
{
	public static void main(String[] args) 
	{
		System.out.println(Integer.toBinaryString(100));
		System.out.println(Integer.parseInt("1100100",2)); //***** parseInt value "2" represents 1st argument is in the Binary String.
		System.out.println(Integer.parseInt("1100100")); 
	}
}
/* 
decimal to binary
-----------------
100/2 =  50   +  r0
50/2  =  25   +  r0
25/2  =  12   +  r1
12/2  =  6    +  r0
6/2   =  3    +  r0
3/2   =  0    +  r1
Binary string format to 100 : 1100100
   
 
   Binary to decimal
   -----------------
   1100100
 (2 power 0 )*0 = 0
 (2 power 1 )*0 = 0
 (2 power 2 )*1 = 4 * 1 = 4
 (2 power 3 )*0 = 0
 (2 power 4 )*0 = 0  
 (2 power 5 )*1 = 32 *1 = 32
 (2 power 6 )*1 = 64 *1 = 64
 ----------------------------
                          100 
Decimal value to binary string of 1100100  is 100

  */