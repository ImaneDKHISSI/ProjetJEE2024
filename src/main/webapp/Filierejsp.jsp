<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Tableau des Filières</title>
    
    <!-- Add Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>

<div class="container mt-5">
    <h2 class="mb-4">Tableau des Filières</h2>

    <table class="table">
        <thead>
            <tr>
                <th>Nom_Filière</th>
                <th>Responsable</th>
                <th>Date de création</th>
                <th>Département</th>
                <th>Nombre d'Étudiants</th>
            </tr>
        </thead>
        <tbody>
            <!-- Remplacez les données fictives par vos propres données -->
            <tr>
                <td>Informatique</td>
                <td>John Doe</td>
                <td>01/01/2000</td>
                <td>Informatique</td>
                <td>100</td>
            </tr>
            <tr>
                <td>Gestion</td>
                <td>Jane Doe</td>
                <td>02/02/2005</td>
                <td>Économie</td>
                <td>80</td>
            </tr>
            <!-- Ajoutez plus de lignes selon vos besoins -->
        </tbody>
    </table>
</div>

<!-- Add Bootstrap JS and Popper.js -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

</body>
</html>
