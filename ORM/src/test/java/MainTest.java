import Repository.Repository;

import java.util.List;

public class MainTest {
    public static void main(String ...args) {
        Repository<TestClassA> testRepo = new Repository<>(new TestClassA());
        testRepo.setBreadCrumbsOn(true);

        System.out.println(testRepo);

        List<TestClassA> testClassAS = testRepo.readAll();
        for (TestClassA t : testClassAS) {
            System.out.println(t);
        }

        Repository<TestClassB> testRepoB = new Repository<>(new TestClassB());
        testRepoB.setBreadCrumbsOn(true);
        System.out.println(testRepoB);

        List<TestClassB> testClassBS = testRepoB.readAll();

        TestClassB t2 = new TestClassB(0);
        t2.setFirstName("Steve");
        t2.setLastName("Rogers");

        System.out.println(testRepoB.delete(t2));
    }
}
