Feature: Funcionalidad del modulo Buzz en OrangeHRM
  Como un usuario de OrangeHRM
  Quiero ingresar al modulo Buzz
  Para poder compartir fotos, videos, opiniones
  Y reaccionar a las demas publicaciones


  Scenario: Publicar una nota de texto en el muro
    Given el usuario esta autenticado correctamente en OrangeHRM
    When postea el mensaje 'Automatizando publicaciones con Screenplay'
    Then debería ver su nota publicada en la parte superior del muro

  Scenario: Compartir una publicacion con imagen
    When publica una imagen desde su dispositivo
    Then deberia ver su publicacion con la imagen adjunta en el muro

    #Scenario: Compartir una publicacion con video
     #   When hace clic en el botón Share Video
      #  And selecciona un archivo de video valido desde su dispositivo
       # And hace clic en el boton Post
        #Then deberia ver su publicacion con el video adjunto en el muro

#    Scenario: Dar me gusta a una publicacion existente
 #       When ubica una publicacion del muro
  #      And hace clic en el icono de Like
   #     Then el contador de Likes de esa publicacion deberia incrementarse en 1

    #Scenario: Comentar en una publicacion del muro
     #   When ubica una publicacion visible en el muro
      #  And hace clic en el icono de comentarios
       # And escribe Excelente noticia, felicitaciones! en el campo de comentarios
        #And hace clic en el boton para publicar el comentario
        #Then el comentario deberia aparecer asociado a esa publicacion