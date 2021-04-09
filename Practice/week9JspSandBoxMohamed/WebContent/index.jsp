<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta name="description" content="HTML/CSS/JS-3-Page-Site-index">
  <meta name="autor" content="Mohamed Mohamed">
  <title>Food Tour 101</title>
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
  <header>
    <nav class="navbar navbar-expand-lg navbar-dark fixed-top  bg-dark">
      <a class="navbar-brand" href="index.html">Food Tour 101</a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav"
        aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav mr-auto">
          <li class="nav-item active">
            <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
          </li>

          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown"
              aria-haspopup="true" aria-expanded="false">
              Select Recipe
            </a>
            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
              <a class="dropdown-item" href="chicken.jsp">Chicken Fajitas</a>
              <a class="dropdown-item" href="lasagne.jsp">Lasagne</a>
              <!-- <div class="dropdown-divider"></div> -->
              <a class="dropdown-item" href="pancake.jsp">Pancakes</a>
              <a class="dropdown-item" href="carrot-cake.jsp">Carrot Cake</a>
            </div>
            <li class="nav-item">
              <a class="nav-link" href="randomMeal.html">Make Random Recipe</a>
            </li>
        </ul>
    </nav>
  </header>
  <main role="main">
    <div class="row featurette">
      <div class="col-md-5">
        <!-- provide spacing from navbar -->
        <br> <br> <br>
        <div class="text-center">
          <h2>Become a Food Connoisseur</h2>
          <p>Healthy Desserts!</p>
          <div class="container-fluid">
            <div class="row justify-content-center">
              <div class="col-lg-6 col-md-4 col-sm-12">
                <table class="table table-bordered">
                  <thead>
                    <tr>
                      <th>Dessert</th>
                      <th>Calories</th>
                    </tr>
                  </thead>
                  <tbody>
                    <tr>
                      <td>Skinny Pineapple Cheesecake Bars</td>
                      <td><a
                          href="https://www.delish.com/cooking/nutrition/g2615/low-calorie-dessert-recipes/?slide=1">130</a>
                      </td>
                    </tr>
                    <tr>
                      <td>Healthy Oatmeal Cookies</td>
                      <td><a
                          href="https://www.delish.com/cooking/nutrition/g2615/low-calorie-dessert-recipes/?slide=2">150</a>
                      </td>
                    </tr>
                    <tr>
                      <td>Fudgy Paleo Brownies</td>
                      <td><a
                          href="https://www.delish.com/cooking/nutrition/g2615/low-calorie-dessert-recipes/?slide=3">160</a>
                      </td>
                    </tr>
                    <tr>
                      <td>Keto Peanut Butter Cups</td>
                      <td><a
                          href="https://www.delish.com/cooking/nutrition/g2615/low-calorie-dessert-recipes/?slide=8">90</a>
                      </td>
                    </tr>
                  </tbody>
                </table>
              </div>
            </div>
          </div>
        </div>
      </div>
      <div class="col-md-5">
      <!-- <img class="featurette-image img-fluid mx-auto" data-src="holder.js/500x500/auto" alt="Generic placeholder image"> -->
        <br><br><br>
        <ol class="carousel-indicators">
          <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
          <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
          <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
          <li data-target="#carouselExampleIndicators" data-slide-to="3"></li>
        </ol>
        <div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
          <div class="carousel-inner">
            <div class="carousel-item active">
              <img class="d-block w-100" src="img/chicken.jpg" alt="First slide">
            </div>
            <div class="carousel-item">
              <img class="d-block w-100" src="img/lasagna.jpg" alt="Second slide">
            </div>
            <div class="carousel-item">
              <img class="d-block w-100" src="img/pancake.jpg" alt="Third slide">
            </div>
            <div class="carousel-item">
              <img class="d-block w-100" src="img/carrot-cake.jpg" alt="fourth slide">
            </div>
          </div>
            <a class="carousel-control-prev" href="#carouselExampleControls" role="button" data-slide="prev" style="background-color:rgba(255, 0, 0, 0.2)">
              <span class="carousel-control-prev-icon" aria-hidden="true"></span>
              <span class="sr-only">Previous</span>
            </a>
            <a class="carousel-control-next" href="#carouselExampleControls" role="button" data-slide="next" style="background-color:rgba(255, 0, 0, 0.2)">
              <span class="carousel-control-next-icon" aria-hidden="true"></span>
              <span class="sr-only">Next</span>
            </a>
        </div>
      </div>
  </main>
  <footer>
  <!-- footer of page begins here -->
  </footer> 
  <!-- footer of page ends here -->
  <!-- comment to push to github final -->
</body>

</html>