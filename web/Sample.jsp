<%-- 
    Document   : addBook
    Created on : 18/08/2018, 9:49:50 AM
    Author     : Vishnu
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
* {
    box-sizing: border-box;
    align-content: center;
}
f{
    align-content: center;
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


input[type=reset]:hover {
    background-color: #45a049;
}

.container {
    border-radius: 10px;
    background-color: #f2f2f2;
    padding: 20px;
    margin: auto;
    padding: 20px;
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
        width: 50%;
        margin-top: 0;
    }
}
</style>

<script>
     function selectvalue(form){
         form.action="Listcontroller";
         form.submit();
     }
     
     </script>
    </head>
   
      <div>
        <h style="font-size:40px;"><center>ADD BOOK</center></h>
           </div>
       <div>
           
<div class="container">
    <form action="BookController" method="post" class="f">
    <div class="row">
      <div class="col-25">
        <label for="BookId">Book Id</label>
      </div>
      <div class="col-75">
          <input type="text" id="BookId" name="BookId" placeholder="Book Id..." maxlength="20" >
      </div>
    </div>
	<div class="row">
      <div class="col-25">
        <label for="Title">Title</label>
      </div>
      <div class="col-75">
          <input type="text" id="Title" name="Title" placeholder="Book Title..." maxlength="45" >
      </div>
    </div>
	<div class="row">
      <div class="col-25">
        <label for="Author">Author</label>
      </div>
      <div class="col-75">
          <input type="text" id="Author" name="Author" placeholder="Book Author..." maxlength="45" >
      </div>
    </div>
    <div class="row">
      <div class="col-25">
        <label for="Main Classification">Main Classification</label>
      </div>
      <div class="col-75">
         
        <select  class="form-control" name="mainClassificationId"  onChange="selectvalue(form);" >
                            <c:forEach items="${mainclassificationList}" var="mainstatus">
                                <option value="${mainstatus}" > ${mainstatus}</option>
                            </c:forEach>
                        </select>
      </div>
    </div>
      <div class="row">
      <div class="col-25">
        <label for="SubClassification">Sub Classification</label>
      </div>
      <div class="col-75">
        <select  name="subClassificationId" >
            <c:forEach items="${subclassificationList}" var="substatus">
                                <option value="${substatus}" >${substatus}</option>
                            </c:forEach>
                        </select>
      </div>
    </div>
    <div class="row">
      <div class="col-25">
        <label for="Year Of Publishing">Year Of Publishing</label>
      </div>
      <div class="col-75">
        <input type="text" id="YearOfPublishing" name="YearOfPublishing" placeholder="Year Of Publishing..." >
      </div>
    </div>
      <div class="row">
      <div class="col-25">
        <label for="Last Printed Year">Last Printed Year</label>
      </div>
      <div class="col-75">
        <input type="text" id="LastPrintedYear" name="LastPrintedYear" placeholder="Last Printed Year..." >
      </div>
    </div>
      <div class="row">
      <div class="col-25">
        <label for="ISBN NO">ISBN NO</label>
      </div>
      <div class="col-75">
        <input type="text" id="ISBNNO" name="ISBNNO" placeholder="ISBN NO..." >
      </div>
    </div>
      <div class="row">
      <div class="col-25">
        <label for="No Of Pages">No Of Pages</label>
      </div>
      <div class="col-75">
        <input type="text" id="NoOfPages" name="NoOfPages" placeholder="No Of Pages..." >
      </div>
    </div>
    
    <div class="row">
      <input type="SUBMIT" value="SUBMIT">
      <button type="reset">RESET</button>
    </div>
          </form>

</div>
</div>


 </body> 
</html>

