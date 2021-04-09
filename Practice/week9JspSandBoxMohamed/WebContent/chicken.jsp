<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta name="description" content="HTML/CSS/JS-3-Page-Site-chicken">
  <meta name="autor" content="Mohamed Mohamed">
  <title>Chicken Fajita</title>
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
      <br> <br> <br> <br>
      <h1 class="text-center">Easy Chicken Fajita Recipe</h1>
    </div>
    <div class="col-md-auto">
      <div class="text-center">
        <img src='img/chicken.jpg' class="featurette-image img-fluid mx-auto" alt="resonsive image" width="650px"
          height="500px">
      </div>
    </div>
    <div class="container">
      <div class="row justify-content-center">
        <div class="col-md-7">
          <h2 class='text-center'><br>Ingredients</h1>
            <ul>
              <li> 2 large chicken breasts, finely sliced</li>
              <li> 1 red onion, finely sliced</li>
              <li> 1 red pepper, sliced</li>
              <li> 1 red chilli, finely sliced (optional) For the marinade </li>
              <li> 1 heaped tbsp smoked paprika </li>
              <li> 1 tbsp ground coriander pinch of ground cumin </li>
              <li> 2 medium garlic cloves, crushed </li>
              <li> 4 tbsp olive oil </li>
              <li> 2 large chicken breasts, finely sliced </li>
              <li> 2 large chicken breasts, finely sliced </li>
            </ul>
            <h3 class="text-center">To serve</h3>
            <p class="text-center">
              6 medium tortillas
              bag mixed salad
              230g tub fresh salsa<br>
        </div>
      </div>
    </div>

    <div class="container">
      <div class="row justify-content-center">
        <div class="col-md-7">
          <h3 class='text-center'><br>Cooking Method</h3>
          <p class="text-center"><br>Cooking made simple </p>
          <ul>
            <li>STEP 1 Heat oven to 200C/180C fan/gas 6 and wrap 6 medium tortillas in foil.</li>
            <li>STEP 2 Mix 1 heaped tbsp smoked paprika, 1 tbsp ground coriander, a pinch of ground cumin, 2 crushed
              garlic cloves, 4 tbsp olive oil, the juice of 1 lime and 4-5 drops Tabasco together in a bowl with a big
              pinch each of salt and pepper.</li>
            <li>STEP 3 Stir 2 finely sliced chicken breasts, 1 finely sliced red onion, 1 sliced red pepper and 1 finely
              sliced red chilli, if using, into the marinade.</li>
            <li>STEP 4 Heat a griddle pan until smoking hot and add the chicken and marinade to the pan.</li>
            <li>STEP 5 Keep everything moving over a high heat for about 5 mins using tongs until you get a nice charred
              effect. If your griddle pan is small you may need to do this in two batches.</li>
            <li>STEP 6 To check the chicken is cooked, find the thickest part and tear in half – if any part is still
              raw cook until done.
            </li>
            <li>STEP 7 Put the tortillas in the oven to heat up and serve with the cooked chicken, a bag of mixed salad
              and one 230g tub of fresh salsa.
            </li>
            <h3><a href="https://www.bbcgoodfood.com/recipes/easy-chicken-fajitas">Source</a></h3>
            <br> <br> <br> <br>
          </ul>
        </div>
      </div>
    </div>
  </main>
</body>
<!-- comment to push to github final -->

</html>