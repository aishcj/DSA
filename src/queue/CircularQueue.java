/*
Input
["MyCircularQueue", "enQueue", "enQueue", "enQueue", "enQueue", "Rear", "isFull", "deQueue", "enQueue", "Rear"]
[[3], [1], [2], [3], [4], [], [], [], [4], []]
Output
[null, true, true, true, false, 3, true, true, true, 4]

Explanation
MyCircularQueue myCircularQueue = new MyCircularQueue(3);
myCircularQueue.enQueue(1); // return True
myCircularQueue.enQueue(2); // return True
myCircularQueue.enQueue(3); // return True
myCircularQueue.enQueue(4); // return False
myCircularQueue.Rear();     // return 3
myCircularQueue.isFull();   // return True
myCircularQueue.deQueue();  // return True
myCircularQueue.enQueue(4); // return True
myCircularQueue.Rear();     // return 4

 */
package queue;

public class CircularQueue {
        private int[] data;
        private int head;
        private int tail;
        private int size;

        public CircularQueue(int k) {
            this.data = new int[k];
            this.size = k;
            this.head=-1;
            this.tail=-1;
        }

        public boolean enQueue(int value) {
            if(isFull())
                return false;
            if(isEmpty())
                head=0;
            tail = (tail+1)%size;
            data[tail] = value;
            return true;
        }

        public boolean deQueue() {
            if(isEmpty())
                return false;
            if(head==tail){
                head=-1;
                tail=-1;
                return true;
            }
            else
                head = (head+1)%size;
            return true;
        }

        public int Front() {
            if(isEmpty())
                return -1;
            else{
                return data[head];
            }

        }

        public int Rear() {
            if(isEmpty())
                return -1;
            else
                return data[tail];
        }


        public boolean isEmpty() {
            return head==-1;
        }

        public boolean isFull() {
            return (tail+1)%size == head;
        }

}
