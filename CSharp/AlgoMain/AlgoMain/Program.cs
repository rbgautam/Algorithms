using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using ConsoleMenu;
namespace AlgoMain
{
    class Program
    {
        static List<Menu> currentMenu = new List<Menu>();
        static Menu menu = new Menu();
        static void Main(string[] args)
        {
            CreateMenu();
            DisplayMenu();
        }

        private static void DisplayMenu()
        {
            menu.DisplayMenu(currentMenu);
            
        }

        private static void CreateMenu()
        {
            Menu newItem = new Menu { MenuId = 1, Displaylabel = "Option 1", Level = 1, ParentLevel = 1 };
            
            currentMenu = menu.AddMenuItem(newItem, currentMenu);


        }
    }
}
