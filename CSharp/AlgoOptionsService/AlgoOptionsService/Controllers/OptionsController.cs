using AlgoOptionsService.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Web.Http;

namespace AlgoOptionsService.Controllers
{
    [RoutePrefix("api/options")]
    public class OptionsController : ApiController
    {
        
        [Route("GetOptions")]
        public IEnumerable<AlgoModel> GetOptions()
        {
            DomainService.OptionsService optionService = new DomainService.OptionsService();
            string filepath = @"~\Resources\Algolist.xml";
            
            return optionService.GetOptionsFromXML(filepath);
        }
    }
}
