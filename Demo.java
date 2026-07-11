//Stack over All execution
/*class Stack{
	private int[] dataArray;
	private int nextIndex;
	private double loadFact;
	private int initSize;
	
	Stack(int initSize, double loadFact){
		dataArray=new int[initSize];
		nextIndex=0;
		this.loadFact=loadFact;
		this.initSize=initSize;
	}
	private void extendsArray(){
		int tempDataArray[]=new int[dataArray.length+(int)(loadFact*dataArray.length)];
		for (int i = 0; i < dataArray.length; i++){
			tempDataArray[i]=dataArray[i];
		}
		dataArray=tempDataArray; 
	}
	private boolean isFull(){
		return nextIndex>=dataArray.length;
	}
	public int peek(){
		return isEmpty() ? -1: dataArray[nextIndex-1]; 
	}
	public int poll(){
		return isEmpty() ? -1:  dataArray[--nextIndex]; 
	}
	public void push(int data){
		if(isFull()){
			extendsArray();
		}
		dataArray[nextIndex++]=data;
	}
	public void trimToSize(){
		int[] tempDataArray=new int[size()];
		for (int i = 0; i < dataArray.length; i++){
			tempDataArray[i]=dataArray[i];
		}
		dataArray=tempDataArray;
	}
	public int size(){
		return nextIndex;
	}
	public void trim(){
		//
		//
	}
	public void clear(){
		dataArray=new int[initSize];
		nextIndex=0;
	}
	public void pop(){
		if(!isEmpty()){
			nextIndex--;
		}
	}
	public int search(int data){
		//Insert code here
		return -1;
	}
	public void display(){
		System.out.print("[");
		for (int i =nextIndex-1; i>=0 ; i--){
			System.out.print(dataArray[i]+", ");
		}
		System.out.println(isEmpty()? "empty]":"\b\b]");
	}
	public boolean isEmpty(){
		return nextIndex<=0;
	}
	public int capacity(){
		return dataArray.length;
	}
}
class Demo{
	public static void main(String args[]){
		Stack s1=new Stack(12,0.25);
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
		s1.display(); //[120,110,100,90...50,40,30,20,10]
		System.out.println("Size      : "+s1.size()); //12
		
		int topData;
		topData=s1.peek();
		System.out.println("Top Data : "+topData); //120
		System.out.println("After calling peek()...");
		s1.display(); //[120,110,100,90...50,40,30,20,10]
		
		topData=s1.poll();
		System.out.println("Top Data : "+topData); //120
		System.out.println("After calling poll()...");
		s1.display(); //[110,100,90...50,40,30,20,10]
		
	}
}
*/

//Queue Execution
/*
class Queue{
	private int[] dataArray;
	private int nextIndex;
	private double loadFact;
	private int initSize;
	
	Queue(int initSize, double loadFact){
		dataArray=new int[initSize];
		nextIndex=0;
		this.loadFact=loadFact;
		this.initSize=initSize;
	}
	private void extendsArray(){
		int tempDataArray[]=new int[dataArray.length+(int)(loadFact*dataArray.length)];
		for (int i = 0; i < dataArray.length; i++){
			tempDataArray[i]=dataArray[i];
		}
		dataArray=tempDataArray; 
	}
	private boolean isFull(){
		return nextIndex>=dataArray.length;
	}
	public int peek(){
		return isEmpty() ? -1: dataArray[0]; 
	}
	public int poll(){
		if(!isEmpty()){
			int firstData=dataArray[0];
			remove();
			return firstData;
		}
		return -1;
	}
	
	public void add(int data){
		if(isFull()){
			extendsArray();
		}
		dataArray[nextIndex++]=data;
	}
	public void trimToSize(){
		int[] tempDataArray=new int[size()];
		for (int i = 0; i < dataArray.length; i++){
			tempDataArray[i]=dataArray[i];
		}
		dataArray=tempDataArray;
	}
	public int size(){
		return nextIndex;
	}
	public void trim(){
		//
		//
	}
	public void clear(){
		dataArray=new int[initSize];
		nextIndex=0;
	}
	public void remove(){
		if(!isEmpty()){
			for (int i = 0; i <nextIndex-1; i++){
				dataArray[i]=dataArray[i+1];
			}
			nextIndex--;
		}
	}
	public int search(int data){
		for (int i = 0; i < nextIndex; i++){
			if(dataArray[i]==data){
				return i;
			}
		}
		return -1;
	}
	public void display(){
		System.out.print("[");
		for (int i = 0; i < nextIndex; i++){
			System.out.print(dataArray[i]+", ");
		}
		
		System.out.println(isEmpty()? "empty]":"\b\b]");
	}
	public boolean isEmpty(){
		return nextIndex<=0;
	}
	public int capacity(){
		return dataArray.length;
	}
}
class Demo{
	public static void main(String args[]){
		Queue q1=new Queue(12,0.25);
		q1.add(10);
		q1.add(20);
		q1.add(30);
		q1.add(40);
		q1.add(50);
		q1.add(60);
		q1.add(70);
		q1.add(80);
		q1.add(90);
		q1.add(100);
		q1.add(110);
		q1.add(120);
		q1.display(); //[10,20,30,40,50 ........120]
		System.out.println("Size      : "+q1.size()); //12
		
		q1.remove();
		q1.display();
		System.out.println("Size      : "+q1.size()); //11
		System.out.println("Index of 50 : "+q1.search(50)); //3
		
		int firstData  =q1.peek();
		System.out.println("Size : "+q1.size());
		System.out.println("Index of 50: "+q1.search(50));
		q1.display();//[20,30,40,50,.......120]
		
		firstData = q1.poll();
		System.out.println("First Data: "+firstData);
		System.out.println("Callingf after poll()....");
		q1.display();//[30,40,50,.......120]
			
	}
}
*/

