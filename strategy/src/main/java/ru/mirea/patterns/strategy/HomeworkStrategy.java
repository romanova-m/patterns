package ru.mirea.patterns.strategy;

import ru.mirea.patterns.strategy.behaviours.DoBehaviour;
import ru.mirea.patterns.strategy.behaviours.PrepareBehaviour;

public class HomeworkStrategy {
    private PrepareBehaviour prepareBehaviour;
    private DoBehaviour doBehaviour;

    HomeworkStrategy(PrepareBehaviour p, DoBehaviour d) {
        this.doBehaviour = d;
        this.prepareBehaviour = p;
    }

    public void prepare() {
        prepareBehaviour.prepare();
    }

    public void doHomework() {
        doBehaviour.doHomework();
    }

    public DoBehaviour getDoBehaviour() {
        return doBehaviour;
    }

    public void setDoBehaviour(DoBehaviour doBehaviour) {
        this.doBehaviour = doBehaviour;
    }
}
