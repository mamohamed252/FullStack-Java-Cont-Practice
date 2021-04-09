<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta name="description" content="HTML/CSS/JS-3-Page-Site-lasagne">
  <meta name="autor" content="Mohamed Mohamed">
  <title>Lasagne</title>
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
        <img src='img/lasagna.jpg' class="featurette-image img-fluid mx-auto" alt="resonsive image" width="650px"
          height="500px">
      </div>
    </div>
    <div class="container">
      <div class="row justify-content-center">
        <div class="col-md-7">
          <h2 class='text-center'><br>Ingredients</h1>
            <ul>
              <li> 1 tbsp olive oil</li>
              <li> 2 rashers smoked streaky bacon</li>
              <li> 1 onion , finely chopped</li>
              <li> 1 celery stick, finely chopped</li>
              <li> 1 medium carrot , grated</li>
              <li> 2 garlic cloves , finely chopped</li>
              <li> 500g beef mince</li>
              <li> 1 tbsp tomato purée</li>
              <li> 2 x 400g cans chopped tomatoes </li>
              <li> 1 tbsp clear honey</li>
              <li> 500g pack fresh egg lasagne sheets</li>
              <li> 400ml crème fraîche</li>
              <li> 125g ball mozzarella , roughly torn</li>
              <li> 50g freshly grated parmesan</li>
              <li> large handful basil leaves , torn (optional)</li>
            </ul>
        </div>
      </div>

      <div class="container">
        <div class="row justify-content-center">
          <div class="col-md-7">
            <h2 class="text-center">Cooking Method</h2>
            <p class="text-center"><br>Cooking made simple</p>
            <ul>
              <li>STEP 1 Heat the oil in a large saucepan. Use kitchen scissors to snip the bacon into small pieces, or
                use a sharp knife to chop it on a chopping board. Add the bacon to the pan and cook for just a few mins
                until starting to turn golden. Add the onion, celery and carrot, and cook over a medium heat for 5 mins,
                stirring occasionally, until softened.</li>
              <li>STEP 2 Add the garlic and cook for 1 min, then tip in the mince and cook, stirring and breaking it up
                with a wooden spoon, for about 6 mins until browned all over.</li>
              <li>STEP 3 Stir in the tomato purée and cook for 1 min, mixing in well with the beef and vegetables. Tip
                in the chopped tomatoes. Fill each can half full with water to rinse out any tomatoes left in the can,
                and add to the pan. Add the honey and season to taste. Simmer for 20 mins.</li>
              <li>STEP 4 Heat oven to 200C/180C fan/gas 6. To assemble the lasagne, ladle a little of the ragu sauce
                into the bottom of the roasting tin or casserole dish, spreading the sauce all over the base. Place 2
                sheets of lasagne on top of the sauce overlapping to make it fit, then repeat with more sauce and
                another layer of pasta. Repeat with a further 2 layers of sauce and pasta, finishing with a layer of
                pasta.</li>
              <li>STEP 5 Put the crème fraîche in a bowl and mix with 2 tbsp water to loosen it and make a smooth
                pourable sauce. Pour this over the top of the pasta, then top with the mozzarella. Sprinkle Parmesan
                over the top and bake for 25–30 mins until golden and bubbling. Serve scattered with basil, if you like.
              </li>
              <h3><a href="https://www.bbcgoodfood.com/recipes/classic-lasagne">Source</a></h3>
              <br> <br> <br> <br>
            </ul>
          </div>
        </div>
      </div>
  </main>
</body>
<!-- comment to push to github final -->

</html>