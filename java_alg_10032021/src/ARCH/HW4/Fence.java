package ARCH.HW4;

public class Fence {
    private boolean isPainted;
    private PaintColors color;

    public Fence() {
        this.isPainted = false;
        this.color = PaintColors.NONE;
    }

    public boolean isPainted() {
        return isPainted;
    }

    public void setPainted(boolean painted) {
        isPainted = painted;
    }

    public PaintColors getColor() {
        return color;
    }

    public void setColor(PaintColors color) {
        this.color = color;
    }
}
