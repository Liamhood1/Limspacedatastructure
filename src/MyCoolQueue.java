import java.util.Objects;

public class MyCoolQueue implements DataStructure {
    Object[] data = new Object[100];
    //Fields for knowing where to put next
    int nextPut = 0;
    //Field for knowing where to get next
    int nextGet = 0;
    //Field for knowing if there is space to put into and if there is an object to get
    int dataUsed = 0;

    // Methods
    public boolean put(Object obj) {
        if (dataUsed < 100) {
            dataUsed = dataUsed + 1;
            data[nextPut] = obj;
            if (nextPut < 99) {
                nextPut = nextPut + 1;
            } else {
                nextPut = 0;
            }
            return true;
        } else {
            return false;
        }
    }


       public Object get() {
            if (dataUsed > 0) {
                Object value = data[nextGet];
                dataUsed = dataUsed - 1;
                if (nextGet < 99) {
                    nextGet = nextGet + 1;
                } else {
                    nextGet = 0;
                }
                return value;
            } else {
                return null;
            }


        }
    }
