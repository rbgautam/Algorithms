using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using AlgoOptionsService.DomainService;

namespace OptionContollerUnitTest
{
    [TestClass]
    public class OptionReaderTests
    {
        [TestMethod]
        public void TestXMLReader()
        {
            OptionsService optionSvc = new OptionsService();
            optionSvc.GetOptionsFromXML(@"Resources\Algolist.xml");
        }
    }
}
