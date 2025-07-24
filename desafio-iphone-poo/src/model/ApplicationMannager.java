package model;

public class ApplicationMannager {
    private static final Application[] applications = {
            new MusicPlayer("IMusic"),
            new TelephoneCall("ICaller"),
            new InternetNavigator("IInternet")
    };

    public static void runApplication(Application app) {
        Application runningApp = null;
        for (Application a : applications) {
            if (a.getExecuting()) runningApp = a;
        }

        if (runningApp == null) {
            System.out.println("Abrindo aplicativo " + app.getName());
            app.setExecuting(true);
        } else {
            closeApplication();
            System.out.println("Abrindo aplicativo " + app.getName());
            app.setExecuting(true);
        }
    }

    public static void tryToClose() {
        try {
            closeApplication();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void closeApplication() {
        Application runningApp = null;
        for (Application a : applications) {
            if (a.getExecuting()) runningApp = a;
        }

        if (runningApp != null) {
            System.out.println("Encerrando aplicativo " + runningApp.getName());
            runningApp.setExecuting(false);
        } else {
            throw new RuntimeException("Não há aplicações executando no momento");
        }
    }

    public static MusicPlayer getMusicApp() {
        return (MusicPlayer) applications[0];
    }

    public static TelephoneCall getPhoneApp() {
        return (TelephoneCall) applications[1];
    }

    public static InternetNavigator getNavApp() {
        return (InternetNavigator) applications[2];
    }

    public static Application[] getApplications() {
        return applications;
    }
}
