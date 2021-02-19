import java.awt.event.KeyEvent;

public class PlayerController {
    public Rect rect;
    public KL keyListener;


    public PlayerController(Rect rect, KL keyListener) {
        this.rect = rect;
        this.keyListener = keyListener;

    }

    public PlayerController(Rect rect) {
        this.rect = rect;
        this.keyListener = null;
    }

    public void update(double dt) {
        if (keyListener != null) {


            if (keyListener.isKeyPressed(KeyEvent.VK_DOWN)) {
                moveDOWN(dt);
            } else if (keyListener.isKeyPressed(KeyEvent.VK_UP)) {
                moveUP(dt);
            }
        }

    }

    public void moveUP(double dt) {
        if (rect.y - Constants.PADDLE_SPEED * dt > Constants.TOOLBAR_HEIGHT)
            this.rect.y -= Constants.PADDLE_SPEED * dt;
    }

    public void moveDOWN(double dt) {
        if (rect.y + Constants.PADDLE_SPEED * dt + rect.height < Constants.SCREEN_HEIGHT - Constants.INSETS_BOTTOM)
            this.rect.y += Constants.PADDLE_SPEED * dt;
    }
}