//List Execution
/*
class List{
	
	List(int initSize,double loadFact){
		dataArray = new int[initSize];
		nextIndex = 0;
		this.loadFact = loadFact;
		this.initSize = initSize;
	}
	private void extendsArray(){
	int tempDataArray[] =new int[dataArray.length+(int)(loadFact*dataArray.length)];
	for(int i =0;i<dataArray.length;i++){
	tempDataArray[i] = dataArray[i];	
	}	
		dataArray = tempDataArray;
	}
	
	private boolean isFull(){
	return nextIndex>=dataArray.length;	
		
	}
	
	public void add(int data){
	if(isFull()){
	extendsArray();		
	}
	dataArray[index++] = data;	
	}
	
	public void add(int index,int data){
		if(isFull()){
		extendsArray();		
		}
		if(index>=0&&index <=nextIndex){
		for(int i = nextIndex-1;i>=nextIndex;i--){
		dataArray[i+1]=dataArray[i];	
		}
		dataArray[index] = data;
		nextIndex++;	
		}
		
	}
	
	public void addFirst(int data){
		add(0,data);	
	}
	public void addLast(int data){
	add(nextIndex,data);		
	}
	
	public void trimToSize(){
	int[] tempDataArray = new int[dataArray.length];
	for(int i=0;i<dataArray.length;i++){
		tempDataArray[i] = dataArray[i];
	}	
		dataArray = tempDataArray;
	}
	
	public int size(){
		return nextIndex;
	}
	
	public void clear(){
	dataArray = new int[initSize];\
	nextIndex=0;	
	}
	
	public void remove(int index){
		if(!isEmpty()){
			if(index>=0 && index<nextIndex){
				for(int i=index;i<nextIndex-1;i++){
				dataArray[i] = dataArray[i+1];	
				}
			}
			nextIndex--;	
		}
		
	}
	
	public void removeFirst(){
	remove(0);	
	}
	public void removeLast(){
	remove(size()-1);	
	}
	public void remove(int startIndex, int endIndex){
		//need to code
	}
	public void display(){
	System.out.print("[");
	for(int i=0;i<nextIndex;i++){
	System.out.print(dataArray[i]+", ");	
	}
	System.outy.println(isEmpty()?"empty]":"\b\b]");	
	}
	public void display(int start){
		
	}
	public void display(int startIndex,int endIndex){
		
	}
	public int get(int index){
		return -1;
	}
	public int getFirst(){
		return -1;
	}
	
	public int getLast(){
		return -1;
	}
	public boolean isEmpty(){
		return nextIndex<=0;
	}
	
	public int capacity(){
		return dataArray.length;
	}

	
}

class Demo{
	public static void main(String args[]){
		List list1=new List(12,0.25);
		list1.add(10); //Insertion order
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		list1.add(60);
		list1.add(70);
		list1.add(80);
		list1.add(90);
		list1.display(); //[10,20,30,40,50 ........90]
		
		list1.removeFirst();
		list1.removeLast();
		list1.display(); //[20,30, ........90]
		
	}
	
	}

*/

