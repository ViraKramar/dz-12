package dataproviders;

import com.rb_dr.person.Man;
import com.rb_dr.person.Woman;
import org.testng.annotations.DataProvider;

public class TestDataProvider {

    @DataProvider(name = "womenPositive")
    public static Object[][] womenPositive() {
        return new Object[][] {
                {
                        "Hanna",
                        "Light",
                        "Dark",
                        65,
                        "Running",
                        new Man("Nick", "Aman",
                                "Aman", 48, "Sleeping", null)
                }, {
                "Helena",
                "Sunny",
                "Cloudy",
                61,
                "Running",
                new Man("Clark", "Fix",
                        "Fix", 50, "Tennis", null)
        }
        };
    }
    @DataProvider(name = "womenNegative")
    public static Object[][] womenNegative() {
        return new Object[][] {
                {
                        "Hanna",
                        "Sweet",
                        "Sweet",
                        41,
                        "Jumping",
                        null
                }, {
                "Helena",
                "Sunny",
                "Sunny",
                41,
                "Walking",
                null
        }
        };
    }

    @DataProvider(name = "menPositive")
    public static Object[][] menPositive() {
        return new Object[][] {
                {
                        "Kent",
                        "Night",
                        "Night",
                        66,
                        "Fishing",
                        new Woman("Nikole", "Frost",
                                "Frost", 48, "Sleeping", null)
                }, {
                "Sam",
                "Day",
                "Day",
                70,
                "Fishing",
                new Woman("Clarissa", "No",
                        "No", 50, "Tennis", null)
        }
        };
    }
    @DataProvider(name = "menNegative")
    public static Object[][] menNegative() {
        return new Object[][] {
                {
                        "Vasiliy",
                        "Read",
                        "Read",
                        32,
                        "Jumping",
                        null
                }, {
                "Helena",
                "Sunny",
                "Sunny",
                41,
                "Walking",
                null
        }
        };
    }
}
