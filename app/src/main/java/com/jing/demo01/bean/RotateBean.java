package com.jing.demo01.bean;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * Created by Administrator on 2017/3/24 0024.
 */

public class RotateBean extends BaseBean implements Parcelable {
    /**
     * err_no : 0
     * err_msg :
     * ex : asdfasdfasdf
     * records : [{"type":"open_page","pic_url":"http://www.youku.com/asdfasdfas.png","link_url":"http://www.youku.com/asdfad.html"},{"type":"open_comic","pic_url":"http://www.youku.com/asdfasdfas.png","link_cid":"sdtertehhee"},{"type":"open_tab","pic_url":"http://www.youku.com/asdfasdfas.png","link_tid":"wretrewrtewrt"},"\u2026\u2026"]
     */

    private List<RecordsBean> records;

    public List<RecordsBean> getRecords() {
        return records;
    }

    public void setRecords(List<RecordsBean> records) {
        this.records = records;
    }

    @Override
    public String toString() {
        return "RotateBean{" +
                "records=" + records +
                '}';
    }

    public static class RecordsBean implements Parcelable {
        /**
         * type : open_page
         * pic_url : http://www.youku.com/asdfasdfas.png
         * link_url : http://www.youku.com/asdfad.html
         * link_cid : sdtertehhee
         * link_tid : wretrewrtewrt
         *
         * {"err_no":"0","err_msg":"","records":[{"type":"open_page","pic_url":"http://112.74.182.187/upload/image/20c9f2dd36ba6ba161d27d79e28b749c.jpeg","link_url":"http://www.baidu.com"},{"type":"open_page","pic_url":"http://112.74.182.187/upload/image/timg.jpg","link_url":"http://www.baidu.com"}]}
         */

        private String type;
        private String pic_url;
        private String link_url;
        private String link_cid;
        private String link_tid;

        @Override
        public String toString() {
            return "RecordsBean{" +
                    "type='" + type + '\'' +
                    ", pic_url='" + pic_url + '\'' +
                    ", link_url='" + link_url + '\'' +
                    ", link_cid='" + link_cid + '\'' +
                    ", link_tid='" + link_tid + '\'' +
                    '}';
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getPic_url() {
            return pic_url;
        }

        public void setPic_url(String pic_url) {
            this.pic_url = pic_url;
        }

        public String getLink_url() {
            return link_url;
        }

        public void setLink_url(String link_url) {
            this.link_url = link_url;
        }

        public String getLink_cid() {
            return link_cid;
        }

        public void setLink_cid(String link_cid) {
            this.link_cid = link_cid;
        }

        public String getLink_tid() {
            return link_tid;
        }

        public void setLink_tid(String link_tid) {
            this.link_tid = link_tid;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.type);
            dest.writeString(this.pic_url);
            dest.writeString(this.link_url);
            dest.writeString(this.link_cid);
            dest.writeString(this.link_tid);
        }

        public RecordsBean() {
        }

        protected RecordsBean(Parcel in) {
            this.type = in.readString();
            this.pic_url = in.readString();
            this.link_url = in.readString();
            this.link_cid = in.readString();
            this.link_tid = in.readString();
        }

        public static final Creator<RecordsBean> CREATOR = new Creator<RecordsBean>() {
            @Override
            public RecordsBean createFromParcel(Parcel source) {
                return new RecordsBean(source);
            }

            @Override
            public RecordsBean[] newArray(int size) {
                return new RecordsBean[size];
            }
        };
    }

    public RotateBean() {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeTypedList(this.records);
    }

    protected RotateBean(Parcel in) {
        this.records = in.createTypedArrayList(RecordsBean.CREATOR);
    }

    public static final Parcelable.Creator<RotateBean> CREATOR = new Parcelable.Creator<RotateBean>() {
        @Override
        public RotateBean createFromParcel(Parcel source) {
            return new RotateBean(source);
        }

        @Override
        public RotateBean[] newArray(int size) {
            return new RotateBean[size];
        }
    };
}
