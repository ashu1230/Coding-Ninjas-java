import java.util.*;
public class PQ {
	// Complete this class
    private ArrayList<Integer> heap;
    
    public PQ(){
        heap = new ArrayList<>();
    }
	boolean isEmpty() {
		if(heap.size()==0)
        {
            return true;
        }
        else
        {
            return false;
        }
	}

	int getSize() {
		return heap.size();
	}

	int getMax() {
		if(isEmpty())
        {
            return Integer.MIN_VALUE;
        }
        return heap.get(0);
	}

	void insert(int element) {
		heap.add(element);
        
        int childIndex = heap.size()-1;
        int parentIndex = (childIndex-1)/2;
        while(childIndex>0)
        {
            if(heap.get(childIndex)>heap.get(parentIndex))
            {
                int temp = heap.get(childIndex);
                heap.set(childIndex,heap.get(parentIndex));
                heap.set(parentIndex,temp);
                childIndex=parentIndex;
                parentIndex= (childIndex-1)/2;
            }
            else
            {
                return;
            }
        }
	}

	int removeMax() {
		if(isEmpty())
        {
            return Integer.MIN_VALUE;
        }
        int ans = heap.get(0);
        heap.set(0,heap.get(heap.size()-1));
        heap.remove(heap.size()-1);
        
        int parentIndex = 0;
        int leftIndex = 2*(parentIndex)+1;
        int rightIndex = 2*(parentIndex)+2;
        int maxIndex = parentIndex;
        
        while(leftIndex<heap.size())
        {
            if(heap.get(leftIndex)>heap.get(maxIndex))
            {
                maxIndex = leftIndex;
            }
            if(rightIndex<heap.size() && heap.get(rightIndex)> heap.get(maxIndex))
            {
                maxIndex = rightIndex;
            }
            if(maxIndex==parentIndex)
            {
                break;
            }
            int temp = heap.get(maxIndex);
            heap.set(maxIndex,heap.get(parentIndex));
            heap.set(parentIndex,temp);
            parentIndex = maxIndex;
            leftIndex = 2*(parentIndex)+1;
            rightIndex = 2*(parentIndex)+2;
            
        }
        return ans;
	}
}
