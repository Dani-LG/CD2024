Crear archivos

    touch daniel.txt actividades .txt

Rastrear archivos

    git add


Facer commit

    git commit -m "mensaxe"

crear carpetas

    mkdir "Nome carpeta"

modificar archivos

    nano "nome archivo"

Mostrar historial commits

    git log

Mostrar estado

    git status

Mostrat estado abreviado

    git status --short
    ?? no rastreado, A preparados, M modificados,(Aparece en 2 columnas izquierda preparados derecha sin preparar)

Ignorar archivos

    nano .gitignore
    (Añadir archivo que queres ignorar)
    _* (ignora todos os archivos que comecen por "_")
    !"archivo"(Fai unha excepcion co archivo indicado despois da "!")

crear rama

    git branch "nome de rama"

mostrar ramas

    git branch

Cambiar rama

    git checkout "nome de rama"

fusionar ramas

    git merge "nome rama"

eliminar rama

    git branch -d "rama"