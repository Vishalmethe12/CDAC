package Cdac.Prob1;

public class InstanceCounter {
		static int instanceCount;
		
		public InstanceCounter() {
			instanceCount++;
		}
		
		public static void main(String[] args) {
			InstanceCounter i1=new InstanceCounter();
			InstanceCounter i2=new InstanceCounter();
			InstanceCounter i3=new InstanceCounter();
			InstanceCounter i4=new InstanceCounter();
			
			System.out.print("Number of Instance created:"+InstanceCounter.instanceCount);
			
		}
}
