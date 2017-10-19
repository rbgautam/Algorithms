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
        bool Add(T newitem);
        T Fetch();
        bool Update();
        bool Delete();

    }
}
