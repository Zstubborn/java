package lhm.hcy.guge.frameset.cache;

/**  
 * Description: ����DTO  
 * @author zzhao  2015-08-14  
 * @version 1.0  
 */  
public class Cache {
        private String key;//����ID   
        private Object value;//��������   
        private long timeOut;//����ʱ��   
        private boolean expired; //�Ƿ���ֹ   
        public Cache() {   
                super();   
        }   
  
        public Cache(String key, Object value, long timeOut, boolean expired) {   
                this.key = key;   
                this.value = value;   
                this.timeOut = timeOut;   
                this.expired = expired;   
        }   
  
        public String getKey() {   
                return key;   
        }   
  
        public long getTimeOut() {   
                return timeOut;   
        }   
  
        public Object getValue() {   
                return value;   
        }   
  
        public void setKey(String string) {   
                key = string;   
        }   
  
        public void setTimeOut(long l) {   
                timeOut = l;   
        }   
  
        public void setValue(Object object) {   
                value = object;   
        }   
  
        public boolean isExpired() {   
                return expired;   
        }   
  
        public void setExpired(boolean b) {   
                expired = b;   
        }   
}   

