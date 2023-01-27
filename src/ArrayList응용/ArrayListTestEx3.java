package ArrayList응용;
import java.util.ArrayList;
import java.util.List;

public class ArrayListTestEx3 {
    public static void main(String[] args) {
        List<MemberInfo> memList = new ArrayList<>();
        memList.add(new MemberInfo("김정민","qhwkal1","kjm401","qhwkal1@naver.com",
                "010-6484-6484",28));
        memList.add(new MemberInfo("장원영","jwy01","jyw1234","jwy@gmail.com",
                "010-4924-8132",20));
        memList.add(new MemberInfo("유나","yuna","yuna1234","yuna@gmail.com",
                "010-5214-8111",20));

        for(MemberInfo info : memList) {
            info.viewInfo();
        }

    }
}
