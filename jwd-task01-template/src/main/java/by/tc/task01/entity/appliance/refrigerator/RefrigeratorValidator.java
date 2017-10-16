package by.tc.task01.entity.appliance.refrigerator;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.IValidator;

import java.util.Map;

public class RefrigeratorValidator implements IValidator {

    @Override
    public <E> boolean validate(Criteria<E> criteria) {
        for (Map.Entry<E, Object> entry : criteria.getCriteriaMap().entrySet())
        {
            switch (entry.getKey().toString()) {
                case "POWER_CONSUMPTION":
                case "WEIGHT":
                case "HEIGHT":
                case "WIDTH":
                case "FREEZER_CAPACITY":
                case "OVERALL_CAPACITY":
                    {
                    if(!(entry.getValue() instanceof Number)) {
                        return false;
                    }
                    break;
                }
            }
        }
        return true;
    }

}
