package com.execeptionhandling.demo;

public class HandlingMultipleExceptions {

	public static void main(String[] args) {
		try {
			int result = 10 / 8;
			System.out.println("Result : " + result);

			int a[] = { 1, 2, 3, 4, 5 };
			System.out.println("Value at index 5 :" + a[6]);

			String name = null;
			name.equals("user");

			Thread.sleep(1000);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println("Arithmatic Exception :"+e.getMessage());
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			System.out.println("ArrayIndexOutOfBoundsException :"+e.getMessage());
		}
		
		catch (NullPointerException e) {
			// TODO Auto-generated catch block
			System.out.println("NullPointerException :"+e.getMessage());
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("InterruptedException :"+e.getMessage());
		}
		//keep this at last
		// general exception
		catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("Error Occured :"+e.getMessage());
		}
	}

}
