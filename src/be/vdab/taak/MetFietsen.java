package be.vdab.taak;
public class MetFietsen extends ArrangementDecorator {
    public MetFietsen(Arrangement teDecorerenArrangement) {
        super(teDecorerenArrangement);
    }
    @Override
    public String getTaken() {
        return teDecorerenArrangement.getTaken() + ", plaats fietsen bij de bungalow";
    }
}
