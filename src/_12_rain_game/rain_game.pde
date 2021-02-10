int score = 0;
void setup(){
  size(800, 800);
}
int ran = (int) random(width);
int y = 50;
void draw(){  
  background(0, 250, 0);
  fill(250, 0, 0);
  stroke(250, 0, 0);
  
    rect(mouseX, 730, 50, 50);
    ellipse(ran, y, 50, 50);
    y+=5;
    if(y==800){
      y=0;
    } 
    if(y==730){
    checkCatch(ran);
    }
    fill(0, 0, 0);
    textSize(16);
    text("Score: " + score, 20, 20);
}
 void checkCatch(int x){
         if (x > mouseX && x < mouseX+100)
            score++;
         else if (score > 0) 
            score--;
        println("Your score is now: " + score);
    }
