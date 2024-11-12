class Sum{
	public static void main(String args[])
	{
		int num[]={2,3,4,5,6,7,10,8};
		int target=5;
			for(int index=0;index<num.length;index++){
			for(int i=index;i<num.length;i++){
		if((num[index]+num[i]==target))	{
			System.out.println("["+index+","+i+"]");
				}
			}
		}
	}
}