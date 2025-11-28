<?php
// sendmail.php
use PHPMailer\PHPMailer\PHPMailer;
use PHPMailer\PHPMailer\Exception;

require 'vendor/autoload.php'; // Si tu as installé PHPMailer via Composer

if ($_SERVER['REQUEST_METHOD'] === 'POST') {

    $fromEmail = filter_var($_POST['from_email'], FILTER_VALIDATE_EMAIL);
    $subject   = strip_tags($_POST['subject']);
    $message   = htmlspecialchars($_POST['message']);

    if (!$fromEmail || !$subject || !$message) {
        die("Veuillez remplir tous les champs correctement.");
    }

    $mail = new PHPMailer(true);

    try {
        // Configuration SMTP Outlook
        $mail->isSMTP();
        $mail->Host       = 'https://smtp-mail.outlook.com';
        $mail->SMTPAuth   = true;
        $mail->Username   = 'duroyon.babatiste@hotmail.com'; // Ton adresse Outlook
        $mail->Password   = 'Batise270608_baba';    // Mot de passe d'application
        $mail->SMTPSecure = 'tls';
        $mail->Port       = 587;

        // Expéditeur et destinataire
        $mail->setFrom($fromEmail, 'Portfolio Contact');
        $mail->addAddress('duroyon.babatiste@hotmail.com'); // Où tu veux recevoir le mail

        // Contenu
        $mail->isHTML(false);
        $mail->Subject = $subject;
        $mail->Body    = $message;

        $mail->send();
        echo "Le message a bien été envoyé !";

    } catch (Exception $e) {
        echo "Erreur lors de l'envoi : {$mail->ErrorInfo}";
    }

} else {
    echo "Méthode invalide.";
}
?>
