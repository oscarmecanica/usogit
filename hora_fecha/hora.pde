void hora() {
  stroke(100);
  fill(255);

  rect(890, 0, 110, 50);
  fill(0);
  rect(895, 0, 100, 45);
  fill(255);
  textSize(15);
  text(day(), 900, 15);
  text(month(), 930, 15);
  text(year(), 958, 15);
  fill(255);
  textSize(15);
  text(hour(), 900, 40);
  text(minute(), 930, 40);

  text(second(), 958, 40);
}
