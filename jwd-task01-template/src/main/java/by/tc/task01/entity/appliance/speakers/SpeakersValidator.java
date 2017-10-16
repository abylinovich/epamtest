package by.tc.task01.entity.appliance.speakers;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.IValidator;

import java.util.Map;

public class SpeakersValidator implements IValidator {

    @Override
    public <E> boolean validate(Criteria<E> criteria) {
        for (Map.Entry<E, Object> entry : criteria.getCriteriaMap().entrySet())
        {
            switch (entry.getKey().toString()) {
                case "POWER_CONSUMPTION":
                case "NUMBER_OF_SPEAKERS":
                case "CORD_LENGTH":
                    {
                    if(!(entry.getValue() instanceof Number)) {
                        return false;
                    }
                    break;
                }
                case "FREQUENCY_RANGE":
                {
                    if(!(entry.getValue() instanceof String)) {
                        return false;
                    }
                    break;
                }
            }
        }
        return true;
    }

}
