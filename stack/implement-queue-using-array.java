



class MyQueue {

    int front, rear;
    int size=100005;
	int arr[] = new int[size];

    MyQueue()
	{
		front=-1;
		rear=-1;
	}
	
	//Function to push an element x in a queue.
	void push(int x)
	{
	    if(rear==-1){
	        front=0;
	        arr[++rear]=x;
	    }
	    else if(rear<size-1){
	        arr[++rear]=x;
	    }
	} 

    //Function to pop an element from queue and return that element.
	int pop()
	{
	    int val=-1;
	    if(front==-1&&rear==-1){
	        return val;
	    }
	    else if(front==rear){
	        val=arr[front];
	        front=-1;
	        rear=-1;
	    }
	    else{
	        val=arr[front];
	        front++;
	    }
	    return val;
	} 
}


