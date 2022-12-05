public interface interfaceExam {
    public interface TV {
        //구현은 없고 기능에대한 나열
        public int MIN_VOLUME = 0;
        public int MAX_VOLUME = 100;


        public void turnOn();
        public void turnOff();
        public void changeVolume();
        public void changeChannel();
    }
}
