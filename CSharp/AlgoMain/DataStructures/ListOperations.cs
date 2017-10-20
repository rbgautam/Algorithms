using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DataStructures
{
    /// <summary>
    /// Interface for the CRUD Operations
    /// </summary>
    public interface ListOperations<T>
    { 
        bool AddFirst(SingleNode<T> newnode);
        SingleNode<T> Find(T finddata);
        bool Update(T olddata, T newdata);
        bool DeleteFirst();
        int GetSize();

    }
}
