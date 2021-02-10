
int angle = 0;
PImage pictureOfRecord;
void setup(){                     
    size(600,600);                                 //in setup method
    pictureOfRecord = loadImage("record.png");      //in setup method
    pictureOfRecord.resize(600, 600);
   
}    
void draw(){
    
    angle+=2;
    
    if(mousePressed){
       rotateImage(pictureOfRecord, angle);
       
    }
    image(pictureOfRecord, 0, 0);
}
void rotateImage(PImage image, int amountToRotate) {
        translate(width/2, height/2);
        rotate(amountToRotate*TWO_PI/360);
        translate(-image.width/2, -image.height/2);
    }  
 
