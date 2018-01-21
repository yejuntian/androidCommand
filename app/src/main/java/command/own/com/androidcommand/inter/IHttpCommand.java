package command.own.com.androidcommand.inter;

import android.content.Context;

/**
 * Created by tianyejun on 2018/1/21.
 */

public interface IHttpCommand<T extends IRequestParam> {
    public enum RequestType {
        DEAFULT(0),
        GET(1),
        POST(2),
        DELETE(3);
        private int type;

        private RequestType(int type) {
            this.type = type;
        }

        public int getType() {
            return type;
        }
    }

    public String excute(Context context, String url, RequestType requestType, T requestParam);
}
