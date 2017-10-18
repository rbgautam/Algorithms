using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleMenu
{
    public class Menu
    {
        public int MenuId { get; set; }
        public string Displaylabel { get; set; }
        public int Level { get; set; }
        public int ParentLevel { get; set; }


        public List<Menu> AddMenuItem(Menu item, List<Menu> currentMenu)
        {
            currentMenu.Add(item);
            return currentMenu;

        }

        public void DisplayMenu(List<Menu> menuitems) {
            //TODO: Add logic to create Hierarchial menu sturcture (eg. Menu with subitems)
            foreach (var item in menuitems)
            {
                string menuItem = String.Format("{0}. {1}",item.MenuId,item.Displaylabel); 
                Console.WriteLine(menuItem);
            }

            Console.ReadLine();

        }
    }
}
