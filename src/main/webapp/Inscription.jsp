<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Insert title here</title>
    
    <!-- Add Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
	<link rel='stylesheet' type='text/css' href='InscriptionStyle.css'/>
	
	</head>
<body>

<div class="container mt-5">
    <h2 class="mb-4">Inscription Étudiant</h2>

    <form action="Loginjsp.jsp" method="post">

        <div class="form-group">
            <label for="nom">Nom :</label>
            <input type="text" class="form-control" id="nom" name="nom" required>
        </div>

        <div class="form-group">
            <label for="prenom">Prénom :</label>
            <input type="text" class="form-control" id="prenom" name="prenom" required>
        </div>

        <div class="form-group">
            <label for="email">Email :</label>
            <input type="email" class="form-control" id="email" name="email" required>
        </div>

        <div class="form-group">
            <label for="niveau">Niveau :</label>
            <input type="text" class="form-control" id="niveau" name="niveau" required>
        </div>

        <div class="form-group">
            <label for="login">Login :</label>
            <input type="text" class="form-control" id="login" name="login" required>
        </div>

        <div class="form-group">
            <label for="password">Mot de passe :</label>
            <input type="password" class="form-control" id="password" name="password" required>
        </div>

        <div class="form-group">
            <label for="filiere">Filière :</label>
            <select class="form-control" id="filiere" name="filiere" required>
                <option value="informatique">Génie Informatique</option>
                <option value="gestion">Informatique et Gestion</option>
                <option value="industriel">Génie Industriel</option>
            </select>
        </div>

        <button type="submit" class="btn btn-primary">Inscrire</button>
    </form>
</div>

<!-- Add Bootstrap JS and Popper.js -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

</body>
</html>
