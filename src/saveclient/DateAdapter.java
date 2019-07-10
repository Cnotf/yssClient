
package saveclient;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.util.Date;

public class DateAdapter
    extends XmlAdapter<String, Date>
{


    @Override
    public Date unmarshal(String value) {
        return (org.apache.cxf.tools.common.DataTypeAdapter.parseDate(value));
    }

    @Override
    public String marshal(Date value) {
        return (org.apache.cxf.tools.common.DataTypeAdapter.printDate(value));
    }

}
