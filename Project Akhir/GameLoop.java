/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Games_RPG;


import java.util.HashSet;
import java.util.Set;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class GameLoop extends Application {

    private GraphicsContext gc;
    private Character player;
    private Enemy slime;
    private boolean isSlimeDead = false;
    
    private Set<KeyCode> activeKeys = new HashSet<>();
    
    private long lastSlimeAttackTime = 0;

    private final long SLIME_ATTACK_COOLDOWN_NS = 2_000_000_000L; 

private final double AGGRO_RANGE = 250; 
private final double ATTACK_RANGE = 45;   
    
    private long lastPlayerAttackTime = 0;
    
    private final long PLAYER_ATTACK_COOLDOWN_NS = 1_000_000_000L;
    
    public static void main(String[] args){
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        
        primaryStage.setTitle("Game RPG Project PBO");

        Canvas canvas = new Canvas(800, 600);
        gc = canvas.getGraphicsContext2D(); 

        StackPane root = new StackPane();
        root.getChildren().add(canvas);

        Scene scene = new Scene(root);
        
        scene.setOnKeyPressed(event -> {
            activeKeys.add(event.getCode());
        });
        scene.setOnKeyReleased(event -> {
            activeKeys.remove(event.getCode());
        });
        primaryStage.setScene(scene);
        primaryStage.show();
        player = new Fighter("Hero", 100, 300);
        slime = new Enemy("Slime", 50, 5, 10, 600, 300);

        AnimationTimer gameLoop = new AnimationTimer() {
            
            @Override
            public void handle(long currentNanoTime) {
                
                update(currentNanoTime);
                
                render();
            }
        };
        
        gameLoop.start(); 
    }

    private void update(long currentNanoTime) {

    double oldX = player.getPositionX();
    if (activeKeys.contains(KeyCode.A)) {
        player.moveLeft();
    }
    if (activeKeys.contains(KeyCode.D)) {
        player.moveRight();
    }

    if (slime.isAlive() && isColliding(player, slime)) {
        player.setPosition(oldX, player.getPositionY());
    }

    double oldY = player.getPositionY();
    if (activeKeys.contains(KeyCode.W)) {
        player.moveUp();
    }
    if (activeKeys.contains(KeyCode.S)){
        player.moveDown();
    }
    
    if (slime.isAlive() && isColliding(player, slime)) {
        player.setPosition(player.getPositionX(), oldY);
    }

    if (activeKeys.contains(KeyCode.SPACE)) {
        if ((currentNanoTime - lastPlayerAttackTime) > PLAYER_ATTACK_COOLDOWN_NS) {
            if (getDistance(player, slime) < 50 && slime.isAlive()) {
                player.basicAttack(slime); 
                lastPlayerAttackTime = currentNanoTime;
            }
        }
    }
    
    if (slime.isAlive() && player.isAlive()) {
        double distance = getDistance(player, slime);
        
        if (distance < ATTACK_RANGE) { 
            if ((currentNanoTime - lastSlimeAttackTime) > SLIME_ATTACK_COOLDOWN_NS) {
                slime.basicAttack(player);
                lastSlimeAttackTime = currentNanoTime;
            }
        }
        else if (distance < AGGRO_RANGE) {
            double dx = player.getPositionX() - slime.getPositionX();
            double dy = player.getPositionY() - slime.getPositionY();
            double slimeSpeed = 2.0; 
            
            if (distance > 0) { 
                double moveX = (dx / distance) * slimeSpeed;
                double moveY = (dy / distance) * slimeSpeed;
                
                slime.setPosition(slime.getPositionX() + moveX, slime.getPositionY() + moveY);
            }
        }
    }
    if (!isSlimeDead && !slime.isAlive() ) {
        isSlimeDead = true;
        
        Potion loot = new Potion("Small Potion", "Common", 30);
        player.addItemToInventory(loot);
        System.out.println(slime.getName() + " dropped a " + loot.getItemName());
    }
}
    private boolean isColliding(Entity player, Entity enemy) {
        double playerWidth = 40;
        double playerHeight = 40;
        
        double enemyWidth = 30;
        double enemyHeight = 30;
        
        return player.getPositionX() < enemy.getPositionX() + enemyWidth &&
               player.getPositionX() + playerWidth > enemy.getPositionX() &&
               player.getPositionY() < enemy.getPositionY() + enemyHeight &&
               player.getPositionY() + playerHeight > enemy.getPositionY();
}
    private double getDistance(Entity e1, Entity e2) {
        double dx = e1.getPositionX() - e2.getPositionX();
        double dy = e1.getPositionY() - e2.getPositionY();
        return Math.sqrt(dx * dx + dy * dy);
    }


    private void render() {
        gc.setFill(Color.BLACK);
        gc.fillRect(0, 0, 800, 600);
        
        gc.setFill(Color.BLUE);
        gc.fillRect(player.getPositionX(), player.getPositionY(), 40, 40); 

    
        gc.setFill(Color.WHITE);
        gc.fillText(player.getName(), player.getPositionX(), player.getPositionY() - 20);
        gc.fillText("HP: " + player.getHealth(), player.getPositionX(), player.getPositionY() - 5);


        if (slime.isAlive()) {
            gc.setFill(Color.GREEN);
        } else {
            gc.setFill(Color.DARKRED);
        }
        gc.fillRect(slime.getPositionX(), slime.getPositionY(), 30, 30); 

   
        gc.setFill(Color.WHITE);
        gc.fillText(slime.getName(), slime.getPositionX(), slime.getPositionY() - 20);
        gc.fillText("HP: " + slime.getHealth(), slime.getPositionX(), slime.getPositionY() - 5);
}
}


