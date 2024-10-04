public class ReturnTypeExample{
	public static void main(String [] args){

		byte ReturnedByteValue = byteType();
		System.out.println("ReturnedByteValue = "+ReturnedByteValue);

		short ReturnedShortValue = ShortType();
		System.out.println("ReturnedShortValue = "+ReturnedShortValue);


		int ReturnedIntValue = IntType();
		System.out.println("ReturnedIntValue = "+ReturnedIntValue);


		long ReturnedLongValue = LongType();
		System.out.println("ReturnedLongValue = "+ReturnedLongValue);


		float ReturnedFloatValue = FloatType();
		System.out.println("ReturnedFloatValue = "+ReturnedFloatValue);


		double ReturnedDoubleValue = DoubleType();
		System.out.println("ReturnedDoubleValue = "+ReturnedDoubleValue);


		char ReturnedCharValue = CharType();
		System.out.println("ReturnedCharValue = "+ReturnedCharValue);


		boolean ReturnedBooleanValue = BooleanType();
		System.out.println("ReturnedBooleanValue = "+ReturnedBooleanValue);



	}

	public static byte byteType (){

		byte byteValue= 10;

		return byteValue;

	}
	public static short ShortType (){

		short shortValue= 10000;

		return shortValue;

	}
	public static int IntType (){

		int a=10;
		int b=30;

		int intValue = a+b;

		return intValue;

	}
	public static long LongType (){

		long longValue= 9898987979l;

		return longValue;

	}
	public static float FloatType(){

		float floatValue= 3.14f;

		return floatValue;

	}
	public static double DoubleType(){

		double doubleValue= 109.14989889999d;

		return doubleValue;

	}
	public static char CharType(){

		char charValue= 'A';

		return charValue;
	}
	public static boolean BooleanType(){

		int value = 20;

		if(value==0){
			return true;
		}
		else{
			return false;
		}

		}
}