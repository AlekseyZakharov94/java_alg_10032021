package ARCH.HW4;

public class DumbFencePainter implements FencePainter {

    @Override
    public void paint(Fence fence, PaintColors color) {
        fence.setPainted(true);
        fence.setColor(color);
        System.out.println("The fence is painted in " + color);
    }

}
