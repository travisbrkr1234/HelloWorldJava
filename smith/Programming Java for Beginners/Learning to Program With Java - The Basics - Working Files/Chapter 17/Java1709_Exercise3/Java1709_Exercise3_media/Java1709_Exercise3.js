


function OnLoad()
{
	
	
	   timerInit();
	
}
function SeekTime( Time )
{   
   if( document.QuickTimePlayer == undefined || document.QuickTimePlayer == null )
   {
      return;
   }
   
   document.QuickTimePlayer.SetTime( Time * 600 );
   
   document.QuickTimePlayer.Play();
}


function ScrollToIndex( DivID, destIndex ) 
{
   var nDestYCoord = destIndex.offsetTop; 
   var thisNode    = destIndex; 
   
   while ( thisNode.offsetParent && ( thisNode.offsetParent !=  document.body) ) 
   { 
      thisNode     = thisNode.offsetParent; 
      nDestYCoord += thisNode.offsetTop; 
   }

   nCurWindowYPos = GetCurrentScrollYPos( DivID.id );

   //Only scroll if it's needed..
   if( destIndex.offsetTop + destIndex.offsetHeight > DivID.clientHeight )
   {      
      nDestYCoord -= DivID.clientHeight;
      
      if( nDestYCoord > DivID.scrollTop )
      {
         DivID.scrollTop = nDestYCoord;
      }
   }
}

function GetCurrentScrollYPos( DivID ) 
{ 
   var aDivs = document.body.getElementsByTagName("DIV");

   for ( var i=0; i < aDivs.length; i++ ) 
   { 
      var Div = aDivs[i]; 

      if ( Div.id == DivID ) 
      { 
         return Div.scrollTop
      }
   }

   return 0;
}


function timerInit() 
{
   //Sets the timer to check every .1 second
   window.setInterval("timer()", 100);
}

function timer() 
{  
   if( document.QuickTimePlayer == undefined || document.QuickTimePlayer == null )
   {
      return;
   }
   
   var StartTime = document.QuickTimePlayer.GetTime();
   var destIndex = null;
   
   var curTime = QuickTimePlayer.GetTime() / 600;
      if( curTime >= 0.000000 && curTime < 332.666000 )
      {
         document.getElementById('Index0').style.backgroundColor = '#ffffcc';
         destIndex = document.getElementById('Index0');
      }
      else
      {
         document.getElementById('Index0').style.backgroundColor = '';
      }

   
   var EndTime = document.QuickTimePlayer.GetTime();
   
   if( destIndex != null && StartTime != EndTime )
   {
      ScrollToIndex( document.getElementById('indexlinks'), destIndex );
   }
}



