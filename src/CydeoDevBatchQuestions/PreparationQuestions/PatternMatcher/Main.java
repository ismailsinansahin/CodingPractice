package CydeoDevBatchQuestions.PreparationQuestions.PatternMatcher;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        String pattern = "xxyxxy";  //    2-1-2-1    4X + 2Y = 26
//        String string = "gogopowerrangergogopowerranger";

//        String pattern = "xy";
//        String string = "gpppppppppppppppppp";

//        String pattern = "x";
//        String string = "gogopowerrangergogopowerranger";

//        String pattern = "xxx";
//        String string = "gogogo";

//        String pattern = "yyyy";
//        String string = "asdasdasdasd";

        String pattern = "yyyxx";
        String string = "azzazzazzsyssys";

        System.out.println(Arrays.toString(PatternMatcher.patternMatcher(pattern, string)));

    }
}
