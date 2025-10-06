<html>
    <head>

        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">

        <%--        import Bootstrap--%>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">

    </head>
    <body background="${pageContext.request.contextPath}/resources/images/background.jpg">
    <h1 >user registration</h1>
        <form action="processForm">

            <label>First Name</label><br>
            <input type="text" placeholder="Enter first name" name="Fname"><br>

            <label>Last Name</label><br>
            <input type="text" placeholder="Enter last name" name="Lname"><br>

            <label>Email</label><br>
            <input type="text" placeholder="Enter Email" name="Email"><br>

            <label>DOB</label><br>
            <input type="date" placeholder="DD-MM-YYYY" name="birth_date"><br>

            <label>City</label><br>
            <input type="text" placeholder="Enter city" name="city"><br>

            <input type="submit" class="btn btn-outline-success">
        </form>
    </body>
</html>

