<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>

<html>
<head>
    
     <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta charset=UTF-8">
    
    <title>Juega Ghost</title>
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
</head>
<body>
<div class="container">
	<div id="playbox" align="center">
		<br>
		<h2>
			Juega Ghost
		</h2>
		
               <P>Juego de estrategia para completar palabras</P>
               
                  <div class="col-sm-4" style="background-color:lavender;">
                <textarea id="string" disabled="disabled" readonly="readonly" rows="2" cols="20">${response.string}</textarea>
		<br>
		<input id="playgame" type="text" maxlength="10" size="5" value="${response.playgame}" />
		<input id="playButton" type="button" class="btn btn-info" value="Ingresa una letra y presiona Enter" onclick="ajaxPost();"/>
		<br>
	</div>
	<br>
	<div class="col-sm-4" style="background-color:lavenderblush;">
        <div id="gameOverMessage" align="center">
		<h4 id="message" align="center">${response.message}</h4>
		<form id="playAgainForm">
			<input id="playAgain" type="submit" value="¿Quieres juegar de nuevo?" />
		</form>
	</div>
        </div>

	</div>
	
	<div>
	 <p>hecho por Alonso Arana
    <a href="mailto:alonso_arana@hotmail.com"><span class="glyphicon glyphicon-envelope"></span></a>
  </p>
	</div>
</body>

 <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script>
	<script type="text/javascript">
	function ajaxPost() {  

		  var playgame = $('#playgame').val();
		  if (playgame ==='') {
			  $('#playgame').focus();
			  return;
		  }
			  
		  $.ajax({  
		    type: "POST",  
		    url: "<c:url value="/ghostgame"/>", 
		    dataType: 'json',
		    data: "playgame=" + playgame ,  
		    
		    success: function(response){  

		      $('#string').val(response.string);
		      $('#message').html(response.message);
		      $('#playgame').val(response.playgame);
		      if (response.message ==='') {
			      $('#play').focus();
		      } else {
		    	  $("#playbox").hide();
		    	  $("#gameOverMessage").show();
		    	  $('#playAgain').focus();
		      }
		    },  
		    
		    error: function(e){  
		      alert('Error: ' + e.statusError);  
		    }  
		  });  
		}  

	$( document ).ready(function() {
		$("#gameOverMessage").hide();
		$('#playgame').focus();
			$('#playgame').keypress(function(event){
			  if(event.keyCode == 13){
			    $('#playButton').click();
			  }
			});
		});
	</script>
</html>