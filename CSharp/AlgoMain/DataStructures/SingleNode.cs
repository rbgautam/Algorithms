using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DataStructures
{
    public class SingleNode<T>
    {
        private T Data;
        private SingleNode<T> Next;
        public SingleNode(T data, SingleNode<T> next)
        {
            Data = data;
            Next = next;
        }




        public T LinkData
        {
            get { return Data; }
            set { Data= value; }
        }


        public SingleNode<T> NextNode
        {
            get { return Next; }
            set { Next = value; }
        }
    }
}
