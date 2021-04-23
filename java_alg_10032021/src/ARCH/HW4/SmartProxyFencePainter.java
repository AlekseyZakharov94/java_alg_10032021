package ARCH.HW4;

/*
This proxy allows you not to paint fences that are already painted or have the same color
 */
public class SmartProxyFencePainter implements FencePainter {
    private final DumbFencePainter dumbFencePainter;

    public SmartProxyFencePainter() {
        this.dumbFencePainter = new DumbFencePainter();
    }

    @Override
    public void paint(Fence fence, PaintColors color) {
        if (fence.isPainted() | fence.getColor().equals(color)) {
            System.out.println("FENCE IS READY!");
        } else {
            dumbFencePainter.paint(fence, color);
        }
    }
}
