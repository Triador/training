import java.util.function.Function;

interface Claim {
    String getSubject();
}

class Subject implements Claim {

    @Override
    public String getSubject() {
        return "from subject";
    }
}

public class AbstractMethodReference {
    public <T> T getResponse(Claim claim, Function<Claim, T> claimResolver) {
        return claimResolver.apply(claim);
    }

    public static void main(String[] args) {
        AbstractMethodReference abstractMethodReference = new AbstractMethodReference();
        Function<Claim, String> function = Claim::getSubject;
        System.out.println(function.apply(new Subject()));
        System.out.println(abstractMethodReference.getResponse(new Subject(), Claim::getSubject));
    }
}
