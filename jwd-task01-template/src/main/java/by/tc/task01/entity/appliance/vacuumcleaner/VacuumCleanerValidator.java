package by.tc.task01.entity.appliance.vacuumcleaner;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.IValidator;

import java.util.Map;

public class VacuumCleanerValidator implements IValidator {

    @Override
    public <E> boolean validate(Criteria<E> criteria) {
        for (Map.Entry<E, Object> entry : criteria.getCriteriaMap().entrySet())
        {
            switch (entry.getKey().toString()) {
                case "POWER_CONSUMPTION":
                case "MOTOR_SPEED_REGULATION":
                case "CLEANING_WIDTH":
                    {
                    if(!(entry.getValue() instanceof Number)) {
                        return false;
                    }
                    break;
                }
                case "FILTER_TYPE":
                case "BAG_TYPE":
                case "WAND_TYPE":
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
