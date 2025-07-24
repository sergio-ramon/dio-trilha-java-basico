package model;

public class InternetNavigator extends Application {

    public InternetNavigator(String name) {
        super(name);
    }

    public void addNewTab() {
        if (getExecuting()) System.out.println("Abrindo nova aba");
        else System.out.println("Abra o aplicativo " + getName() + " para executar a ação");
    }

    public void reloadPage() {
        if (getExecuting()) System.out.println("Atualizando página");
        else System.out.println("Abra o aplicativo " + getName() + " para executar a ação");
    }

    public void showPage(String url) {
        if (getExecuting()) {
            if (!url.isBlank()) {
                System.out.println("Abrindo página " + url);
            }
        } else {
            System.out.println("Abra o aplicativo " + getName() + " para executar a ação");
        }
    }

    public void closeTab() {
        if (getExecuting()) {
            System.out.println("Fechando aba");
        } else {
            System.out.println("Abra o aplicativo " + getName() + " para executar a ação");
        }
    }

}
