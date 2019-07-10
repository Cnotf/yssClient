
package saveclient;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.util.Date;

public class TimeAdapter
    extends XmlAdapter<String, Date>
{


    @Override
    public Date unmarshal(String value) {
        return (org.apache.cxf.tools.common.DataTypeAdapter.parseTime(value));
    }

    @Override
    public String marshal(Date value) {
        return (org.apache.cxf.tools.common.DataTypeAdapter.printTime(value));
    }

}
