package jdominion.condition;

import java.util.List;

/**
 * User: jonathan
 * Date: 3/29/11
 * Time: 9:34 PM
 */
public class CompoundCondition implements Condition {

    private List<Condition> conditions;

    public CompoundCondition(List<Condition> conditions) {
        this.conditions = conditions;
    }

    public boolean isSatisfied() {
        for(Condition condition : conditions) {
            if(!condition.isSatisfied()) {
                return false;
            }
        }

        return true;
    }
}

