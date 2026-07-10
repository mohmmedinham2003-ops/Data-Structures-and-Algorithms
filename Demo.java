class Stack{
	
	private int[] dataArray;
	private int nextIndex;
	private double loadFact;
	private int initSize;
	
	Stack(int initSize,double loadFact)({
		dataArray = new int[initSize];
		nextIndex = 0;
		this.loadFact=loadFact;
		this.initSize=initSize;
		
	}
	
	private void extendArray(){
	int tempArray[] = new int[dataArray.length+(int)(loadFact*dataArray.length)];
	for(int i = 0;i<dataArray.length;i++){
		
		tempDataArray[i] = dataArray[i];
		}
		dataArray = tempDataArray;
		
	}
	
}


class Demo{
	public static void main (String args[]){
			Stack s1 = new Stack(12,0.25);
			s1.push(10);
			s1.push(20);
			s1.push(30);
			s1.push(40);
			s1.push(50);
			s1.push(60);
			s1.push(70);
			s1.push(80);
			s1.push(90);
			s1.push(100);
			s1.push(110);
			s1.push(120);
			
			s1.display();
			System.out.println("Size :"+s1.size());
		
		
		
		}
	
	
	
	}
