package com.vkstech.design.patterns.creational.factoryMethod;

public class GetPlanFactory {

    public Plan getPlan(String planType) {
        if (planType == null) {
            return null;
        }

        switch (PlanType.valueOf(planType.toUpperCase())) {
            case DOMESTIC:
                return new DomesticPlan();
            case COMMERCIAL:
                return new CommercialPlan();
            case INSTITUTIONAL:
                return new InstitutionalPlan();
            default:
                return null;
        }
    }
}