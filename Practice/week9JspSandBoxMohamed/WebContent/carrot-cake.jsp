<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta name="description" content="HTML/CSS/JS-3-Page-Site-carrotCake">
  <meta name="autor" content="Mohamed Mohamed">
  <title>Carrot Cake</title>
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
                <a class="dropdown-item" href="carrot-cake.jsp">Carrot Cake</a>
              </div>
            <li class="nav-item active">
              <a class="nav-link" href="randomMeal.jsp">Make Random Recipe<span class="sr-only">(current)</span></a>
            </li>
          </ul>
        </div>
      </nav>
    </header>
  </div>
  <main role="main">
    <div class="col-md-auto">
      <br> <br> <br> <br> <br>
      <h1 class="text-center">Easy Lasange Recipe</h1>
    </div>

    <div class="col-md-auto">
      <div class="text-center">
        <img src='img/pancake.jpg' class="featurette-image img-fluid mx-auto" alt="resonsive image" width="650px"
          height="500px">
      </div>
    </div>
    <div class="container">
      <div class="row justify-content-center">
        <div class="col-md-7">
          <h2 class='text-center'><br>Ingredients</h1>
            <ul>
              <li> 100g plain flour</li>
              <li> 2 large eggs</li>
              <li> 300ml milk</li>
              <li> 1 tbsp sunflower or vegetable oil, plus a little extra for frying</li>
              <li> lemon wedges to serve (optional)</li>
              <li> caster sugar to serve (optional)</li>
            </ul>
        </div>
      </div>

      <div class="container">
        <div class="row justify-content-center">
          <div class="col-md-7">
            <h2 class="text-center">Cooking Method</h2>
            <p class="text-center"><br>Cooking made simple</p>
            <ul>
              <li>STEP 1 Put 100g plain flour, 2 large eggs, 300ml milk, 1 tbsp sunflower or vegetable oil and a pinch
                of salt into a bowl or large jug, then whisk to a smooth batter.</li>
              <li>STEP 2 Set aside for 30 mins to rest if you have time, or start cooking straight away.</li>
              <li>STEP 3 Set a medium frying pan or crêpe pan over a medium heat and carefully wipe it with some oiled
                kitchen paper.</li>
              <li>STEP 4 When hot, cook your pancakes for 1 min on each side until golden, keeping them warm in a low
                oven as you go.</li>
              <li>STEP 5 Serve with lemon wedges and caster sugar, or your favourite filling
              </li>
              <h3><a href="https://www.bbcgoodfood.com/recipes/easy-pancakes">Source</a></h3>
              <br> <br> <br> <br>
            </ul>
          </div>
        </div>
      </div>
  </main>
  <!-- comment to push to github final -->
</body>

</html>