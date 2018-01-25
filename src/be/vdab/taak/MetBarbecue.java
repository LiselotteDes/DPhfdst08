package be.vdab.taak;
public class MetBarbecue extends ArrangementDecorator {
    public MetBarbecue(Arrangement teDecorerenArrangement) {
        super(teDecorerenArrangement);
    }
    @Override
    public String getTaken() {
        return teDecorerenArrangement.getTaken() + ", plaats een barbecue bij de bungalow";
    }
}
