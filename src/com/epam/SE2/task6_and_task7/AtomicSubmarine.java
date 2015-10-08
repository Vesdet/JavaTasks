package com.epam.SE2.task6_and_task7;

/**
 * Created by Vesdet on 08.10.2015.
 */
@Information(
        author = "Nikita Ryzhov",
        lastModified = "8/10/2015"
)
public class AtomicSubmarine {
    private Engine engine;

    public AtomicSubmarine() {
        engine = new Engine();
    }

    public void startSwim() {
        engine.status = true;
        System.out.println("Ya karasik");
    }

    public void endSwim() {
        engine.status = false;
        System.out.println("Tr-tr-tr");
    }

    class Engine {
        public boolean status;
        private String number = "B4254-78";

        public String getNumber() {
            return number;
        }
    }

    @Override
    public String toString(){
        return "Engine status: " + engine.status + "    Engine number: " + engine.getNumber();
    }
}
