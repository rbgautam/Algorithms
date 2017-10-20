using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DataStructures
{
    public class LinkedList<T> : ListOperations<T>
    {
        private SingleNode<T> headNode = null;
        private int size=0;

        public LinkedList(T data)
        {
            headNode = new SingleNode<T>(data,null);
        }

        public bool AddFirst(SingleNode<T> newnode)
        {
            if (size == 0)
                headNode.NextNode = newnode;
            else
            {
                SingleNode<T> firstnode = headNode.NextNode;
                headNode.NextNode = newnode;
                newnode.NextNode = firstnode;
            }
            size ++;
            return true;
        }

        public bool DeleteFirst()
        {
            if (GetSize() == 0)
                return false;
            else
            {
                SingleNode<T> firstNode = headNode.NextNode;

                if (firstNode.NextNode == null)
                {
                    headNode.NextNode = null;
                }
                else
                {
                    headNode.NextNode = firstNode.NextNode;
                }

            }

            return true;
        }

        public SingleNode<T> Find(T finddata)
        {
            SingleNode<T> currNode = headNode;
            while (currNode.NextNode != null) {
                if ((currNode.LinkData).Equals( finddata)) {
                    return currNode;
                }
                currNode = currNode.NextNode;
            }

            return null;
        }

        public int GetSize()
        {
            return size;
        }

        public bool Update(T olddata,T newdata)
        {
            SingleNode<T> currNode = headNode;
            while (currNode.NextNode != null)
            {
                if ((currNode.LinkData).Equals(olddata))
                {
                    currNode.LinkData = newdata;
                    return true;
                }
                currNode = currNode.NextNode;
            }

            return false;

        }
    }
}
