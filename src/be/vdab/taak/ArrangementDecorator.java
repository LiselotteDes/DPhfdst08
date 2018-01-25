package be.vdab.taak;
public abstract class ArrangementDecorator implements Arrangement {
    protected final Arrangement teDecorerenArrangement;
    public ArrangementDecorator(Arrangement arrangement) {
        this.teDecorerenArrangement = arrangement;
    }
}
