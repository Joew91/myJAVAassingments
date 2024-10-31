import java.util.Scanner;

public class Lightdemo {
    private int brightness = 10;
    private boolean state = false;
    // state is true if light is on

    public void on() {
        state = true;
    }

    public void off() {
        state = false;
    }

    // public fucntion to increase brigthness
    public void up() {
        brightness = brightness + 1;
        if (brightness > 10) {
            brightness = 10;
        }
    }

    public void down() {
        brightness = brightness - 1;
        if (brightness < 1) {
            brightness = 1;

        }
    }

    public void view() {
        if (state == true) {
            System.out.println("light is on.");
        } else {
            System.out.println("light is off.");
            System.out.println("the brightness is equal to " + brightness);

        }
    }

    public static void main(String[] args) {
        Lightdemo light = new Lightdemo();
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("enter a command on/off/down/view/quit: ");
            String command = in.next().toLowerCase();
            if (command.equals("on")) {
                light.on();
            } else if (command.equals("off")) {
                light.off();
            } else if (command.equals("up")) {
                light.up();
            } else if (command.equals("down")) {
                light.down();
            } else if (command.equals("view")) {
                light.view();

            } else if (command.equals("quit")) {
                break;

            } else
                System.out.println("i dont understand your command");

        }
    }
}
