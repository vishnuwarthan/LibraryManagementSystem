<%-- 
    Document   : addSub
    Created on : 08/08/2018, 1:40:28 PM
    Author     : Saruga
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
* {
    box-sizing: border-box;
}
button[type=submit]{
  background-color: #4CAF50;
    color: white;
    padding: 12px 20px;
    border: none;
    border-radius: 4px;
    cursor: pointer;
    float:contour; 
}
.button {
    position: absolute;
    top: 50%;
}
button[type=reset]{
  background-color: #4CAF50;
    color: white;
    padding: 12px 20px;
    border: none;
    border-radius: 4px;
    cursor: pointer;
    float:contour; 
}
.button {
    position: absolute;
    top: 50%;
}
input[type=text], select, textarea {
    width: 100%;
    padding: 12px;
    border: 1px solid #ccc;
    border-radius: 4px;
    resize: vertical;
}

label {
    padding: 12px 12px 12px 0;
    display: inline-block;
}

input[type=submit] {
    background-color: #4CAF50;
    color: white;
    padding: 12px 20px;
    border: none;
    border-radius: 4px;
    cursor: pointer;
    
}

button[type=submit]:hover {
    background-color: #45a049;
}

.container {
    border-radius: 5px;
    background-color: #f2f2f2;
    padding: 20px;
    margin: auto;
    padding: 10px;
    width: 50%
}

.col-25 {
    float: left;
    width: 25%;
    margin-top: 6px;
}

.col-75 {
    float: left;
    width: 75%;
    margin-top: 6px;
}

/* Clear floats after the columns */
.row:after {
    content: "";
    display: table;
    clear: both;
}

/* Responsive layout - when the screen is less than 600px wide, make the two columns stack on top of each other instead of next to each other */
@media screen and (max-width: 600px) {
    .col-25, .col-75, input[type=submit] {
        width: 100%;
        margin-top: 0;
    }
}
</style>
    </head>
    <body>
        <h4 style="font-size:60px;"><center>ADD SUB CLASSIFICATION</center></h4>

<div class="container">
  <form action="addSubController" method="post">
    <div class="row">
      <div class="col-25">
        <label for="Sub Classification Id">Sub Classification Id</label>
      </div>
      <div class="col-75">
        <input type="text" id="subClassificationId" name="subClassificationId" placeholder="Sub Classification Id...">
      </div>
    </div>
      
	<div class="row">
      <div class="col-25">
        <label for="Sub Classification Name">Sub Classification Name</label>
      </div>
      <div class="col-75">
        <input type="text" id="subClassificationName" name="subClassificationName" placeholder="Sub ClassificationName...">
      </div>
    </div>
	<div class="row">
    
     <div class="row">
      <div class="col-25">
        <label for="Main Classification Id">Main Classification Id</label>
      </div>
      <div class="col-75">
        <input type="text" id="mainClassificationId" name="mainClassificationId" placeholder="Main Classification Id...">
      </div>
    </div>
           
            <button type="submit" value="">Add</button>
                
               
                <button type="reset">RESET</button>
            
                </div>
          
           
	  </div>
	  
         
  </form>
 </body>
</html>

