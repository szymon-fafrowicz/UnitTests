package pl.coderslab.example1;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({AnotherTest.class, SimpleSampleTest.class})
public class AllTestesSuit {
}
