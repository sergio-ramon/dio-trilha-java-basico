package model;


public class TelephoneCall extends Application {

    private boolean inCall = false;

    public TelephoneCall(String name) {
        super(name);
    }

    public void makeNewCall(String number) {
        if (getExecuting()) {
            if (!inCall) {
                inCall = true;
                System.out.println("Em chamada com o número " + number);
            }
        } else {
            System.out.println("Abra o aplicativo " + getName() + " para executar a ação");
        }
    }

    public void answerCall() {
        if (getExecuting()) {
            if (!inCall) {
                inCall = true;
                System.out.println("Atendendo chamada");
            }
        } else {
            System.out.println("Abra o aplicativo " + getName() + " para executar a ação");
        }
    }

    public void closeCall() {
        if (getExecuting()) {
            if (inCall) {
                inCall = false;
                System.out.println("Chamada encerrada");
            }
        } else {
            System.out.println("Abra o aplicativo " + getName() + " para executar a ação");
        }
    }

    public void beginVoiceMail() {
        if (getExecuting()) {
            if (!inCall) System.out.println("Iniciando correio de voz");
        } else {
            System.out.println("Abra o aplicativo " + getName() + " para executar a ação");
        }
    }

}
