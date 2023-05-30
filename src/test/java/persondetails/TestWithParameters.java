package persondetails;

import com.rb_dr.person.Man;
import com.rb_dr.person.Person;
import com.rb_dr.person.Woman;
import dataproviders.TestDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestWithParameters {

    @Test(dataProvider = "womenPositive", dataProviderClass = TestDataProvider.class)
    public void testWomanAdding(String firstName, String lastName, String previousLastName, int age, String hobby,
                                Person partner) {
        Woman woman = new Woman(firstName, lastName, previousLastName, age, hobby, partner);
        woman.addWoman(woman);
        Assert.assertEquals(woman.isContain(woman), true,
                "Problems with adding to Array List for Woman");
    }
    @Test(dataProvider = "womenPositive", dataProviderClass = TestDataProvider.class)
    public void testIfWomanRetired(String firstName, String lastName, String previousLastName, int age, String hobby,
                                   Person partner) {
        Woman woman = new Woman(firstName, lastName, previousLastName, age, hobby, partner);
        woman.addWoman(woman);
        Assert.assertEquals(woman.isRetired(), true, " Is Retired function works wrong for Woman");
    }
    @Test(dataProvider = "womenNegative", dataProviderClass = TestDataProvider.class)
    public void testIfWomanNotRetired(String firstName, String lastName, String previousLastName, int age, String hobby,
                                      Person partner) {
        Woman woman = new Woman(firstName, lastName, previousLastName, age, hobby, partner);
        woman.addWoman(woman);
        Assert.assertEquals(woman.isRetired(), false, " Is Retired function works wrong for Woman");
    }
    @Test(dataProvider = "womenPositive", dataProviderClass = TestDataProvider.class)
    public void testIfRegisterPartnership(String firstName, String lastName, String previousLastName, int age, String hobby,
                                          Person partner) {
        Woman woman = new Woman(firstName, lastName, previousLastName, age, hobby, partner);
        woman.addWoman(woman);
        Assert.assertEquals(woman.registerPartnership(), partner.getLastName(),
                "Register Partnership function works wrong for Woman");
    }
    @Test(dataProvider = "womenNegative", dataProviderClass = TestDataProvider.class)
    public void testIfNotRegisterPartnership(String firstName, String lastName, String previousLastName, int age, String hobby,
                                             Person partner) {
        Woman woman = new Woman(firstName, lastName, previousLastName, age, hobby, partner);
        woman.addWoman(woman);
        Assert.assertEquals(woman.registerPartnership(), woman.getLastName(),
                "Register Partnership function works wrong for Woman");
    }
    @Test(dataProvider = "womenPositive", dataProviderClass = TestDataProvider.class)
    public void testIfWomanHasBadge(String firstName, String lastName, String previousLastName, int age, String hobby,
                                    Person partner) {
        Woman woman = new Woman(firstName, lastName, previousLastName, age, hobby, partner);
        woman.addWoman(woman);
        Assert.assertEquals(woman.getBadgeActive(), woman.getFirstName() + " has got Active Badge!",
                "If Has Badge function works wrong for Woman");
    }
    @Test(dataProvider = "womenNegative", dataProviderClass = TestDataProvider.class)
    public void testIfWomanHasNotBadge(String firstName, String lastName, String previousLastName, int age, String hobby,
                                       Person partner) {
        Woman woman = new Woman(firstName, lastName, previousLastName, age, hobby, partner);
        woman.addWoman(woman);
        Assert.assertEquals(woman.getBadgeActive(), woman.getFirstName() + " has not Active Badge yet",
                "If Has Badge function works wrong for Woman");
    }
    @Test(dataProvider = "womenPositive", dataProviderClass = TestDataProvider.class)
    public void testIfDeregisterPartnershipTrue(String firstName, String lastName, String previousLastName, int age, String hobby,
                                                Person partner) {
        Woman woman = new Woman(firstName, lastName, previousLastName, age, hobby, partner);
        woman.addWoman(woman);
        Assert.assertEquals(woman.deregisterPartnership(true), woman.getPreviousLastName(),
                "If Deregister Partnership function works wrong for Woman");
    }
    @Test(dataProvider = "womenPositive", dataProviderClass = TestDataProvider.class)
    public void testIfDeregisterPartnershipFalse(String firstName, String lastName, String previousLastName, int age, String hobby,
                                                 Person partner) {
        Woman woman = new Woman(firstName, lastName, previousLastName, age, hobby, partner);
        woman.addWoman(woman);
        Assert.assertEquals(woman.deregisterPartnership(false), woman.getLastName(),
                "If Deregister Partnership function works wrong for Woman");
    }

    @Test(dataProvider = "menPositive", dataProviderClass = TestDataProvider.class)
    public void testManAdding(String firstName, String lastName, String previousLastName, int age, String hobby,
                              Person partner) {

        Man man = new Man(firstName, lastName, previousLastName, age, hobby, partner);
        man.addMan(man);
        Assert.assertEquals(man.isContain(man), true,
                "Problems with adding to Array List for Man");
    }

    @Test(dataProvider = "menPositive", dataProviderClass = TestDataProvider.class)
    public void testIfManRetired(String firstName, String lastName, String previousLastName, int age, String hobby,
                                 Person partner) {
        Man man = new Man(firstName, lastName, previousLastName, age, hobby, partner);
        man.addMan(man);
        Assert.assertEquals(man.isRetired(), true, " Is Retired function works wrong for Man");
    }

    @Test(dataProvider = "menNegative", dataProviderClass = TestDataProvider.class)
    public void testIfManNotRetired(String firstName, String lastName, String previousLastName, int age, String hobby,
                                    Person partner) {
        Man man = new Man(firstName, lastName, previousLastName, age, hobby, partner);
        man.addMan(man);
        Assert.assertEquals(man.isRetired(), false, " Is Retired function works wrong for Man");
    }

    @Test(dataProvider = "menPositive", dataProviderClass = TestDataProvider.class)
    public void testIfManHasBadge(String firstName, String lastName, String previousLastName, int age, String hobby,
                                  Person partner) {
        Man man = new Man(firstName, lastName, previousLastName, age, hobby, partner);
        man.addMan(man);
        Assert.assertEquals(man.getBadgeActive(), man.getFirstName() + " has got Relax Badge!",
                "If Has Badge function works wrong for Man");
    }
    @Test(dataProvider = "menNegative", dataProviderClass = TestDataProvider.class)
    public void testIfManHasNotBadge(String firstName, String lastName, String previousLastName, int age, String hobby,
                                     Person partner) {
        Man man = new Man(firstName, lastName, previousLastName, age, hobby, partner);
        man.addMan(man);
        Assert.assertEquals(man.getBadgeActive(), man.getFirstName() + " has not Relax Badge yet",
                "If Has Badge function works wrong for Man");
    }
}