//List Example

class Student{
	private String id;
	private String name;
	private int prfMarks;
	private int dbmsMarks;
	
	Student(){
		
	}
	
	Student(String id,String name,int prfMarks,int dbmsMarks){
		this.id = id;
		this.name = name;
		this.prfMarks = prfMarks;
		this.dbmsMarks = dbmsMarks;
	}
	
	public String getId(){
	return id;	
	}
	
	public boolean equals(Student student){
	return id.equalsIgnoreCase(student.id);	
	}
	public String toString(){
	return "["+id+","+name+","+prfMarks+","+dbmsMarks+"]";	
	}

}

class StudentList{
	private Student[] studentArray;
	private int nextIndex;
	private double loadFact;
	private int initSize;
	
	private void extendsArray(){
	Student tempStudentArray[]=new Student[studentArray.length+(int)(loadFact*studentArray)];
	for(int i =0;i<studentArray.length;i++){
			tempStudentArray[i]=studentArray[i];
	}
	studentArray = tempStudentArray;
	}
	
	private boolean isFull(){
	return nextIndex>=studentArray.length;	
	}
	
	public void add(Student student){
		if(isFull()){
			extendsArray();
		}
		studentArray[index] = student;
		nextIndex++;
	}
	
	public void add(int index,Student student){
		if(isFull()){
		extendsArray();	
		}
		if(index >=0 && index <= nextIndex){
		for(int i=nextIndex-1;i >=index;i--){
		studentArray[i+1] = studentArray[i];	
		}
			studentArray[index] = student;
			nextIndex++;
			
		}
		
	}
	public void addFirst(Student student){
		add(0,student);
	}
	public void addLast(Student student){
		add(nextIndex,student);
	}
	public void trimSize(){
		Student[] tempStudentArray = new Student[size()];
		for (int i = 0; i < studentArray.length; i++){
			tempStudentArray[i]=studentArray[i];
		}
		studentArray=tempStudentArray;
	}
	
	public int size(){
		return nextIndex;
	}
	
	public void clear(){
	studentArray = new Student[initSize];
	nextIndex=0;	
	}
	
	public void remove(int index){
		if(isEmpty()){
		if(index>=0;&&index < nextIndex){
		for(int i =index;i<nextIndex-1;i++){
			studentArray[i] = studentArray[i+1];
		}	
		}	
		nextIndex--;	
		}
	}
	
	public void removeFirst(){
		remove(0);
	}
	public void removeLast(){
		remove(size()-1);
	}
	
	public void display(){
	System.out.print("{");
	for(int i= 0;i<nextIndex;i++){
	System.out.print(studentArray[i].toString()+", ");	
	}
	System.out.println(isEmpty()?"empty]":"\b\b}");	
		
	}
	
	public void display(int start){
		
	}
	public void display(int startIndex, int endIndex){
		
	}
	public Student get(int index){
		return null;
	}
	public Student getFirst(){
		return null;
	}
	public Student getLast(){
		return null;
	}
	public boolean isEmpty(){
		return nextIndex<=0;
	}
	public int capacity(){
		return studentArray.length;
	}
	
	public boolean remove(Student student){
	int index = search(student);
	remove(index);
	return index !=-1;	
		
	}
	
	
	
}




class Demo{
	public static void main(String args[]){
		StudentList stList - new StudentList(12,0.25);
		stList.add(new Student("S0001","Nimal",65,67));
		stList.add(new Student("S0002","Amal",85,70));
		stList.add(new Student("S0003","Bimal",35,30));
		stList.add(new Student("S0004","Ramal",55,70));
		stList.add(new Student("S0005","Anil",95,90));
		stList.display(); //{[S0001,Nimal,65,76], [S0002","Amal",85,70]...}
		stList.remove(new Student("S0003","Bimal",35,30));
		stList.display(); //{[S0001,Nimal,65,76], [S0002","Amal",85,70]...}
		
	}
	
	
}









