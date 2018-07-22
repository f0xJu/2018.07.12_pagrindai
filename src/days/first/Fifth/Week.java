package days.first.Fifth;

import java.util.EnumSet;

public enum Week {
    MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURDAYS(4), FRIDAY(5), SATURDAY(6), SUNDAY(7), DEFAULT(0);

    private int id;

    Week(int id) {
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public static Week getDayById(int numb){
        Week result = DEFAULT;
        for (Week w : Week.values()){
            if (w.getId() == numb){
                result = w;
                break;

            }
        }
        return result;
    }
}
