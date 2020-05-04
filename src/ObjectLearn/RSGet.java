package ObjectLearn;

import java.util.ArrayList;
import java.util.List;

public class RSGet {

    ResourceStatus status = ResourceStatus.builder()
            .id("6547506")
            .type("qingting")
            .action("offline").build();
    List<ResourceStatus> statusList = new ArrayList<>();
        statusList.add(status);
    ResourceUpdate update = ResourceUpdate.builder().total(1).data(statusList).build();


}
