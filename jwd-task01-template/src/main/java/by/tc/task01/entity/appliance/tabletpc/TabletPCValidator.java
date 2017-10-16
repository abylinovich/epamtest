package by.tc.task01.entity.appliance.tabletpc;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.IValidator;

import java.util.Map;

public class TabletPCValidator implements IValidator {

    @Override
    public <E> boolean validate(Criteria<E> criteria) {
        for (Map.Entry<E, Object> entry : criteria.getCriteriaMap().entrySet())
        {
            switch (entry.getKey().toString()) {
                case "BATTERY_CAPACITY":
                case "DISPLAY_INCHES":
                case "MEMORY_ROM":
                case "FLASH_MEMORY_CAPACITY":
                {
                    if(!(entry.getValue() instanceof Number)) {
                        return false;
                    }
                    break;
                }
                case "COLOR":
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
