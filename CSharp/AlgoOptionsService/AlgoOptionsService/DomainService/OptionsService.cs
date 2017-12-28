using AlgoOptionsService.Models;
using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Reflection;
using System.Web;
using System.Xml;
using System.Xml.Linq;

namespace AlgoOptionsService.DomainService
{
    public class OptionsService
    {
  //      <ROOT>
  //        <Category type = "Data structures" >
  //          < Algos >
  //              < Name >
        public IEnumerable<AlgoModel> GetOptionsFromXML(string filepath) {
            XElement xmlDoc = ReadOptionsFromFile(filepath);
            IEnumerable<AlgoModel> XmlNodes = null;
            try
            {
                XmlNodes = from algo in xmlDoc.Descendants("Name")
                               select new AlgoModel { Category = algo.Parent.Parent.Attribute("type").Value, Algorithm = algo.Value };//.Descendants("Algos")

               

            }
            catch (Exception ex)
            {

                throw;
            }
            

            return XmlNodes;
        }

        private XElement ReadOptionsFromFile(string filePath)
        {
            XElement xmlDoc = null;
            try
            {


                var fileName = System.Web.HttpContext.Current.Server.MapPath(filePath);
                xmlDoc = XElement.Load(fileName);
                

            }
            catch (Exception ex)
            {

                throw;
            }
            return xmlDoc;
        }
    }
}