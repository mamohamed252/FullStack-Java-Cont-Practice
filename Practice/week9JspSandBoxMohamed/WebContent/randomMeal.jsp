<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta name="description" content="HTML/CSS/JS-3-Page-Site-randomMeal">
  <meta name="autor" content="Mohamed Mohamed">
  <title>Random Meal Generator</title>
  <!-- Bootstrap links-->
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
    integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">

  <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
    integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
    crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
    integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
    crossorigin="anonymous"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"
    integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI"
    crossorigin="anonymous"></script>

  <link rel="stylesheet" href="css/style.css">
</head>
<body>
  <div>
    <header>
      <nav class="navbar navbar-expand-lg navbar-dark fixed-top  bg-dark">
          <a class="navbar-brand" href="index.html">Food Tour 101</a>
          <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav"
            aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" id="navbarNav">
              <ul class="navbar-nav mr-auto">
                <li class="nav-item">
                  <a class="nav-link" href="index.html">Home</a>
                </li>
                <li class="nav-item dropdown">
                  <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown"
                    aria-haspopup="true" aria-expanded="false">
                    Select Recipe
                  </a>
                  <div class="dropdown-menu" aria-labelledby="navbarDropdown">

                    <a class="dropdown-item" href="chicken.jsp">Chicken Fajita</a>
                    <a class="dropdown-item" href="lasagne.jsp">Lasagne</a>
                    <a class="dropdown-item" href="pancake.jsp">Pancakes</a>
                    <a class="dropdown-item" href="Affogato.jsp">Carrot Cake</a>
                  </div>
                  <li class="nav-item active">
                    <a class="nav-link" href="randomMeal.jsp">Make Random Recipe<span class="sr-only">(current)</span></a>
                  </li>
              </ul>
            </div>
        </nav>
      </header>
  </div>
   <!--moving text lower from nav bar using br  -->
  <br> <br> <br> <br>
    <div class="container">
    <div class="row justify-content-center">
      <div class="col-md-7">
        <h2 class="text-center">Want to create a random recipe?</h2>
        <div class="text-center">
          <br>
          <button id="Create">Create Recipe</button>
          <p class="text-center" id="answer">Click to start!</p>
        </div>
      </div>
    </div>
    </div>
    <div class="container">
      <div class="row justify-content-center">
        <div class="signup">
          <h2 class="">Continue Eating! Sign Up Now! </h2>
          <form>
            <div class="col-md-4">
              <div class="form-group">
                <!-- validation regex -->
                <label for="exampleInputEmail1">Email address</label>
                <input type="email" required pattern="[a-z0-9._%+-]{1,10}@[a-z0-9.-]{1,10}.[a-z]{2,3}$" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp "
                  placeholder="Enter email">
                <small id="emailHelp" class="form-text text-muted">Submit to Eating!</small>
                <button type="submit" formaction="signUpDone.html" class="btn btn-primary mb-2">Submit</button>
              </div>
            </div>
        </div>
        <!-- <h2>Click the button to be assigned </h2>
        <button id="Create">Create</button>
        <p id="answer">links back to recipe</p> -->
        <script>
          document.getElementById("Create").addEventListener("click", randomButton);

          function randomButton() {
            var x = Math.floor((Math.random() * 5) + 1);
            var cheater = false;
            if (cheater != true) {
              if (x == 1) {
                cheater = true;
                return document.getElementById("answer").innerHTML = '<a href="chicken.html">Chicken Fajita</a>';
              }
              else if (x == 2) {
                cheater = true;
                return document.getElementById("answer").innerHTML = '<a href="lasagne.html">Lasagne</a>';
              }
              else if (x == 3) {
                cheater = true;
                return document.getElementById("answer").innerHTML = '<a href="pancake.html">Pancake</a>';
              }
              else if (x == 4) {
                cheater = true;
                return document.getElementById("answer").innerHTML = '<a href="carrot-cake.html">Carrot Cake</a>';
              }
              else {
                cheater = true;
                return document.getElementById("answer").innerHTML = " Got a sweet tooth or craving somthing spicy? Click again.";
              }
            }
            else {
              alert('Lets start cooking a random meal!')
            }

          }
          function randomizer() {

            randomButton(x)
          }

        </script>
        <!-- comment to push to github final -->
</body>
</html>