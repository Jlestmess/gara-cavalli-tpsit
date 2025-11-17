
# PrimiThread



Un progetto Java che sfrutta l’utilizzo dei **thread** tramite una corsa tra cavalli e un contatore di pecore.

Il programma mostra come creare, avviare e sincronizzare thread multipli.



---



## Descrizione del progetto



Il progetto è composto da tre classi principali:



-  **Main**

Contiene il metodo `main()` e gestisce il menu interattivo.

Permette di:

1. Inserire nuovi cavalli nella corsa

2. Impostare il tempo di “riposo” (`sleepTime`) per ogni cavallo

3. Avviare la gara tra cavalli (ogni cavallo è un thread)

4. “Azzoppare” un cavallo interrompendo il suo thread

5. Terminare il programma



-  **Cavallo**

Estende `Thread` e rappresenta un cavallo in gara.

Ogni istanza esegue il metodo `run()` stampando i progressi di gara.

Alla fine, il primo cavallo a completare i 10 passi viene registrato come vincitore nella classe `Main`.



-  **ContaPecore**

Anche questa classe estende `Thread` e rappresenta un esempio separato di thread semplice:

conta fino a un numero di pecore indicato nel costruttore, stampandole a schermo.



---



## Concetti dimostrati



- Creazione di thread in Java (`extends Thread`)

- Override del metodo `run()`

- Uso di `sleep()` e `interrupt()`

- Sincronizzazione con `synchronized`

- Gestione concorrente di più istanze (`ArrayList<Cavallo>`)

- Comunicazione tra thread tramite variabili statiche



---



## Requisiti



-  **Java 8** o superiore

- Compilatore `javac` o un IDE come IntelliJ / Eclipse / VS Code con estensione Java



---



## Esecuzione



1. Clona o scarica il progetto tramite i seguenti comandi:

```bash
-
git clone https://github.com/Jlestmess/gara-cavalli-tpsit cd PrimiThread