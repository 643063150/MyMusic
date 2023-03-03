package com.zpp.mobile.mymusic.enerty;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @ProjectName: MyMusic
 * @Package: com.zpp.mobile.mymusic.enerty
 * @ClassName: HomeEnerty
 * @Description:
 * @Author: zpp
 * @CreateDate: 2023/3/3 16:54
 * @UpdateUser:
 * @UpdateDate: 2023/3/3 16:54
 * @UpdateRemark:
 */
public class HomeEnerty {

    private ResponseBean response;

    public ResponseBean getResponse() {
        return response;
    }

    public void setResponse(ResponseBean response) {
        this.response = response;
    }

    public static class ResponseBean {

        private int code;
        private long ts;
        private long start_ts;
        private String traceid;
        private CategoryBeanX category;
        private RecomPlaylistBean recomPlaylist;
        private PlaylistBean playlist;
        private NewSongBean new_song;
        private NewAlbumBean new_album;
        private NewAlbumTagBean new_album_tag;
        private ToplistBeanX toplist;
        private FocusBean focus;

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public long getTs() {
            return ts;
        }

        public void setTs(long ts) {
            this.ts = ts;
        }

        public long getStart_ts() {
            return start_ts;
        }

        public void setStart_ts(long start_ts) {
            this.start_ts = start_ts;
        }

        public String getTraceid() {
            return traceid;
        }

        public void setTraceid(String traceid) {
            this.traceid = traceid;
        }

        public CategoryBeanX getCategory() {
            return category;
        }

        public void setCategory(CategoryBeanX category) {
            this.category = category;
        }

        public RecomPlaylistBean getRecomPlaylist() {
            return recomPlaylist;
        }

        public void setRecomPlaylist(RecomPlaylistBean recomPlaylist) {
            this.recomPlaylist = recomPlaylist;
        }

        public PlaylistBean getPlaylist() {
            return playlist;
        }

        public void setPlaylist(PlaylistBean playlist) {
            this.playlist = playlist;
        }

        public NewSongBean getNew_song() {
            return new_song;
        }

        public void setNew_song(NewSongBean new_song) {
            this.new_song = new_song;
        }

        public NewAlbumBean getNew_album() {
            return new_album;
        }

        public void setNew_album(NewAlbumBean new_album) {
            this.new_album = new_album;
        }

        public NewAlbumTagBean getNew_album_tag() {
            return new_album_tag;
        }

        public void setNew_album_tag(NewAlbumTagBean new_album_tag) {
            this.new_album_tag = new_album_tag;
        }

        public ToplistBeanX getToplist() {
            return toplist;
        }

        public void setToplist(ToplistBeanX toplist) {
            this.toplist = toplist;
        }

        public FocusBean getFocus() {
            return focus;
        }

        public void setFocus(FocusBean focus) {
            this.focus = focus;
        }

        public static class CategoryBeanX {
            /**
             * code : 0
             * data : {"category":[{"group_id":1,"group_name":"热门推荐","items":[{"item_id":3357,"item_name":"九月推荐","item_desc":"","item_new":0,"item_hot":0,"show_type":0,"is_parent":0,"reimgurl":"http://y.gtimg.cn/music/common/upload/recent_category_pic/55372.png","item_share_pic":"","show_detail":0,"group_id":0},{"item_id":71,"item_name":"情歌","item_desc":"千万种爱的语言,总有一首适合你!","item_new":0,"item_hot":0,"show_type":0,"is_parent":0,"reimgurl":"http://y.gtimg.cn/music/common/upload/recent_category_pic/55372.png","item_share_pic":"","show_detail":0,"group_id":0},{"item_id":3056,"item_name":"网络歌曲","item_desc":"最热的网络歌曲，给你听个够！","item_new":0,"item_hot":0,"show_type":0,"is_parent":0,"reimgurl":"http://y.gtimg.cn/music/common/upload/recent_category_pic/55372.png","item_share_pic":"","show_detail":0,"group_id":0},{"item_id":3317,"item_name":"官方歌单","item_desc":"","item_new":0,"item_hot":0,"show_type":1,"is_parent":0,"reimgurl":"","item_share_pic":"","show_detail":0,"group_id":0},{"item_id":59,"item_name":"经典","item_desc":"","item_new":0,"item_hot":0,"show_type":1,"is_parent":0,"reimgurl":"","item_share_pic":"","show_detail":0,"group_id":0},{"item_id":64,"item_name":"KTV热歌","item_desc":"","item_new":0,"item_hot":0,"show_type":1,"is_parent":0,"reimgurl":"","item_share_pic":"","show_detail":0,"group_id":0},{"item_id":107,"item_name":"背景音乐","item_desc":"","item_new":0,"item_hot":0,"show_type":1,"is_parent":0,"reimgurl":"","item_share_pic":"","show_detail":0,"group_id":0},{"item_id":74,"item_name":"伤感","item_desc":"","item_new":0,"item_hot":0,"show_type":1,"is_parent":0,"reimgurl":"","item_share_pic":"","show_detail":0,"group_id":0},{"item_id":3,"item_name":"英语","item_desc":"","item_new":0,"item_hot":0,"show_type":1,"is_parent":0,"reimgurl":"","item_share_pic":"","show_detail":0,"group_id":0},{"item_id":1,"item_name":"国语","item_desc":"","item_new":0,"item_hot":0,"show_type":1,"is_parent":0,"reimgurl":"","item_share_pic":"","show_detail":0,"group_id":0},{"item_id":45,"item_name":"电子","item_desc":"","item_new":0,"item_hot":0,"show_type":1,"is_parent":0,"reimgurl":"","item_share_pic":"","show_detail":0,"group_id":0},{"item_id":46,"item_name":"爵士","item_desc":"","item_new":0,"item_hot":0,"show_type":1,"is_parent":0,"reimgurl":"","item_share_pic":"","show_detail":0,"group_id":0},{"item_id":49,"item_name":"轻音乐","item_desc":"","item_new":0,"item_hot":1,"show_type":1,"is_parent":0,"reimgurl":"","item_share_pic":"","show_detail":0,"group_id":0},{"item_id":142,"item_name":"90年代","item_desc":"","item_new":0,"item_hot":0,"show_type":1,"is_parent":0,"reimgurl":"","item_share_pic":"","show_detail":0,"group_id":0},{"item_id":9,"item_name":"寂寞","item_desc":"","item_new":0,"item_hot":0,"show_type":1,"is_parent":0,"reimgurl":"","item_share_pic":"","show_detail":0,"group_id":0},{"item_id":-100,"item_name":"全部分类","item_desc":"","item_new":0,"item_hot":0,"show_type":0,"is_parent":0,"reimgurl":"","item_share_pic":"","show_detail":0,"group_id":0}]}]}
             */

            private int code;
            private DataBean data;

            public int getCode() {
                return code;
            }

            public void setCode(int code) {
                this.code = code;
            }

            public DataBean getData() {
                return data;
            }

            public void setData(DataBean data) {
                this.data = data;
            }

            public static class DataBean {
                private List<CategoryBean> category;

                public List<CategoryBean> getCategory() {
                    return category;
                }

                public void setCategory(List<CategoryBean> category) {
                    this.category = category;
                }

                public static class CategoryBean {
                    /**
                     * group_id : 1
                     * group_name : 热门推荐
                     * items : [{"item_id":3357,"item_name":"九月推荐","item_desc":"","item_new":0,"item_hot":0,"show_type":0,"is_parent":0,"reimgurl":"http://y.gtimg.cn/music/common/upload/recent_category_pic/55372.png","item_share_pic":"","show_detail":0,"group_id":0},{"item_id":71,"item_name":"情歌","item_desc":"千万种爱的语言,总有一首适合你!","item_new":0,"item_hot":0,"show_type":0,"is_parent":0,"reimgurl":"http://y.gtimg.cn/music/common/upload/recent_category_pic/55372.png","item_share_pic":"","show_detail":0,"group_id":0},{"item_id":3056,"item_name":"网络歌曲","item_desc":"最热的网络歌曲，给你听个够！","item_new":0,"item_hot":0,"show_type":0,"is_parent":0,"reimgurl":"http://y.gtimg.cn/music/common/upload/recent_category_pic/55372.png","item_share_pic":"","show_detail":0,"group_id":0},{"item_id":3317,"item_name":"官方歌单","item_desc":"","item_new":0,"item_hot":0,"show_type":1,"is_parent":0,"reimgurl":"","item_share_pic":"","show_detail":0,"group_id":0},{"item_id":59,"item_name":"经典","item_desc":"","item_new":0,"item_hot":0,"show_type":1,"is_parent":0,"reimgurl":"","item_share_pic":"","show_detail":0,"group_id":0},{"item_id":64,"item_name":"KTV热歌","item_desc":"","item_new":0,"item_hot":0,"show_type":1,"is_parent":0,"reimgurl":"","item_share_pic":"","show_detail":0,"group_id":0},{"item_id":107,"item_name":"背景音乐","item_desc":"","item_new":0,"item_hot":0,"show_type":1,"is_parent":0,"reimgurl":"","item_share_pic":"","show_detail":0,"group_id":0},{"item_id":74,"item_name":"伤感","item_desc":"","item_new":0,"item_hot":0,"show_type":1,"is_parent":0,"reimgurl":"","item_share_pic":"","show_detail":0,"group_id":0},{"item_id":3,"item_name":"英语","item_desc":"","item_new":0,"item_hot":0,"show_type":1,"is_parent":0,"reimgurl":"","item_share_pic":"","show_detail":0,"group_id":0},{"item_id":1,"item_name":"国语","item_desc":"","item_new":0,"item_hot":0,"show_type":1,"is_parent":0,"reimgurl":"","item_share_pic":"","show_detail":0,"group_id":0},{"item_id":45,"item_name":"电子","item_desc":"","item_new":0,"item_hot":0,"show_type":1,"is_parent":0,"reimgurl":"","item_share_pic":"","show_detail":0,"group_id":0},{"item_id":46,"item_name":"爵士","item_desc":"","item_new":0,"item_hot":0,"show_type":1,"is_parent":0,"reimgurl":"","item_share_pic":"","show_detail":0,"group_id":0},{"item_id":49,"item_name":"轻音乐","item_desc":"","item_new":0,"item_hot":1,"show_type":1,"is_parent":0,"reimgurl":"","item_share_pic":"","show_detail":0,"group_id":0},{"item_id":142,"item_name":"90年代","item_desc":"","item_new":0,"item_hot":0,"show_type":1,"is_parent":0,"reimgurl":"","item_share_pic":"","show_detail":0,"group_id":0},{"item_id":9,"item_name":"寂寞","item_desc":"","item_new":0,"item_hot":0,"show_type":1,"is_parent":0,"reimgurl":"","item_share_pic":"","show_detail":0,"group_id":0},{"item_id":-100,"item_name":"全部分类","item_desc":"","item_new":0,"item_hot":0,"show_type":0,"is_parent":0,"reimgurl":"","item_share_pic":"","show_detail":0,"group_id":0}]
                     */

                    private int group_id;
                    private String group_name;
                    private List<ItemsBean> items;

                    public int getGroup_id() {
                        return group_id;
                    }

                    public void setGroup_id(int group_id) {
                        this.group_id = group_id;
                    }

                    public String getGroup_name() {
                        return group_name;
                    }

                    public void setGroup_name(String group_name) {
                        this.group_name = group_name;
                    }

                    public List<ItemsBean> getItems() {
                        return items;
                    }

                    public void setItems(List<ItemsBean> items) {
                        this.items = items;
                    }

                    public static class ItemsBean {
                        /**
                         * item_id : 3357
                         * item_name : 九月推荐
                         * item_desc :
                         * item_new : 0
                         * item_hot : 0
                         * show_type : 0
                         * is_parent : 0
                         * reimgurl : http://y.gtimg.cn/music/common/upload/recent_category_pic/55372.png
                         * item_share_pic :
                         * show_detail : 0
                         * group_id : 0
                         */

                        private int item_id;
                        private String item_name;
                        private String item_desc;
                        private int item_new;
                        private int item_hot;
                        private int show_type;
                        private int is_parent;
                        private String reimgurl;
                        private String item_share_pic;
                        private int show_detail;
                        private int group_id;

                        public int getItem_id() {
                            return item_id;
                        }

                        public void setItem_id(int item_id) {
                            this.item_id = item_id;
                        }

                        public String getItem_name() {
                            return item_name;
                        }

                        public void setItem_name(String item_name) {
                            this.item_name = item_name;
                        }

                        public String getItem_desc() {
                            return item_desc;
                        }

                        public void setItem_desc(String item_desc) {
                            this.item_desc = item_desc;
                        }

                        public int getItem_new() {
                            return item_new;
                        }

                        public void setItem_new(int item_new) {
                            this.item_new = item_new;
                        }

                        public int getItem_hot() {
                            return item_hot;
                        }

                        public void setItem_hot(int item_hot) {
                            this.item_hot = item_hot;
                        }

                        public int getShow_type() {
                            return show_type;
                        }

                        public void setShow_type(int show_type) {
                            this.show_type = show_type;
                        }

                        public int getIs_parent() {
                            return is_parent;
                        }

                        public void setIs_parent(int is_parent) {
                            this.is_parent = is_parent;
                        }

                        public String getReimgurl() {
                            return reimgurl;
                        }

                        public void setReimgurl(String reimgurl) {
                            this.reimgurl = reimgurl;
                        }

                        public String getItem_share_pic() {
                            return item_share_pic;
                        }

                        public void setItem_share_pic(String item_share_pic) {
                            this.item_share_pic = item_share_pic;
                        }

                        public int getShow_detail() {
                            return show_detail;
                        }

                        public void setShow_detail(int show_detail) {
                            this.show_detail = show_detail;
                        }

                        public int getGroup_id() {
                            return group_id;
                        }

                        public void setGroup_id(int group_id) {
                            this.group_id = group_id;
                        }
                    }
                }
            }
        }

        public static class RecomPlaylistBean {
            /**
             * code : 0
             * data : {"page":0,"v_hot":[{"album_pic_mid":"","content_id":7745421521,"cover":"http://qpic.y.qq.com/music_cover/zQII3lJrGSNNoWObRlPoys4sNl35qyw1JX0NNIVlGDR9GDu4dK7R4Q/300?n=1","creator":2749180238,"edge_mark":"","id":0,"is_dj":false,"is_vip":true,"jump_url":"","listen_num":44133801,"pic_mid":"","rcmdcontent":"","rcmdtemplate":"编辑推荐","rcmdtype":0,"singerid":0,"title":"时代少年团｜我们一起并肩前行","tjreport":"","type":10014,"username":"顾雨菲"},{"album_pic_mid":"004QHJ0A3rXB9Y","content_id":7675104902,"cover":"http://qpic.y.qq.com/music_cover/NdzibUgT17lZoDhtI4ozl86fWZOuXuCfP7iaduiauuv9kxiciayXicoXp1icQ/300?n=1","creator":2186002180,"edge_mark":"","id":0,"is_dj":false,"is_vip":true,"jump_url":"","listen_num":13932045,"pic_mid":"","rcmdcontent":"","rcmdtemplate":"编辑推荐","rcmdtype":0,"singerid":0,"title":"纯音乐☁超治愈☁适合学习喔～","tjreport":"","type":10014,"username":"平泽唯唯"},{"album_pic_mid":"","content_id":3540484302,"cover":"http://qpic.y.qq.com/music_cover/Cz8Z9ECDQia3gE2YticLiaJ22KNOu00Czu4RYkZmia3kAhUCYhiaPZ6qXQg/300?n=1","creator":931905769,"edge_mark":"","id":0,"is_dj":false,"is_vip":true,"jump_url":"","listen_num":70647886,"pic_mid":"000r2wk20Ko2OZ","rcmdcontent":"","rcmdtemplate":"编辑推荐","rcmdtype":0,"singerid":0,"title":"学霸必备：专心写作业 享受轻音乐好时光","tjreport":"","type":10014,"username":"陈哲"},{"album_pic_mid":"003SK5X22P15Fc","content_id":8029241405,"cover":"http://qpic.y.qq.com/music_cover/kGLjZpdYBzic5qRiclmCYnIqA1cicEhE2iaiaVQ2VsrNfkDL3VTlF41vQeicJo3TORyjEP/300?n=1","creator":1152921504768511500,"edge_mark":"","id":0,"is_dj":false,"is_vip":true,"jump_url":"","listen_num":2822532,"pic_mid":"","rcmdcontent":"","rcmdtemplate":"编辑推荐","rcmdtype":0,"singerid":0,"title":"『独家欧美』晚风踩着云朵贩卖爱","tjreport":"","type":10014,"username":"honeysea🍯"},{"album_pic_mid":"000I5jJB3blWeN","content_id":892344800,"cover":"http://qpic.y.qq.com/music_cover/H4L7icoRhSgTiaJ9e6rNiaM8UDZPUUVp2YNicNcGwXfIBevr2FUPTEia5Tg/300?n=1","creator":1587080800,"edge_mark":"","id":0,"is_dj":false,"is_vip":true,"jump_url":"","listen_num":11522739,"pic_mid":"002SOanN36Cn6W","rcmdcontent":"","rcmdtemplate":"编辑推荐","rcmdtype":0,"singerid":0,"title":"\u201c三杰\u201d 时光荏苒,追寻逝去流年","tjreport":"","type":10014,"username":"鲸落化为孤岛"},{"album_pic_mid":"","content_id":4144081013,"cover":"http://qpic.y.qq.com/music_cover/sCdyUKgxMOFRx0cRlichSyiblJsoZwNMjfXbCsSHFN5VzMaPKfiaVvKLw/300?n=1","creator":294109499,"edge_mark":"","id":0,"is_dj":false,"is_vip":false,"jump_url":"","listen_num":5426112,"pic_mid":"001kKNCs05X1U7","rcmdcontent":"","rcmdtemplate":"编辑推荐","rcmdtype":0,"singerid":0,"title":"Trap Rap丨慵懒毒性的迷幻说唱","tjreport":"","type":10014,"username":"冷山集"},{"album_pic_mid":"004BMRwh1rFgxf","content_id":7915412634,"cover":"http://qpic.y.qq.com/music_cover/ebxVDMSrIr0KHic07h73iaczzoeyZsjb9j01rmmlCafZmJSH4TfF4aKQ/300?n=1","creator":1242012453,"edge_mark":"","id":0,"is_dj":false,"is_vip":true,"jump_url":"","listen_num":2346670,"pic_mid":"","rcmdcontent":"","rcmdtemplate":"编辑推荐","rcmdtype":0,"singerid":0,"title":"纯音入眠佳曲: 治愈午后小时光","tjreport":"","type":10014,"username":"自渡·"},{"album_pic_mid":"","content_id":7727231376,"cover":"http://qpic.y.qq.com/music_cover/EXVh00J0l1orGx5nKZymFUySLctkBibpFtNX47YA5Hxo07icA9KtVvPQ/300?n=1","creator":2638819171,"edge_mark":"","id":0,"is_dj":false,"is_vip":true,"jump_url":"","listen_num":3459054,"pic_mid":"","rcmdcontent":"","rcmdtemplate":"编辑推荐","rcmdtype":0,"singerid":0,"title":"中文MC感情麦：喊出人生道理","tjreport":"","type":10014,"username":"王亚鹏"},{"album_pic_mid":"0032YJyg2yF6Dd","content_id":7950589030,"cover":"http://qpic.y.qq.com/music_cover/Zqn9d9hvgT1O39PeFzU41Hp5NT1aq0rvZlanf9D1ediaAKibx9NIOSlQ/300?n=1","creator":2900403492,"edge_mark":"","id":0,"is_dj":false,"is_vip":true,"jump_url":"","listen_num":87930971,"pic_mid":"","rcmdcontent":"","rcmdtemplate":"编辑推荐","rcmdtype":0,"singerid":0,"title":"「独享时光」独处是一个人的清欢","tjreport":"","type":10014,"username":"安可"},{"album_pic_mid":"000tgRoL13FtLP","content_id":8119485961,"cover":"http://qpic.y.qq.com/music_cover/S9gjdWgE7YHcVKbco05ibzZicnhn2uZ8YcQg0yaqBpxMHCW5h38NJV8Q/300?n=1","creator":471328934,"edge_mark":"","id":0,"is_dj":false,"is_vip":true,"jump_url":"","listen_num":6864802,"pic_mid":"","rcmdcontent":"","rcmdtemplate":"编辑推荐","rcmdtype":0,"singerid":0,"title":"古风戏腔 |戏已开场 八方开听","tjreport":"","type":10014,"username":"青春猪头少年"},{"album_pic_mid":"000n3m8q2rGbs7","content_id":8039753464,"cover":"http://qpic.y.qq.com/music_cover/DuKUYHgAKNJF4HrKEl0FiazorlnZJYhBuT2vib9xCILP21q5tVPyibqew/300?n=1","creator":1805446925,"edge_mark":"","id":0,"is_dj":false,"is_vip":true,"jump_url":"","listen_num":18169519,"pic_mid":"","rcmdcontent":"","rcmdtemplate":"编辑推荐","rcmdtype":0,"singerid":0,"title":"片段翻唱 ｜把落日余晖藏在心里","tjreport":"","type":10014,"username":"半岛"},{"album_pic_mid":"002PWhAB3xF3YX","content_id":8054858756,"cover":"http://qpic.y.qq.com/music_cover/It6JAhhBKnxpIb5RK4NEW74QhjWicIRqXys99libXsibAteuJy7kribNicCtGEhaUQ1icy/300?n=1","creator":1152921505114010400,"edge_mark":"","id":0,"is_dj":false,"is_vip":true,"jump_url":"","listen_num":5187917,"pic_mid":"","rcmdcontent":"","rcmdtemplate":"编辑推荐","rcmdtype":0,"singerid":0,"title":"Rapper情话看世间万物皆是浪漫","tjreport":"","type":10014,"username":"Koi"}]}
             */

            private int code;
            private DataBeanX data;

            public int getCode() {
                return code;
            }

            public void setCode(int code) {
                this.code = code;
            }

            public DataBeanX getData() {
                return data;
            }

            public void setData(DataBeanX data) {
                this.data = data;
            }

            public static class DataBeanX {
                /**
                 * page : 0
                 * v_hot : [{"album_pic_mid":"","content_id":7745421521,"cover":"http://qpic.y.qq.com/music_cover/zQII3lJrGSNNoWObRlPoys4sNl35qyw1JX0NNIVlGDR9GDu4dK7R4Q/300?n=1","creator":2749180238,"edge_mark":"","id":0,"is_dj":false,"is_vip":true,"jump_url":"","listen_num":44133801,"pic_mid":"","rcmdcontent":"","rcmdtemplate":"编辑推荐","rcmdtype":0,"singerid":0,"title":"时代少年团｜我们一起并肩前行","tjreport":"","type":10014,"username":"顾雨菲"},{"album_pic_mid":"004QHJ0A3rXB9Y","content_id":7675104902,"cover":"http://qpic.y.qq.com/music_cover/NdzibUgT17lZoDhtI4ozl86fWZOuXuCfP7iaduiauuv9kxiciayXicoXp1icQ/300?n=1","creator":2186002180,"edge_mark":"","id":0,"is_dj":false,"is_vip":true,"jump_url":"","listen_num":13932045,"pic_mid":"","rcmdcontent":"","rcmdtemplate":"编辑推荐","rcmdtype":0,"singerid":0,"title":"纯音乐☁超治愈☁适合学习喔～","tjreport":"","type":10014,"username":"平泽唯唯"},{"album_pic_mid":"","content_id":3540484302,"cover":"http://qpic.y.qq.com/music_cover/Cz8Z9ECDQia3gE2YticLiaJ22KNOu00Czu4RYkZmia3kAhUCYhiaPZ6qXQg/300?n=1","creator":931905769,"edge_mark":"","id":0,"is_dj":false,"is_vip":true,"jump_url":"","listen_num":70647886,"pic_mid":"000r2wk20Ko2OZ","rcmdcontent":"","rcmdtemplate":"编辑推荐","rcmdtype":0,"singerid":0,"title":"学霸必备：专心写作业 享受轻音乐好时光","tjreport":"","type":10014,"username":"陈哲"},{"album_pic_mid":"003SK5X22P15Fc","content_id":8029241405,"cover":"http://qpic.y.qq.com/music_cover/kGLjZpdYBzic5qRiclmCYnIqA1cicEhE2iaiaVQ2VsrNfkDL3VTlF41vQeicJo3TORyjEP/300?n=1","creator":1152921504768511500,"edge_mark":"","id":0,"is_dj":false,"is_vip":true,"jump_url":"","listen_num":2822532,"pic_mid":"","rcmdcontent":"","rcmdtemplate":"编辑推荐","rcmdtype":0,"singerid":0,"title":"『独家欧美』晚风踩着云朵贩卖爱","tjreport":"","type":10014,"username":"honeysea🍯"},{"album_pic_mid":"000I5jJB3blWeN","content_id":892344800,"cover":"http://qpic.y.qq.com/music_cover/H4L7icoRhSgTiaJ9e6rNiaM8UDZPUUVp2YNicNcGwXfIBevr2FUPTEia5Tg/300?n=1","creator":1587080800,"edge_mark":"","id":0,"is_dj":false,"is_vip":true,"jump_url":"","listen_num":11522739,"pic_mid":"002SOanN36Cn6W","rcmdcontent":"","rcmdtemplate":"编辑推荐","rcmdtype":0,"singerid":0,"title":"\u201c三杰\u201d 时光荏苒,追寻逝去流年","tjreport":"","type":10014,"username":"鲸落化为孤岛"},{"album_pic_mid":"","content_id":4144081013,"cover":"http://qpic.y.qq.com/music_cover/sCdyUKgxMOFRx0cRlichSyiblJsoZwNMjfXbCsSHFN5VzMaPKfiaVvKLw/300?n=1","creator":294109499,"edge_mark":"","id":0,"is_dj":false,"is_vip":false,"jump_url":"","listen_num":5426112,"pic_mid":"001kKNCs05X1U7","rcmdcontent":"","rcmdtemplate":"编辑推荐","rcmdtype":0,"singerid":0,"title":"Trap Rap丨慵懒毒性的迷幻说唱","tjreport":"","type":10014,"username":"冷山集"},{"album_pic_mid":"004BMRwh1rFgxf","content_id":7915412634,"cover":"http://qpic.y.qq.com/music_cover/ebxVDMSrIr0KHic07h73iaczzoeyZsjb9j01rmmlCafZmJSH4TfF4aKQ/300?n=1","creator":1242012453,"edge_mark":"","id":0,"is_dj":false,"is_vip":true,"jump_url":"","listen_num":2346670,"pic_mid":"","rcmdcontent":"","rcmdtemplate":"编辑推荐","rcmdtype":0,"singerid":0,"title":"纯音入眠佳曲: 治愈午后小时光","tjreport":"","type":10014,"username":"自渡·"},{"album_pic_mid":"","content_id":7727231376,"cover":"http://qpic.y.qq.com/music_cover/EXVh00J0l1orGx5nKZymFUySLctkBibpFtNX47YA5Hxo07icA9KtVvPQ/300?n=1","creator":2638819171,"edge_mark":"","id":0,"is_dj":false,"is_vip":true,"jump_url":"","listen_num":3459054,"pic_mid":"","rcmdcontent":"","rcmdtemplate":"编辑推荐","rcmdtype":0,"singerid":0,"title":"中文MC感情麦：喊出人生道理","tjreport":"","type":10014,"username":"王亚鹏"},{"album_pic_mid":"0032YJyg2yF6Dd","content_id":7950589030,"cover":"http://qpic.y.qq.com/music_cover/Zqn9d9hvgT1O39PeFzU41Hp5NT1aq0rvZlanf9D1ediaAKibx9NIOSlQ/300?n=1","creator":2900403492,"edge_mark":"","id":0,"is_dj":false,"is_vip":true,"jump_url":"","listen_num":87930971,"pic_mid":"","rcmdcontent":"","rcmdtemplate":"编辑推荐","rcmdtype":0,"singerid":0,"title":"「独享时光」独处是一个人的清欢","tjreport":"","type":10014,"username":"安可"},{"album_pic_mid":"000tgRoL13FtLP","content_id":8119485961,"cover":"http://qpic.y.qq.com/music_cover/S9gjdWgE7YHcVKbco05ibzZicnhn2uZ8YcQg0yaqBpxMHCW5h38NJV8Q/300?n=1","creator":471328934,"edge_mark":"","id":0,"is_dj":false,"is_vip":true,"jump_url":"","listen_num":6864802,"pic_mid":"","rcmdcontent":"","rcmdtemplate":"编辑推荐","rcmdtype":0,"singerid":0,"title":"古风戏腔 |戏已开场 八方开听","tjreport":"","type":10014,"username":"青春猪头少年"},{"album_pic_mid":"000n3m8q2rGbs7","content_id":8039753464,"cover":"http://qpic.y.qq.com/music_cover/DuKUYHgAKNJF4HrKEl0FiazorlnZJYhBuT2vib9xCILP21q5tVPyibqew/300?n=1","creator":1805446925,"edge_mark":"","id":0,"is_dj":false,"is_vip":true,"jump_url":"","listen_num":18169519,"pic_mid":"","rcmdcontent":"","rcmdtemplate":"编辑推荐","rcmdtype":0,"singerid":0,"title":"片段翻唱 ｜把落日余晖藏在心里","tjreport":"","type":10014,"username":"半岛"},{"album_pic_mid":"002PWhAB3xF3YX","content_id":8054858756,"cover":"http://qpic.y.qq.com/music_cover/It6JAhhBKnxpIb5RK4NEW74QhjWicIRqXys99libXsibAteuJy7kribNicCtGEhaUQ1icy/300?n=1","creator":1152921505114010400,"edge_mark":"","id":0,"is_dj":false,"is_vip":true,"jump_url":"","listen_num":5187917,"pic_mid":"","rcmdcontent":"","rcmdtemplate":"编辑推荐","rcmdtype":0,"singerid":0,"title":"Rapper情话看世间万物皆是浪漫","tjreport":"","type":10014,"username":"Koi"}]
                 */

                private int page;
                private List<VHotBean> v_hot;

                public int getPage() {
                    return page;
                }

                public void setPage(int page) {
                    this.page = page;
                }

                public List<VHotBean> getV_hot() {
                    return v_hot;
                }

                public void setV_hot(List<VHotBean> v_hot) {
                    this.v_hot = v_hot;
                }

                public static class VHotBean {
                    /**
                     * album_pic_mid :
                     * content_id : 7745421521
                     * cover : http://qpic.y.qq.com/music_cover/zQII3lJrGSNNoWObRlPoys4sNl35qyw1JX0NNIVlGDR9GDu4dK7R4Q/300?n=1
                     * creator : 2749180238
                     * edge_mark :
                     * id : 0
                     * is_dj : false
                     * is_vip : true
                     * jump_url :
                     * listen_num : 44133801
                     * pic_mid :
                     * rcmdcontent :
                     * rcmdtemplate : 编辑推荐
                     * rcmdtype : 0
                     * singerid : 0
                     * title : 时代少年团｜我们一起并肩前行
                     * tjreport :
                     * type : 10014
                     * username : 顾雨菲
                     */

                    private String album_pic_mid;
                    private long content_id;
                    private String cover;
                    private long creator;
                    private String edge_mark;
                    private int id;
                    private boolean is_dj;
                    private boolean is_vip;
                    private String jump_url;
                    private int listen_num;
                    private String pic_mid;
                    private String rcmdcontent;
                    private String rcmdtemplate;
                    private int rcmdtype;
                    private int singerid;
                    private String title;
                    private String tjreport;
                    private int type;
                    private String username;

                    public String getAlbum_pic_mid() {
                        return album_pic_mid;
                    }

                    public void setAlbum_pic_mid(String album_pic_mid) {
                        this.album_pic_mid = album_pic_mid;
                    }

                    public long getContent_id() {
                        return content_id;
                    }

                    public void setContent_id(long content_id) {
                        this.content_id = content_id;
                    }

                    public String getCover() {
                        return cover;
                    }

                    public void setCover(String cover) {
                        this.cover = cover;
                    }

                    public long getCreator() {
                        return creator;
                    }

                    public void setCreator(long creator) {
                        this.creator = creator;
                    }

                    public String getEdge_mark() {
                        return edge_mark;
                    }

                    public void setEdge_mark(String edge_mark) {
                        this.edge_mark = edge_mark;
                    }

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public boolean isIs_dj() {
                        return is_dj;
                    }

                    public void setIs_dj(boolean is_dj) {
                        this.is_dj = is_dj;
                    }

                    public boolean isIs_vip() {
                        return is_vip;
                    }

                    public void setIs_vip(boolean is_vip) {
                        this.is_vip = is_vip;
                    }

                    public String getJump_url() {
                        return jump_url;
                    }

                    public void setJump_url(String jump_url) {
                        this.jump_url = jump_url;
                    }

                    public int getListen_num() {
                        return listen_num;
                    }

                    public void setListen_num(int listen_num) {
                        this.listen_num = listen_num;
                    }

                    public String getPic_mid() {
                        return pic_mid;
                    }

                    public void setPic_mid(String pic_mid) {
                        this.pic_mid = pic_mid;
                    }

                    public String getRcmdcontent() {
                        return rcmdcontent;
                    }

                    public void setRcmdcontent(String rcmdcontent) {
                        this.rcmdcontent = rcmdcontent;
                    }

                    public String getRcmdtemplate() {
                        return rcmdtemplate;
                    }

                    public void setRcmdtemplate(String rcmdtemplate) {
                        this.rcmdtemplate = rcmdtemplate;
                    }

                    public int getRcmdtype() {
                        return rcmdtype;
                    }

                    public void setRcmdtype(int rcmdtype) {
                        this.rcmdtype = rcmdtype;
                    }

                    public int getSingerid() {
                        return singerid;
                    }

                    public void setSingerid(int singerid) {
                        this.singerid = singerid;
                    }

                    public String getTitle() {
                        return title;
                    }

                    public void setTitle(String title) {
                        this.title = title;
                    }

                    public String getTjreport() {
                        return tjreport;
                    }

                    public void setTjreport(String tjreport) {
                        this.tjreport = tjreport;
                    }

                    public int getType() {
                        return type;
                    }

                    public void setType(int type) {
                        this.type = type;
                    }

                    public String getUsername() {
                        return username;
                    }

                    public void setUsername(String username) {
                        this.username = username;
                    }
                }
            }
        }

        public static class PlaylistBean {
            /**
             * code : 0
             * data : {"total":747,"v_playlist":[{"access_num":19652,"album_pic_mid":"","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1557669163,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/53Unr0jHFibpmKbAEqvT1Up9FHYm7Q2MotsQbicVBEVrkqClAlWwbn3g/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/53Unr0jHFibpmKbAEqvT1Up9FHYm7Q2MotsQbicVBEVrkqClAlWwbn3g/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/53Unr0jHFibpmKbAEqvT1Up9FHYm7Q2MotsQbicVBEVrkqClAlWwbn3g/600?n=1","create_time":1557476696,"creator_info":{"avatar":"","is_dj":0,"nick":"李狗蛋","taoge_avatar":"","taoge_nick":"","uin":1602037810,"vip_type":2},"creator_uin":1602037810,"desc":"","dirid":0,"fav_num":0,"modify_time":1592328568,"pic_mid":"","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[230950674,224790541,223366731,107279074,212944680,108392963,217159654,1331531,100789085,227936737,105187380,103691041,204470300,4843444,65428,7704217,494412,125224960,6453801,106550160],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[21,117],"tag_names":[],"tid":6975481262,"title":"慵懒爵士 | 清晨被窝的暖时光","tjreport":""},{"access_num":59797,"album_pic_mid":"001Sasqe2YWRlD","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1530075379,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/fx76QicKT5fa7gfzOBqCkDNyAhS2tibmEaHB0MiaxY1Lvib4tfI6WTkJhQ/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/fx76QicKT5fa7gfzOBqCkDNyAhS2tibmEaHB0MiaxY1Lvib4tfI6WTkJhQ/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/fx76QicKT5fa7gfzOBqCkDNyAhS2tibmEaHB0MiaxY1Lvib4tfI6WTkJhQ/600?n=1","create_time":1529978681,"creator_info":{"avatar":"","is_dj":0,"nick":"蘑菇爸爸和小乖妈妈","taoge_avatar":"","taoge_nick":"","uin":1302998248,"vip_type":7},"creator_uin":1302998248,"desc":"","dirid":0,"fav_num":0,"modify_time":1553074329,"pic_mid":"000SAiTQ4FOyyz","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[214121627,9471407,107586489,205522937,2500743,202738024,213222378,105112313,202815414,202736783,121751059,108032408,200314691,5379777,202155152,108013767,7055697,207642111],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[131,117],"tag_names":[],"tid":4180513374,"title":"这些歌可以提升宝宝食欲哦！","tjreport":""},{"access_num":36291,"album_pic_mid":"0000N4Rs3sJ1fm","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1561604231,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/y6QbkETndicaKm6IQ35YpHwWoOoGsq3eians5nrDibrWLLAzDFFwcIhcg/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/y6QbkETndicaKm6IQ35YpHwWoOoGsq3eians5nrDibrWLLAzDFFwcIhcg/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/y6QbkETndicaKm6IQ35YpHwWoOoGsq3eians5nrDibrWLLAzDFFwcIhcg/600?n=1","create_time":1561564113,"creator_info":{"avatar":"","is_dj":0,"nick":"Hard-with-Core","taoge_avatar":"","taoge_nick":"","uin":345766234,"vip_type":2},"creator_uin":345766234,"desc":"","dirid":0,"fav_num":0,"modify_time":1606916197,"pic_mid":"","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[285211252,285220604,286299561,282517203,280375514,281262741,279535339,276543255,279177555,270996376,277566400,277490410,277982501,279213831,271141120,269837089,269327264,269842522,268776705,267612960,268216037,268224482,262045564,263176474,264902989,264013984,263489940,260530296,260550883,260893771,261809935,257000973,257003445,256293475,256475514,256573012,255934977,255784597,255735711,254341285,254981609,254979096,254012054,253421721,253070748,247954689,247209287,247254788,245900518,245403003,245190455,243899573,240930332,238513746,237749089,237749127,237749126,237348541,236304638,236153678,235969182,235042187,234880516,234179250,234153027,234124255,233853689,230808185,232977212,228426659,229849699,228463348,228857436,229531298,229531288,228857423,231761611,229064582,227483582,229396544,232703567,233373358,232112570,228939532,228956634,231069539,232000769,231825185,232113576,232884388,230515266,233042420,231999688,228870975,233647265,229396543,228215723,226920504,232000473,228463321,227369563,228857558,229531287,229531292,229531291,229531293,229531294,229531296,229531297,228857426,230513921,232063032,231375299,229849690,229849698,228857430,233185023,233044156,232112772,233553041,232322249,232707985,230859449,230859455,230859454,230859451,228860978,224427301,230859447,231069692,231374487,228885625,228857591,228857594,228857439,225114981,225114979,225114972,232201293,232112463,231437026,230859453,229531289,225114976,228857595,228463304,229531295,229849695,229531290,228857596,229393568,229287409,230221875,229849697,231969634,233417621,232113474,232411806,229531299,229531300],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[24,14,117],"tag_names":[],"tid":7063425421,"title":"比利时硬派厂牌 | Dirty Workz","tjreport":""},{"access_num":58384,"album_pic_mid":"003nnB0x2hkAba","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1472608754,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/giaHouCicD4RCj22NHorNuk3bd8Jy5fvqL0xMDj0U0YkhZd0amTAQRrg/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/giaHouCicD4RCj22NHorNuk3bd8Jy5fvqL0xMDj0U0YkhZd0amTAQRrg/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/giaHouCicD4RCj22NHorNuk3bd8Jy5fvqL0xMDj0U0YkhZd0amTAQRrg/600?n=1","create_time":1472608754,"creator_info":{"avatar":"","is_dj":0,"nick":"Yuyia.","taoge_avatar":"","taoge_nick":"","uin":236257557,"vip_type":2},"creator_uin":236257557,"desc":"","dirid":0,"fav_num":0,"modify_time":1493101462,"pic_mid":"004PQwmT2YRQhq","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[107815599,107815598,108252944,2668472,108052987,108052986,108052981,108052978,108053253,108168206,108067729,108108482,108108478,108168204,108252952,108252943,108252946,108252947],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[224,117],"tag_names":[],"tid":2928792476,"title":"小小派对，跟随斯卡旋律摇摆！","tjreport":""},{"access_num":18334,"album_pic_mid":"004aif7C0qPIAo","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1558421229,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/YAJJShFMHm3thIEcPcOnanibmTje6ccarEDQQBGTaE5h4qMkW8iaEib9Q/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/YAJJShFMHm3thIEcPcOnanibmTje6ccarEDQQBGTaE5h4qMkW8iaEib9Q/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/YAJJShFMHm3thIEcPcOnanibmTje6ccarEDQQBGTaE5h4qMkW8iaEib9Q/600?n=1","create_time":1558406506,"creator_info":{"avatar":"","is_dj":0,"nick":"韩达达","taoge_avatar":"","taoge_nick":"","uin":3163854005,"vip_type":2},"creator_uin":3163854005,"desc":"","dirid":0,"fav_num":0,"modify_time":1656350385,"pic_mid":"","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[1745886,5077672,105974825,102876979,913973,102451453,635202,102201972,1168473,102205595,102696034,7045183,783357,416736,102796845,4813487,693650,106014808,882178,102052943,101095810,4809171,201440081,1558425,6258531,856291,105754966,102695225,8161765],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[168,6,117],"tag_names":[],"tid":6998066344,"title":"吃货的快乐:来一份韩式大餐","tjreport":""},{"access_num":66170,"album_pic_mid":"001jqasY0H0dSC","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1530074936,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/fx76QicKT5fa7gfzOBqCkDIIwDzewZicJVw8MU8NBlicppoObIFFDsZwA/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/fx76QicKT5fa7gfzOBqCkDIIwDzewZicJVw8MU8NBlicppoObIFFDsZwA/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/fx76QicKT5fa7gfzOBqCkDIIwDzewZicJVw8MU8NBlicppoObIFFDsZwA/600?n=1","create_time":1529993599,"creator_info":{"avatar":"","is_dj":0,"nick":"蘑菇爸爸和小乖妈妈","taoge_avatar":"","taoge_nick":"","uin":1302998248,"vip_type":7},"creator_uin":1302998248,"desc":"","dirid":0,"fav_num":0,"modify_time":1552268646,"pic_mid":"001qft6L3VciXG","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[214051944,8127939,614622,208627437,2794993,106230612,105867995,105696014,204676552,201738851,208627422,108102911,614621,107424277,109623051,107738775,4756354],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[131,117,165],"tag_names":[],"tid":4180811611,"title":"听说达芬奇画鸡蛋时听的就是这些歌","tjreport":""},{"access_num":71329,"album_pic_mid":"003QfOGY24GXBp","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1478089473,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/giaHouCicD4RCj22NHorNuk3bd8Jy5fvqLougpKpw62YrEpT4eS83h8A/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/giaHouCicD4RCj22NHorNuk3bd8Jy5fvqLougpKpw62YrEpT4eS83h8A/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/giaHouCicD4RCj22NHorNuk3bd8Jy5fvqLougpKpw62YrEpT4eS83h8A/600?n=1","create_time":1472805981,"creator_info":{"avatar":"","is_dj":0,"nick":"Yuyia.","taoge_avatar":"","taoge_nick":"","uin":236257557,"vip_type":2},"creator_uin":236257557,"desc":"","dirid":0,"fav_num":0,"modify_time":1493101462,"pic_mid":"004HrTxr04mCI0","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[107091236,107480753,601276,108274381,102887207,2668472,1946702,101703523,101703529,83836,83837,108053001,108053256,108066309,108168204,108168206,601275,108274378,106667230,108131962],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[224,117],"tag_names":[],"tid":2929069995,"title":"快乐的节奏，跃动的音符","tjreport":""},{"access_num":114552,"album_pic_mid":"","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1486689789,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/g7hl9DicAYq6xNsbMELzjBx9YJkMicndFp94ISfH8gkoiaBJUv8O1sAZA/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/g7hl9DicAYq6xNsbMELzjBx9YJkMicndFp94ISfH8gkoiaBJUv8O1sAZA/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/g7hl9DicAYq6xNsbMELzjBx9YJkMicndFp94ISfH8gkoiaBJUv8O1sAZA/600?n=1","create_time":1486522411,"creator_info":{"avatar":"","is_dj":0,"nick":"夏逝Depart ．","taoge_avatar":"","taoge_nick":"","uin":3092816710,"vip_type":2},"creator_uin":3092816710,"desc":"","dirid":0,"fav_num":0,"modify_time":1646241243,"pic_mid":"004UEYTs1ZUO8O","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[4830582,105840768,202037,3576583,1840021,2551059,389239,2551053,2551054,2551052,7398201,1548449,8159812,1449695,389351,105304563,8159826,106679174],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[117],"tag_names":[],"tid":855147084,"title":"欢快纯乐 · 倘佯一份寻觅的喜悦","tjreport":""},{"access_num":54095,"album_pic_mid":"003DERPm30e2kH","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1536634097,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/ia1BhHY0pBXp25tpaaiaCzRSfPhTzEh4GgkK3nXwVJdxpczuK6651zOw/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/ia1BhHY0pBXp25tpaaiaCzRSfPhTzEh4GgkK3nXwVJdxpczuK6651zOw/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/ia1BhHY0pBXp25tpaaiaCzRSfPhTzEh4GgkK3nXwVJdxpczuK6651zOw/600?n=1","create_time":1535008688,"creator_info":{"avatar":"","is_dj":0,"nick":"。。。","taoge_avatar":"","taoge_nick":"","uin":3043667928,"vip_type":2},"creator_uin":3043667928,"desc":"","dirid":0,"fav_num":0,"modify_time":1568741694,"pic_mid":"002Llu7313R1Ow","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[100874244,2255865,2159088,2534477,1977834,758305,4852501,100789376,200820544,205358506,213077958,5790364,3887373,2204177,1735100,5852171,104252125,1977830,202450808,108014199,7524003],"song_types":[3,13,3,3,3,3,3,13,13,3,13,3,13,13,13,13,13,13,13,13,13],"tag_ids":[222,59,117],"tag_names":[],"tid":4311066357,"title":"皇室婚礼背景音乐","tjreport":""},{"access_num":645659,"album_pic_mid":"","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1477483426,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/SOftSED2VibgaZItvv1RsiauXGuSXgicROGUsPrQxQsqdibvlJJaNibYj2g/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/SOftSED2VibgaZItvv1RsiauXGuSXgicROGUsPrQxQsqdibvlJJaNibYj2g/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/SOftSED2VibgaZItvv1RsiauXGuSXgicROGUsPrQxQsqdibvlJJaNibYj2g/600?n=1","create_time":1474954458,"creator_info":{"avatar":"","is_dj":0,"nick":"一枚橙","taoge_avatar":"","taoge_nick":"","uin":3050901369,"vip_type":2},"creator_uin":3050901369,"desc":"","dirid":0,"fav_num":0,"modify_time":1545931449,"pic_mid":"004LWkjL4ExtHo","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[5073593,102053790,5023147,102669582,108219003,102681429,946925,7406973,1119125,439993,1009783,1354781,1268604,2033470,630633,816186,1009782,1009780],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[117,167],"tag_names":[],"tid":3534056164,"title":"音乐添色彩，欢快欧美佳作","tjreport":""},{"access_num":65538,"album_pic_mid":"003xF4EA0R6aPb","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1493891173,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/8JW2hoQldW7fIhI6rtN1rW6R8icOlBYfmvQaETWDrY0ibwF2hsoar3UQ/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/8JW2hoQldW7fIhI6rtN1rW6R8icOlBYfmvQaETWDrY0ibwF2hsoar3UQ/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/8JW2hoQldW7fIhI6rtN1rW6R8icOlBYfmvQaETWDrY0ibwF2hsoar3UQ/600?n=1","create_time":1493777204,"creator_info":{"avatar":"","is_dj":0,"nick":"Fish.","taoge_avatar":"","taoge_nick":"","uin":379827740,"vip_type":0},"creator_uin":379827740,"desc":"","dirid":0,"fav_num":0,"modify_time":1495198665,"pic_mid":"000dSoye1O9i22","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[103120662,107486677,1683776,1075378,2255865,5544993,5124684,7582453,7061301,5615475,739440,1708631,106308002,7181696,7582454],"song_types":[3,3,3,3,3,3,3,3,3,3,3,13,3,3,3],"tag_ids":[27,117,116],"tag_names":[],"tid":866251341,"title":"忽尔今夏 - 漫天飞舞的清凉音符","tjreport":""},{"access_num":34196,"album_pic_mid":"002MzH0E0m0yGP","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1496903684,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/HzL9814HkwwY8x0TWnmJe9UiamtwiadMKGN8GTrZvUDicqdkuYbYdDVOg/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/HzL9814HkwwY8x0TWnmJe9UiamtwiadMKGN8GTrZvUDicqdkuYbYdDVOg/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/HzL9814HkwwY8x0TWnmJe9UiamtwiadMKGN8GTrZvUDicqdkuYbYdDVOg/600?n=1","create_time":1496801668,"creator_info":{"avatar":"","is_dj":0,"nick":"Ramirez","taoge_avatar":"","taoge_nick":"","uin":287322531,"vip_type":2},"creator_uin":287322531,"desc":"","dirid":0,"fav_num":0,"modify_time":1496900438,"pic_mid":"003qnkoq2Q5XMe","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[4835561,104144942,101786105,101786104,100993541,100993548,100993558,4858910,109750691,109750690,103015384,103015381,101342842,104211250,104211252,104144945,100993438,100993466,100993491,100993452],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[27,117],"tag_names":[],"tid":1165717985,"title":"民族的才是世界的\u2014古典舞曲","tjreport":""},{"access_num":182244,"album_pic_mid":"","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1480678982,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/pBNeTQrUba1icAwnEJZedia2RZjvialCjnXWcd7HaZAicP5T2KzbWdhwmQ/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/pBNeTQrUba1icAwnEJZedia2RZjvialCjnXWcd7HaZAicP5T2KzbWdhwmQ/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/pBNeTQrUba1icAwnEJZedia2RZjvialCjnXWcd7HaZAicP5T2KzbWdhwmQ/600?n=1","create_time":1477452956,"creator_info":{"avatar":"","is_dj":0,"nick":"在细雨中呼喊青春っ","taoge_avatar":"","taoge_nick":"","uin":3464982830,"vip_type":2},"creator_uin":3464982830,"desc":"","dirid":0,"fav_num":0,"modify_time":1554139915,"pic_mid":"001J32Xu2WTrEm","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[851726,33816,78852,102896494,5016801,103258109,1592928,479567,2443803,630576,519200,1212080,7411506,1643345,102685286,436100,710895,934732,1313191],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[117],"tag_names":[],"tid":840796251,"title":"欢快英文歌，小心High过头哦~","tjreport":""},{"access_num":74186,"album_pic_mid":"001yWxre27dBvt","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1480337323,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/0Fvp5LwdLLDtCTPt1WSVeRTmQwEnAWE9kg5xoiaKOCjmmNjl1b4Wbng/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/0Fvp5LwdLLDtCTPt1WSVeRTmQwEnAWE9kg5xoiaKOCjmmNjl1b4Wbng/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/0Fvp5LwdLLDtCTPt1WSVeRTmQwEnAWE9kg5xoiaKOCjmmNjl1b4Wbng/600?n=1","create_time":1473831823,"creator_info":{"avatar":"","is_dj":0,"nick":"像疯一样自由","taoge_avatar":"","taoge_nick":"","uin":2753358585,"vip_type":2},"creator_uin":2753358585,"desc":"","dirid":0,"fav_num":0,"modify_time":1607706784,"pic_mid":"004MhwyD0MvX9P","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[1414085,416736,7233208,2447008,1397499,102342009,2447007,2446999,9107038,1276036,1276035,1276038,217403799,105301801,105304286,105542829,1507939,1692587,4784525],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[81,117,168],"tag_names":[],"tid":2334052745,"title":"一路欢歌，走遍世界","tjreport":""},{"access_num":44243,"album_pic_mid":"","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1478089327,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/cIbAphQk35JMG8FZBZUxQyvcKCYcMDwXFN2ia9f0T3lZrdOmg1W9P3Q/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/cIbAphQk35JMG8FZBZUxQyvcKCYcMDwXFN2ia9f0T3lZrdOmg1W9P3Q/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/cIbAphQk35JMG8FZBZUxQyvcKCYcMDwXFN2ia9f0T3lZrdOmg1W9P3Q/600?n=1","create_time":1477377315,"creator_info":{"avatar":"","is_dj":0,"nick":"音乐学人","taoge_avatar":"","taoge_nick":"","uin":3463221285,"vip_type":2},"creator_uin":3463221285,"desc":"","dirid":0,"fav_num":0,"modify_time":1490864097,"pic_mid":"003mBJv94d7w86","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[106493758,106493756,105817284,105817277,107704988,105067595,5195405,1450837,5046719,5046718,669317,5268929,5293111,5293117,105763224,7692638,7692637,102918327],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[170,6,117],"tag_names":[],"tid":2338844911,"title":"用一首俄语清新流行舞曲，结束一天的忙碌","tjreport":""},{"access_num":247914,"album_pic_mid":"001HwwNH1inlz9","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1494513195,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/FicCThRvK2IyauqoncdicFQ44m23mCuXWaZhxkasMfG6jFmCu2XOmlmQ/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/FicCThRvK2IyauqoncdicFQ44m23mCuXWaZhxkasMfG6jFmCu2XOmlmQ/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/FicCThRvK2IyauqoncdicFQ44m23mCuXWaZhxkasMfG6jFmCu2XOmlmQ/600?n=1","create_time":1494386245,"creator_info":{"avatar":"","is_dj":0,"nick":"深空失忆","taoge_avatar":"","taoge_nick":"","uin":3335306653,"vip_type":2},"creator_uin":3335306653,"desc":"","dirid":0,"fav_num":0,"modify_time":1651338973,"pic_mid":"002JdvL63TO0ip","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[635751,2975670,1330509,614517,648227,1257199,628370,233558,473135,645967,144244,95263,7119668,632602,144227,106417262,106451316,2927393],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[165,117],"tag_names":[],"tid":1762335168,"title":"零零年代，谁的节奏最摇摆","tjreport":""},{"access_num":169324,"album_pic_mid":"","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1493345872,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/IknB7UUG0ME0zalRpPKYjEibwbapdgmNibTbUGyZ4PqAcibfkNNZ9Z7jg/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/IknB7UUG0ME0zalRpPKYjEibwbapdgmNibTbUGyZ4PqAcibfkNNZ9Z7jg/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/IknB7UUG0ME0zalRpPKYjEibwbapdgmNibTbUGyZ4PqAcibfkNNZ9Z7jg/600?n=1","create_time":1493187119,"creator_info":{"avatar":"","is_dj":0,"nick":"漂洋过海来看你 ?","taoge_avatar":"","taoge_nick":"","uin":3545474218,"vip_type":2},"creator_uin":3545474218,"desc":"","dirid":0,"fav_num":0,"modify_time":1568741560,"pic_mid":"00252GFZ0IJicr","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[398894,235108,93348,7182,5074975,107449,1254745,2975670,9086096,5130055,103147382,1026967,100380,4884725,652648,102385691,2852171,9058640],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[117,165],"tag_names":[],"tid":3259666400,"title":"画一个靓妆出门，心情美美哒","tjreport":""},{"access_num":355418,"album_pic_mid":"","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1478089508,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/uhmBELdVgMXkrmA8Q4kibwxbLoB3SZYBZXiaIAa4zbe2ATiaqW6ZfhhTw/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/uhmBELdVgMXkrmA8Q4kibwxbLoB3SZYBZXiaIAa4zbe2ATiaqW6ZfhhTw/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/uhmBELdVgMXkrmA8Q4kibwxbLoB3SZYBZXiaIAa4zbe2ATiaqW6ZfhhTw/600?n=1","create_time":1477376389,"creator_info":{"avatar":"","is_dj":0,"nick":"简爱╮Simple","taoge_avatar":"","taoge_nick":"","uin":3463680457,"vip_type":2},"creator_uin":3463680457,"desc":"","dirid":0,"fav_num":0,"modify_time":1574788826,"pic_mid":"002Si7a41VqZ4O","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[720543,7212408,393075,102578,455619,105941648,133549,475164,874518,724576,7242281,105533726,398894,393069,725329,724577,677743,4907244,169424,5075075],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[117],"tag_names":[],"tid":2935233966,"title":"只属于软妹子的欢声笑语","tjreport":""},{"access_num":72658,"album_pic_mid":"0039kk4b40V8QS","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1530623769,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/b03yv5AXb5lrgIvpov59FtyNmJR96BuVPUodP6ibPJiaQoaflHicreoicg/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/b03yv5AXb5lrgIvpov59FtyNmJR96BuVPUodP6ibPJiaQoaflHicreoicg/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/b03yv5AXb5lrgIvpov59FtyNmJR96BuVPUodP6ibPJiaQoaflHicreoicg/600?n=1","create_time":1530620574,"creator_info":{"avatar":"","is_dj":0,"nick":"小叮当","taoge_avatar":"","taoge_nick":"","uin":2041254345,"vip_type":2},"creator_uin":2041254345,"desc":"","dirid":0,"fav_num":0,"modify_time":1568741809,"pic_mid":"003SaTyK31Jfkl","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[213940636,213102090,214154609,214143001,214033543,205153250,214142403,213058416,213446361,213435242,214185752,203451043,204514444,213760455,205359736,202550204,213764343,211864789,213918810,214189294,213387483,213443234,205014428,200835885],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[205,25,117],"tag_names":[],"tid":4192676792,"title":"西语 | 慢速动感Latin ","tjreport":""},{"access_num":322028,"album_pic_mid":"","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1478089332,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/OmT4ibflJ4UHdpVjIJM6iaMMPwpVsaTL1LwfrIWom48kIvk2bqgibrnwQ/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/OmT4ibflJ4UHdpVjIJM6iaMMPwpVsaTL1LwfrIWom48kIvk2bqgibrnwQ/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/OmT4ibflJ4UHdpVjIJM6iaMMPwpVsaTL1LwfrIWom48kIvk2bqgibrnwQ/600?n=1","create_time":1477456708,"creator_info":{"avatar":"","is_dj":0,"nick":"情绪疯子.","taoge_avatar":"","taoge_nick":"","uin":3473267585,"vip_type":2},"creator_uin":3473267585,"desc":"","dirid":0,"fav_num":0,"modify_time":1612545570,"pic_mid":"0011wxiM32cHrC","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[109581297,1163559,105941648,398894,168226,107192072,407884,235110,101798261,107899426,406042,2856368,168094,107906638,102221002,200655055,257611,185878,1098066,109750],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[117],"tag_names":[],"tid":2338925418,"title":"阳光好心情，音乐送给你","tjreport":""},{"access_num":67596,"album_pic_mid":"","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1531195865,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/MibhME4PmHVsXcNFs5UACwPVntbqFU4xArtOgrnuYc0UUMTa1T4y1uQ/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/MibhME4PmHVsXcNFs5UACwPVntbqFU4xArtOgrnuYc0UUMTa1T4y1uQ/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/MibhME4PmHVsXcNFs5UACwPVntbqFU4xArtOgrnuYc0UUMTa1T4y1uQ/600?n=1","create_time":1527216722,"creator_info":{"avatar":"","is_dj":0,"nick":"土酷男孩","taoge_avatar":"","taoge_nick":"","uin":512483521,"vip_type":1},"creator_uin":512483521,"desc":"","dirid":0,"fav_num":0,"modify_time":1532310907,"pic_mid":"0020LFRS22jock","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[213480196,200969438,107560341,1862387,212625452,4834652,181689,1191956,14989,227887,103976326,202985444,172321,109128657,630314,203093789,437530,1522384,640083,129626,1730291,101140486,106348117,200672503,3161728,5176793,635756,201616581,200589614,4947361,107437884,681735,212839302],"song_types":[13,13,13,13,13,13,13,13,3,13,13,13,13,13,13,13,13,13,13,13,13,13,13,3,3,13,13,13,13,3,13,13,3],"tag_ids":[165,6,117],"tag_names":[],"tid":4114640001,"title":"三字食 | 宅家点外卖参考List ","tjreport":""},{"access_num":46778,"album_pic_mid":"","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1478089146,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/VX7CYGcRTCiaZhm8oOxBfiaZ25aeC3M1npicYjnaV23oE6t66sJ4c1Omw/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/VX7CYGcRTCiaZhm8oOxBfiaZ25aeC3M1npicYjnaV23oE6t66sJ4c1Omw/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/VX7CYGcRTCiaZhm8oOxBfiaZ25aeC3M1npicYjnaV23oE6t66sJ4c1Omw/600?n=1","create_time":1477272154,"creator_info":{"avatar":"","is_dj":0,"nick":"放肆的年华","taoge_avatar":"","taoge_nick":"","uin":3051920143,"vip_type":2},"creator_uin":3051920143,"desc":"","dirid":0,"fav_num":0,"modify_time":1545931498,"pic_mid":"000XGLa91fBvQR","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[887779,1315601,5732864,5732862,2535096,2535097,2286526,105714160,105714161,389696,475931,688719,478485,814843,475934,1413559,688718,478486],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[170,6,117],"tag_names":[],"tid":1735986860,"title":"迎着朝阳前进！活力感爆棚的意文歌曲","tjreport":""},{"access_num":91459,"album_pic_mid":"001ZaCQY2OxVMg","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1514861880,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/Kw0js0dh71gAUlYpdebialxOiaGnkgGqfeODkOQaoibptYZGJ4o39DeqA/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/Kw0js0dh71gAUlYpdebialxOiaGnkgGqfeODkOQaoibptYZGJ4o39DeqA/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/Kw0js0dh71gAUlYpdebialxOiaGnkgGqfeODkOQaoibptYZGJ4o39DeqA/600?n=1","create_time":1514790525,"creator_info":{"avatar":"","is_dj":0,"nick":"梁伦超","taoge_avatar":"","taoge_nick":"","uin":1738160012,"vip_type":0},"creator_uin":1738160012,"desc":"","dirid":0,"fav_num":0,"modify_time":1568742108,"pic_mid":"004GDhbs4R7zb9","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[2452312,1005894,7256891,211724020,204560946,1631242,106697364,201942644,98098,202210552,203511198,200906186,202210558,200922245,105789913,203910278,212085322,227843466,107601447,203510846,203845504],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[167,117],"tag_names":[],"tid":3627088651,"title":"最新出炉！2018纽约时代广场跨年演唱会","tjreport":""},{"access_num":83612,"album_pic_mid":"002g0JpA4aQ6bZ","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1472722347,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/0Fvp5LwdLLDtCTPt1WSVeRlXT8zVXNt3gApf44YXZCFibObtjYvjeKQ/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/0Fvp5LwdLLDtCTPt1WSVeRlXT8zVXNt3gApf44YXZCFibObtjYvjeKQ/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/0Fvp5LwdLLDtCTPt1WSVeRlXT8zVXNt3gApf44YXZCFibObtjYvjeKQ/600?n=1","create_time":1472722347,"creator_info":{"avatar":"","is_dj":0,"nick":"像疯一样自由","taoge_avatar":"","taoge_nick":"","uin":2753358585,"vip_type":2},"creator_uin":2753358585,"desc":"","dirid":0,"fav_num":0,"modify_time":1537530368,"pic_mid":"001Vbdqh084qNb","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[1588613],"song_types":[13],"tag_ids":[6,117,81],"tag_names":[],"tid":2332616633,"title":"因为有梦，所以我们去旅行","tjreport":""},{"access_num":117956,"album_pic_mid":"","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1478089071,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/SDxXr3xW1IibTLlQibxibEgJ2mSC6qL9VyFm9C2WicAzIz7urccGbZzltg/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/SDxXr3xW1IibTLlQibxibEgJ2mSC6qL9VyFm9C2WicAzIz7urccGbZzltg/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/SDxXr3xW1IibTLlQibxibEgJ2mSC6qL9VyFm9C2WicAzIz7urccGbZzltg/600?n=1","create_time":1477385166,"creator_info":{"avatar":"","is_dj":0,"nick":"乐此不疲·","taoge_avatar":"","taoge_nick":"","uin":3476572262,"vip_type":2},"creator_uin":3476572262,"desc":"","dirid":0,"fav_num":0,"modify_time":1558447357,"pic_mid":"002mWb2H1Gk1GA","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[1220380,101098837,5642208,7235735,329184,1501506,434309,433893,1202579,413144,328935,300071,752517,1352262,726298,487302,4887244,213263411],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[222,6,117],"tag_names":[],"tid":1438603195,"title":"我们结婚吧，就现在","tjreport":""},{"access_num":503125,"album_pic_mid":"000bFkCl0aG5cM","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1489632444,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/dibiaTFIl5E8cUF3XUibZsicVYicGAnm1hYbecDkufxJbSOJqP0ybSeu1DQ/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/dibiaTFIl5E8cUF3XUibZsicVYicGAnm1hYbecDkufxJbSOJqP0ybSeu1DQ/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/dibiaTFIl5E8cUF3XUibZsicVYicGAnm1hYbecDkufxJbSOJqP0ybSeu1DQ/600?n=1","create_time":1489026329,"creator_info":{"avatar":"","is_dj":0,"nick":"ぺ书写時光","taoge_avatar":"","taoge_nick":"","uin":3158470376,"vip_type":2},"creator_uin":3158470376,"desc":"","dirid":0,"fav_num":0,"modify_time":1624468507,"pic_mid":"003sCPOh1cI3MM","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[101805273,838372,109631468,182138,1347832,451197,5144928,102631611,102340969,1631252,200314695,5163440,5110,166896,410314,8447867,109922981,257616,109745955,106253204],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[117],"tag_names":[],"tid":2655856612,"title":"太阳和爱 我快乐的源泉","tjreport":""},{"access_num":301620,"album_pic_mid":"","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1478089333,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/OmT4ibflJ4UHdpVjIJM6iaMMPwpVsaTL1LZCMDC5lsTdMWpZslYj2Xjw/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/OmT4ibflJ4UHdpVjIJM6iaMMPwpVsaTL1LZCMDC5lsTdMWpZslYj2Xjw/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/OmT4ibflJ4UHdpVjIJM6iaMMPwpVsaTL1LZCMDC5lsTdMWpZslYj2Xjw/600?n=1","create_time":1477456710,"creator_info":{"avatar":"","is_dj":0,"nick":"情绪疯子.","taoge_avatar":"","taoge_nick":"","uin":3473267585,"vip_type":2},"creator_uin":3473267585,"desc":"","dirid":0,"fav_num":0,"modify_time":1608052795,"pic_mid":"000FQMRf281G0i","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[102367248,691753,104778460,95474,13551,4829723,398894,105593870,103747,106083,235108,1358111,105462397,407048,420621,1026967,150560,107785311,724906],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[117],"tag_names":[],"tid":2338925422,"title":"融入你生活的每一天，欢快国语音乐","tjreport":""},{"access_num":165763,"album_pic_mid":"","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1478089629,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/c1vbhreKbmwibABXvGeOJE25VRn36sYS6icy6xrTsicUuTCDyfXnibJ1kw/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/c1vbhreKbmwibABXvGeOJE25VRn36sYS6icy6xrTsicUuTCDyfXnibJ1kw/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/c1vbhreKbmwibABXvGeOJE25VRn36sYS6icy6xrTsicUuTCDyfXnibJ1kw/600?n=1","create_time":1476951087,"creator_info":{"avatar":"","is_dj":0,"nick":"/ 睡衣男孩 /","taoge_avatar":"","taoge_nick":"","uin":2146615988,"vip_type":2},"creator_uin":2146615988,"desc":"","dirid":0,"fav_num":0,"modify_time":1592327588,"pic_mid":"0035nwyc3XivR2","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[100808342,1322862,9149108,4762845,6541856,7559820,9263690,104734472,1969328,604411,2196469,2668437,1976049,4685188,8305746,8301490,101910278,101306943],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[170,117],"tag_names":[],"tid":3234772420,"title":"德语儿歌 / 打开耳朵聆听童年","tjreport":""},{"access_num":583972,"album_pic_mid":"000x8jrY23qjBH","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1488506564,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/zXciaBNvbG6hvUGQndZ1EGCCI6uIQKBxZpVgT9RuSR6F7lLKKevkQzw/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/zXciaBNvbG6hvUGQndZ1EGCCI6uIQKBxZpVgT9RuSR6F7lLKKevkQzw/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/zXciaBNvbG6hvUGQndZ1EGCCI6uIQKBxZpVgT9RuSR6F7lLKKevkQzw/600?n=1","create_time":1488253535,"creator_info":{"avatar":"","is_dj":0,"nick":"leave、","taoge_avatar":"","taoge_nick":"","uin":3316320864,"vip_type":2},"creator_uin":3316320864,"desc":"","dirid":0,"fav_num":0,"modify_time":1642612559,"pic_mid":"001veuoQ1xegSY","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[447252,5463772,102204538,100380,1799996,100387,718483,725329,182135,130240,102337595,469215,105379634,7256750,8129256,4830766,280709494,106450965],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[117],"tag_names":[],"tid":2050507767,"title":"让你的人生充满笑脸","tjreport":""},{"access_num":202334,"album_pic_mid":"","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1478089761,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/uOwUQDG1AfFg3VAHKSWFt698icClI3ia6b4Yt8pfKfwHRdu4YcaVcaiaw/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/uOwUQDG1AfFg3VAHKSWFt698icClI3ia6b4Yt8pfKfwHRdu4YcaVcaiaw/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/uOwUQDG1AfFg3VAHKSWFt698icClI3ia6b4Yt8pfKfwHRdu4YcaVcaiaw/600?n=1","create_time":1477365343,"creator_info":{"avatar":"","is_dj":0,"nick":"毫无保留。","taoge_avatar":"","taoge_nick":"","uin":2784608409,"vip_type":2},"creator_uin":2784608409,"desc":"","dirid":0,"fav_num":0,"modify_time":1637255542,"pic_mid":"002rOPzZ0W3xum","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[546740,1127278,104627,736927,267015,4907850,1127912,107709961,7429909,408722,4829838,266671,107725909,1189172,261980,105571981,4907131,105739339,7017,316870225,622576,391157],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[117],"tag_names":[],"tid":3537364153,"title":"港式快乐滋味，令你笑得甜美","tjreport":""},{"access_num":638013,"album_pic_mid":"004GsFCO3tD2gS","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1490151140,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/YXUTo5JKKKd3qFXyvSJqz4DrY0sCZOokdFd1KZ0ymquEenFFvDe2Bw/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/YXUTo5JKKKd3qFXyvSJqz4DrY0sCZOokdFd1KZ0ymquEenFFvDe2Bw/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/YXUTo5JKKKd3qFXyvSJqz4DrY0sCZOokdFd1KZ0ymquEenFFvDe2Bw/600?n=1","create_time":1489995711,"creator_info":{"avatar":"","is_dj":0,"nick":"唱歌的人动了情","taoge_avatar":"","taoge_nick":"","uin":3511486103,"vip_type":2},"creator_uin":3511486103,"desc":"","dirid":0,"fav_num":0,"modify_time":1620407988,"pic_mid":"001bP2gG1mvPBd","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[2441399,444627,104457204,5058283,102360142,1250577,9461586,462182,105526950,4966543,393674,89167,104324262,104324261,200964060,5238165,393671,201185857],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[165,117],"tag_names":[],"tid":1755667228,"title":"心情好，就唱一首快乐的歌","tjreport":""},{"access_num":191750,"album_pic_mid":"","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1480337373,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/QviaUUA4YqIMo3N6TseIlbuviaI68TLhNRYbk0fQRroHTlrem64zlLVg/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/QviaUUA4YqIMo3N6TseIlbuviaI68TLhNRYbk0fQRroHTlrem64zlLVg/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/QviaUUA4YqIMo3N6TseIlbuviaI68TLhNRYbk0fQRroHTlrem64zlLVg/600?n=1","create_time":1477969469,"creator_info":{"avatar":"","is_dj":0,"nick":"晴天love","taoge_avatar":"","taoge_nick":"","uin":2955143385,"vip_type":2},"creator_uin":2955143385,"desc":"","dirid":0,"fav_num":0,"modify_time":1588094224,"pic_mid":"0015O20P01hSIM","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[103376854,398457,102442189,5054098,101101369,4723301,4749489,966595,5599203,671212,686408,2927448,1112596,8161899,5020869,1215547,5058050,5029148],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[117,167],"tag_names":[],"tid":2339557736,"title":"美好时光的愉悦小调","tjreport":""},{"access_num":581170,"album_pic_mid":"000qborW3wwC4F","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1484646535,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/CWicWfBTb9hhZU7ia18JvSxB4DTPUj66XEJBbIF03yjc7M3MK6pPicUsw/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/CWicWfBTb9hhZU7ia18JvSxB4DTPUj66XEJBbIF03yjc7M3MK6pPicUsw/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/CWicWfBTb9hhZU7ia18JvSxB4DTPUj66XEJBbIF03yjc7M3MK6pPicUsw/600?n=1","create_time":1484270025,"creator_info":{"avatar":"","is_dj":0,"nick":"屋檐下听雨°","taoge_avatar":"","taoge_nick":"","uin":3547425501,"vip_type":2},"creator_uin":3547425501,"desc":"","dirid":0,"fav_num":0,"modify_time":1638811029,"pic_mid":"002eCesH0qPkd0","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[409172,2636338,3586487,2475183,102204538,671503,410314,3586486,108921463,4907911,1330513,102065755,447258,406042,235109,3586109,106671516,5093977],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[165,117],"tag_names":[],"tid":1145607093,"title":"『快乐前奏』论几秒喜欢上一首歌","tjreport":""},{"access_num":645412,"album_pic_mid":"000ci6NR08YKaO","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1476954575,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/wwQnRI807QCWmsVKT7f9KhYuQdBsZzqyicWfUUPkXdtuwEI3dlxtoxQ/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/wwQnRI807QCWmsVKT7f9KhYuQdBsZzqyicWfUUPkXdtuwEI3dlxtoxQ/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/wwQnRI807QCWmsVKT7f9KhYuQdBsZzqyicWfUUPkXdtuwEI3dlxtoxQ/600?n=1","create_time":1470627428,"creator_info":{"avatar":"","is_dj":0,"nick":"СердцеБьется","taoge_avatar":"","taoge_nick":"","uin":2774963009,"vip_type":2},"creator_uin":2774963009,"desc":"","dirid":0,"fav_num":0,"modify_time":1645636320,"pic_mid":"002rK1551Ksc82","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[108237662,107899120,107738095,105533726,107770314,107313798,105871902,5063372,407046,718483,9081831,5063374,102210521,7256750,410314,107802967,107479718,7007084,7117101,102051568,5379457,7042277,410533,623699],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[165,117,85],"tag_names":[],"tid":3527809241,"title":"好心情从上班的路上开始","tjreport":""},{"access_num":194294,"album_pic_mid":"0012STFO3j8NrK","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1491528989,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/o83KyXmT8ggX7JZsMd5zv4AD0lLPnE0Yg3A9CDqrYBfBzshL8O7zFg/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/o83KyXmT8ggX7JZsMd5zv4AD0lLPnE0Yg3A9CDqrYBfBzshL8O7zFg/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/o83KyXmT8ggX7JZsMd5zv4AD0lLPnE0Yg3A9CDqrYBfBzshL8O7zFg/600?n=1","create_time":1491380046,"creator_info":{"avatar":"","is_dj":0,"nick":"Faith(信念)","taoge_avatar":"","taoge_nick":"","uin":3204940873,"vip_type":2},"creator_uin":3204940873,"desc":"","dirid":0,"fav_num":0,"modify_time":1642871705,"pic_mid":"0035beAX2pmEOG","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[106396897,435537,97628,107346883,718483,804564,1631252,14989,102053839,235109,101805136,95286,4822794,108403478,126718,126721,280709489,5645193],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[117,165],"tag_names":[],"tid":1757798227,"title":"吃货的世界 就是那么简单快乐","tjreport":""},{"access_num":77628,"album_pic_mid":"004RF2Qs1SH67O","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1534752542,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/ia1BhHY0pBXp25tpaaiaCzRcIibeYFvvz14qQmJzHvcLMAd6hJfCMG71A/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/ia1BhHY0pBXp25tpaaiaCzRcIibeYFvvz14qQmJzHvcLMAd6hJfCMG71A/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/ia1BhHY0pBXp25tpaaiaCzRcIibeYFvvz14qQmJzHvcLMAd6hJfCMG71A/600?n=1","create_time":1534752310,"creator_info":{"avatar":"","is_dj":0,"nick":"。。。","taoge_avatar":"","taoge_nick":"","uin":3043667928,"vip_type":2},"creator_uin":3043667928,"desc":"","dirid":0,"fav_num":0,"modify_time":1595957189,"pic_mid":"002FOmQ83kqYRi","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[124707,1345784,145324,5157905,10447,755369,108785686,764198,9058628,5108292,101806324,475792,9457620,799755,103375787,125314,411321],"song_types":[3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3],"tag_ids":[76,59,117],"tag_names":[],"tid":4277697463,"title":"《文周》文艺青年婚礼配乐指南 ","tjreport":""},{"access_num":79804,"album_pic_mid":"003HaCSi4Z4D9X","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1530074928,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/fx76QicKT5fa7gfzOBqCkDIIwDzewZicJVjPDRmIAh8iaBMtMxqEibtlLA/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/fx76QicKT5fa7gfzOBqCkDIIwDzewZicJVjPDRmIAh8iaBMtMxqEibtlLA/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/fx76QicKT5fa7gfzOBqCkDIIwDzewZicJVjPDRmIAh8iaBMtMxqEibtlLA/600?n=1","create_time":1529993988,"creator_info":{"avatar":"","is_dj":0,"nick":"蘑菇爸爸和小乖妈妈","taoge_avatar":"","taoge_nick":"","uin":1302998248,"vip_type":7},"creator_uin":1302998248,"desc":"","dirid":0,"fav_num":0,"modify_time":1541409103,"pic_mid":"003vPScf1knDwy","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[107700131,109333304,7206269,105770459,206965265,7206274,109131617,108079737,7206267,105720840,109394636,212380755,106610456,2650690,108908240,108218116,7206277],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[131,117,165],"tag_names":[],"tid":4180819271,"title":"谁能告诉宝宝\u201c苏格拉有没有底？\u201d","tjreport":""},{"access_num":139131,"album_pic_mid":"","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1478089854,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/AIeG5T519yBnibgbzJnl7dfMyO89qDh8F9fib3dzeF7Y6mmONMm8Srmw/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/AIeG5T519yBnibgbzJnl7dfMyO89qDh8F9fib3dzeF7Y6mmONMm8Srmw/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/AIeG5T519yBnibgbzJnl7dfMyO89qDh8F9fib3dzeF7Y6mmONMm8Srmw/600?n=1","create_time":1477289883,"creator_info":{"avatar":"","is_dj":0,"nick":"诗呓·","taoge_avatar":"","taoge_nick":"","uin":2889221140,"vip_type":2},"creator_uin":2889221140,"desc":"","dirid":0,"fav_num":0,"modify_time":1628097183,"pic_mid":"00109KPl4HpnaT","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[104108749,856696,466519,102666245,1717126,102209988,623925,403333,102794854,103174000,7110243,101816022,107898528,106137152,4792645,5204076,7135317,4993783],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[169,117],"tag_names":[],"tid":840621413,"title":"日系青春｜透着阳光的日系少女音","tjreport":""},{"access_num":49914,"album_pic_mid":"000DOjm53QUiec","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1530842993,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/nnRNzNd5rZaggsDwk2uSnTSznMtC9ZX0vfaDtqXZdkop60DYdToEBQ/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/nnRNzNd5rZaggsDwk2uSnTSznMtC9ZX0vfaDtqXZdkop60DYdToEBQ/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/nnRNzNd5rZaggsDwk2uSnTSznMtC9ZX0vfaDtqXZdkop60DYdToEBQ/600?n=1","create_time":1530772695,"creator_info":{"avatar":"","is_dj":0,"nick":"咔咘咔卟里基德","taoge_avatar":"","taoge_nick":"","uin":3525093560,"vip_type":0},"creator_uin":3525093560,"desc":"","dirid":0,"fav_num":0,"modify_time":1577813248,"pic_mid":"000qpFIg2coDTi","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[107903460,5017518,640746,6403626,213745707,1017568,5453480,107186889,200263584,852209,5294062,4814146,1898849,403919,8164549,5036798,1397331,109131199,107709471,108985962,108492994,1116406,212679976,213248631],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[8,169,117],"tag_names":[],"tid":4195324634,"title":"360°沦陷 · 日本男声R&B鉴赏","tjreport":""},{"access_num":304400,"album_pic_mid":"001el9Oh0et0mT","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1492504429,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/ZicI5yr3C1twqvLJGWqetAa4Yx3t6CZzzYiaKxBKibHuVgL7vZxJT3iayA/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/ZicI5yr3C1twqvLJGWqetAa4Yx3t6CZzzYiaKxBKibHuVgL7vZxJT3iayA/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/ZicI5yr3C1twqvLJGWqetAa4Yx3t6CZzzYiaKxBKibHuVgL7vZxJT3iayA/600?n=1","create_time":1492402170,"creator_info":{"avatar":"","is_dj":0,"nick":"许我半盏清茶","taoge_avatar":"","taoge_nick":"","uin":3549201616,"vip_type":2},"creator_uin":3549201616,"desc":"","dirid":0,"fav_num":0,"modify_time":1656437134,"pic_mid":"003183g61P2Fpf","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[201698289,4958008,688464,108083384,4784620,7781,1799992,102177348,7049788,100396,4826371,703734,994900,97257,97744,169421,703731,126718,4931888,410535,411323,8125549],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[165,6,117],"tag_names":[],"tid":2661076447,"title":"送你一份永不褪色的纯真","tjreport":""}]}
             */

            private int code;
            private DataBeanXX data;

            public int getCode() {
                return code;
            }

            public void setCode(int code) {
                this.code = code;
            }

            public DataBeanXX getData() {
                return data;
            }

            public void setData(DataBeanXX data) {
                this.data = data;
            }

            public static class DataBeanXX {
                /**
                 * total : 747
                 * v_playlist : [{"access_num":19652,"album_pic_mid":"","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1557669163,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/53Unr0jHFibpmKbAEqvT1Up9FHYm7Q2MotsQbicVBEVrkqClAlWwbn3g/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/53Unr0jHFibpmKbAEqvT1Up9FHYm7Q2MotsQbicVBEVrkqClAlWwbn3g/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/53Unr0jHFibpmKbAEqvT1Up9FHYm7Q2MotsQbicVBEVrkqClAlWwbn3g/600?n=1","create_time":1557476696,"creator_info":{"avatar":"","is_dj":0,"nick":"李狗蛋","taoge_avatar":"","taoge_nick":"","uin":1602037810,"vip_type":2},"creator_uin":1602037810,"desc":"","dirid":0,"fav_num":0,"modify_time":1592328568,"pic_mid":"","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[230950674,224790541,223366731,107279074,212944680,108392963,217159654,1331531,100789085,227936737,105187380,103691041,204470300,4843444,65428,7704217,494412,125224960,6453801,106550160],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[21,117],"tag_names":[],"tid":6975481262,"title":"慵懒爵士 | 清晨被窝的暖时光","tjreport":""},{"access_num":59797,"album_pic_mid":"001Sasqe2YWRlD","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1530075379,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/fx76QicKT5fa7gfzOBqCkDNyAhS2tibmEaHB0MiaxY1Lvib4tfI6WTkJhQ/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/fx76QicKT5fa7gfzOBqCkDNyAhS2tibmEaHB0MiaxY1Lvib4tfI6WTkJhQ/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/fx76QicKT5fa7gfzOBqCkDNyAhS2tibmEaHB0MiaxY1Lvib4tfI6WTkJhQ/600?n=1","create_time":1529978681,"creator_info":{"avatar":"","is_dj":0,"nick":"蘑菇爸爸和小乖妈妈","taoge_avatar":"","taoge_nick":"","uin":1302998248,"vip_type":7},"creator_uin":1302998248,"desc":"","dirid":0,"fav_num":0,"modify_time":1553074329,"pic_mid":"000SAiTQ4FOyyz","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[214121627,9471407,107586489,205522937,2500743,202738024,213222378,105112313,202815414,202736783,121751059,108032408,200314691,5379777,202155152,108013767,7055697,207642111],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[131,117],"tag_names":[],"tid":4180513374,"title":"这些歌可以提升宝宝食欲哦！","tjreport":""},{"access_num":36291,"album_pic_mid":"0000N4Rs3sJ1fm","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1561604231,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/y6QbkETndicaKm6IQ35YpHwWoOoGsq3eians5nrDibrWLLAzDFFwcIhcg/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/y6QbkETndicaKm6IQ35YpHwWoOoGsq3eians5nrDibrWLLAzDFFwcIhcg/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/y6QbkETndicaKm6IQ35YpHwWoOoGsq3eians5nrDibrWLLAzDFFwcIhcg/600?n=1","create_time":1561564113,"creator_info":{"avatar":"","is_dj":0,"nick":"Hard-with-Core","taoge_avatar":"","taoge_nick":"","uin":345766234,"vip_type":2},"creator_uin":345766234,"desc":"","dirid":0,"fav_num":0,"modify_time":1606916197,"pic_mid":"","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[285211252,285220604,286299561,282517203,280375514,281262741,279535339,276543255,279177555,270996376,277566400,277490410,277982501,279213831,271141120,269837089,269327264,269842522,268776705,267612960,268216037,268224482,262045564,263176474,264902989,264013984,263489940,260530296,260550883,260893771,261809935,257000973,257003445,256293475,256475514,256573012,255934977,255784597,255735711,254341285,254981609,254979096,254012054,253421721,253070748,247954689,247209287,247254788,245900518,245403003,245190455,243899573,240930332,238513746,237749089,237749127,237749126,237348541,236304638,236153678,235969182,235042187,234880516,234179250,234153027,234124255,233853689,230808185,232977212,228426659,229849699,228463348,228857436,229531298,229531288,228857423,231761611,229064582,227483582,229396544,232703567,233373358,232112570,228939532,228956634,231069539,232000769,231825185,232113576,232884388,230515266,233042420,231999688,228870975,233647265,229396543,228215723,226920504,232000473,228463321,227369563,228857558,229531287,229531292,229531291,229531293,229531294,229531296,229531297,228857426,230513921,232063032,231375299,229849690,229849698,228857430,233185023,233044156,232112772,233553041,232322249,232707985,230859449,230859455,230859454,230859451,228860978,224427301,230859447,231069692,231374487,228885625,228857591,228857594,228857439,225114981,225114979,225114972,232201293,232112463,231437026,230859453,229531289,225114976,228857595,228463304,229531295,229849695,229531290,228857596,229393568,229287409,230221875,229849697,231969634,233417621,232113474,232411806,229531299,229531300],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[24,14,117],"tag_names":[],"tid":7063425421,"title":"比利时硬派厂牌 | Dirty Workz","tjreport":""},{"access_num":58384,"album_pic_mid":"003nnB0x2hkAba","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1472608754,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/giaHouCicD4RCj22NHorNuk3bd8Jy5fvqL0xMDj0U0YkhZd0amTAQRrg/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/giaHouCicD4RCj22NHorNuk3bd8Jy5fvqL0xMDj0U0YkhZd0amTAQRrg/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/giaHouCicD4RCj22NHorNuk3bd8Jy5fvqL0xMDj0U0YkhZd0amTAQRrg/600?n=1","create_time":1472608754,"creator_info":{"avatar":"","is_dj":0,"nick":"Yuyia.","taoge_avatar":"","taoge_nick":"","uin":236257557,"vip_type":2},"creator_uin":236257557,"desc":"","dirid":0,"fav_num":0,"modify_time":1493101462,"pic_mid":"004PQwmT2YRQhq","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[107815599,107815598,108252944,2668472,108052987,108052986,108052981,108052978,108053253,108168206,108067729,108108482,108108478,108168204,108252952,108252943,108252946,108252947],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[224,117],"tag_names":[],"tid":2928792476,"title":"小小派对，跟随斯卡旋律摇摆！","tjreport":""},{"access_num":18334,"album_pic_mid":"004aif7C0qPIAo","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1558421229,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/YAJJShFMHm3thIEcPcOnanibmTje6ccarEDQQBGTaE5h4qMkW8iaEib9Q/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/YAJJShFMHm3thIEcPcOnanibmTje6ccarEDQQBGTaE5h4qMkW8iaEib9Q/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/YAJJShFMHm3thIEcPcOnanibmTje6ccarEDQQBGTaE5h4qMkW8iaEib9Q/600?n=1","create_time":1558406506,"creator_info":{"avatar":"","is_dj":0,"nick":"韩达达","taoge_avatar":"","taoge_nick":"","uin":3163854005,"vip_type":2},"creator_uin":3163854005,"desc":"","dirid":0,"fav_num":0,"modify_time":1656350385,"pic_mid":"","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[1745886,5077672,105974825,102876979,913973,102451453,635202,102201972,1168473,102205595,102696034,7045183,783357,416736,102796845,4813487,693650,106014808,882178,102052943,101095810,4809171,201440081,1558425,6258531,856291,105754966,102695225,8161765],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[168,6,117],"tag_names":[],"tid":6998066344,"title":"吃货的快乐:来一份韩式大餐","tjreport":""},{"access_num":66170,"album_pic_mid":"001jqasY0H0dSC","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1530074936,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/fx76QicKT5fa7gfzOBqCkDIIwDzewZicJVw8MU8NBlicppoObIFFDsZwA/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/fx76QicKT5fa7gfzOBqCkDIIwDzewZicJVw8MU8NBlicppoObIFFDsZwA/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/fx76QicKT5fa7gfzOBqCkDIIwDzewZicJVw8MU8NBlicppoObIFFDsZwA/600?n=1","create_time":1529993599,"creator_info":{"avatar":"","is_dj":0,"nick":"蘑菇爸爸和小乖妈妈","taoge_avatar":"","taoge_nick":"","uin":1302998248,"vip_type":7},"creator_uin":1302998248,"desc":"","dirid":0,"fav_num":0,"modify_time":1552268646,"pic_mid":"001qft6L3VciXG","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[214051944,8127939,614622,208627437,2794993,106230612,105867995,105696014,204676552,201738851,208627422,108102911,614621,107424277,109623051,107738775,4756354],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[131,117,165],"tag_names":[],"tid":4180811611,"title":"听说达芬奇画鸡蛋时听的就是这些歌","tjreport":""},{"access_num":71329,"album_pic_mid":"003QfOGY24GXBp","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1478089473,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/giaHouCicD4RCj22NHorNuk3bd8Jy5fvqLougpKpw62YrEpT4eS83h8A/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/giaHouCicD4RCj22NHorNuk3bd8Jy5fvqLougpKpw62YrEpT4eS83h8A/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/giaHouCicD4RCj22NHorNuk3bd8Jy5fvqLougpKpw62YrEpT4eS83h8A/600?n=1","create_time":1472805981,"creator_info":{"avatar":"","is_dj":0,"nick":"Yuyia.","taoge_avatar":"","taoge_nick":"","uin":236257557,"vip_type":2},"creator_uin":236257557,"desc":"","dirid":0,"fav_num":0,"modify_time":1493101462,"pic_mid":"004HrTxr04mCI0","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[107091236,107480753,601276,108274381,102887207,2668472,1946702,101703523,101703529,83836,83837,108053001,108053256,108066309,108168204,108168206,601275,108274378,106667230,108131962],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[224,117],"tag_names":[],"tid":2929069995,"title":"快乐的节奏，跃动的音符","tjreport":""},{"access_num":114552,"album_pic_mid":"","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1486689789,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/g7hl9DicAYq6xNsbMELzjBx9YJkMicndFp94ISfH8gkoiaBJUv8O1sAZA/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/g7hl9DicAYq6xNsbMELzjBx9YJkMicndFp94ISfH8gkoiaBJUv8O1sAZA/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/g7hl9DicAYq6xNsbMELzjBx9YJkMicndFp94ISfH8gkoiaBJUv8O1sAZA/600?n=1","create_time":1486522411,"creator_info":{"avatar":"","is_dj":0,"nick":"夏逝Depart ．","taoge_avatar":"","taoge_nick":"","uin":3092816710,"vip_type":2},"creator_uin":3092816710,"desc":"","dirid":0,"fav_num":0,"modify_time":1646241243,"pic_mid":"004UEYTs1ZUO8O","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[4830582,105840768,202037,3576583,1840021,2551059,389239,2551053,2551054,2551052,7398201,1548449,8159812,1449695,389351,105304563,8159826,106679174],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[117],"tag_names":[],"tid":855147084,"title":"欢快纯乐 · 倘佯一份寻觅的喜悦","tjreport":""},{"access_num":54095,"album_pic_mid":"003DERPm30e2kH","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1536634097,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/ia1BhHY0pBXp25tpaaiaCzRSfPhTzEh4GgkK3nXwVJdxpczuK6651zOw/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/ia1BhHY0pBXp25tpaaiaCzRSfPhTzEh4GgkK3nXwVJdxpczuK6651zOw/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/ia1BhHY0pBXp25tpaaiaCzRSfPhTzEh4GgkK3nXwVJdxpczuK6651zOw/600?n=1","create_time":1535008688,"creator_info":{"avatar":"","is_dj":0,"nick":"。。。","taoge_avatar":"","taoge_nick":"","uin":3043667928,"vip_type":2},"creator_uin":3043667928,"desc":"","dirid":0,"fav_num":0,"modify_time":1568741694,"pic_mid":"002Llu7313R1Ow","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[100874244,2255865,2159088,2534477,1977834,758305,4852501,100789376,200820544,205358506,213077958,5790364,3887373,2204177,1735100,5852171,104252125,1977830,202450808,108014199,7524003],"song_types":[3,13,3,3,3,3,3,13,13,3,13,3,13,13,13,13,13,13,13,13,13],"tag_ids":[222,59,117],"tag_names":[],"tid":4311066357,"title":"皇室婚礼背景音乐","tjreport":""},{"access_num":645659,"album_pic_mid":"","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1477483426,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/SOftSED2VibgaZItvv1RsiauXGuSXgicROGUsPrQxQsqdibvlJJaNibYj2g/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/SOftSED2VibgaZItvv1RsiauXGuSXgicROGUsPrQxQsqdibvlJJaNibYj2g/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/SOftSED2VibgaZItvv1RsiauXGuSXgicROGUsPrQxQsqdibvlJJaNibYj2g/600?n=1","create_time":1474954458,"creator_info":{"avatar":"","is_dj":0,"nick":"一枚橙","taoge_avatar":"","taoge_nick":"","uin":3050901369,"vip_type":2},"creator_uin":3050901369,"desc":"","dirid":0,"fav_num":0,"modify_time":1545931449,"pic_mid":"004LWkjL4ExtHo","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[5073593,102053790,5023147,102669582,108219003,102681429,946925,7406973,1119125,439993,1009783,1354781,1268604,2033470,630633,816186,1009782,1009780],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[117,167],"tag_names":[],"tid":3534056164,"title":"音乐添色彩，欢快欧美佳作","tjreport":""},{"access_num":65538,"album_pic_mid":"003xF4EA0R6aPb","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1493891173,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/8JW2hoQldW7fIhI6rtN1rW6R8icOlBYfmvQaETWDrY0ibwF2hsoar3UQ/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/8JW2hoQldW7fIhI6rtN1rW6R8icOlBYfmvQaETWDrY0ibwF2hsoar3UQ/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/8JW2hoQldW7fIhI6rtN1rW6R8icOlBYfmvQaETWDrY0ibwF2hsoar3UQ/600?n=1","create_time":1493777204,"creator_info":{"avatar":"","is_dj":0,"nick":"Fish.","taoge_avatar":"","taoge_nick":"","uin":379827740,"vip_type":0},"creator_uin":379827740,"desc":"","dirid":0,"fav_num":0,"modify_time":1495198665,"pic_mid":"000dSoye1O9i22","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[103120662,107486677,1683776,1075378,2255865,5544993,5124684,7582453,7061301,5615475,739440,1708631,106308002,7181696,7582454],"song_types":[3,3,3,3,3,3,3,3,3,3,3,13,3,3,3],"tag_ids":[27,117,116],"tag_names":[],"tid":866251341,"title":"忽尔今夏 - 漫天飞舞的清凉音符","tjreport":""},{"access_num":34196,"album_pic_mid":"002MzH0E0m0yGP","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1496903684,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/HzL9814HkwwY8x0TWnmJe9UiamtwiadMKGN8GTrZvUDicqdkuYbYdDVOg/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/HzL9814HkwwY8x0TWnmJe9UiamtwiadMKGN8GTrZvUDicqdkuYbYdDVOg/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/HzL9814HkwwY8x0TWnmJe9UiamtwiadMKGN8GTrZvUDicqdkuYbYdDVOg/600?n=1","create_time":1496801668,"creator_info":{"avatar":"","is_dj":0,"nick":"Ramirez","taoge_avatar":"","taoge_nick":"","uin":287322531,"vip_type":2},"creator_uin":287322531,"desc":"","dirid":0,"fav_num":0,"modify_time":1496900438,"pic_mid":"003qnkoq2Q5XMe","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[4835561,104144942,101786105,101786104,100993541,100993548,100993558,4858910,109750691,109750690,103015384,103015381,101342842,104211250,104211252,104144945,100993438,100993466,100993491,100993452],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[27,117],"tag_names":[],"tid":1165717985,"title":"民族的才是世界的\u2014古典舞曲","tjreport":""},{"access_num":182244,"album_pic_mid":"","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1480678982,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/pBNeTQrUba1icAwnEJZedia2RZjvialCjnXWcd7HaZAicP5T2KzbWdhwmQ/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/pBNeTQrUba1icAwnEJZedia2RZjvialCjnXWcd7HaZAicP5T2KzbWdhwmQ/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/pBNeTQrUba1icAwnEJZedia2RZjvialCjnXWcd7HaZAicP5T2KzbWdhwmQ/600?n=1","create_time":1477452956,"creator_info":{"avatar":"","is_dj":0,"nick":"在细雨中呼喊青春っ","taoge_avatar":"","taoge_nick":"","uin":3464982830,"vip_type":2},"creator_uin":3464982830,"desc":"","dirid":0,"fav_num":0,"modify_time":1554139915,"pic_mid":"001J32Xu2WTrEm","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[851726,33816,78852,102896494,5016801,103258109,1592928,479567,2443803,630576,519200,1212080,7411506,1643345,102685286,436100,710895,934732,1313191],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[117],"tag_names":[],"tid":840796251,"title":"欢快英文歌，小心High过头哦~","tjreport":""},{"access_num":74186,"album_pic_mid":"001yWxre27dBvt","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1480337323,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/0Fvp5LwdLLDtCTPt1WSVeRTmQwEnAWE9kg5xoiaKOCjmmNjl1b4Wbng/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/0Fvp5LwdLLDtCTPt1WSVeRTmQwEnAWE9kg5xoiaKOCjmmNjl1b4Wbng/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/0Fvp5LwdLLDtCTPt1WSVeRTmQwEnAWE9kg5xoiaKOCjmmNjl1b4Wbng/600?n=1","create_time":1473831823,"creator_info":{"avatar":"","is_dj":0,"nick":"像疯一样自由","taoge_avatar":"","taoge_nick":"","uin":2753358585,"vip_type":2},"creator_uin":2753358585,"desc":"","dirid":0,"fav_num":0,"modify_time":1607706784,"pic_mid":"004MhwyD0MvX9P","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[1414085,416736,7233208,2447008,1397499,102342009,2447007,2446999,9107038,1276036,1276035,1276038,217403799,105301801,105304286,105542829,1507939,1692587,4784525],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[81,117,168],"tag_names":[],"tid":2334052745,"title":"一路欢歌，走遍世界","tjreport":""},{"access_num":44243,"album_pic_mid":"","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1478089327,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/cIbAphQk35JMG8FZBZUxQyvcKCYcMDwXFN2ia9f0T3lZrdOmg1W9P3Q/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/cIbAphQk35JMG8FZBZUxQyvcKCYcMDwXFN2ia9f0T3lZrdOmg1W9P3Q/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/cIbAphQk35JMG8FZBZUxQyvcKCYcMDwXFN2ia9f0T3lZrdOmg1W9P3Q/600?n=1","create_time":1477377315,"creator_info":{"avatar":"","is_dj":0,"nick":"音乐学人","taoge_avatar":"","taoge_nick":"","uin":3463221285,"vip_type":2},"creator_uin":3463221285,"desc":"","dirid":0,"fav_num":0,"modify_time":1490864097,"pic_mid":"003mBJv94d7w86","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[106493758,106493756,105817284,105817277,107704988,105067595,5195405,1450837,5046719,5046718,669317,5268929,5293111,5293117,105763224,7692638,7692637,102918327],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[170,6,117],"tag_names":[],"tid":2338844911,"title":"用一首俄语清新流行舞曲，结束一天的忙碌","tjreport":""},{"access_num":247914,"album_pic_mid":"001HwwNH1inlz9","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1494513195,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/FicCThRvK2IyauqoncdicFQ44m23mCuXWaZhxkasMfG6jFmCu2XOmlmQ/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/FicCThRvK2IyauqoncdicFQ44m23mCuXWaZhxkasMfG6jFmCu2XOmlmQ/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/FicCThRvK2IyauqoncdicFQ44m23mCuXWaZhxkasMfG6jFmCu2XOmlmQ/600?n=1","create_time":1494386245,"creator_info":{"avatar":"","is_dj":0,"nick":"深空失忆","taoge_avatar":"","taoge_nick":"","uin":3335306653,"vip_type":2},"creator_uin":3335306653,"desc":"","dirid":0,"fav_num":0,"modify_time":1651338973,"pic_mid":"002JdvL63TO0ip","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[635751,2975670,1330509,614517,648227,1257199,628370,233558,473135,645967,144244,95263,7119668,632602,144227,106417262,106451316,2927393],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[165,117],"tag_names":[],"tid":1762335168,"title":"零零年代，谁的节奏最摇摆","tjreport":""},{"access_num":169324,"album_pic_mid":"","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1493345872,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/IknB7UUG0ME0zalRpPKYjEibwbapdgmNibTbUGyZ4PqAcibfkNNZ9Z7jg/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/IknB7UUG0ME0zalRpPKYjEibwbapdgmNibTbUGyZ4PqAcibfkNNZ9Z7jg/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/IknB7UUG0ME0zalRpPKYjEibwbapdgmNibTbUGyZ4PqAcibfkNNZ9Z7jg/600?n=1","create_time":1493187119,"creator_info":{"avatar":"","is_dj":0,"nick":"漂洋过海来看你 ?","taoge_avatar":"","taoge_nick":"","uin":3545474218,"vip_type":2},"creator_uin":3545474218,"desc":"","dirid":0,"fav_num":0,"modify_time":1568741560,"pic_mid":"00252GFZ0IJicr","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[398894,235108,93348,7182,5074975,107449,1254745,2975670,9086096,5130055,103147382,1026967,100380,4884725,652648,102385691,2852171,9058640],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[117,165],"tag_names":[],"tid":3259666400,"title":"画一个靓妆出门，心情美美哒","tjreport":""},{"access_num":355418,"album_pic_mid":"","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1478089508,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/uhmBELdVgMXkrmA8Q4kibwxbLoB3SZYBZXiaIAa4zbe2ATiaqW6ZfhhTw/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/uhmBELdVgMXkrmA8Q4kibwxbLoB3SZYBZXiaIAa4zbe2ATiaqW6ZfhhTw/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/uhmBELdVgMXkrmA8Q4kibwxbLoB3SZYBZXiaIAa4zbe2ATiaqW6ZfhhTw/600?n=1","create_time":1477376389,"creator_info":{"avatar":"","is_dj":0,"nick":"简爱╮Simple","taoge_avatar":"","taoge_nick":"","uin":3463680457,"vip_type":2},"creator_uin":3463680457,"desc":"","dirid":0,"fav_num":0,"modify_time":1574788826,"pic_mid":"002Si7a41VqZ4O","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[720543,7212408,393075,102578,455619,105941648,133549,475164,874518,724576,7242281,105533726,398894,393069,725329,724577,677743,4907244,169424,5075075],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[117],"tag_names":[],"tid":2935233966,"title":"只属于软妹子的欢声笑语","tjreport":""},{"access_num":72658,"album_pic_mid":"0039kk4b40V8QS","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1530623769,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/b03yv5AXb5lrgIvpov59FtyNmJR96BuVPUodP6ibPJiaQoaflHicreoicg/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/b03yv5AXb5lrgIvpov59FtyNmJR96BuVPUodP6ibPJiaQoaflHicreoicg/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/b03yv5AXb5lrgIvpov59FtyNmJR96BuVPUodP6ibPJiaQoaflHicreoicg/600?n=1","create_time":1530620574,"creator_info":{"avatar":"","is_dj":0,"nick":"小叮当","taoge_avatar":"","taoge_nick":"","uin":2041254345,"vip_type":2},"creator_uin":2041254345,"desc":"","dirid":0,"fav_num":0,"modify_time":1568741809,"pic_mid":"003SaTyK31Jfkl","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[213940636,213102090,214154609,214143001,214033543,205153250,214142403,213058416,213446361,213435242,214185752,203451043,204514444,213760455,205359736,202550204,213764343,211864789,213918810,214189294,213387483,213443234,205014428,200835885],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[205,25,117],"tag_names":[],"tid":4192676792,"title":"西语 | 慢速动感Latin ","tjreport":""},{"access_num":322028,"album_pic_mid":"","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1478089332,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/OmT4ibflJ4UHdpVjIJM6iaMMPwpVsaTL1LwfrIWom48kIvk2bqgibrnwQ/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/OmT4ibflJ4UHdpVjIJM6iaMMPwpVsaTL1LwfrIWom48kIvk2bqgibrnwQ/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/OmT4ibflJ4UHdpVjIJM6iaMMPwpVsaTL1LwfrIWom48kIvk2bqgibrnwQ/600?n=1","create_time":1477456708,"creator_info":{"avatar":"","is_dj":0,"nick":"情绪疯子.","taoge_avatar":"","taoge_nick":"","uin":3473267585,"vip_type":2},"creator_uin":3473267585,"desc":"","dirid":0,"fav_num":0,"modify_time":1612545570,"pic_mid":"0011wxiM32cHrC","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[109581297,1163559,105941648,398894,168226,107192072,407884,235110,101798261,107899426,406042,2856368,168094,107906638,102221002,200655055,257611,185878,1098066,109750],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[117],"tag_names":[],"tid":2338925418,"title":"阳光好心情，音乐送给你","tjreport":""},{"access_num":67596,"album_pic_mid":"","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1531195865,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/MibhME4PmHVsXcNFs5UACwPVntbqFU4xArtOgrnuYc0UUMTa1T4y1uQ/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/MibhME4PmHVsXcNFs5UACwPVntbqFU4xArtOgrnuYc0UUMTa1T4y1uQ/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/MibhME4PmHVsXcNFs5UACwPVntbqFU4xArtOgrnuYc0UUMTa1T4y1uQ/600?n=1","create_time":1527216722,"creator_info":{"avatar":"","is_dj":0,"nick":"土酷男孩","taoge_avatar":"","taoge_nick":"","uin":512483521,"vip_type":1},"creator_uin":512483521,"desc":"","dirid":0,"fav_num":0,"modify_time":1532310907,"pic_mid":"0020LFRS22jock","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[213480196,200969438,107560341,1862387,212625452,4834652,181689,1191956,14989,227887,103976326,202985444,172321,109128657,630314,203093789,437530,1522384,640083,129626,1730291,101140486,106348117,200672503,3161728,5176793,635756,201616581,200589614,4947361,107437884,681735,212839302],"song_types":[13,13,13,13,13,13,13,13,3,13,13,13,13,13,13,13,13,13,13,13,13,13,13,3,3,13,13,13,13,3,13,13,3],"tag_ids":[165,6,117],"tag_names":[],"tid":4114640001,"title":"三字食 | 宅家点外卖参考List ","tjreport":""},{"access_num":46778,"album_pic_mid":"","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1478089146,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/VX7CYGcRTCiaZhm8oOxBfiaZ25aeC3M1npicYjnaV23oE6t66sJ4c1Omw/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/VX7CYGcRTCiaZhm8oOxBfiaZ25aeC3M1npicYjnaV23oE6t66sJ4c1Omw/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/VX7CYGcRTCiaZhm8oOxBfiaZ25aeC3M1npicYjnaV23oE6t66sJ4c1Omw/600?n=1","create_time":1477272154,"creator_info":{"avatar":"","is_dj":0,"nick":"放肆的年华","taoge_avatar":"","taoge_nick":"","uin":3051920143,"vip_type":2},"creator_uin":3051920143,"desc":"","dirid":0,"fav_num":0,"modify_time":1545931498,"pic_mid":"000XGLa91fBvQR","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[887779,1315601,5732864,5732862,2535096,2535097,2286526,105714160,105714161,389696,475931,688719,478485,814843,475934,1413559,688718,478486],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[170,6,117],"tag_names":[],"tid":1735986860,"title":"迎着朝阳前进！活力感爆棚的意文歌曲","tjreport":""},{"access_num":91459,"album_pic_mid":"001ZaCQY2OxVMg","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1514861880,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/Kw0js0dh71gAUlYpdebialxOiaGnkgGqfeODkOQaoibptYZGJ4o39DeqA/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/Kw0js0dh71gAUlYpdebialxOiaGnkgGqfeODkOQaoibptYZGJ4o39DeqA/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/Kw0js0dh71gAUlYpdebialxOiaGnkgGqfeODkOQaoibptYZGJ4o39DeqA/600?n=1","create_time":1514790525,"creator_info":{"avatar":"","is_dj":0,"nick":"梁伦超","taoge_avatar":"","taoge_nick":"","uin":1738160012,"vip_type":0},"creator_uin":1738160012,"desc":"","dirid":0,"fav_num":0,"modify_time":1568742108,"pic_mid":"004GDhbs4R7zb9","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[2452312,1005894,7256891,211724020,204560946,1631242,106697364,201942644,98098,202210552,203511198,200906186,202210558,200922245,105789913,203910278,212085322,227843466,107601447,203510846,203845504],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[167,117],"tag_names":[],"tid":3627088651,"title":"最新出炉！2018纽约时代广场跨年演唱会","tjreport":""},{"access_num":83612,"album_pic_mid":"002g0JpA4aQ6bZ","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1472722347,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/0Fvp5LwdLLDtCTPt1WSVeRlXT8zVXNt3gApf44YXZCFibObtjYvjeKQ/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/0Fvp5LwdLLDtCTPt1WSVeRlXT8zVXNt3gApf44YXZCFibObtjYvjeKQ/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/0Fvp5LwdLLDtCTPt1WSVeRlXT8zVXNt3gApf44YXZCFibObtjYvjeKQ/600?n=1","create_time":1472722347,"creator_info":{"avatar":"","is_dj":0,"nick":"像疯一样自由","taoge_avatar":"","taoge_nick":"","uin":2753358585,"vip_type":2},"creator_uin":2753358585,"desc":"","dirid":0,"fav_num":0,"modify_time":1537530368,"pic_mid":"001Vbdqh084qNb","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[1588613],"song_types":[13],"tag_ids":[6,117,81],"tag_names":[],"tid":2332616633,"title":"因为有梦，所以我们去旅行","tjreport":""},{"access_num":117956,"album_pic_mid":"","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1478089071,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/SDxXr3xW1IibTLlQibxibEgJ2mSC6qL9VyFm9C2WicAzIz7urccGbZzltg/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/SDxXr3xW1IibTLlQibxibEgJ2mSC6qL9VyFm9C2WicAzIz7urccGbZzltg/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/SDxXr3xW1IibTLlQibxibEgJ2mSC6qL9VyFm9C2WicAzIz7urccGbZzltg/600?n=1","create_time":1477385166,"creator_info":{"avatar":"","is_dj":0,"nick":"乐此不疲·","taoge_avatar":"","taoge_nick":"","uin":3476572262,"vip_type":2},"creator_uin":3476572262,"desc":"","dirid":0,"fav_num":0,"modify_time":1558447357,"pic_mid":"002mWb2H1Gk1GA","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[1220380,101098837,5642208,7235735,329184,1501506,434309,433893,1202579,413144,328935,300071,752517,1352262,726298,487302,4887244,213263411],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[222,6,117],"tag_names":[],"tid":1438603195,"title":"我们结婚吧，就现在","tjreport":""},{"access_num":503125,"album_pic_mid":"000bFkCl0aG5cM","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1489632444,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/dibiaTFIl5E8cUF3XUibZsicVYicGAnm1hYbecDkufxJbSOJqP0ybSeu1DQ/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/dibiaTFIl5E8cUF3XUibZsicVYicGAnm1hYbecDkufxJbSOJqP0ybSeu1DQ/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/dibiaTFIl5E8cUF3XUibZsicVYicGAnm1hYbecDkufxJbSOJqP0ybSeu1DQ/600?n=1","create_time":1489026329,"creator_info":{"avatar":"","is_dj":0,"nick":"ぺ书写時光","taoge_avatar":"","taoge_nick":"","uin":3158470376,"vip_type":2},"creator_uin":3158470376,"desc":"","dirid":0,"fav_num":0,"modify_time":1624468507,"pic_mid":"003sCPOh1cI3MM","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[101805273,838372,109631468,182138,1347832,451197,5144928,102631611,102340969,1631252,200314695,5163440,5110,166896,410314,8447867,109922981,257616,109745955,106253204],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[117],"tag_names":[],"tid":2655856612,"title":"太阳和爱 我快乐的源泉","tjreport":""},{"access_num":301620,"album_pic_mid":"","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1478089333,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/OmT4ibflJ4UHdpVjIJM6iaMMPwpVsaTL1LZCMDC5lsTdMWpZslYj2Xjw/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/OmT4ibflJ4UHdpVjIJM6iaMMPwpVsaTL1LZCMDC5lsTdMWpZslYj2Xjw/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/OmT4ibflJ4UHdpVjIJM6iaMMPwpVsaTL1LZCMDC5lsTdMWpZslYj2Xjw/600?n=1","create_time":1477456710,"creator_info":{"avatar":"","is_dj":0,"nick":"情绪疯子.","taoge_avatar":"","taoge_nick":"","uin":3473267585,"vip_type":2},"creator_uin":3473267585,"desc":"","dirid":0,"fav_num":0,"modify_time":1608052795,"pic_mid":"000FQMRf281G0i","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[102367248,691753,104778460,95474,13551,4829723,398894,105593870,103747,106083,235108,1358111,105462397,407048,420621,1026967,150560,107785311,724906],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[117],"tag_names":[],"tid":2338925422,"title":"融入你生活的每一天，欢快国语音乐","tjreport":""},{"access_num":165763,"album_pic_mid":"","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1478089629,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/c1vbhreKbmwibABXvGeOJE25VRn36sYS6icy6xrTsicUuTCDyfXnibJ1kw/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/c1vbhreKbmwibABXvGeOJE25VRn36sYS6icy6xrTsicUuTCDyfXnibJ1kw/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/c1vbhreKbmwibABXvGeOJE25VRn36sYS6icy6xrTsicUuTCDyfXnibJ1kw/600?n=1","create_time":1476951087,"creator_info":{"avatar":"","is_dj":0,"nick":"/ 睡衣男孩 /","taoge_avatar":"","taoge_nick":"","uin":2146615988,"vip_type":2},"creator_uin":2146615988,"desc":"","dirid":0,"fav_num":0,"modify_time":1592327588,"pic_mid":"0035nwyc3XivR2","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[100808342,1322862,9149108,4762845,6541856,7559820,9263690,104734472,1969328,604411,2196469,2668437,1976049,4685188,8305746,8301490,101910278,101306943],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[170,117],"tag_names":[],"tid":3234772420,"title":"德语儿歌 / 打开耳朵聆听童年","tjreport":""},{"access_num":583972,"album_pic_mid":"000x8jrY23qjBH","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1488506564,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/zXciaBNvbG6hvUGQndZ1EGCCI6uIQKBxZpVgT9RuSR6F7lLKKevkQzw/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/zXciaBNvbG6hvUGQndZ1EGCCI6uIQKBxZpVgT9RuSR6F7lLKKevkQzw/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/zXciaBNvbG6hvUGQndZ1EGCCI6uIQKBxZpVgT9RuSR6F7lLKKevkQzw/600?n=1","create_time":1488253535,"creator_info":{"avatar":"","is_dj":0,"nick":"leave、","taoge_avatar":"","taoge_nick":"","uin":3316320864,"vip_type":2},"creator_uin":3316320864,"desc":"","dirid":0,"fav_num":0,"modify_time":1642612559,"pic_mid":"001veuoQ1xegSY","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[447252,5463772,102204538,100380,1799996,100387,718483,725329,182135,130240,102337595,469215,105379634,7256750,8129256,4830766,280709494,106450965],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[117],"tag_names":[],"tid":2050507767,"title":"让你的人生充满笑脸","tjreport":""},{"access_num":202334,"album_pic_mid":"","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1478089761,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/uOwUQDG1AfFg3VAHKSWFt698icClI3ia6b4Yt8pfKfwHRdu4YcaVcaiaw/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/uOwUQDG1AfFg3VAHKSWFt698icClI3ia6b4Yt8pfKfwHRdu4YcaVcaiaw/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/uOwUQDG1AfFg3VAHKSWFt698icClI3ia6b4Yt8pfKfwHRdu4YcaVcaiaw/600?n=1","create_time":1477365343,"creator_info":{"avatar":"","is_dj":0,"nick":"毫无保留。","taoge_avatar":"","taoge_nick":"","uin":2784608409,"vip_type":2},"creator_uin":2784608409,"desc":"","dirid":0,"fav_num":0,"modify_time":1637255542,"pic_mid":"002rOPzZ0W3xum","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[546740,1127278,104627,736927,267015,4907850,1127912,107709961,7429909,408722,4829838,266671,107725909,1189172,261980,105571981,4907131,105739339,7017,316870225,622576,391157],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[117],"tag_names":[],"tid":3537364153,"title":"港式快乐滋味，令你笑得甜美","tjreport":""},{"access_num":638013,"album_pic_mid":"004GsFCO3tD2gS","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1490151140,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/YXUTo5JKKKd3qFXyvSJqz4DrY0sCZOokdFd1KZ0ymquEenFFvDe2Bw/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/YXUTo5JKKKd3qFXyvSJqz4DrY0sCZOokdFd1KZ0ymquEenFFvDe2Bw/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/YXUTo5JKKKd3qFXyvSJqz4DrY0sCZOokdFd1KZ0ymquEenFFvDe2Bw/600?n=1","create_time":1489995711,"creator_info":{"avatar":"","is_dj":0,"nick":"唱歌的人动了情","taoge_avatar":"","taoge_nick":"","uin":3511486103,"vip_type":2},"creator_uin":3511486103,"desc":"","dirid":0,"fav_num":0,"modify_time":1620407988,"pic_mid":"001bP2gG1mvPBd","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[2441399,444627,104457204,5058283,102360142,1250577,9461586,462182,105526950,4966543,393674,89167,104324262,104324261,200964060,5238165,393671,201185857],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[165,117],"tag_names":[],"tid":1755667228,"title":"心情好，就唱一首快乐的歌","tjreport":""},{"access_num":191750,"album_pic_mid":"","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1480337373,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/QviaUUA4YqIMo3N6TseIlbuviaI68TLhNRYbk0fQRroHTlrem64zlLVg/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/QviaUUA4YqIMo3N6TseIlbuviaI68TLhNRYbk0fQRroHTlrem64zlLVg/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/QviaUUA4YqIMo3N6TseIlbuviaI68TLhNRYbk0fQRroHTlrem64zlLVg/600?n=1","create_time":1477969469,"creator_info":{"avatar":"","is_dj":0,"nick":"晴天love","taoge_avatar":"","taoge_nick":"","uin":2955143385,"vip_type":2},"creator_uin":2955143385,"desc":"","dirid":0,"fav_num":0,"modify_time":1588094224,"pic_mid":"0015O20P01hSIM","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[103376854,398457,102442189,5054098,101101369,4723301,4749489,966595,5599203,671212,686408,2927448,1112596,8161899,5020869,1215547,5058050,5029148],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[117,167],"tag_names":[],"tid":2339557736,"title":"美好时光的愉悦小调","tjreport":""},{"access_num":581170,"album_pic_mid":"000qborW3wwC4F","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1484646535,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/CWicWfBTb9hhZU7ia18JvSxB4DTPUj66XEJBbIF03yjc7M3MK6pPicUsw/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/CWicWfBTb9hhZU7ia18JvSxB4DTPUj66XEJBbIF03yjc7M3MK6pPicUsw/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/CWicWfBTb9hhZU7ia18JvSxB4DTPUj66XEJBbIF03yjc7M3MK6pPicUsw/600?n=1","create_time":1484270025,"creator_info":{"avatar":"","is_dj":0,"nick":"屋檐下听雨°","taoge_avatar":"","taoge_nick":"","uin":3547425501,"vip_type":2},"creator_uin":3547425501,"desc":"","dirid":0,"fav_num":0,"modify_time":1638811029,"pic_mid":"002eCesH0qPkd0","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[409172,2636338,3586487,2475183,102204538,671503,410314,3586486,108921463,4907911,1330513,102065755,447258,406042,235109,3586109,106671516,5093977],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[165,117],"tag_names":[],"tid":1145607093,"title":"『快乐前奏』论几秒喜欢上一首歌","tjreport":""},{"access_num":645412,"album_pic_mid":"000ci6NR08YKaO","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1476954575,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/wwQnRI807QCWmsVKT7f9KhYuQdBsZzqyicWfUUPkXdtuwEI3dlxtoxQ/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/wwQnRI807QCWmsVKT7f9KhYuQdBsZzqyicWfUUPkXdtuwEI3dlxtoxQ/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/wwQnRI807QCWmsVKT7f9KhYuQdBsZzqyicWfUUPkXdtuwEI3dlxtoxQ/600?n=1","create_time":1470627428,"creator_info":{"avatar":"","is_dj":0,"nick":"СердцеБьется","taoge_avatar":"","taoge_nick":"","uin":2774963009,"vip_type":2},"creator_uin":2774963009,"desc":"","dirid":0,"fav_num":0,"modify_time":1645636320,"pic_mid":"002rK1551Ksc82","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[108237662,107899120,107738095,105533726,107770314,107313798,105871902,5063372,407046,718483,9081831,5063374,102210521,7256750,410314,107802967,107479718,7007084,7117101,102051568,5379457,7042277,410533,623699],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[165,117,85],"tag_names":[],"tid":3527809241,"title":"好心情从上班的路上开始","tjreport":""},{"access_num":194294,"album_pic_mid":"0012STFO3j8NrK","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1491528989,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/o83KyXmT8ggX7JZsMd5zv4AD0lLPnE0Yg3A9CDqrYBfBzshL8O7zFg/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/o83KyXmT8ggX7JZsMd5zv4AD0lLPnE0Yg3A9CDqrYBfBzshL8O7zFg/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/o83KyXmT8ggX7JZsMd5zv4AD0lLPnE0Yg3A9CDqrYBfBzshL8O7zFg/600?n=1","create_time":1491380046,"creator_info":{"avatar":"","is_dj":0,"nick":"Faith(信念)","taoge_avatar":"","taoge_nick":"","uin":3204940873,"vip_type":2},"creator_uin":3204940873,"desc":"","dirid":0,"fav_num":0,"modify_time":1642871705,"pic_mid":"0035beAX2pmEOG","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[106396897,435537,97628,107346883,718483,804564,1631252,14989,102053839,235109,101805136,95286,4822794,108403478,126718,126721,280709489,5645193],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[117,165],"tag_names":[],"tid":1757798227,"title":"吃货的世界 就是那么简单快乐","tjreport":""},{"access_num":77628,"album_pic_mid":"004RF2Qs1SH67O","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1534752542,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/ia1BhHY0pBXp25tpaaiaCzRcIibeYFvvz14qQmJzHvcLMAd6hJfCMG71A/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/ia1BhHY0pBXp25tpaaiaCzRcIibeYFvvz14qQmJzHvcLMAd6hJfCMG71A/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/ia1BhHY0pBXp25tpaaiaCzRcIibeYFvvz14qQmJzHvcLMAd6hJfCMG71A/600?n=1","create_time":1534752310,"creator_info":{"avatar":"","is_dj":0,"nick":"。。。","taoge_avatar":"","taoge_nick":"","uin":3043667928,"vip_type":2},"creator_uin":3043667928,"desc":"","dirid":0,"fav_num":0,"modify_time":1595957189,"pic_mid":"002FOmQ83kqYRi","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[124707,1345784,145324,5157905,10447,755369,108785686,764198,9058628,5108292,101806324,475792,9457620,799755,103375787,125314,411321],"song_types":[3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3],"tag_ids":[76,59,117],"tag_names":[],"tid":4277697463,"title":"《文周》文艺青年婚礼配乐指南 ","tjreport":""},{"access_num":79804,"album_pic_mid":"003HaCSi4Z4D9X","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1530074928,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/fx76QicKT5fa7gfzOBqCkDIIwDzewZicJVjPDRmIAh8iaBMtMxqEibtlLA/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/fx76QicKT5fa7gfzOBqCkDIIwDzewZicJVjPDRmIAh8iaBMtMxqEibtlLA/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/fx76QicKT5fa7gfzOBqCkDIIwDzewZicJVjPDRmIAh8iaBMtMxqEibtlLA/600?n=1","create_time":1529993988,"creator_info":{"avatar":"","is_dj":0,"nick":"蘑菇爸爸和小乖妈妈","taoge_avatar":"","taoge_nick":"","uin":1302998248,"vip_type":7},"creator_uin":1302998248,"desc":"","dirid":0,"fav_num":0,"modify_time":1541409103,"pic_mid":"003vPScf1knDwy","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[107700131,109333304,7206269,105770459,206965265,7206274,109131617,108079737,7206267,105720840,109394636,212380755,106610456,2650690,108908240,108218116,7206277],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[131,117,165],"tag_names":[],"tid":4180819271,"title":"谁能告诉宝宝\u201c苏格拉有没有底？\u201d","tjreport":""},{"access_num":139131,"album_pic_mid":"","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1478089854,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/AIeG5T519yBnibgbzJnl7dfMyO89qDh8F9fib3dzeF7Y6mmONMm8Srmw/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/AIeG5T519yBnibgbzJnl7dfMyO89qDh8F9fib3dzeF7Y6mmONMm8Srmw/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/AIeG5T519yBnibgbzJnl7dfMyO89qDh8F9fib3dzeF7Y6mmONMm8Srmw/600?n=1","create_time":1477289883,"creator_info":{"avatar":"","is_dj":0,"nick":"诗呓·","taoge_avatar":"","taoge_nick":"","uin":2889221140,"vip_type":2},"creator_uin":2889221140,"desc":"","dirid":0,"fav_num":0,"modify_time":1628097183,"pic_mid":"00109KPl4HpnaT","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[104108749,856696,466519,102666245,1717126,102209988,623925,403333,102794854,103174000,7110243,101816022,107898528,106137152,4792645,5204076,7135317,4993783],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[169,117],"tag_names":[],"tid":840621413,"title":"日系青春｜透着阳光的日系少女音","tjreport":""},{"access_num":49914,"album_pic_mid":"000DOjm53QUiec","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1530842993,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/nnRNzNd5rZaggsDwk2uSnTSznMtC9ZX0vfaDtqXZdkop60DYdToEBQ/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/nnRNzNd5rZaggsDwk2uSnTSznMtC9ZX0vfaDtqXZdkop60DYdToEBQ/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/nnRNzNd5rZaggsDwk2uSnTSznMtC9ZX0vfaDtqXZdkop60DYdToEBQ/600?n=1","create_time":1530772695,"creator_info":{"avatar":"","is_dj":0,"nick":"咔咘咔卟里基德","taoge_avatar":"","taoge_nick":"","uin":3525093560,"vip_type":0},"creator_uin":3525093560,"desc":"","dirid":0,"fav_num":0,"modify_time":1577813248,"pic_mid":"000qpFIg2coDTi","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[107903460,5017518,640746,6403626,213745707,1017568,5453480,107186889,200263584,852209,5294062,4814146,1898849,403919,8164549,5036798,1397331,109131199,107709471,108985962,108492994,1116406,212679976,213248631],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[8,169,117],"tag_names":[],"tid":4195324634,"title":"360°沦陷 · 日本男声R&B鉴赏","tjreport":""},{"access_num":304400,"album_pic_mid":"001el9Oh0et0mT","censor_remark":[],"censor_status":0,"censor_time":0,"commit_time":1492504429,"cover_mid":"","cover_url_big":"http://p.qpic.cn/music_cover/ZicI5yr3C1twqvLJGWqetAa4Yx3t6CZzzYiaKxBKibHuVgL7vZxJT3iayA/600?n=1","cover_url_medium":"http://p.qpic.cn/music_cover/ZicI5yr3C1twqvLJGWqetAa4Yx3t6CZzzYiaKxBKibHuVgL7vZxJT3iayA/600?n=1","cover_url_small":"http://p.qpic.cn/music_cover/ZicI5yr3C1twqvLJGWqetAa4Yx3t6CZzzYiaKxBKibHuVgL7vZxJT3iayA/600?n=1","create_time":1492402170,"creator_info":{"avatar":"","is_dj":0,"nick":"许我半盏清茶","taoge_avatar":"","taoge_nick":"","uin":3549201616,"vip_type":2},"creator_uin":3549201616,"desc":"","dirid":0,"fav_num":0,"modify_time":1656437134,"pic_mid":"003183g61P2Fpf","rcmdcontent":"","rcmdtemplate":"","score":0,"song_ids":[201698289,4958008,688464,108083384,4784620,7781,1799992,102177348,7049788,100396,4826371,703734,994900,97257,97744,169421,703731,126718,4931888,410535,411323,8125549],"song_types":[13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13],"tag_ids":[165,6,117],"tag_names":[],"tid":2661076447,"title":"送你一份永不褪色的纯真","tjreport":""}]
                 */

                private int total;
                private List<VPlaylistBean> v_playlist;

                public int getTotal() {
                    return total;
                }

                public void setTotal(int total) {
                    this.total = total;
                }

                public List<VPlaylistBean> getV_playlist() {
                    return v_playlist;
                }

                public void setV_playlist(List<VPlaylistBean> v_playlist) {
                    this.v_playlist = v_playlist;
                }

                public static class VPlaylistBean {
                    /**
                     * access_num : 19652
                     * album_pic_mid :
                     * censor_remark : []
                     * censor_status : 0
                     * censor_time : 0
                     * commit_time : 1557669163
                     * cover_mid :
                     * cover_url_big : http://p.qpic.cn/music_cover/53Unr0jHFibpmKbAEqvT1Up9FHYm7Q2MotsQbicVBEVrkqClAlWwbn3g/600?n=1
                     * cover_url_medium : http://p.qpic.cn/music_cover/53Unr0jHFibpmKbAEqvT1Up9FHYm7Q2MotsQbicVBEVrkqClAlWwbn3g/600?n=1
                     * cover_url_small : http://p.qpic.cn/music_cover/53Unr0jHFibpmKbAEqvT1Up9FHYm7Q2MotsQbicVBEVrkqClAlWwbn3g/600?n=1
                     * create_time : 1557476696
                     * creator_info : {"avatar":"","is_dj":0,"nick":"李狗蛋","taoge_avatar":"","taoge_nick":"","uin":1602037810,"vip_type":2}
                     * creator_uin : 1602037810
                     * desc :
                     * dirid : 0
                     * fav_num : 0
                     * modify_time : 1592328568
                     * pic_mid :
                     * rcmdcontent :
                     * rcmdtemplate :
                     * score : 0
                     * song_ids : [230950674,224790541,223366731,107279074,212944680,108392963,217159654,1331531,100789085,227936737,105187380,103691041,204470300,4843444,65428,7704217,494412,125224960,6453801,106550160]
                     * song_types : [13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13]
                     * tag_ids : [21,117]
                     * tag_names : []
                     * tid : 6975481262
                     * title : 慵懒爵士 | 清晨被窝的暖时光
                     * tjreport :
                     */

                    private int access_num;
                    private String album_pic_mid;
                    private int censor_status;
                    private int censor_time;
                    private int commit_time;
                    private String cover_mid;
                    private String cover_url_big;
                    private String cover_url_medium;
                    private String cover_url_small;
                    private int create_time;
                    private CreatorInfoBean creator_info;
                    private int creator_uin;
                    private String desc;
                    private int dirid;
                    private int fav_num;
                    private int modify_time;
                    private String pic_mid;
                    private String rcmdcontent;
                    private String rcmdtemplate;
                    private int score;
                    private long tid;
                    private String title;
                    private String tjreport;
                    private List<?> censor_remark;
                    private List<Integer> song_ids;
                    private List<Integer> song_types;
                    private List<Integer> tag_ids;
                    private List<?> tag_names;

                    public int getAccess_num() {
                        return access_num;
                    }

                    public void setAccess_num(int access_num) {
                        this.access_num = access_num;
                    }

                    public String getAlbum_pic_mid() {
                        return album_pic_mid;
                    }

                    public void setAlbum_pic_mid(String album_pic_mid) {
                        this.album_pic_mid = album_pic_mid;
                    }

                    public int getCensor_status() {
                        return censor_status;
                    }

                    public void setCensor_status(int censor_status) {
                        this.censor_status = censor_status;
                    }

                    public int getCensor_time() {
                        return censor_time;
                    }

                    public void setCensor_time(int censor_time) {
                        this.censor_time = censor_time;
                    }

                    public int getCommit_time() {
                        return commit_time;
                    }

                    public void setCommit_time(int commit_time) {
                        this.commit_time = commit_time;
                    }

                    public String getCover_mid() {
                        return cover_mid;
                    }

                    public void setCover_mid(String cover_mid) {
                        this.cover_mid = cover_mid;
                    }

                    public String getCover_url_big() {
                        return cover_url_big;
                    }

                    public void setCover_url_big(String cover_url_big) {
                        this.cover_url_big = cover_url_big;
                    }

                    public String getCover_url_medium() {
                        return cover_url_medium;
                    }

                    public void setCover_url_medium(String cover_url_medium) {
                        this.cover_url_medium = cover_url_medium;
                    }

                    public String getCover_url_small() {
                        return cover_url_small;
                    }

                    public void setCover_url_small(String cover_url_small) {
                        this.cover_url_small = cover_url_small;
                    }

                    public int getCreate_time() {
                        return create_time;
                    }

                    public void setCreate_time(int create_time) {
                        this.create_time = create_time;
                    }

                    public CreatorInfoBean getCreator_info() {
                        return creator_info;
                    }

                    public void setCreator_info(CreatorInfoBean creator_info) {
                        this.creator_info = creator_info;
                    }

                    public int getCreator_uin() {
                        return creator_uin;
                    }

                    public void setCreator_uin(int creator_uin) {
                        this.creator_uin = creator_uin;
                    }

                    public String getDesc() {
                        return desc;
                    }

                    public void setDesc(String desc) {
                        this.desc = desc;
                    }

                    public int getDirid() {
                        return dirid;
                    }

                    public void setDirid(int dirid) {
                        this.dirid = dirid;
                    }

                    public int getFav_num() {
                        return fav_num;
                    }

                    public void setFav_num(int fav_num) {
                        this.fav_num = fav_num;
                    }

                    public int getModify_time() {
                        return modify_time;
                    }

                    public void setModify_time(int modify_time) {
                        this.modify_time = modify_time;
                    }

                    public String getPic_mid() {
                        return pic_mid;
                    }

                    public void setPic_mid(String pic_mid) {
                        this.pic_mid = pic_mid;
                    }

                    public String getRcmdcontent() {
                        return rcmdcontent;
                    }

                    public void setRcmdcontent(String rcmdcontent) {
                        this.rcmdcontent = rcmdcontent;
                    }

                    public String getRcmdtemplate() {
                        return rcmdtemplate;
                    }

                    public void setRcmdtemplate(String rcmdtemplate) {
                        this.rcmdtemplate = rcmdtemplate;
                    }

                    public int getScore() {
                        return score;
                    }

                    public void setScore(int score) {
                        this.score = score;
                    }

                    public long getTid() {
                        return tid;
                    }

                    public void setTid(long tid) {
                        this.tid = tid;
                    }

                    public String getTitle() {
                        return title;
                    }

                    public void setTitle(String title) {
                        this.title = title;
                    }

                    public String getTjreport() {
                        return tjreport;
                    }

                    public void setTjreport(String tjreport) {
                        this.tjreport = tjreport;
                    }

                    public List<?> getCensor_remark() {
                        return censor_remark;
                    }

                    public void setCensor_remark(List<?> censor_remark) {
                        this.censor_remark = censor_remark;
                    }

                    public List<Integer> getSong_ids() {
                        return song_ids;
                    }

                    public void setSong_ids(List<Integer> song_ids) {
                        this.song_ids = song_ids;
                    }

                    public List<Integer> getSong_types() {
                        return song_types;
                    }

                    public void setSong_types(List<Integer> song_types) {
                        this.song_types = song_types;
                    }

                    public List<Integer> getTag_ids() {
                        return tag_ids;
                    }

                    public void setTag_ids(List<Integer> tag_ids) {
                        this.tag_ids = tag_ids;
                    }

                    public List<?> getTag_names() {
                        return tag_names;
                    }

                    public void setTag_names(List<?> tag_names) {
                        this.tag_names = tag_names;
                    }

                    public static class CreatorInfoBean {
                        /**
                         * avatar :
                         * is_dj : 0
                         * nick : 李狗蛋
                         * taoge_avatar :
                         * taoge_nick :
                         * uin : 1602037810
                         * vip_type : 2
                         */

                        private String avatar;
                        private int is_dj;
                        private String nick;
                        private String taoge_avatar;
                        private String taoge_nick;
                        private int uin;
                        private int vip_type;

                        public String getAvatar() {
                            return avatar;
                        }

                        public void setAvatar(String avatar) {
                            this.avatar = avatar;
                        }

                        public int getIs_dj() {
                            return is_dj;
                        }

                        public void setIs_dj(int is_dj) {
                            this.is_dj = is_dj;
                        }

                        public String getNick() {
                            return nick;
                        }

                        public void setNick(String nick) {
                            this.nick = nick;
                        }

                        public String getTaoge_avatar() {
                            return taoge_avatar;
                        }

                        public void setTaoge_avatar(String taoge_avatar) {
                            this.taoge_avatar = taoge_avatar;
                        }

                        public String getTaoge_nick() {
                            return taoge_nick;
                        }

                        public void setTaoge_nick(String taoge_nick) {
                            this.taoge_nick = taoge_nick;
                        }

                        public int getUin() {
                            return uin;
                        }

                        public void setUin(int uin) {
                            this.uin = uin;
                        }

                        public int getVip_type() {
                            return vip_type;
                        }

                        public void setVip_type(int vip_type) {
                            this.vip_type = vip_type;
                        }
                    }
                }
            }
        }

        public static class NewSongBean {
            /**
             * code : 0
             * data : {"lanlist":[{"name":"new_song","lan":"最新","type":5,"tjreport":"10_0_0_1_10001_5"},{"name":"neidi","lan":"内地","type":1,"tjreport":"10_0_0_2_10001_1"},{"name":"gangtai","lan":"港台","type":6,"tjreport":"10_0_0_3_10001_6"},{"name":"oumei","lan":"欧美","type":2,"tjreport":"10_0_0_4_10001_2"},{"name":"hanguo","lan":"韩国","type":4,"tjreport":"10_0_0_5_10001_4"},{"name":"riben","lan":"日本","type":3,"tjreport":"10_0_0_6_10001_3"}],"lan":"最新","songlist":[{"id":398800936,"type":0,"mid":"000zCeON1E0Ybr","name":"爱在时光里","title":"爱在时光里","subtitle":"","singer":[{"id":4449,"mid":"001a1vdk1ZAqmf","name":"苏有朋","title":"苏有朋","type":0,"uin":0,"pmid":""}],"album":{"id":35842789,"mid":"003lEUpK48PbGp","name":"爱在时光里","title":"爱在时光里","subtitle":"","time_public":"2023-03-03","pmid":"003lEUpK48PbGp_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":196,"isonly":0,"language":0,"genre":0,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"000zCeON1E0Ybr","size_24aac":0,"size_48aac":1195048,"size_96aac":2392491,"size_192ogg":4454861,"size_192aac":4753721,"size_128mp3":3147016,"size_320mp3":7867238,"size_ape":0,"size_flac":21579311,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2238786,"size_360ra":[],"size_dolby":0,"size_new":[136260058,21173068,55371673,8277431]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70290951,"mid":"002ilDK20jwnKy"},"volume":{"gain":-8.384,"peak":0.955,"lra":15.364},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["060gvsec3CspML","","","002eNYY21sSwmY","002Bgd722QQjjv"],"vi":[4254103],"ktag":"0"},{"id":398722411,"type":0,"mid":"001TjZmL0XBiH8","name":"蔓延","title":"蔓延","subtitle":"","singer":[{"id":1113420,"mid":"002ykHF42AYnsl","name":"许魏洲","title":"许魏洲","type":0,"uin":0,"pmid":""}],"album":{"id":35829280,"mid":"003tEpkX2i6UZC","name":"蔓延","title":"蔓延","subtitle":"","time_public":"2023-03-03","pmid":"003tEpkX2i6UZC_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":224,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"001TjZmL0XBiH8","size_24aac":0,"size_48aac":1371138,"size_96aac":2740371,"size_192ogg":5336111,"size_192aac":5452315,"size_128mp3":3596728,"size_320mp3":8991521,"size_ape":0,"size_flac":48106707,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2728068,"size_360ra":[],"size_dolby":0,"size_new":[173495552,27458424,69990644,9274764]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70294170,"mid":"000AMVsP0yFERK"},"volume":{"gain":-10.925,"peak":0.978,"lra":4.782},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["060QCwF74S8nID","","","002dosCT2Jbprt","002coEV52jzkhf"],"vi":[89286],"ktag":"0"},{"id":398368264,"type":0,"mid":"002h8Ycn48Q9wG","name":"我有一棵树","title":"我有一棵树","subtitle":"","singer":[{"id":38,"mid":"002seUhN1Akj7J","name":"李圣杰","title":"李圣杰","type":0,"uin":0,"pmid":""}],"album":{"id":35762702,"mid":"001YaXOr4Kv8lt","name":"我有一棵树","title":"我有一棵树","subtitle":"","time_public":"2023-03-03","pmid":"001YaXOr4Kv8lt_2"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":259,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"002h8Ycn48Q9wG","size_24aac":0,"size_48aac":1567273,"size_96aac":3136762,"size_192ogg":6046587,"size_192aac":6240322,"size_128mp3":4149700,"size_320mp3":10373949,"size_ape":0,"size_flac":54541808,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2967014,"size_360ra":[],"size_dolby":0,"size_new":[176442340,26624046,69421213,10836767]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70146744,"mid":"001KOv1B072tAr"},"volume":{"gain":-8.533,"peak":0.995,"lra":15.203},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["063qOou32g0N3R","","","001W2p9q3xirTz","000WZTLy4f8Qeo"],"vi":[3],"ktag":"0"},{"id":397069614,"type":0,"mid":"002pNkfQ0aJg4s","name":"黑色领结 (Nuance) [feat. 陈婧霏]","title":"黑色领结 (Nuance) [feat. 陈婧霏]","subtitle":"","singer":[{"id":365740,"mid":"002HRSkP17GCwL","name":"Alec Benjamin","title":"Alec Benjamin","type":0,"uin":0,"pmid":""},{"id":2095617,"mid":"002a81Ht1RVn1m","name":"陈婧霏","title":"陈婧霏","type":1,"uin":0,"pmid":""}],"album":{"id":35489739,"mid":"0041mvZp0JYleW","name":"黑色领结 (Nuance) [feat. 陈婧霏]","title":"黑色领结 (Nuance) [feat. 陈婧霏]","subtitle":"","time_public":"2023-02-28","pmid":"0041mvZp0JYleW_2"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":172,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-02-28","status":0,"fnote":4009,"file":{"media_mid":"0004IVtH1wfI3Z","size_24aac":0,"size_48aac":1048832,"size_96aac":2100945,"size_192ogg":3573987,"size_192aac":4147303,"size_128mp3":2767191,"size_320mp3":6917526,"size_ape":0,"size_flac":36239374,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":1864253,"size_360ra":[],"size_dolby":0,"size_new":[123809386,18648585,49602332,6436836]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69821294,"mid":"0007PzuF2ujRSH"},"volume":{"gain":-10.023,"peak":1,"lra":9.386},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":1024,"es":"","vs":["063znaET0FpDwP","","","0019eYIV49fYnh","003HbTLX0JtOTj"],"vi":[3],"ktag":"0"},{"id":396246968,"type":0,"mid":"004VylEj2KB1Zq","name":"木曜日のスキャンダル","title":"木曜日のスキャンダル (星期四的绯闻)","subtitle":"","singer":[{"id":181306,"mid":"001lKTAD4MBEMR","name":"HoneyWorks","title":"HoneyWorks","type":2,"uin":0,"pmid":""},{"id":165909,"mid":"004gbK7Y0nL8I8","name":"雨宮天","title":"雨宮天 (あまみや そら)","type":1,"uin":0,"pmid":""}],"album":{"id":35324858,"mid":"0008oj8t2X0cAn","name":"木曜日のスキャンダル","title":"木曜日のスキャンダル","subtitle":"","time_public":"2023-03-02","pmid":"0008oj8t2X0cAn_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":224,"isonly":0,"language":3,"genre":51,"index_cd":0,"index_album":1,"time_public":"2023-03-02","status":0,"fnote":4009,"file":{"media_mid":"004VylEj2KB1Zq","size_24aac":0,"size_48aac":1359561,"size_96aac":2715875,"size_192ogg":5562025,"size_192aac":5398730,"size_128mp3":3600118,"size_320mp3":8999942,"size_ape":0,"size_flac":0,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2696989,"size_360ra":[],"size_dolby":0,"size_new":[178667975,28124381,73584549,9924723]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69881803,"mid":"003WDHTR0eqXYB"},"volume":{"gain":-11.802,"peak":1,"lra":4.182},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["061dZJmy1FIpR1","","","004HzY6j3dPaY8","0049FQLi4Pd1lH"],"vi":[5],"ktag":"0"},{"id":398630701,"type":0,"mid":"000yDpKx3X8B9l","name":"万人之间","title":"万人之间","subtitle":"电视剧《许你万家灯火》主题曲及片尾曲","singer":[{"id":6499,"mid":"002azErJ0UcDN6","name":"张杰","title":"张杰","type":0,"uin":0,"pmid":""}],"album":{"id":35800403,"mid":"000d8x3W1TsLsj","name":"许你万家灯火影视剧原声带","title":"许你万家灯火影视剧原声带","subtitle":"电视剧《许你万家灯火》主题曲及片尾曲","time_public":"2023-03-03","pmid":"000d8x3W1TsLsj_1"},"mv":{"id":2060954,"vid":"000IxrfB4YKiFg","name":"","title":"","vt":0},"interval":240,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"000yDpKx3X8B9l","size_24aac":0,"size_48aac":1469143,"size_96aac":2943520,"size_192ogg":5383759,"size_192aac":5826831,"size_128mp3":3849616,"size_320mp3":9623722,"size_ape":0,"size_flac":49963783,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2680903,"size_360ra":[],"size_dolby":0,"size_new":[163882926,24717481,63937680,9324609]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70294171,"mid":"000Bnudk0qKko5"},"volume":{"gain":-9.851,"peak":0.983,"lra":12.914},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":1024,"es":"","vs":["","","","004ZDYNS0QNAPo","003i0tw32HPFYF"],"vi":[438083],"ktag":"0"},{"id":394122916,"type":0,"mid":"001rq9Gy2RedAc","name":"Tomorrow Never Comes","title":"Tomorrow Never Comes","subtitle":"","singer":[{"id":173914,"mid":"003AD17D4PYPFR","name":"Vicetone","title":"Vicetone","type":2,"uin":3620128193,"pmid":""}],"album":{"id":34963838,"mid":"001GUOmT1Bwuzv","name":"Tomorrow Never Comes","title":"Tomorrow Never Comes","subtitle":"","time_public":"2023-03-03","pmid":"001GUOmT1Bwuzv_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":177,"isonly":0,"language":5,"genre":20,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"001rq9Gy2RedAc","size_24aac":0,"size_48aac":1079418,"size_96aac":2161432,"size_192ogg":4322489,"size_192aac":4299176,"size_128mp3":2840304,"size_320mp3":7100353,"size_ape":0,"size_flac":37733419,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2172833,"size_360ra":[],"size_dolby":0,"size_new":[0,21389088,0,7378436]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70146615,"mid":"002n1ceM0s3VTt"},"volume":{"gain":-10.855,"peak":0.966,"lra":9.553},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":1040,"es":"","vs":["","","","","000lF94f01UOdg"],"vi":[95913],"ktag":"0"},{"id":398689589,"type":0,"mid":"001Ttu6Q0aesVo","name":"Here We Go Again","title":"Here We Go Again","subtitle":"","singer":[{"id":1276259,"mid":"002f6R2U0q4ucd","name":"Oliver Tree","title":"Oliver Tree","type":0,"uin":0,"pmid":""},{"id":965,"mid":"000gELB619OfVG","name":"David Guetta","title":"David Guetta","type":0,"uin":0,"pmid":""}],"album":{"id":35819186,"mid":"001CbYNG2DPisB","name":"Here We Go Again","title":"Here We Go Again","subtitle":"","time_public":"2023-03-03","pmid":"001CbYNG2DPisB_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":164,"isonly":0,"language":5,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"001Ttu6Q0aesVo","size_24aac":0,"size_48aac":999227,"size_96aac":2003154,"size_192ogg":3822612,"size_192aac":3978597,"size_128mp3":2633822,"size_320mp3":6584164,"size_ape":0,"size_flac":21274653,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":1907645,"size_360ra":[],"size_dolby":0,"size_new":[130586294,20143470,52793597,6604476]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16885507,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":0,"mid":""},"volume":{"gain":-10.642,"peak":0.989,"lra":4.524},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["064gY6nU2IgK9T","","","003zmHJZ3U0htx","003YfR2O3pM3gl"],"vi":[3],"ktag":"0"},{"id":395574957,"type":0,"mid":"004Cvqo84DRe4a","name":"灿烂的你","title":"灿烂的你","subtitle":"《不二兄弟》电影片尾曲","singer":[{"id":4605,"mid":"002LJqM93gNF52","name":"弦子","title":"弦子","type":1,"uin":0,"pmid":""}],"album":{"id":35162867,"mid":"002OrLAT3CDo2r","name":"灿烂的你","title":"灿烂的你","subtitle":"《不二兄弟》电影片尾曲","time_public":"2023-03-03","pmid":"002OrLAT3CDo2r_2"},"mv":{"id":2060229,"vid":"002euorE3k6HYo","name":"","title":"","vt":0},"interval":247,"isonly":0,"language":0,"genre":0,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"003FXKA02Cfzww","size_24aac":0,"size_48aac":1507122,"size_96aac":3017497,"size_192ogg":5440704,"size_192aac":5958511,"size_128mp3":3960777,"size_320mp3":9901649,"size_ape":0,"size_flac":47638000,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2719577,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,8853090]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70079065,"mid":"001RpAlL2gLXhg"},"volume":{"gain":-4.472,"peak":0.988,"lra":15.519},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":1024,"es":"","vs":["","","","",""],"vi":[9],"ktag":"0"},{"id":398782831,"type":0,"mid":"002P1RFU0Pe5gM","name":"不要劝我放下","title":"不要劝我放下","subtitle":"","singer":[{"id":11451,"mid":"000b7B7h1fXzaM","name":"苏醒AllenSu","title":"苏醒AllenSu","type":0,"uin":0,"pmid":""}],"album":{"id":35840482,"mid":"003zwqCS2jwBy3","name":"不要劝我放下","title":"不要劝我放下","subtitle":"","time_public":"2023-03-03","pmid":"003zwqCS2jwBy3_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":275,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"002P1RFU0Pe5gM","size_24aac":0,"size_48aac":1674379,"size_96aac":3351428,"size_192ogg":6008153,"size_192aac":6646792,"size_128mp3":4406343,"size_320mp3":11015532,"size_ape":0,"size_flac":54574675,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":3066927,"size_360ra":[],"size_dolby":0,"size_new":[173353699,25775847,67323373,10534143]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70078917,"mid":"004I10y9281P5E"},"volume":{"gain":-5.57,"peak":0.991,"lra":11.59},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":1024,"es":"","vs":["062NTElZ4XRx9i","","","002JeEEQ4KiHwo","003C57J31XtE9n"],"vi":[72064],"ktag":"0"},{"id":398799120,"type":0,"mid":"000TjeTG1pPJCx","name":"春风予你","title":"春风予你","subtitle":"","singer":[{"id":2749932,"mid":"00255EBh1FcAEk","name":"INTO1-刘宇","title":"INTO1-刘宇","type":0,"uin":0,"pmid":""}],"album":{"id":35842562,"mid":"004UhQT03dunra","name":"春风予你","title":"春风予你","subtitle":"","time_public":"2023-03-03","pmid":"004UhQT03dunra_1"},"mv":{"id":2060518,"vid":"002jybGA2xphpr","name":"","title":"","vt":0},"interval":221,"isonly":0,"language":0,"genre":0,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"000TjeTG1pPJCx","size_24aac":0,"size_48aac":1355364,"size_96aac":2719497,"size_192ogg":4885223,"size_192aac":5385340,"size_128mp3":3552443,"size_320mp3":8880795,"size_ape":0,"size_flac":22233556,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2551215,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,8266360]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70146731,"mid":"001jf1vk0q8WkS"},"volume":{"gain":-6.593,"peak":0.944,"lra":11.275},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":1024,"es":"","vs":["0617yttw1jZbHx","","","",""],"vi":[3974908],"ktag":"0"},{"id":398902242,"type":0,"mid":"001Vspul2oiYv8","name":"Red Ruby Da Sleeze","title":"Red Ruby Da Sleeze (Explicit)","subtitle":"","singer":[{"id":20710,"mid":"003kJN1r16tgOt","name":"Nicki Minaj","title":"Nicki Minaj","type":1,"uin":0,"pmid":""}],"album":{"id":35863013,"mid":"0044pGTj43aYDx","name":"Red Ruby Da Sleeze (Explicit)","title":"Red Ruby Da Sleeze (Explicit)","subtitle":"","time_public":"2023-03-03","pmid":"0044pGTj43aYDx_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":214,"isonly":0,"language":5,"genre":34,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"001Vspul2oiYv8","size_24aac":0,"size_48aac":1304155,"size_96aac":2613945,"size_192ogg":5161804,"size_192aac":5180800,"size_128mp3":3432572,"size_320mp3":8580994,"size_ape":0,"size_flac":0,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2552617,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,10512267]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16888579,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70329546,"mid":"004C8kXu3SQXxZ"},"volume":{"gain":-10.567,"peak":1,"lra":2.592},"label":"0","url":"","bpm":0,"version":15,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":1024,"es":"","vs":["","","","",""],"vi":[35],"ktag":"0"},{"id":398889662,"type":0,"mid":"003CAb6J19bEFy","name":"Still Alive","title":"Still Alive (From the Original Motion Picture Scream VI)","subtitle":"《惊声尖叫6》电影插曲","singer":[{"id":13168,"mid":"002G4iB42kFH8t","name":"Demi Lovato","title":"Demi Lovato","type":1,"uin":0,"pmid":""}],"album":{"id":35860522,"mid":"003ghumG2jL0PO","name":"Still Alive (From the Original Motion Picture Scream VI)","title":"Still Alive (From the Original Motion Picture Scream VI)","subtitle":"《惊声尖叫6》电影插曲","time_public":"2023-03-03","pmid":"003ghumG2jL0PO_1"},"mv":{"id":2060943,"vid":"001ke0SS05r3LE","name":"","title":"","vt":0},"interval":185,"isonly":0,"language":5,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"003CAb6J19bEFy","size_24aac":0,"size_48aac":1125829,"size_96aac":2248349,"size_192ogg":4385169,"size_192aac":4472565,"size_128mp3":2966170,"size_320mp3":7414928,"size_ape":0,"size_flac":0,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2186932,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,7929443]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16888579,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70275889,"mid":"002iUg4l06aL5u"},"volume":{"gain":-13.075,"peak":1,"lra":4.384},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["","","","",""],"vi":[35],"ktag":"0"},{"id":398775931,"type":0,"mid":"0001cHd116GHvs","name":"计划重逢","title":"计划重逢","subtitle":"《三国杀》老友季主题曲","singer":[{"id":4990,"mid":"002RDDXV2CJF5l","name":"南拳妈妈","title":"南拳妈妈","type":2,"uin":0,"pmid":""}],"album":{"id":35839147,"mid":"0037zzMN2yn5TX","name":"计划重逢","title":"计划重逢","subtitle":"《三国杀》老友季主题曲","time_public":"2023-03-03","pmid":"0037zzMN2yn5TX_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":206,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"0001cHd116GHvs","size_24aac":0,"size_48aac":1254482,"size_96aac":2509886,"size_192ogg":4842666,"size_192aac":4990130,"size_128mp3":3297062,"size_320mp3":8242355,"size_ape":0,"size_flac":46213845,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2471305,"size_360ra":[],"size_dolby":0,"size_new":[155839310,24770651,62441337,8629663]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70146734,"mid":"001pE4e82voAJw"},"volume":{"gain":-10.079,"peak":1,"lra":3.779},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":2048,"es":"","vs":["","","","0037kbNP211xGS","0032Z2rU41TafY"],"vi":[2817871],"ktag":"0"},{"id":398589105,"type":0,"mid":"004Aht5F47KP5Y","name":"海心沙","title":"海心沙","subtitle":"《黎明觉醒：生机》秀妍-曙光追梦曲","singer":[{"id":2141458,"mid":"000y6SVt4VkAzR","name":"傅菁","title":"傅菁","type":1,"uin":0,"pmid":""},{"id":13038872,"mid":"002AKILB0oo3Gs","name":"黎明觉醒：生机","title":"黎明觉醒：生机","type":3,"uin":0,"pmid":""}],"album":{"id":35795960,"mid":"000QJKw52CoNXx","name":"海心沙","title":"海心沙","subtitle":"《黎明觉醒：生机》秀妍-曙光追梦曲","time_public":"2023-03-03","pmid":"000QJKw52CoNXx_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":233,"isonly":0,"language":0,"genre":0,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"002Y42P439nChA","size_24aac":0,"size_48aac":1416567,"size_96aac":2834740,"size_192ogg":5240111,"size_192aac":5638568,"size_128mp3":3733821,"size_320mp3":9334265,"size_ape":0,"size_flac":46346846,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2706374,"size_360ra":[],"size_dolby":13072181,"size_new":[0,0,0,8869722]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70294163,"mid":"000wnvGD04qsEw"},"volume":{"gain":-9.227,"peak":0.964,"lra":10.968},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":2048,"es":"","vs":["064S0DG2136vYr","","","",""],"vi":[104548],"ktag":"0"},{"id":396628434,"type":0,"mid":"001aoR1n1pg89P","name":"长守岁宴","title":"长守岁宴","subtitle":"","singer":[{"id":947037,"mid":"003jUuqU2AhYos","name":"五音Jw","title":"五音Jw","type":0,"uin":0,"pmid":""}],"album":{"id":35393528,"mid":"003FJQl61y5C3V","name":"长守岁宴 (广播剧《琢玉》主题曲)","title":"长守岁宴 (广播剧《琢玉》主题曲)","subtitle":"","time_public":"2023-03-03","pmid":"003FJQl61y5C3V_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":248,"isonly":0,"language":0,"genre":37,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"001aoR1n1pg89P","size_24aac":0,"size_48aac":1514055,"size_96aac":3039191,"size_192ogg":5355129,"size_192aac":6020704,"size_128mp3":3969166,"size_320mp3":9922577,"size_ape":0,"size_flac":25737529,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2758684,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,9608739]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70294165,"mid":"002Kf17B4Ojah9"},"volume":{"gain":-7.835,"peak":1,"lra":13.487},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["","","","",""],"vi":[3997],"ktag":"0"},{"id":396247057,"type":0,"mid":"003VyHHq0MTqdq","name":"crossovers","title":"crossovers","subtitle":"日本竞马协会宣传片主题曲","singer":[{"id":33716,"mid":"0039EKtl4ec7wv","name":"Aimer","title":"Aimer (エメ)","type":1,"uin":0,"pmid":""}],"album":{"id":35324874,"mid":"002xsaRF4IlqUE","name":"escalate (Special Edition)","title":"escalate (Special Edition)","subtitle":"日本竞马协会宣传片主题曲","time_public":"2023-03-01","pmid":"002xsaRF4IlqUE_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":286,"isonly":0,"language":3,"genre":1,"index_cd":0,"index_album":3,"time_public":"2023-03-01","status":0,"fnote":4009,"file":{"media_mid":"003VyHHq0MTqdq","size_24aac":0,"size_48aac":1721296,"size_96aac":3442903,"size_192ogg":6576713,"size_192aac":6825818,"size_128mp3":4583598,"size_320mp3":11458609,"size_ape":0,"size_flac":0,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":3323138,"size_360ra":[],"size_dolby":0,"size_new":[206103135,32044562,83446338,11671580]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69685583,"mid":"002jcKXw1yqMPu"},"volume":{"gain":-10.482,"peak":1,"lra":7.446},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":17408,"es":"","vs":["062dJ32W2uPk7T","","","003KpFd633y4Ac","000x6kCT31UZqx"],"vi":[5],"ktag":"0"},{"id":398613214,"type":0,"mid":"002ixJD43B8oyj","name":"携长风予你","title":"携长风予你","subtitle":"未成年人检察主题曲","singer":[{"id":5979,"mid":"000we89k1hzBcA","name":"谭维维","title":"谭维维","type":1,"uin":0,"pmid":""}],"album":{"id":35799093,"mid":"002r5IIt1Uflfx","name":"携长风予你","title":"携长风予你","subtitle":"未成年人检察主题曲","time_public":"2023-03-02","pmid":"002r5IIt1Uflfx_1"},"mv":{"id":2060300,"vid":"002tOl7C03P8sw","name":"","title":"","vt":0},"interval":242,"isonly":0,"language":0,"genre":0,"index_cd":0,"index_album":1,"time_public":"2023-03-02","status":0,"fnote":4009,"file":{"media_mid":"002ixJD43B8oyj","size_24aac":0,"size_48aac":1475148,"size_96aac":2956188,"size_192ogg":5438071,"size_192aac":5842808,"size_128mp3":3876355,"size_320mp3":9690585,"size_ape":0,"size_flac":27027423,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2741563,"size_360ra":[],"size_dolby":0,"size_new":[0,25832627,67510014,9507156]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69992629,"mid":"002d4vsy2z4ANC"},"volume":{"gain":-7.104,"peak":1,"lra":9.837},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":17408,"es":"","vs":["0603xOHG0HnFy5","","","","002cQJKm3RavbQ"],"vi":[104548],"ktag":"0"},{"id":398181362,"type":0,"mid":"001rXSzk0PbKu8","name":"就这样长大","title":"就这样长大","subtitle":"","singer":[{"id":8355199,"mid":"000ezRzE1d5zBZ","name":"INTO1","title":"INTO1","type":2,"uin":0,"pmid":""}],"album":{"id":35724639,"mid":"000subKZ0ZLglo","name":"就这样长大\u2014\u2014INTO1'S WONDERLAND结","title":"就这样长大\u2014\u2014INTO1'S WONDERLAND结","subtitle":"","time_public":"2023-03-01","pmid":"000subKZ0ZLglo_2"},"mv":{"id":2060288,"vid":"000ZPH0M0fDUIi","name":"","title":"","vt":0},"interval":271,"isonly":0,"language":0,"genre":0,"index_cd":0,"index_album":1,"time_public":"2023-03-01","status":0,"fnote":4009,"file":{"media_mid":"001rXSzk0PbKu8","size_24aac":0,"size_48aac":1654697,"size_96aac":3310080,"size_192ogg":6751413,"size_192aac":6583395,"size_128mp3":4346605,"size_320mp3":10865801,"size_ape":0,"size_flac":60747036,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":3258514,"size_360ra":[],"size_dolby":0,"size_new":[201002168,31040798,78971327,11887111]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69797605,"mid":"004ga7nY2XYUQO"},"volume":{"gain":-9.758,"peak":1,"lra":6.666},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":17408,"es":"","vs":["","","","002Zztfs4AOt0C","001d2tB2269ctP"],"vi":[101521],"ktag":"0"},{"id":398282803,"type":0,"mid":"001e29BB2YSY2T","name":"雪 Distance","title":"雪 Distance","subtitle":"","singer":[{"id":2085196,"mid":"001eBoUt4SiKgg","name":"Capper","title":"Capper","type":0,"uin":0,"pmid":""},{"id":10783027,"mid":"002UCgsA0F2VHh","name":"罗言RollFlash","title":"罗言RollFlash","type":0,"uin":0,"pmid":""}],"album":{"id":35749818,"mid":"000t9S9F0dXtUA","name":"Uniconfication (Explicit)","title":"Uniconfication (Explicit)","subtitle":"","time_public":"2023-03-01","pmid":"000t9S9F0dXtUA_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":165,"isonly":0,"language":0,"genre":34,"index_cd":0,"index_album":11,"time_public":"2023-03-01","status":0,"fnote":4009,"file":{"media_mid":"001e29BB2YSY2T","size_24aac":0,"size_48aac":1011643,"size_96aac":2026742,"size_192ogg":4002155,"size_192aac":4025937,"size_128mp3":2657224,"size_320mp3":6642443,"size_ape":0,"size_flac":18274248,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2015419,"size_360ra":[],"size_dolby":0,"size_new":[115408947,17371207,45869585,7731593]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69685586,"mid":"000HAaVt0uuP0a"},"volume":{"gain":-9.162,"peak":0.975,"lra":5.773},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":16384,"es":"","vs":["","","","003YClkj1UObLr","000aZDMX0a4kiN"],"vi":[3997],"ktag":"0"},{"id":398768098,"type":0,"mid":"000amMJF06VXmc","name":"伤心太平洋","title":"伤心太平洋 (Live)","subtitle":"","singer":[{"id":62,"mid":"002cENGP2BtEVR","name":"任贤齐","title":"任贤齐","type":0,"uin":0,"pmid":""}],"album":{"id":35838491,"mid":"003OXczS1tvW9d","name":"百川乐时空","title":"百川乐时空","subtitle":"","time_public":"2023-03-03","pmid":"003OXczS1tvW9d_2"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":192,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"000amMJF06VXmc","size_24aac":0,"size_48aac":1181522,"size_96aac":2368361,"size_192ogg":4083924,"size_192aac":4675661,"size_128mp3":3084322,"size_320mp3":7710504,"size_ape":0,"size_flac":37719615,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2145747,"size_360ra":[],"size_dolby":0,"size_new":[127440828,0,0,6713700]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70315508,"mid":"003AL5k72YXCGL"},"volume":{"gain":-5.404,"peak":1,"lra":6.421},"label":"0","url":"","bpm":0,"version":3,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":1024,"es":"","vs":["060QpXkO0a26BL","","","004dPSYU1LgWhG",""],"vi":[91923],"ktag":"0"},{"id":398768093,"type":0,"mid":"004JMzYH13AiAv","name":"等待","title":"等待 (Live)","subtitle":"","singer":[{"id":210,"mid":"001nMsEp1RMsiO","name":"黄绮珊","title":"黄绮珊","type":1,"uin":0,"pmid":""}],"album":{"id":35838491,"mid":"003OXczS1tvW9d","name":"百川乐时空","title":"百川乐时空","subtitle":"","time_public":"2023-03-03","pmid":"003OXczS1tvW9d_2"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":311,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":3,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"004JMzYH13AiAv","size_24aac":0,"size_48aac":1906359,"size_96aac":3811134,"size_192ogg":6118493,"size_192aac":7522921,"size_128mp3":4987703,"size_320mp3":12468963,"size_ape":0,"size_flac":55577933,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":3324606,"size_360ra":[],"size_dolby":0,"size_new":[175293669,0,0,9876204]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70315362,"mid":"0038fr1b0Rit7Q"},"volume":{"gain":-7.19,"peak":1,"lra":20.129},"label":"0","url":"","bpm":0,"version":3,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":1024,"es":"","vs":["062Qjr2G2RKRJ2","","","000yVk3x2g8xsr",""],"vi":[91923],"ktag":"0"},{"id":398768091,"type":0,"mid":"002OZq8N39Zs2M","name":"约定","title":"约定 (Live)","subtitle":"","singer":[{"id":5116,"mid":"002wKZIw1fcghM","name":"周蕙","title":"周蕙","type":1,"uin":0,"pmid":""}],"album":{"id":35838491,"mid":"003OXczS1tvW9d","name":"百川乐时空","title":"百川乐时空","subtitle":"","time_public":"2023-03-03","pmid":"003OXczS1tvW9d_2"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":261,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":4,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"002OZq8N39Zs2M","size_24aac":0,"size_48aac":1593250,"size_96aac":3195427,"size_192ogg":5807133,"size_192aac":6284456,"size_128mp3":4180621,"size_320mp3":10450864,"size_ape":0,"size_flac":50761476,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2978621,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,9760183]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70314658,"mid":"000wLIfN4G9PJ8"},"volume":{"gain":-4.015,"peak":1,"lra":11.993},"label":"0","url":"","bpm":0,"version":3,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":1024,"es":"","vs":["060ze7Q047FZES","","","",""],"vi":[91923],"ktag":"0"},{"id":398363729,"type":0,"mid":"003yddlE2Z0TsO","name":"Insanity","title":"Insanity","subtitle":"","singer":[{"id":972981,"mid":"0020hNzE3kGP45","name":"ILLENIUM","title":"ILLENIUM","type":0,"uin":0,"pmid":""},{"id":6518627,"mid":"0005IrML1qGD2Z","name":"American Teeth","title":"American Teeth","type":0,"uin":0,"pmid":""}],"album":{"id":35761315,"mid":"0041dlcg0MinSa","name":"Insanity","title":"Insanity","subtitle":"","time_public":"2023-03-03","pmid":"0041dlcg0MinSa_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":183,"isonly":0,"language":5,"genre":20,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"003m83aC0p7FWX","size_24aac":0,"size_48aac":1116105,"size_96aac":2232450,"size_192ogg":4449050,"size_192aac":4445028,"size_128mp3":2931371,"size_320mp3":7328093,"size_ape":0,"size_flac":41474881,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2208912,"size_360ra":[],"size_dolby":10262441,"size_new":[0,22109595,56606735,7753191]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70146715,"mid":"004XxMxI17vByO"},"volume":{"gain":-11.908,"peak":1,"lra":7.468},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["062Qh9PN2dCTxl","","","","0026dZqM3fWeL4"],"vi":[3],"ktag":"0"},{"id":398287569,"type":0,"mid":"004TfKLW0d3JcC","name":"El Merengue","title":"El Merengue","subtitle":"","singer":[{"id":1104128,"mid":"003T09nh37Pq4N","name":"Marshmello","title":"Marshmello","type":0,"uin":0,"pmid":""},{"id":1465848,"mid":"0016E6af0HmWeC","name":"Manuel Turizo","title":"Manuel Turizo","type":0,"uin":0,"pmid":""}],"album":{"id":35750413,"mid":"000jmSpv0zbi4M","name":"El Merengue","title":"El Merengue","subtitle":"","time_public":"2023-03-03","pmid":"000jmSpv0zbi4M_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":189,"isonly":0,"language":16,"genre":27,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"004TfKLW0d3JcC","size_24aac":0,"size_48aac":1158043,"size_96aac":2320909,"size_192ogg":4414305,"size_192aac":4601096,"size_128mp3":3035877,"size_320mp3":7588541,"size_ape":0,"size_flac":0,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2206463,"size_360ra":[],"size_dolby":0,"size_new":[0,21834730,57678992,8188893]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70146718,"mid":"001bJ0wT4DbXmq"},"volume":{"gain":-9.588,"peak":1,"lra":6.132},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["0633a7pV2C53N7","","","","002xxYaI1F49e3"],"vi":[5],"ktag":"0"},{"id":398888603,"type":0,"mid":"002JYbrk3ZiQTh","name":"After Hours","title":"After Hours (Live|Explicit)","subtitle":"","singer":[{"id":32617,"mid":"004YnseG2vQN7h","name":"The Weeknd","title":"The Weeknd","type":0,"uin":0,"pmid":""}],"album":{"id":35860344,"mid":"001xhhkB3Thfx9","name":"After Hours (Live At SoFi Stadium) [Explicit]","title":"After Hours (Live At SoFi Stadium) [Explicit]","subtitle":"","time_public":"2023-03-03","pmid":"001xhhkB3Thfx9_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":267,"isonly":0,"language":5,"genre":33,"index_cd":0,"index_album":19,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"002JYbrk3ZiQTh","size_24aac":0,"size_48aac":1632801,"size_96aac":3256967,"size_192ogg":6462495,"size_192aac":6484880,"size_128mp3":4288151,"size_320mp3":10719916,"size_ape":0,"size_flac":0,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":3153408,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,11204211]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16888579,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70273122,"mid":"000vZfgN1Jc355"},"volume":{"gain":-6.203,"peak":1,"lra":7.997},"label":"0","url":"","bpm":0,"version":3,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["","","","",""],"vi":[35],"ktag":"0"},{"id":398525389,"type":0,"mid":"002DMEMr3eAhOa","name":"Flowers","title":"Flowers (Demo)","subtitle":"","singer":[{"id":11672,"mid":"0037uV5A4O7UGj","name":"Miley Cyrus","title":"Miley Cyrus","type":1,"uin":0,"pmid":""}],"album":{"id":35785165,"mid":"001oCWGM1oxA20","name":"Flowers (Demo)","title":"Flowers (Demo)","subtitle":"","time_public":"2023-03-03","pmid":"001oCWGM1oxA20_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":210,"isonly":0,"language":5,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"002DMEMr3eAhOa","size_24aac":0,"size_48aac":1285887,"size_96aac":2576126,"size_192ogg":3980908,"size_192aac":5105706,"size_128mp3":3374424,"size_320mp3":8435701,"size_ape":0,"size_flac":0,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2118164,"size_360ra":[],"size_dolby":0,"size_new":[132651978,17980314,48160251,6778454]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70146745,"mid":"004RpSeJ21PfBy"},"volume":{"gain":-7.558,"peak":1,"lra":11.141},"label":"0","url":"","bpm":0,"version":5,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["063eOKOG12wMhk","","","001GN8pl0D5bEC","000C3XQc0vlE0p"],"vi":[5],"ktag":"0"},{"id":398738782,"type":0,"mid":"002OOOko0Dm75S","name":"꽃 (Flower)","title":"꽃 (Flower) (花)","subtitle":"《原来这就是爱啊》韩剧插曲","singer":[{"id":72221,"mid":"002GrZmi0rYeZS","name":"Roy Kim","title":"Roy Kim (로이킴)","type":0,"uin":0,"pmid":""}],"album":{"id":35834241,"mid":"002OCLI13W5F7u","name":"사랑이라 말해요 OST Part 2 (Call It Love, Part 2 (Original Soundtrack from the Disney+ Original Series))","title":"사랑이라 말해요 OST Part 2 (Call It Love, Part 2 (Original Soundtrack from the Disney+ Original Series)) (原来这就是爱啊 OST Part 2)","subtitle":"《原来这就是爱啊》韩剧插曲","time_public":"2023-03-02","pmid":"002OCLI13W5F7u_1"},"mv":{"id":2060417,"vid":"003rXfQk4gcuXb","name":"","title":"","vt":0},"interval":218,"isonly":0,"language":4,"genre":23,"index_cd":0,"index_album":1,"time_public":"2023-03-02","status":0,"fnote":4009,"file":{"media_mid":"002OOOko0Dm75S","size_24aac":0,"size_48aac":1329000,"size_96aac":2657628,"size_192ogg":4562233,"size_192aac":5265529,"size_128mp3":3492033,"size_320mp3":8729479,"size_ape":0,"size_flac":44998012,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2297737,"size_360ra":[],"size_dolby":0,"size_new":[0,22015248,58772669,8158372]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70028189,"mid":"000VKYaD0pHzik"},"volume":{"gain":-8.594,"peak":1,"lra":12.815},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["","","","","002JFP3i4IrJHK"],"vi":[101547],"ktag":"0"},{"id":397692946,"type":0,"mid":"002Q05zI0dI1zl","name":"My Stupid Heart (with Lauv)","title":"My Stupid Heart (with Lauv)","subtitle":"","singer":[{"id":42956,"mid":"002RXUq04F4DHF","name":"Walk Off the Earth","title":"Walk Off the Earth","type":2,"uin":0,"pmid":""},{"id":963672,"mid":"004XSOkU0yCLih","name":"Lauv","title":"Lauv","type":0,"uin":0,"pmid":""}],"album":{"id":35623261,"mid":"0005znbt29N7gg","name":"My Stupid Heart (with Lauv)","title":"My Stupid Heart (with Lauv)","subtitle":"","time_public":"2023-03-03","pmid":"0005znbt29N7gg_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":160,"isonly":0,"language":5,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"002Q05zI0dI1zl","size_24aac":0,"size_48aac":982547,"size_96aac":1963488,"size_192ogg":3840406,"size_192aac":3901446,"size_128mp3":2575366,"size_320mp3":6437936,"size_ape":0,"size_flac":34933235,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":1996053,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,6951840]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70146695,"mid":"001NGrcr023VkZ"},"volume":{"gain":-7.703,"peak":0.905,"lra":3.864},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["064BzU4r3ytkJu","","","",""],"vi":[5],"ktag":"0"},{"id":398365623,"type":0,"mid":"000YUm1r3PFaRN","name":"Raincatchers","title":"Raincatchers","subtitle":"","singer":[{"id":26260,"mid":"0023z2Ce3IbpRN","name":"Birdy","title":"Birdy","type":1,"uin":0,"pmid":""}],"album":{"id":35762071,"mid":"002md4Cf4QWBtV","name":"Raincatchers","title":"Raincatchers","subtitle":"","time_public":"2023-03-03","pmid":"002md4Cf4QWBtV_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":239,"isonly":0,"language":5,"genre":50,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"000YUm1r3PFaRN","size_24aac":0,"size_48aac":1465616,"size_96aac":2926869,"size_192ogg":5519967,"size_192aac":5803171,"size_128mp3":3834173,"size_320mp3":9585083,"size_ape":0,"size_flac":52382271,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2845171,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,9781784]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16885507,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":0,"mid":""},"volume":{"gain":-10.873,"peak":0.989,"lra":8.849},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["061LFhmm18l4Ee","","","",""],"vi":[3],"ktag":"0"},{"id":397859814,"type":0,"mid":"002XKmgI1PKvDP","name":"憂い桜","title":"憂い桜 (忧郁樱花)","subtitle":"","singer":[{"id":8143202,"mid":"0041TqIv2h9u0g","name":"あたらよ","title":"あたらよ","type":2,"uin":0,"pmid":""}],"album":{"id":35658104,"mid":"0020UMgT36maVS","name":"憂い桜","title":"憂い桜 (忧郁樱花)","subtitle":"","time_public":"2023-03-03","pmid":"0020UMgT36maVS_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":275,"isonly":0,"language":3,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"002XKmgI1PKvDP","size_24aac":0,"size_48aac":1676921,"size_96aac":3352329,"size_192ogg":6351523,"size_192aac":6650654,"size_128mp3":4416770,"size_320mp3":11041632,"size_ape":0,"size_flac":29467584,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":3206935,"size_360ra":[],"size_dolby":0,"size_new":[186812226,29642956,75938357,10719515]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16885507,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":0,"mid":""},"volume":{"gain":-9.777,"peak":0.966,"lra":11.849},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["","","","001NNRy50mjGEK","0000IO1a3mioS4"],"vi":[11],"ktag":"0"},{"id":398277518,"type":0,"mid":"001ubWET2piC6m","name":"Mexico","title":"Mexico","subtitle":"","singer":[{"id":154298,"mid":"001StFWT4VdjQJ","name":"Dimitri Vegas & Like Mike","title":"Dimitri Vegas & Like Mike","type":2,"uin":0,"pmid":""},{"id":7144,"mid":"000AIwoO1CXHCg","name":"Ne-Yo","title":"Ne-Yo","type":0,"uin":0,"pmid":""},{"id":27455,"mid":"001RHfjp17xNKA","name":"Danna Paola","title":"Danna Paola","type":1,"uin":0,"pmid":""}],"album":{"id":35749173,"mid":"00413iwO2RkNJL","name":"Mexico","title":"Mexico","subtitle":"","time_public":"2023-03-03","pmid":"00413iwO2RkNJL_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":153,"isonly":0,"language":5,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"001ubWET2piC6m","size_24aac":0,"size_48aac":931721,"size_96aac":1862731,"size_192ogg":3772855,"size_192aac":3708603,"size_128mp3":2451162,"size_320mp3":6127531,"size_ape":0,"size_flac":19351426,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":1878835,"size_360ra":[],"size_dolby":0,"size_new":[0,18403485,47688026,6995655]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16885507,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":0,"mid":""},"volume":{"gain":-9.107,"peak":0.977,"lra":6.031},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":16,"es":"","vs":["","","","","0006W36B1yh2BT"],"vi":[93059],"ktag":"0"},{"id":393841011,"type":0,"mid":"0027OZjn1HJS63","name":"Wussy Man (Earth Defense Force)","title":"Wussy Man (Earth Defense Force)","subtitle":"","singer":[{"id":2200016,"mid":"004CljTy1k6QJ3","name":"CHROMANCE","title":"CHROMANCE","type":0,"uin":0,"pmid":""},{"id":8083739,"mid":"000e4Toj2Fx7oF","name":"Emetsound","title":"Emetsound","type":0,"uin":0,"pmid":""}],"album":{"id":34908068,"mid":"003XDkUO10ktFX","name":"Wussy Man (Earth Defense Force)","title":"Wussy Man (Earth Defense Force)","subtitle":"","time_public":"2023-03-03","pmid":"003XDkUO10ktFX_4"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":134,"isonly":0,"language":5,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"001wAnwD3qu6kb","size_24aac":0,"size_48aac":817529,"size_96aac":1635483,"size_192ogg":3489618,"size_192aac":3246239,"size_128mp3":2145702,"size_320mp3":5363779,"size_ape":0,"size_flac":29374469,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":1639685,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,5972013]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16885507,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":0,"mid":""},"volume":{"gain":-11.05,"peak":0.988,"lra":2.683},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["064V9PhM1IizYu","","","",""],"vi":[5],"ktag":"0"},{"id":397867719,"type":0,"mid":"000gV71v19IzGz","name":"Designer (feat. Joeboy)","title":"Designer (feat. Joeboy) (Explicit)","subtitle":"","singer":[{"id":38150,"mid":"001J99OK2689F4","name":"Major Lazer","title":"Major Lazer","type":2,"uin":0,"pmid":""},{"id":2057505,"mid":"002zFQ740fJkyu","name":"Major League Djz","title":"Major League Djz","type":0,"uin":0,"pmid":""},{"id":3310142,"mid":"000wy2Qh3jzUUr","name":"Joeboy","title":"Joeboy","type":0,"uin":0,"pmid":""}],"album":{"id":35659679,"mid":"001kypPn1TLmzU","name":"Designer (feat. Joeboy) [Explicit]","title":"Designer (feat. Joeboy) [Explicit]","subtitle":"","time_public":"2023-03-03","pmid":"001kypPn1TLmzU_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":199,"isonly":0,"language":7,"genre":22,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"000gV71v19IzGz","size_24aac":0,"size_48aac":1219870,"size_96aac":2440671,"size_192ogg":4588723,"size_192aac":4844631,"size_128mp3":3195610,"size_320mp3":7988557,"size_ape":0,"size_flac":26106460,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2323311,"size_360ra":[],"size_dolby":0,"size_new":[162802184,26025730,65799689,8744992]},"pay":{"pay_month":1,"price_track":0,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":108291,"msgid":14,"alert":2,"icons":8404860,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":0,"mid":""},"volume":{"gain":-9.687,"peak":1,"lra":3.479},"label":"0","url":"","bpm":0,"version":15,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["","","","002BqpQB3CiwGQ","001waVHA3GYmgg"],"vi":[101433],"ktag":"0"},{"id":398363653,"type":0,"mid":"001UFymK0uhuy0","name":"Paris To Berlin","title":"Paris To Berlin","subtitle":"","singer":[{"id":83305,"mid":"000talWb36EFfh","name":"Mike Williams","title":"Mike Williams","type":0,"uin":0,"pmid":""}],"album":{"id":35761294,"mid":"003f2Org3YjXlZ","name":"Paris To Berlin","title":"Paris To Berlin","subtitle":"","time_public":"2023-03-03","pmid":"003f2Org3YjXlZ_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":144,"isonly":0,"language":5,"genre":20,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"001UFymK0uhuy0","size_24aac":0,"size_48aac":881898,"size_96aac":1758082,"size_192ogg":3520743,"size_192aac":3487885,"size_128mp3":2311158,"size_320mp3":5777503,"size_ape":0,"size_flac":18814234,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":1806045,"size_360ra":[],"size_dolby":0,"size_new":[117675157,18462073,47452205,6214615]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16885507,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":0,"mid":""},"volume":{"gain":-11.315,"peak":1,"lra":3.374},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":16,"es":"","vs":["060njkNF083UaB","","","003T7P9Y3R2ldz","002JV4rA3ZzVpM"],"vi":[3],"ktag":"0"},{"id":398360724,"type":0,"mid":"003xOMTY0PVC4s","name":"A Place In The Dark","title":"A Place In The Dark","subtitle":"","singer":[{"id":63722,"mid":"00420lwO1IOHVx","name":"Klaas","title":"Klaas","type":0,"uin":0,"pmid":""},{"id":945663,"mid":"001WCnY04AkBeu","name":"Gry","title":"Gry","type":0,"uin":0,"pmid":""}],"album":{"id":35760528,"mid":"003kYYTL1FpkbL","name":"A Place In The Dark","title":"A Place In The Dark","subtitle":"","time_public":"2023-03-03","pmid":"003kYYTL1FpkbL_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":159,"isonly":0,"language":5,"genre":20,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"003xOMTY0PVC4s","size_24aac":0,"size_48aac":972118,"size_96aac":1938407,"size_192ogg":3894554,"size_192aac":3864921,"size_128mp3":2554410,"size_320mp3":6385633,"size_ape":0,"size_flac":20081457,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":1972652,"size_360ra":[],"size_dolby":0,"size_new":[124931859,19766767,50762909,6853270]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16885507,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":0,"mid":""},"volume":{"gain":-9.721,"peak":1,"lra":6.157},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["062YKamM3o9saG","","","0021IPta2ZeJ0z","004L8eHq3NgxQv"],"vi":[3],"ktag":"0"},{"id":394400404,"type":0,"mid":"000byf9D3tuzN7","name":"Sloopkogel","title":"Sloopkogel","subtitle":"","singer":[{"id":22045,"mid":"002xao6L3n9l4w","name":"Hardwell","title":"Hardwell","type":0,"uin":0,"pmid":""},{"id":53602,"mid":"001LLV184Lfy7Z","name":"Quintino","title":"Quintino","type":0,"uin":0,"pmid":""}],"album":{"id":35030890,"mid":"001fiCqX46SMaq","name":"Sloopkogel","title":"Sloopkogel","subtitle":"","time_public":"2023-03-03","pmid":"001fiCqX46SMaq_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":185,"isonly":0,"language":5,"genre":20,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"000byf9D3tuzN7","size_24aac":0,"size_48aac":1128487,"size_96aac":2253022,"size_192ogg":4815075,"size_192aac":4487553,"size_128mp3":2968578,"size_320mp3":7421097,"size_ape":0,"size_flac":39817005,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2323352,"size_360ra":[],"size_dolby":0,"size_new":[143970307,22860397,0,8384695]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16885507,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":0,"mid":""},"volume":{"gain":-9.546,"peak":0.89,"lra":11.518},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":16,"es":"","vs":["","","","001miWpK0eq577","001KLYzY0HcaED"],"vi":[95913],"ktag":"0"},{"id":398891319,"type":0,"mid":"002psdAP46KmLD","name":"Can't Do Both","title":"Can't Do Both","subtitle":"","singer":[{"id":2266005,"mid":"0025OH8q3CEb5d","name":"Jonasu","title":"Jonasu","type":0,"uin":0,"pmid":""},{"id":1200465,"mid":"003vAUO82i2wby","name":"Clara Mae","title":"Clara Mae","type":1,"uin":0,"pmid":""}],"album":{"id":35860849,"mid":"000LTSYQ061ddY","name":"Can't Do Both","title":"Can't Do Both","subtitle":"","time_public":"2023-03-03","pmid":"000LTSYQ061ddY_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":177,"isonly":0,"language":5,"genre":20,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"002psdAP46KmLD","size_24aac":0,"size_48aac":1082703,"size_96aac":2167297,"size_192ogg":4124058,"size_192aac":4292893,"size_128mp3":2838600,"size_320mp3":7096142,"size_ape":0,"size_flac":0,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2061452,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,7385033]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16884483,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":0,"mid":""},"volume":{"gain":-9.645,"peak":1,"lra":6.665},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["","","","",""],"vi":[35],"ktag":"0"},{"id":398716735,"type":0,"mid":"001azdxb36ViKj","name":"뱅 (Bang)!","title":"뱅 (Bang)!","subtitle":"","singer":[{"id":13146980,"mid":"003zX2kU03k74K","name":"팀 8시 (TEAM 8:00)","title":"팀 8시 (TEAM 8:00)","type":2,"uin":0,"pmid":""}],"album":{"id":35828050,"mid":"000CI9em1G7eZM","name":"PEAK TIME - 1Round <Rival match> Part.2","title":"PEAK TIME - 1Round <Rival match> Part.2","subtitle":"","time_public":"2023-03-02","pmid":"000CI9em1G7eZM_1"},"mv":{"id":2060397,"vid":"002xJDCN1ewS3A","name":"","title":"","vt":0},"interval":145,"isonly":0,"language":4,"genre":20,"index_cd":0,"index_album":1,"time_public":"2023-03-02","status":0,"fnote":4009,"file":{"media_mid":"001azdxb36ViKj","size_24aac":0,"size_48aac":883140,"size_96aac":1762178,"size_192ogg":3614521,"size_192aac":3508327,"size_128mp3":2324575,"size_320mp3":5810981,"size_ape":0,"size_flac":32705401,"size_dts":0,"size_try":481070,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":30000,"size_96ogg":1881540,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,6829782]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70002026,"mid":"0004l7Uq1wy8pI"},"volume":{"gain":-11.137,"peak":1,"lra":5.226},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["063AeYyb3vx3On","","","",""],"vi":[36620],"ktag":"0"},{"id":398716736,"type":0,"mid":"004V5gut33f0QF","name":"You Are","title":"You Are","subtitle":"","singer":[{"id":13146991,"mid":"002JPEIx3ktjYD","name":"팀 7시 (TEAM 7:00)","title":"팀 7시 (TEAM 7:00)","type":2,"uin":0,"pmid":""}],"album":{"id":35828050,"mid":"000CI9em1G7eZM","name":"PEAK TIME - 1Round <Rival match> Part.2","title":"PEAK TIME - 1Round <Rival match> Part.2","subtitle":"","time_public":"2023-03-02","pmid":"000CI9em1G7eZM_1"},"mv":{"id":2060394,"vid":"002ySDkT05TFPG","name":"","title":"","vt":0},"interval":176,"isonly":0,"language":4,"genre":20,"index_cd":0,"index_album":2,"time_public":"2023-03-02","status":0,"fnote":4009,"file":{"media_mid":"004V5gut33f0QF","size_24aac":0,"size_48aac":1077447,"size_96aac":2151014,"size_192ogg":4378981,"size_192aac":4282742,"size_128mp3":2829465,"size_320mp3":7073214,"size_ape":0,"size_flac":42864945,"size_dts":0,"size_try":481070,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":30000,"size_96ogg":2142052,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,7901684]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70001988,"mid":"0017WLnz1vWX4G"},"volume":{"gain":-11.004,"peak":1,"lra":4.347},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["062OdCoG4PmiW2","","","",""],"vi":[36620],"ktag":"0"},{"id":398716734,"type":0,"mid":"002ny3Ky3rdAU0","name":"12시30분 (12:30)","title":"12시30분 (12:30)","subtitle":"","singer":[{"id":13147008,"mid":"002p7mKg395L4y","name":"팀 15시 (TEAM 15:00)","title":"팀 15시 (TEAM 15:00)","type":2,"uin":0,"pmid":""}],"album":{"id":35828050,"mid":"000CI9em1G7eZM","name":"PEAK TIME - 1Round <Rival match> Part.2","title":"PEAK TIME - 1Round <Rival match> Part.2","subtitle":"","time_public":"2023-03-02","pmid":"000CI9em1G7eZM_1"},"mv":{"id":2060393,"vid":"003W9edE4JsnCg","name":"","title":"","vt":0},"interval":180,"isonly":0,"language":4,"genre":20,"index_cd":0,"index_album":3,"time_public":"2023-03-02","status":0,"fnote":4009,"file":{"media_mid":"002ny3Ky3rdAU0","size_24aac":0,"size_48aac":1100795,"size_96aac":2198221,"size_192ogg":4446395,"size_192aac":4374558,"size_128mp3":2889251,"size_320mp3":7222652,"size_ape":0,"size_flac":42562366,"size_dts":0,"size_try":481070,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":30000,"size_96ogg":2174592,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,7663678]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70002176,"mid":"001slnTv02tsu3"},"volume":{"gain":-10.924,"peak":1,"lra":6.869},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["062CC8bg431TOO","","","",""],"vi":[36620],"ktag":"0"},{"id":398165369,"type":0,"mid":"000hoZCK1smoSr","name":"哗哗","title":"哗哗","subtitle":"","singer":[{"id":4542942,"mid":"0010qhN23BSl7p","name":"Crazy Donkey金大智","title":"Crazy Donkey金大智","type":0,"uin":0,"pmid":""},{"id":1546395,"mid":"000dCyiL1Lhi9d","name":"林渝植","title":"林渝植","type":0,"uin":0,"pmid":""}],"album":{"id":35721139,"mid":"001rWAyr1eBX2M","name":"哗哗","title":"哗哗","subtitle":"","time_public":"2023-03-02","pmid":"001rWAyr1eBX2M_2"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":203,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-02","status":0,"fnote":4009,"file":{"media_mid":"000hoZCK1smoSr","size_24aac":0,"size_48aac":1239633,"size_96aac":2478204,"size_192ogg":4601787,"size_192aac":4914522,"size_128mp3":3261131,"size_320mp3":8152508,"size_ape":0,"size_flac":43784321,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2340289,"size_360ra":[],"size_dolby":0,"size_new":[145586667,22881888,58663855,8010090]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69881813,"mid":"000DDbS02kJnK6"},"volume":{"gain":-8.912,"peak":1,"lra":6.699},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["","","","001ZZmz32atzLQ","000UdDsZ4FDvRb"],"vi":[93059],"ktag":"0"},{"id":398160776,"type":0,"mid":"003j3ZYD0opPCI","name":"感受她","title":"感受她 (Live)","subtitle":"","singer":[{"id":1016794,"mid":"002nXp292LIOGV","name":"蔡徐坤","title":"蔡徐坤","type":0,"uin":0,"pmid":""}],"album":{"id":35720047,"mid":"001jAdSn0oGgFa","name":"KUN 2023 ART LAB LIVE","title":"KUN 2023 ART LAB LIVE","subtitle":"","time_public":"2023-02-27","pmid":"001jAdSn0oGgFa_1"},"mv":{"id":2059369,"vid":"004BpMwJ0lIKNj","name":"","title":"","vt":0},"interval":339,"isonly":0,"language":0,"genre":0,"index_cd":0,"index_album":1,"time_public":"2023-02-27","status":0,"fnote":4009,"file":{"media_mid":"003j3ZYD0opPCI","size_24aac":0,"size_48aac":2068102,"size_96aac":4138532,"size_192ogg":7572291,"size_192aac":8222555,"size_128mp3":5437043,"size_320mp3":13592262,"size_ape":0,"size_flac":67879567,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":3794775,"size_360ra":[],"size_dolby":0,"size_new":[215901290,0,0,12875769]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69437638,"mid":"000cJHZa3C8OvT"},"volume":{"gain":-6.78,"peak":0.998,"lra":16.747},"label":"0","url":"","bpm":0,"version":3,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":1024,"es":"","vs":["062eJlGg43HmqA","","","002Q3HQc4UFYAw",""],"vi":[853927],"ktag":"0"},{"id":398361324,"type":0,"mid":"004PlyHM28RT4M","name":"当你对我微微笑","title":"当你对我微微笑","subtitle":"","singer":[{"id":36691,"mid":"00472DR10Ytv83","name":"袁娅维TIA RAY","title":"袁娅维TIA RAY","type":1,"uin":0,"pmid":""}],"album":{"id":35760737,"mid":"00482ECT2VmSsG","name":"当你对我微微笑","title":"当你对我微微笑","subtitle":"","time_public":"2023-03-01","pmid":"00482ECT2VmSsG_1"},"mv":{"id":2060083,"vid":"000RzW69360hvX","name":"","title":"","vt":0},"interval":245,"isonly":0,"language":0,"genre":0,"index_cd":0,"index_album":1,"time_public":"2023-03-01","status":0,"fnote":4009,"file":{"media_mid":"000gs4vr21MbwK","size_24aac":0,"size_48aac":1493053,"size_96aac":2980201,"size_192ogg":4961475,"size_192aac":5884311,"size_128mp3":3922353,"size_320mp3":9805449,"size_ape":0,"size_flac":22155508,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2574413,"size_360ra":[],"size_dolby":0,"size_new":[146678104,21810614,57767808,8435728]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69684590,"mid":"000aiurL4bRTiz"},"volume":{"gain":-4.108,"peak":0.988,"lra":13.522},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":19456,"es":"","vs":["06045xn32r54vl","","","000hdK3D3Dlh6v","001e0KGR2HpsAN"],"vi":[3974908],"ktag":"0"},{"id":397103101,"type":0,"mid":"0041O6sg00U9UF","name":"More Than Friends","title":"More Than Friends","subtitle":"《HIStory5-遇见未来的你》LINE TV插曲","singer":[{"id":284,"mid":"0049u0DR3G9Rgv","name":"陈势安","title":"陈势安","type":0,"uin":0,"pmid":""}],"album":{"id":35495562,"mid":"000WspGF3Ikyvn","name":"More Than Friends","title":"More Than Friends","subtitle":"《HIStory5-遇见未来的你》LINE TV插曲","time_public":"2023-03-02","pmid":"000WspGF3Ikyvn_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":210,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-02","status":0,"fnote":4009,"file":{"media_mid":"0041O6sg00U9UF","size_24aac":0,"size_48aac":1272819,"size_96aac":2555692,"size_192ogg":4740183,"size_192aac":5082702,"size_128mp3":3361535,"size_320mp3":8403312,"size_ape":0,"size_flac":0,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2375392,"size_360ra":[],"size_dolby":0,"size_new":[141850556,21555256,0,8166981]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69881809,"mid":"003T371z1WInMU"},"volume":{"gain":-8.208,"peak":0.939,"lra":10.051},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["060u90x0444CxU","","","003n3EAN1uruRN","002gWgNo2Vw0PR"],"vi":[5],"ktag":"0"},{"id":398291648,"type":0,"mid":"000BuCh02mS1V8","name":"光","title":"光","subtitle":"《回廊亭》电影主题曲","singer":[{"id":3127723,"mid":"000DT3kC3IGHjR","name":"小阿七","title":"小阿七","type":1,"uin":0,"pmid":""}],"album":{"id":35751130,"mid":"0048BYqn3tpjqL","name":"光","title":"光","subtitle":"《回廊亭》电影主题曲","time_public":"2023-03-02","pmid":"0048BYqn3tpjqL_1"},"mv":{"id":2059856,"vid":"002TOWyb4IuuCE","name":"","title":"","vt":0},"interval":228,"isonly":0,"language":0,"genre":0,"index_cd":0,"index_album":1,"time_public":"2023-03-02","status":0,"fnote":4009,"file":{"media_mid":"000BuCh02mS1V8","size_24aac":0,"size_48aac":1391566,"size_96aac":2790959,"size_192ogg":5308783,"size_192aac":5519477,"size_128mp3":3651477,"size_320mp3":9128414,"size_ape":0,"size_flac":48786002,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2648658,"size_360ra":[],"size_dolby":0,"size_new":[160111765,24685470,63394806,9064976]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69992228,"mid":"000FzJr53VVUKw"},"volume":{"gain":-8.804,"peak":0.894,"lra":12.467},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["063adsgz36Ivnq","","","002Tnveu3s3zno","002DtPSA0PbZWJ"],"vi":[327874],"ktag":"0"},{"id":398539277,"type":0,"mid":"000CZhyX2kGa37","name":"浪漫婚礼","title":"浪漫婚礼","subtitle":"","singer":[{"id":47061,"mid":"000m8IbI4LBbBo","name":"新街口组合","title":"新街口组合","type":2,"uin":0,"pmid":""},{"id":1317766,"mid":"000BzvZW0rzzFG","name":"Mona Lavi","title":"Mona Lavi","type":1,"uin":0,"pmid":""}],"album":{"id":35788796,"mid":"003Cgl274FElzc","name":"浪漫婚礼","title":"浪漫婚礼","subtitle":"","time_public":"2023-03-02","pmid":"003Cgl274FElzc_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":258,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-02","status":0,"fnote":4009,"file":{"media_mid":"000CZhyX2kGa37","size_24aac":0,"size_48aac":1585788,"size_96aac":3182989,"size_192ogg":6103838,"size_192aac":6243529,"size_128mp3":4141759,"size_320mp3":10354096,"size_ape":0,"size_flac":31804844,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":3082792,"size_360ra":[],"size_dolby":0,"size_new":[200975316,31246743,81276162,10790976]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69881834,"mid":"001hUrmq3Qs90u"},"volume":{"gain":-8.459,"peak":0.973,"lra":2.986},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["","","","004ckoXK30Maxs","003yO7311eprTi"],"vi":[35091],"ktag":"0"},{"id":398594132,"type":0,"mid":"002n9y3h2NAjEH","name":"淋湿情绪","title":"淋湿情绪","subtitle":"","singer":[{"id":1315450,"mid":"0002rlul3X50mS","name":"丁芙妮","title":"丁芙妮","type":1,"uin":492761205,"pmid":""}],"album":{"id":35796723,"mid":"002Z3X771zFY5H","name":"淋湿情绪","title":"淋湿情绪","subtitle":"","time_public":"2023-03-02","pmid":"002Z3X771zFY5H_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":223,"isonly":0,"language":0,"genre":0,"index_cd":0,"index_album":1,"time_public":"2023-03-02","status":0,"fnote":4009,"file":{"media_mid":"002n9y3h2NAjEH","size_24aac":0,"size_48aac":1358213,"size_96aac":2722817,"size_192ogg":5313461,"size_192aac":5410847,"size_128mp3":3579182,"size_320mp3":8947316,"size_ape":0,"size_flac":47032495,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2620512,"size_360ra":[],"size_dolby":0,"size_new":[153035110,23248235,60090337,8953473]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69881833,"mid":"001fHLub0U3MTL"},"volume":{"gain":-8.534,"peak":0.951,"lra":10.666},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["060Qnd0Q4EEW5c","","","000YJqOr3SypoM","000Klkg61P2Qnq"],"vi":[1897],"ktag":"0"},{"id":398204935,"type":0,"mid":"00253QiZ0mornS","name":"POST IT","title":"POST IT","subtitle":"","singer":[{"id":25204,"mid":"003tgLLP2kqUr2","name":"龙俊亨","title":"龙俊亨 (용준형)","type":0,"uin":0,"pmid":""},{"id":11563946,"mid":"003vND8K463mVQ","name":"시온","title":"시온","type":0,"uin":0,"pmid":""}],"album":{"id":35729439,"mid":"002go0lF38Oq0V","name":"POST IT (Explicit)","title":"POST IT (Explicit)","subtitle":"","time_public":"2023-03-02","pmid":"002go0lF38Oq0V_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":190,"isonly":0,"language":4,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-02","status":0,"fnote":4009,"file":{"media_mid":"00253QiZ0mornS","size_24aac":0,"size_48aac":1161879,"size_96aac":2321132,"size_192ogg":4740055,"size_192aac":4603309,"size_128mp3":3041303,"size_320mp3":7602909,"size_ape":0,"size_flac":0,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2303988,"size_360ra":[],"size_dolby":0,"size_new":[145758245,22350280,58642326,8632728]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16885507,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":0,"mid":""},"volume":{"gain":-10.616,"peak":1,"lra":5.337},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["060mAuNO0o4bFI","","","000prBIB0CNSjh","001gR8sB2UM3hd"],"vi":[5],"ktag":"0"},{"id":398532255,"type":0,"mid":"000r53xh4ZECFh","name":"序章。","title":"序章。","subtitle":"","singer":[{"id":8764272,"mid":"003WYvpi1mbIln","name":"『ユイカ』","title":"『ユイカ』","type":1,"uin":0,"pmid":""}],"album":{"id":35787153,"mid":"004QfPlI2yORbZ","name":"序章。","title":"序章。","subtitle":"","time_public":"2023-03-01","pmid":"004QfPlI2yORbZ_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":273,"isonly":0,"language":3,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-01","status":0,"fnote":4009,"file":{"media_mid":"000r53xh4ZECFh","size_24aac":0,"size_48aac":1647017,"size_96aac":3287285,"size_192ogg":6588835,"size_192aac":6532572,"size_128mp3":4384171,"size_320mp3":10960132,"size_ape":0,"size_flac":0,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":3215968,"size_360ra":[],"size_dolby":0,"size_new":[199492525,31790733,81296290,11987998]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16888579,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69797939,"mid":"0045OShp26MzpT"},"volume":{"gain":-9.246,"peak":1,"lra":8.497},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["","","","002RB7Ds3BQank","0040085J4HBwCh"],"vi":[35],"ktag":"0"},{"id":398180711,"type":0,"mid":"003llrRO02588J","name":"速命道","title":"速命道","subtitle":"","singer":[{"id":13441,"mid":"002lZMNU1HveJj","name":"顽童MJ116","title":"顽童MJ116","type":2,"uin":0,"pmid":""}],"album":{"id":35724538,"mid":"003Iy6Yb1LpJa3","name":"速命道","title":"速命道","subtitle":"","time_public":"2023-03-01","pmid":"003Iy6Yb1LpJa3_1"},"mv":{"id":2060050,"vid":"000FJCRt1AnQgt","name":"","title":"","vt":0},"interval":157,"isonly":0,"language":0,"genre":34,"index_cd":0,"index_album":1,"time_public":"2023-03-01","status":0,"fnote":4009,"file":{"media_mid":"003llrRO02588J","size_24aac":0,"size_48aac":956429,"size_96aac":1915288,"size_192ogg":3795564,"size_192aac":3804367,"size_128mp3":2518824,"size_320mp3":6296757,"size_ape":0,"size_flac":33309036,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":1944073,"size_360ra":[],"size_dolby":0,"size_new":[0,17462194,43767990,6569949]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69810815,"mid":"001XbKc23PRKWH"},"volume":{"gain":-8.563,"peak":0.892,"lra":5.469},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["061sHwby0hpCOj","","","","000MVRsL3JXp1v"],"vi":[6574],"ktag":"0"},{"id":398362287,"type":0,"mid":"000mwW5f4aESDN","name":"사랑이라 믿었던 것들은 (Feat. 이수현) (Hopeless Romantic)","title":"사랑이라 믿었던 것들은 (Feat. 이수현) (Hopeless Romantic)","subtitle":"","singer":[{"id":3887362,"mid":"000FGVpI1QgIWw","name":"BIG Naughty (서동현)","title":"BIG Naughty (서동현)","type":0,"uin":0,"pmid":""},{"id":652865,"mid":"000uNqSu12dREX","name":"李秀贤","title":"李秀贤 (이수현)","type":1,"uin":0,"pmid":""}],"album":{"id":35761047,"mid":"00389jmi0L2sqy","name":"호프리스 로맨틱 (Hopeless Romantic)","title":"호프리스 로맨틱 (Hopeless Romantic)","subtitle":"","time_public":"2023-02-28","pmid":"00389jmi0L2sqy_1"},"mv":{"id":2060048,"vid":"000dOf090q3nX5","name":"","title":"","vt":0},"interval":235,"isonly":0,"language":4,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-02-28","status":0,"fnote":4009,"file":{"media_mid":"000mwW5f4aESDN","size_24aac":0,"size_48aac":1437799,"size_96aac":2873854,"size_192ogg":5221635,"size_192aac":5704324,"size_128mp3":3776197,"size_320mp3":9439962,"size_ape":0,"size_flac":48091684,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2646390,"size_360ra":[],"size_dolby":0,"size_new":[157671332,23487644,61017363,9300808]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69647971,"mid":"002I8xDE1C0xky"},"volume":{"gain":-8.333,"peak":1,"lra":15.199},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":16384,"es":"","vs":["060YfzxG4V2f19","","","002k8SSs0Ry88a","003HJvhE1KNakg"],"vi":[110746],"ktag":"0"},{"id":398291248,"type":0,"mid":"0030vxTk0CyrkZ","name":"Love Me Crazy","title":"Love Me Crazy","subtitle":"","singer":[{"id":162536,"mid":"001RFQfM0OrMKA","name":"림킴 (김예림)","title":"림킴 (김예림) (Lim Kim)","type":1,"uin":0,"pmid":""},{"id":40287,"mid":"000u9K8f0JOXiv","name":"JAMIE","title":"JAMIE (박지민)","type":1,"uin":0,"pmid":""}],"album":{"id":35751049,"mid":"001XO0Dz0KxTC4","name":"Love Me Crazy - SM STATION","title":"Love Me Crazy - SM STATION","subtitle":"","time_public":"2023-02-28","pmid":"001XO0Dz0KxTC4_1"},"mv":{"id":2059868,"vid":"003Hy8cK2R343Y","name":"","title":"","vt":0},"interval":180,"isonly":0,"language":4,"genre":20,"index_cd":0,"index_album":1,"time_public":"2023-02-28","status":0,"fnote":4009,"file":{"media_mid":"0030vxTk0CyrkZ","size_24aac":0,"size_48aac":1099515,"size_96aac":2202167,"size_192ogg":4272597,"size_192aac":4363620,"size_128mp3":2884606,"size_320mp3":7211111,"size_ape":0,"size_flac":22409602,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2140055,"size_360ra":[],"size_dolby":0,"size_new":[137126343,21620608,56361792,7585265]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":1,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16897281,"msgid":13,"alert":2,"icons":12992510,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69650845,"mid":"0009x1tv0ofDzz"},"volume":{"gain":-10.722,"peak":1,"lra":5.305},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":16384,"es":"","vs":["064AMKHF43N3u6","","","001h1aql4BPBH9","0004WZ8a4XtTbd"],"vi":[302],"ktag":"0"},{"id":398121363,"type":0,"mid":"004LoB1Y33OF3x","name":"Floral Sense (Feat. WINTER of aespa)","title":"Floral Sense (Feat. WINTER of aespa)","subtitle":"","singer":[{"id":20872,"mid":"004MwGIS0cwwT3","name":"艺声","title":"艺声 (예성)","type":0,"uin":0,"pmid":""},{"id":6971583,"mid":"002pFTWe1FFzdP","name":"WINTER","title":"WINTER (윈터)","type":1,"uin":0,"pmid":""}],"album":{"id":35713396,"mid":"002G980n05fiqZ","name":"Floral Sense - The 1st Album Special Ver.","title":"Floral Sense - The 1st Album Special Ver.","subtitle":"","time_public":"2023-02-27","pmid":"002G980n05fiqZ_1"},"mv":{"id":2059425,"vid":"001J05C63OqFOh","name":"","title":"","vt":0},"interval":228,"isonly":0,"language":4,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-02-27","status":0,"fnote":4009,"file":{"media_mid":"004LoB1Y33OF3x","size_24aac":0,"size_48aac":1393344,"size_96aac":2790419,"size_192ogg":5036081,"size_192aac":5536535,"size_128mp3":3656223,"size_320mp3":9140056,"size_ape":0,"size_flac":25996315,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2589756,"size_360ra":[],"size_dolby":0,"size_new":[163488532,25111350,64612843,8631930]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":1,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16897281,"msgid":13,"alert":2,"icons":12992510,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69438387,"mid":"000JWXE20DHCk4"},"volume":{"gain":-9.507,"peak":1,"lra":4.972},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":17408,"es":"","vs":["061iPOVG1kysBC","","","002JDWJA3GVcUy","004KZCN31KHhqs"],"vi":[302],"ktag":"0"},{"id":398010009,"type":0,"mid":"000ImC2P0T5wmp","name":"여름끝 매미 (September Cicada)","title":"여름끝 매미 (September Cicada)","subtitle":"","singer":[{"id":22970,"mid":"004c0zDZ0Et7Cm","name":"San E (산이)","title":"San E (산이)","type":0,"uin":0,"pmid":""}],"album":{"id":35690090,"mid":"004ccogr4ByolQ","name":"Just Rap ****","title":"Just Rap ****","subtitle":"","time_public":"2023-02-25","pmid":"004ccogr4ByolQ_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":119,"isonly":0,"language":4,"genre":34,"index_cd":0,"index_album":10,"time_public":"2023-02-25","status":0,"fnote":4009,"file":{"media_mid":"000ImC2P0T5wmp","size_24aac":0,"size_48aac":735421,"size_96aac":1468097,"size_192ogg":3113360,"size_192aac":2910715,"size_128mp3":1919958,"size_320mp3":4799488,"size_ape":0,"size_flac":0,"size_dts":0,"size_try":481070,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":30000,"size_96ogg":1484810,"size_360ra":[],"size_dolby":0,"size_new":[88181403,13964310,35874717,5517629]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69208141,"mid":"003Tk97t3hF9e5"},"volume":{"gain":-10.449,"peak":1,"lra":7.291},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":16384,"es":"","vs":["063CfRPG1PGV74","","","000FrgfU2b0a93","001CwMAk1VYHKR"],"vi":[36620],"ktag":"0"},{"id":398644401,"type":0,"mid":"0040Dx3s4aC133","name":"天下劫","title":"天下劫 (先行版)","subtitle":"《画江湖之不良人》第6季动画片头曲","singer":[{"id":4556576,"mid":"0023hUFq0cQDtt","name":"毛亮","title":"毛亮","type":0,"uin":0,"pmid":""}],"album":{"id":1806913,"mid":"003GSuuh3xEmeM","name":"画江湖之不良人 原声带","title":"画江湖之不良人 原声带","subtitle":"《画江湖之不良人》第6季动画片头曲","time_public":"2020-06-08","pmid":"003GSuuh3xEmeM_4"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":122,"isonly":0,"language":0,"genre":0,"index_cd":0,"index_album":2,"time_public":"2020-06-08","status":0,"fnote":4009,"file":{"media_mid":"0040Dx3s4aC133","size_24aac":0,"size_48aac":741999,"size_96aac":1485327,"size_192ogg":2832084,"size_192aac":2950867,"size_128mp3":1957510,"size_320mp3":4893036,"size_ape":0,"size_flac":26234991,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":1415960,"size_360ra":[],"size_dolby":0,"size_new":[84270608,13321545,34851210,4927373]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70020644,"mid":"004SjgTB1YxQIf"},"volume":{"gain":-11.06,"peak":1,"lra":9.424},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":16,"es":"","vs":["061klURr4JTHOA","","","001HsVXI1Mvg13","00224WjE1rlWkC"],"vi":[1028959],"ktag":"0"},{"id":398603772,"type":0,"mid":"002ZVTKG2wzyP9","name":"心爱的人","title":"心爱的人","subtitle":"《绝配酥心唐》影视剧主题曲","singer":[{"id":5595698,"mid":"003LNLn82GqJeT","name":"王艺瑾","title":"王艺瑾","type":1,"uin":0,"pmid":""}],"album":{"id":35797898,"mid":"004G4OZ52wUI9i","name":"心爱的人","title":"心爱的人","subtitle":"《绝配酥心唐》影视剧主题曲","time_public":"2023-03-02","pmid":"004G4OZ52wUI9i_1"},"mv":{"id":2060513,"vid":"000NvqU71MiIpY","name":"","title":"","vt":0},"interval":248,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-02","status":0,"fnote":4009,"file":{"media_mid":"002ZVTKG2wzyP9","size_24aac":0,"size_48aac":1510059,"size_96aac":3025437,"size_192ogg":5639452,"size_192aac":6016296,"size_128mp3":3974571,"size_320mp3":9936132,"size_ape":0,"size_flac":53091972,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2837743,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,9652520]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69994967,"mid":"001hh6y12iz0Ux"},"volume":{"gain":-9.563,"peak":1,"lra":8.956},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":2048,"es":"","vs":["","","","",""],"vi":[2817871],"ktag":"0"},{"id":398133237,"type":0,"mid":"002nJKmO4QaBeC","name":"没你的维度","title":"没你的维度","subtitle":"","singer":[{"id":1373351,"mid":"0025ipyS2r3gDv","name":"周锐","title":"周锐","type":0,"uin":0,"pmid":""}],"album":{"id":35715965,"mid":"000hjuUJ4WjUo8","name":"没你的维度","title":"没你的维度","subtitle":"","time_public":"2023-03-03","pmid":"000hjuUJ4WjUo8_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":263,"isonly":0,"language":0,"genre":0,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"002nJKmO4QaBeC","size_24aac":0,"size_48aac":1610658,"size_96aac":3210478,"size_192ogg":5507720,"size_192aac":6372241,"size_128mp3":4218662,"size_320mp3":10546355,"size_ape":0,"size_flac":27176991,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2809458,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,9537059]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70294172,"mid":"002QkwiJ0G406c"},"volume":{"gain":-6.342,"peak":0.893,"lra":14.121},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":2048,"es":"","vs":["060YHghL2fSXot","","","",""],"vi":[36713],"ktag":"0"},{"id":398801978,"type":0,"mid":"0048Q3753NSmTE","name":"顽童","title":"顽童","subtitle":"","singer":[{"id":13929,"mid":"001rw1kJ0TXFGH","name":"石头","title":"石头","type":0,"uin":0,"pmid":""}],"album":{"id":35843049,"mid":"001uig4y1i13LR","name":"顽童","title":"顽童","subtitle":"","time_public":"2023-03-03","pmid":"001uig4y1i13LR_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":229,"isonly":0,"language":0,"genre":0,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"0048Q3753NSmTE","size_24aac":0,"size_48aac":1406573,"size_96aac":2832842,"size_192ogg":5183120,"size_192aac":5572814,"size_128mp3":3665272,"size_320mp3":9162898,"size_ape":0,"size_flac":24638670,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2610718,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,9248760]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70146737,"mid":"003IP4Fi3Hmr1D"},"volume":{"gain":-7.598,"peak":1,"lra":13.531},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["062Pao1601l6d7","","","",""],"vi":[1897],"ktag":"0"},{"id":398775689,"type":0,"mid":"0039al0Y3oV1FA","name":"乌托邦飞艇","title":"乌托邦飞艇","subtitle":"","singer":[{"id":975622,"mid":"001qncr73Jkdof","name":"大波浪","title":"大波浪","type":2,"uin":0,"pmid":""}],"album":{"id":35839075,"mid":"0009Vf3U0yZKol","name":"乌托邦飞艇","title":"乌托邦飞艇","subtitle":"","time_public":"2023-03-03","pmid":"0009Vf3U0yZKol_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":270,"isonly":0,"language":5,"genre":50,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"0039al0Y3oV1FA","size_24aac":0,"size_48aac":1648681,"size_96aac":3295893,"size_192ogg":7120817,"size_192aac":6538415,"size_128mp3":4325243,"size_320mp3":10812214,"size_ape":0,"size_flac":0,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":3375993,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,12501994]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16885507,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":0,"mid":""},"volume":{"gain":-8.475,"peak":1,"lra":5.504},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["","","","",""],"vi":[1892],"ktag":"0"},{"id":398368217,"type":0,"mid":"0041XjMY0bj3hF","name":"国际孤独等级","title":"国际孤独等级","subtitle":"","singer":[{"id":8159453,"mid":"001xkyje0vmXFX","name":"Gareth.T","title":"Gareth.T","type":0,"uin":0,"pmid":""}],"album":{"id":35762687,"mid":"0043UQgj4cyygR","name":"国际孤独等级","title":"国际孤独等级","subtitle":"","time_public":"2023-03-03","pmid":"0043UQgj4cyygR_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":192,"isonly":0,"language":1,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"0041XjMY0bj3hF","size_24aac":0,"size_48aac":1174395,"size_96aac":2349998,"size_192ogg":4060099,"size_192aac":4659882,"size_128mp3":3086008,"size_320mp3":7714697,"size_ape":0,"size_flac":38937531,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2160458,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,7505407]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70146721,"mid":"003ZPbDb28K7FO"},"volume":{"gain":-7.268,"peak":1,"lra":7.323},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["061vPNaF3rZgAl","","","",""],"vi":[3],"ktag":"0"},{"id":398368417,"type":0,"mid":"000QmoHo1USjMY","name":"I CAN GET WHAT I WANT","title":"I CAN GET WHAT I WANT","subtitle":"","singer":[{"id":3720574,"mid":"0045lQwH1GPpbC","name":"Lewsz","title":"Lewsz","type":0,"uin":0,"pmid":""},{"id":6016336,"mid":"003Lsgky4XmJqA","name":"张蔓姿","title":"张蔓姿","type":1,"uin":0,"pmid":""}],"album":{"id":35762723,"mid":"000ICMfM2HqeQn","name":"I CAN GET WHAT I WANT","title":"I CAN GET WHAT I WANT","subtitle":"","time_public":"2023-03-03","pmid":"000ICMfM2HqeQn_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":202,"isonly":0,"language":1,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"000FTQJH28bTKb","size_24aac":0,"size_48aac":1244214,"size_96aac":2495106,"size_192ogg":4574073,"size_192aac":4899473,"size_128mp3":3239871,"size_320mp3":8099274,"size_ape":0,"size_flac":43575230,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2317240,"size_360ra":[],"size_dolby":11343661,"size_new":[0,0,0,8277507]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70146724,"mid":"0021ObTq2GS6eL"},"volume":{"gain":-8.011,"peak":0.959,"lra":11.25},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["060Rf8MM1tHIq1","","","",""],"vi":[3],"ktag":"0"},{"id":398770438,"type":0,"mid":"004OBjvU1luMu9","name":"seOul drift","title":"seOul drift","subtitle":"","singer":[{"id":3380549,"mid":"002CeqFj2iATUM","name":"OnlyOneOf (온리원오브)","title":"OnlyOneOf (온리원오브)","type":2,"uin":0,"pmid":""}],"album":{"id":35838790,"mid":"0040J9ia4ZP7Zp","name":"seOul cOllectiOn","title":"seOul cOllectiOn","subtitle":"","time_public":"2023-03-02","pmid":"0040J9ia4ZP7Zp_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":201,"isonly":0,"language":4,"genre":20,"index_cd":0,"index_album":2,"time_public":"2023-03-02","status":0,"fnote":4009,"file":{"media_mid":"004OMuEY3qmbtU","size_24aac":0,"size_48aac":1223991,"size_96aac":2448003,"size_192ogg":5008511,"size_192aac":4869052,"size_128mp3":3221475,"size_320mp3":8053292,"size_ape":0,"size_flac":47208270,"size_dts":0,"size_try":481070,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":30000,"size_96ogg":2544541,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,9840127]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16885507,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":0,"mid":""},"volume":{"gain":-11.631,"peak":1,"lra":2.601},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["064LH41u28c0Nj","","","",""],"vi":[36620],"ktag":"0"},{"id":398782001,"type":0,"mid":"004BTFnt3z09j9","name":"Raise Up The Flag","title":"Raise Up The Flag","subtitle":"","singer":[{"id":181896,"mid":"003YEuq92K9mBV","name":"权珍雅","title":"权珍雅 (권진아)","type":1,"uin":0,"pmid":""}],"album":{"id":35840372,"mid":"0009iujP341qSr","name":"The Flag","title":"The Flag","subtitle":"","time_public":"2023-03-02","pmid":"0009iujP341qSr_1"},"mv":{"id":2060507,"vid":"004BMK1e3zX1A5","name":"","title":"","vt":0},"interval":224,"isonly":0,"language":4,"genre":1,"index_cd":0,"index_album":2,"time_public":"2023-03-02","status":0,"fnote":4009,"file":{"media_mid":"004BTFnt3z09j9","size_24aac":0,"size_48aac":1363663,"size_96aac":2727340,"size_192ogg":5152534,"size_192aac":5419026,"size_128mp3":3590919,"size_320mp3":8976950,"size_ape":0,"size_flac":49020115,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2545392,"size_360ra":[],"size_dolby":0,"size_new":[163068115,24986590,64980894,8825309]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16885507,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":0,"mid":""},"volume":{"gain":-8.887,"peak":1,"lra":11.318},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["060vgfFa45sG0M","","","001JOgwy2bS2Oh","002agx1q3AlGV8"],"vi":[110746],"ktag":"0"},{"id":398610209,"type":0,"mid":"002gfJR62YcO4E","name":"나비무덤 (Butterfly Grave)","title":"나비무덤 (Butterfly Grave)","subtitle":"","singer":[{"id":12905,"mid":"003TIDwG3tKu5L","name":"포맨 (4MEN)","title":"포맨 (4MEN)","type":2,"uin":0,"pmid":""}],"album":{"id":35798785,"mid":"000D8E8t1lIpCw","name":"나비무덤 (Butterfly Grave)","title":"나비무덤 (Butterfly Grave)","subtitle":"","time_public":"2023-03-01","pmid":"000D8E8t1lIpCw_2"},"mv":{"id":2060389,"vid":"00136bTN4ULfan","name":"","title":"","vt":0},"interval":262,"isonly":0,"language":4,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-01","status":0,"fnote":4009,"file":{"media_mid":"002ttsBF1Ya1uv","size_24aac":0,"size_48aac":1592817,"size_96aac":3189384,"size_192ogg":5815255,"size_192aac":6326370,"size_128mp3":4197846,"size_320mp3":10494192,"size_ape":0,"size_flac":55519328,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2865122,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,10150433]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69853944,"mid":"001J7QsG01rjih"},"volume":{"gain":-8.568,"peak":1,"lra":15.915},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["","","","",""],"vi":[110746],"ktag":"0"},{"id":398717249,"type":0,"mid":"001E4ZL00yd3GI","name":"Please","title":"Please","subtitle":"《神圣的偶像》韩剧插曲","singer":[{"id":941447,"mid":"0009RujD1tzyqm","name":"林韩星","title":"林韩星 (임한별)","type":0,"uin":0,"pmid":""}],"album":{"id":35828103,"mid":"0032Vfxi11tz6O","name":"성스러운 아이돌 OST Part.3","title":"성스러운 아이돌 OST Part.3","subtitle":"《神圣的偶像》韩剧插曲","time_public":"2023-03-02","pmid":"0032Vfxi11tz6O_1"},"mv":{"id":2060405,"vid":"000KaOel0UEMjd","name":"","title":"","vt":0},"interval":236,"isonly":0,"language":4,"genre":37,"index_cd":0,"index_album":1,"time_public":"2023-03-02","status":0,"fnote":4009,"file":{"media_mid":"001E4ZL00yd3GI","size_24aac":0,"size_48aac":1438186,"size_96aac":2881652,"size_192ogg":5073257,"size_192aac":5726739,"size_128mp3":3791971,"size_320mp3":9479560,"size_ape":0,"size_flac":49726692,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2555951,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,8819094]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70082119,"mid":"0045zOV94cQnIc"},"volume":{"gain":-7.998,"peak":1,"lra":14.092},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["062UQ8EP0mYApP","","","",""],"vi":[7445],"ktag":"0"},{"id":398612148,"type":0,"mid":"000v73LV3goSh9","name":"혼자가 아닌 나 (I'm not alone)","title":"혼자가 아닌 나 (I'm not alone)","subtitle":"","singer":[{"id":3170544,"mid":"003RlOjO2uoWr5","name":"郑孝彬","title":"郑孝彬 (정효빈)","type":1,"uin":0,"pmid":""}],"album":{"id":35798895,"mid":"000dcK8C3puWjh","name":"혼자가 아닌 나 (I'm not alone)","title":"혼자가 아닌 나 (I'm not alone)","subtitle":"","time_public":"2023-03-01","pmid":"000dcK8C3puWjh_2"},"mv":{"id":2060379,"vid":"002Op1GO36nvUD","name":"","title":"","vt":0},"interval":209,"isonly":0,"language":4,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-01","status":0,"fnote":4009,"file":{"media_mid":"000BXSN33fAbhk","size_24aac":0,"size_48aac":1274718,"size_96aac":2548790,"size_192ogg":4873393,"size_192aac":5064210,"size_128mp3":3352310,"size_320mp3":8380359,"size_ape":0,"size_flac":47558830,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2439635,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,8479687]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69996118,"mid":"0009n6aE1WAEn7"},"volume":{"gain":-8.573,"peak":0.993,"lra":6.145},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["","","","",""],"vi":[110746],"ktag":"0"},{"id":398361574,"type":0,"mid":"002ciLgg1dcepN","name":"Sugar Sweet","title":"Sugar Sweet","subtitle":"","singer":[{"id":9765224,"mid":"0005fRCX4XRalJ","name":"Benson Boone","title":"Benson Boone","type":0,"uin":0,"pmid":""}],"album":{"id":35760819,"mid":"003pv7JH1Qvq5R","name":"Sugar Sweet","title":"Sugar Sweet","subtitle":"","time_public":"2023-03-03","pmid":"003pv7JH1Qvq5R_1"},"mv":{"id":2060829,"vid":"001QvnG11eBCVg","name":"","title":"","vt":0},"interval":169,"isonly":0,"language":5,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"003bDnre0cLjLF","size_24aac":0,"size_48aac":1028421,"size_96aac":2056051,"size_192ogg":4682327,"size_192aac":4088819,"size_128mp3":2718650,"size_320mp3":6796260,"size_ape":0,"size_flac":38020202,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2290630,"size_360ra":[],"size_dolby":9518309,"size_new":[0,0,0,8276654]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16885507,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":0,"mid":""},"volume":{"gain":-11.365,"peak":1,"lra":3.18},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["061RrBo13VdCpP","","","",""],"vi":[3],"ktag":"0"},{"id":398287565,"type":0,"mid":"000kFgZv36iVFt","name":"keep our love alive","title":"keep our love alive","subtitle":"","singer":[{"id":3129868,"mid":"003yF9CY3CnjbQ","name":"Powfu","title":"Powfu","type":0,"uin":0,"pmid":""}],"album":{"id":35750411,"mid":"0012K5pM1XEndd","name":"keep our love alive","title":"keep our love alive","subtitle":"","time_public":"2023-03-03","pmid":"0012K5pM1XEndd_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":176,"isonly":0,"language":5,"genre":50,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"000kFgZv36iVFt","size_24aac":0,"size_48aac":1079895,"size_96aac":2158600,"size_192ogg":4033205,"size_192aac":4290134,"size_128mp3":2829845,"size_320mp3":7074221,"size_ape":0,"size_flac":0,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2033315,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,7103676]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16885507,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":0,"mid":""},"volume":{"gain":-8.689,"peak":1,"lra":9.979},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["062sL5ru3X79cT","","","",""],"vi":[5],"ktag":"0"},{"id":398353497,"type":0,"mid":"001CnOCn4gVUug","name":"Home Movies","title":"Home Movies (Acoustic)","subtitle":"","singer":[{"id":55600,"mid":"000YH1aW2ashnA","name":"Lukas Graham","title":"Lukas Graham","type":2,"uin":0,"pmid":""}],"album":{"id":35757399,"mid":"003RQ1fF3Uh2Ru","name":"Home Movies (Acoustic)","title":"Home Movies (Acoustic)","subtitle":"","time_public":"2023-03-03","pmid":"003RQ1fF3Uh2Ru_1"},"mv":{"id":2054083,"vid":"002Irkbj1iJ0hh","name":"","title":"","vt":0},"interval":195,"isonly":0,"language":5,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"001CnOCn4gVUug","size_24aac":0,"size_48aac":1184020,"size_96aac":2370937,"size_192ogg":4639566,"size_192aac":4699355,"size_128mp3":3127018,"size_320mp3":7817147,"size_ape":0,"size_flac":41264317,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2279880,"size_360ra":[],"size_dolby":0,"size_new":[137916265,21034088,55035138,8375383]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16885507,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":0,"mid":""},"volume":{"gain":-9.068,"peak":0.994,"lra":7.38},"label":"0","url":"","bpm":0,"version":11,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":16,"es":"","vs":["064LmFgk1xVmCT","","","004N23vq3RSeB4","002npfWy49diH2"],"vi":[3],"ktag":"0"},{"id":398355230,"type":0,"mid":"001H1MFU2Bop2s","name":"Best Day Ever","title":"Best Day Ever","subtitle":"","singer":[{"id":167573,"mid":"001HWkGC3Pm9E3","name":"Johnny Stimson","title":"Johnny Stimson","type":0,"uin":0,"pmid":""}],"album":{"id":35757868,"mid":"0045JQcS07IiKV","name":"Best Day Ever / Look At Me Now","title":"Best Day Ever / Look At Me Now","subtitle":"","time_public":"2023-03-03","pmid":"0045JQcS07IiKV_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":138,"isonly":0,"language":5,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"001H1MFU2Bop2s","size_24aac":0,"size_48aac":848116,"size_96aac":1692945,"size_192ogg":3364997,"size_192aac":3371260,"size_128mp3":2224250,"size_320mp3":5560192,"size_ape":0,"size_flac":16693396,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":1658821,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,6035615]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16885507,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":0,"mid":""},"volume":{"gain":-8.156,"peak":0.982,"lra":5.427},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["062CH0st2i5fdL","","","",""],"vi":[3],"ktag":"0"},{"id":398367046,"type":0,"mid":"0021cDQy2dlgtS","name":"Cinderella Snapped","title":"Cinderella Snapped (Explicit)","subtitle":"","singer":[{"id":9908603,"mid":"00478CeL0LbHPw","name":"Jax","title":"Jax","type":1,"uin":0,"pmid":""}],"album":{"id":35762400,"mid":"004BrzS049gotZ","name":"Cinderella Snapped (Explicit)","title":"Cinderella Snapped (Explicit)","subtitle":"","time_public":"2023-03-03","pmid":"004BrzS049gotZ_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":173,"isonly":0,"language":5,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"000AdYlN3m2Y8Q","size_24aac":0,"size_48aac":1054449,"size_96aac":2108992,"size_192ogg":3995183,"size_192aac":4161668,"size_128mp3":2770927,"size_320mp3":6926904,"size_ape":0,"size_flac":19372104,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2033279,"size_360ra":[],"size_dolby":9701193,"size_new":[0,0,0,7031792]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16885507,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":0,"mid":""},"volume":{"gain":-10.996,"peak":1,"lra":10.882},"label":"0","url":"","bpm":0,"version":15,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["061NOJx135Nyic","","","",""],"vi":[3],"ktag":"0"},{"id":398032742,"type":0,"mid":"002L1T1M2mDYzv","name":"I DON'T WANNA BE LIKE YOU","title":"I DON'T WANNA BE LIKE YOU (Explicit)","subtitle":"","singer":[{"id":1461426,"mid":"003k0AZX1kXM3Q","name":"Ruel","title":"Ruel","type":0,"uin":0,"pmid":""}],"album":{"id":35696760,"mid":"000qwCXg1d18sq","name":"4TH WALL (Explicit)","title":"4TH WALL (Explicit)","subtitle":"","time_public":"2023-03-03","pmid":"000qwCXg1d18sq_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":163,"isonly":0,"language":5,"genre":1,"index_cd":0,"index_album":2,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"002L1T1M2mDYzv","size_24aac":0,"size_48aac":997457,"size_96aac":1999368,"size_192ogg":4009368,"size_192aac":3963503,"size_128mp3":2624219,"size_320mp3":6559943,"size_ape":0,"size_flac":0,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":1969525,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,7513573]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69669494,"mid":"004W30ss3A4dlT"},"volume":{"gain":-10.737,"peak":1,"lra":4.872},"label":"0","url":"","bpm":0,"version":15,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["06292b082pCt6z","","","",""],"vi":[5],"ktag":"0"},{"id":398238487,"type":0,"mid":"000XZbgJ43OuWH","name":"Worms","title":"Worms (Explicit)","subtitle":"","singer":[{"id":1485455,"mid":"0048yqVA3DoMQW","name":"Ashnikko","title":"Ashnikko","type":1,"uin":0,"pmid":""}],"album":{"id":35737449,"mid":"002iflfr0KI607","name":"Worms (Explicit)","title":"Worms (Explicit)","subtitle":"","time_public":"2023-03-02","pmid":"002iflfr0KI607_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":148,"isonly":0,"language":5,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-02","status":0,"fnote":4009,"file":{"media_mid":"000XZbgJ43OuWH","size_24aac":0,"size_48aac":907290,"size_96aac":1815117,"size_192ogg":3614953,"size_192aac":3599993,"size_128mp3":2380511,"size_320mp3":5950928,"size_ape":0,"size_flac":17666378,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":1761643,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,6326979]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16885507,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":0,"mid":""},"volume":{"gain":-10.241,"peak":1,"lra":3.984},"label":"0","url":"","bpm":0,"version":15,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["063NYTx20JX6EG","","","",""],"vi":[3],"ktag":"0"},{"id":396532277,"type":0,"mid":"004fXnzF1NMLwA","name":"Paradise","title":"Paradise","subtitle":"《哆啦A梦：大雄与天空的理想乡》动画电影主题曲","singer":[{"id":6106548,"mid":"004RJHrP2oPfd6","name":"NiziU","title":"NiziU","type":2,"uin":0,"pmid":""}],"album":{"id":35369810,"mid":"001HKYHq0K8Jg3","name":"Paradise","title":"Paradise","subtitle":"《哆啦A梦：大雄与天空的理想乡》动画电影主题曲","time_public":"2023-03-03","pmid":"001HKYHq0K8Jg3_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":207,"isonly":0,"language":3,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"004fXnzF1NMLwA","size_24aac":0,"size_48aac":1264927,"size_96aac":2530853,"size_192ogg":5038926,"size_192aac":5013558,"size_128mp3":3315888,"size_320mp3":8289393,"size_ape":0,"size_flac":0,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2455403,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,9564110]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16885507,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":0,"mid":""},"volume":{"gain":-10.256,"peak":1,"lra":7.983},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["0600d3Sq4D6rrU","","","",""],"vi":[5],"ktag":"0"},{"id":396705881,"type":0,"mid":"001hVWXw0b6zNY","name":"シャンディ","title":"シャンディ","subtitle":"","singer":[{"id":34121,"mid":"000DQtMe38gVI3","name":"超特急","title":"超特急 (ちょうとっきゅう)","type":2,"uin":0,"pmid":""}],"album":{"id":35406355,"mid":"0046bRXC3lwhfI","name":"シャンディ","title":"シャンディ","subtitle":"","time_public":"2023-03-03","pmid":"0046bRXC3lwhfI_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":174,"isonly":0,"language":3,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"001hVWXw0b6zNY","size_24aac":0,"size_48aac":1063199,"size_96aac":2133093,"size_192ogg":4231358,"size_192aac":4215427,"size_128mp3":2790497,"size_320mp3":6975940,"size_ape":0,"size_flac":40018798,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2108619,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,7269482]},"pay":{"pay_month":1,"price_track":0,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":108291,"msgid":14,"alert":2,"icons":8404860,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":0,"mid":""},"volume":{"gain":-10.858,"peak":1,"lra":5.786},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["","","","",""],"vi":[101433],"ktag":"0"},{"id":398364326,"type":0,"mid":"002Vxdok3y6Ttr","name":"いびつな心 (feat. むﾄ)","title":"いびつな心 (feat. むﾄ) (扭曲的心)","subtitle":"","singer":[{"id":2862785,"mid":"003jNJ9C2gUmya","name":"須田景凪","title":"須田景凪 (すだ けいな)","type":0,"uin":0,"pmid":""},{"id":8969521,"mid":"004TBbrt4gHxjs","name":"むﾄ","title":"むﾄ","type":1,"uin":0,"pmid":""}],"album":{"id":35761427,"mid":"001BFxJ30PI6PT","name":"いびつな心 (feat. むﾄ)","title":"いびつな心 (feat. むﾄ)","subtitle":"","time_public":"2023-03-03","pmid":"001BFxJ30PI6PT_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":226,"isonly":0,"language":3,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"002Vxdok3y6Ttr","size_24aac":0,"size_48aac":1368001,"size_96aac":2737873,"size_192ogg":5666160,"size_192aac":5416875,"size_128mp3":3625670,"size_320mp3":9063737,"size_ape":0,"size_flac":26749734,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2845083,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,9888177]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16885507,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":0,"mid":""},"volume":{"gain":-9.49,"peak":0.987,"lra":6.288},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["0614GBNR2OpPcJ","","","",""],"vi":[3],"ktag":"0"},{"id":398375280,"type":0,"mid":"002WWbDF29TxSU","name":"BIBI Vengeance (feat. Baby Tate)","title":"BIBI Vengeance (feat. Baby Tate) (Remix)","subtitle":"","singer":[{"id":2726800,"mid":"002G7alj1Vnmow","name":"BIBI","title":"BIBI (비비)","type":1,"uin":0,"pmid":""},{"id":2695794,"mid":"000wmJvx21rCZi","name":"Princesa Alba","title":"Princesa Alba","type":0,"uin":0,"pmid":""},{"id":1423049,"mid":"001wUh440THE5I","name":"Baby Tate","title":"Baby Tate","type":1,"uin":0,"pmid":""}],"album":{"id":35764132,"mid":"0048aXbC4d7SqW","name":"BIBI Vengeance (feat. Baby Tate) [Remix]","title":"BIBI Vengeance (feat. Baby Tate) [Remix]","subtitle":"","time_public":"2023-03-03","pmid":"0048aXbC4d7SqW_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":189,"isonly":0,"language":4,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"002WWbDF29TxSU","size_24aac":0,"size_48aac":1155015,"size_96aac":2317636,"size_192ogg":4241705,"size_192aac":4583911,"size_128mp3":3040563,"size_320mp3":7600915,"size_ape":0,"size_flac":36473701,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2187099,"size_360ra":[],"size_dolby":0,"size_new":[129447905,19735135,51169870,7698132]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70146720,"mid":"004VKPoE3pplUJ"},"volume":{"gain":-3.326,"peak":0.543,"lra":4.065},"label":"0","url":"","bpm":0,"version":6,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":16,"es":"","vs":["060RF08X0h0Xbg","","","004ZQvUa10eJii","0049yXMB3dmJvk"],"vi":[6574],"ktag":"0"},{"id":396769218,"type":0,"mid":"002wETBE3mhsf0","name":"Landslide","title":"Landslide","subtitle":"","singer":[{"id":3199632,"mid":"001v7xOB0xRqlg","name":"Sabai","title":"Sabai","type":0,"uin":0,"pmid":""},{"id":1483730,"mid":"004My1Lg2P46Vn","name":"RUNN","title":"RUNN","type":1,"uin":0,"pmid":""}],"album":{"id":35419125,"mid":"0001jdRI3YZkx0","name":"Landslide","title":"Landslide","subtitle":"","time_public":"2023-03-03","pmid":"0001jdRI3YZkx0_2"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":190,"isonly":0,"language":5,"genre":20,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"002wETBE3mhsf0","size_24aac":0,"size_48aac":1159217,"size_96aac":2307522,"size_192ogg":4624729,"size_192aac":4572121,"size_128mp3":3045890,"size_320mp3":7614393,"size_ape":0,"size_flac":41741760,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2280330,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,8187122]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16885507,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":0,"mid":""},"volume":{"gain":-12.327,"peak":0.985,"lra":5.152},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["","","","",""],"vi":[8439],"ktag":"0"},{"id":398539983,"type":0,"mid":"001MfNOO1hziPA","name":"I Wish My Mind Would Shut Up 慢速版（你应该看看我的日记）","title":"I Wish My Mind Would Shut Up 慢速版（你应该看看我的日记）","subtitle":"","singer":[{"id":3058845,"mid":"0035w6Mp1gY2hJ","name":"Ivoris","title":"Ivoris","type":1,"uin":0,"pmid":""}],"album":{"id":35788992,"mid":"000wufJR3TOhsM","name":"I Wish My Mind Would Shut Up 慢速版（你应该看看我的日记）","title":"I Wish My Mind Would Shut Up 慢速版（你应该看看我的日记）","subtitle":"","time_public":"2023-03-02","pmid":"000wufJR3TOhsM_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":145,"isonly":0,"language":5,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-02","status":0,"fnote":4009,"file":{"media_mid":"001MfNOO1hziPA","size_24aac":0,"size_48aac":903623,"size_96aac":1796422,"size_192ogg":3097055,"size_192aac":3508076,"size_128mp3":2335080,"size_320mp3":5837160,"size_ape":0,"size_flac":25533850,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":1657866,"size_360ra":[],"size_dolby":0,"size_new":[85256709,12902836,33067670,5476288]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69883110,"mid":"000OqcQR437U45"},"volume":{"gain":-0.784,"peak":0.974,"lra":11.707},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["","","","003ZggnA26uXgK","000ORHHB1aBo2x"],"vi":[93059],"ktag":"0"},{"id":398360772,"type":0,"mid":"004bV9Jw0Jrw4b","name":"I Gotta Bounce","title":"I Gotta Bounce","subtitle":"","singer":[{"id":168002,"mid":"000x9W9d2ZZT90","name":"Faustix","title":"Faustix","type":0,"uin":0,"pmid":""}],"album":{"id":35760571,"mid":"0018Qcaj4P70oJ","name":"I Gotta Bounce","title":"I Gotta Bounce","subtitle":"","time_public":"2023-03-03","pmid":"0018Qcaj4P70oJ_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":136,"isonly":0,"language":5,"genre":22,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"004bV9Jw0Jrw4b","size_24aac":0,"size_48aac":836545,"size_96aac":1673176,"size_192ogg":3175996,"size_192aac":3322884,"size_128mp3":2192859,"size_320mp3":5481780,"size_ape":0,"size_flac":17458788,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":1600277,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,6306965]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16885507,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":0,"mid":""},"volume":{"gain":-10.447,"peak":0.986,"lra":3.629},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["063gozkg3Q9dyX","","","",""],"vi":[3],"ktag":"0"},{"id":394253646,"type":0,"mid":"000MrKEf3xVeoa","name":"Supreme","title":"Supreme","subtitle":"","singer":[{"id":40544,"mid":"000gG3GR391q0I","name":"Vassy","title":"Vassy","type":1,"uin":0,"pmid":""}],"album":{"id":34995834,"mid":"002P7LkV0dj0hJ","name":"Supreme","title":"Supreme","subtitle":"","time_public":"2023-03-03","pmid":"002P7LkV0dj0hJ_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":172,"isonly":0,"language":5,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"000MrKEf3xVeoa","size_24aac":0,"size_48aac":1046521,"size_96aac":2094517,"size_192ogg":3992152,"size_192aac":4146473,"size_128mp3":2762924,"size_320mp3":6906989,"size_ape":0,"size_flac":39139157,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2040598,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,7093170]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16885507,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":0,"mid":""},"volume":{"gain":-10.157,"peak":1,"lra":7.346},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["062qwrx60YTxHN","","","",""],"vi":[5],"ktag":"0"},{"id":398891752,"type":0,"mid":"000Syjax0IZfm5","name":"Highs And Lows","title":"Highs And Lows","subtitle":"","singer":[{"id":11130,"mid":"003dMyhJ0ZODYr","name":"ATB","title":"ATB","type":0,"uin":0,"pmid":""},{"id":1372272,"mid":"001rBCR64KNiBb","name":"Au/Ra","title":"Au/Ra","type":1,"uin":0,"pmid":""},{"id":1166378,"mid":"0026BVU442Ze61","name":"York","title":"York","type":0,"uin":0,"pmid":""}],"album":{"id":35860913,"mid":"000bSRqu3UnLe5","name":"Highs And Lows","title":"Highs And Lows","subtitle":"","time_public":"2023-03-03","pmid":"000bSRqu3UnLe5_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":158,"isonly":0,"language":5,"genre":20,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"000Syjax0IZfm5","size_24aac":0,"size_48aac":965278,"size_96aac":1930944,"size_192ogg":3831056,"size_192aac":3837852,"size_128mp3":2530980,"size_320mp3":6326572,"size_ape":0,"size_flac":0,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":1936122,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,6846238]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16884483,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":0,"mid":""},"volume":{"gain":-10.424,"peak":1,"lra":6.168},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["","","","",""],"vi":[35],"ktag":"0"},{"id":398916882,"type":0,"mid":"001hc7I54QVD1x","name":"我们之间平平无奇","title":"我们之间平平无奇","subtitle":"《我在时间尽头等你》音乐剧唱段","singer":[{"id":6787676,"mid":"003vLbfK2gttHq","name":"严小北","title":"严小北","type":1,"uin":0,"pmid":""},{"id":3696440,"mid":"000qk6Z60ENLyM","name":"王瀚宇","title":"王瀚宇","type":0,"uin":0,"pmid":""}],"album":{"id":35865482,"mid":"004Wn5tk20B0ZZ","name":"我在时间尽头等你 音乐剧原声带","title":"我在时间尽头等你 音乐剧原声带","subtitle":"《我在时间尽头等你》音乐剧唱段","time_public":"2023-03-03","pmid":"004Wn5tk20B0ZZ_3"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":311,"isonly":0,"language":0,"genre":0,"index_cd":0,"index_album":4,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"001hc7I54QVD1x","size_24aac":0,"size_48aac":1895404,"size_96aac":3792507,"size_192ogg":6548354,"size_192aac":7535500,"size_128mp3":4981388,"size_320mp3":12452793,"size_ape":0,"size_flac":0,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":3335375,"size_360ra":[],"size_dolby":0,"size_new":[179804680,0,0,10759976]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70341960,"mid":"001ehS7y3KHLAo"},"volume":{"gain":-7.602,"peak":0.981,"lra":21.579},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["06290C2w2IQqaq","","","003prAje4cJo4v",""],"vi":[3523140],"ktag":"0"},{"id":398161397,"type":0,"mid":"004QmUR22G2fHL","name":"快乐歌 (prod. by PUZZLEMAN)","title":"快乐歌 (prod. by PUZZLEMAN)","subtitle":"","singer":[{"id":5360270,"mid":"000XnuJd2og5my","name":"没有才能","title":"没有才能","type":2,"uin":0,"pmid":""},{"id":1558802,"mid":"000fzcLo2COlQ5","name":"PUZZLEMAN","title":"PUZZLEMAN","type":0,"uin":0,"pmid":""}],"album":{"id":35720157,"mid":"003gjKkZ12HIdL","name":"快乐歌 (prod. by PUZZLEMAN)","title":"快乐歌 (prod. by PUZZLEMAN)","subtitle":"","time_public":"2023-03-03","pmid":"003gjKkZ12HIdL_1"},"mv":{"id":2060241,"vid":"001DSw2G1bxDgR","name":"","title":"","vt":0},"interval":172,"isonly":0,"language":0,"genre":0,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"004QmUR22G2fHL","size_24aac":0,"size_48aac":1044793,"size_96aac":2091829,"size_192ogg":3967025,"size_192aac":4151698,"size_128mp3":2756260,"size_320mp3":6890295,"size_ape":0,"size_flac":38068860,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2026556,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,7103369]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70146714,"mid":"003L7l8u04zHTa"},"volume":{"gain":-10.824,"peak":0.985,"lra":5.108},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["063srE3M3ZEU6a","","","",""],"vi":[8],"ktag":"0"},{"id":397680973,"type":0,"mid":"003uf1n91t9Zvu","name":"岁月情歌","title":"岁月情歌","subtitle":"","singer":[{"id":3133695,"mid":"0013xwfx03qjvN","name":"王小帅","title":"王小帅","type":0,"uin":0,"pmid":""}],"album":{"id":35621310,"mid":"0007DTL23saAhI","name":"岁月情歌","title":"岁月情歌","subtitle":"","time_public":"2023-03-03","pmid":"0007DTL23saAhI_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":189,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"003uf1n91t9Zvu","size_24aac":0,"size_48aac":1155661,"size_96aac":2311274,"size_192ogg":4478042,"size_192aac":4600573,"size_128mp3":3037507,"size_320mp3":7593471,"size_ape":0,"size_flac":42415833,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2237400,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,7967405]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70146674,"mid":"001Suau73IWeUL"},"volume":{"gain":-9.982,"peak":1,"lra":6.054},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":2048,"es":"","vs":["","","","",""],"vi":[96934],"ktag":"0"},{"id":398722517,"type":0,"mid":"002wYLDe1HVc2W","name":"替你握山河","title":"替你握山河","subtitle":"《为了和谐而奋斗》广播剧第一季主题曲","singer":[{"id":1197254,"mid":"0044RFZ64AOXH1","name":"Smile_小千","title":"Smile_小千","type":0,"uin":0,"pmid":""}],"album":{"id":35829306,"mid":"002DAdf24fMh81","name":"替你握山河","title":"替你握山河","subtitle":"《为了和谐而奋斗》广播剧第一季主题曲","time_public":"2023-03-02","pmid":"002DAdf24fMh81_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":250,"isonly":0,"language":0,"genre":0,"index_cd":0,"index_album":1,"time_public":"2023-03-02","status":0,"fnote":4009,"file":{"media_mid":"002wYLDe1HVc2W","size_24aac":0,"size_48aac":1529418,"size_96aac":3059709,"size_192ogg":5611498,"size_192aac":6073950,"size_128mp3":4008858,"size_320mp3":10021828,"size_ape":0,"size_flac":25957012,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2835240,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,9817126]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70011430,"mid":"000xEVPm0d5tJJ"},"volume":{"gain":-5.69,"peak":0.992,"lra":10.242},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["062eLtmI1Kq8aM","","","",""],"vi":[167306],"ktag":"0"},{"id":398890792,"type":0,"mid":"003UQCwZ1lBWC5","name":"Tan Dun: Meta Voyage","title":"Tan Dun: Meta Voyage","subtitle":"","singer":[{"id":13085281,"mid":"000NRnG121qrMs","name":"WE Orchestra","title":"WE Orchestra","type":0,"uin":0,"pmid":""},{"id":17948,"mid":"001OAXcf3jY9KC","name":"谭盾","title":"谭盾","type":0,"uin":0,"pmid":""}],"album":{"id":35860779,"mid":"004HuV4148SBxr","name":"Five Souls","title":"Five Souls","subtitle":"","time_public":"2023-03-03","pmid":"004HuV4148SBxr_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":194,"isonly":0,"language":9,"genre":2,"index_cd":0,"index_album":4,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"003UQCwZ1lBWC5","size_24aac":0,"size_48aac":1189454,"size_96aac":2376772,"size_192ogg":4260889,"size_192aac":4698546,"size_128mp3":3108622,"size_320mp3":7771008,"size_ape":0,"size_flac":0,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2124342,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,7269691]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16884483,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":8},"ksong":{"id":0,"mid":""},"volume":{"gain":0.586,"peak":0.892,"lra":6.856},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":16,"es":"","vs":["","","","",""],"vi":[35],"ktag":"0"},{"id":395921685,"type":0,"mid":"003oi9ff2Z9IWQ","name":"Dune: House Atreides","title":"Dune: House Atreides (Live)","subtitle":"","singer":[{"id":5105,"mid":"002xwyjy1OtAWo","name":"Hans Zimmer","title":"Hans Zimmer","type":0,"uin":0,"pmid":""},{"id":12139653,"mid":"004e6AjH2iFJI0","name":"The Disruptive Collective","title":"The Disruptive Collective","type":0,"uin":0,"pmid":""}],"album":{"id":35245429,"mid":"004fDrt20Gxa30","name":"LIVE","title":"LIVE","subtitle":"","time_public":"2023-03-03","pmid":"004fDrt20Gxa30_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":226,"isonly":0,"language":7,"genre":37,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"003oi9ff2Z9IWQ","size_24aac":0,"size_48aac":1377496,"size_96aac":2751018,"size_192ogg":4642877,"size_192aac":5480087,"size_128mp3":3620190,"size_320mp3":9049665,"size_ape":0,"size_flac":0,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2412920,"size_360ra":[],"size_dolby":0,"size_new":[115123902,0,0,7811148]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70146620,"mid":"000sdgZQ3yy1lT"},"volume":{"gain":-5.105,"peak":0.864,"lra":24.371},"label":"0","url":"","bpm":0,"version":3,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["062M8uXG1NaYxy","","","001b5yiJ1MxZBo",""],"vi":[5],"ktag":"0"},{"id":397702336,"type":0,"mid":"002atcdQ3W4vzJ","name":"Asongtoshawty","title":"Asongtoshawty","subtitle":"","singer":[{"id":7100453,"mid":"001ptrFp2l7SW1","name":"Sunrise1day","title":"Sunrise1day","type":0,"uin":0,"pmid":""}],"album":{"id":35624982,"mid":"000bsTr54bPj3N","name":"Asongtoshawty","title":"Asongtoshawty","subtitle":"","time_public":"2023-03-03","pmid":"000bsTr54bPj3N_2"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":191,"isonly":0,"language":0,"genre":34,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"002atcdQ3W4vzJ","size_24aac":0,"size_48aac":1164908,"size_96aac":2331275,"size_192ogg":4250370,"size_192aac":4633324,"size_128mp3":3057203,"size_320mp3":7642579,"size_ape":0,"size_flac":37008371,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2238301,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,7957782]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70146686,"mid":"004GlQ1E4Ss1GL"},"volume":{"gain":-5.58,"peak":0.621,"lra":4.615},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":65536,"es":"","vs":["","","","",""],"vi":[156],"ktag":"0"},{"id":398281022,"type":0,"mid":"003syVFh34ogJZ","name":"这不是我想要的生活","title":"这不是我想要的生活","subtitle":"","singer":[{"id":7829515,"mid":"003KOpQY00cIkg","name":"T.S.C.H.唐鑫","title":"T.S.C.H.唐鑫","type":0,"uin":0,"pmid":""}],"album":{"id":35749581,"mid":"002hFO873X4WeA","name":"单元剧（非正式IV）","title":"单元剧（非正式IV）","subtitle":"","time_public":"2023-03-03","pmid":"002hFO873X4WeA_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":358,"isonly":0,"language":0,"genre":36,"index_cd":0,"index_album":2,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"003syVFh34ogJZ","size_24aac":0,"size_48aac":2192559,"size_96aac":4376886,"size_192ogg":9019769,"size_192aac":8694186,"size_128mp3":5740485,"size_320mp3":14350208,"size_ape":0,"size_flac":45048747,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":4149974,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,15983730]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70146771,"mid":"001XnrP31fG4JD"},"volume":{"gain":-6.1,"peak":0.989,"lra":6.617},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":65536,"es":"","vs":["","","","",""],"vi":[156],"ktag":"0"},{"id":397956984,"type":0,"mid":"0020lIvB1QWo9l","name":"听清楚(I love you)Prod By YUSENISHERE","title":"听清楚(I love you)Prod By YUSENISHERE","subtitle":"","singer":[{"id":4700439,"mid":"001Eyi5c2JxwIL","name":"Ariesboy_Fiery","title":"Ariesboy_Fiery","type":0,"uin":0,"pmid":""}],"album":{"id":35679637,"mid":"002Hq7oj3Rhawy","name":"听清楚(I love you)","title":"听清楚(I love you)","subtitle":"","time_public":"2023-03-03","pmid":"002Hq7oj3Rhawy_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":135,"isonly":0,"language":0,"genre":34,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"0020lIvB1QWo9l","size_24aac":0,"size_48aac":827916,"size_96aac":1652098,"size_192ogg":3234379,"size_192aac":3276992,"size_128mp3":2164494,"size_320mp3":5410783,"size_ape":0,"size_flac":27173204,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":1633076,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,6021638]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70146716,"mid":"001cyexh3CZ9lE"},"volume":{"gain":-6.353,"peak":1,"lra":7.832},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":65536,"es":"","vs":["","","","",""],"vi":[156],"ktag":"0"},{"id":397870271,"type":0,"mid":"002izF4J44KhS5","name":"\u201c说唱歌手\u201d的独白","title":"\u201c说唱歌手\u201d的独白 (Prod by 524)","subtitle":"","singer":[{"id":3347868,"mid":"0018QYqp381tAD","name":"洛克特RocTe","title":"洛克特RocTe","type":0,"uin":0,"pmid":""}],"album":{"id":35581196,"mid":"003qVqaW0wlAVK","name":"窥","title":"窥","subtitle":"","time_public":"2023-02-28","pmid":"003qVqaW0wlAVK_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":77,"isonly":0,"language":0,"genre":34,"index_cd":0,"index_album":1,"time_public":"2023-02-28","status":0,"fnote":4009,"file":{"media_mid":"0038cOXP17GlWZ","size_24aac":0,"size_48aac":471386,"size_96aac":944359,"size_192ogg":1581578,"size_192aac":1874733,"size_128mp3":1233187,"size_320mp3":3082119,"size_ape":0,"size_flac":6703262,"size_dts":0,"size_try":481070,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":30000,"size_96ogg":798872,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,3055812]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":1,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16897281,"msgid":13,"alert":2,"icons":12992510,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70146704,"mid":"001Imyi44atjGb"},"volume":{"gain":-5.699,"peak":1,"lra":5.662},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":65536,"es":"","vs":["0647TB3M3fWkAQ","","","",""],"vi":[156],"ktag":"0"},{"id":398114162,"type":0,"mid":"001FYPWm3apngm","name":"弗丽嘉之羽","title":"弗丽嘉之羽","subtitle":"","singer":[{"id":12814642,"mid":"003PIWiJ1rHcA5","name":"AUSTIN S","title":"AUSTIN S","type":0,"uin":0,"pmid":""},{"id":9787923,"mid":"004NA3wQ4MMIhB","name":"Linawe很瞌睡","title":"Linawe很瞌睡","type":1,"uin":0,"pmid":""}],"album":{"id":35713067,"mid":"00042czI3nedWH","name":"弗丽嘉之羽","title":"弗丽嘉之羽","subtitle":"","time_public":"2023-02-27","pmid":"00042czI3nedWH_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":184,"isonly":0,"language":0,"genre":34,"index_cd":0,"index_album":1,"time_public":"2023-02-27","status":0,"fnote":4009,"file":{"media_mid":"001FYPWm3apngm","size_24aac":0,"size_48aac":1135668,"size_96aac":2274926,"size_192ogg":4140748,"size_192aac":4486036,"size_128mp3":2960199,"size_320mp3":7400179,"size_ape":0,"size_flac":39844687,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2081478,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,7578744]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69414229,"mid":"003tZMmf36n8DC"},"volume":{"gain":-9.024,"peak":0.954,"lra":1.822},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":65536,"es":"","vs":["","","","",""],"vi":[156],"ktag":"0"},{"id":398632384,"type":0,"mid":"0044lVCJ08eupi","name":"雨夜","title":"雨夜","subtitle":"","singer":[{"id":2241358,"mid":"003HxdGI0nhVsc","name":"V.R-","title":"V.R-","type":0,"uin":3158342242,"pmid":""},{"id":7578918,"mid":"0041Jhmg1k1kHF","name":"陈慧顽","title":"陈慧顽","type":0,"uin":0,"pmid":""}],"album":{"id":35803254,"mid":"002mXCpk2GNuI9","name":"雨夜","title":"雨夜","subtitle":"","time_public":"2023-03-02","pmid":"002mXCpk2GNuI9_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":242,"isonly":0,"language":0,"genre":34,"index_cd":0,"index_album":1,"time_public":"2023-03-02","status":0,"fnote":4009,"file":{"media_mid":"0044lVCJ08eupi","size_24aac":0,"size_48aac":1464022,"size_96aac":2927038,"size_192ogg":5106934,"size_192aac":5815431,"size_128mp3":3881361,"size_320mp3":9703114,"size_ape":0,"size_flac":47193693,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2653038,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,9770137]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69881876,"mid":"000EkxSq1pPZDx"},"volume":{"gain":-7.408,"peak":0.966,"lra":13.979},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":65536,"es":"","vs":["","","","",""],"vi":[156],"ktag":"0"},{"id":398145880,"type":0,"mid":"001BoGBR0wpC66","name":"逍遥","title":"逍遥","subtitle":"","singer":[{"id":4012408,"mid":"003sflKp4X2sqG","name":"韩潇Es","title":"韩潇Es","type":1,"uin":0,"pmid":""}],"album":{"id":35717862,"mid":"002noU0F2Zmwp0","name":"逍遥","title":"逍遥","subtitle":"","time_public":"2023-03-03","pmid":"002noU0F2Zmwp0_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":212,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"001BoGBR0wpC66","size_24aac":0,"size_48aac":1294230,"size_96aac":2608263,"size_192ogg":4792937,"size_192aac":5126516,"size_128mp3":3404469,"size_320mp3":8510505,"size_ape":0,"size_flac":22273917,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2437588,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,8234350]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70146735,"mid":"001Q3yWU2J6QpH"},"volume":{"gain":-7.436,"peak":0.978,"lra":9.699},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":2048,"es":"","vs":["","","","",""],"vi":[1197],"ktag":"0"},{"id":398588419,"type":0,"mid":"003xohe54baWau","name":"自我矛盾","title":"自我矛盾","subtitle":"","singer":[{"id":7118859,"mid":"0032LhHw48kMIF","name":"陈奕楠","title":"陈奕楠","type":1,"uin":0,"pmid":""}],"album":{"id":35795871,"mid":"004bxTwO3UDGPh","name":"自我矛盾","title":"自我矛盾","subtitle":"","time_public":"2023-03-03","pmid":"004bxTwO3UDGPh_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":192,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"003xohe54baWau","size_24aac":0,"size_48aac":1175749,"size_96aac":2355718,"size_192ogg":4057414,"size_192aac":4633672,"size_128mp3":3075814,"size_320mp3":7689602,"size_ape":0,"size_flac":37626900,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2087244,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,6940470]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70146722,"mid":"003CHs1A4a03rq"},"volume":{"gain":-6.054,"peak":0.982,"lra":10.268},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["","","","",""],"vi":[3658230],"ktag":"0"},{"id":398596004,"type":0,"mid":"0037Qvxf28Ar9s","name":"不久以后","title":"不久以后","subtitle":"","singer":[{"id":13264214,"mid":"002Z6Kt4074bbL","name":"吴百萬Million Wu","title":"吴百萬Million Wu","type":0,"uin":0,"pmid":""}],"album":{"id":35796978,"mid":"001dNxqD0RgLa9","name":"不久以后","title":"不久以后","subtitle":"","time_public":"2023-03-02","pmid":"001dNxqD0RgLa9_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":172,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-02","status":0,"fnote":4009,"file":{"media_mid":"0037Qvxf28Ar9s","size_24aac":0,"size_48aac":1047943,"size_96aac":2096921,"size_192ogg":4150218,"size_192aac":4185084,"size_128mp3":2761256,"size_320mp3":6902493,"size_ape":0,"size_flac":39116011,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2033731,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,7623397]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69882001,"mid":"0025npNb0TxH1C"},"volume":{"gain":-9.218,"peak":0.984,"lra":7.439},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":2048,"es":"","vs":["","","","",""],"vi":[33389],"ktag":"0"},{"id":398756564,"type":0,"mid":"001dsgZL4UG8H1","name":"请别爱我了","title":"请别爱我了","subtitle":"","singer":[{"id":7312556,"mid":"001JulMq0sO5Bg","name":"泡芙芙Scarlett","title":"泡芙芙Scarlett","type":1,"uin":0,"pmid":""}],"album":{"id":35837209,"mid":"003EyGBb0jBpeK","name":"请别爱我了","title":"请别爱我了","subtitle":"","time_public":"2023-03-02","pmid":"003EyGBb0jBpeK_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":217,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-02","status":0,"fnote":4009,"file":{"media_mid":"001dsgZL4UG8H1","size_24aac":0,"size_48aac":1325700,"size_96aac":2654576,"size_192ogg":4777028,"size_192aac":5269110,"size_128mp3":3488505,"size_320mp3":8720416,"size_ape":0,"size_flac":23090666,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2467734,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,8463506]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70085641,"mid":"001gZ68z0bqBHB"},"volume":{"gain":-8.31,"peak":0.966,"lra":9.356},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["","","","",""],"vi":[3350070],"ktag":"0"},{"id":398796698,"type":0,"mid":"002cuRrX0Q7dNY","name":"一个人想着一个人","title":"一个人想着一个人 (吉他版)","subtitle":"","singer":[{"id":5546799,"mid":"002xzokf2gBD7R","name":"派美眉","title":"派美眉","type":1,"uin":1976738837,"pmid":""}],"album":{"id":35842072,"mid":"004SeVsn46MGNh","name":"一个人想着一个人 (吉他版)","title":"一个人想着一个人 (吉他版)","subtitle":"","time_public":"2023-03-02","pmid":"004SeVsn46MGNh_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":195,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-02","status":0,"fnote":4009,"file":{"media_mid":"002cuRrX0Q7dNY","size_24aac":0,"size_48aac":1201990,"size_96aac":2411824,"size_192ogg":4368304,"size_192aac":4771290,"size_128mp3":3136173,"size_320mp3":7840095,"size_ape":0,"size_flac":39916743,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2197726,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,7412450]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70106077,"mid":"001fzEqY40xYcb"},"volume":{"gain":-4.785,"peak":0.95,"lra":5.051},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["","","","",""],"vi":[3350070],"ktag":"0"},{"id":398614226,"type":0,"mid":"001oqHyS1OjZY5","name":"小狗","title":"小狗","subtitle":"","singer":[{"id":6660543,"mid":"000B5wGl14nUTk","name":"cici_","title":"cici_","type":1,"uin":1378040246,"pmid":""}],"album":{"id":35799314,"mid":"001n0xrs0ykpIH","name":"小狗","title":"小狗","subtitle":"","time_public":"2023-03-03","pmid":"001n0xrs0ykpIH_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":214,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"001oqHyS1OjZY5","size_24aac":0,"size_48aac":1306748,"size_96aac":2610542,"size_192ogg":4885157,"size_192aac":5178689,"size_128mp3":3425369,"size_320mp3":8563132,"size_ape":0,"size_flac":23281494,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2462035,"size_360ra":[],"size_dolby":0,"size_new":[139561239,20915621,53846900,8381826]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70146728,"mid":"001CVPpI39OANa"},"volume":{"gain":-5.93,"peak":1,"lra":13.62},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["","","","001noZWJ1pxlMM","002qXz6d1aqIHf"],"vi":[3658230],"ktag":"0"},{"id":398586889,"type":0,"mid":"001P2UXG2TJc2i","name":"三月三的故事","title":"三月三的故事","subtitle":"","singer":[{"id":5440501,"mid":"003W9kuM3w0wJZ","name":"一颗狼星","title":"一颗狼星","type":1,"uin":1850158333,"pmid":""},{"id":3245177,"mid":"001fYDDN1M3LA6","name":"朝歌夜弦","title":"朝歌夜弦","type":2,"uin":0,"pmid":""}],"album":{"id":35795618,"mid":"002jvyb53JKYKL","name":"三月三的故事","title":"三月三的故事","subtitle":"","time_public":"2023-03-03","pmid":"002jvyb53JKYKL_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":226,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"001P2UXG2TJc2i","size_24aac":0,"size_48aac":1397410,"size_96aac":2786634,"size_192ogg":5343649,"size_192aac":5492818,"size_128mp3":3621824,"size_320mp3":9054249,"size_ape":0,"size_flac":47553198,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2700579,"size_360ra":[],"size_dolby":0,"size_new":[155422357,23338038,61072661,9090133]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70146738,"mid":"001QD9sQ2jSZQr"},"volume":{"gain":-9.199,"peak":0.992,"lra":8.923},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":2048,"es":"","vs":["","","","002tVwfP3CvGxV","003MHYRP1B80i1"],"vi":[103596],"ktag":"0"},{"id":398614257,"type":0,"mid":"003mwcJT4J3c5W","name":"义无反顾爱你","title":"义无反顾爱你 (DJ阿哲版)","subtitle":"","singer":[{"id":89698,"mid":"003Cn3Yh16q1MO","name":"庄心妍","title":"庄心妍","type":1,"uin":0,"pmid":""}],"album":{"id":35799312,"mid":"002eBqN90S4BHu","name":"义无反顾爱你 (DJ阿哲版)","title":"义无反顾爱你 (DJ阿哲版)","subtitle":"","time_public":"2023-03-02","pmid":"002eBqN90S4BHu_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":165,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-02","status":0,"fnote":4009,"file":{"media_mid":"003mwcJT4J3c5W","size_24aac":0,"size_48aac":995693,"size_96aac":1988544,"size_192ogg":3776553,"size_192aac":3960255,"size_128mp3":2656352,"size_320mp3":6640548,"size_ape":0,"size_flac":35266540,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":1879457,"size_360ra":[],"size_dolby":0,"size_new":[128427269,20744162,51828308,6682698]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69879612,"mid":"001tUnyr2rFIld"},"volume":{"gain":-8.148,"peak":0.916,"lra":2.535},"label":"0","url":"","bpm":0,"version":28,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["","","","002HnyZf2ldQMa","0022LPmo1LwbWU"],"vi":[35432],"ktag":"0"},{"id":398349705,"type":0,"mid":"0017LWTf3vzzXL","name":"越界","title":"越界 (情结版)","subtitle":"","singer":[{"id":8470139,"mid":"000LDsSo1RAn0s","name":"你们的好朋友大雨","title":"你们的好朋友大雨","type":1,"uin":0,"pmid":""}],"album":{"id":35756819,"mid":"000VojZ64KZvGk","name":"越界 (情结版)","title":"越界 (情结版)","subtitle":"","time_public":"2023-03-02","pmid":"000VojZ64KZvGk_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":239,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-02","status":0,"fnote":4009,"file":{"media_mid":"0017LWTf3vzzXL","size_24aac":0,"size_48aac":1478757,"size_96aac":2964921,"size_192ogg":5074432,"size_192aac":5808302,"size_128mp3":3839167,"size_320mp3":9597599,"size_ape":0,"size_flac":46124254,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2628206,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,8727307]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70085643,"mid":"002FoIMD0fbJZE"},"volume":{"gain":-6.052,"peak":1,"lra":15.877},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":2048,"es":"","vs":["","","","",""],"vi":[3350070],"ktag":"0"},{"id":397839376,"type":0,"mid":"002voG3L4aPUT3","name":"你随风划过像一场烟火","title":"你随风划过像一场烟火","subtitle":"","singer":[{"id":5615016,"mid":"002h5yyN14BjhB","name":"汪应骏","title":"汪应骏","type":0,"uin":0,"pmid":""},{"id":10631935,"mid":"003yrgff1F6hVS","name":"王妙可milk","title":"王妙可milk","type":1,"uin":0,"pmid":""}],"album":{"id":35654988,"mid":"003TONWO1Uqm6U","name":"你随风划过像一场烟火","title":"你随风划过像一场烟火","subtitle":"","time_public":"2023-03-02","pmid":"003TONWO1Uqm6U_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":210,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-02","status":0,"fnote":4009,"file":{"media_mid":"002voG3L4aPUT3","size_24aac":0,"size_48aac":1280914,"size_96aac":2561300,"size_192ogg":4874931,"size_192aac":5087916,"size_128mp3":3364793,"size_320mp3":8411650,"size_ape":0,"size_flac":22065851,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2461047,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,8785232]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70085636,"mid":"000ohp1C0FDgxB"},"volume":{"gain":-6.515,"peak":0.966,"lra":10.614},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":2048,"es":"","vs":["","","","",""],"vi":[3350070],"ktag":"0"},{"id":398552962,"type":0,"mid":"0006IdCb4UoU1m","name":"可能","title":"可能","subtitle":"","singer":[{"id":4775092,"mid":"003H6saT14kM2H","name":"洪思雨","title":"洪思雨","type":1,"uin":508733276,"pmid":""}],"album":{"id":35790859,"mid":"003VVKyO1Ti8mo","name":"可能","title":"可能","subtitle":"","time_public":"2023-03-02","pmid":"003VVKyO1Ti8mo_2"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":215,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-02","status":0,"fnote":4009,"file":{"media_mid":"0006IdCb4UoU1m","size_24aac":0,"size_48aac":1314140,"size_96aac":2631588,"size_192ogg":4876494,"size_192aac":5227124,"size_128mp3":3450443,"size_320mp3":8625822,"size_ape":0,"size_flac":44610196,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2525607,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,8200985]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70085640,"mid":"002AllRz3zYSGL"},"volume":{"gain":-7.715,"peak":1,"lra":11.462},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":2048,"es":"","vs":["","","","",""],"vi":[3350070],"ktag":"0"},{"id":398145817,"type":0,"mid":"002tSi5Y3QxvLS","name":"北海道没有雪","title":"北海道没有雪","subtitle":"","singer":[{"id":11607873,"mid":"0023tsR3352Af5","name":"王新杨","title":"王新杨","type":0,"uin":0,"pmid":""}],"album":{"id":35717844,"mid":"0011ja7s2bc35H","name":"北海道没有雪","title":"北海道没有雪","subtitle":"","time_public":"2023-03-02","pmid":"0011ja7s2bc35H_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":281,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-02","status":0,"fnote":4009,"file":{"media_mid":"002tSi5Y3QxvLS","size_24aac":0,"size_48aac":1722998,"size_96aac":3460897,"size_192ogg":6600380,"size_192aac":6819806,"size_128mp3":4512911,"size_320mp3":11281969,"size_ape":0,"size_flac":31761253,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":3265017,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,11542866]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69881862,"mid":"001htB6X1hBSqt"},"volume":{"gain":-8.792,"peak":0.988,"lra":10.433},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":2048,"es":"","vs":["","","","",""],"vi":[1197],"ktag":"0"},{"id":398145874,"type":0,"mid":"0031iEgs4GVTvy","name":"反正我在北京","title":"反正我在北京","subtitle":"","singer":[{"id":2063799,"mid":"001C4GhB1YPjvn","name":"秦洋","title":"秦洋","type":1,"uin":0,"pmid":""}],"album":{"id":35717858,"mid":"00227JCS1NBjxJ","name":"反正我在北京","title":"反正我在北京","subtitle":"","time_public":"2023-03-02","pmid":"00227JCS1NBjxJ_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":244,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-02","status":0,"fnote":4009,"file":{"media_mid":"0031iEgs4GVTvy","size_24aac":0,"size_48aac":1492902,"size_96aac":2983091,"size_192ogg":5702999,"size_192aac":5926913,"size_128mp3":3917317,"size_320mp3":9792987,"size_ape":0,"size_flac":28833363,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2884167,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,9981243]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69881881,"mid":"000Szhds3RKydI"},"volume":{"gain":-7.159,"peak":0.993,"lra":7.643},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":2048,"es":"","vs":["","","","",""],"vi":[1197],"ktag":"0"},{"id":398587947,"type":0,"mid":"001fdY2j3tziKi","name":"是否应该放手","title":"是否应该放手","subtitle":"","singer":[{"id":3628398,"mid":"002HvPeo0t89Qj","name":"大笨","title":"大笨","type":0,"uin":0,"pmid":""}],"album":{"id":35795783,"mid":"0023GL8f00sqg5","name":"是否应该放手","title":"是否应该放手","subtitle":"","time_public":"2023-03-02","pmid":"0023GL8f00sqg5_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":214,"isonly":0,"language":1,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-02","status":0,"fnote":4009,"file":{"media_mid":"001fdY2j3tziKi","size_24aac":0,"size_48aac":1305757,"size_96aac":2613951,"size_192ogg":5119364,"size_192aac":5197014,"size_128mp3":3434156,"size_320mp3":8585085,"size_ape":0,"size_flac":46602558,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2524638,"size_360ra":[],"size_dolby":0,"size_new":[0,24823519,61675283,8758251]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69881895,"mid":"002hQu7z1lBy6e"},"volume":{"gain":-9.905,"peak":1,"lra":5.317},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":2048,"es":"","vs":["","","","","000RfCSQ3er9w5"],"vi":[7389],"ktag":"0"},{"id":398165188,"type":0,"mid":"004NwKLv0dxFrK","name":"其实后来的我们","title":"其实后来的我们","subtitle":"","singer":[{"id":2801700,"mid":"002MLPRR2213c3","name":"黄恩娜","title":"黄恩娜","type":1,"uin":0,"pmid":""}],"album":{"id":35721079,"mid":"0043SH8p1yKuJ9","name":"其实后来的我们","title":"其实后来的我们","subtitle":"","time_public":"2023-03-02","pmid":"0043SH8p1yKuJ9_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":253,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-02","status":0,"fnote":4009,"file":{"media_mid":"004NwKLv0dxFrK","size_24aac":0,"size_48aac":1530494,"size_96aac":3062596,"size_192ogg":5504633,"size_192aac":6084522,"size_128mp3":4061937,"size_320mp3":10154528,"size_ape":0,"size_flac":52399135,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2811595,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,9632129]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69881890,"mid":"004XVgvc3R3lys"},"volume":{"gain":-9.759,"peak":0.999,"lra":13.454},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":2048,"es":"","vs":["","","","",""],"vi":[69511],"ktag":"0"},{"id":398045603,"type":0,"mid":"000qC6N23FHw3C","name":"落空","title":"落空","subtitle":"","singer":[{"id":3535961,"mid":"002EU6c005M3L1","name":"李飘飘","title":"李飘飘","type":0,"uin":1044457698,"pmid":""}],"album":{"id":35699729,"mid":"003P1HfB41NQbX","name":"落空","title":"落空","subtitle":"","time_public":"2023-02-26","pmid":"003P1HfB41NQbX_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":240,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-02-26","status":0,"fnote":4009,"file":{"media_mid":"000qC6N23FHw3C","size_24aac":0,"size_48aac":1474250,"size_96aac":2961327,"size_192ogg":5026752,"size_192aac":5866429,"size_128mp3":3854609,"size_320mp3":9636239,"size_ape":0,"size_flac":42846113,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2607997,"size_360ra":[],"size_dolby":0,"size_new":[153035628,22535559,58741252,9650085]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69287613,"mid":"002LZ97o3tM6pi"},"volume":{"gain":-7.04,"peak":0.966,"lra":8.192},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":2048,"es":"","vs":["","","","003tJG4z1JiBWl","000FyroX0ipkWd"],"vi":[103596],"ktag":"0"},{"id":398586882,"type":0,"mid":"000av8xh1pO88F","name":"谢谢你","title":"谢谢你","subtitle":"","singer":[{"id":5037426,"mid":"002ul7D70CpXpI","name":"小乐哥（王唯乐）","title":"小乐哥（王唯乐）","type":0,"uin":0,"pmid":""}],"album":{"id":35795617,"mid":"000q5hVR2YR8WC","name":"谢谢你","title":"谢谢你","subtitle":"","time_public":"2023-03-02","pmid":"000q5hVR2YR8WC_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":257,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-02","status":0,"fnote":4009,"file":{"media_mid":"000av8xh1pO88F","size_24aac":0,"size_48aac":1569117,"size_96aac":3140331,"size_192ogg":5572065,"size_192aac":6225181,"size_128mp3":4122117,"size_320mp3":10304987,"size_ape":0,"size_flac":25895187,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2886097,"size_360ra":[],"size_dolby":0,"size_new":[166105691,25032277,64333057,9772085]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69881839,"mid":"004BhM7n24zpwa"},"volume":{"gain":-9.73,"peak":1,"lra":15.46},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":2048,"es":"","vs":["","","","002nsZ8v4bSxMz","003Vr0864QBW8t"],"vi":[103596],"ktag":"0"},{"id":398146177,"type":0,"mid":"003aaG1V3eERb0","name":"模仿她","title":"模仿她","subtitle":"","singer":[{"id":1487264,"mid":"002FheWK0LSMMY","name":"于冬然","title":"于冬然","type":1,"uin":0,"pmid":""}],"album":{"id":35717931,"mid":"0001wW3I2ICBb0","name":"模仿她","title":"模仿她","subtitle":"","time_public":"2023-03-01","pmid":"0001wW3I2ICBb0_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":205,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-01","status":0,"fnote":4009,"file":{"media_mid":"003aaG1V3eERb0","size_24aac":0,"size_48aac":1233807,"size_96aac":2477090,"size_192ogg":4435308,"size_192aac":4902020,"size_128mp3":3287443,"size_320mp3":8218316,"size_ape":0,"size_flac":39654568,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2232484,"size_360ra":[],"size_dolby":0,"size_new":[128161550,19835859,50776222,7498730]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69835001,"mid":"004IaSOP2QqCXa"},"volume":{"gain":-9.654,"peak":1,"lra":18.858},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":2048,"es":"","vs":["","","","000qU36y0PJqTb","001VPpNj2cm58I"],"vi":[69511],"ktag":"0"},{"id":398148894,"type":0,"mid":"0003bB8238r7sk","name":"寄君一曲","title":"寄君一曲","subtitle":"","singer":[{"id":950203,"mid":"001sArBx4Gx9lP","name":"执素兮","title":"执素兮","type":1,"uin":41577995,"pmid":""}],"album":{"id":35718395,"mid":"002CISiC0wuIQq","name":"寄君一曲","title":"寄君一曲","subtitle":"","time_public":"2023-03-01","pmid":"002CISiC0wuIQq_2"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":228,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-01","status":0,"fnote":4009,"file":{"media_mid":"0003bB8238r7sk","size_24aac":0,"size_48aac":1388586,"size_96aac":2780789,"size_192ogg":5272422,"size_192aac":5528050,"size_128mp3":3656087,"size_320mp3":9139498,"size_ape":0,"size_flac":0,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2609703,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,8922582]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69835023,"mid":"004CbomZ03DYgc"},"volume":{"gain":-7.806,"peak":1,"lra":10.894},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":2048,"es":"","vs":["","","","",""],"vi":[69511],"ktag":"0"},{"id":398148476,"type":0,"mid":"0045E1N617MSQM","name":"忘了没有","title":"忘了没有","subtitle":"","singer":[{"id":5904756,"mid":"0021RwVb0FCFRN","name":"羊羊","title":"羊羊","type":1,"uin":0,"pmid":""}],"album":{"id":35718304,"mid":"004dlTGY4AcWjn","name":"忘了没有","title":"忘了没有","subtitle":"","time_public":"2023-03-01","pmid":"004dlTGY4AcWjn_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":254,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-01","status":0,"fnote":4009,"file":{"media_mid":"0045E1N617MSQM","size_24aac":0,"size_48aac":1545319,"size_96aac":3114602,"size_192ogg":5840000,"size_192aac":6132244,"size_128mp3":4075298,"size_320mp3":10187481,"size_ape":0,"size_flac":50541273,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2914533,"size_360ra":[],"size_dolby":0,"size_new":[158886997,24462954,62810622,9815176]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69835034,"mid":"002ATWSY0T81rk"},"volume":{"gain":-6.808,"peak":1,"lra":17.393},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":2048,"es":"","vs":["","","","002OIPef3AmbgC","003P74uJ0iMHJf"],"vi":[3350070],"ktag":"0"}],"ret_msg":"","type":5,"songTagInfoList":[{"id":398722411,"tag":"独家首发30天","link":"","tagid":4016,"from_type":11},{"id":398782831,"tag":"独家首发30天","link":"","tagid":4016,"from_type":11},{"id":398738782,"tag":"独家首发30天","link":"","tagid":4016,"from_type":11},{"id":398716735,"tag":"独家首发30天","link":"","tagid":4016,"from_type":11},{"id":398716736,"tag":"独家首发30天","link":"","tagid":4016,"from_type":11},{"id":398716734,"tag":"独家首发30天","link":"","tagid":4016,"from_type":11},{"id":398291248,"tag":"独家首发30天","link":"","tagid":4016,"from_type":11},{"id":398133237,"tag":"独家首发30天","link":"","tagid":4016,"from_type":11},{"id":398801978,"tag":"独家首发3天","link":"","tagid":4010,"from_type":11},{"id":398916882,"tag":"独家首发30天","link":"","tagid":4016,"from_type":11},{"id":398790361,"tag":"独家首发30天","link":"","tagid":4016,"from_type":11}]}
             */

            private int code;
            private DataBeanXXX data;

            public int getCode() {
                return code;
            }

            public void setCode(int code) {
                this.code = code;
            }

            public DataBeanXXX getData() {
                return data;
            }

            public void setData(DataBeanXXX data) {
                this.data = data;
            }

            public static class DataBeanXXX {
                /**
                 * lanlist : [{"name":"new_song","lan":"最新","type":5,"tjreport":"10_0_0_1_10001_5"},{"name":"neidi","lan":"内地","type":1,"tjreport":"10_0_0_2_10001_1"},{"name":"gangtai","lan":"港台","type":6,"tjreport":"10_0_0_3_10001_6"},{"name":"oumei","lan":"欧美","type":2,"tjreport":"10_0_0_4_10001_2"},{"name":"hanguo","lan":"韩国","type":4,"tjreport":"10_0_0_5_10001_4"},{"name":"riben","lan":"日本","type":3,"tjreport":"10_0_0_6_10001_3"}]
                 * lan : 最新
                 * songlist : [{"id":398800936,"type":0,"mid":"000zCeON1E0Ybr","name":"爱在时光里","title":"爱在时光里","subtitle":"","singer":[{"id":4449,"mid":"001a1vdk1ZAqmf","name":"苏有朋","title":"苏有朋","type":0,"uin":0,"pmid":""}],"album":{"id":35842789,"mid":"003lEUpK48PbGp","name":"爱在时光里","title":"爱在时光里","subtitle":"","time_public":"2023-03-03","pmid":"003lEUpK48PbGp_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":196,"isonly":0,"language":0,"genre":0,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"000zCeON1E0Ybr","size_24aac":0,"size_48aac":1195048,"size_96aac":2392491,"size_192ogg":4454861,"size_192aac":4753721,"size_128mp3":3147016,"size_320mp3":7867238,"size_ape":0,"size_flac":21579311,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2238786,"size_360ra":[],"size_dolby":0,"size_new":[136260058,21173068,55371673,8277431]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70290951,"mid":"002ilDK20jwnKy"},"volume":{"gain":-8.384,"peak":0.955,"lra":15.364},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["060gvsec3CspML","","","002eNYY21sSwmY","002Bgd722QQjjv"],"vi":[4254103],"ktag":"0"},{"id":398722411,"type":0,"mid":"001TjZmL0XBiH8","name":"蔓延","title":"蔓延","subtitle":"","singer":[{"id":1113420,"mid":"002ykHF42AYnsl","name":"许魏洲","title":"许魏洲","type":0,"uin":0,"pmid":""}],"album":{"id":35829280,"mid":"003tEpkX2i6UZC","name":"蔓延","title":"蔓延","subtitle":"","time_public":"2023-03-03","pmid":"003tEpkX2i6UZC_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":224,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"001TjZmL0XBiH8","size_24aac":0,"size_48aac":1371138,"size_96aac":2740371,"size_192ogg":5336111,"size_192aac":5452315,"size_128mp3":3596728,"size_320mp3":8991521,"size_ape":0,"size_flac":48106707,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2728068,"size_360ra":[],"size_dolby":0,"size_new":[173495552,27458424,69990644,9274764]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70294170,"mid":"000AMVsP0yFERK"},"volume":{"gain":-10.925,"peak":0.978,"lra":4.782},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["060QCwF74S8nID","","","002dosCT2Jbprt","002coEV52jzkhf"],"vi":[89286],"ktag":"0"},{"id":398368264,"type":0,"mid":"002h8Ycn48Q9wG","name":"我有一棵树","title":"我有一棵树","subtitle":"","singer":[{"id":38,"mid":"002seUhN1Akj7J","name":"李圣杰","title":"李圣杰","type":0,"uin":0,"pmid":""}],"album":{"id":35762702,"mid":"001YaXOr4Kv8lt","name":"我有一棵树","title":"我有一棵树","subtitle":"","time_public":"2023-03-03","pmid":"001YaXOr4Kv8lt_2"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":259,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"002h8Ycn48Q9wG","size_24aac":0,"size_48aac":1567273,"size_96aac":3136762,"size_192ogg":6046587,"size_192aac":6240322,"size_128mp3":4149700,"size_320mp3":10373949,"size_ape":0,"size_flac":54541808,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2967014,"size_360ra":[],"size_dolby":0,"size_new":[176442340,26624046,69421213,10836767]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70146744,"mid":"001KOv1B072tAr"},"volume":{"gain":-8.533,"peak":0.995,"lra":15.203},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["063qOou32g0N3R","","","001W2p9q3xirTz","000WZTLy4f8Qeo"],"vi":[3],"ktag":"0"},{"id":397069614,"type":0,"mid":"002pNkfQ0aJg4s","name":"黑色领结 (Nuance) [feat. 陈婧霏]","title":"黑色领结 (Nuance) [feat. 陈婧霏]","subtitle":"","singer":[{"id":365740,"mid":"002HRSkP17GCwL","name":"Alec Benjamin","title":"Alec Benjamin","type":0,"uin":0,"pmid":""},{"id":2095617,"mid":"002a81Ht1RVn1m","name":"陈婧霏","title":"陈婧霏","type":1,"uin":0,"pmid":""}],"album":{"id":35489739,"mid":"0041mvZp0JYleW","name":"黑色领结 (Nuance) [feat. 陈婧霏]","title":"黑色领结 (Nuance) [feat. 陈婧霏]","subtitle":"","time_public":"2023-02-28","pmid":"0041mvZp0JYleW_2"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":172,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-02-28","status":0,"fnote":4009,"file":{"media_mid":"0004IVtH1wfI3Z","size_24aac":0,"size_48aac":1048832,"size_96aac":2100945,"size_192ogg":3573987,"size_192aac":4147303,"size_128mp3":2767191,"size_320mp3":6917526,"size_ape":0,"size_flac":36239374,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":1864253,"size_360ra":[],"size_dolby":0,"size_new":[123809386,18648585,49602332,6436836]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69821294,"mid":"0007PzuF2ujRSH"},"volume":{"gain":-10.023,"peak":1,"lra":9.386},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":1024,"es":"","vs":["063znaET0FpDwP","","","0019eYIV49fYnh","003HbTLX0JtOTj"],"vi":[3],"ktag":"0"},{"id":396246968,"type":0,"mid":"004VylEj2KB1Zq","name":"木曜日のスキャンダル","title":"木曜日のスキャンダル (星期四的绯闻)","subtitle":"","singer":[{"id":181306,"mid":"001lKTAD4MBEMR","name":"HoneyWorks","title":"HoneyWorks","type":2,"uin":0,"pmid":""},{"id":165909,"mid":"004gbK7Y0nL8I8","name":"雨宮天","title":"雨宮天 (あまみや そら)","type":1,"uin":0,"pmid":""}],"album":{"id":35324858,"mid":"0008oj8t2X0cAn","name":"木曜日のスキャンダル","title":"木曜日のスキャンダル","subtitle":"","time_public":"2023-03-02","pmid":"0008oj8t2X0cAn_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":224,"isonly":0,"language":3,"genre":51,"index_cd":0,"index_album":1,"time_public":"2023-03-02","status":0,"fnote":4009,"file":{"media_mid":"004VylEj2KB1Zq","size_24aac":0,"size_48aac":1359561,"size_96aac":2715875,"size_192ogg":5562025,"size_192aac":5398730,"size_128mp3":3600118,"size_320mp3":8999942,"size_ape":0,"size_flac":0,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2696989,"size_360ra":[],"size_dolby":0,"size_new":[178667975,28124381,73584549,9924723]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69881803,"mid":"003WDHTR0eqXYB"},"volume":{"gain":-11.802,"peak":1,"lra":4.182},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["061dZJmy1FIpR1","","","004HzY6j3dPaY8","0049FQLi4Pd1lH"],"vi":[5],"ktag":"0"},{"id":398630701,"type":0,"mid":"000yDpKx3X8B9l","name":"万人之间","title":"万人之间","subtitle":"电视剧《许你万家灯火》主题曲及片尾曲","singer":[{"id":6499,"mid":"002azErJ0UcDN6","name":"张杰","title":"张杰","type":0,"uin":0,"pmid":""}],"album":{"id":35800403,"mid":"000d8x3W1TsLsj","name":"许你万家灯火影视剧原声带","title":"许你万家灯火影视剧原声带","subtitle":"电视剧《许你万家灯火》主题曲及片尾曲","time_public":"2023-03-03","pmid":"000d8x3W1TsLsj_1"},"mv":{"id":2060954,"vid":"000IxrfB4YKiFg","name":"","title":"","vt":0},"interval":240,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"000yDpKx3X8B9l","size_24aac":0,"size_48aac":1469143,"size_96aac":2943520,"size_192ogg":5383759,"size_192aac":5826831,"size_128mp3":3849616,"size_320mp3":9623722,"size_ape":0,"size_flac":49963783,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2680903,"size_360ra":[],"size_dolby":0,"size_new":[163882926,24717481,63937680,9324609]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70294171,"mid":"000Bnudk0qKko5"},"volume":{"gain":-9.851,"peak":0.983,"lra":12.914},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":1024,"es":"","vs":["","","","004ZDYNS0QNAPo","003i0tw32HPFYF"],"vi":[438083],"ktag":"0"},{"id":394122916,"type":0,"mid":"001rq9Gy2RedAc","name":"Tomorrow Never Comes","title":"Tomorrow Never Comes","subtitle":"","singer":[{"id":173914,"mid":"003AD17D4PYPFR","name":"Vicetone","title":"Vicetone","type":2,"uin":3620128193,"pmid":""}],"album":{"id":34963838,"mid":"001GUOmT1Bwuzv","name":"Tomorrow Never Comes","title":"Tomorrow Never Comes","subtitle":"","time_public":"2023-03-03","pmid":"001GUOmT1Bwuzv_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":177,"isonly":0,"language":5,"genre":20,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"001rq9Gy2RedAc","size_24aac":0,"size_48aac":1079418,"size_96aac":2161432,"size_192ogg":4322489,"size_192aac":4299176,"size_128mp3":2840304,"size_320mp3":7100353,"size_ape":0,"size_flac":37733419,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2172833,"size_360ra":[],"size_dolby":0,"size_new":[0,21389088,0,7378436]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70146615,"mid":"002n1ceM0s3VTt"},"volume":{"gain":-10.855,"peak":0.966,"lra":9.553},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":1040,"es":"","vs":["","","","","000lF94f01UOdg"],"vi":[95913],"ktag":"0"},{"id":398689589,"type":0,"mid":"001Ttu6Q0aesVo","name":"Here We Go Again","title":"Here We Go Again","subtitle":"","singer":[{"id":1276259,"mid":"002f6R2U0q4ucd","name":"Oliver Tree","title":"Oliver Tree","type":0,"uin":0,"pmid":""},{"id":965,"mid":"000gELB619OfVG","name":"David Guetta","title":"David Guetta","type":0,"uin":0,"pmid":""}],"album":{"id":35819186,"mid":"001CbYNG2DPisB","name":"Here We Go Again","title":"Here We Go Again","subtitle":"","time_public":"2023-03-03","pmid":"001CbYNG2DPisB_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":164,"isonly":0,"language":5,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"001Ttu6Q0aesVo","size_24aac":0,"size_48aac":999227,"size_96aac":2003154,"size_192ogg":3822612,"size_192aac":3978597,"size_128mp3":2633822,"size_320mp3":6584164,"size_ape":0,"size_flac":21274653,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":1907645,"size_360ra":[],"size_dolby":0,"size_new":[130586294,20143470,52793597,6604476]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16885507,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":0,"mid":""},"volume":{"gain":-10.642,"peak":0.989,"lra":4.524},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["064gY6nU2IgK9T","","","003zmHJZ3U0htx","003YfR2O3pM3gl"],"vi":[3],"ktag":"0"},{"id":395574957,"type":0,"mid":"004Cvqo84DRe4a","name":"灿烂的你","title":"灿烂的你","subtitle":"《不二兄弟》电影片尾曲","singer":[{"id":4605,"mid":"002LJqM93gNF52","name":"弦子","title":"弦子","type":1,"uin":0,"pmid":""}],"album":{"id":35162867,"mid":"002OrLAT3CDo2r","name":"灿烂的你","title":"灿烂的你","subtitle":"《不二兄弟》电影片尾曲","time_public":"2023-03-03","pmid":"002OrLAT3CDo2r_2"},"mv":{"id":2060229,"vid":"002euorE3k6HYo","name":"","title":"","vt":0},"interval":247,"isonly":0,"language":0,"genre":0,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"003FXKA02Cfzww","size_24aac":0,"size_48aac":1507122,"size_96aac":3017497,"size_192ogg":5440704,"size_192aac":5958511,"size_128mp3":3960777,"size_320mp3":9901649,"size_ape":0,"size_flac":47638000,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2719577,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,8853090]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70079065,"mid":"001RpAlL2gLXhg"},"volume":{"gain":-4.472,"peak":0.988,"lra":15.519},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":1024,"es":"","vs":["","","","",""],"vi":[9],"ktag":"0"},{"id":398782831,"type":0,"mid":"002P1RFU0Pe5gM","name":"不要劝我放下","title":"不要劝我放下","subtitle":"","singer":[{"id":11451,"mid":"000b7B7h1fXzaM","name":"苏醒AllenSu","title":"苏醒AllenSu","type":0,"uin":0,"pmid":""}],"album":{"id":35840482,"mid":"003zwqCS2jwBy3","name":"不要劝我放下","title":"不要劝我放下","subtitle":"","time_public":"2023-03-03","pmid":"003zwqCS2jwBy3_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":275,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"002P1RFU0Pe5gM","size_24aac":0,"size_48aac":1674379,"size_96aac":3351428,"size_192ogg":6008153,"size_192aac":6646792,"size_128mp3":4406343,"size_320mp3":11015532,"size_ape":0,"size_flac":54574675,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":3066927,"size_360ra":[],"size_dolby":0,"size_new":[173353699,25775847,67323373,10534143]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70078917,"mid":"004I10y9281P5E"},"volume":{"gain":-5.57,"peak":0.991,"lra":11.59},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":1024,"es":"","vs":["062NTElZ4XRx9i","","","002JeEEQ4KiHwo","003C57J31XtE9n"],"vi":[72064],"ktag":"0"},{"id":398799120,"type":0,"mid":"000TjeTG1pPJCx","name":"春风予你","title":"春风予你","subtitle":"","singer":[{"id":2749932,"mid":"00255EBh1FcAEk","name":"INTO1-刘宇","title":"INTO1-刘宇","type":0,"uin":0,"pmid":""}],"album":{"id":35842562,"mid":"004UhQT03dunra","name":"春风予你","title":"春风予你","subtitle":"","time_public":"2023-03-03","pmid":"004UhQT03dunra_1"},"mv":{"id":2060518,"vid":"002jybGA2xphpr","name":"","title":"","vt":0},"interval":221,"isonly":0,"language":0,"genre":0,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"000TjeTG1pPJCx","size_24aac":0,"size_48aac":1355364,"size_96aac":2719497,"size_192ogg":4885223,"size_192aac":5385340,"size_128mp3":3552443,"size_320mp3":8880795,"size_ape":0,"size_flac":22233556,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2551215,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,8266360]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70146731,"mid":"001jf1vk0q8WkS"},"volume":{"gain":-6.593,"peak":0.944,"lra":11.275},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":1024,"es":"","vs":["0617yttw1jZbHx","","","",""],"vi":[3974908],"ktag":"0"},{"id":398902242,"type":0,"mid":"001Vspul2oiYv8","name":"Red Ruby Da Sleeze","title":"Red Ruby Da Sleeze (Explicit)","subtitle":"","singer":[{"id":20710,"mid":"003kJN1r16tgOt","name":"Nicki Minaj","title":"Nicki Minaj","type":1,"uin":0,"pmid":""}],"album":{"id":35863013,"mid":"0044pGTj43aYDx","name":"Red Ruby Da Sleeze (Explicit)","title":"Red Ruby Da Sleeze (Explicit)","subtitle":"","time_public":"2023-03-03","pmid":"0044pGTj43aYDx_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":214,"isonly":0,"language":5,"genre":34,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"001Vspul2oiYv8","size_24aac":0,"size_48aac":1304155,"size_96aac":2613945,"size_192ogg":5161804,"size_192aac":5180800,"size_128mp3":3432572,"size_320mp3":8580994,"size_ape":0,"size_flac":0,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2552617,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,10512267]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16888579,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70329546,"mid":"004C8kXu3SQXxZ"},"volume":{"gain":-10.567,"peak":1,"lra":2.592},"label":"0","url":"","bpm":0,"version":15,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":1024,"es":"","vs":["","","","",""],"vi":[35],"ktag":"0"},{"id":398889662,"type":0,"mid":"003CAb6J19bEFy","name":"Still Alive","title":"Still Alive (From the Original Motion Picture Scream VI)","subtitle":"《惊声尖叫6》电影插曲","singer":[{"id":13168,"mid":"002G4iB42kFH8t","name":"Demi Lovato","title":"Demi Lovato","type":1,"uin":0,"pmid":""}],"album":{"id":35860522,"mid":"003ghumG2jL0PO","name":"Still Alive (From the Original Motion Picture Scream VI)","title":"Still Alive (From the Original Motion Picture Scream VI)","subtitle":"《惊声尖叫6》电影插曲","time_public":"2023-03-03","pmid":"003ghumG2jL0PO_1"},"mv":{"id":2060943,"vid":"001ke0SS05r3LE","name":"","title":"","vt":0},"interval":185,"isonly":0,"language":5,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"003CAb6J19bEFy","size_24aac":0,"size_48aac":1125829,"size_96aac":2248349,"size_192ogg":4385169,"size_192aac":4472565,"size_128mp3":2966170,"size_320mp3":7414928,"size_ape":0,"size_flac":0,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2186932,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,7929443]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16888579,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70275889,"mid":"002iUg4l06aL5u"},"volume":{"gain":-13.075,"peak":1,"lra":4.384},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["","","","",""],"vi":[35],"ktag":"0"},{"id":398775931,"type":0,"mid":"0001cHd116GHvs","name":"计划重逢","title":"计划重逢","subtitle":"《三国杀》老友季主题曲","singer":[{"id":4990,"mid":"002RDDXV2CJF5l","name":"南拳妈妈","title":"南拳妈妈","type":2,"uin":0,"pmid":""}],"album":{"id":35839147,"mid":"0037zzMN2yn5TX","name":"计划重逢","title":"计划重逢","subtitle":"《三国杀》老友季主题曲","time_public":"2023-03-03","pmid":"0037zzMN2yn5TX_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":206,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"0001cHd116GHvs","size_24aac":0,"size_48aac":1254482,"size_96aac":2509886,"size_192ogg":4842666,"size_192aac":4990130,"size_128mp3":3297062,"size_320mp3":8242355,"size_ape":0,"size_flac":46213845,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2471305,"size_360ra":[],"size_dolby":0,"size_new":[155839310,24770651,62441337,8629663]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70146734,"mid":"001pE4e82voAJw"},"volume":{"gain":-10.079,"peak":1,"lra":3.779},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":2048,"es":"","vs":["","","","0037kbNP211xGS","0032Z2rU41TafY"],"vi":[2817871],"ktag":"0"},{"id":398589105,"type":0,"mid":"004Aht5F47KP5Y","name":"海心沙","title":"海心沙","subtitle":"《黎明觉醒：生机》秀妍-曙光追梦曲","singer":[{"id":2141458,"mid":"000y6SVt4VkAzR","name":"傅菁","title":"傅菁","type":1,"uin":0,"pmid":""},{"id":13038872,"mid":"002AKILB0oo3Gs","name":"黎明觉醒：生机","title":"黎明觉醒：生机","type":3,"uin":0,"pmid":""}],"album":{"id":35795960,"mid":"000QJKw52CoNXx","name":"海心沙","title":"海心沙","subtitle":"《黎明觉醒：生机》秀妍-曙光追梦曲","time_public":"2023-03-03","pmid":"000QJKw52CoNXx_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":233,"isonly":0,"language":0,"genre":0,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"002Y42P439nChA","size_24aac":0,"size_48aac":1416567,"size_96aac":2834740,"size_192ogg":5240111,"size_192aac":5638568,"size_128mp3":3733821,"size_320mp3":9334265,"size_ape":0,"size_flac":46346846,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2706374,"size_360ra":[],"size_dolby":13072181,"size_new":[0,0,0,8869722]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70294163,"mid":"000wnvGD04qsEw"},"volume":{"gain":-9.227,"peak":0.964,"lra":10.968},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":2048,"es":"","vs":["064S0DG2136vYr","","","",""],"vi":[104548],"ktag":"0"},{"id":396628434,"type":0,"mid":"001aoR1n1pg89P","name":"长守岁宴","title":"长守岁宴","subtitle":"","singer":[{"id":947037,"mid":"003jUuqU2AhYos","name":"五音Jw","title":"五音Jw","type":0,"uin":0,"pmid":""}],"album":{"id":35393528,"mid":"003FJQl61y5C3V","name":"长守岁宴 (广播剧《琢玉》主题曲)","title":"长守岁宴 (广播剧《琢玉》主题曲)","subtitle":"","time_public":"2023-03-03","pmid":"003FJQl61y5C3V_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":248,"isonly":0,"language":0,"genre":37,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"001aoR1n1pg89P","size_24aac":0,"size_48aac":1514055,"size_96aac":3039191,"size_192ogg":5355129,"size_192aac":6020704,"size_128mp3":3969166,"size_320mp3":9922577,"size_ape":0,"size_flac":25737529,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2758684,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,9608739]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70294165,"mid":"002Kf17B4Ojah9"},"volume":{"gain":-7.835,"peak":1,"lra":13.487},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["","","","",""],"vi":[3997],"ktag":"0"},{"id":396247057,"type":0,"mid":"003VyHHq0MTqdq","name":"crossovers","title":"crossovers","subtitle":"日本竞马协会宣传片主题曲","singer":[{"id":33716,"mid":"0039EKtl4ec7wv","name":"Aimer","title":"Aimer (エメ)","type":1,"uin":0,"pmid":""}],"album":{"id":35324874,"mid":"002xsaRF4IlqUE","name":"escalate (Special Edition)","title":"escalate (Special Edition)","subtitle":"日本竞马协会宣传片主题曲","time_public":"2023-03-01","pmid":"002xsaRF4IlqUE_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":286,"isonly":0,"language":3,"genre":1,"index_cd":0,"index_album":3,"time_public":"2023-03-01","status":0,"fnote":4009,"file":{"media_mid":"003VyHHq0MTqdq","size_24aac":0,"size_48aac":1721296,"size_96aac":3442903,"size_192ogg":6576713,"size_192aac":6825818,"size_128mp3":4583598,"size_320mp3":11458609,"size_ape":0,"size_flac":0,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":3323138,"size_360ra":[],"size_dolby":0,"size_new":[206103135,32044562,83446338,11671580]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69685583,"mid":"002jcKXw1yqMPu"},"volume":{"gain":-10.482,"peak":1,"lra":7.446},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":17408,"es":"","vs":["062dJ32W2uPk7T","","","003KpFd633y4Ac","000x6kCT31UZqx"],"vi":[5],"ktag":"0"},{"id":398613214,"type":0,"mid":"002ixJD43B8oyj","name":"携长风予你","title":"携长风予你","subtitle":"未成年人检察主题曲","singer":[{"id":5979,"mid":"000we89k1hzBcA","name":"谭维维","title":"谭维维","type":1,"uin":0,"pmid":""}],"album":{"id":35799093,"mid":"002r5IIt1Uflfx","name":"携长风予你","title":"携长风予你","subtitle":"未成年人检察主题曲","time_public":"2023-03-02","pmid":"002r5IIt1Uflfx_1"},"mv":{"id":2060300,"vid":"002tOl7C03P8sw","name":"","title":"","vt":0},"interval":242,"isonly":0,"language":0,"genre":0,"index_cd":0,"index_album":1,"time_public":"2023-03-02","status":0,"fnote":4009,"file":{"media_mid":"002ixJD43B8oyj","size_24aac":0,"size_48aac":1475148,"size_96aac":2956188,"size_192ogg":5438071,"size_192aac":5842808,"size_128mp3":3876355,"size_320mp3":9690585,"size_ape":0,"size_flac":27027423,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2741563,"size_360ra":[],"size_dolby":0,"size_new":[0,25832627,67510014,9507156]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69992629,"mid":"002d4vsy2z4ANC"},"volume":{"gain":-7.104,"peak":1,"lra":9.837},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":17408,"es":"","vs":["0603xOHG0HnFy5","","","","002cQJKm3RavbQ"],"vi":[104548],"ktag":"0"},{"id":398181362,"type":0,"mid":"001rXSzk0PbKu8","name":"就这样长大","title":"就这样长大","subtitle":"","singer":[{"id":8355199,"mid":"000ezRzE1d5zBZ","name":"INTO1","title":"INTO1","type":2,"uin":0,"pmid":""}],"album":{"id":35724639,"mid":"000subKZ0ZLglo","name":"就这样长大\u2014\u2014INTO1'S WONDERLAND结","title":"就这样长大\u2014\u2014INTO1'S WONDERLAND结","subtitle":"","time_public":"2023-03-01","pmid":"000subKZ0ZLglo_2"},"mv":{"id":2060288,"vid":"000ZPH0M0fDUIi","name":"","title":"","vt":0},"interval":271,"isonly":0,"language":0,"genre":0,"index_cd":0,"index_album":1,"time_public":"2023-03-01","status":0,"fnote":4009,"file":{"media_mid":"001rXSzk0PbKu8","size_24aac":0,"size_48aac":1654697,"size_96aac":3310080,"size_192ogg":6751413,"size_192aac":6583395,"size_128mp3":4346605,"size_320mp3":10865801,"size_ape":0,"size_flac":60747036,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":3258514,"size_360ra":[],"size_dolby":0,"size_new":[201002168,31040798,78971327,11887111]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69797605,"mid":"004ga7nY2XYUQO"},"volume":{"gain":-9.758,"peak":1,"lra":6.666},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":17408,"es":"","vs":["","","","002Zztfs4AOt0C","001d2tB2269ctP"],"vi":[101521],"ktag":"0"},{"id":398282803,"type":0,"mid":"001e29BB2YSY2T","name":"雪 Distance","title":"雪 Distance","subtitle":"","singer":[{"id":2085196,"mid":"001eBoUt4SiKgg","name":"Capper","title":"Capper","type":0,"uin":0,"pmid":""},{"id":10783027,"mid":"002UCgsA0F2VHh","name":"罗言RollFlash","title":"罗言RollFlash","type":0,"uin":0,"pmid":""}],"album":{"id":35749818,"mid":"000t9S9F0dXtUA","name":"Uniconfication (Explicit)","title":"Uniconfication (Explicit)","subtitle":"","time_public":"2023-03-01","pmid":"000t9S9F0dXtUA_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":165,"isonly":0,"language":0,"genre":34,"index_cd":0,"index_album":11,"time_public":"2023-03-01","status":0,"fnote":4009,"file":{"media_mid":"001e29BB2YSY2T","size_24aac":0,"size_48aac":1011643,"size_96aac":2026742,"size_192ogg":4002155,"size_192aac":4025937,"size_128mp3":2657224,"size_320mp3":6642443,"size_ape":0,"size_flac":18274248,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2015419,"size_360ra":[],"size_dolby":0,"size_new":[115408947,17371207,45869585,7731593]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69685586,"mid":"000HAaVt0uuP0a"},"volume":{"gain":-9.162,"peak":0.975,"lra":5.773},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":16384,"es":"","vs":["","","","003YClkj1UObLr","000aZDMX0a4kiN"],"vi":[3997],"ktag":"0"},{"id":398768098,"type":0,"mid":"000amMJF06VXmc","name":"伤心太平洋","title":"伤心太平洋 (Live)","subtitle":"","singer":[{"id":62,"mid":"002cENGP2BtEVR","name":"任贤齐","title":"任贤齐","type":0,"uin":0,"pmid":""}],"album":{"id":35838491,"mid":"003OXczS1tvW9d","name":"百川乐时空","title":"百川乐时空","subtitle":"","time_public":"2023-03-03","pmid":"003OXczS1tvW9d_2"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":192,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"000amMJF06VXmc","size_24aac":0,"size_48aac":1181522,"size_96aac":2368361,"size_192ogg":4083924,"size_192aac":4675661,"size_128mp3":3084322,"size_320mp3":7710504,"size_ape":0,"size_flac":37719615,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2145747,"size_360ra":[],"size_dolby":0,"size_new":[127440828,0,0,6713700]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70315508,"mid":"003AL5k72YXCGL"},"volume":{"gain":-5.404,"peak":1,"lra":6.421},"label":"0","url":"","bpm":0,"version":3,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":1024,"es":"","vs":["060QpXkO0a26BL","","","004dPSYU1LgWhG",""],"vi":[91923],"ktag":"0"},{"id":398768093,"type":0,"mid":"004JMzYH13AiAv","name":"等待","title":"等待 (Live)","subtitle":"","singer":[{"id":210,"mid":"001nMsEp1RMsiO","name":"黄绮珊","title":"黄绮珊","type":1,"uin":0,"pmid":""}],"album":{"id":35838491,"mid":"003OXczS1tvW9d","name":"百川乐时空","title":"百川乐时空","subtitle":"","time_public":"2023-03-03","pmid":"003OXczS1tvW9d_2"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":311,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":3,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"004JMzYH13AiAv","size_24aac":0,"size_48aac":1906359,"size_96aac":3811134,"size_192ogg":6118493,"size_192aac":7522921,"size_128mp3":4987703,"size_320mp3":12468963,"size_ape":0,"size_flac":55577933,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":3324606,"size_360ra":[],"size_dolby":0,"size_new":[175293669,0,0,9876204]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70315362,"mid":"0038fr1b0Rit7Q"},"volume":{"gain":-7.19,"peak":1,"lra":20.129},"label":"0","url":"","bpm":0,"version":3,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":1024,"es":"","vs":["062Qjr2G2RKRJ2","","","000yVk3x2g8xsr",""],"vi":[91923],"ktag":"0"},{"id":398768091,"type":0,"mid":"002OZq8N39Zs2M","name":"约定","title":"约定 (Live)","subtitle":"","singer":[{"id":5116,"mid":"002wKZIw1fcghM","name":"周蕙","title":"周蕙","type":1,"uin":0,"pmid":""}],"album":{"id":35838491,"mid":"003OXczS1tvW9d","name":"百川乐时空","title":"百川乐时空","subtitle":"","time_public":"2023-03-03","pmid":"003OXczS1tvW9d_2"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":261,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":4,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"002OZq8N39Zs2M","size_24aac":0,"size_48aac":1593250,"size_96aac":3195427,"size_192ogg":5807133,"size_192aac":6284456,"size_128mp3":4180621,"size_320mp3":10450864,"size_ape":0,"size_flac":50761476,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2978621,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,9760183]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70314658,"mid":"000wLIfN4G9PJ8"},"volume":{"gain":-4.015,"peak":1,"lra":11.993},"label":"0","url":"","bpm":0,"version":3,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":1024,"es":"","vs":["060ze7Q047FZES","","","",""],"vi":[91923],"ktag":"0"},{"id":398363729,"type":0,"mid":"003yddlE2Z0TsO","name":"Insanity","title":"Insanity","subtitle":"","singer":[{"id":972981,"mid":"0020hNzE3kGP45","name":"ILLENIUM","title":"ILLENIUM","type":0,"uin":0,"pmid":""},{"id":6518627,"mid":"0005IrML1qGD2Z","name":"American Teeth","title":"American Teeth","type":0,"uin":0,"pmid":""}],"album":{"id":35761315,"mid":"0041dlcg0MinSa","name":"Insanity","title":"Insanity","subtitle":"","time_public":"2023-03-03","pmid":"0041dlcg0MinSa_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":183,"isonly":0,"language":5,"genre":20,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"003m83aC0p7FWX","size_24aac":0,"size_48aac":1116105,"size_96aac":2232450,"size_192ogg":4449050,"size_192aac":4445028,"size_128mp3":2931371,"size_320mp3":7328093,"size_ape":0,"size_flac":41474881,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2208912,"size_360ra":[],"size_dolby":10262441,"size_new":[0,22109595,56606735,7753191]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70146715,"mid":"004XxMxI17vByO"},"volume":{"gain":-11.908,"peak":1,"lra":7.468},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["062Qh9PN2dCTxl","","","","0026dZqM3fWeL4"],"vi":[3],"ktag":"0"},{"id":398287569,"type":0,"mid":"004TfKLW0d3JcC","name":"El Merengue","title":"El Merengue","subtitle":"","singer":[{"id":1104128,"mid":"003T09nh37Pq4N","name":"Marshmello","title":"Marshmello","type":0,"uin":0,"pmid":""},{"id":1465848,"mid":"0016E6af0HmWeC","name":"Manuel Turizo","title":"Manuel Turizo","type":0,"uin":0,"pmid":""}],"album":{"id":35750413,"mid":"000jmSpv0zbi4M","name":"El Merengue","title":"El Merengue","subtitle":"","time_public":"2023-03-03","pmid":"000jmSpv0zbi4M_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":189,"isonly":0,"language":16,"genre":27,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"004TfKLW0d3JcC","size_24aac":0,"size_48aac":1158043,"size_96aac":2320909,"size_192ogg":4414305,"size_192aac":4601096,"size_128mp3":3035877,"size_320mp3":7588541,"size_ape":0,"size_flac":0,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2206463,"size_360ra":[],"size_dolby":0,"size_new":[0,21834730,57678992,8188893]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70146718,"mid":"001bJ0wT4DbXmq"},"volume":{"gain":-9.588,"peak":1,"lra":6.132},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["0633a7pV2C53N7","","","","002xxYaI1F49e3"],"vi":[5],"ktag":"0"},{"id":398888603,"type":0,"mid":"002JYbrk3ZiQTh","name":"After Hours","title":"After Hours (Live|Explicit)","subtitle":"","singer":[{"id":32617,"mid":"004YnseG2vQN7h","name":"The Weeknd","title":"The Weeknd","type":0,"uin":0,"pmid":""}],"album":{"id":35860344,"mid":"001xhhkB3Thfx9","name":"After Hours (Live At SoFi Stadium) [Explicit]","title":"After Hours (Live At SoFi Stadium) [Explicit]","subtitle":"","time_public":"2023-03-03","pmid":"001xhhkB3Thfx9_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":267,"isonly":0,"language":5,"genre":33,"index_cd":0,"index_album":19,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"002JYbrk3ZiQTh","size_24aac":0,"size_48aac":1632801,"size_96aac":3256967,"size_192ogg":6462495,"size_192aac":6484880,"size_128mp3":4288151,"size_320mp3":10719916,"size_ape":0,"size_flac":0,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":3153408,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,11204211]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16888579,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70273122,"mid":"000vZfgN1Jc355"},"volume":{"gain":-6.203,"peak":1,"lra":7.997},"label":"0","url":"","bpm":0,"version":3,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["","","","",""],"vi":[35],"ktag":"0"},{"id":398525389,"type":0,"mid":"002DMEMr3eAhOa","name":"Flowers","title":"Flowers (Demo)","subtitle":"","singer":[{"id":11672,"mid":"0037uV5A4O7UGj","name":"Miley Cyrus","title":"Miley Cyrus","type":1,"uin":0,"pmid":""}],"album":{"id":35785165,"mid":"001oCWGM1oxA20","name":"Flowers (Demo)","title":"Flowers (Demo)","subtitle":"","time_public":"2023-03-03","pmid":"001oCWGM1oxA20_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":210,"isonly":0,"language":5,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"002DMEMr3eAhOa","size_24aac":0,"size_48aac":1285887,"size_96aac":2576126,"size_192ogg":3980908,"size_192aac":5105706,"size_128mp3":3374424,"size_320mp3":8435701,"size_ape":0,"size_flac":0,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2118164,"size_360ra":[],"size_dolby":0,"size_new":[132651978,17980314,48160251,6778454]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70146745,"mid":"004RpSeJ21PfBy"},"volume":{"gain":-7.558,"peak":1,"lra":11.141},"label":"0","url":"","bpm":0,"version":5,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["063eOKOG12wMhk","","","001GN8pl0D5bEC","000C3XQc0vlE0p"],"vi":[5],"ktag":"0"},{"id":398738782,"type":0,"mid":"002OOOko0Dm75S","name":"꽃 (Flower)","title":"꽃 (Flower) (花)","subtitle":"《原来这就是爱啊》韩剧插曲","singer":[{"id":72221,"mid":"002GrZmi0rYeZS","name":"Roy Kim","title":"Roy Kim (로이킴)","type":0,"uin":0,"pmid":""}],"album":{"id":35834241,"mid":"002OCLI13W5F7u","name":"사랑이라 말해요 OST Part 2 (Call It Love, Part 2 (Original Soundtrack from the Disney+ Original Series))","title":"사랑이라 말해요 OST Part 2 (Call It Love, Part 2 (Original Soundtrack from the Disney+ Original Series)) (原来这就是爱啊 OST Part 2)","subtitle":"《原来这就是爱啊》韩剧插曲","time_public":"2023-03-02","pmid":"002OCLI13W5F7u_1"},"mv":{"id":2060417,"vid":"003rXfQk4gcuXb","name":"","title":"","vt":0},"interval":218,"isonly":0,"language":4,"genre":23,"index_cd":0,"index_album":1,"time_public":"2023-03-02","status":0,"fnote":4009,"file":{"media_mid":"002OOOko0Dm75S","size_24aac":0,"size_48aac":1329000,"size_96aac":2657628,"size_192ogg":4562233,"size_192aac":5265529,"size_128mp3":3492033,"size_320mp3":8729479,"size_ape":0,"size_flac":44998012,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2297737,"size_360ra":[],"size_dolby":0,"size_new":[0,22015248,58772669,8158372]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70028189,"mid":"000VKYaD0pHzik"},"volume":{"gain":-8.594,"peak":1,"lra":12.815},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["","","","","002JFP3i4IrJHK"],"vi":[101547],"ktag":"0"},{"id":397692946,"type":0,"mid":"002Q05zI0dI1zl","name":"My Stupid Heart (with Lauv)","title":"My Stupid Heart (with Lauv)","subtitle":"","singer":[{"id":42956,"mid":"002RXUq04F4DHF","name":"Walk Off the Earth","title":"Walk Off the Earth","type":2,"uin":0,"pmid":""},{"id":963672,"mid":"004XSOkU0yCLih","name":"Lauv","title":"Lauv","type":0,"uin":0,"pmid":""}],"album":{"id":35623261,"mid":"0005znbt29N7gg","name":"My Stupid Heart (with Lauv)","title":"My Stupid Heart (with Lauv)","subtitle":"","time_public":"2023-03-03","pmid":"0005znbt29N7gg_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":160,"isonly":0,"language":5,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"002Q05zI0dI1zl","size_24aac":0,"size_48aac":982547,"size_96aac":1963488,"size_192ogg":3840406,"size_192aac":3901446,"size_128mp3":2575366,"size_320mp3":6437936,"size_ape":0,"size_flac":34933235,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":1996053,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,6951840]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70146695,"mid":"001NGrcr023VkZ"},"volume":{"gain":-7.703,"peak":0.905,"lra":3.864},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["064BzU4r3ytkJu","","","",""],"vi":[5],"ktag":"0"},{"id":398365623,"type":0,"mid":"000YUm1r3PFaRN","name":"Raincatchers","title":"Raincatchers","subtitle":"","singer":[{"id":26260,"mid":"0023z2Ce3IbpRN","name":"Birdy","title":"Birdy","type":1,"uin":0,"pmid":""}],"album":{"id":35762071,"mid":"002md4Cf4QWBtV","name":"Raincatchers","title":"Raincatchers","subtitle":"","time_public":"2023-03-03","pmid":"002md4Cf4QWBtV_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":239,"isonly":0,"language":5,"genre":50,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"000YUm1r3PFaRN","size_24aac":0,"size_48aac":1465616,"size_96aac":2926869,"size_192ogg":5519967,"size_192aac":5803171,"size_128mp3":3834173,"size_320mp3":9585083,"size_ape":0,"size_flac":52382271,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2845171,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,9781784]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16885507,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":0,"mid":""},"volume":{"gain":-10.873,"peak":0.989,"lra":8.849},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["061LFhmm18l4Ee","","","",""],"vi":[3],"ktag":"0"},{"id":397859814,"type":0,"mid":"002XKmgI1PKvDP","name":"憂い桜","title":"憂い桜 (忧郁樱花)","subtitle":"","singer":[{"id":8143202,"mid":"0041TqIv2h9u0g","name":"あたらよ","title":"あたらよ","type":2,"uin":0,"pmid":""}],"album":{"id":35658104,"mid":"0020UMgT36maVS","name":"憂い桜","title":"憂い桜 (忧郁樱花)","subtitle":"","time_public":"2023-03-03","pmid":"0020UMgT36maVS_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":275,"isonly":0,"language":3,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"002XKmgI1PKvDP","size_24aac":0,"size_48aac":1676921,"size_96aac":3352329,"size_192ogg":6351523,"size_192aac":6650654,"size_128mp3":4416770,"size_320mp3":11041632,"size_ape":0,"size_flac":29467584,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":3206935,"size_360ra":[],"size_dolby":0,"size_new":[186812226,29642956,75938357,10719515]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16885507,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":0,"mid":""},"volume":{"gain":-9.777,"peak":0.966,"lra":11.849},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["","","","001NNRy50mjGEK","0000IO1a3mioS4"],"vi":[11],"ktag":"0"},{"id":398277518,"type":0,"mid":"001ubWET2piC6m","name":"Mexico","title":"Mexico","subtitle":"","singer":[{"id":154298,"mid":"001StFWT4VdjQJ","name":"Dimitri Vegas & Like Mike","title":"Dimitri Vegas & Like Mike","type":2,"uin":0,"pmid":""},{"id":7144,"mid":"000AIwoO1CXHCg","name":"Ne-Yo","title":"Ne-Yo","type":0,"uin":0,"pmid":""},{"id":27455,"mid":"001RHfjp17xNKA","name":"Danna Paola","title":"Danna Paola","type":1,"uin":0,"pmid":""}],"album":{"id":35749173,"mid":"00413iwO2RkNJL","name":"Mexico","title":"Mexico","subtitle":"","time_public":"2023-03-03","pmid":"00413iwO2RkNJL_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":153,"isonly":0,"language":5,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"001ubWET2piC6m","size_24aac":0,"size_48aac":931721,"size_96aac":1862731,"size_192ogg":3772855,"size_192aac":3708603,"size_128mp3":2451162,"size_320mp3":6127531,"size_ape":0,"size_flac":19351426,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":1878835,"size_360ra":[],"size_dolby":0,"size_new":[0,18403485,47688026,6995655]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16885507,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":0,"mid":""},"volume":{"gain":-9.107,"peak":0.977,"lra":6.031},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":16,"es":"","vs":["","","","","0006W36B1yh2BT"],"vi":[93059],"ktag":"0"},{"id":393841011,"type":0,"mid":"0027OZjn1HJS63","name":"Wussy Man (Earth Defense Force)","title":"Wussy Man (Earth Defense Force)","subtitle":"","singer":[{"id":2200016,"mid":"004CljTy1k6QJ3","name":"CHROMANCE","title":"CHROMANCE","type":0,"uin":0,"pmid":""},{"id":8083739,"mid":"000e4Toj2Fx7oF","name":"Emetsound","title":"Emetsound","type":0,"uin":0,"pmid":""}],"album":{"id":34908068,"mid":"003XDkUO10ktFX","name":"Wussy Man (Earth Defense Force)","title":"Wussy Man (Earth Defense Force)","subtitle":"","time_public":"2023-03-03","pmid":"003XDkUO10ktFX_4"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":134,"isonly":0,"language":5,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"001wAnwD3qu6kb","size_24aac":0,"size_48aac":817529,"size_96aac":1635483,"size_192ogg":3489618,"size_192aac":3246239,"size_128mp3":2145702,"size_320mp3":5363779,"size_ape":0,"size_flac":29374469,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":1639685,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,5972013]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16885507,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":0,"mid":""},"volume":{"gain":-11.05,"peak":0.988,"lra":2.683},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["064V9PhM1IizYu","","","",""],"vi":[5],"ktag":"0"},{"id":397867719,"type":0,"mid":"000gV71v19IzGz","name":"Designer (feat. Joeboy)","title":"Designer (feat. Joeboy) (Explicit)","subtitle":"","singer":[{"id":38150,"mid":"001J99OK2689F4","name":"Major Lazer","title":"Major Lazer","type":2,"uin":0,"pmid":""},{"id":2057505,"mid":"002zFQ740fJkyu","name":"Major League Djz","title":"Major League Djz","type":0,"uin":0,"pmid":""},{"id":3310142,"mid":"000wy2Qh3jzUUr","name":"Joeboy","title":"Joeboy","type":0,"uin":0,"pmid":""}],"album":{"id":35659679,"mid":"001kypPn1TLmzU","name":"Designer (feat. Joeboy) [Explicit]","title":"Designer (feat. Joeboy) [Explicit]","subtitle":"","time_public":"2023-03-03","pmid":"001kypPn1TLmzU_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":199,"isonly":0,"language":7,"genre":22,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"000gV71v19IzGz","size_24aac":0,"size_48aac":1219870,"size_96aac":2440671,"size_192ogg":4588723,"size_192aac":4844631,"size_128mp3":3195610,"size_320mp3":7988557,"size_ape":0,"size_flac":26106460,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2323311,"size_360ra":[],"size_dolby":0,"size_new":[162802184,26025730,65799689,8744992]},"pay":{"pay_month":1,"price_track":0,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":108291,"msgid":14,"alert":2,"icons":8404860,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":0,"mid":""},"volume":{"gain":-9.687,"peak":1,"lra":3.479},"label":"0","url":"","bpm":0,"version":15,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["","","","002BqpQB3CiwGQ","001waVHA3GYmgg"],"vi":[101433],"ktag":"0"},{"id":398363653,"type":0,"mid":"001UFymK0uhuy0","name":"Paris To Berlin","title":"Paris To Berlin","subtitle":"","singer":[{"id":83305,"mid":"000talWb36EFfh","name":"Mike Williams","title":"Mike Williams","type":0,"uin":0,"pmid":""}],"album":{"id":35761294,"mid":"003f2Org3YjXlZ","name":"Paris To Berlin","title":"Paris To Berlin","subtitle":"","time_public":"2023-03-03","pmid":"003f2Org3YjXlZ_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":144,"isonly":0,"language":5,"genre":20,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"001UFymK0uhuy0","size_24aac":0,"size_48aac":881898,"size_96aac":1758082,"size_192ogg":3520743,"size_192aac":3487885,"size_128mp3":2311158,"size_320mp3":5777503,"size_ape":0,"size_flac":18814234,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":1806045,"size_360ra":[],"size_dolby":0,"size_new":[117675157,18462073,47452205,6214615]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16885507,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":0,"mid":""},"volume":{"gain":-11.315,"peak":1,"lra":3.374},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":16,"es":"","vs":["060njkNF083UaB","","","003T7P9Y3R2ldz","002JV4rA3ZzVpM"],"vi":[3],"ktag":"0"},{"id":398360724,"type":0,"mid":"003xOMTY0PVC4s","name":"A Place In The Dark","title":"A Place In The Dark","subtitle":"","singer":[{"id":63722,"mid":"00420lwO1IOHVx","name":"Klaas","title":"Klaas","type":0,"uin":0,"pmid":""},{"id":945663,"mid":"001WCnY04AkBeu","name":"Gry","title":"Gry","type":0,"uin":0,"pmid":""}],"album":{"id":35760528,"mid":"003kYYTL1FpkbL","name":"A Place In The Dark","title":"A Place In The Dark","subtitle":"","time_public":"2023-03-03","pmid":"003kYYTL1FpkbL_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":159,"isonly":0,"language":5,"genre":20,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"003xOMTY0PVC4s","size_24aac":0,"size_48aac":972118,"size_96aac":1938407,"size_192ogg":3894554,"size_192aac":3864921,"size_128mp3":2554410,"size_320mp3":6385633,"size_ape":0,"size_flac":20081457,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":1972652,"size_360ra":[],"size_dolby":0,"size_new":[124931859,19766767,50762909,6853270]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16885507,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":0,"mid":""},"volume":{"gain":-9.721,"peak":1,"lra":6.157},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["062YKamM3o9saG","","","0021IPta2ZeJ0z","004L8eHq3NgxQv"],"vi":[3],"ktag":"0"},{"id":394400404,"type":0,"mid":"000byf9D3tuzN7","name":"Sloopkogel","title":"Sloopkogel","subtitle":"","singer":[{"id":22045,"mid":"002xao6L3n9l4w","name":"Hardwell","title":"Hardwell","type":0,"uin":0,"pmid":""},{"id":53602,"mid":"001LLV184Lfy7Z","name":"Quintino","title":"Quintino","type":0,"uin":0,"pmid":""}],"album":{"id":35030890,"mid":"001fiCqX46SMaq","name":"Sloopkogel","title":"Sloopkogel","subtitle":"","time_public":"2023-03-03","pmid":"001fiCqX46SMaq_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":185,"isonly":0,"language":5,"genre":20,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"000byf9D3tuzN7","size_24aac":0,"size_48aac":1128487,"size_96aac":2253022,"size_192ogg":4815075,"size_192aac":4487553,"size_128mp3":2968578,"size_320mp3":7421097,"size_ape":0,"size_flac":39817005,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2323352,"size_360ra":[],"size_dolby":0,"size_new":[143970307,22860397,0,8384695]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16885507,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":0,"mid":""},"volume":{"gain":-9.546,"peak":0.89,"lra":11.518},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":16,"es":"","vs":["","","","001miWpK0eq577","001KLYzY0HcaED"],"vi":[95913],"ktag":"0"},{"id":398891319,"type":0,"mid":"002psdAP46KmLD","name":"Can't Do Both","title":"Can't Do Both","subtitle":"","singer":[{"id":2266005,"mid":"0025OH8q3CEb5d","name":"Jonasu","title":"Jonasu","type":0,"uin":0,"pmid":""},{"id":1200465,"mid":"003vAUO82i2wby","name":"Clara Mae","title":"Clara Mae","type":1,"uin":0,"pmid":""}],"album":{"id":35860849,"mid":"000LTSYQ061ddY","name":"Can't Do Both","title":"Can't Do Both","subtitle":"","time_public":"2023-03-03","pmid":"000LTSYQ061ddY_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":177,"isonly":0,"language":5,"genre":20,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"002psdAP46KmLD","size_24aac":0,"size_48aac":1082703,"size_96aac":2167297,"size_192ogg":4124058,"size_192aac":4292893,"size_128mp3":2838600,"size_320mp3":7096142,"size_ape":0,"size_flac":0,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2061452,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,7385033]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16884483,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":0,"mid":""},"volume":{"gain":-9.645,"peak":1,"lra":6.665},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["","","","",""],"vi":[35],"ktag":"0"},{"id":398716735,"type":0,"mid":"001azdxb36ViKj","name":"뱅 (Bang)!","title":"뱅 (Bang)!","subtitle":"","singer":[{"id":13146980,"mid":"003zX2kU03k74K","name":"팀 8시 (TEAM 8:00)","title":"팀 8시 (TEAM 8:00)","type":2,"uin":0,"pmid":""}],"album":{"id":35828050,"mid":"000CI9em1G7eZM","name":"PEAK TIME - 1Round <Rival match> Part.2","title":"PEAK TIME - 1Round <Rival match> Part.2","subtitle":"","time_public":"2023-03-02","pmid":"000CI9em1G7eZM_1"},"mv":{"id":2060397,"vid":"002xJDCN1ewS3A","name":"","title":"","vt":0},"interval":145,"isonly":0,"language":4,"genre":20,"index_cd":0,"index_album":1,"time_public":"2023-03-02","status":0,"fnote":4009,"file":{"media_mid":"001azdxb36ViKj","size_24aac":0,"size_48aac":883140,"size_96aac":1762178,"size_192ogg":3614521,"size_192aac":3508327,"size_128mp3":2324575,"size_320mp3":5810981,"size_ape":0,"size_flac":32705401,"size_dts":0,"size_try":481070,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":30000,"size_96ogg":1881540,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,6829782]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70002026,"mid":"0004l7Uq1wy8pI"},"volume":{"gain":-11.137,"peak":1,"lra":5.226},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["063AeYyb3vx3On","","","",""],"vi":[36620],"ktag":"0"},{"id":398716736,"type":0,"mid":"004V5gut33f0QF","name":"You Are","title":"You Are","subtitle":"","singer":[{"id":13146991,"mid":"002JPEIx3ktjYD","name":"팀 7시 (TEAM 7:00)","title":"팀 7시 (TEAM 7:00)","type":2,"uin":0,"pmid":""}],"album":{"id":35828050,"mid":"000CI9em1G7eZM","name":"PEAK TIME - 1Round <Rival match> Part.2","title":"PEAK TIME - 1Round <Rival match> Part.2","subtitle":"","time_public":"2023-03-02","pmid":"000CI9em1G7eZM_1"},"mv":{"id":2060394,"vid":"002ySDkT05TFPG","name":"","title":"","vt":0},"interval":176,"isonly":0,"language":4,"genre":20,"index_cd":0,"index_album":2,"time_public":"2023-03-02","status":0,"fnote":4009,"file":{"media_mid":"004V5gut33f0QF","size_24aac":0,"size_48aac":1077447,"size_96aac":2151014,"size_192ogg":4378981,"size_192aac":4282742,"size_128mp3":2829465,"size_320mp3":7073214,"size_ape":0,"size_flac":42864945,"size_dts":0,"size_try":481070,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":30000,"size_96ogg":2142052,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,7901684]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70001988,"mid":"0017WLnz1vWX4G"},"volume":{"gain":-11.004,"peak":1,"lra":4.347},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["062OdCoG4PmiW2","","","",""],"vi":[36620],"ktag":"0"},{"id":398716734,"type":0,"mid":"002ny3Ky3rdAU0","name":"12시30분 (12:30)","title":"12시30분 (12:30)","subtitle":"","singer":[{"id":13147008,"mid":"002p7mKg395L4y","name":"팀 15시 (TEAM 15:00)","title":"팀 15시 (TEAM 15:00)","type":2,"uin":0,"pmid":""}],"album":{"id":35828050,"mid":"000CI9em1G7eZM","name":"PEAK TIME - 1Round <Rival match> Part.2","title":"PEAK TIME - 1Round <Rival match> Part.2","subtitle":"","time_public":"2023-03-02","pmid":"000CI9em1G7eZM_1"},"mv":{"id":2060393,"vid":"003W9edE4JsnCg","name":"","title":"","vt":0},"interval":180,"isonly":0,"language":4,"genre":20,"index_cd":0,"index_album":3,"time_public":"2023-03-02","status":0,"fnote":4009,"file":{"media_mid":"002ny3Ky3rdAU0","size_24aac":0,"size_48aac":1100795,"size_96aac":2198221,"size_192ogg":4446395,"size_192aac":4374558,"size_128mp3":2889251,"size_320mp3":7222652,"size_ape":0,"size_flac":42562366,"size_dts":0,"size_try":481070,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":30000,"size_96ogg":2174592,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,7663678]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70002176,"mid":"001slnTv02tsu3"},"volume":{"gain":-10.924,"peak":1,"lra":6.869},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["062CC8bg431TOO","","","",""],"vi":[36620],"ktag":"0"},{"id":398165369,"type":0,"mid":"000hoZCK1smoSr","name":"哗哗","title":"哗哗","subtitle":"","singer":[{"id":4542942,"mid":"0010qhN23BSl7p","name":"Crazy Donkey金大智","title":"Crazy Donkey金大智","type":0,"uin":0,"pmid":""},{"id":1546395,"mid":"000dCyiL1Lhi9d","name":"林渝植","title":"林渝植","type":0,"uin":0,"pmid":""}],"album":{"id":35721139,"mid":"001rWAyr1eBX2M","name":"哗哗","title":"哗哗","subtitle":"","time_public":"2023-03-02","pmid":"001rWAyr1eBX2M_2"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":203,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-02","status":0,"fnote":4009,"file":{"media_mid":"000hoZCK1smoSr","size_24aac":0,"size_48aac":1239633,"size_96aac":2478204,"size_192ogg":4601787,"size_192aac":4914522,"size_128mp3":3261131,"size_320mp3":8152508,"size_ape":0,"size_flac":43784321,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2340289,"size_360ra":[],"size_dolby":0,"size_new":[145586667,22881888,58663855,8010090]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69881813,"mid":"000DDbS02kJnK6"},"volume":{"gain":-8.912,"peak":1,"lra":6.699},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["","","","001ZZmz32atzLQ","000UdDsZ4FDvRb"],"vi":[93059],"ktag":"0"},{"id":398160776,"type":0,"mid":"003j3ZYD0opPCI","name":"感受她","title":"感受她 (Live)","subtitle":"","singer":[{"id":1016794,"mid":"002nXp292LIOGV","name":"蔡徐坤","title":"蔡徐坤","type":0,"uin":0,"pmid":""}],"album":{"id":35720047,"mid":"001jAdSn0oGgFa","name":"KUN 2023 ART LAB LIVE","title":"KUN 2023 ART LAB LIVE","subtitle":"","time_public":"2023-02-27","pmid":"001jAdSn0oGgFa_1"},"mv":{"id":2059369,"vid":"004BpMwJ0lIKNj","name":"","title":"","vt":0},"interval":339,"isonly":0,"language":0,"genre":0,"index_cd":0,"index_album":1,"time_public":"2023-02-27","status":0,"fnote":4009,"file":{"media_mid":"003j3ZYD0opPCI","size_24aac":0,"size_48aac":2068102,"size_96aac":4138532,"size_192ogg":7572291,"size_192aac":8222555,"size_128mp3":5437043,"size_320mp3":13592262,"size_ape":0,"size_flac":67879567,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":3794775,"size_360ra":[],"size_dolby":0,"size_new":[215901290,0,0,12875769]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69437638,"mid":"000cJHZa3C8OvT"},"volume":{"gain":-6.78,"peak":0.998,"lra":16.747},"label":"0","url":"","bpm":0,"version":3,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":1024,"es":"","vs":["062eJlGg43HmqA","","","002Q3HQc4UFYAw",""],"vi":[853927],"ktag":"0"},{"id":398361324,"type":0,"mid":"004PlyHM28RT4M","name":"当你对我微微笑","title":"当你对我微微笑","subtitle":"","singer":[{"id":36691,"mid":"00472DR10Ytv83","name":"袁娅维TIA RAY","title":"袁娅维TIA RAY","type":1,"uin":0,"pmid":""}],"album":{"id":35760737,"mid":"00482ECT2VmSsG","name":"当你对我微微笑","title":"当你对我微微笑","subtitle":"","time_public":"2023-03-01","pmid":"00482ECT2VmSsG_1"},"mv":{"id":2060083,"vid":"000RzW69360hvX","name":"","title":"","vt":0},"interval":245,"isonly":0,"language":0,"genre":0,"index_cd":0,"index_album":1,"time_public":"2023-03-01","status":0,"fnote":4009,"file":{"media_mid":"000gs4vr21MbwK","size_24aac":0,"size_48aac":1493053,"size_96aac":2980201,"size_192ogg":4961475,"size_192aac":5884311,"size_128mp3":3922353,"size_320mp3":9805449,"size_ape":0,"size_flac":22155508,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2574413,"size_360ra":[],"size_dolby":0,"size_new":[146678104,21810614,57767808,8435728]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69684590,"mid":"000aiurL4bRTiz"},"volume":{"gain":-4.108,"peak":0.988,"lra":13.522},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":19456,"es":"","vs":["06045xn32r54vl","","","000hdK3D3Dlh6v","001e0KGR2HpsAN"],"vi":[3974908],"ktag":"0"},{"id":397103101,"type":0,"mid":"0041O6sg00U9UF","name":"More Than Friends","title":"More Than Friends","subtitle":"《HIStory5-遇见未来的你》LINE TV插曲","singer":[{"id":284,"mid":"0049u0DR3G9Rgv","name":"陈势安","title":"陈势安","type":0,"uin":0,"pmid":""}],"album":{"id":35495562,"mid":"000WspGF3Ikyvn","name":"More Than Friends","title":"More Than Friends","subtitle":"《HIStory5-遇见未来的你》LINE TV插曲","time_public":"2023-03-02","pmid":"000WspGF3Ikyvn_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":210,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-02","status":0,"fnote":4009,"file":{"media_mid":"0041O6sg00U9UF","size_24aac":0,"size_48aac":1272819,"size_96aac":2555692,"size_192ogg":4740183,"size_192aac":5082702,"size_128mp3":3361535,"size_320mp3":8403312,"size_ape":0,"size_flac":0,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2375392,"size_360ra":[],"size_dolby":0,"size_new":[141850556,21555256,0,8166981]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69881809,"mid":"003T371z1WInMU"},"volume":{"gain":-8.208,"peak":0.939,"lra":10.051},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["060u90x0444CxU","","","003n3EAN1uruRN","002gWgNo2Vw0PR"],"vi":[5],"ktag":"0"},{"id":398291648,"type":0,"mid":"000BuCh02mS1V8","name":"光","title":"光","subtitle":"《回廊亭》电影主题曲","singer":[{"id":3127723,"mid":"000DT3kC3IGHjR","name":"小阿七","title":"小阿七","type":1,"uin":0,"pmid":""}],"album":{"id":35751130,"mid":"0048BYqn3tpjqL","name":"光","title":"光","subtitle":"《回廊亭》电影主题曲","time_public":"2023-03-02","pmid":"0048BYqn3tpjqL_1"},"mv":{"id":2059856,"vid":"002TOWyb4IuuCE","name":"","title":"","vt":0},"interval":228,"isonly":0,"language":0,"genre":0,"index_cd":0,"index_album":1,"time_public":"2023-03-02","status":0,"fnote":4009,"file":{"media_mid":"000BuCh02mS1V8","size_24aac":0,"size_48aac":1391566,"size_96aac":2790959,"size_192ogg":5308783,"size_192aac":5519477,"size_128mp3":3651477,"size_320mp3":9128414,"size_ape":0,"size_flac":48786002,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2648658,"size_360ra":[],"size_dolby":0,"size_new":[160111765,24685470,63394806,9064976]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69992228,"mid":"000FzJr53VVUKw"},"volume":{"gain":-8.804,"peak":0.894,"lra":12.467},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["063adsgz36Ivnq","","","002Tnveu3s3zno","002DtPSA0PbZWJ"],"vi":[327874],"ktag":"0"},{"id":398539277,"type":0,"mid":"000CZhyX2kGa37","name":"浪漫婚礼","title":"浪漫婚礼","subtitle":"","singer":[{"id":47061,"mid":"000m8IbI4LBbBo","name":"新街口组合","title":"新街口组合","type":2,"uin":0,"pmid":""},{"id":1317766,"mid":"000BzvZW0rzzFG","name":"Mona Lavi","title":"Mona Lavi","type":1,"uin":0,"pmid":""}],"album":{"id":35788796,"mid":"003Cgl274FElzc","name":"浪漫婚礼","title":"浪漫婚礼","subtitle":"","time_public":"2023-03-02","pmid":"003Cgl274FElzc_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":258,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-02","status":0,"fnote":4009,"file":{"media_mid":"000CZhyX2kGa37","size_24aac":0,"size_48aac":1585788,"size_96aac":3182989,"size_192ogg":6103838,"size_192aac":6243529,"size_128mp3":4141759,"size_320mp3":10354096,"size_ape":0,"size_flac":31804844,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":3082792,"size_360ra":[],"size_dolby":0,"size_new":[200975316,31246743,81276162,10790976]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69881834,"mid":"001hUrmq3Qs90u"},"volume":{"gain":-8.459,"peak":0.973,"lra":2.986},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["","","","004ckoXK30Maxs","003yO7311eprTi"],"vi":[35091],"ktag":"0"},{"id":398594132,"type":0,"mid":"002n9y3h2NAjEH","name":"淋湿情绪","title":"淋湿情绪","subtitle":"","singer":[{"id":1315450,"mid":"0002rlul3X50mS","name":"丁芙妮","title":"丁芙妮","type":1,"uin":492761205,"pmid":""}],"album":{"id":35796723,"mid":"002Z3X771zFY5H","name":"淋湿情绪","title":"淋湿情绪","subtitle":"","time_public":"2023-03-02","pmid":"002Z3X771zFY5H_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":223,"isonly":0,"language":0,"genre":0,"index_cd":0,"index_album":1,"time_public":"2023-03-02","status":0,"fnote":4009,"file":{"media_mid":"002n9y3h2NAjEH","size_24aac":0,"size_48aac":1358213,"size_96aac":2722817,"size_192ogg":5313461,"size_192aac":5410847,"size_128mp3":3579182,"size_320mp3":8947316,"size_ape":0,"size_flac":47032495,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2620512,"size_360ra":[],"size_dolby":0,"size_new":[153035110,23248235,60090337,8953473]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69881833,"mid":"001fHLub0U3MTL"},"volume":{"gain":-8.534,"peak":0.951,"lra":10.666},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["060Qnd0Q4EEW5c","","","000YJqOr3SypoM","000Klkg61P2Qnq"],"vi":[1897],"ktag":"0"},{"id":398204935,"type":0,"mid":"00253QiZ0mornS","name":"POST IT","title":"POST IT","subtitle":"","singer":[{"id":25204,"mid":"003tgLLP2kqUr2","name":"龙俊亨","title":"龙俊亨 (용준형)","type":0,"uin":0,"pmid":""},{"id":11563946,"mid":"003vND8K463mVQ","name":"시온","title":"시온","type":0,"uin":0,"pmid":""}],"album":{"id":35729439,"mid":"002go0lF38Oq0V","name":"POST IT (Explicit)","title":"POST IT (Explicit)","subtitle":"","time_public":"2023-03-02","pmid":"002go0lF38Oq0V_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":190,"isonly":0,"language":4,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-02","status":0,"fnote":4009,"file":{"media_mid":"00253QiZ0mornS","size_24aac":0,"size_48aac":1161879,"size_96aac":2321132,"size_192ogg":4740055,"size_192aac":4603309,"size_128mp3":3041303,"size_320mp3":7602909,"size_ape":0,"size_flac":0,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2303988,"size_360ra":[],"size_dolby":0,"size_new":[145758245,22350280,58642326,8632728]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16885507,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":0,"mid":""},"volume":{"gain":-10.616,"peak":1,"lra":5.337},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["060mAuNO0o4bFI","","","000prBIB0CNSjh","001gR8sB2UM3hd"],"vi":[5],"ktag":"0"},{"id":398532255,"type":0,"mid":"000r53xh4ZECFh","name":"序章。","title":"序章。","subtitle":"","singer":[{"id":8764272,"mid":"003WYvpi1mbIln","name":"『ユイカ』","title":"『ユイカ』","type":1,"uin":0,"pmid":""}],"album":{"id":35787153,"mid":"004QfPlI2yORbZ","name":"序章。","title":"序章。","subtitle":"","time_public":"2023-03-01","pmid":"004QfPlI2yORbZ_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":273,"isonly":0,"language":3,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-01","status":0,"fnote":4009,"file":{"media_mid":"000r53xh4ZECFh","size_24aac":0,"size_48aac":1647017,"size_96aac":3287285,"size_192ogg":6588835,"size_192aac":6532572,"size_128mp3":4384171,"size_320mp3":10960132,"size_ape":0,"size_flac":0,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":3215968,"size_360ra":[],"size_dolby":0,"size_new":[199492525,31790733,81296290,11987998]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16888579,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69797939,"mid":"0045OShp26MzpT"},"volume":{"gain":-9.246,"peak":1,"lra":8.497},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["","","","002RB7Ds3BQank","0040085J4HBwCh"],"vi":[35],"ktag":"0"},{"id":398180711,"type":0,"mid":"003llrRO02588J","name":"速命道","title":"速命道","subtitle":"","singer":[{"id":13441,"mid":"002lZMNU1HveJj","name":"顽童MJ116","title":"顽童MJ116","type":2,"uin":0,"pmid":""}],"album":{"id":35724538,"mid":"003Iy6Yb1LpJa3","name":"速命道","title":"速命道","subtitle":"","time_public":"2023-03-01","pmid":"003Iy6Yb1LpJa3_1"},"mv":{"id":2060050,"vid":"000FJCRt1AnQgt","name":"","title":"","vt":0},"interval":157,"isonly":0,"language":0,"genre":34,"index_cd":0,"index_album":1,"time_public":"2023-03-01","status":0,"fnote":4009,"file":{"media_mid":"003llrRO02588J","size_24aac":0,"size_48aac":956429,"size_96aac":1915288,"size_192ogg":3795564,"size_192aac":3804367,"size_128mp3":2518824,"size_320mp3":6296757,"size_ape":0,"size_flac":33309036,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":1944073,"size_360ra":[],"size_dolby":0,"size_new":[0,17462194,43767990,6569949]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69810815,"mid":"001XbKc23PRKWH"},"volume":{"gain":-8.563,"peak":0.892,"lra":5.469},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["061sHwby0hpCOj","","","","000MVRsL3JXp1v"],"vi":[6574],"ktag":"0"},{"id":398362287,"type":0,"mid":"000mwW5f4aESDN","name":"사랑이라 믿었던 것들은 (Feat. 이수현) (Hopeless Romantic)","title":"사랑이라 믿었던 것들은 (Feat. 이수현) (Hopeless Romantic)","subtitle":"","singer":[{"id":3887362,"mid":"000FGVpI1QgIWw","name":"BIG Naughty (서동현)","title":"BIG Naughty (서동현)","type":0,"uin":0,"pmid":""},{"id":652865,"mid":"000uNqSu12dREX","name":"李秀贤","title":"李秀贤 (이수현)","type":1,"uin":0,"pmid":""}],"album":{"id":35761047,"mid":"00389jmi0L2sqy","name":"호프리스 로맨틱 (Hopeless Romantic)","title":"호프리스 로맨틱 (Hopeless Romantic)","subtitle":"","time_public":"2023-02-28","pmid":"00389jmi0L2sqy_1"},"mv":{"id":2060048,"vid":"000dOf090q3nX5","name":"","title":"","vt":0},"interval":235,"isonly":0,"language":4,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-02-28","status":0,"fnote":4009,"file":{"media_mid":"000mwW5f4aESDN","size_24aac":0,"size_48aac":1437799,"size_96aac":2873854,"size_192ogg":5221635,"size_192aac":5704324,"size_128mp3":3776197,"size_320mp3":9439962,"size_ape":0,"size_flac":48091684,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2646390,"size_360ra":[],"size_dolby":0,"size_new":[157671332,23487644,61017363,9300808]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69647971,"mid":"002I8xDE1C0xky"},"volume":{"gain":-8.333,"peak":1,"lra":15.199},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":16384,"es":"","vs":["060YfzxG4V2f19","","","002k8SSs0Ry88a","003HJvhE1KNakg"],"vi":[110746],"ktag":"0"},{"id":398291248,"type":0,"mid":"0030vxTk0CyrkZ","name":"Love Me Crazy","title":"Love Me Crazy","subtitle":"","singer":[{"id":162536,"mid":"001RFQfM0OrMKA","name":"림킴 (김예림)","title":"림킴 (김예림) (Lim Kim)","type":1,"uin":0,"pmid":""},{"id":40287,"mid":"000u9K8f0JOXiv","name":"JAMIE","title":"JAMIE (박지민)","type":1,"uin":0,"pmid":""}],"album":{"id":35751049,"mid":"001XO0Dz0KxTC4","name":"Love Me Crazy - SM STATION","title":"Love Me Crazy - SM STATION","subtitle":"","time_public":"2023-02-28","pmid":"001XO0Dz0KxTC4_1"},"mv":{"id":2059868,"vid":"003Hy8cK2R343Y","name":"","title":"","vt":0},"interval":180,"isonly":0,"language":4,"genre":20,"index_cd":0,"index_album":1,"time_public":"2023-02-28","status":0,"fnote":4009,"file":{"media_mid":"0030vxTk0CyrkZ","size_24aac":0,"size_48aac":1099515,"size_96aac":2202167,"size_192ogg":4272597,"size_192aac":4363620,"size_128mp3":2884606,"size_320mp3":7211111,"size_ape":0,"size_flac":22409602,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2140055,"size_360ra":[],"size_dolby":0,"size_new":[137126343,21620608,56361792,7585265]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":1,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16897281,"msgid":13,"alert":2,"icons":12992510,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69650845,"mid":"0009x1tv0ofDzz"},"volume":{"gain":-10.722,"peak":1,"lra":5.305},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":16384,"es":"","vs":["064AMKHF43N3u6","","","001h1aql4BPBH9","0004WZ8a4XtTbd"],"vi":[302],"ktag":"0"},{"id":398121363,"type":0,"mid":"004LoB1Y33OF3x","name":"Floral Sense (Feat. WINTER of aespa)","title":"Floral Sense (Feat. WINTER of aespa)","subtitle":"","singer":[{"id":20872,"mid":"004MwGIS0cwwT3","name":"艺声","title":"艺声 (예성)","type":0,"uin":0,"pmid":""},{"id":6971583,"mid":"002pFTWe1FFzdP","name":"WINTER","title":"WINTER (윈터)","type":1,"uin":0,"pmid":""}],"album":{"id":35713396,"mid":"002G980n05fiqZ","name":"Floral Sense - The 1st Album Special Ver.","title":"Floral Sense - The 1st Album Special Ver.","subtitle":"","time_public":"2023-02-27","pmid":"002G980n05fiqZ_1"},"mv":{"id":2059425,"vid":"001J05C63OqFOh","name":"","title":"","vt":0},"interval":228,"isonly":0,"language":4,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-02-27","status":0,"fnote":4009,"file":{"media_mid":"004LoB1Y33OF3x","size_24aac":0,"size_48aac":1393344,"size_96aac":2790419,"size_192ogg":5036081,"size_192aac":5536535,"size_128mp3":3656223,"size_320mp3":9140056,"size_ape":0,"size_flac":25996315,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2589756,"size_360ra":[],"size_dolby":0,"size_new":[163488532,25111350,64612843,8631930]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":1,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16897281,"msgid":13,"alert":2,"icons":12992510,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69438387,"mid":"000JWXE20DHCk4"},"volume":{"gain":-9.507,"peak":1,"lra":4.972},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":17408,"es":"","vs":["061iPOVG1kysBC","","","002JDWJA3GVcUy","004KZCN31KHhqs"],"vi":[302],"ktag":"0"},{"id":398010009,"type":0,"mid":"000ImC2P0T5wmp","name":"여름끝 매미 (September Cicada)","title":"여름끝 매미 (September Cicada)","subtitle":"","singer":[{"id":22970,"mid":"004c0zDZ0Et7Cm","name":"San E (산이)","title":"San E (산이)","type":0,"uin":0,"pmid":""}],"album":{"id":35690090,"mid":"004ccogr4ByolQ","name":"Just Rap ****","title":"Just Rap ****","subtitle":"","time_public":"2023-02-25","pmid":"004ccogr4ByolQ_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":119,"isonly":0,"language":4,"genre":34,"index_cd":0,"index_album":10,"time_public":"2023-02-25","status":0,"fnote":4009,"file":{"media_mid":"000ImC2P0T5wmp","size_24aac":0,"size_48aac":735421,"size_96aac":1468097,"size_192ogg":3113360,"size_192aac":2910715,"size_128mp3":1919958,"size_320mp3":4799488,"size_ape":0,"size_flac":0,"size_dts":0,"size_try":481070,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":30000,"size_96ogg":1484810,"size_360ra":[],"size_dolby":0,"size_new":[88181403,13964310,35874717,5517629]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69208141,"mid":"003Tk97t3hF9e5"},"volume":{"gain":-10.449,"peak":1,"lra":7.291},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":16384,"es":"","vs":["063CfRPG1PGV74","","","000FrgfU2b0a93","001CwMAk1VYHKR"],"vi":[36620],"ktag":"0"},{"id":398644401,"type":0,"mid":"0040Dx3s4aC133","name":"天下劫","title":"天下劫 (先行版)","subtitle":"《画江湖之不良人》第6季动画片头曲","singer":[{"id":4556576,"mid":"0023hUFq0cQDtt","name":"毛亮","title":"毛亮","type":0,"uin":0,"pmid":""}],"album":{"id":1806913,"mid":"003GSuuh3xEmeM","name":"画江湖之不良人 原声带","title":"画江湖之不良人 原声带","subtitle":"《画江湖之不良人》第6季动画片头曲","time_public":"2020-06-08","pmid":"003GSuuh3xEmeM_4"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":122,"isonly":0,"language":0,"genre":0,"index_cd":0,"index_album":2,"time_public":"2020-06-08","status":0,"fnote":4009,"file":{"media_mid":"0040Dx3s4aC133","size_24aac":0,"size_48aac":741999,"size_96aac":1485327,"size_192ogg":2832084,"size_192aac":2950867,"size_128mp3":1957510,"size_320mp3":4893036,"size_ape":0,"size_flac":26234991,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":1415960,"size_360ra":[],"size_dolby":0,"size_new":[84270608,13321545,34851210,4927373]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70020644,"mid":"004SjgTB1YxQIf"},"volume":{"gain":-11.06,"peak":1,"lra":9.424},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":16,"es":"","vs":["061klURr4JTHOA","","","001HsVXI1Mvg13","00224WjE1rlWkC"],"vi":[1028959],"ktag":"0"},{"id":398603772,"type":0,"mid":"002ZVTKG2wzyP9","name":"心爱的人","title":"心爱的人","subtitle":"《绝配酥心唐》影视剧主题曲","singer":[{"id":5595698,"mid":"003LNLn82GqJeT","name":"王艺瑾","title":"王艺瑾","type":1,"uin":0,"pmid":""}],"album":{"id":35797898,"mid":"004G4OZ52wUI9i","name":"心爱的人","title":"心爱的人","subtitle":"《绝配酥心唐》影视剧主题曲","time_public":"2023-03-02","pmid":"004G4OZ52wUI9i_1"},"mv":{"id":2060513,"vid":"000NvqU71MiIpY","name":"","title":"","vt":0},"interval":248,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-02","status":0,"fnote":4009,"file":{"media_mid":"002ZVTKG2wzyP9","size_24aac":0,"size_48aac":1510059,"size_96aac":3025437,"size_192ogg":5639452,"size_192aac":6016296,"size_128mp3":3974571,"size_320mp3":9936132,"size_ape":0,"size_flac":53091972,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2837743,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,9652520]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69994967,"mid":"001hh6y12iz0Ux"},"volume":{"gain":-9.563,"peak":1,"lra":8.956},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":2048,"es":"","vs":["","","","",""],"vi":[2817871],"ktag":"0"},{"id":398133237,"type":0,"mid":"002nJKmO4QaBeC","name":"没你的维度","title":"没你的维度","subtitle":"","singer":[{"id":1373351,"mid":"0025ipyS2r3gDv","name":"周锐","title":"周锐","type":0,"uin":0,"pmid":""}],"album":{"id":35715965,"mid":"000hjuUJ4WjUo8","name":"没你的维度","title":"没你的维度","subtitle":"","time_public":"2023-03-03","pmid":"000hjuUJ4WjUo8_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":263,"isonly":0,"language":0,"genre":0,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"002nJKmO4QaBeC","size_24aac":0,"size_48aac":1610658,"size_96aac":3210478,"size_192ogg":5507720,"size_192aac":6372241,"size_128mp3":4218662,"size_320mp3":10546355,"size_ape":0,"size_flac":27176991,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2809458,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,9537059]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70294172,"mid":"002QkwiJ0G406c"},"volume":{"gain":-6.342,"peak":0.893,"lra":14.121},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":2048,"es":"","vs":["060YHghL2fSXot","","","",""],"vi":[36713],"ktag":"0"},{"id":398801978,"type":0,"mid":"0048Q3753NSmTE","name":"顽童","title":"顽童","subtitle":"","singer":[{"id":13929,"mid":"001rw1kJ0TXFGH","name":"石头","title":"石头","type":0,"uin":0,"pmid":""}],"album":{"id":35843049,"mid":"001uig4y1i13LR","name":"顽童","title":"顽童","subtitle":"","time_public":"2023-03-03","pmid":"001uig4y1i13LR_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":229,"isonly":0,"language":0,"genre":0,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"0048Q3753NSmTE","size_24aac":0,"size_48aac":1406573,"size_96aac":2832842,"size_192ogg":5183120,"size_192aac":5572814,"size_128mp3":3665272,"size_320mp3":9162898,"size_ape":0,"size_flac":24638670,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2610718,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,9248760]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70146737,"mid":"003IP4Fi3Hmr1D"},"volume":{"gain":-7.598,"peak":1,"lra":13.531},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["062Pao1601l6d7","","","",""],"vi":[1897],"ktag":"0"},{"id":398775689,"type":0,"mid":"0039al0Y3oV1FA","name":"乌托邦飞艇","title":"乌托邦飞艇","subtitle":"","singer":[{"id":975622,"mid":"001qncr73Jkdof","name":"大波浪","title":"大波浪","type":2,"uin":0,"pmid":""}],"album":{"id":35839075,"mid":"0009Vf3U0yZKol","name":"乌托邦飞艇","title":"乌托邦飞艇","subtitle":"","time_public":"2023-03-03","pmid":"0009Vf3U0yZKol_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":270,"isonly":0,"language":5,"genre":50,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"0039al0Y3oV1FA","size_24aac":0,"size_48aac":1648681,"size_96aac":3295893,"size_192ogg":7120817,"size_192aac":6538415,"size_128mp3":4325243,"size_320mp3":10812214,"size_ape":0,"size_flac":0,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":3375993,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,12501994]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16885507,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":0,"mid":""},"volume":{"gain":-8.475,"peak":1,"lra":5.504},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["","","","",""],"vi":[1892],"ktag":"0"},{"id":398368217,"type":0,"mid":"0041XjMY0bj3hF","name":"国际孤独等级","title":"国际孤独等级","subtitle":"","singer":[{"id":8159453,"mid":"001xkyje0vmXFX","name":"Gareth.T","title":"Gareth.T","type":0,"uin":0,"pmid":""}],"album":{"id":35762687,"mid":"0043UQgj4cyygR","name":"国际孤独等级","title":"国际孤独等级","subtitle":"","time_public":"2023-03-03","pmid":"0043UQgj4cyygR_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":192,"isonly":0,"language":1,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"0041XjMY0bj3hF","size_24aac":0,"size_48aac":1174395,"size_96aac":2349998,"size_192ogg":4060099,"size_192aac":4659882,"size_128mp3":3086008,"size_320mp3":7714697,"size_ape":0,"size_flac":38937531,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2160458,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,7505407]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70146721,"mid":"003ZPbDb28K7FO"},"volume":{"gain":-7.268,"peak":1,"lra":7.323},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["061vPNaF3rZgAl","","","",""],"vi":[3],"ktag":"0"},{"id":398368417,"type":0,"mid":"000QmoHo1USjMY","name":"I CAN GET WHAT I WANT","title":"I CAN GET WHAT I WANT","subtitle":"","singer":[{"id":3720574,"mid":"0045lQwH1GPpbC","name":"Lewsz","title":"Lewsz","type":0,"uin":0,"pmid":""},{"id":6016336,"mid":"003Lsgky4XmJqA","name":"张蔓姿","title":"张蔓姿","type":1,"uin":0,"pmid":""}],"album":{"id":35762723,"mid":"000ICMfM2HqeQn","name":"I CAN GET WHAT I WANT","title":"I CAN GET WHAT I WANT","subtitle":"","time_public":"2023-03-03","pmid":"000ICMfM2HqeQn_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":202,"isonly":0,"language":1,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"000FTQJH28bTKb","size_24aac":0,"size_48aac":1244214,"size_96aac":2495106,"size_192ogg":4574073,"size_192aac":4899473,"size_128mp3":3239871,"size_320mp3":8099274,"size_ape":0,"size_flac":43575230,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2317240,"size_360ra":[],"size_dolby":11343661,"size_new":[0,0,0,8277507]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70146724,"mid":"0021ObTq2GS6eL"},"volume":{"gain":-8.011,"peak":0.959,"lra":11.25},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["060Rf8MM1tHIq1","","","",""],"vi":[3],"ktag":"0"},{"id":398770438,"type":0,"mid":"004OBjvU1luMu9","name":"seOul drift","title":"seOul drift","subtitle":"","singer":[{"id":3380549,"mid":"002CeqFj2iATUM","name":"OnlyOneOf (온리원오브)","title":"OnlyOneOf (온리원오브)","type":2,"uin":0,"pmid":""}],"album":{"id":35838790,"mid":"0040J9ia4ZP7Zp","name":"seOul cOllectiOn","title":"seOul cOllectiOn","subtitle":"","time_public":"2023-03-02","pmid":"0040J9ia4ZP7Zp_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":201,"isonly":0,"language":4,"genre":20,"index_cd":0,"index_album":2,"time_public":"2023-03-02","status":0,"fnote":4009,"file":{"media_mid":"004OMuEY3qmbtU","size_24aac":0,"size_48aac":1223991,"size_96aac":2448003,"size_192ogg":5008511,"size_192aac":4869052,"size_128mp3":3221475,"size_320mp3":8053292,"size_ape":0,"size_flac":47208270,"size_dts":0,"size_try":481070,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":30000,"size_96ogg":2544541,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,9840127]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16885507,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":0,"mid":""},"volume":{"gain":-11.631,"peak":1,"lra":2.601},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["064LH41u28c0Nj","","","",""],"vi":[36620],"ktag":"0"},{"id":398782001,"type":0,"mid":"004BTFnt3z09j9","name":"Raise Up The Flag","title":"Raise Up The Flag","subtitle":"","singer":[{"id":181896,"mid":"003YEuq92K9mBV","name":"权珍雅","title":"权珍雅 (권진아)","type":1,"uin":0,"pmid":""}],"album":{"id":35840372,"mid":"0009iujP341qSr","name":"The Flag","title":"The Flag","subtitle":"","time_public":"2023-03-02","pmid":"0009iujP341qSr_1"},"mv":{"id":2060507,"vid":"004BMK1e3zX1A5","name":"","title":"","vt":0},"interval":224,"isonly":0,"language":4,"genre":1,"index_cd":0,"index_album":2,"time_public":"2023-03-02","status":0,"fnote":4009,"file":{"media_mid":"004BTFnt3z09j9","size_24aac":0,"size_48aac":1363663,"size_96aac":2727340,"size_192ogg":5152534,"size_192aac":5419026,"size_128mp3":3590919,"size_320mp3":8976950,"size_ape":0,"size_flac":49020115,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2545392,"size_360ra":[],"size_dolby":0,"size_new":[163068115,24986590,64980894,8825309]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16885507,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":0,"mid":""},"volume":{"gain":-8.887,"peak":1,"lra":11.318},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["060vgfFa45sG0M","","","001JOgwy2bS2Oh","002agx1q3AlGV8"],"vi":[110746],"ktag":"0"},{"id":398610209,"type":0,"mid":"002gfJR62YcO4E","name":"나비무덤 (Butterfly Grave)","title":"나비무덤 (Butterfly Grave)","subtitle":"","singer":[{"id":12905,"mid":"003TIDwG3tKu5L","name":"포맨 (4MEN)","title":"포맨 (4MEN)","type":2,"uin":0,"pmid":""}],"album":{"id":35798785,"mid":"000D8E8t1lIpCw","name":"나비무덤 (Butterfly Grave)","title":"나비무덤 (Butterfly Grave)","subtitle":"","time_public":"2023-03-01","pmid":"000D8E8t1lIpCw_2"},"mv":{"id":2060389,"vid":"00136bTN4ULfan","name":"","title":"","vt":0},"interval":262,"isonly":0,"language":4,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-01","status":0,"fnote":4009,"file":{"media_mid":"002ttsBF1Ya1uv","size_24aac":0,"size_48aac":1592817,"size_96aac":3189384,"size_192ogg":5815255,"size_192aac":6326370,"size_128mp3":4197846,"size_320mp3":10494192,"size_ape":0,"size_flac":55519328,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2865122,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,10150433]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69853944,"mid":"001J7QsG01rjih"},"volume":{"gain":-8.568,"peak":1,"lra":15.915},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["","","","",""],"vi":[110746],"ktag":"0"},{"id":398717249,"type":0,"mid":"001E4ZL00yd3GI","name":"Please","title":"Please","subtitle":"《神圣的偶像》韩剧插曲","singer":[{"id":941447,"mid":"0009RujD1tzyqm","name":"林韩星","title":"林韩星 (임한별)","type":0,"uin":0,"pmid":""}],"album":{"id":35828103,"mid":"0032Vfxi11tz6O","name":"성스러운 아이돌 OST Part.3","title":"성스러운 아이돌 OST Part.3","subtitle":"《神圣的偶像》韩剧插曲","time_public":"2023-03-02","pmid":"0032Vfxi11tz6O_1"},"mv":{"id":2060405,"vid":"000KaOel0UEMjd","name":"","title":"","vt":0},"interval":236,"isonly":0,"language":4,"genre":37,"index_cd":0,"index_album":1,"time_public":"2023-03-02","status":0,"fnote":4009,"file":{"media_mid":"001E4ZL00yd3GI","size_24aac":0,"size_48aac":1438186,"size_96aac":2881652,"size_192ogg":5073257,"size_192aac":5726739,"size_128mp3":3791971,"size_320mp3":9479560,"size_ape":0,"size_flac":49726692,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2555951,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,8819094]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70082119,"mid":"0045zOV94cQnIc"},"volume":{"gain":-7.998,"peak":1,"lra":14.092},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["062UQ8EP0mYApP","","","",""],"vi":[7445],"ktag":"0"},{"id":398612148,"type":0,"mid":"000v73LV3goSh9","name":"혼자가 아닌 나 (I'm not alone)","title":"혼자가 아닌 나 (I'm not alone)","subtitle":"","singer":[{"id":3170544,"mid":"003RlOjO2uoWr5","name":"郑孝彬","title":"郑孝彬 (정효빈)","type":1,"uin":0,"pmid":""}],"album":{"id":35798895,"mid":"000dcK8C3puWjh","name":"혼자가 아닌 나 (I'm not alone)","title":"혼자가 아닌 나 (I'm not alone)","subtitle":"","time_public":"2023-03-01","pmid":"000dcK8C3puWjh_2"},"mv":{"id":2060379,"vid":"002Op1GO36nvUD","name":"","title":"","vt":0},"interval":209,"isonly":0,"language":4,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-01","status":0,"fnote":4009,"file":{"media_mid":"000BXSN33fAbhk","size_24aac":0,"size_48aac":1274718,"size_96aac":2548790,"size_192ogg":4873393,"size_192aac":5064210,"size_128mp3":3352310,"size_320mp3":8380359,"size_ape":0,"size_flac":47558830,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2439635,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,8479687]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69996118,"mid":"0009n6aE1WAEn7"},"volume":{"gain":-8.573,"peak":0.993,"lra":6.145},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["","","","",""],"vi":[110746],"ktag":"0"},{"id":398361574,"type":0,"mid":"002ciLgg1dcepN","name":"Sugar Sweet","title":"Sugar Sweet","subtitle":"","singer":[{"id":9765224,"mid":"0005fRCX4XRalJ","name":"Benson Boone","title":"Benson Boone","type":0,"uin":0,"pmid":""}],"album":{"id":35760819,"mid":"003pv7JH1Qvq5R","name":"Sugar Sweet","title":"Sugar Sweet","subtitle":"","time_public":"2023-03-03","pmid":"003pv7JH1Qvq5R_1"},"mv":{"id":2060829,"vid":"001QvnG11eBCVg","name":"","title":"","vt":0},"interval":169,"isonly":0,"language":5,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"003bDnre0cLjLF","size_24aac":0,"size_48aac":1028421,"size_96aac":2056051,"size_192ogg":4682327,"size_192aac":4088819,"size_128mp3":2718650,"size_320mp3":6796260,"size_ape":0,"size_flac":38020202,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2290630,"size_360ra":[],"size_dolby":9518309,"size_new":[0,0,0,8276654]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16885507,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":0,"mid":""},"volume":{"gain":-11.365,"peak":1,"lra":3.18},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["061RrBo13VdCpP","","","",""],"vi":[3],"ktag":"0"},{"id":398287565,"type":0,"mid":"000kFgZv36iVFt","name":"keep our love alive","title":"keep our love alive","subtitle":"","singer":[{"id":3129868,"mid":"003yF9CY3CnjbQ","name":"Powfu","title":"Powfu","type":0,"uin":0,"pmid":""}],"album":{"id":35750411,"mid":"0012K5pM1XEndd","name":"keep our love alive","title":"keep our love alive","subtitle":"","time_public":"2023-03-03","pmid":"0012K5pM1XEndd_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":176,"isonly":0,"language":5,"genre":50,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"000kFgZv36iVFt","size_24aac":0,"size_48aac":1079895,"size_96aac":2158600,"size_192ogg":4033205,"size_192aac":4290134,"size_128mp3":2829845,"size_320mp3":7074221,"size_ape":0,"size_flac":0,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2033315,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,7103676]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16885507,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":0,"mid":""},"volume":{"gain":-8.689,"peak":1,"lra":9.979},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["062sL5ru3X79cT","","","",""],"vi":[5],"ktag":"0"},{"id":398353497,"type":0,"mid":"001CnOCn4gVUug","name":"Home Movies","title":"Home Movies (Acoustic)","subtitle":"","singer":[{"id":55600,"mid":"000YH1aW2ashnA","name":"Lukas Graham","title":"Lukas Graham","type":2,"uin":0,"pmid":""}],"album":{"id":35757399,"mid":"003RQ1fF3Uh2Ru","name":"Home Movies (Acoustic)","title":"Home Movies (Acoustic)","subtitle":"","time_public":"2023-03-03","pmid":"003RQ1fF3Uh2Ru_1"},"mv":{"id":2054083,"vid":"002Irkbj1iJ0hh","name":"","title":"","vt":0},"interval":195,"isonly":0,"language":5,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"001CnOCn4gVUug","size_24aac":0,"size_48aac":1184020,"size_96aac":2370937,"size_192ogg":4639566,"size_192aac":4699355,"size_128mp3":3127018,"size_320mp3":7817147,"size_ape":0,"size_flac":41264317,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2279880,"size_360ra":[],"size_dolby":0,"size_new":[137916265,21034088,55035138,8375383]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16885507,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":0,"mid":""},"volume":{"gain":-9.068,"peak":0.994,"lra":7.38},"label":"0","url":"","bpm":0,"version":11,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":16,"es":"","vs":["064LmFgk1xVmCT","","","004N23vq3RSeB4","002npfWy49diH2"],"vi":[3],"ktag":"0"},{"id":398355230,"type":0,"mid":"001H1MFU2Bop2s","name":"Best Day Ever","title":"Best Day Ever","subtitle":"","singer":[{"id":167573,"mid":"001HWkGC3Pm9E3","name":"Johnny Stimson","title":"Johnny Stimson","type":0,"uin":0,"pmid":""}],"album":{"id":35757868,"mid":"0045JQcS07IiKV","name":"Best Day Ever / Look At Me Now","title":"Best Day Ever / Look At Me Now","subtitle":"","time_public":"2023-03-03","pmid":"0045JQcS07IiKV_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":138,"isonly":0,"language":5,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"001H1MFU2Bop2s","size_24aac":0,"size_48aac":848116,"size_96aac":1692945,"size_192ogg":3364997,"size_192aac":3371260,"size_128mp3":2224250,"size_320mp3":5560192,"size_ape":0,"size_flac":16693396,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":1658821,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,6035615]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16885507,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":0,"mid":""},"volume":{"gain":-8.156,"peak":0.982,"lra":5.427},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["062CH0st2i5fdL","","","",""],"vi":[3],"ktag":"0"},{"id":398367046,"type":0,"mid":"0021cDQy2dlgtS","name":"Cinderella Snapped","title":"Cinderella Snapped (Explicit)","subtitle":"","singer":[{"id":9908603,"mid":"00478CeL0LbHPw","name":"Jax","title":"Jax","type":1,"uin":0,"pmid":""}],"album":{"id":35762400,"mid":"004BrzS049gotZ","name":"Cinderella Snapped (Explicit)","title":"Cinderella Snapped (Explicit)","subtitle":"","time_public":"2023-03-03","pmid":"004BrzS049gotZ_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":173,"isonly":0,"language":5,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"000AdYlN3m2Y8Q","size_24aac":0,"size_48aac":1054449,"size_96aac":2108992,"size_192ogg":3995183,"size_192aac":4161668,"size_128mp3":2770927,"size_320mp3":6926904,"size_ape":0,"size_flac":19372104,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2033279,"size_360ra":[],"size_dolby":9701193,"size_new":[0,0,0,7031792]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16885507,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":0,"mid":""},"volume":{"gain":-10.996,"peak":1,"lra":10.882},"label":"0","url":"","bpm":0,"version":15,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["061NOJx135Nyic","","","",""],"vi":[3],"ktag":"0"},{"id":398032742,"type":0,"mid":"002L1T1M2mDYzv","name":"I DON'T WANNA BE LIKE YOU","title":"I DON'T WANNA BE LIKE YOU (Explicit)","subtitle":"","singer":[{"id":1461426,"mid":"003k0AZX1kXM3Q","name":"Ruel","title":"Ruel","type":0,"uin":0,"pmid":""}],"album":{"id":35696760,"mid":"000qwCXg1d18sq","name":"4TH WALL (Explicit)","title":"4TH WALL (Explicit)","subtitle":"","time_public":"2023-03-03","pmid":"000qwCXg1d18sq_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":163,"isonly":0,"language":5,"genre":1,"index_cd":0,"index_album":2,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"002L1T1M2mDYzv","size_24aac":0,"size_48aac":997457,"size_96aac":1999368,"size_192ogg":4009368,"size_192aac":3963503,"size_128mp3":2624219,"size_320mp3":6559943,"size_ape":0,"size_flac":0,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":1969525,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,7513573]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69669494,"mid":"004W30ss3A4dlT"},"volume":{"gain":-10.737,"peak":1,"lra":4.872},"label":"0","url":"","bpm":0,"version":15,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["06292b082pCt6z","","","",""],"vi":[5],"ktag":"0"},{"id":398238487,"type":0,"mid":"000XZbgJ43OuWH","name":"Worms","title":"Worms (Explicit)","subtitle":"","singer":[{"id":1485455,"mid":"0048yqVA3DoMQW","name":"Ashnikko","title":"Ashnikko","type":1,"uin":0,"pmid":""}],"album":{"id":35737449,"mid":"002iflfr0KI607","name":"Worms (Explicit)","title":"Worms (Explicit)","subtitle":"","time_public":"2023-03-02","pmid":"002iflfr0KI607_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":148,"isonly":0,"language":5,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-02","status":0,"fnote":4009,"file":{"media_mid":"000XZbgJ43OuWH","size_24aac":0,"size_48aac":907290,"size_96aac":1815117,"size_192ogg":3614953,"size_192aac":3599993,"size_128mp3":2380511,"size_320mp3":5950928,"size_ape":0,"size_flac":17666378,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":1761643,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,6326979]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16885507,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":0,"mid":""},"volume":{"gain":-10.241,"peak":1,"lra":3.984},"label":"0","url":"","bpm":0,"version":15,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["063NYTx20JX6EG","","","",""],"vi":[3],"ktag":"0"},{"id":396532277,"type":0,"mid":"004fXnzF1NMLwA","name":"Paradise","title":"Paradise","subtitle":"《哆啦A梦：大雄与天空的理想乡》动画电影主题曲","singer":[{"id":6106548,"mid":"004RJHrP2oPfd6","name":"NiziU","title":"NiziU","type":2,"uin":0,"pmid":""}],"album":{"id":35369810,"mid":"001HKYHq0K8Jg3","name":"Paradise","title":"Paradise","subtitle":"《哆啦A梦：大雄与天空的理想乡》动画电影主题曲","time_public":"2023-03-03","pmid":"001HKYHq0K8Jg3_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":207,"isonly":0,"language":3,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"004fXnzF1NMLwA","size_24aac":0,"size_48aac":1264927,"size_96aac":2530853,"size_192ogg":5038926,"size_192aac":5013558,"size_128mp3":3315888,"size_320mp3":8289393,"size_ape":0,"size_flac":0,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2455403,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,9564110]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16885507,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":0,"mid":""},"volume":{"gain":-10.256,"peak":1,"lra":7.983},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["0600d3Sq4D6rrU","","","",""],"vi":[5],"ktag":"0"},{"id":396705881,"type":0,"mid":"001hVWXw0b6zNY","name":"シャンディ","title":"シャンディ","subtitle":"","singer":[{"id":34121,"mid":"000DQtMe38gVI3","name":"超特急","title":"超特急 (ちょうとっきゅう)","type":2,"uin":0,"pmid":""}],"album":{"id":35406355,"mid":"0046bRXC3lwhfI","name":"シャンディ","title":"シャンディ","subtitle":"","time_public":"2023-03-03","pmid":"0046bRXC3lwhfI_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":174,"isonly":0,"language":3,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"001hVWXw0b6zNY","size_24aac":0,"size_48aac":1063199,"size_96aac":2133093,"size_192ogg":4231358,"size_192aac":4215427,"size_128mp3":2790497,"size_320mp3":6975940,"size_ape":0,"size_flac":40018798,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2108619,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,7269482]},"pay":{"pay_month":1,"price_track":0,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":108291,"msgid":14,"alert":2,"icons":8404860,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":0,"mid":""},"volume":{"gain":-10.858,"peak":1,"lra":5.786},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["","","","",""],"vi":[101433],"ktag":"0"},{"id":398364326,"type":0,"mid":"002Vxdok3y6Ttr","name":"いびつな心 (feat. むﾄ)","title":"いびつな心 (feat. むﾄ) (扭曲的心)","subtitle":"","singer":[{"id":2862785,"mid":"003jNJ9C2gUmya","name":"須田景凪","title":"須田景凪 (すだ けいな)","type":0,"uin":0,"pmid":""},{"id":8969521,"mid":"004TBbrt4gHxjs","name":"むﾄ","title":"むﾄ","type":1,"uin":0,"pmid":""}],"album":{"id":35761427,"mid":"001BFxJ30PI6PT","name":"いびつな心 (feat. むﾄ)","title":"いびつな心 (feat. むﾄ)","subtitle":"","time_public":"2023-03-03","pmid":"001BFxJ30PI6PT_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":226,"isonly":0,"language":3,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"002Vxdok3y6Ttr","size_24aac":0,"size_48aac":1368001,"size_96aac":2737873,"size_192ogg":5666160,"size_192aac":5416875,"size_128mp3":3625670,"size_320mp3":9063737,"size_ape":0,"size_flac":26749734,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2845083,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,9888177]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16885507,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":0,"mid":""},"volume":{"gain":-9.49,"peak":0.987,"lra":6.288},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["0614GBNR2OpPcJ","","","",""],"vi":[3],"ktag":"0"},{"id":398375280,"type":0,"mid":"002WWbDF29TxSU","name":"BIBI Vengeance (feat. Baby Tate)","title":"BIBI Vengeance (feat. Baby Tate) (Remix)","subtitle":"","singer":[{"id":2726800,"mid":"002G7alj1Vnmow","name":"BIBI","title":"BIBI (비비)","type":1,"uin":0,"pmid":""},{"id":2695794,"mid":"000wmJvx21rCZi","name":"Princesa Alba","title":"Princesa Alba","type":0,"uin":0,"pmid":""},{"id":1423049,"mid":"001wUh440THE5I","name":"Baby Tate","title":"Baby Tate","type":1,"uin":0,"pmid":""}],"album":{"id":35764132,"mid":"0048aXbC4d7SqW","name":"BIBI Vengeance (feat. Baby Tate) [Remix]","title":"BIBI Vengeance (feat. Baby Tate) [Remix]","subtitle":"","time_public":"2023-03-03","pmid":"0048aXbC4d7SqW_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":189,"isonly":0,"language":4,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"002WWbDF29TxSU","size_24aac":0,"size_48aac":1155015,"size_96aac":2317636,"size_192ogg":4241705,"size_192aac":4583911,"size_128mp3":3040563,"size_320mp3":7600915,"size_ape":0,"size_flac":36473701,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2187099,"size_360ra":[],"size_dolby":0,"size_new":[129447905,19735135,51169870,7698132]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70146720,"mid":"004VKPoE3pplUJ"},"volume":{"gain":-3.326,"peak":0.543,"lra":4.065},"label":"0","url":"","bpm":0,"version":6,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":16,"es":"","vs":["060RF08X0h0Xbg","","","004ZQvUa10eJii","0049yXMB3dmJvk"],"vi":[6574],"ktag":"0"},{"id":396769218,"type":0,"mid":"002wETBE3mhsf0","name":"Landslide","title":"Landslide","subtitle":"","singer":[{"id":3199632,"mid":"001v7xOB0xRqlg","name":"Sabai","title":"Sabai","type":0,"uin":0,"pmid":""},{"id":1483730,"mid":"004My1Lg2P46Vn","name":"RUNN","title":"RUNN","type":1,"uin":0,"pmid":""}],"album":{"id":35419125,"mid":"0001jdRI3YZkx0","name":"Landslide","title":"Landslide","subtitle":"","time_public":"2023-03-03","pmid":"0001jdRI3YZkx0_2"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":190,"isonly":0,"language":5,"genre":20,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"002wETBE3mhsf0","size_24aac":0,"size_48aac":1159217,"size_96aac":2307522,"size_192ogg":4624729,"size_192aac":4572121,"size_128mp3":3045890,"size_320mp3":7614393,"size_ape":0,"size_flac":41741760,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2280330,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,8187122]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16885507,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":0,"mid":""},"volume":{"gain":-12.327,"peak":0.985,"lra":5.152},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["","","","",""],"vi":[8439],"ktag":"0"},{"id":398539983,"type":0,"mid":"001MfNOO1hziPA","name":"I Wish My Mind Would Shut Up 慢速版（你应该看看我的日记）","title":"I Wish My Mind Would Shut Up 慢速版（你应该看看我的日记）","subtitle":"","singer":[{"id":3058845,"mid":"0035w6Mp1gY2hJ","name":"Ivoris","title":"Ivoris","type":1,"uin":0,"pmid":""}],"album":{"id":35788992,"mid":"000wufJR3TOhsM","name":"I Wish My Mind Would Shut Up 慢速版（你应该看看我的日记）","title":"I Wish My Mind Would Shut Up 慢速版（你应该看看我的日记）","subtitle":"","time_public":"2023-03-02","pmid":"000wufJR3TOhsM_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":145,"isonly":0,"language":5,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-02","status":0,"fnote":4009,"file":{"media_mid":"001MfNOO1hziPA","size_24aac":0,"size_48aac":903623,"size_96aac":1796422,"size_192ogg":3097055,"size_192aac":3508076,"size_128mp3":2335080,"size_320mp3":5837160,"size_ape":0,"size_flac":25533850,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":1657866,"size_360ra":[],"size_dolby":0,"size_new":[85256709,12902836,33067670,5476288]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69883110,"mid":"000OqcQR437U45"},"volume":{"gain":-0.784,"peak":0.974,"lra":11.707},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["","","","003ZggnA26uXgK","000ORHHB1aBo2x"],"vi":[93059],"ktag":"0"},{"id":398360772,"type":0,"mid":"004bV9Jw0Jrw4b","name":"I Gotta Bounce","title":"I Gotta Bounce","subtitle":"","singer":[{"id":168002,"mid":"000x9W9d2ZZT90","name":"Faustix","title":"Faustix","type":0,"uin":0,"pmid":""}],"album":{"id":35760571,"mid":"0018Qcaj4P70oJ","name":"I Gotta Bounce","title":"I Gotta Bounce","subtitle":"","time_public":"2023-03-03","pmid":"0018Qcaj4P70oJ_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":136,"isonly":0,"language":5,"genre":22,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"004bV9Jw0Jrw4b","size_24aac":0,"size_48aac":836545,"size_96aac":1673176,"size_192ogg":3175996,"size_192aac":3322884,"size_128mp3":2192859,"size_320mp3":5481780,"size_ape":0,"size_flac":17458788,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":1600277,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,6306965]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16885507,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":0,"mid":""},"volume":{"gain":-10.447,"peak":0.986,"lra":3.629},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["063gozkg3Q9dyX","","","",""],"vi":[3],"ktag":"0"},{"id":394253646,"type":0,"mid":"000MrKEf3xVeoa","name":"Supreme","title":"Supreme","subtitle":"","singer":[{"id":40544,"mid":"000gG3GR391q0I","name":"Vassy","title":"Vassy","type":1,"uin":0,"pmid":""}],"album":{"id":34995834,"mid":"002P7LkV0dj0hJ","name":"Supreme","title":"Supreme","subtitle":"","time_public":"2023-03-03","pmid":"002P7LkV0dj0hJ_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":172,"isonly":0,"language":5,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"000MrKEf3xVeoa","size_24aac":0,"size_48aac":1046521,"size_96aac":2094517,"size_192ogg":3992152,"size_192aac":4146473,"size_128mp3":2762924,"size_320mp3":6906989,"size_ape":0,"size_flac":39139157,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2040598,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,7093170]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16885507,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":0,"mid":""},"volume":{"gain":-10.157,"peak":1,"lra":7.346},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["062qwrx60YTxHN","","","",""],"vi":[5],"ktag":"0"},{"id":398891752,"type":0,"mid":"000Syjax0IZfm5","name":"Highs And Lows","title":"Highs And Lows","subtitle":"","singer":[{"id":11130,"mid":"003dMyhJ0ZODYr","name":"ATB","title":"ATB","type":0,"uin":0,"pmid":""},{"id":1372272,"mid":"001rBCR64KNiBb","name":"Au/Ra","title":"Au/Ra","type":1,"uin":0,"pmid":""},{"id":1166378,"mid":"0026BVU442Ze61","name":"York","title":"York","type":0,"uin":0,"pmid":""}],"album":{"id":35860913,"mid":"000bSRqu3UnLe5","name":"Highs And Lows","title":"Highs And Lows","subtitle":"","time_public":"2023-03-03","pmid":"000bSRqu3UnLe5_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":158,"isonly":0,"language":5,"genre":20,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"000Syjax0IZfm5","size_24aac":0,"size_48aac":965278,"size_96aac":1930944,"size_192ogg":3831056,"size_192aac":3837852,"size_128mp3":2530980,"size_320mp3":6326572,"size_ape":0,"size_flac":0,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":1936122,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,6846238]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16884483,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":0,"mid":""},"volume":{"gain":-10.424,"peak":1,"lra":6.168},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["","","","",""],"vi":[35],"ktag":"0"},{"id":398916882,"type":0,"mid":"001hc7I54QVD1x","name":"我们之间平平无奇","title":"我们之间平平无奇","subtitle":"《我在时间尽头等你》音乐剧唱段","singer":[{"id":6787676,"mid":"003vLbfK2gttHq","name":"严小北","title":"严小北","type":1,"uin":0,"pmid":""},{"id":3696440,"mid":"000qk6Z60ENLyM","name":"王瀚宇","title":"王瀚宇","type":0,"uin":0,"pmid":""}],"album":{"id":35865482,"mid":"004Wn5tk20B0ZZ","name":"我在时间尽头等你 音乐剧原声带","title":"我在时间尽头等你 音乐剧原声带","subtitle":"《我在时间尽头等你》音乐剧唱段","time_public":"2023-03-03","pmid":"004Wn5tk20B0ZZ_3"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":311,"isonly":0,"language":0,"genre":0,"index_cd":0,"index_album":4,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"001hc7I54QVD1x","size_24aac":0,"size_48aac":1895404,"size_96aac":3792507,"size_192ogg":6548354,"size_192aac":7535500,"size_128mp3":4981388,"size_320mp3":12452793,"size_ape":0,"size_flac":0,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":3335375,"size_360ra":[],"size_dolby":0,"size_new":[179804680,0,0,10759976]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70341960,"mid":"001ehS7y3KHLAo"},"volume":{"gain":-7.602,"peak":0.981,"lra":21.579},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["06290C2w2IQqaq","","","003prAje4cJo4v",""],"vi":[3523140],"ktag":"0"},{"id":398161397,"type":0,"mid":"004QmUR22G2fHL","name":"快乐歌 (prod. by PUZZLEMAN)","title":"快乐歌 (prod. by PUZZLEMAN)","subtitle":"","singer":[{"id":5360270,"mid":"000XnuJd2og5my","name":"没有才能","title":"没有才能","type":2,"uin":0,"pmid":""},{"id":1558802,"mid":"000fzcLo2COlQ5","name":"PUZZLEMAN","title":"PUZZLEMAN","type":0,"uin":0,"pmid":""}],"album":{"id":35720157,"mid":"003gjKkZ12HIdL","name":"快乐歌 (prod. by PUZZLEMAN)","title":"快乐歌 (prod. by PUZZLEMAN)","subtitle":"","time_public":"2023-03-03","pmid":"003gjKkZ12HIdL_1"},"mv":{"id":2060241,"vid":"001DSw2G1bxDgR","name":"","title":"","vt":0},"interval":172,"isonly":0,"language":0,"genre":0,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"004QmUR22G2fHL","size_24aac":0,"size_48aac":1044793,"size_96aac":2091829,"size_192ogg":3967025,"size_192aac":4151698,"size_128mp3":2756260,"size_320mp3":6890295,"size_ape":0,"size_flac":38068860,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2026556,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,7103369]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70146714,"mid":"003L7l8u04zHTa"},"volume":{"gain":-10.824,"peak":0.985,"lra":5.108},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":8,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["063srE3M3ZEU6a","","","",""],"vi":[8],"ktag":"0"},{"id":397680973,"type":0,"mid":"003uf1n91t9Zvu","name":"岁月情歌","title":"岁月情歌","subtitle":"","singer":[{"id":3133695,"mid":"0013xwfx03qjvN","name":"王小帅","title":"王小帅","type":0,"uin":0,"pmid":""}],"album":{"id":35621310,"mid":"0007DTL23saAhI","name":"岁月情歌","title":"岁月情歌","subtitle":"","time_public":"2023-03-03","pmid":"0007DTL23saAhI_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":189,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"003uf1n91t9Zvu","size_24aac":0,"size_48aac":1155661,"size_96aac":2311274,"size_192ogg":4478042,"size_192aac":4600573,"size_128mp3":3037507,"size_320mp3":7593471,"size_ape":0,"size_flac":42415833,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2237400,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,7967405]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70146674,"mid":"001Suau73IWeUL"},"volume":{"gain":-9.982,"peak":1,"lra":6.054},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":2048,"es":"","vs":["","","","",""],"vi":[96934],"ktag":"0"},{"id":398722517,"type":0,"mid":"002wYLDe1HVc2W","name":"替你握山河","title":"替你握山河","subtitle":"《为了和谐而奋斗》广播剧第一季主题曲","singer":[{"id":1197254,"mid":"0044RFZ64AOXH1","name":"Smile_小千","title":"Smile_小千","type":0,"uin":0,"pmid":""}],"album":{"id":35829306,"mid":"002DAdf24fMh81","name":"替你握山河","title":"替你握山河","subtitle":"《为了和谐而奋斗》广播剧第一季主题曲","time_public":"2023-03-02","pmid":"002DAdf24fMh81_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":250,"isonly":0,"language":0,"genre":0,"index_cd":0,"index_album":1,"time_public":"2023-03-02","status":0,"fnote":4009,"file":{"media_mid":"002wYLDe1HVc2W","size_24aac":0,"size_48aac":1529418,"size_96aac":3059709,"size_192ogg":5611498,"size_192aac":6073950,"size_128mp3":4008858,"size_320mp3":10021828,"size_ape":0,"size_flac":25957012,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2835240,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,9817126]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70011430,"mid":"000xEVPm0d5tJJ"},"volume":{"gain":-5.69,"peak":0.992,"lra":10.242},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["062eLtmI1Kq8aM","","","",""],"vi":[167306],"ktag":"0"},{"id":398890792,"type":0,"mid":"003UQCwZ1lBWC5","name":"Tan Dun: Meta Voyage","title":"Tan Dun: Meta Voyage","subtitle":"","singer":[{"id":13085281,"mid":"000NRnG121qrMs","name":"WE Orchestra","title":"WE Orchestra","type":0,"uin":0,"pmid":""},{"id":17948,"mid":"001OAXcf3jY9KC","name":"谭盾","title":"谭盾","type":0,"uin":0,"pmid":""}],"album":{"id":35860779,"mid":"004HuV4148SBxr","name":"Five Souls","title":"Five Souls","subtitle":"","time_public":"2023-03-03","pmid":"004HuV4148SBxr_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":194,"isonly":0,"language":9,"genre":2,"index_cd":0,"index_album":4,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"003UQCwZ1lBWC5","size_24aac":0,"size_48aac":1189454,"size_96aac":2376772,"size_192ogg":4260889,"size_192aac":4698546,"size_128mp3":3108622,"size_320mp3":7771008,"size_ape":0,"size_flac":0,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2124342,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,7269691]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16884483,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":8},"ksong":{"id":0,"mid":""},"volume":{"gain":0.586,"peak":0.892,"lra":6.856},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":16,"es":"","vs":["","","","",""],"vi":[35],"ktag":"0"},{"id":395921685,"type":0,"mid":"003oi9ff2Z9IWQ","name":"Dune: House Atreides","title":"Dune: House Atreides (Live)","subtitle":"","singer":[{"id":5105,"mid":"002xwyjy1OtAWo","name":"Hans Zimmer","title":"Hans Zimmer","type":0,"uin":0,"pmid":""},{"id":12139653,"mid":"004e6AjH2iFJI0","name":"The Disruptive Collective","title":"The Disruptive Collective","type":0,"uin":0,"pmid":""}],"album":{"id":35245429,"mid":"004fDrt20Gxa30","name":"LIVE","title":"LIVE","subtitle":"","time_public":"2023-03-03","pmid":"004fDrt20Gxa30_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":226,"isonly":0,"language":7,"genre":37,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"003oi9ff2Z9IWQ","size_24aac":0,"size_48aac":1377496,"size_96aac":2751018,"size_192ogg":4642877,"size_192aac":5480087,"size_128mp3":3620190,"size_320mp3":9049665,"size_ape":0,"size_flac":0,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2412920,"size_360ra":[],"size_dolby":0,"size_new":[115123902,0,0,7811148]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70146620,"mid":"000sdgZQ3yy1lT"},"volume":{"gain":-5.105,"peak":0.864,"lra":24.371},"label":"0","url":"","bpm":0,"version":3,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["062M8uXG1NaYxy","","","001b5yiJ1MxZBo",""],"vi":[5],"ktag":"0"},{"id":397702336,"type":0,"mid":"002atcdQ3W4vzJ","name":"Asongtoshawty","title":"Asongtoshawty","subtitle":"","singer":[{"id":7100453,"mid":"001ptrFp2l7SW1","name":"Sunrise1day","title":"Sunrise1day","type":0,"uin":0,"pmid":""}],"album":{"id":35624982,"mid":"000bsTr54bPj3N","name":"Asongtoshawty","title":"Asongtoshawty","subtitle":"","time_public":"2023-03-03","pmid":"000bsTr54bPj3N_2"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":191,"isonly":0,"language":0,"genre":34,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"002atcdQ3W4vzJ","size_24aac":0,"size_48aac":1164908,"size_96aac":2331275,"size_192ogg":4250370,"size_192aac":4633324,"size_128mp3":3057203,"size_320mp3":7642579,"size_ape":0,"size_flac":37008371,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2238301,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,7957782]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70146686,"mid":"004GlQ1E4Ss1GL"},"volume":{"gain":-5.58,"peak":0.621,"lra":4.615},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":65536,"es":"","vs":["","","","",""],"vi":[156],"ktag":"0"},{"id":398281022,"type":0,"mid":"003syVFh34ogJZ","name":"这不是我想要的生活","title":"这不是我想要的生活","subtitle":"","singer":[{"id":7829515,"mid":"003KOpQY00cIkg","name":"T.S.C.H.唐鑫","title":"T.S.C.H.唐鑫","type":0,"uin":0,"pmid":""}],"album":{"id":35749581,"mid":"002hFO873X4WeA","name":"单元剧（非正式IV）","title":"单元剧（非正式IV）","subtitle":"","time_public":"2023-03-03","pmid":"002hFO873X4WeA_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":358,"isonly":0,"language":0,"genre":36,"index_cd":0,"index_album":2,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"003syVFh34ogJZ","size_24aac":0,"size_48aac":2192559,"size_96aac":4376886,"size_192ogg":9019769,"size_192aac":8694186,"size_128mp3":5740485,"size_320mp3":14350208,"size_ape":0,"size_flac":45048747,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":4149974,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,15983730]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70146771,"mid":"001XnrP31fG4JD"},"volume":{"gain":-6.1,"peak":0.989,"lra":6.617},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":65536,"es":"","vs":["","","","",""],"vi":[156],"ktag":"0"},{"id":397956984,"type":0,"mid":"0020lIvB1QWo9l","name":"听清楚(I love you)Prod By YUSENISHERE","title":"听清楚(I love you)Prod By YUSENISHERE","subtitle":"","singer":[{"id":4700439,"mid":"001Eyi5c2JxwIL","name":"Ariesboy_Fiery","title":"Ariesboy_Fiery","type":0,"uin":0,"pmid":""}],"album":{"id":35679637,"mid":"002Hq7oj3Rhawy","name":"听清楚(I love you)","title":"听清楚(I love you)","subtitle":"","time_public":"2023-03-03","pmid":"002Hq7oj3Rhawy_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":135,"isonly":0,"language":0,"genre":34,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"0020lIvB1QWo9l","size_24aac":0,"size_48aac":827916,"size_96aac":1652098,"size_192ogg":3234379,"size_192aac":3276992,"size_128mp3":2164494,"size_320mp3":5410783,"size_ape":0,"size_flac":27173204,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":1633076,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,6021638]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70146716,"mid":"001cyexh3CZ9lE"},"volume":{"gain":-6.353,"peak":1,"lra":7.832},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":65536,"es":"","vs":["","","","",""],"vi":[156],"ktag":"0"},{"id":397870271,"type":0,"mid":"002izF4J44KhS5","name":"\u201c说唱歌手\u201d的独白","title":"\u201c说唱歌手\u201d的独白 (Prod by 524)","subtitle":"","singer":[{"id":3347868,"mid":"0018QYqp381tAD","name":"洛克特RocTe","title":"洛克特RocTe","type":0,"uin":0,"pmid":""}],"album":{"id":35581196,"mid":"003qVqaW0wlAVK","name":"窥","title":"窥","subtitle":"","time_public":"2023-02-28","pmid":"003qVqaW0wlAVK_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":77,"isonly":0,"language":0,"genre":34,"index_cd":0,"index_album":1,"time_public":"2023-02-28","status":0,"fnote":4009,"file":{"media_mid":"0038cOXP17GlWZ","size_24aac":0,"size_48aac":471386,"size_96aac":944359,"size_192ogg":1581578,"size_192aac":1874733,"size_128mp3":1233187,"size_320mp3":3082119,"size_ape":0,"size_flac":6703262,"size_dts":0,"size_try":481070,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":30000,"size_96ogg":798872,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,3055812]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":1,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16897281,"msgid":13,"alert":2,"icons":12992510,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70146704,"mid":"001Imyi44atjGb"},"volume":{"gain":-5.699,"peak":1,"lra":5.662},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":65536,"es":"","vs":["0647TB3M3fWkAQ","","","",""],"vi":[156],"ktag":"0"},{"id":398114162,"type":0,"mid":"001FYPWm3apngm","name":"弗丽嘉之羽","title":"弗丽嘉之羽","subtitle":"","singer":[{"id":12814642,"mid":"003PIWiJ1rHcA5","name":"AUSTIN S","title":"AUSTIN S","type":0,"uin":0,"pmid":""},{"id":9787923,"mid":"004NA3wQ4MMIhB","name":"Linawe很瞌睡","title":"Linawe很瞌睡","type":1,"uin":0,"pmid":""}],"album":{"id":35713067,"mid":"00042czI3nedWH","name":"弗丽嘉之羽","title":"弗丽嘉之羽","subtitle":"","time_public":"2023-02-27","pmid":"00042czI3nedWH_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":184,"isonly":0,"language":0,"genre":34,"index_cd":0,"index_album":1,"time_public":"2023-02-27","status":0,"fnote":4009,"file":{"media_mid":"001FYPWm3apngm","size_24aac":0,"size_48aac":1135668,"size_96aac":2274926,"size_192ogg":4140748,"size_192aac":4486036,"size_128mp3":2960199,"size_320mp3":7400179,"size_ape":0,"size_flac":39844687,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2081478,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,7578744]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69414229,"mid":"003tZMmf36n8DC"},"volume":{"gain":-9.024,"peak":0.954,"lra":1.822},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":65536,"es":"","vs":["","","","",""],"vi":[156],"ktag":"0"},{"id":398632384,"type":0,"mid":"0044lVCJ08eupi","name":"雨夜","title":"雨夜","subtitle":"","singer":[{"id":2241358,"mid":"003HxdGI0nhVsc","name":"V.R-","title":"V.R-","type":0,"uin":3158342242,"pmid":""},{"id":7578918,"mid":"0041Jhmg1k1kHF","name":"陈慧顽","title":"陈慧顽","type":0,"uin":0,"pmid":""}],"album":{"id":35803254,"mid":"002mXCpk2GNuI9","name":"雨夜","title":"雨夜","subtitle":"","time_public":"2023-03-02","pmid":"002mXCpk2GNuI9_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":242,"isonly":0,"language":0,"genre":34,"index_cd":0,"index_album":1,"time_public":"2023-03-02","status":0,"fnote":4009,"file":{"media_mid":"0044lVCJ08eupi","size_24aac":0,"size_48aac":1464022,"size_96aac":2927038,"size_192ogg":5106934,"size_192aac":5815431,"size_128mp3":3881361,"size_320mp3":9703114,"size_ape":0,"size_flac":47193693,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2653038,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,9770137]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69881876,"mid":"000EkxSq1pPZDx"},"volume":{"gain":-7.408,"peak":0.966,"lra":13.979},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":65536,"es":"","vs":["","","","",""],"vi":[156],"ktag":"0"},{"id":398145880,"type":0,"mid":"001BoGBR0wpC66","name":"逍遥","title":"逍遥","subtitle":"","singer":[{"id":4012408,"mid":"003sflKp4X2sqG","name":"韩潇Es","title":"韩潇Es","type":1,"uin":0,"pmid":""}],"album":{"id":35717862,"mid":"002noU0F2Zmwp0","name":"逍遥","title":"逍遥","subtitle":"","time_public":"2023-03-03","pmid":"002noU0F2Zmwp0_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":212,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"001BoGBR0wpC66","size_24aac":0,"size_48aac":1294230,"size_96aac":2608263,"size_192ogg":4792937,"size_192aac":5126516,"size_128mp3":3404469,"size_320mp3":8510505,"size_ape":0,"size_flac":22273917,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2437588,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,8234350]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70146735,"mid":"001Q3yWU2J6QpH"},"volume":{"gain":-7.436,"peak":0.978,"lra":9.699},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":2048,"es":"","vs":["","","","",""],"vi":[1197],"ktag":"0"},{"id":398588419,"type":0,"mid":"003xohe54baWau","name":"自我矛盾","title":"自我矛盾","subtitle":"","singer":[{"id":7118859,"mid":"0032LhHw48kMIF","name":"陈奕楠","title":"陈奕楠","type":1,"uin":0,"pmid":""}],"album":{"id":35795871,"mid":"004bxTwO3UDGPh","name":"自我矛盾","title":"自我矛盾","subtitle":"","time_public":"2023-03-03","pmid":"004bxTwO3UDGPh_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":192,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"003xohe54baWau","size_24aac":0,"size_48aac":1175749,"size_96aac":2355718,"size_192ogg":4057414,"size_192aac":4633672,"size_128mp3":3075814,"size_320mp3":7689602,"size_ape":0,"size_flac":37626900,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2087244,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,6940470]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70146722,"mid":"003CHs1A4a03rq"},"volume":{"gain":-6.054,"peak":0.982,"lra":10.268},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["","","","",""],"vi":[3658230],"ktag":"0"},{"id":398596004,"type":0,"mid":"0037Qvxf28Ar9s","name":"不久以后","title":"不久以后","subtitle":"","singer":[{"id":13264214,"mid":"002Z6Kt4074bbL","name":"吴百萬Million Wu","title":"吴百萬Million Wu","type":0,"uin":0,"pmid":""}],"album":{"id":35796978,"mid":"001dNxqD0RgLa9","name":"不久以后","title":"不久以后","subtitle":"","time_public":"2023-03-02","pmid":"001dNxqD0RgLa9_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":172,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-02","status":0,"fnote":4009,"file":{"media_mid":"0037Qvxf28Ar9s","size_24aac":0,"size_48aac":1047943,"size_96aac":2096921,"size_192ogg":4150218,"size_192aac":4185084,"size_128mp3":2761256,"size_320mp3":6902493,"size_ape":0,"size_flac":39116011,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2033731,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,7623397]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69882001,"mid":"0025npNb0TxH1C"},"volume":{"gain":-9.218,"peak":0.984,"lra":7.439},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":2048,"es":"","vs":["","","","",""],"vi":[33389],"ktag":"0"},{"id":398756564,"type":0,"mid":"001dsgZL4UG8H1","name":"请别爱我了","title":"请别爱我了","subtitle":"","singer":[{"id":7312556,"mid":"001JulMq0sO5Bg","name":"泡芙芙Scarlett","title":"泡芙芙Scarlett","type":1,"uin":0,"pmid":""}],"album":{"id":35837209,"mid":"003EyGBb0jBpeK","name":"请别爱我了","title":"请别爱我了","subtitle":"","time_public":"2023-03-02","pmid":"003EyGBb0jBpeK_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":217,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-02","status":0,"fnote":4009,"file":{"media_mid":"001dsgZL4UG8H1","size_24aac":0,"size_48aac":1325700,"size_96aac":2654576,"size_192ogg":4777028,"size_192aac":5269110,"size_128mp3":3488505,"size_320mp3":8720416,"size_ape":0,"size_flac":23090666,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2467734,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,8463506]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70085641,"mid":"001gZ68z0bqBHB"},"volume":{"gain":-8.31,"peak":0.966,"lra":9.356},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["","","","",""],"vi":[3350070],"ktag":"0"},{"id":398796698,"type":0,"mid":"002cuRrX0Q7dNY","name":"一个人想着一个人","title":"一个人想着一个人 (吉他版)","subtitle":"","singer":[{"id":5546799,"mid":"002xzokf2gBD7R","name":"派美眉","title":"派美眉","type":1,"uin":1976738837,"pmid":""}],"album":{"id":35842072,"mid":"004SeVsn46MGNh","name":"一个人想着一个人 (吉他版)","title":"一个人想着一个人 (吉他版)","subtitle":"","time_public":"2023-03-02","pmid":"004SeVsn46MGNh_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":195,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-02","status":0,"fnote":4009,"file":{"media_mid":"002cuRrX0Q7dNY","size_24aac":0,"size_48aac":1201990,"size_96aac":2411824,"size_192ogg":4368304,"size_192aac":4771290,"size_128mp3":3136173,"size_320mp3":7840095,"size_ape":0,"size_flac":39916743,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2197726,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,7412450]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70106077,"mid":"001fzEqY40xYcb"},"volume":{"gain":-4.785,"peak":0.95,"lra":5.051},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["","","","",""],"vi":[3350070],"ktag":"0"},{"id":398614226,"type":0,"mid":"001oqHyS1OjZY5","name":"小狗","title":"小狗","subtitle":"","singer":[{"id":6660543,"mid":"000B5wGl14nUTk","name":"cici_","title":"cici_","type":1,"uin":1378040246,"pmid":""}],"album":{"id":35799314,"mid":"001n0xrs0ykpIH","name":"小狗","title":"小狗","subtitle":"","time_public":"2023-03-03","pmid":"001n0xrs0ykpIH_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":214,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"001oqHyS1OjZY5","size_24aac":0,"size_48aac":1306748,"size_96aac":2610542,"size_192ogg":4885157,"size_192aac":5178689,"size_128mp3":3425369,"size_320mp3":8563132,"size_ape":0,"size_flac":23281494,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2462035,"size_360ra":[],"size_dolby":0,"size_new":[139561239,20915621,53846900,8381826]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70146728,"mid":"001CVPpI39OANa"},"volume":{"gain":-5.93,"peak":1,"lra":13.62},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["","","","001noZWJ1pxlMM","002qXz6d1aqIHf"],"vi":[3658230],"ktag":"0"},{"id":398586889,"type":0,"mid":"001P2UXG2TJc2i","name":"三月三的故事","title":"三月三的故事","subtitle":"","singer":[{"id":5440501,"mid":"003W9kuM3w0wJZ","name":"一颗狼星","title":"一颗狼星","type":1,"uin":1850158333,"pmid":""},{"id":3245177,"mid":"001fYDDN1M3LA6","name":"朝歌夜弦","title":"朝歌夜弦","type":2,"uin":0,"pmid":""}],"album":{"id":35795618,"mid":"002jvyb53JKYKL","name":"三月三的故事","title":"三月三的故事","subtitle":"","time_public":"2023-03-03","pmid":"002jvyb53JKYKL_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":226,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-03","status":0,"fnote":4009,"file":{"media_mid":"001P2UXG2TJc2i","size_24aac":0,"size_48aac":1397410,"size_96aac":2786634,"size_192ogg":5343649,"size_192aac":5492818,"size_128mp3":3621824,"size_320mp3":9054249,"size_ape":0,"size_flac":47553198,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2700579,"size_360ra":[],"size_dolby":0,"size_new":[155422357,23338038,61072661,9090133]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70146738,"mid":"001QD9sQ2jSZQr"},"volume":{"gain":-9.199,"peak":0.992,"lra":8.923},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":2048,"es":"","vs":["","","","002tVwfP3CvGxV","003MHYRP1B80i1"],"vi":[103596],"ktag":"0"},{"id":398614257,"type":0,"mid":"003mwcJT4J3c5W","name":"义无反顾爱你","title":"义无反顾爱你 (DJ阿哲版)","subtitle":"","singer":[{"id":89698,"mid":"003Cn3Yh16q1MO","name":"庄心妍","title":"庄心妍","type":1,"uin":0,"pmid":""}],"album":{"id":35799312,"mid":"002eBqN90S4BHu","name":"义无反顾爱你 (DJ阿哲版)","title":"义无反顾爱你 (DJ阿哲版)","subtitle":"","time_public":"2023-03-02","pmid":"002eBqN90S4BHu_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":165,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-02","status":0,"fnote":4009,"file":{"media_mid":"003mwcJT4J3c5W","size_24aac":0,"size_48aac":995693,"size_96aac":1988544,"size_192ogg":3776553,"size_192aac":3960255,"size_128mp3":2656352,"size_320mp3":6640548,"size_ape":0,"size_flac":35266540,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":1879457,"size_360ra":[],"size_dolby":0,"size_new":[128427269,20744162,51828308,6682698]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69879612,"mid":"001tUnyr2rFIld"},"volume":{"gain":-8.148,"peak":0.916,"lra":2.535},"label":"0","url":"","bpm":0,"version":28,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":0,"es":"","vs":["","","","002HnyZf2ldQMa","0022LPmo1LwbWU"],"vi":[35432],"ktag":"0"},{"id":398349705,"type":0,"mid":"0017LWTf3vzzXL","name":"越界","title":"越界 (情结版)","subtitle":"","singer":[{"id":8470139,"mid":"000LDsSo1RAn0s","name":"你们的好朋友大雨","title":"你们的好朋友大雨","type":1,"uin":0,"pmid":""}],"album":{"id":35756819,"mid":"000VojZ64KZvGk","name":"越界 (情结版)","title":"越界 (情结版)","subtitle":"","time_public":"2023-03-02","pmid":"000VojZ64KZvGk_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":239,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-02","status":0,"fnote":4009,"file":{"media_mid":"0017LWTf3vzzXL","size_24aac":0,"size_48aac":1478757,"size_96aac":2964921,"size_192ogg":5074432,"size_192aac":5808302,"size_128mp3":3839167,"size_320mp3":9597599,"size_ape":0,"size_flac":46124254,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2628206,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,8727307]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70085643,"mid":"002FoIMD0fbJZE"},"volume":{"gain":-6.052,"peak":1,"lra":15.877},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":2048,"es":"","vs":["","","","",""],"vi":[3350070],"ktag":"0"},{"id":397839376,"type":0,"mid":"002voG3L4aPUT3","name":"你随风划过像一场烟火","title":"你随风划过像一场烟火","subtitle":"","singer":[{"id":5615016,"mid":"002h5yyN14BjhB","name":"汪应骏","title":"汪应骏","type":0,"uin":0,"pmid":""},{"id":10631935,"mid":"003yrgff1F6hVS","name":"王妙可milk","title":"王妙可milk","type":1,"uin":0,"pmid":""}],"album":{"id":35654988,"mid":"003TONWO1Uqm6U","name":"你随风划过像一场烟火","title":"你随风划过像一场烟火","subtitle":"","time_public":"2023-03-02","pmid":"003TONWO1Uqm6U_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":210,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-02","status":0,"fnote":4009,"file":{"media_mid":"002voG3L4aPUT3","size_24aac":0,"size_48aac":1280914,"size_96aac":2561300,"size_192ogg":4874931,"size_192aac":5087916,"size_128mp3":3364793,"size_320mp3":8411650,"size_ape":0,"size_flac":22065851,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2461047,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,8785232]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70085636,"mid":"000ohp1C0FDgxB"},"volume":{"gain":-6.515,"peak":0.966,"lra":10.614},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":2048,"es":"","vs":["","","","",""],"vi":[3350070],"ktag":"0"},{"id":398552962,"type":0,"mid":"0006IdCb4UoU1m","name":"可能","title":"可能","subtitle":"","singer":[{"id":4775092,"mid":"003H6saT14kM2H","name":"洪思雨","title":"洪思雨","type":1,"uin":508733276,"pmid":""}],"album":{"id":35790859,"mid":"003VVKyO1Ti8mo","name":"可能","title":"可能","subtitle":"","time_public":"2023-03-02","pmid":"003VVKyO1Ti8mo_2"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":215,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-02","status":0,"fnote":4009,"file":{"media_mid":"0006IdCb4UoU1m","size_24aac":0,"size_48aac":1314140,"size_96aac":2631588,"size_192ogg":4876494,"size_192aac":5227124,"size_128mp3":3450443,"size_320mp3":8625822,"size_ape":0,"size_flac":44610196,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2525607,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,8200985]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":70085640,"mid":"002AllRz3zYSGL"},"volume":{"gain":-7.715,"peak":1,"lra":11.462},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":2048,"es":"","vs":["","","","",""],"vi":[3350070],"ktag":"0"},{"id":398145817,"type":0,"mid":"002tSi5Y3QxvLS","name":"北海道没有雪","title":"北海道没有雪","subtitle":"","singer":[{"id":11607873,"mid":"0023tsR3352Af5","name":"王新杨","title":"王新杨","type":0,"uin":0,"pmid":""}],"album":{"id":35717844,"mid":"0011ja7s2bc35H","name":"北海道没有雪","title":"北海道没有雪","subtitle":"","time_public":"2023-03-02","pmid":"0011ja7s2bc35H_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":281,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-02","status":0,"fnote":4009,"file":{"media_mid":"002tSi5Y3QxvLS","size_24aac":0,"size_48aac":1722998,"size_96aac":3460897,"size_192ogg":6600380,"size_192aac":6819806,"size_128mp3":4512911,"size_320mp3":11281969,"size_ape":0,"size_flac":31761253,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":3265017,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,11542866]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69881862,"mid":"001htB6X1hBSqt"},"volume":{"gain":-8.792,"peak":0.988,"lra":10.433},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":2048,"es":"","vs":["","","","",""],"vi":[1197],"ktag":"0"},{"id":398145874,"type":0,"mid":"0031iEgs4GVTvy","name":"反正我在北京","title":"反正我在北京","subtitle":"","singer":[{"id":2063799,"mid":"001C4GhB1YPjvn","name":"秦洋","title":"秦洋","type":1,"uin":0,"pmid":""}],"album":{"id":35717858,"mid":"00227JCS1NBjxJ","name":"反正我在北京","title":"反正我在北京","subtitle":"","time_public":"2023-03-02","pmid":"00227JCS1NBjxJ_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":244,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-02","status":0,"fnote":4009,"file":{"media_mid":"0031iEgs4GVTvy","size_24aac":0,"size_48aac":1492902,"size_96aac":2983091,"size_192ogg":5702999,"size_192aac":5926913,"size_128mp3":3917317,"size_320mp3":9792987,"size_ape":0,"size_flac":28833363,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2884167,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,9981243]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69881881,"mid":"000Szhds3RKydI"},"volume":{"gain":-7.159,"peak":0.993,"lra":7.643},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":2048,"es":"","vs":["","","","",""],"vi":[1197],"ktag":"0"},{"id":398587947,"type":0,"mid":"001fdY2j3tziKi","name":"是否应该放手","title":"是否应该放手","subtitle":"","singer":[{"id":3628398,"mid":"002HvPeo0t89Qj","name":"大笨","title":"大笨","type":0,"uin":0,"pmid":""}],"album":{"id":35795783,"mid":"0023GL8f00sqg5","name":"是否应该放手","title":"是否应该放手","subtitle":"","time_public":"2023-03-02","pmid":"0023GL8f00sqg5_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":214,"isonly":0,"language":1,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-02","status":0,"fnote":4009,"file":{"media_mid":"001fdY2j3tziKi","size_24aac":0,"size_48aac":1305757,"size_96aac":2613951,"size_192ogg":5119364,"size_192aac":5197014,"size_128mp3":3434156,"size_320mp3":8585085,"size_ape":0,"size_flac":46602558,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2524638,"size_360ra":[],"size_dolby":0,"size_new":[0,24823519,61675283,8758251]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69881895,"mid":"002hQu7z1lBy6e"},"volume":{"gain":-9.905,"peak":1,"lra":5.317},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":2048,"es":"","vs":["","","","","000RfCSQ3er9w5"],"vi":[7389],"ktag":"0"},{"id":398165188,"type":0,"mid":"004NwKLv0dxFrK","name":"其实后来的我们","title":"其实后来的我们","subtitle":"","singer":[{"id":2801700,"mid":"002MLPRR2213c3","name":"黄恩娜","title":"黄恩娜","type":1,"uin":0,"pmid":""}],"album":{"id":35721079,"mid":"0043SH8p1yKuJ9","name":"其实后来的我们","title":"其实后来的我们","subtitle":"","time_public":"2023-03-02","pmid":"0043SH8p1yKuJ9_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":253,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-02","status":0,"fnote":4009,"file":{"media_mid":"004NwKLv0dxFrK","size_24aac":0,"size_48aac":1530494,"size_96aac":3062596,"size_192ogg":5504633,"size_192aac":6084522,"size_128mp3":4061937,"size_320mp3":10154528,"size_ape":0,"size_flac":52399135,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2811595,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,9632129]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69881890,"mid":"004XVgvc3R3lys"},"volume":{"gain":-9.759,"peak":0.999,"lra":13.454},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":2048,"es":"","vs":["","","","",""],"vi":[69511],"ktag":"0"},{"id":398045603,"type":0,"mid":"000qC6N23FHw3C","name":"落空","title":"落空","subtitle":"","singer":[{"id":3535961,"mid":"002EU6c005M3L1","name":"李飘飘","title":"李飘飘","type":0,"uin":1044457698,"pmid":""}],"album":{"id":35699729,"mid":"003P1HfB41NQbX","name":"落空","title":"落空","subtitle":"","time_public":"2023-02-26","pmid":"003P1HfB41NQbX_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":240,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-02-26","status":0,"fnote":4009,"file":{"media_mid":"000qC6N23FHw3C","size_24aac":0,"size_48aac":1474250,"size_96aac":2961327,"size_192ogg":5026752,"size_192aac":5866429,"size_128mp3":3854609,"size_320mp3":9636239,"size_ape":0,"size_flac":42846113,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2607997,"size_360ra":[],"size_dolby":0,"size_new":[153035628,22535559,58741252,9650085]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69287613,"mid":"002LZ97o3tM6pi"},"volume":{"gain":-7.04,"peak":0.966,"lra":8.192},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":2048,"es":"","vs":["","","","003tJG4z1JiBWl","000FyroX0ipkWd"],"vi":[103596],"ktag":"0"},{"id":398586882,"type":0,"mid":"000av8xh1pO88F","name":"谢谢你","title":"谢谢你","subtitle":"","singer":[{"id":5037426,"mid":"002ul7D70CpXpI","name":"小乐哥（王唯乐）","title":"小乐哥（王唯乐）","type":0,"uin":0,"pmid":""}],"album":{"id":35795617,"mid":"000q5hVR2YR8WC","name":"谢谢你","title":"谢谢你","subtitle":"","time_public":"2023-03-02","pmid":"000q5hVR2YR8WC_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":257,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-02","status":0,"fnote":4009,"file":{"media_mid":"000av8xh1pO88F","size_24aac":0,"size_48aac":1569117,"size_96aac":3140331,"size_192ogg":5572065,"size_192aac":6225181,"size_128mp3":4122117,"size_320mp3":10304987,"size_ape":0,"size_flac":25895187,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2886097,"size_360ra":[],"size_dolby":0,"size_new":[166105691,25032277,64333057,9772085]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69881839,"mid":"004BhM7n24zpwa"},"volume":{"gain":-9.73,"peak":1,"lra":15.46},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":2048,"es":"","vs":["","","","002nsZ8v4bSxMz","003Vr0864QBW8t"],"vi":[103596],"ktag":"0"},{"id":398146177,"type":0,"mid":"003aaG1V3eERb0","name":"模仿她","title":"模仿她","subtitle":"","singer":[{"id":1487264,"mid":"002FheWK0LSMMY","name":"于冬然","title":"于冬然","type":1,"uin":0,"pmid":""}],"album":{"id":35717931,"mid":"0001wW3I2ICBb0","name":"模仿她","title":"模仿她","subtitle":"","time_public":"2023-03-01","pmid":"0001wW3I2ICBb0_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":205,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-01","status":0,"fnote":4009,"file":{"media_mid":"003aaG1V3eERb0","size_24aac":0,"size_48aac":1233807,"size_96aac":2477090,"size_192ogg":4435308,"size_192aac":4902020,"size_128mp3":3287443,"size_320mp3":8218316,"size_ape":0,"size_flac":39654568,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2232484,"size_360ra":[],"size_dolby":0,"size_new":[128161550,19835859,50776222,7498730]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69835001,"mid":"004IaSOP2QqCXa"},"volume":{"gain":-9.654,"peak":1,"lra":18.858},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":2048,"es":"","vs":["","","","000qU36y0PJqTb","001VPpNj2cm58I"],"vi":[69511],"ktag":"0"},{"id":398148894,"type":0,"mid":"0003bB8238r7sk","name":"寄君一曲","title":"寄君一曲","subtitle":"","singer":[{"id":950203,"mid":"001sArBx4Gx9lP","name":"执素兮","title":"执素兮","type":1,"uin":41577995,"pmid":""}],"album":{"id":35718395,"mid":"002CISiC0wuIQq","name":"寄君一曲","title":"寄君一曲","subtitle":"","time_public":"2023-03-01","pmid":"002CISiC0wuIQq_2"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":228,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-01","status":0,"fnote":4009,"file":{"media_mid":"0003bB8238r7sk","size_24aac":0,"size_48aac":1388586,"size_96aac":2780789,"size_192ogg":5272422,"size_192aac":5528050,"size_128mp3":3656087,"size_320mp3":9139498,"size_ape":0,"size_flac":0,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2609703,"size_360ra":[],"size_dolby":0,"size_new":[0,0,0,8922582]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69835023,"mid":"004CbomZ03DYgc"},"volume":{"gain":-7.806,"peak":1,"lra":10.894},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":2048,"es":"","vs":["","","","",""],"vi":[69511],"ktag":"0"},{"id":398148476,"type":0,"mid":"0045E1N617MSQM","name":"忘了没有","title":"忘了没有","subtitle":"","singer":[{"id":5904756,"mid":"0021RwVb0FCFRN","name":"羊羊","title":"羊羊","type":1,"uin":0,"pmid":""}],"album":{"id":35718304,"mid":"004dlTGY4AcWjn","name":"忘了没有","title":"忘了没有","subtitle":"","time_public":"2023-03-01","pmid":"004dlTGY4AcWjn_1"},"mv":{"id":0,"vid":"","name":"","title":"","vt":0},"interval":254,"isonly":0,"language":0,"genre":1,"index_cd":0,"index_album":1,"time_public":"2023-03-01","status":0,"fnote":4009,"file":{"media_mid":"0045E1N617MSQM","size_24aac":0,"size_48aac":1545319,"size_96aac":3114602,"size_192ogg":5840000,"size_192aac":6132244,"size_128mp3":4075298,"size_320mp3":10187481,"size_ape":0,"size_flac":50541273,"size_dts":0,"size_try":0,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":0,"size_96ogg":2914533,"size_360ra":[],"size_dolby":0,"size_new":[158886997,24462954,62810622,9815176]},"pay":{"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0},"action":{"switch":16889603,"msgid":14,"alert":2,"icons":8535932,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0},"ksong":{"id":69835034,"mid":"002ATWSY0T81rk"},"volume":{"gain":-6.808,"peak":1,"lra":17.393},"label":"0","url":"","bpm":0,"version":0,"trace":"","data_type":0,"modify_stamp":0,"pingpong":"","aid":0,"ppurl":"","tid":0,"ov":0,"sa":2048,"es":"","vs":["","","","002OIPef3AmbgC","003P74uJ0iMHJf"],"vi":[3350070],"ktag":"0"}]
                 * ret_msg :
                 * type : 5
                 * songTagInfoList : [{"id":398722411,"tag":"独家首发30天","link":"","tagid":4016,"from_type":11},{"id":398782831,"tag":"独家首发30天","link":"","tagid":4016,"from_type":11},{"id":398738782,"tag":"独家首发30天","link":"","tagid":4016,"from_type":11},{"id":398716735,"tag":"独家首发30天","link":"","tagid":4016,"from_type":11},{"id":398716736,"tag":"独家首发30天","link":"","tagid":4016,"from_type":11},{"id":398716734,"tag":"独家首发30天","link":"","tagid":4016,"from_type":11},{"id":398291248,"tag":"独家首发30天","link":"","tagid":4016,"from_type":11},{"id":398133237,"tag":"独家首发30天","link":"","tagid":4016,"from_type":11},{"id":398801978,"tag":"独家首发3天","link":"","tagid":4010,"from_type":11},{"id":398916882,"tag":"独家首发30天","link":"","tagid":4016,"from_type":11},{"id":398790361,"tag":"独家首发30天","link":"","tagid":4016,"from_type":11}]
                 */

                private String lan;
                private String ret_msg;
                private int type;
                private List<LanlistBean> lanlist;
                private List<SonglistBean> songlist;
                private List<SongTagInfoListBean> songTagInfoList;

                public String getLan() {
                    return lan;
                }

                public void setLan(String lan) {
                    this.lan = lan;
                }

                public String getRet_msg() {
                    return ret_msg;
                }

                public void setRet_msg(String ret_msg) {
                    this.ret_msg = ret_msg;
                }

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }

                public List<LanlistBean> getLanlist() {
                    return lanlist;
                }

                public void setLanlist(List<LanlistBean> lanlist) {
                    this.lanlist = lanlist;
                }

                public List<SonglistBean> getSonglist() {
                    return songlist;
                }

                public void setSonglist(List<SonglistBean> songlist) {
                    this.songlist = songlist;
                }

                public List<SongTagInfoListBean> getSongTagInfoList() {
                    return songTagInfoList;
                }

                public void setSongTagInfoList(List<SongTagInfoListBean> songTagInfoList) {
                    this.songTagInfoList = songTagInfoList;
                }

                public static class LanlistBean {
                    /**
                     * name : new_song
                     * lan : 最新
                     * type : 5
                     * tjreport : 10_0_0_1_10001_5
                     */

                    private String name;
                    private String lan;
                    private int type;
                    private String tjreport;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getLan() {
                        return lan;
                    }

                    public void setLan(String lan) {
                        this.lan = lan;
                    }

                    public int getType() {
                        return type;
                    }

                    public void setType(int type) {
                        this.type = type;
                    }

                    public String getTjreport() {
                        return tjreport;
                    }

                    public void setTjreport(String tjreport) {
                        this.tjreport = tjreport;
                    }
                }

                public static class SonglistBean {
                    /**
                     * id : 398800936
                     * type : 0
                     * mid : 000zCeON1E0Ybr
                     * name : 爱在时光里
                     * title : 爱在时光里
                     * subtitle :
                     * singer : [{"id":4449,"mid":"001a1vdk1ZAqmf","name":"苏有朋","title":"苏有朋","type":0,"uin":0,"pmid":""}]
                     * album : {"id":35842789,"mid":"003lEUpK48PbGp","name":"爱在时光里","title":"爱在时光里","subtitle":"","time_public":"2023-03-03","pmid":"003lEUpK48PbGp_1"}
                     * mv : {"id":0,"vid":"","name":"","title":"","vt":0}
                     * interval : 196
                     * isonly : 0
                     * language : 0
                     * genre : 0
                     * index_cd : 0
                     * index_album : 1
                     * time_public : 2023-03-03
                     * status : 0
                     * fnote : 4009
                     * file : {"media_mid":"000zCeON1E0Ybr","size_24aac":0,"size_48aac":1195048,"size_96aac":2392491,"size_192ogg":4454861,"size_192aac":4753721,"size_128mp3":3147016,"size_320mp3":7867238,"size_ape":0,"size_flac":21579311,"size_dts":0,"size_try":960887,"try_begin":0,"try_end":0,"url":"","size_hires":0,"hires_sample":0,"hires_bitdepth":0,"b_30s":0,"e_30s":60000,"size_96ogg":2238786,"size_360ra":[],"size_dolby":0,"size_new":[136260058,21173068,55371673,8277431]}
                     * pay : {"pay_month":1,"price_track":200,"price_album":0,"pay_play":0,"pay_down":1,"pay_status":0,"time_free":0}
                     * action : {"switch":16889603,"msgid":14,"alert":2,"icons":75644796,"msgshare":0,"msgfav":0,"msgdown":0,"msgpay":6,"switch2":0,"icon2":0}
                     * ksong : {"id":70290951,"mid":"002ilDK20jwnKy"}
                     * volume : {"gain":-8.384,"peak":0.955,"lra":15.364}
                     * label : 0
                     * url :
                     * bpm : 0
                     * version : 0
                     * trace :
                     * data_type : 8
                     * modify_stamp : 0
                     * pingpong :
                     * aid : 0
                     * ppurl :
                     * tid : 0
                     * ov : 0
                     * sa : 0
                     * es :
                     * vs : ["060gvsec3CspML","","","002eNYY21sSwmY","002Bgd722QQjjv"]
                     * vi : [4254103]
                     * ktag : 0
                     */

                    private int id;
                    private int type;
                    private String mid;
                    private String name;
                    private String title;
                    private String subtitle;
                    private AlbumBean album;
                    private MvBean mv;
                    private int interval;
                    private int isonly;
                    private int language;
                    private int genre;
                    private int index_cd;
                    private int index_album;
                    private String time_public;
                    private int status;
                    private int fnote;
                    private FileBean file;
                    private PayBean pay;
                    private ActionBean action;
                    private KsongBean ksong;
                    private VolumeBean volume;
                    private String label;
                    private String url;
                    private int bpm;
                    private int version;
                    private String trace;
                    private int data_type;
                    private int modify_stamp;
                    private String pingpong;
                    private int aid;
                    private String ppurl;
                    private int tid;
                    private int ov;
                    private int sa;
                    private String es;
                    private String ktag;
                    private List<SingerBean> singer;
                    private List<String> vs;
                    private List<Integer> vi;

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public int getType() {
                        return type;
                    }

                    public void setType(int type) {
                        this.type = type;
                    }

                    public String getMid() {
                        return mid;
                    }

                    public void setMid(String mid) {
                        this.mid = mid;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getTitle() {
                        return title;
                    }

                    public void setTitle(String title) {
                        this.title = title;
                    }

                    public String getSubtitle() {
                        return subtitle;
                    }

                    public void setSubtitle(String subtitle) {
                        this.subtitle = subtitle;
                    }

                    public AlbumBean getAlbum() {
                        return album;
                    }

                    public void setAlbum(AlbumBean album) {
                        this.album = album;
                    }

                    public MvBean getMv() {
                        return mv;
                    }

                    public void setMv(MvBean mv) {
                        this.mv = mv;
                    }

                    public int getInterval() {
                        return interval;
                    }

                    public void setInterval(int interval) {
                        this.interval = interval;
                    }

                    public int getIsonly() {
                        return isonly;
                    }

                    public void setIsonly(int isonly) {
                        this.isonly = isonly;
                    }

                    public int getLanguage() {
                        return language;
                    }

                    public void setLanguage(int language) {
                        this.language = language;
                    }

                    public int getGenre() {
                        return genre;
                    }

                    public void setGenre(int genre) {
                        this.genre = genre;
                    }

                    public int getIndex_cd() {
                        return index_cd;
                    }

                    public void setIndex_cd(int index_cd) {
                        this.index_cd = index_cd;
                    }

                    public int getIndex_album() {
                        return index_album;
                    }

                    public void setIndex_album(int index_album) {
                        this.index_album = index_album;
                    }

                    public String getTime_public() {
                        return time_public;
                    }

                    public void setTime_public(String time_public) {
                        this.time_public = time_public;
                    }

                    public int getStatus() {
                        return status;
                    }

                    public void setStatus(int status) {
                        this.status = status;
                    }

                    public int getFnote() {
                        return fnote;
                    }

                    public void setFnote(int fnote) {
                        this.fnote = fnote;
                    }

                    public FileBean getFile() {
                        return file;
                    }

                    public void setFile(FileBean file) {
                        this.file = file;
                    }

                    public PayBean getPay() {
                        return pay;
                    }

                    public void setPay(PayBean pay) {
                        this.pay = pay;
                    }

                    public ActionBean getAction() {
                        return action;
                    }

                    public void setAction(ActionBean action) {
                        this.action = action;
                    }

                    public KsongBean getKsong() {
                        return ksong;
                    }

                    public void setKsong(KsongBean ksong) {
                        this.ksong = ksong;
                    }

                    public VolumeBean getVolume() {
                        return volume;
                    }

                    public void setVolume(VolumeBean volume) {
                        this.volume = volume;
                    }

                    public String getLabel() {
                        return label;
                    }

                    public void setLabel(String label) {
                        this.label = label;
                    }

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public int getBpm() {
                        return bpm;
                    }

                    public void setBpm(int bpm) {
                        this.bpm = bpm;
                    }

                    public int getVersion() {
                        return version;
                    }

                    public void setVersion(int version) {
                        this.version = version;
                    }

                    public String getTrace() {
                        return trace;
                    }

                    public void setTrace(String trace) {
                        this.trace = trace;
                    }

                    public int getData_type() {
                        return data_type;
                    }

                    public void setData_type(int data_type) {
                        this.data_type = data_type;
                    }

                    public int getModify_stamp() {
                        return modify_stamp;
                    }

                    public void setModify_stamp(int modify_stamp) {
                        this.modify_stamp = modify_stamp;
                    }

                    public String getPingpong() {
                        return pingpong;
                    }

                    public void setPingpong(String pingpong) {
                        this.pingpong = pingpong;
                    }

                    public int getAid() {
                        return aid;
                    }

                    public void setAid(int aid) {
                        this.aid = aid;
                    }

                    public String getPpurl() {
                        return ppurl;
                    }

                    public void setPpurl(String ppurl) {
                        this.ppurl = ppurl;
                    }

                    public int getTid() {
                        return tid;
                    }

                    public void setTid(int tid) {
                        this.tid = tid;
                    }

                    public int getOv() {
                        return ov;
                    }

                    public void setOv(int ov) {
                        this.ov = ov;
                    }

                    public int getSa() {
                        return sa;
                    }

                    public void setSa(int sa) {
                        this.sa = sa;
                    }

                    public String getEs() {
                        return es;
                    }

                    public void setEs(String es) {
                        this.es = es;
                    }

                    public String getKtag() {
                        return ktag;
                    }

                    public void setKtag(String ktag) {
                        this.ktag = ktag;
                    }

                    public List<SingerBean> getSinger() {
                        return singer;
                    }

                    public void setSinger(List<SingerBean> singer) {
                        this.singer = singer;
                    }

                    public List<String> getVs() {
                        return vs;
                    }

                    public void setVs(List<String> vs) {
                        this.vs = vs;
                    }

                    public List<Integer> getVi() {
                        return vi;
                    }

                    public void setVi(List<Integer> vi) {
                        this.vi = vi;
                    }

                    public static class AlbumBean {
                        /**
                         * id : 35842789
                         * mid : 003lEUpK48PbGp
                         * name : 爱在时光里
                         * title : 爱在时光里
                         * subtitle :
                         * time_public : 2023-03-03
                         * pmid : 003lEUpK48PbGp_1
                         */

                        private int id;
                        private String mid;
                        private String name;
                        private String title;
                        private String subtitle;
                        private String time_public;
                        private String pmid;

                        public int getId() {
                            return id;
                        }

                        public void setId(int id) {
                            this.id = id;
                        }

                        public String getMid() {
                            return mid;
                        }

                        public void setMid(String mid) {
                            this.mid = mid;
                        }

                        public String getName() {
                            return name;
                        }

                        public void setName(String name) {
                            this.name = name;
                        }

                        public String getTitle() {
                            return title;
                        }

                        public void setTitle(String title) {
                            this.title = title;
                        }

                        public String getSubtitle() {
                            return subtitle;
                        }

                        public void setSubtitle(String subtitle) {
                            this.subtitle = subtitle;
                        }

                        public String getTime_public() {
                            return time_public;
                        }

                        public void setTime_public(String time_public) {
                            this.time_public = time_public;
                        }

                        public String getPmid() {
                            return pmid;
                        }

                        public void setPmid(String pmid) {
                            this.pmid = pmid;
                        }
                    }

                    public static class MvBean {
                        /**
                         * id : 0
                         * vid :
                         * name :
                         * title :
                         * vt : 0
                         */

                        private int id;
                        private String vid;
                        private String name;
                        private String title;
                        private int vt;

                        public int getId() {
                            return id;
                        }

                        public void setId(int id) {
                            this.id = id;
                        }

                        public String getVid() {
                            return vid;
                        }

                        public void setVid(String vid) {
                            this.vid = vid;
                        }

                        public String getName() {
                            return name;
                        }

                        public void setName(String name) {
                            this.name = name;
                        }

                        public String getTitle() {
                            return title;
                        }

                        public void setTitle(String title) {
                            this.title = title;
                        }

                        public int getVt() {
                            return vt;
                        }

                        public void setVt(int vt) {
                            this.vt = vt;
                        }
                    }

                    public static class FileBean {
                        /**
                         * media_mid : 000zCeON1E0Ybr
                         * size_24aac : 0
                         * size_48aac : 1195048
                         * size_96aac : 2392491
                         * size_192ogg : 4454861
                         * size_192aac : 4753721
                         * size_128mp3 : 3147016
                         * size_320mp3 : 7867238
                         * size_ape : 0
                         * size_flac : 21579311
                         * size_dts : 0
                         * size_try : 960887
                         * try_begin : 0
                         * try_end : 0
                         * url :
                         * size_hires : 0
                         * hires_sample : 0
                         * hires_bitdepth : 0
                         * b_30s : 0
                         * e_30s : 60000
                         * size_96ogg : 2238786
                         * size_360ra : []
                         * size_dolby : 0
                         * size_new : [136260058,21173068,55371673,8277431]
                         */

                        private String media_mid;
                        private int size_24aac;
                        private int size_48aac;
                        private int size_96aac;
                        private int size_192ogg;
                        private int size_192aac;
                        private int size_128mp3;
                        private int size_320mp3;
                        private int size_ape;
                        private int size_flac;
                        private int size_dts;
                        private int size_try;
                        private int try_begin;
                        private int try_end;
                        private String url;
                        private int size_hires;
                        private int hires_sample;
                        private int hires_bitdepth;
                        private int b_30s;
                        private int e_30s;
                        private int size_96ogg;
                        private int size_dolby;
                        private List<?> size_360ra;
                        private List<Integer> size_new;

                        public String getMedia_mid() {
                            return media_mid;
                        }

                        public void setMedia_mid(String media_mid) {
                            this.media_mid = media_mid;
                        }

                        public int getSize_24aac() {
                            return size_24aac;
                        }

                        public void setSize_24aac(int size_24aac) {
                            this.size_24aac = size_24aac;
                        }

                        public int getSize_48aac() {
                            return size_48aac;
                        }

                        public void setSize_48aac(int size_48aac) {
                            this.size_48aac = size_48aac;
                        }

                        public int getSize_96aac() {
                            return size_96aac;
                        }

                        public void setSize_96aac(int size_96aac) {
                            this.size_96aac = size_96aac;
                        }

                        public int getSize_192ogg() {
                            return size_192ogg;
                        }

                        public void setSize_192ogg(int size_192ogg) {
                            this.size_192ogg = size_192ogg;
                        }

                        public int getSize_192aac() {
                            return size_192aac;
                        }

                        public void setSize_192aac(int size_192aac) {
                            this.size_192aac = size_192aac;
                        }

                        public int getSize_128mp3() {
                            return size_128mp3;
                        }

                        public void setSize_128mp3(int size_128mp3) {
                            this.size_128mp3 = size_128mp3;
                        }

                        public int getSize_320mp3() {
                            return size_320mp3;
                        }

                        public void setSize_320mp3(int size_320mp3) {
                            this.size_320mp3 = size_320mp3;
                        }

                        public int getSize_ape() {
                            return size_ape;
                        }

                        public void setSize_ape(int size_ape) {
                            this.size_ape = size_ape;
                        }

                        public int getSize_flac() {
                            return size_flac;
                        }

                        public void setSize_flac(int size_flac) {
                            this.size_flac = size_flac;
                        }

                        public int getSize_dts() {
                            return size_dts;
                        }

                        public void setSize_dts(int size_dts) {
                            this.size_dts = size_dts;
                        }

                        public int getSize_try() {
                            return size_try;
                        }

                        public void setSize_try(int size_try) {
                            this.size_try = size_try;
                        }

                        public int getTry_begin() {
                            return try_begin;
                        }

                        public void setTry_begin(int try_begin) {
                            this.try_begin = try_begin;
                        }

                        public int getTry_end() {
                            return try_end;
                        }

                        public void setTry_end(int try_end) {
                            this.try_end = try_end;
                        }

                        public String getUrl() {
                            return url;
                        }

                        public void setUrl(String url) {
                            this.url = url;
                        }

                        public int getSize_hires() {
                            return size_hires;
                        }

                        public void setSize_hires(int size_hires) {
                            this.size_hires = size_hires;
                        }

                        public int getHires_sample() {
                            return hires_sample;
                        }

                        public void setHires_sample(int hires_sample) {
                            this.hires_sample = hires_sample;
                        }

                        public int getHires_bitdepth() {
                            return hires_bitdepth;
                        }

                        public void setHires_bitdepth(int hires_bitdepth) {
                            this.hires_bitdepth = hires_bitdepth;
                        }

                        public int getB_30s() {
                            return b_30s;
                        }

                        public void setB_30s(int b_30s) {
                            this.b_30s = b_30s;
                        }

                        public int getE_30s() {
                            return e_30s;
                        }

                        public void setE_30s(int e_30s) {
                            this.e_30s = e_30s;
                        }

                        public int getSize_96ogg() {
                            return size_96ogg;
                        }

                        public void setSize_96ogg(int size_96ogg) {
                            this.size_96ogg = size_96ogg;
                        }

                        public int getSize_dolby() {
                            return size_dolby;
                        }

                        public void setSize_dolby(int size_dolby) {
                            this.size_dolby = size_dolby;
                        }

                        public List<?> getSize_360ra() {
                            return size_360ra;
                        }

                        public void setSize_360ra(List<?> size_360ra) {
                            this.size_360ra = size_360ra;
                        }

                        public List<Integer> getSize_new() {
                            return size_new;
                        }

                        public void setSize_new(List<Integer> size_new) {
                            this.size_new = size_new;
                        }
                    }

                    public static class PayBean {
                        /**
                         * pay_month : 1
                         * price_track : 200
                         * price_album : 0
                         * pay_play : 0
                         * pay_down : 1
                         * pay_status : 0
                         * time_free : 0
                         */

                        private int pay_month;
                        private int price_track;
                        private int price_album;
                        private int pay_play;
                        private int pay_down;
                        private int pay_status;
                        private int time_free;

                        public int getPay_month() {
                            return pay_month;
                        }

                        public void setPay_month(int pay_month) {
                            this.pay_month = pay_month;
                        }

                        public int getPrice_track() {
                            return price_track;
                        }

                        public void setPrice_track(int price_track) {
                            this.price_track = price_track;
                        }

                        public int getPrice_album() {
                            return price_album;
                        }

                        public void setPrice_album(int price_album) {
                            this.price_album = price_album;
                        }

                        public int getPay_play() {
                            return pay_play;
                        }

                        public void setPay_play(int pay_play) {
                            this.pay_play = pay_play;
                        }

                        public int getPay_down() {
                            return pay_down;
                        }

                        public void setPay_down(int pay_down) {
                            this.pay_down = pay_down;
                        }

                        public int getPay_status() {
                            return pay_status;
                        }

                        public void setPay_status(int pay_status) {
                            this.pay_status = pay_status;
                        }

                        public int getTime_free() {
                            return time_free;
                        }

                        public void setTime_free(int time_free) {
                            this.time_free = time_free;
                        }
                    }

                    public static class ActionBean {
                        /**
                         * switch : 16889603
                         * msgid : 14
                         * alert : 2
                         * icons : 75644796
                         * msgshare : 0
                         * msgfav : 0
                         * msgdown : 0
                         * msgpay : 6
                         * switch2 : 0
                         * icon2 : 0
                         */

                        @SerializedName("switch")
                        private int switchX;
                        private int msgid;
                        private int alert;
                        private int icons;
                        private int msgshare;
                        private int msgfav;
                        private int msgdown;
                        private int msgpay;
                        private int switch2;
                        private int icon2;

                        public int getSwitchX() {
                            return switchX;
                        }

                        public void setSwitchX(int switchX) {
                            this.switchX = switchX;
                        }

                        public int getMsgid() {
                            return msgid;
                        }

                        public void setMsgid(int msgid) {
                            this.msgid = msgid;
                        }

                        public int getAlert() {
                            return alert;
                        }

                        public void setAlert(int alert) {
                            this.alert = alert;
                        }

                        public int getIcons() {
                            return icons;
                        }

                        public void setIcons(int icons) {
                            this.icons = icons;
                        }

                        public int getMsgshare() {
                            return msgshare;
                        }

                        public void setMsgshare(int msgshare) {
                            this.msgshare = msgshare;
                        }

                        public int getMsgfav() {
                            return msgfav;
                        }

                        public void setMsgfav(int msgfav) {
                            this.msgfav = msgfav;
                        }

                        public int getMsgdown() {
                            return msgdown;
                        }

                        public void setMsgdown(int msgdown) {
                            this.msgdown = msgdown;
                        }

                        public int getMsgpay() {
                            return msgpay;
                        }

                        public void setMsgpay(int msgpay) {
                            this.msgpay = msgpay;
                        }

                        public int getSwitch2() {
                            return switch2;
                        }

                        public void setSwitch2(int switch2) {
                            this.switch2 = switch2;
                        }

                        public int getIcon2() {
                            return icon2;
                        }

                        public void setIcon2(int icon2) {
                            this.icon2 = icon2;
                        }
                    }

                    public static class KsongBean {
                        /**
                         * id : 70290951
                         * mid : 002ilDK20jwnKy
                         */

                        private int id;
                        private String mid;

                        public int getId() {
                            return id;
                        }

                        public void setId(int id) {
                            this.id = id;
                        }

                        public String getMid() {
                            return mid;
                        }

                        public void setMid(String mid) {
                            this.mid = mid;
                        }
                    }

                    public static class VolumeBean {
                        /**
                         * gain : -8.384
                         * peak : 0.955
                         * lra : 15.364
                         */

                        private double gain;
                        private double peak;
                        private double lra;

                        public double getGain() {
                            return gain;
                        }

                        public void setGain(double gain) {
                            this.gain = gain;
                        }

                        public double getPeak() {
                            return peak;
                        }

                        public void setPeak(double peak) {
                            this.peak = peak;
                        }

                        public double getLra() {
                            return lra;
                        }

                        public void setLra(double lra) {
                            this.lra = lra;
                        }
                    }

                    public static class SingerBean {
                        /**
                         * id : 4449
                         * mid : 001a1vdk1ZAqmf
                         * name : 苏有朋
                         * title : 苏有朋
                         * type : 0
                         * uin : 0
                         * pmid :
                         */

                        private int id;
                        private String mid;
                        private String name;
                        private String title;
                        private int type;
                        private int uin;
                        private String pmid;

                        public int getId() {
                            return id;
                        }

                        public void setId(int id) {
                            this.id = id;
                        }

                        public String getMid() {
                            return mid;
                        }

                        public void setMid(String mid) {
                            this.mid = mid;
                        }

                        public String getName() {
                            return name;
                        }

                        public void setName(String name) {
                            this.name = name;
                        }

                        public String getTitle() {
                            return title;
                        }

                        public void setTitle(String title) {
                            this.title = title;
                        }

                        public int getType() {
                            return type;
                        }

                        public void setType(int type) {
                            this.type = type;
                        }

                        public int getUin() {
                            return uin;
                        }

                        public void setUin(int uin) {
                            this.uin = uin;
                        }

                        public String getPmid() {
                            return pmid;
                        }

                        public void setPmid(String pmid) {
                            this.pmid = pmid;
                        }
                    }
                }

                public static class SongTagInfoListBean {
                    /**
                     * id : 398722411
                     * tag : 独家首发30天
                     * link :
                     * tagid : 4016
                     * from_type : 11
                     */

                    private int id;
                    private String tag;
                    private String link;
                    private int tagid;
                    private int from_type;

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public String getTag() {
                        return tag;
                    }

                    public void setTag(String tag) {
                        this.tag = tag;
                    }

                    public String getLink() {
                        return link;
                    }

                    public void setLink(String link) {
                        this.link = link;
                    }

                    public int getTagid() {
                        return tagid;
                    }

                    public void setTagid(int tagid) {
                        this.tagid = tagid;
                    }

                    public int getFrom_type() {
                        return from_type;
                    }

                    public void setFrom_type(int from_type) {
                        this.from_type = from_type;
                    }
                }
            }
        }

        public static class NewAlbumBean {
            /**
             * code : 0
             * data : {"albums":[{"id":35865482,"mid":"004Wn5tk20B0ZZ","name":"我在时间尽头等你 音乐剧原声带","trans_name":"","singers":[{"id":2122094,"mid":"0021rE0d46NhIt","name":"林彦俊","foreign_name":"","type":0,"genre":0,"area":0,"company":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"grade":0,"origin":0,"enter":0,"country":0,"identity":0,"birthday":"","instrument":0,"ex":{"desc":"","wiki":"","tag":"","ex_status":0,"ex_identity":0,"info_name":"","name_spell":"","band":"","dieDate":""},"photo":{"has_photo":0,"photo_cnt":0,"big_photo_flag":"","magic_rgb":0,"pic1_flag":0,"pic2_flag":0,"pic_mid":""},"opt_grade":0,"status":0,"opt_grade_new":0,"vertical_type":"","singer_wiki":""},{"id":13117975,"mid":"001Ye7sC2R1k8m","name":"潘艺琳","foreign_name":"","type":0,"genre":0,"area":0,"company":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"grade":0,"origin":0,"enter":0,"country":0,"identity":0,"birthday":"","instrument":0,"ex":{"desc":"","wiki":"","tag":"","ex_status":0,"ex_identity":0,"info_name":"","name_spell":"","band":"","dieDate":""},"photo":{"has_photo":0,"photo_cnt":0,"big_photo_flag":"","magic_rgb":0,"pic1_flag":0,"pic2_flag":0,"pic_mid":""},"opt_grade":0,"status":0,"opt_grade_new":0,"vertical_type":"","singer_wiki":""},{"id":6787676,"mid":"003vLbfK2gttHq","name":"严小北","foreign_name":"","type":0,"genre":0,"area":0,"company":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"grade":0,"origin":0,"enter":0,"country":0,"identity":0,"birthday":"","instrument":0,"ex":{"desc":"","wiki":"","tag":"","ex_status":0,"ex_identity":0,"info_name":"","name_spell":"","band":"","dieDate":""},"photo":{"has_photo":0,"photo_cnt":0,"big_photo_flag":"","magic_rgb":0,"pic1_flag":0,"pic2_flag":0,"pic_mid":""},"opt_grade":0,"status":0,"opt_grade_new":0,"vertical_type":"","singer_wiki":""},{"id":3696440,"mid":"000qk6Z60ENLyM","name":"王瀚宇","foreign_name":"","type":0,"genre":0,"area":0,"company":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"grade":0,"origin":0,"enter":0,"country":0,"identity":0,"birthday":"","instrument":0,"ex":{"desc":"","wiki":"","tag":"","ex_status":0,"ex_identity":0,"info_name":"","name_spell":"","band":"","dieDate":""},"photo":{"has_photo":0,"photo_cnt":0,"big_photo_flag":"","magic_rgb":0,"pic1_flag":0,"pic2_flag":0,"pic_mid":""},"opt_grade":0,"status":0,"opt_grade_new":0,"vertical_type":"","singer_wiki":""},{"id":13283622,"mid":"003cqFjX1faPky","name":"李金哲","foreign_name":"","type":0,"genre":0,"area":0,"company":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"grade":0,"origin":0,"enter":0,"country":0,"identity":0,"birthday":"","instrument":0,"ex":{"desc":"","wiki":"","tag":"","ex_status":0,"ex_identity":0,"info_name":"","name_spell":"","band":"","dieDate":""},"photo":{"has_photo":0,"photo_cnt":0,"big_photo_flag":"","magic_rgb":0,"pic1_flag":0,"pic2_flag":0,"pic_mid":""},"opt_grade":0,"status":0,"opt_grade_new":0,"vertical_type":"","singer_wiki":""},{"id":13283634,"mid":"003Z6Z2C2V9W52","name":"王上斌","foreign_name":"","type":0,"genre":0,"area":0,"company":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"grade":0,"origin":0,"enter":0,"country":0,"identity":0,"birthday":"","instrument":0,"ex":{"desc":"","wiki":"","tag":"","ex_status":0,"ex_identity":0,"info_name":"","name_spell":"","band":"","dieDate":""},"photo":{"has_photo":0,"photo_cnt":0,"big_photo_flag":"","magic_rgb":0,"pic1_flag":0,"pic2_flag":0,"pic_mid":""},"opt_grade":0,"status":0,"opt_grade_new":0,"vertical_type":"","singer_wiki":""},{"id":1264992,"mid":"0041hdb93sK5Eu","name":"赵晏伯","foreign_name":"","type":0,"genre":0,"area":0,"company":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"grade":0,"origin":0,"enter":0,"country":0,"identity":0,"birthday":"","instrument":0,"ex":{"desc":"","wiki":"","tag":"","ex_status":0,"ex_identity":0,"info_name":"","name_spell":"","band":"","dieDate":""},"photo":{"has_photo":0,"photo_cnt":0,"big_photo_flag":"","magic_rgb":0,"pic1_flag":0,"pic2_flag":0,"pic_mid":""},"opt_grade":0,"status":0,"opt_grade_new":0,"vertical_type":"","singer_wiki":""}],"type":0,"language":0,"genre":0,"area":0,"movie":"","release_time":"2023-03-03","company":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"status":0,"index":"","tag":"","pay":{"payment_total":0,"payment_album_type":0,"payment_discount":0,"payment_discount_beg":0,"payment_discount_end":0,"payment_beg":"","payment_end":"","pre_sale_beg":"","str_payment_discount_beg":"","str_payment_discount_end":""},"ex":{"desc":"","track_nums":0,"playable_track_nums":0,"album_tag3":0,"singer_tag":"","album_tag5":"","schedule_status":0,"long_audio_nums":0,"caliber":0},"photo":{"gaus_pic":"","has_photo":0,"pic_mid":"004Wn5tk20B0ZZ_3","vip_flag":0,"pay_flag":0,"version":0,"primecolor":0,"magic_class":0,"magic_color":0},"tmetags":"","ex_status":1,"show_com_new":0,"companyshow":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"modify_time":"","str_genre":"","album_right":0,"Fpay_control":0,"cd_album_id":"","mini_album_id":"","data":{"int2":0,"int3":0,"update_time":"","int4":0},"album_wiki":""},{"id":35715965,"mid":"000hjuUJ4WjUo8","name":"没你的维度","trans_name":"","singers":[{"id":1373351,"mid":"0025ipyS2r3gDv","name":"周锐","foreign_name":"","type":0,"genre":0,"area":0,"company":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"grade":0,"origin":0,"enter":0,"country":0,"identity":0,"birthday":"","instrument":0,"ex":{"desc":"","wiki":"","tag":"","ex_status":0,"ex_identity":0,"info_name":"","name_spell":"","band":"","dieDate":""},"photo":{"has_photo":0,"photo_cnt":0,"big_photo_flag":"","magic_rgb":0,"pic1_flag":0,"pic2_flag":0,"pic_mid":""},"opt_grade":0,"status":0,"opt_grade_new":0,"vertical_type":"","singer_wiki":""}],"type":0,"language":0,"genre":0,"area":0,"movie":"","release_time":"2023-03-03","company":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"status":0,"index":"","tag":"","pay":{"payment_total":0,"payment_album_type":0,"payment_discount":0,"payment_discount_beg":0,"payment_discount_end":0,"payment_beg":"","payment_end":"","pre_sale_beg":"","str_payment_discount_beg":"","str_payment_discount_end":""},"ex":{"desc":"","track_nums":0,"playable_track_nums":0,"album_tag3":0,"singer_tag":"","album_tag5":"","schedule_status":0,"long_audio_nums":0,"caliber":0},"photo":{"gaus_pic":"","has_photo":0,"pic_mid":"000hjuUJ4WjUo8_1","vip_flag":0,"pay_flag":0,"version":0,"primecolor":0,"magic_class":0,"magic_color":0},"tmetags":"","ex_status":1,"show_com_new":0,"companyshow":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"modify_time":"","str_genre":"","album_right":0,"Fpay_control":0,"cd_album_id":"","mini_album_id":"","data":{"int2":0,"int3":0,"update_time":"","int4":0},"album_wiki":""},{"id":35838581,"mid":"000Lhkvp3IkQGi","name":"黑夜里的光","trans_name":"","singers":[{"id":3258719,"mid":"000BKI3h00z81h","name":"茜西","foreign_name":"","type":0,"genre":0,"area":0,"company":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"grade":0,"origin":0,"enter":0,"country":0,"identity":0,"birthday":"","instrument":0,"ex":{"desc":"","wiki":"","tag":"","ex_status":0,"ex_identity":0,"info_name":"","name_spell":"","band":"","dieDate":""},"photo":{"has_photo":0,"photo_cnt":0,"big_photo_flag":"","magic_rgb":0,"pic1_flag":0,"pic2_flag":0,"pic_mid":""},"opt_grade":0,"status":0,"opt_grade_new":0,"vertical_type":"","singer_wiki":""}],"type":0,"language":0,"genre":0,"area":0,"movie":"","release_time":"2023-03-03","company":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"status":0,"index":"","tag":"","pay":{"payment_total":0,"payment_album_type":0,"payment_discount":0,"payment_discount_beg":0,"payment_discount_end":0,"payment_beg":"","payment_end":"","pre_sale_beg":"","str_payment_discount_beg":"","str_payment_discount_end":""},"ex":{"desc":"","track_nums":0,"playable_track_nums":0,"album_tag3":0,"singer_tag":"","album_tag5":"","schedule_status":0,"long_audio_nums":0,"caliber":0},"photo":{"gaus_pic":"","has_photo":0,"pic_mid":"000Lhkvp3IkQGi_1","vip_flag":0,"pay_flag":0,"version":0,"primecolor":0,"magic_class":0,"magic_color":0},"tmetags":"","ex_status":1,"show_com_new":0,"companyshow":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"modify_time":"","str_genre":"","album_right":0,"Fpay_control":0,"cd_album_id":"","mini_album_id":"","data":{"int2":0,"int3":0,"update_time":"","int4":0},"album_wiki":""},{"id":35838675,"mid":"001zHql63nFX5B","name":"Don't let me go","trans_name":"","singers":[{"id":6226311,"mid":"002RmwAW4WkdQz","name":"王嘉源","foreign_name":"","type":0,"genre":0,"area":0,"company":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"grade":0,"origin":0,"enter":0,"country":0,"identity":0,"birthday":"","instrument":0,"ex":{"desc":"","wiki":"","tag":"","ex_status":0,"ex_identity":0,"info_name":"","name_spell":"","band":"","dieDate":""},"photo":{"has_photo":0,"photo_cnt":0,"big_photo_flag":"","magic_rgb":0,"pic1_flag":0,"pic2_flag":0,"pic_mid":""},"opt_grade":0,"status":0,"opt_grade_new":0,"vertical_type":"","singer_wiki":""},{"id":9701592,"mid":"001gl1EA1r8Ktc","name":"SUPER RAVER","foreign_name":"","type":0,"genre":0,"area":0,"company":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"grade":0,"origin":0,"enter":0,"country":0,"identity":0,"birthday":"","instrument":0,"ex":{"desc":"","wiki":"","tag":"","ex_status":0,"ex_identity":0,"info_name":"","name_spell":"","band":"","dieDate":""},"photo":{"has_photo":0,"photo_cnt":0,"big_photo_flag":"","magic_rgb":0,"pic1_flag":0,"pic2_flag":0,"pic_mid":""},"opt_grade":0,"status":0,"opt_grade_new":0,"vertical_type":"","singer_wiki":""}],"type":0,"language":0,"genre":0,"area":0,"movie":"","release_time":"2023-03-03","company":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"status":0,"index":"","tag":"","pay":{"payment_total":0,"payment_album_type":0,"payment_discount":0,"payment_discount_beg":0,"payment_discount_end":0,"payment_beg":"","payment_end":"","pre_sale_beg":"","str_payment_discount_beg":"","str_payment_discount_end":""},"ex":{"desc":"","track_nums":0,"playable_track_nums":0,"album_tag3":0,"singer_tag":"","album_tag5":"","schedule_status":0,"long_audio_nums":0,"caliber":0},"photo":{"gaus_pic":"","has_photo":0,"pic_mid":"001zHql63nFX5B_1","vip_flag":0,"pay_flag":0,"version":0,"primecolor":0,"magic_class":0,"magic_color":0},"tmetags":"","ex_status":1,"show_com_new":0,"companyshow":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"modify_time":"","str_genre":"","album_right":0,"Fpay_control":0,"cd_album_id":"","mini_album_id":"","data":{"int2":0,"int3":0,"update_time":"","int4":0},"album_wiki":""},{"id":35795960,"mid":"000QJKw52CoNXx","name":"海心沙","trans_name":"","singers":[{"id":2141458,"mid":"000y6SVt4VkAzR","name":"傅菁","foreign_name":"","type":0,"genre":0,"area":0,"company":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"grade":0,"origin":0,"enter":0,"country":0,"identity":0,"birthday":"","instrument":0,"ex":{"desc":"","wiki":"","tag":"","ex_status":0,"ex_identity":0,"info_name":"","name_spell":"","band":"","dieDate":""},"photo":{"has_photo":0,"photo_cnt":0,"big_photo_flag":"","magic_rgb":0,"pic1_flag":0,"pic2_flag":0,"pic_mid":""},"opt_grade":0,"status":0,"opt_grade_new":0,"vertical_type":"","singer_wiki":""},{"id":13038872,"mid":"002AKILB0oo3Gs","name":"黎明觉醒：生机","foreign_name":"","type":0,"genre":0,"area":0,"company":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"grade":0,"origin":0,"enter":0,"country":0,"identity":0,"birthday":"","instrument":0,"ex":{"desc":"","wiki":"","tag":"","ex_status":0,"ex_identity":0,"info_name":"","name_spell":"","band":"","dieDate":""},"photo":{"has_photo":0,"photo_cnt":0,"big_photo_flag":"","magic_rgb":0,"pic1_flag":0,"pic2_flag":0,"pic_mid":""},"opt_grade":0,"status":0,"opt_grade_new":0,"vertical_type":"","singer_wiki":""}],"type":0,"language":0,"genre":0,"area":0,"movie":"","release_time":"2023-03-03","company":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"status":0,"index":"","tag":"","pay":{"payment_total":0,"payment_album_type":0,"payment_discount":0,"payment_discount_beg":0,"payment_discount_end":0,"payment_beg":"","payment_end":"","pre_sale_beg":"","str_payment_discount_beg":"","str_payment_discount_end":""},"ex":{"desc":"","track_nums":0,"playable_track_nums":0,"album_tag3":0,"singer_tag":"","album_tag5":"","schedule_status":0,"long_audio_nums":0,"caliber":0},"photo":{"gaus_pic":"","has_photo":0,"pic_mid":"000QJKw52CoNXx_1","vip_flag":0,"pay_flag":0,"version":0,"primecolor":0,"magic_class":0,"magic_color":0},"tmetags":"","ex_status":1,"show_com_new":0,"companyshow":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"modify_time":"","str_genre":"","album_right":0,"Fpay_control":0,"cd_album_id":"","mini_album_id":"","data":{"int2":0,"int3":0,"update_time":"","int4":0},"album_wiki":""},{"id":35838656,"mid":"002EuVJi4VejCX","name":"Rise","trans_name":"","singers":[{"id":10326950,"mid":"001QLhHq2GUk23","name":"DJ-HOWE","foreign_name":"","type":0,"genre":0,"area":0,"company":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"grade":0,"origin":0,"enter":0,"country":0,"identity":0,"birthday":"","instrument":0,"ex":{"desc":"","wiki":"","tag":"","ex_status":0,"ex_identity":0,"info_name":"","name_spell":"","band":"","dieDate":""},"photo":{"has_photo":0,"photo_cnt":0,"big_photo_flag":"","magic_rgb":0,"pic1_flag":0,"pic2_flag":0,"pic_mid":""},"opt_grade":0,"status":0,"opt_grade_new":0,"vertical_type":"","singer_wiki":""},{"id":9701592,"mid":"001gl1EA1r8Ktc","name":"SUPER RAVER","foreign_name":"","type":0,"genre":0,"area":0,"company":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"grade":0,"origin":0,"enter":0,"country":0,"identity":0,"birthday":"","instrument":0,"ex":{"desc":"","wiki":"","tag":"","ex_status":0,"ex_identity":0,"info_name":"","name_spell":"","band":"","dieDate":""},"photo":{"has_photo":0,"photo_cnt":0,"big_photo_flag":"","magic_rgb":0,"pic1_flag":0,"pic2_flag":0,"pic_mid":""},"opt_grade":0,"status":0,"opt_grade_new":0,"vertical_type":"","singer_wiki":""}],"type":0,"language":0,"genre":0,"area":0,"movie":"","release_time":"2023-03-03","company":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"status":0,"index":"","tag":"","pay":{"payment_total":0,"payment_album_type":0,"payment_discount":0,"payment_discount_beg":0,"payment_discount_end":0,"payment_beg":"","payment_end":"","pre_sale_beg":"","str_payment_discount_beg":"","str_payment_discount_end":""},"ex":{"desc":"","track_nums":0,"playable_track_nums":0,"album_tag3":0,"singer_tag":"","album_tag5":"","schedule_status":0,"long_audio_nums":0,"caliber":0},"photo":{"gaus_pic":"","has_photo":0,"pic_mid":"002EuVJi4VejCX_1","vip_flag":0,"pay_flag":0,"version":0,"primecolor":0,"magic_class":0,"magic_color":0},"tmetags":"","ex_status":1,"show_com_new":0,"companyshow":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"modify_time":"","str_genre":"","album_right":0,"Fpay_control":0,"cd_album_id":"","mini_album_id":"","data":{"int2":0,"int3":0,"update_time":"","int4":0},"album_wiki":""},{"id":35823921,"mid":"0044jDR4482iaT","name":"I Like It (我喜欢)","trans_name":"","singers":[{"id":2079412,"mid":"0036PFaX1Cgzp9","name":"MrxUED","foreign_name":"","type":0,"genre":0,"area":0,"company":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"grade":0,"origin":0,"enter":0,"country":0,"identity":0,"birthday":"","instrument":0,"ex":{"desc":"","wiki":"","tag":"","ex_status":0,"ex_identity":0,"info_name":"","name_spell":"","band":"","dieDate":""},"photo":{"has_photo":0,"photo_cnt":0,"big_photo_flag":"","magic_rgb":0,"pic1_flag":0,"pic2_flag":0,"pic_mid":""},"opt_grade":0,"status":0,"opt_grade_new":0,"vertical_type":"","singer_wiki":""},{"id":8671014,"mid":"002OJZOR2YFPbY","name":"Taisheng Music","foreign_name":"","type":0,"genre":0,"area":0,"company":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"grade":0,"origin":0,"enter":0,"country":0,"identity":0,"birthday":"","instrument":0,"ex":{"desc":"","wiki":"","tag":"","ex_status":0,"ex_identity":0,"info_name":"","name_spell":"","band":"","dieDate":""},"photo":{"has_photo":0,"photo_cnt":0,"big_photo_flag":"","magic_rgb":0,"pic1_flag":0,"pic2_flag":0,"pic_mid":""},"opt_grade":0,"status":0,"opt_grade_new":0,"vertical_type":"","singer_wiki":""}],"type":0,"language":0,"genre":0,"area":0,"movie":"","release_time":"2023-03-03","company":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"status":0,"index":"","tag":"","pay":{"payment_total":0,"payment_album_type":0,"payment_discount":0,"payment_discount_beg":0,"payment_discount_end":0,"payment_beg":"","payment_end":"","pre_sale_beg":"","str_payment_discount_beg":"","str_payment_discount_end":""},"ex":{"desc":"","track_nums":0,"playable_track_nums":0,"album_tag3":0,"singer_tag":"","album_tag5":"","schedule_status":0,"long_audio_nums":0,"caliber":0},"photo":{"gaus_pic":"","has_photo":0,"pic_mid":"0044jDR4482iaT_1","vip_flag":0,"pay_flag":0,"version":0,"primecolor":0,"magic_class":0,"magic_color":0},"tmetags":"","ex_status":1,"show_com_new":0,"companyshow":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"modify_time":"","str_genre":"","album_right":0,"Fpay_control":0,"cd_album_id":"","mini_album_id":"","data":{"int2":0,"int3":0,"update_time":"","int4":0},"album_wiki":""}],"ret_msg":"success!","total":5335}
             */

            private int code;
            private DataBeanXXXXX data;

            public int getCode() {
                return code;
            }

            public void setCode(int code) {
                this.code = code;
            }

            public DataBeanXXXXX getData() {
                return data;
            }

            public void setData(DataBeanXXXXX data) {
                this.data = data;
            }

            public static class DataBeanXXXXX {
                /**
                 * albums : [{"id":35865482,"mid":"004Wn5tk20B0ZZ","name":"我在时间尽头等你 音乐剧原声带","trans_name":"","singers":[{"id":2122094,"mid":"0021rE0d46NhIt","name":"林彦俊","foreign_name":"","type":0,"genre":0,"area":0,"company":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"grade":0,"origin":0,"enter":0,"country":0,"identity":0,"birthday":"","instrument":0,"ex":{"desc":"","wiki":"","tag":"","ex_status":0,"ex_identity":0,"info_name":"","name_spell":"","band":"","dieDate":""},"photo":{"has_photo":0,"photo_cnt":0,"big_photo_flag":"","magic_rgb":0,"pic1_flag":0,"pic2_flag":0,"pic_mid":""},"opt_grade":0,"status":0,"opt_grade_new":0,"vertical_type":"","singer_wiki":""},{"id":13117975,"mid":"001Ye7sC2R1k8m","name":"潘艺琳","foreign_name":"","type":0,"genre":0,"area":0,"company":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"grade":0,"origin":0,"enter":0,"country":0,"identity":0,"birthday":"","instrument":0,"ex":{"desc":"","wiki":"","tag":"","ex_status":0,"ex_identity":0,"info_name":"","name_spell":"","band":"","dieDate":""},"photo":{"has_photo":0,"photo_cnt":0,"big_photo_flag":"","magic_rgb":0,"pic1_flag":0,"pic2_flag":0,"pic_mid":""},"opt_grade":0,"status":0,"opt_grade_new":0,"vertical_type":"","singer_wiki":""},{"id":6787676,"mid":"003vLbfK2gttHq","name":"严小北","foreign_name":"","type":0,"genre":0,"area":0,"company":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"grade":0,"origin":0,"enter":0,"country":0,"identity":0,"birthday":"","instrument":0,"ex":{"desc":"","wiki":"","tag":"","ex_status":0,"ex_identity":0,"info_name":"","name_spell":"","band":"","dieDate":""},"photo":{"has_photo":0,"photo_cnt":0,"big_photo_flag":"","magic_rgb":0,"pic1_flag":0,"pic2_flag":0,"pic_mid":""},"opt_grade":0,"status":0,"opt_grade_new":0,"vertical_type":"","singer_wiki":""},{"id":3696440,"mid":"000qk6Z60ENLyM","name":"王瀚宇","foreign_name":"","type":0,"genre":0,"area":0,"company":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"grade":0,"origin":0,"enter":0,"country":0,"identity":0,"birthday":"","instrument":0,"ex":{"desc":"","wiki":"","tag":"","ex_status":0,"ex_identity":0,"info_name":"","name_spell":"","band":"","dieDate":""},"photo":{"has_photo":0,"photo_cnt":0,"big_photo_flag":"","magic_rgb":0,"pic1_flag":0,"pic2_flag":0,"pic_mid":""},"opt_grade":0,"status":0,"opt_grade_new":0,"vertical_type":"","singer_wiki":""},{"id":13283622,"mid":"003cqFjX1faPky","name":"李金哲","foreign_name":"","type":0,"genre":0,"area":0,"company":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"grade":0,"origin":0,"enter":0,"country":0,"identity":0,"birthday":"","instrument":0,"ex":{"desc":"","wiki":"","tag":"","ex_status":0,"ex_identity":0,"info_name":"","name_spell":"","band":"","dieDate":""},"photo":{"has_photo":0,"photo_cnt":0,"big_photo_flag":"","magic_rgb":0,"pic1_flag":0,"pic2_flag":0,"pic_mid":""},"opt_grade":0,"status":0,"opt_grade_new":0,"vertical_type":"","singer_wiki":""},{"id":13283634,"mid":"003Z6Z2C2V9W52","name":"王上斌","foreign_name":"","type":0,"genre":0,"area":0,"company":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"grade":0,"origin":0,"enter":0,"country":0,"identity":0,"birthday":"","instrument":0,"ex":{"desc":"","wiki":"","tag":"","ex_status":0,"ex_identity":0,"info_name":"","name_spell":"","band":"","dieDate":""},"photo":{"has_photo":0,"photo_cnt":0,"big_photo_flag":"","magic_rgb":0,"pic1_flag":0,"pic2_flag":0,"pic_mid":""},"opt_grade":0,"status":0,"opt_grade_new":0,"vertical_type":"","singer_wiki":""},{"id":1264992,"mid":"0041hdb93sK5Eu","name":"赵晏伯","foreign_name":"","type":0,"genre":0,"area":0,"company":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"grade":0,"origin":0,"enter":0,"country":0,"identity":0,"birthday":"","instrument":0,"ex":{"desc":"","wiki":"","tag":"","ex_status":0,"ex_identity":0,"info_name":"","name_spell":"","band":"","dieDate":""},"photo":{"has_photo":0,"photo_cnt":0,"big_photo_flag":"","magic_rgb":0,"pic1_flag":0,"pic2_flag":0,"pic_mid":""},"opt_grade":0,"status":0,"opt_grade_new":0,"vertical_type":"","singer_wiki":""}],"type":0,"language":0,"genre":0,"area":0,"movie":"","release_time":"2023-03-03","company":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"status":0,"index":"","tag":"","pay":{"payment_total":0,"payment_album_type":0,"payment_discount":0,"payment_discount_beg":0,"payment_discount_end":0,"payment_beg":"","payment_end":"","pre_sale_beg":"","str_payment_discount_beg":"","str_payment_discount_end":""},"ex":{"desc":"","track_nums":0,"playable_track_nums":0,"album_tag3":0,"singer_tag":"","album_tag5":"","schedule_status":0,"long_audio_nums":0,"caliber":0},"photo":{"gaus_pic":"","has_photo":0,"pic_mid":"004Wn5tk20B0ZZ_3","vip_flag":0,"pay_flag":0,"version":0,"primecolor":0,"magic_class":0,"magic_color":0},"tmetags":"","ex_status":1,"show_com_new":0,"companyshow":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"modify_time":"","str_genre":"","album_right":0,"Fpay_control":0,"cd_album_id":"","mini_album_id":"","data":{"int2":0,"int3":0,"update_time":"","int4":0},"album_wiki":""},{"id":35715965,"mid":"000hjuUJ4WjUo8","name":"没你的维度","trans_name":"","singers":[{"id":1373351,"mid":"0025ipyS2r3gDv","name":"周锐","foreign_name":"","type":0,"genre":0,"area":0,"company":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"grade":0,"origin":0,"enter":0,"country":0,"identity":0,"birthday":"","instrument":0,"ex":{"desc":"","wiki":"","tag":"","ex_status":0,"ex_identity":0,"info_name":"","name_spell":"","band":"","dieDate":""},"photo":{"has_photo":0,"photo_cnt":0,"big_photo_flag":"","magic_rgb":0,"pic1_flag":0,"pic2_flag":0,"pic_mid":""},"opt_grade":0,"status":0,"opt_grade_new":0,"vertical_type":"","singer_wiki":""}],"type":0,"language":0,"genre":0,"area":0,"movie":"","release_time":"2023-03-03","company":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"status":0,"index":"","tag":"","pay":{"payment_total":0,"payment_album_type":0,"payment_discount":0,"payment_discount_beg":0,"payment_discount_end":0,"payment_beg":"","payment_end":"","pre_sale_beg":"","str_payment_discount_beg":"","str_payment_discount_end":""},"ex":{"desc":"","track_nums":0,"playable_track_nums":0,"album_tag3":0,"singer_tag":"","album_tag5":"","schedule_status":0,"long_audio_nums":0,"caliber":0},"photo":{"gaus_pic":"","has_photo":0,"pic_mid":"000hjuUJ4WjUo8_1","vip_flag":0,"pay_flag":0,"version":0,"primecolor":0,"magic_class":0,"magic_color":0},"tmetags":"","ex_status":1,"show_com_new":0,"companyshow":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"modify_time":"","str_genre":"","album_right":0,"Fpay_control":0,"cd_album_id":"","mini_album_id":"","data":{"int2":0,"int3":0,"update_time":"","int4":0},"album_wiki":""},{"id":35838581,"mid":"000Lhkvp3IkQGi","name":"黑夜里的光","trans_name":"","singers":[{"id":3258719,"mid":"000BKI3h00z81h","name":"茜西","foreign_name":"","type":0,"genre":0,"area":0,"company":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"grade":0,"origin":0,"enter":0,"country":0,"identity":0,"birthday":"","instrument":0,"ex":{"desc":"","wiki":"","tag":"","ex_status":0,"ex_identity":0,"info_name":"","name_spell":"","band":"","dieDate":""},"photo":{"has_photo":0,"photo_cnt":0,"big_photo_flag":"","magic_rgb":0,"pic1_flag":0,"pic2_flag":0,"pic_mid":""},"opt_grade":0,"status":0,"opt_grade_new":0,"vertical_type":"","singer_wiki":""}],"type":0,"language":0,"genre":0,"area":0,"movie":"","release_time":"2023-03-03","company":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"status":0,"index":"","tag":"","pay":{"payment_total":0,"payment_album_type":0,"payment_discount":0,"payment_discount_beg":0,"payment_discount_end":0,"payment_beg":"","payment_end":"","pre_sale_beg":"","str_payment_discount_beg":"","str_payment_discount_end":""},"ex":{"desc":"","track_nums":0,"playable_track_nums":0,"album_tag3":0,"singer_tag":"","album_tag5":"","schedule_status":0,"long_audio_nums":0,"caliber":0},"photo":{"gaus_pic":"","has_photo":0,"pic_mid":"000Lhkvp3IkQGi_1","vip_flag":0,"pay_flag":0,"version":0,"primecolor":0,"magic_class":0,"magic_color":0},"tmetags":"","ex_status":1,"show_com_new":0,"companyshow":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"modify_time":"","str_genre":"","album_right":0,"Fpay_control":0,"cd_album_id":"","mini_album_id":"","data":{"int2":0,"int3":0,"update_time":"","int4":0},"album_wiki":""},{"id":35838675,"mid":"001zHql63nFX5B","name":"Don't let me go","trans_name":"","singers":[{"id":6226311,"mid":"002RmwAW4WkdQz","name":"王嘉源","foreign_name":"","type":0,"genre":0,"area":0,"company":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"grade":0,"origin":0,"enter":0,"country":0,"identity":0,"birthday":"","instrument":0,"ex":{"desc":"","wiki":"","tag":"","ex_status":0,"ex_identity":0,"info_name":"","name_spell":"","band":"","dieDate":""},"photo":{"has_photo":0,"photo_cnt":0,"big_photo_flag":"","magic_rgb":0,"pic1_flag":0,"pic2_flag":0,"pic_mid":""},"opt_grade":0,"status":0,"opt_grade_new":0,"vertical_type":"","singer_wiki":""},{"id":9701592,"mid":"001gl1EA1r8Ktc","name":"SUPER RAVER","foreign_name":"","type":0,"genre":0,"area":0,"company":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"grade":0,"origin":0,"enter":0,"country":0,"identity":0,"birthday":"","instrument":0,"ex":{"desc":"","wiki":"","tag":"","ex_status":0,"ex_identity":0,"info_name":"","name_spell":"","band":"","dieDate":""},"photo":{"has_photo":0,"photo_cnt":0,"big_photo_flag":"","magic_rgb":0,"pic1_flag":0,"pic2_flag":0,"pic_mid":""},"opt_grade":0,"status":0,"opt_grade_new":0,"vertical_type":"","singer_wiki":""}],"type":0,"language":0,"genre":0,"area":0,"movie":"","release_time":"2023-03-03","company":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"status":0,"index":"","tag":"","pay":{"payment_total":0,"payment_album_type":0,"payment_discount":0,"payment_discount_beg":0,"payment_discount_end":0,"payment_beg":"","payment_end":"","pre_sale_beg":"","str_payment_discount_beg":"","str_payment_discount_end":""},"ex":{"desc":"","track_nums":0,"playable_track_nums":0,"album_tag3":0,"singer_tag":"","album_tag5":"","schedule_status":0,"long_audio_nums":0,"caliber":0},"photo":{"gaus_pic":"","has_photo":0,"pic_mid":"001zHql63nFX5B_1","vip_flag":0,"pay_flag":0,"version":0,"primecolor":0,"magic_class":0,"magic_color":0},"tmetags":"","ex_status":1,"show_com_new":0,"companyshow":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"modify_time":"","str_genre":"","album_right":0,"Fpay_control":0,"cd_album_id":"","mini_album_id":"","data":{"int2":0,"int3":0,"update_time":"","int4":0},"album_wiki":""},{"id":35795960,"mid":"000QJKw52CoNXx","name":"海心沙","trans_name":"","singers":[{"id":2141458,"mid":"000y6SVt4VkAzR","name":"傅菁","foreign_name":"","type":0,"genre":0,"area":0,"company":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"grade":0,"origin":0,"enter":0,"country":0,"identity":0,"birthday":"","instrument":0,"ex":{"desc":"","wiki":"","tag":"","ex_status":0,"ex_identity":0,"info_name":"","name_spell":"","band":"","dieDate":""},"photo":{"has_photo":0,"photo_cnt":0,"big_photo_flag":"","magic_rgb":0,"pic1_flag":0,"pic2_flag":0,"pic_mid":""},"opt_grade":0,"status":0,"opt_grade_new":0,"vertical_type":"","singer_wiki":""},{"id":13038872,"mid":"002AKILB0oo3Gs","name":"黎明觉醒：生机","foreign_name":"","type":0,"genre":0,"area":0,"company":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"grade":0,"origin":0,"enter":0,"country":0,"identity":0,"birthday":"","instrument":0,"ex":{"desc":"","wiki":"","tag":"","ex_status":0,"ex_identity":0,"info_name":"","name_spell":"","band":"","dieDate":""},"photo":{"has_photo":0,"photo_cnt":0,"big_photo_flag":"","magic_rgb":0,"pic1_flag":0,"pic2_flag":0,"pic_mid":""},"opt_grade":0,"status":0,"opt_grade_new":0,"vertical_type":"","singer_wiki":""}],"type":0,"language":0,"genre":0,"area":0,"movie":"","release_time":"2023-03-03","company":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"status":0,"index":"","tag":"","pay":{"payment_total":0,"payment_album_type":0,"payment_discount":0,"payment_discount_beg":0,"payment_discount_end":0,"payment_beg":"","payment_end":"","pre_sale_beg":"","str_payment_discount_beg":"","str_payment_discount_end":""},"ex":{"desc":"","track_nums":0,"playable_track_nums":0,"album_tag3":0,"singer_tag":"","album_tag5":"","schedule_status":0,"long_audio_nums":0,"caliber":0},"photo":{"gaus_pic":"","has_photo":0,"pic_mid":"000QJKw52CoNXx_1","vip_flag":0,"pay_flag":0,"version":0,"primecolor":0,"magic_class":0,"magic_color":0},"tmetags":"","ex_status":1,"show_com_new":0,"companyshow":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"modify_time":"","str_genre":"","album_right":0,"Fpay_control":0,"cd_album_id":"","mini_album_id":"","data":{"int2":0,"int3":0,"update_time":"","int4":0},"album_wiki":""},{"id":35838656,"mid":"002EuVJi4VejCX","name":"Rise","trans_name":"","singers":[{"id":10326950,"mid":"001QLhHq2GUk23","name":"DJ-HOWE","foreign_name":"","type":0,"genre":0,"area":0,"company":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"grade":0,"origin":0,"enter":0,"country":0,"identity":0,"birthday":"","instrument":0,"ex":{"desc":"","wiki":"","tag":"","ex_status":0,"ex_identity":0,"info_name":"","name_spell":"","band":"","dieDate":""},"photo":{"has_photo":0,"photo_cnt":0,"big_photo_flag":"","magic_rgb":0,"pic1_flag":0,"pic2_flag":0,"pic_mid":""},"opt_grade":0,"status":0,"opt_grade_new":0,"vertical_type":"","singer_wiki":""},{"id":9701592,"mid":"001gl1EA1r8Ktc","name":"SUPER RAVER","foreign_name":"","type":0,"genre":0,"area":0,"company":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"grade":0,"origin":0,"enter":0,"country":0,"identity":0,"birthday":"","instrument":0,"ex":{"desc":"","wiki":"","tag":"","ex_status":0,"ex_identity":0,"info_name":"","name_spell":"","band":"","dieDate":""},"photo":{"has_photo":0,"photo_cnt":0,"big_photo_flag":"","magic_rgb":0,"pic1_flag":0,"pic2_flag":0,"pic_mid":""},"opt_grade":0,"status":0,"opt_grade_new":0,"vertical_type":"","singer_wiki":""}],"type":0,"language":0,"genre":0,"area":0,"movie":"","release_time":"2023-03-03","company":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"status":0,"index":"","tag":"","pay":{"payment_total":0,"payment_album_type":0,"payment_discount":0,"payment_discount_beg":0,"payment_discount_end":0,"payment_beg":"","payment_end":"","pre_sale_beg":"","str_payment_discount_beg":"","str_payment_discount_end":""},"ex":{"desc":"","track_nums":0,"playable_track_nums":0,"album_tag3":0,"singer_tag":"","album_tag5":"","schedule_status":0,"long_audio_nums":0,"caliber":0},"photo":{"gaus_pic":"","has_photo":0,"pic_mid":"002EuVJi4VejCX_1","vip_flag":0,"pay_flag":0,"version":0,"primecolor":0,"magic_class":0,"magic_color":0},"tmetags":"","ex_status":1,"show_com_new":0,"companyshow":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"modify_time":"","str_genre":"","album_right":0,"Fpay_control":0,"cd_album_id":"","mini_album_id":"","data":{"int2":0,"int3":0,"update_time":"","int4":0},"album_wiki":""},{"id":35823921,"mid":"0044jDR4482iaT","name":"I Like It (我喜欢)","trans_name":"","singers":[{"id":2079412,"mid":"0036PFaX1Cgzp9","name":"MrxUED","foreign_name":"","type":0,"genre":0,"area":0,"company":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"grade":0,"origin":0,"enter":0,"country":0,"identity":0,"birthday":"","instrument":0,"ex":{"desc":"","wiki":"","tag":"","ex_status":0,"ex_identity":0,"info_name":"","name_spell":"","band":"","dieDate":""},"photo":{"has_photo":0,"photo_cnt":0,"big_photo_flag":"","magic_rgb":0,"pic1_flag":0,"pic2_flag":0,"pic_mid":""},"opt_grade":0,"status":0,"opt_grade_new":0,"vertical_type":"","singer_wiki":""},{"id":8671014,"mid":"002OJZOR2YFPbY","name":"Taisheng Music","foreign_name":"","type":0,"genre":0,"area":0,"company":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"grade":0,"origin":0,"enter":0,"country":0,"identity":0,"birthday":"","instrument":0,"ex":{"desc":"","wiki":"","tag":"","ex_status":0,"ex_identity":0,"info_name":"","name_spell":"","band":"","dieDate":""},"photo":{"has_photo":0,"photo_cnt":0,"big_photo_flag":"","magic_rgb":0,"pic1_flag":0,"pic2_flag":0,"pic_mid":""},"opt_grade":0,"status":0,"opt_grade_new":0,"vertical_type":"","singer_wiki":""}],"type":0,"language":0,"genre":0,"area":0,"movie":"","release_time":"2023-03-03","company":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"status":0,"index":"","tag":"","pay":{"payment_total":0,"payment_album_type":0,"payment_discount":0,"payment_discount_beg":0,"payment_discount_end":0,"payment_beg":"","payment_end":"","pre_sale_beg":"","str_payment_discount_beg":"","str_payment_discount_end":""},"ex":{"desc":"","track_nums":0,"playable_track_nums":0,"album_tag3":0,"singer_tag":"","album_tag5":"","schedule_status":0,"long_audio_nums":0,"caliber":0},"photo":{"gaus_pic":"","has_photo":0,"pic_mid":"0044jDR4482iaT_1","vip_flag":0,"pay_flag":0,"version":0,"primecolor":0,"magic_class":0,"magic_color":0},"tmetags":"","ex_status":1,"show_com_new":0,"companyshow":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"modify_time":"","str_genre":"","album_right":0,"Fpay_control":0,"cd_album_id":"","mini_album_id":"","data":{"int2":0,"int3":0,"update_time":"","int4":0},"album_wiki":""}]
                 * ret_msg : success!
                 * total : 5335
                 */

                private String ret_msg;
                private int total;
                private List<AlbumsBean> albums;

                public String getRet_msg() {
                    return ret_msg;
                }

                public void setRet_msg(String ret_msg) {
                    this.ret_msg = ret_msg;
                }

                public int getTotal() {
                    return total;
                }

                public void setTotal(int total) {
                    this.total = total;
                }

                public List<AlbumsBean> getAlbums() {
                    return albums;
                }

                public void setAlbums(List<AlbumsBean> albums) {
                    this.albums = albums;
                }

                public static class AlbumsBean {
                    /**
                     * id : 35865482
                     * mid : 004Wn5tk20B0ZZ
                     * name : 我在时间尽头等你 音乐剧原声带
                     * trans_name :
                     * singers : [{"id":2122094,"mid":"0021rE0d46NhIt","name":"林彦俊","foreign_name":"","type":0,"genre":0,"area":0,"company":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"grade":0,"origin":0,"enter":0,"country":0,"identity":0,"birthday":"","instrument":0,"ex":{"desc":"","wiki":"","tag":"","ex_status":0,"ex_identity":0,"info_name":"","name_spell":"","band":"","dieDate":""},"photo":{"has_photo":0,"photo_cnt":0,"big_photo_flag":"","magic_rgb":0,"pic1_flag":0,"pic2_flag":0,"pic_mid":""},"opt_grade":0,"status":0,"opt_grade_new":0,"vertical_type":"","singer_wiki":""},{"id":13117975,"mid":"001Ye7sC2R1k8m","name":"潘艺琳","foreign_name":"","type":0,"genre":0,"area":0,"company":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"grade":0,"origin":0,"enter":0,"country":0,"identity":0,"birthday":"","instrument":0,"ex":{"desc":"","wiki":"","tag":"","ex_status":0,"ex_identity":0,"info_name":"","name_spell":"","band":"","dieDate":""},"photo":{"has_photo":0,"photo_cnt":0,"big_photo_flag":"","magic_rgb":0,"pic1_flag":0,"pic2_flag":0,"pic_mid":""},"opt_grade":0,"status":0,"opt_grade_new":0,"vertical_type":"","singer_wiki":""},{"id":6787676,"mid":"003vLbfK2gttHq","name":"严小北","foreign_name":"","type":0,"genre":0,"area":0,"company":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"grade":0,"origin":0,"enter":0,"country":0,"identity":0,"birthday":"","instrument":0,"ex":{"desc":"","wiki":"","tag":"","ex_status":0,"ex_identity":0,"info_name":"","name_spell":"","band":"","dieDate":""},"photo":{"has_photo":0,"photo_cnt":0,"big_photo_flag":"","magic_rgb":0,"pic1_flag":0,"pic2_flag":0,"pic_mid":""},"opt_grade":0,"status":0,"opt_grade_new":0,"vertical_type":"","singer_wiki":""},{"id":3696440,"mid":"000qk6Z60ENLyM","name":"王瀚宇","foreign_name":"","type":0,"genre":0,"area":0,"company":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"grade":0,"origin":0,"enter":0,"country":0,"identity":0,"birthday":"","instrument":0,"ex":{"desc":"","wiki":"","tag":"","ex_status":0,"ex_identity":0,"info_name":"","name_spell":"","band":"","dieDate":""},"photo":{"has_photo":0,"photo_cnt":0,"big_photo_flag":"","magic_rgb":0,"pic1_flag":0,"pic2_flag":0,"pic_mid":""},"opt_grade":0,"status":0,"opt_grade_new":0,"vertical_type":"","singer_wiki":""},{"id":13283622,"mid":"003cqFjX1faPky","name":"李金哲","foreign_name":"","type":0,"genre":0,"area":0,"company":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"grade":0,"origin":0,"enter":0,"country":0,"identity":0,"birthday":"","instrument":0,"ex":{"desc":"","wiki":"","tag":"","ex_status":0,"ex_identity":0,"info_name":"","name_spell":"","band":"","dieDate":""},"photo":{"has_photo":0,"photo_cnt":0,"big_photo_flag":"","magic_rgb":0,"pic1_flag":0,"pic2_flag":0,"pic_mid":""},"opt_grade":0,"status":0,"opt_grade_new":0,"vertical_type":"","singer_wiki":""},{"id":13283634,"mid":"003Z6Z2C2V9W52","name":"王上斌","foreign_name":"","type":0,"genre":0,"area":0,"company":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"grade":0,"origin":0,"enter":0,"country":0,"identity":0,"birthday":"","instrument":0,"ex":{"desc":"","wiki":"","tag":"","ex_status":0,"ex_identity":0,"info_name":"","name_spell":"","band":"","dieDate":""},"photo":{"has_photo":0,"photo_cnt":0,"big_photo_flag":"","magic_rgb":0,"pic1_flag":0,"pic2_flag":0,"pic_mid":""},"opt_grade":0,"status":0,"opt_grade_new":0,"vertical_type":"","singer_wiki":""},{"id":1264992,"mid":"0041hdb93sK5Eu","name":"赵晏伯","foreign_name":"","type":0,"genre":0,"area":0,"company":{"id":0,"name":"","ex":{"desc":"","company_photo":0}},"grade":0,"origin":0,"enter":0,"country":0,"identity":0,"birthday":"","instrument":0,"ex":{"desc":"","wiki":"","tag":"","ex_status":0,"ex_identity":0,"info_name":"","name_spell":"","band":"","dieDate":""},"photo":{"has_photo":0,"photo_cnt":0,"big_photo_flag":"","magic_rgb":0,"pic1_flag":0,"pic2_flag":0,"pic_mid":""},"opt_grade":0,"status":0,"opt_grade_new":0,"vertical_type":"","singer_wiki":""}]
                     * type : 0
                     * language : 0
                     * genre : 0
                     * area : 0
                     * movie :
                     * release_time : 2023-03-03
                     * company : {"id":0,"name":"","ex":{"desc":"","company_photo":0}}
                     * status : 0
                     * index :
                     * tag :
                     * pay : {"payment_total":0,"payment_album_type":0,"payment_discount":0,"payment_discount_beg":0,"payment_discount_end":0,"payment_beg":"","payment_end":"","pre_sale_beg":"","str_payment_discount_beg":"","str_payment_discount_end":""}
                     * ex : {"desc":"","track_nums":0,"playable_track_nums":0,"album_tag3":0,"singer_tag":"","album_tag5":"","schedule_status":0,"long_audio_nums":0,"caliber":0}
                     * photo : {"gaus_pic":"","has_photo":0,"pic_mid":"004Wn5tk20B0ZZ_3","vip_flag":0,"pay_flag":0,"version":0,"primecolor":0,"magic_class":0,"magic_color":0}
                     * tmetags :
                     * ex_status : 1
                     * show_com_new : 0
                     * companyshow : {"id":0,"name":"","ex":{"desc":"","company_photo":0}}
                     * modify_time :
                     * str_genre :
                     * album_right : 0
                     * Fpay_control : 0
                     * cd_album_id :
                     * mini_album_id :
                     * data : {"int2":0,"int3":0,"update_time":"","int4":0}
                     * album_wiki :
                     */

                    private int id;
                    private String mid;
                    private String name;
                    private String trans_name;
                    private int type;
                    private int language;
                    private int genre;
                    private int area;
                    private String movie;
                    private String release_time;
                    private CompanyBean company;
                    private int status;
                    private String index;
                    private String tag;
                    private PayBeanX pay;
                    private ExBeanX ex;
                    private PhotoBean photo;
                    private String tmetags;
                    private int ex_status;
                    private int show_com_new;
                    private CompanyshowBean companyshow;
                    private String modify_time;
                    private String str_genre;
                    private int album_right;
                    private int Fpay_control;
                    private String cd_album_id;
                    private String mini_album_id;
                    private DataBeanXXXX data;
                    private String album_wiki;
                    private List<SingersBean> singers;

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public String getMid() {
                        return mid;
                    }

                    public void setMid(String mid) {
                        this.mid = mid;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getTrans_name() {
                        return trans_name;
                    }

                    public void setTrans_name(String trans_name) {
                        this.trans_name = trans_name;
                    }

                    public int getType() {
                        return type;
                    }

                    public void setType(int type) {
                        this.type = type;
                    }

                    public int getLanguage() {
                        return language;
                    }

                    public void setLanguage(int language) {
                        this.language = language;
                    }

                    public int getGenre() {
                        return genre;
                    }

                    public void setGenre(int genre) {
                        this.genre = genre;
                    }

                    public int getArea() {
                        return area;
                    }

                    public void setArea(int area) {
                        this.area = area;
                    }

                    public String getMovie() {
                        return movie;
                    }

                    public void setMovie(String movie) {
                        this.movie = movie;
                    }

                    public String getRelease_time() {
                        return release_time;
                    }

                    public void setRelease_time(String release_time) {
                        this.release_time = release_time;
                    }

                    public CompanyBean getCompany() {
                        return company;
                    }

                    public void setCompany(CompanyBean company) {
                        this.company = company;
                    }

                    public int getStatus() {
                        return status;
                    }

                    public void setStatus(int status) {
                        this.status = status;
                    }

                    public String getIndex() {
                        return index;
                    }

                    public void setIndex(String index) {
                        this.index = index;
                    }

                    public String getTag() {
                        return tag;
                    }

                    public void setTag(String tag) {
                        this.tag = tag;
                    }

                    public PayBeanX getPay() {
                        return pay;
                    }

                    public void setPay(PayBeanX pay) {
                        this.pay = pay;
                    }

                    public ExBeanX getEx() {
                        return ex;
                    }

                    public void setEx(ExBeanX ex) {
                        this.ex = ex;
                    }

                    public PhotoBean getPhoto() {
                        return photo;
                    }

                    public void setPhoto(PhotoBean photo) {
                        this.photo = photo;
                    }

                    public String getTmetags() {
                        return tmetags;
                    }

                    public void setTmetags(String tmetags) {
                        this.tmetags = tmetags;
                    }

                    public int getEx_status() {
                        return ex_status;
                    }

                    public void setEx_status(int ex_status) {
                        this.ex_status = ex_status;
                    }

                    public int getShow_com_new() {
                        return show_com_new;
                    }

                    public void setShow_com_new(int show_com_new) {
                        this.show_com_new = show_com_new;
                    }

                    public CompanyshowBean getCompanyshow() {
                        return companyshow;
                    }

                    public void setCompanyshow(CompanyshowBean companyshow) {
                        this.companyshow = companyshow;
                    }

                    public String getModify_time() {
                        return modify_time;
                    }

                    public void setModify_time(String modify_time) {
                        this.modify_time = modify_time;
                    }

                    public String getStr_genre() {
                        return str_genre;
                    }

                    public void setStr_genre(String str_genre) {
                        this.str_genre = str_genre;
                    }

                    public int getAlbum_right() {
                        return album_right;
                    }

                    public void setAlbum_right(int album_right) {
                        this.album_right = album_right;
                    }

                    public int getFpay_control() {
                        return Fpay_control;
                    }

                    public void setFpay_control(int Fpay_control) {
                        this.Fpay_control = Fpay_control;
                    }

                    public String getCd_album_id() {
                        return cd_album_id;
                    }

                    public void setCd_album_id(String cd_album_id) {
                        this.cd_album_id = cd_album_id;
                    }

                    public String getMini_album_id() {
                        return mini_album_id;
                    }

                    public void setMini_album_id(String mini_album_id) {
                        this.mini_album_id = mini_album_id;
                    }

                    public DataBeanXXXX getData() {
                        return data;
                    }

                    public void setData(DataBeanXXXX data) {
                        this.data = data;
                    }

                    public String getAlbum_wiki() {
                        return album_wiki;
                    }

                    public void setAlbum_wiki(String album_wiki) {
                        this.album_wiki = album_wiki;
                    }

                    public List<SingersBean> getSingers() {
                        return singers;
                    }

                    public void setSingers(List<SingersBean> singers) {
                        this.singers = singers;
                    }

                    public static class CompanyBean {
                        /**
                         * id : 0
                         * name :
                         * ex : {"desc":"","company_photo":0}
                         */

                        private int id;
                        private String name;
                        private ExBean ex;

                        public int getId() {
                            return id;
                        }

                        public void setId(int id) {
                            this.id = id;
                        }

                        public String getName() {
                            return name;
                        }

                        public void setName(String name) {
                            this.name = name;
                        }

                        public ExBean getEx() {
                            return ex;
                        }

                        public void setEx(ExBean ex) {
                            this.ex = ex;
                        }

                        public static class ExBean {
                            /**
                             * desc :
                             * company_photo : 0
                             */

                            private String desc;
                            private int company_photo;

                            public String getDesc() {
                                return desc;
                            }

                            public void setDesc(String desc) {
                                this.desc = desc;
                            }

                            public int getCompany_photo() {
                                return company_photo;
                            }

                            public void setCompany_photo(int company_photo) {
                                this.company_photo = company_photo;
                            }
                        }
                    }

                    public static class PayBeanX {
                        /**
                         * payment_total : 0
                         * payment_album_type : 0
                         * payment_discount : 0
                         * payment_discount_beg : 0
                         * payment_discount_end : 0
                         * payment_beg :
                         * payment_end :
                         * pre_sale_beg :
                         * str_payment_discount_beg :
                         * str_payment_discount_end :
                         */

                        private int payment_total;
                        private int payment_album_type;
                        private int payment_discount;
                        private int payment_discount_beg;
                        private int payment_discount_end;
                        private String payment_beg;
                        private String payment_end;
                        private String pre_sale_beg;
                        private String str_payment_discount_beg;
                        private String str_payment_discount_end;

                        public int getPayment_total() {
                            return payment_total;
                        }

                        public void setPayment_total(int payment_total) {
                            this.payment_total = payment_total;
                        }

                        public int getPayment_album_type() {
                            return payment_album_type;
                        }

                        public void setPayment_album_type(int payment_album_type) {
                            this.payment_album_type = payment_album_type;
                        }

                        public int getPayment_discount() {
                            return payment_discount;
                        }

                        public void setPayment_discount(int payment_discount) {
                            this.payment_discount = payment_discount;
                        }

                        public int getPayment_discount_beg() {
                            return payment_discount_beg;
                        }

                        public void setPayment_discount_beg(int payment_discount_beg) {
                            this.payment_discount_beg = payment_discount_beg;
                        }

                        public int getPayment_discount_end() {
                            return payment_discount_end;
                        }

                        public void setPayment_discount_end(int payment_discount_end) {
                            this.payment_discount_end = payment_discount_end;
                        }

                        public String getPayment_beg() {
                            return payment_beg;
                        }

                        public void setPayment_beg(String payment_beg) {
                            this.payment_beg = payment_beg;
                        }

                        public String getPayment_end() {
                            return payment_end;
                        }

                        public void setPayment_end(String payment_end) {
                            this.payment_end = payment_end;
                        }

                        public String getPre_sale_beg() {
                            return pre_sale_beg;
                        }

                        public void setPre_sale_beg(String pre_sale_beg) {
                            this.pre_sale_beg = pre_sale_beg;
                        }

                        public String getStr_payment_discount_beg() {
                            return str_payment_discount_beg;
                        }

                        public void setStr_payment_discount_beg(String str_payment_discount_beg) {
                            this.str_payment_discount_beg = str_payment_discount_beg;
                        }

                        public String getStr_payment_discount_end() {
                            return str_payment_discount_end;
                        }

                        public void setStr_payment_discount_end(String str_payment_discount_end) {
                            this.str_payment_discount_end = str_payment_discount_end;
                        }
                    }

                    public static class ExBeanX {
                        /**
                         * desc :
                         * track_nums : 0
                         * playable_track_nums : 0
                         * album_tag3 : 0
                         * singer_tag :
                         * album_tag5 :
                         * schedule_status : 0
                         * long_audio_nums : 0
                         * caliber : 0
                         */

                        private String desc;
                        private int track_nums;
                        private int playable_track_nums;
                        private int album_tag3;
                        private String singer_tag;
                        private String album_tag5;
                        private int schedule_status;
                        private int long_audio_nums;
                        private int caliber;

                        public String getDesc() {
                            return desc;
                        }

                        public void setDesc(String desc) {
                            this.desc = desc;
                        }

                        public int getTrack_nums() {
                            return track_nums;
                        }

                        public void setTrack_nums(int track_nums) {
                            this.track_nums = track_nums;
                        }

                        public int getPlayable_track_nums() {
                            return playable_track_nums;
                        }

                        public void setPlayable_track_nums(int playable_track_nums) {
                            this.playable_track_nums = playable_track_nums;
                        }

                        public int getAlbum_tag3() {
                            return album_tag3;
                        }

                        public void setAlbum_tag3(int album_tag3) {
                            this.album_tag3 = album_tag3;
                        }

                        public String getSinger_tag() {
                            return singer_tag;
                        }

                        public void setSinger_tag(String singer_tag) {
                            this.singer_tag = singer_tag;
                        }

                        public String getAlbum_tag5() {
                            return album_tag5;
                        }

                        public void setAlbum_tag5(String album_tag5) {
                            this.album_tag5 = album_tag5;
                        }

                        public int getSchedule_status() {
                            return schedule_status;
                        }

                        public void setSchedule_status(int schedule_status) {
                            this.schedule_status = schedule_status;
                        }

                        public int getLong_audio_nums() {
                            return long_audio_nums;
                        }

                        public void setLong_audio_nums(int long_audio_nums) {
                            this.long_audio_nums = long_audio_nums;
                        }

                        public int getCaliber() {
                            return caliber;
                        }

                        public void setCaliber(int caliber) {
                            this.caliber = caliber;
                        }
                    }

                    public static class PhotoBean {
                        /**
                         * gaus_pic :
                         * has_photo : 0
                         * pic_mid : 004Wn5tk20B0ZZ_3
                         * vip_flag : 0
                         * pay_flag : 0
                         * version : 0
                         * primecolor : 0
                         * magic_class : 0
                         * magic_color : 0
                         */

                        private String gaus_pic;
                        private int has_photo;
                        private String pic_mid;
                        private int vip_flag;
                        private int pay_flag;
                        private int version;
                        private int primecolor;
                        private int magic_class;
                        private int magic_color;

                        public String getGaus_pic() {
                            return gaus_pic;
                        }

                        public void setGaus_pic(String gaus_pic) {
                            this.gaus_pic = gaus_pic;
                        }

                        public int getHas_photo() {
                            return has_photo;
                        }

                        public void setHas_photo(int has_photo) {
                            this.has_photo = has_photo;
                        }

                        public String getPic_mid() {
                            return pic_mid;
                        }

                        public void setPic_mid(String pic_mid) {
                            this.pic_mid = pic_mid;
                        }

                        public int getVip_flag() {
                            return vip_flag;
                        }

                        public void setVip_flag(int vip_flag) {
                            this.vip_flag = vip_flag;
                        }

                        public int getPay_flag() {
                            return pay_flag;
                        }

                        public void setPay_flag(int pay_flag) {
                            this.pay_flag = pay_flag;
                        }

                        public int getVersion() {
                            return version;
                        }

                        public void setVersion(int version) {
                            this.version = version;
                        }

                        public int getPrimecolor() {
                            return primecolor;
                        }

                        public void setPrimecolor(int primecolor) {
                            this.primecolor = primecolor;
                        }

                        public int getMagic_class() {
                            return magic_class;
                        }

                        public void setMagic_class(int magic_class) {
                            this.magic_class = magic_class;
                        }

                        public int getMagic_color() {
                            return magic_color;
                        }

                        public void setMagic_color(int magic_color) {
                            this.magic_color = magic_color;
                        }
                    }

                    public static class CompanyshowBean {
                        /**
                         * id : 0
                         * name :
                         * ex : {"desc":"","company_photo":0}
                         */

                        private int id;
                        private String name;
                        private ExBeanXX ex;

                        public int getId() {
                            return id;
                        }

                        public void setId(int id) {
                            this.id = id;
                        }

                        public String getName() {
                            return name;
                        }

                        public void setName(String name) {
                            this.name = name;
                        }

                        public ExBeanXX getEx() {
                            return ex;
                        }

                        public void setEx(ExBeanXX ex) {
                            this.ex = ex;
                        }

                        public static class ExBeanXX {
                            /**
                             * desc :
                             * company_photo : 0
                             */

                            private String desc;
                            private int company_photo;

                            public String getDesc() {
                                return desc;
                            }

                            public void setDesc(String desc) {
                                this.desc = desc;
                            }

                            public int getCompany_photo() {
                                return company_photo;
                            }

                            public void setCompany_photo(int company_photo) {
                                this.company_photo = company_photo;
                            }
                        }
                    }

                    public static class DataBeanXXXX {
                        /**
                         * int2 : 0
                         * int3 : 0
                         * update_time :
                         * int4 : 0
                         */

                        private int int2;
                        private int int3;
                        private String update_time;
                        private int int4;

                        public int getInt2() {
                            return int2;
                        }

                        public void setInt2(int int2) {
                            this.int2 = int2;
                        }

                        public int getInt3() {
                            return int3;
                        }

                        public void setInt3(int int3) {
                            this.int3 = int3;
                        }

                        public String getUpdate_time() {
                            return update_time;
                        }

                        public void setUpdate_time(String update_time) {
                            this.update_time = update_time;
                        }

                        public int getInt4() {
                            return int4;
                        }

                        public void setInt4(int int4) {
                            this.int4 = int4;
                        }
                    }

                    public static class SingersBean {
                        /**
                         * id : 2122094
                         * mid : 0021rE0d46NhIt
                         * name : 林彦俊
                         * foreign_name :
                         * type : 0
                         * genre : 0
                         * area : 0
                         * company : {"id":0,"name":"","ex":{"desc":"","company_photo":0}}
                         * grade : 0
                         * origin : 0
                         * enter : 0
                         * country : 0
                         * identity : 0
                         * birthday :
                         * instrument : 0
                         * ex : {"desc":"","wiki":"","tag":"","ex_status":0,"ex_identity":0,"info_name":"","name_spell":"","band":"","dieDate":""}
                         * photo : {"has_photo":0,"photo_cnt":0,"big_photo_flag":"","magic_rgb":0,"pic1_flag":0,"pic2_flag":0,"pic_mid":""}
                         * opt_grade : 0
                         * status : 0
                         * opt_grade_new : 0
                         * vertical_type :
                         * singer_wiki :
                         */

                        private int id;
                        private String mid;
                        private String name;
                        private String foreign_name;
                        private int type;
                        private int genre;
                        private int area;
                        private CompanyBeanX company;
                        private int grade;
                        private int origin;
                        private int enter;
                        private int country;
                        private int identity;
                        private String birthday;
                        private int instrument;
                        private ExBeanXXXX ex;
                        private PhotoBeanX photo;
                        private int opt_grade;
                        private int status;
                        private int opt_grade_new;
                        private String vertical_type;
                        private String singer_wiki;

                        public int getId() {
                            return id;
                        }

                        public void setId(int id) {
                            this.id = id;
                        }

                        public String getMid() {
                            return mid;
                        }

                        public void setMid(String mid) {
                            this.mid = mid;
                        }

                        public String getName() {
                            return name;
                        }

                        public void setName(String name) {
                            this.name = name;
                        }

                        public String getForeign_name() {
                            return foreign_name;
                        }

                        public void setForeign_name(String foreign_name) {
                            this.foreign_name = foreign_name;
                        }

                        public int getType() {
                            return type;
                        }

                        public void setType(int type) {
                            this.type = type;
                        }

                        public int getGenre() {
                            return genre;
                        }

                        public void setGenre(int genre) {
                            this.genre = genre;
                        }

                        public int getArea() {
                            return area;
                        }

                        public void setArea(int area) {
                            this.area = area;
                        }

                        public CompanyBeanX getCompany() {
                            return company;
                        }

                        public void setCompany(CompanyBeanX company) {
                            this.company = company;
                        }

                        public int getGrade() {
                            return grade;
                        }

                        public void setGrade(int grade) {
                            this.grade = grade;
                        }

                        public int getOrigin() {
                            return origin;
                        }

                        public void setOrigin(int origin) {
                            this.origin = origin;
                        }

                        public int getEnter() {
                            return enter;
                        }

                        public void setEnter(int enter) {
                            this.enter = enter;
                        }

                        public int getCountry() {
                            return country;
                        }

                        public void setCountry(int country) {
                            this.country = country;
                        }

                        public int getIdentity() {
                            return identity;
                        }

                        public void setIdentity(int identity) {
                            this.identity = identity;
                        }

                        public String getBirthday() {
                            return birthday;
                        }

                        public void setBirthday(String birthday) {
                            this.birthday = birthday;
                        }

                        public int getInstrument() {
                            return instrument;
                        }

                        public void setInstrument(int instrument) {
                            this.instrument = instrument;
                        }

                        public ExBeanXXXX getEx() {
                            return ex;
                        }

                        public void setEx(ExBeanXXXX ex) {
                            this.ex = ex;
                        }

                        public PhotoBeanX getPhoto() {
                            return photo;
                        }

                        public void setPhoto(PhotoBeanX photo) {
                            this.photo = photo;
                        }

                        public int getOpt_grade() {
                            return opt_grade;
                        }

                        public void setOpt_grade(int opt_grade) {
                            this.opt_grade = opt_grade;
                        }

                        public int getStatus() {
                            return status;
                        }

                        public void setStatus(int status) {
                            this.status = status;
                        }

                        public int getOpt_grade_new() {
                            return opt_grade_new;
                        }

                        public void setOpt_grade_new(int opt_grade_new) {
                            this.opt_grade_new = opt_grade_new;
                        }

                        public String getVertical_type() {
                            return vertical_type;
                        }

                        public void setVertical_type(String vertical_type) {
                            this.vertical_type = vertical_type;
                        }

                        public String getSinger_wiki() {
                            return singer_wiki;
                        }

                        public void setSinger_wiki(String singer_wiki) {
                            this.singer_wiki = singer_wiki;
                        }

                        public static class CompanyBeanX {
                            /**
                             * id : 0
                             * name :
                             * ex : {"desc":"","company_photo":0}
                             */

                            private int id;
                            private String name;
                            private ExBeanXXX ex;

                            public int getId() {
                                return id;
                            }

                            public void setId(int id) {
                                this.id = id;
                            }

                            public String getName() {
                                return name;
                            }

                            public void setName(String name) {
                                this.name = name;
                            }

                            public ExBeanXXX getEx() {
                                return ex;
                            }

                            public void setEx(ExBeanXXX ex) {
                                this.ex = ex;
                            }

                            public static class ExBeanXXX {
                                /**
                                 * desc :
                                 * company_photo : 0
                                 */

                                private String desc;
                                private int company_photo;

                                public String getDesc() {
                                    return desc;
                                }

                                public void setDesc(String desc) {
                                    this.desc = desc;
                                }

                                public int getCompany_photo() {
                                    return company_photo;
                                }

                                public void setCompany_photo(int company_photo) {
                                    this.company_photo = company_photo;
                                }
                            }
                        }

                        public static class ExBeanXXXX {
                            /**
                             * desc :
                             * wiki :
                             * tag :
                             * ex_status : 0
                             * ex_identity : 0
                             * info_name :
                             * name_spell :
                             * band :
                             * dieDate :
                             */

                            private String desc;
                            private String wiki;
                            private String tag;
                            private int ex_status;
                            private int ex_identity;
                            private String info_name;
                            private String name_spell;
                            private String band;
                            private String dieDate;

                            public String getDesc() {
                                return desc;
                            }

                            public void setDesc(String desc) {
                                this.desc = desc;
                            }

                            public String getWiki() {
                                return wiki;
                            }

                            public void setWiki(String wiki) {
                                this.wiki = wiki;
                            }

                            public String getTag() {
                                return tag;
                            }

                            public void setTag(String tag) {
                                this.tag = tag;
                            }

                            public int getEx_status() {
                                return ex_status;
                            }

                            public void setEx_status(int ex_status) {
                                this.ex_status = ex_status;
                            }

                            public int getEx_identity() {
                                return ex_identity;
                            }

                            public void setEx_identity(int ex_identity) {
                                this.ex_identity = ex_identity;
                            }

                            public String getInfo_name() {
                                return info_name;
                            }

                            public void setInfo_name(String info_name) {
                                this.info_name = info_name;
                            }

                            public String getName_spell() {
                                return name_spell;
                            }

                            public void setName_spell(String name_spell) {
                                this.name_spell = name_spell;
                            }

                            public String getBand() {
                                return band;
                            }

                            public void setBand(String band) {
                                this.band = band;
                            }

                            public String getDieDate() {
                                return dieDate;
                            }

                            public void setDieDate(String dieDate) {
                                this.dieDate = dieDate;
                            }
                        }

                        public static class PhotoBeanX {
                            /**
                             * has_photo : 0
                             * photo_cnt : 0
                             * big_photo_flag :
                             * magic_rgb : 0
                             * pic1_flag : 0
                             * pic2_flag : 0
                             * pic_mid :
                             */

                            private int has_photo;
                            private int photo_cnt;
                            private String big_photo_flag;
                            private int magic_rgb;
                            private int pic1_flag;
                            private int pic2_flag;
                            private String pic_mid;

                            public int getHas_photo() {
                                return has_photo;
                            }

                            public void setHas_photo(int has_photo) {
                                this.has_photo = has_photo;
                            }

                            public int getPhoto_cnt() {
                                return photo_cnt;
                            }

                            public void setPhoto_cnt(int photo_cnt) {
                                this.photo_cnt = photo_cnt;
                            }

                            public String getBig_photo_flag() {
                                return big_photo_flag;
                            }

                            public void setBig_photo_flag(String big_photo_flag) {
                                this.big_photo_flag = big_photo_flag;
                            }

                            public int getMagic_rgb() {
                                return magic_rgb;
                            }

                            public void setMagic_rgb(int magic_rgb) {
                                this.magic_rgb = magic_rgb;
                            }

                            public int getPic1_flag() {
                                return pic1_flag;
                            }

                            public void setPic1_flag(int pic1_flag) {
                                this.pic1_flag = pic1_flag;
                            }

                            public int getPic2_flag() {
                                return pic2_flag;
                            }

                            public void setPic2_flag(int pic2_flag) {
                                this.pic2_flag = pic2_flag;
                            }

                            public String getPic_mid() {
                                return pic_mid;
                            }

                            public void setPic_mid(String pic_mid) {
                                this.pic_mid = pic_mid;
                            }
                        }
                    }
                }
            }
        }

        public static class NewAlbumTagBean {
            /**
             * code : 0
             * data : {"area":[{"name":"内地","id":1,"tjreport":"11_0_0_1_10033_1"},{"name":"港台","id":2,"tjreport":"11_0_0_2_10033_2"},{"name":"欧美","id":3,"tjreport":"11_0_0_3_10033_3"},{"name":"韩国","id":4,"tjreport":"11_0_0_4_10033_4"},{"name":"日本","id":5,"tjreport":"11_0_0_5_10033_5"},{"name":"其他","id":6,"tjreport":"11_0_0_6_10033_6"}]}
             */

            private int code;
            private DataBeanXXXXXX data;

            public int getCode() {
                return code;
            }

            public void setCode(int code) {
                this.code = code;
            }

            public DataBeanXXXXXX getData() {
                return data;
            }

            public void setData(DataBeanXXXXXX data) {
                this.data = data;
            }

            public static class DataBeanXXXXXX {
                private List<AreaBean> area;

                public List<AreaBean> getArea() {
                    return area;
                }

                public void setArea(List<AreaBean> area) {
                    this.area = area;
                }

                public static class AreaBean {
                    /**
                     * name : 内地
                     * id : 1
                     * tjreport : 11_0_0_1_10033_1
                     */

                    private String name;
                    private int id;
                    private String tjreport;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public String getTjreport() {
                        return tjreport;
                    }

                    public void setTjreport(String tjreport) {
                        this.tjreport = tjreport;
                    }
                }
            }
        }

        public static class ToplistBeanX {
            /**
             * code : 0
             * data : {"group":[{"groupId":0,"groupName":"巅峰榜","toplist":[{"topId":62,"recType":10005,"topType":0,"updateType":1,"title":"飙升榜","titleDetail":"飙升榜 第62天","titleShare":"飙升榜 2023年第62天","titleSub":"","intro":"QQ音乐站内播放热度飙升最快的前100首歌曲，每日更新。","cornerMark":0,"period":"2023-03-03","updateTime":"2023-03-03","history":{"year":[],"subPeriod":[]},"listenNum":18633712,"totalNum":100,"song":[{"rank":1,"rankType":6,"rankValue":"27%","recType":0,"songId":104948863,"vid":"","albumMid":"000PO0jU10ipSb","title":"想把我唱给你听","singerName":"老狼","singerMid":"002WkEWV1TA75B","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000000PO0jU10ipSb_2.jpg","mvid":0},{"rank":2,"rankType":6,"rankValue":"16%","recType":0,"songId":4826371,"vid":"","albumMid":"001eA2gF0dGeWY","title":"那个女孩","singerName":"陶喆/卢广仲","singerMid":"002cK0F12szD9T","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001eA2gF0dGeWY.jpg","mvid":0},{"rank":3,"rankType":6,"rankValue":"15%","recType":0,"songId":397629060,"vid":"","albumMid":"001V6BG837lk8c","title":"桃花诺","singerName":"旺仔小乔","singerMid":"0045G50v35VUMG","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001V6BG837lk8c_2.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000002lyMnK2SywsI.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000002dXVv60ZUwOo.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000000PO0jU10ipSb.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M0000037mBvq0UzatI.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_1_0_2_10005_62","rt":0,"updateTips":"每日更新","bannerText":"","AdShareContent":"飙升榜 2023年第62天","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"飙升榜","musichallSubtitle":"_11首歌新上榜","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000000PO0jU10ipSb_2.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000001FprJ12I00Ie.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/test_order_channel_hitlist_con/3521138.png","cityName":"","magicColor":{"r":143,"g":151,"b":179},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M000000PO0jU10ipSb_2.jpg","groupType":0,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":26,"recType":10005,"topType":0,"updateType":1,"title":"热歌榜","titleDetail":"热歌榜 第62天","titleShare":"热歌榜 2023年第62天","titleSub":"","intro":"QQ音乐站内播放热度前300首歌曲，每日更新。","cornerMark":0,"period":"2023-03-03","updateTime":"2023-03-03","history":{"year":[],"subPeriod":[]},"listenNum":19100000,"totalNum":300,"song":[{"rank":1,"rankType":3,"rankValue":"0","recType":0,"songId":384263699,"vid":"","albumMid":"002PwL9x3TiVdh","title":"乌梅子酱","singerName":"李荣浩","singerMid":"000aHmbL2aPXWH","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002PwL9x3TiVdh_1.jpg","mvid":0},{"rank":2,"rankType":3,"rankValue":"0","recType":0,"songId":368139519,"vid":"","albumMid":"002HcXA60aeTLD","title":"就让这大雨全都落下","singerName":"容祖儿","singerMid":"001uXFgt1kpLyI","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002HcXA60aeTLD_1.jpg","mvid":0},{"rank":3,"rankType":1,"rankValue":"2","recType":0,"songId":326584182,"vid":"","albumMid":"004Kbn3m2HV9Y3","title":"如愿","singerName":"王菲","singerMid":"000GDDuQ3sGQiT","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000004Kbn3m2HV9Y3_1.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M0000011o0JU32ofbv.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000001c0hSr1R862c.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002PwL9x3TiVdh.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000003Ounnt1W11Tz.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_1_0_3_10005_26","rt":0,"updateTips":"每日更新","bannerText":"","AdShareContent":"热歌榜 2023年第62天","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"热歌榜","musichallSubtitle":"_11首歌新上榜","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002PwL9x3TiVdh_1.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000001txncR3TDZoj.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/test_order_channel_hitlist_con/4348759.png","cityName":"","magicColor":{"r":123,"g":35,"b":4},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002PwL9x3TiVdh_1.jpg","groupType":0,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":27,"recType":10005,"topType":0,"updateType":1,"title":"新歌榜","titleDetail":"新歌榜 第62天","titleShare":"新歌榜 2023年第62天","titleSub":"","intro":"QQ音乐站内播放热度排名前100首新歌，每日更新。","cornerMark":0,"period":"2023-03-03","updateTime":"2023-03-03","history":{"year":[],"subPeriod":[]},"listenNum":165581,"totalNum":100,"song":[{"rank":1,"rankType":3,"rankValue":"0","recType":0,"songId":396710011,"vid":"","albumMid":"0027gqTJ2vh1Fz","title":"苦咖啡·唯一","singerName":"那奇沃夫/KKECHO","singerMid":"0043ujuR27z2p8","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M0000027gqTJ2vh1Fz_1.jpg","mvid":0},{"rank":2,"rankType":3,"rankValue":"0","recType":0,"songId":393949802,"vid":"","albumMid":"000WDNPt4XUrXs","title":"谁","singerName":"曲肖冰","singerMid":"001ZVMXf3ZYVX7","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000000WDNPt4XUrXs_2.jpg","mvid":0},{"rank":3,"rankType":1,"rankValue":"1","recType":0,"songId":396112160,"vid":"","albumMid":"0042mJP52iOjn5","title":"忘了","singerName":"周林枫","singerMid":"002LlLHa3jSdoa","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M0000042mJP52iOjn5_2.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000004VcMwE2rNG9p.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M0000015hl0K4VWnJd.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M0000027gqTJ2vh1Fz.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M0000002xW8j2OPQhZ.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_1_0_4_10005_27","rt":0,"updateTips":"每日更新","bannerText":"","AdShareContent":"新歌榜 2023年第62天","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"新歌榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M0000027gqTJ2vh1Fz_1.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000001vYgwU0VGAg3.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/test_order_channel_hitlist_con/3521143.png","cityName":"","magicColor":{"r":166,"g":146,"b":89},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M0000027gqTJ2vh1Fz_1.jpg","groupType":0,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":4,"recType":10005,"topType":0,"updateType":1,"title":"流行指数榜","titleDetail":"流行指数榜 第62天","titleShare":"流行指数榜 2023年第62天","titleSub":"","intro":"QQ音乐站内播放相对涨幅排名前100首歌曲，每日更新。","cornerMark":0,"period":"2023-03-03","updateTime":"2023-03-03","history":{"year":[],"subPeriod":[]},"listenNum":7953220,"totalNum":100,"song":[{"rank":1,"rankType":6,"rankValue":"125%","recType":0,"songId":397629060,"vid":"","albumMid":"001V6BG837lk8c","title":"桃花诺","singerName":"旺仔小乔","singerMid":"0045G50v35VUMG","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001V6BG837lk8c_2.jpg","mvid":0},{"rank":2,"rankType":6,"rankValue":"109%","recType":0,"songId":396112160,"vid":"","albumMid":"0042mJP52iOjn5","title":"忘了","singerName":"周林枫","singerMid":"002LlLHa3jSdoa","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M0000042mJP52iOjn5_2.jpg","mvid":0},{"rank":3,"rankType":6,"rankValue":"64%","recType":0,"songId":326584182,"vid":"","albumMid":"004Kbn3m2HV9Y3","title":"如愿","singerName":"王菲","singerMid":"000GDDuQ3sGQiT","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000004Kbn3m2HV9Y3_1.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M0000035Tt4F3UDdrD.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000003tk5iY15Lpv5.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001V6BG837lk8c.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000001xBRF61nMru2.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_1_0_5_10005_4","rt":0,"updateTips":"每日更新","bannerText":"","AdShareContent":"流行指数榜 2023年第62天","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"流行指数榜","musichallSubtitle":"_每日更新","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001V6BG837lk8c_2.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000002ulDjs1n24zg.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/test_order_channel_hitlist_con/3521144.png","cityName":"","magicColor":{"r":143,"g":160,"b":179},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001V6BG837lk8c_2.jpg","groupType":0,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":57,"recType":10005,"topType":0,"updateType":0,"title":"喜力电音榜","titleDetail":"喜力电音榜 第9周","titleShare":"喜力电音榜 2023年第9周","titleSub":"","intro":"QQ音乐播放热度最高的电音歌曲TOP50，每周更新。","cornerMark":0,"period":"2023_9","updateTime":"2023-03-02","history":{"year":[2023,2022,2021,2020,2019,2018],"subPeriod":[[9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[53,52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0],[51,50,49,48,47,46,45,44,43,42,41,40]]},"listenNum":1403255,"totalNum":50,"song":[{"rank":1,"rankType":4,"rankValue":"0","recType":0,"songId":397447822,"vid":"","albumMid":"001d3W0x4DRn3z","title":"Not Cinderella","singerName":"宋雨琦/하이퍼타임","singerMid":"003GgG3V1fkAFf","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001d3W0x4DRn3z_1.jpg","mvid":0},{"rank":2,"rankType":2,"rankValue":"1","recType":0,"songId":394444590,"vid":"","albumMid":"0035N8lV3X7fWw","title":"冰川之泪 Tears from the Ice River","singerName":"Terry Zhong 钟天利/考拉kora","singerMid":"001pW4WY4TWNk4","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M0000035N8lV3X7fWw_4.jpg","mvid":0},{"rank":3,"rankType":1,"rankValue":"2","recType":0,"songId":390980914,"vid":"","albumMid":"0036ZLdt4djv3M","title":"春时·雪梅赋","singerName":"Onism./Bumpÿ/故茕","singerMid":"004RrX0B0WU9fb","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M0000036ZLdt4djv3M.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000001udetC0yeED3.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000002ua5jF0WSlI3.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001d3W0x4DRn3z.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000003uPdgx0Tr0fu.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_1_0_6_10005_57","rt":0,"updateTips":"每周更新","bannerText":"","AdShareContent":"喜力电音榜 2023年第9周","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"喜力电音榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001d3W0x4DRn3z_1.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000000rBoNt0e3vjA.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/t_order_channel_hitlist_conf/4316437.png","cityName":"","magicColor":{"r":27,"g":33,"b":50},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001d3W0x4DRn3z_1.jpg","groupType":0,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":52,"recType":10005,"topType":0,"updateType":1,"title":"腾讯音乐人原创榜","titleDetail":"腾讯音乐人原创榜 第62天","titleShare":"腾讯音乐人原创榜 2023年第62天","titleSub":"","intro":"QQ音乐最新最热的腾讯音乐人原创作品TOP100。","cornerMark":0,"period":"2023-03-03","updateTime":"2023-03-03","history":{"year":[],"subPeriod":[]},"listenNum":215859,"totalNum":100,"song":[{"rank":1,"rankType":1,"rankValue":"13","recType":0,"songId":397275665,"vid":"","albumMid":"003DnOkh2tRqtL","title":"奇妙的我","singerName":"廖麻酱","singerMid":"003OZSqE3uDM1Z","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000003DnOkh2tRqtL_1.jpg","mvid":0},{"rank":2,"rankType":5,"rankValue":"0","recType":0,"songId":397597953,"vid":"","albumMid":"004WNJUO0fGQjD","title":"兀兀","singerName":"陈粒","singerMid":"004WgCsE3KBddt","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000004WNJUO0fGQjD.jpg","mvid":0},{"rank":3,"rankType":5,"rankValue":"0","recType":0,"songId":398282803,"vid":"","albumMid":"000t9S9F0dXtUA","title":"雪 Distance","singerName":"Capper/罗言RollFlash","singerMid":"001eBoUt4SiKgg","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000000t9S9F0dXtUA_1.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000000UNjRp06k6iT.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000000BhdFW29cCO8.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000003DnOkh2tRqtL.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000002r0kOh1bpfdO.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_1_0_8_10005_52","rt":0,"updateTips":"每日更新","bannerText":"","AdShareContent":"腾讯音乐人原创榜 2023年第62天","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"腾讯音乐人原创榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000003DnOkh2tRqtL_1.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000001U2H121SzQdG.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/t_order_channel_hitlist_conf/4118315.png","cityName":"","magicColor":{"r":204,"g":148,"b":110},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M000003DnOkh2tRqtL_1.jpg","groupType":0,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":67,"recType":10005,"topType":0,"updateType":1,"title":"听歌识曲榜","titleDetail":"听歌识曲榜 第62天","titleShare":"听歌识曲榜 2023年第62天","titleSub":"","intro":"QQ音乐用户使用\u201c听歌识曲\u201d功能捕捉热度最高的歌曲TOP100，每日更新。","cornerMark":0,"period":"2023-03-03","updateTime":"2023-03-03","history":{"year":[],"subPeriod":[]},"listenNum":3049800,"totalNum":100,"song":[{"rank":1,"rankType":4,"rankValue":"0","recType":0,"songId":398354303,"vid":"","albumMid":"003UOXP11qKicA","title":"Someone you Loved","singerName":"美二帆","singerMid":"000frQdA07uHz2","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000003UOXP11qKicA_1.jpg","mvid":0},{"rank":2,"rankType":2,"rankValue":"1","recType":0,"songId":357531938,"vid":"","albumMid":"003DFrnj26SMZU","title":"可能","singerName":"程响","singerMid":"003iPzNg35cWzp","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000003DFrnj26SMZU_2.jpg","mvid":0},{"rank":3,"rankType":2,"rankValue":"1","recType":0,"songId":396710011,"vid":"","albumMid":"0027gqTJ2vh1Fz","title":"苦咖啡·唯一","singerName":"那奇沃夫/KKECHO","singerMid":"0043ujuR27z2p8","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M0000027gqTJ2vh1Fz_1.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000001MJT9r3EsWba.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000002zuUdq4Y5Ny6.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000003UOXP11qKicA.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000004fFtpg1f7i4K.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_1_0_10_10005_67","rt":0,"updateTips":"每日更新","bannerText":"","AdShareContent":"听歌识曲榜 2023年第62天","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"听歌识曲榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000003UOXP11qKicA_1.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000002KAai41Cm5vP.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/test_order_channel_hitlist_con/3521141.png","cityName":"","magicColor":{"r":179,"g":143,"b":155},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M000003UOXP11qKicA_1.jpg","groupType":0,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":201,"recType":10010,"topType":0,"updateType":1,"title":"MV榜","titleDetail":"MV榜 ","titleShare":"MV榜 ","titleSub":"","intro":"QQ音乐播放得分最高的官方MV TOP排行榜，发行期90天内。","cornerMark":0,"period":"","updateTime":"","history":{"year":[],"subPeriod":[]},"listenNum":1450225,"totalNum":20,"song":[{"rank":1,"rankType":0,"rankValue":"","recType":1,"songId":0,"vid":"001BFqNN1ogb9G","albumMid":"001rb1ah0bFKMo","title":"花开忘忧","singerName":"周深","singerMid":"003fA5G40k6hKc","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001rb1ah0bFKMo_1.jpg","mvid":0},{"rank":2,"rankType":0,"rankValue":"","recType":1,"songId":0,"vid":"0034Z4yM2RG9m0","albumMid":"003zzzm62mna7A","title":"부석순 (SEVENTEEN) '파이팅 해야지 (Feat. 이영지)' Official MV (Choreography Version)","singerName":"BSS/李泳知","singerMid":"001J1wmG2twrzz","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000003zzzm62mna7A.jpg","mvid":0},{"rank":3,"rankType":0,"rankValue":"","recType":1,"songId":0,"vid":"000eCTmM20oytM","albumMid":"004aaud01NY6TC","title":"Hadn't Met You","singerName":"Lil Ghost小鬼","singerMid":"003Xf2W10FZgVW","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000004aaud01NY6TC.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000000R5yK4078ovt.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000003YxgiC3yiWSB.jpg","mbFrontPicUrl":"https://y.gtimg.cn/music/photo_new/T002R300x300M000001rb1ah0bFKMo_1.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M0000005m0me4Gnsq1.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"http://y.qq.com/m/client/v5detail/mv.html?navpage=toplist","h5JumpUrl":"https://y.qq.com/m/client/video_rank_list/index.html","url_key":"v5detail_mv","url_params":"","tjreport":"2_1_0_12_10010_201","rt":0,"updateTips":"每10分钟更新","bannerText":"","AdShareContent":"MV榜 ","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"MV榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001rb1ah0bFKMo_1.jpg","specialScheme":"qqmusic://qq.com/ui/openRN?p=%7B%22key%22%3A%22MvToplist%22%2C%22failoverUrl%22%3A%22https%3A%2F%2Fy.qq.com%2Fm%2Fclient%2Fvideo_rank_list%2Findex.html%22%7D","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T002R300x300M000001rb1ah0bFKMo_1.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common","cityName":"","magicColor":{"r":0,"g":0,"b":0},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001rb1ah0bFKMo_1.jpg","groupType":0,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""}],"type":0,"myFeatureButtonText":"","myFeatureButtonScheme":""},{"groupId":1,"groupName":"地区榜","toplist":[{"topId":5,"recType":10005,"topType":0,"updateType":0,"title":"内地榜","titleDetail":"内地榜 第9周","titleShare":"内地榜 2023年第9周","titleSub":"","intro":"QQ音乐每周播放热度最高的内地歌曲TOP100，发行期为90天内。","cornerMark":0,"period":"2023_9","updateTime":"2023-03-02","history":{"year":[2023,2022,2021,2020,2019,2018],"subPeriod":[[9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[53,52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0],[51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0]]},"listenNum":1409345,"totalNum":100,"song":[{"rank":1,"rankType":1,"rankValue":"6","recType":0,"songId":396710011,"vid":"","albumMid":"0027gqTJ2vh1Fz","title":"苦咖啡·唯一","singerName":"那奇沃夫/KKECHO","singerMid":"0043ujuR27z2p8","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M0000027gqTJ2vh1Fz_1.jpg","mvid":0},{"rank":2,"rankType":4,"rankValue":"0","recType":0,"songId":397789721,"vid":"","albumMid":"000O918O2RmZ00","title":"一起跳舞吧","singerName":"丁程鑫","singerMid":"002J81Pr09yjag","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000000O918O2RmZ00_1.jpg","mvid":0},{"rank":3,"rankType":2,"rankValue":"2","recType":0,"songId":384263699,"vid":"","albumMid":"002PwL9x3TiVdh","title":"乌梅子酱","singerName":"李荣浩","singerMid":"000aHmbL2aPXWH","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002PwL9x3TiVdh_1.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M00000227k6J2F0GAO.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000000wqpDL1FYliN.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000000wqpDL1FYliN.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M00000227k6J2F0GAO.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_1_0_1_10005_5","rt":0,"updateTips":"每周更新","bannerText":"","AdShareContent":"内地榜 2023年第9周","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"内地榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M0000027gqTJ2vh1Fz_1.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000003KqzoQ2Vacb0.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/test_order_channel_hitlist_con/3521162.png","cityName":"","magicColor":{"r":166,"g":146,"b":89},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M0000027gqTJ2vh1Fz_1.jpg","groupType":1,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":59,"recType":10005,"topType":0,"updateType":0,"title":"香港地区榜","titleDetail":"香港地区榜 第9周","titleShare":"香港地区榜 2023年第9周","titleSub":"","intro":"QQ音乐每周播放热度最高的中国香港地区歌曲TOP100，发行期为180天内。","cornerMark":0,"period":"2023_9","updateTime":"2023-03-02","history":{"year":[2023,2022,2021,2020,2019],"subPeriod":[[9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[53,52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13]]},"listenNum":916685,"totalNum":100,"song":[{"rank":1,"rankType":4,"rankValue":"0","recType":0,"songId":397443489,"vid":"","albumMid":"004LFx1H3YpNGW","title":"又十年","singerName":"张学友","singerMid":"004Be55m1SJaLk","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000004LFx1H3YpNGW_1.jpg","mvid":0},{"rank":2,"rankType":2,"rankValue":"1","recType":0,"songId":368139519,"vid":"","albumMid":"002HcXA60aeTLD","title":"就让这大雨全都落下","singerName":"容祖儿","singerMid":"001uXFgt1kpLyI","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002HcXA60aeTLD_1.jpg","mvid":0},{"rank":3,"rankType":3,"rankValue":"0","recType":0,"songId":389987990,"vid":"","albumMid":"000ZbDFV3dhEsy","title":"晚风心里吹","singerName":"李克勤","singerMid":"003nS2v740Lxcw","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000000ZbDFV3dhEsy_1.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000002m2j883EjG93.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000003bLFg53vTTiw.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000003bLFg53vTTiw.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000002m2j883EjG93.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_1_0_2_10005_59","rt":0,"updateTips":"每周更新","bannerText":"","AdShareContent":"香港地区榜 2023年第9周","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"香港地区榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000004LFx1H3YpNGW_1.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000003xAnYY0Ya6hy.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/test_order_channel_hitlist_con/3415283.png","cityName":"","magicColor":{"r":125,"g":174,"b":179},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M000004LFx1H3YpNGW_1.jpg","groupType":1,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":61,"recType":10005,"topType":0,"updateType":0,"title":"台湾地区榜","titleDetail":"台湾地区榜 第9周","titleShare":"台湾地区榜 2023年第9周","titleSub":"","intro":"QQ音乐每周播放热度最高的中国台湾地区歌曲TOP100，发行期为90天内。","cornerMark":0,"period":"2023_9","updateTime":"2023-03-02","history":{"year":[2023,2022,2021,2020,2019],"subPeriod":[[9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[53,52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15]]},"listenNum":252296,"totalNum":100,"song":[{"rank":1,"rankType":3,"rankValue":"0","recType":0,"songId":393960841,"vid":"","albumMid":"001qbyMM2byl8Q","title":"达尔文","singerName":"林俊杰","singerMid":"001BLpXF2DyJe2","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001qbyMM2byl8Q_1.jpg","mvid":0},{"rank":2,"rankType":1,"rankValue":"1","recType":0,"songId":393959368,"vid":"","albumMid":"003KCM1p2gta6y","title":"想见你想见你想见你","singerName":"林俊杰","singerMid":"001BLpXF2DyJe2","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000003KCM1p2gta6y_1.jpg","mvid":0},{"rank":3,"rankType":2,"rankValue":"1","recType":0,"songId":393960843,"vid":"","albumMid":"001qbyMM2byl8Q","title":"那女孩对我说","singerName":"林俊杰","singerMid":"001BLpXF2DyJe2","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001qbyMM2byl8Q_1.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M0000016NbPK3FkdkT.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000004WRTWx2VAjuu.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000004WRTWx2VAjuu.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M0000016NbPK3FkdkT.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_1_0_3_10005_61","rt":0,"updateTips":"每周更新","bannerText":"","AdShareContent":"台湾地区榜 2023年第9周","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"台湾地区榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001qbyMM2byl8Q_1.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000003GdHnA3DwOAl.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/test_order_channel_hitlist_con/3415643.png","cityName":"","magicColor":{"r":52,"g":61,"b":90},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001qbyMM2byl8Q_1.jpg","groupType":1,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":3,"recType":10005,"topType":0,"updateType":0,"title":"欧美榜","titleDetail":"欧美榜 第9周","titleShare":"欧美榜 2023年第9周","titleSub":"","intro":"QQ音乐每周播放热度最高的欧美地区歌曲TOP 100，发行期为30天内。","cornerMark":0,"period":"2023_9","updateTime":"2023-03-02","history":{"year":[2023,2022,2021,2020,2019,2018],"subPeriod":[[9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[53,52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0],[51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0]]},"listenNum":1960000,"totalNum":100,"song":[{"rank":1,"rankType":4,"rankValue":"0","recType":0,"songId":397802275,"vid":"","albumMid":"001LI42s2QNkL6","title":"Die For You (Remix)","singerName":"The Weeknd/Ariana Grande","singerMid":"004YnseG2vQN7h","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001LI42s2QNkL6_1.jpg","mvid":0},{"rank":2,"rankType":4,"rankValue":"0","recType":0,"songId":395635270,"vid":"","albumMid":"0026Q7RE0dAvUl","title":"My Stupid Heart (Kids Version)","singerName":"Walk Off the Earth/Luminati Suns","singerMid":"002RXUq04F4DHF","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M0000026Q7RE0dAvUl.jpg","mvid":0},{"rank":3,"rankType":4,"rankValue":"0","recType":0,"songId":393602333,"vid":"","albumMid":"0017wKtn0lTtaq","title":"Body Rock","singerName":"Mike Candys","singerMid":"001GxgEP0IlucW","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M0000017wKtn0lTtaq.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000001Kolpa2KTgqQ.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000001yJ2ig49cYQX.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000001yJ2ig49cYQX.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000001Kolpa2KTgqQ.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_1_0_4_10005_3","rt":0,"updateTips":"每周更新","bannerText":"","AdShareContent":"欧美榜 2023年第9周","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"欧美榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001LI42s2QNkL6_1.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000001ma3Qn3cbthw.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/test_order_channel_hitlist_con/3521170.png","cityName":"","magicColor":{"r":204,"g":3,"b":2},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001LI42s2QNkL6_1.jpg","groupType":1,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":16,"recType":10005,"topType":0,"updateType":0,"title":"韩国榜","titleDetail":"韩国榜 第9周","titleShare":"韩国榜 2023年第9周","titleSub":"","intro":"QQ音乐每周播放热度最高的韩国地区歌曲TOP 100，发行期为90天内。","cornerMark":0,"period":"2023_9","updateTime":"2023-03-02","history":{"year":[2023,2022,2021,2020,2019,2018],"subPeriod":[[9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[53,52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0],[51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0]]},"listenNum":1817220,"totalNum":100,"song":[{"rank":1,"rankType":3,"rankValue":"0","recType":0,"songId":388821920,"vid":"","albumMid":"003dzmv64ez17A","title":"Ditto","singerName":"NewJeans (뉴진스)","singerMid":"001FEs4D2z3CLR","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000003dzmv64ez17A_1.jpg","mvid":0},{"rank":2,"rankType":3,"rankValue":"0","recType":0,"songId":390142723,"vid":"","albumMid":"003dzmv64ez17A","title":"OMG","singerName":"NewJeans (뉴진스)","singerMid":"001FEs4D2z3CLR","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000003dzmv64ez17A_1.jpg","mvid":0},{"rank":3,"rankType":1,"rankValue":"2","recType":0,"songId":392497445,"vid":"","albumMid":"003bWZsB2mEkFY","title":"MOONLIGHT SUNRISE","singerName":"TWICE (트와이스)","singerMid":"001p0vF44ewiwB","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000003bWZsB2mEkFY.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000002q7ZBy3QNak2.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000003XQBFb4TSjv0.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000003XQBFb4TSjv0.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000002q7ZBy3QNak2.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_1_0_5_10005_16","rt":0,"updateTips":"每周更新","bannerText":"","AdShareContent":"韩国榜 2023年第9周","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"韩国榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000003dzmv64ez17A_1.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000001fvswc2w8VGv.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/test_order_channel_hitlist_con/3521166.png","cityName":"","magicColor":{"r":34,"g":34,"b":34},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M000003dzmv64ez17A_1.jpg","groupType":1,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":17,"recType":10005,"topType":0,"updateType":0,"title":"日本榜","titleDetail":"日本榜 第9周","titleShare":"日本榜 2023年第9周","titleSub":"","intro":"QQ音乐每周播放热度最高的日本地区歌曲TOP 100，发行期为180天内。","cornerMark":0,"period":"2023_9","updateTime":"2023-03-02","history":{"year":[2023,2022,2021,2020,2019,2018],"subPeriod":[[9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[53,52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0],[51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0]]},"listenNum":526960,"totalNum":100,"song":[{"rank":1,"rankType":3,"rankValue":"0","recType":0,"songId":395409948,"vid":"","albumMid":"00044qw50t0Qdb","title":"アドベンチャー (冒险)","singerName":"YOASOBI (ヨアソビ)","singerMid":"001Erp1x1jDOoQ","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M00000044qw50t0Qdb_1.jpg","mvid":0},{"rank":2,"rankType":4,"rankValue":"0","recType":0,"songId":397251474,"vid":"","albumMid":"0015G8kF1AIPsj","title":"Easy come, easy go","singerName":"FANTASTICS from EXILE TRIBE (ファンタスティックス)","singerMid":"000YlVzJ3nc675","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M0000015G8kF1AIPsj.jpg","mvid":0},{"rank":3,"rankType":4,"rankValue":"0","recType":0,"songId":396247057,"vid":"","albumMid":"002xsaRF4IlqUE","title":"crossovers","singerName":"Aimer (エメ)","singerMid":"0039EKtl4ec7wv","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002xsaRF4IlqUE.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000002bg4oG0xDWdG.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000000wctsP2uWE9d.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000000wctsP2uWE9d.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000002bg4oG0xDWdG.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_1_0_6_10005_17","rt":0,"updateTips":"每周更新","bannerText":"","AdShareContent":"日本榜 2023年第9周","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"日本榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M00000044qw50t0Qdb_1.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000003nbtBu0rcJhs.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/test_order_channel_hitlist_con/3521167.png","cityName":"","magicColor":{"r":204,"g":85,"b":159},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M00000044qw50t0Qdb_1.jpg","groupType":1,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""}],"type":1,"myFeatureButtonText":"","myFeatureButtonScheme":""},{"groupId":2,"groupName":"特色榜","toplist":[{"topId":28,"recType":10005,"topType":0,"updateType":0,"title":"网络歌曲榜","titleDetail":"网络歌曲榜 第9周","titleShare":"网络歌曲榜 2023年第9周","titleSub":"","intro":"QQ音乐播放热度最高网络歌曲TOP 100，每周更新。","cornerMark":0,"period":"2023_9","updateTime":"2023-03-02","history":{"year":[2023,2022,2021,2020,2019,2018],"subPeriod":[[9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[53,52,51,50,49,48,47,46,45,44,43,42,41,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,0],[51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0]]},"listenNum":3106500,"totalNum":100,"song":[{"rank":1,"rankType":3,"rankValue":"0","recType":0,"songId":395444421,"vid":"","albumMid":"002GGV7X2BYwde","title":"人生的道场","singerName":"魏佳艺","singerMid":"002fAf8s2nwDgu","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002GGV7X2BYwde_2.jpg","mvid":0},{"rank":2,"rankType":3,"rankValue":"0","recType":0,"songId":395463211,"vid":"","albumMid":"000S7U533pd8KZ","title":"感谢有你陪在我身旁","singerName":"薛朋朋/古文豪/左文正","singerMid":"0034EH151w7FdC","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000000S7U533pd8KZ_1.jpg","mvid":0},{"rank":3,"rankType":1,"rankValue":"5","recType":0,"songId":395716808,"vid":"","albumMid":"001xtDh434BKdx","title":"生于人间何罪之有","singerName":"魏佳艺","singerMid":"002fAf8s2nwDgu","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001xtDh434BKdx_1.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000001abDah1bKEZb.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000000b5kax3tEvek.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000000b5kax3tEvek.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000001abDah1bKEZb.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_1_0_1_10005_28","rt":0,"updateTips":"每周更新","bannerText":"","AdShareContent":"网络歌曲榜 2023年第9周","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"网络歌曲榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002GGV7X2BYwde_2.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000000G2dBV1SOaNU.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/test_order_channel_hitlist_con/3415252.png","cityName":"","magicColor":{"r":125,"g":153,"b":179},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002GGV7X2BYwde_2.jpg","groupType":1,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":63,"recType":10005,"topType":0,"updateType":0,"title":"DJ舞曲榜","titleDetail":"DJ舞曲榜 第9周","titleShare":"DJ舞曲榜 2023年第9周","titleSub":"","intro":"QQ音乐播放热度最高的DJ舞曲TOP 100，每周更新。","cornerMark":0,"period":"2023_9","updateTime":"2023-03-02","history":{"year":[2023,2022,2021,2020],"subPeriod":[[9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[53,52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16]]},"listenNum":9648220,"totalNum":100,"song":[{"rank":1,"rankType":4,"rankValue":"0","recType":0,"songId":396252082,"vid":"","albumMid":"000zA0Is0GvcqU","title":"后来没有了我们 (后来的你在哪)","singerName":"树泽","singerMid":"000aoHvu0vx0G9","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000000zA0Is0GvcqU_1.jpg","mvid":0},{"rank":2,"rankType":5,"rankValue":"0","recType":0,"songId":376033339,"vid":"","albumMid":"004cFRQL48FrdU","title":"我们不再是从前 (女版)","singerName":"唐艺","singerMid":"002nsWqw39lyxT","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000004cFRQL48FrdU.jpg","mvid":0},{"rank":3,"rankType":4,"rankValue":"0","recType":0,"songId":393743783,"vid":"","albumMid":"0009phh644SE5p","title":"请你留在我身边","singerName":"陆左左","singerMid":"002lgaBm0C4n18","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M0000009phh644SE5p.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000001XWzYt3duuRP.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M0000046ilyy1JFd7O.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M0000046ilyy1JFd7O.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000001XWzYt3duuRP.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_1_0_2_10005_63","rt":0,"updateTips":"每周更新","bannerText":"","AdShareContent":"DJ舞曲榜 2023年第9周","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"DJ舞曲榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000000zA0Is0GvcqU_1.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000002PGjeH2STMGF.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/test_order_channel_hitlist_con/3415648.png","cityName":"","magicColor":{"r":21,"g":26,"b":35},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M000000zA0Is0GvcqU_1.jpg","groupType":1,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":60,"recType":10005,"topType":0,"updateType":0,"title":"抖快榜","titleDetail":"抖快榜 第9周","titleShare":"抖快榜 2023年第9周","titleSub":"","intro":"当下最流行的短视频热歌TOP 100，每周更新。","cornerMark":0,"period":"2023_9","updateTime":"2023-03-02","history":{"year":[2023,2022,2021,2020,2019],"subPeriod":[[9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[53,52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13]]},"listenNum":4539160,"totalNum":100,"song":[{"rank":1,"rankType":3,"rankValue":"0","recType":0,"songId":384263699,"vid":"","albumMid":"002PwL9x3TiVdh","title":"乌梅子酱","singerName":"李荣浩","singerMid":"000aHmbL2aPXWH","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002PwL9x3TiVdh_1.jpg","mvid":0},{"rank":2,"rankType":1,"rankValue":"3","recType":0,"songId":357531938,"vid":"","albumMid":"003DFrnj26SMZU","title":"可能","singerName":"程响","singerMid":"003iPzNg35cWzp","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000003DFrnj26SMZU_2.jpg","mvid":0},{"rank":3,"rankType":3,"rankValue":"0","recType":0,"songId":202553248,"vid":"","albumMid":"000Vk6tG2kuHDU","title":"桃花诺","singerName":"G.E.M. 邓紫棋","singerMid":"001fNHEf1SFEFN","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000000Vk6tG2kuHDU_1.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000003TWwxC1WYg1S.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000000efxxP1ctsMp.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000000efxxP1ctsMp.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000003TWwxC1WYg1S.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_1_0_4_10005_60","rt":0,"updateTips":"每周更新","bannerText":"","AdShareContent":"抖快榜 2023年第9周","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"抖快榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002PwL9x3TiVdh_1.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000001NZK711Zk9rU.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/test_order_channel_hitlist_con/4262142.png","cityName":"","magicColor":{"r":123,"g":35,"b":4},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002PwL9x3TiVdh_1.jpg","groupType":1,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":64,"recType":10005,"topType":0,"updateType":0,"title":"综艺新歌榜","titleDetail":"综艺新歌榜 第9周","titleShare":"综艺新歌榜 2023年第9周","titleSub":"","intro":"QQ音乐每周播放热度最高的综艺歌曲TOP 100，发行期为180天内。","cornerMark":0,"period":"2023_9","updateTime":"2023-03-02","history":{"year":[2023,2022,2021,2020,2019],"subPeriod":[[9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[53,52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[51,50,49,48,47,46,45,44,43,42,41,40,39,38,37]]},"listenNum":623105,"totalNum":100,"song":[{"rank":1,"rankType":4,"rankValue":"0","recType":0,"songId":397841583,"vid":"","albumMid":"004Z06mG0xCAd1","title":"逆光 (Live)","singerName":"张真源","singerMid":"000c1x452OEKGL","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000004Z06mG0xCAd1_2.jpg","mvid":0},{"rank":2,"rankType":4,"rankValue":"0","recType":0,"songId":397246914,"vid":"","albumMid":"002CLgLY0YRdJd","title":"芽","singerName":"周深","singerMid":"003fA5G40k6hKc","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002CLgLY0YRdJd.jpg","mvid":0},{"rank":3,"rankType":2,"rankValue":"2","recType":0,"songId":396683024,"vid":"","albumMid":"000IhwSe2Ubv4n","title":"水姻缘 (Live)","singerName":"周深","singerMid":"003fA5G40k6hKc","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000000IhwSe2Ubv4n_2.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000003Rydlm1w7DT0.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000003I8Qds1gQdL2.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000003I8Qds1gQdL2.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000003Rydlm1w7DT0.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_1_0_5_10005_64","rt":0,"updateTips":"每周更新","bannerText":"","AdShareContent":"综艺新歌榜 2023年第9周","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"综艺新歌榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000004Z06mG0xCAd1_2.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000001L4btW2WqFeM.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/test_order_channel_hitlist_con/3415268.png","cityName":"","magicColor":{"r":115,"g":58,"b":0},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M000004Z06mG0xCAd1_2.jpg","groupType":1,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":29,"recType":10005,"topType":0,"updateType":0,"title":"影视金曲榜","titleDetail":"影视金曲榜 第9周","titleShare":"影视金曲榜 2023年第9周","titleSub":"","intro":"QQ音乐每周播放热度最高的影视歌曲TOP 100，发行期90天内。","cornerMark":0,"period":"2023_9","updateTime":"2023-03-02","history":{"year":[2023,2022,2021,2020,2019,2018],"subPeriod":[[9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[53,52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,3,2,1],[51,50,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,32,31,30,29,28,27,26,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0],[51,50,49,48,47,46,45,44,43,42,41,40,39,37,36,35,34,33,32,29,28,27,26,25,24,23,22,21,20,19,18,17,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0]]},"listenNum":519887,"totalNum":100,"song":[{"rank":1,"rankType":3,"rankValue":"0","recType":0,"songId":389979699,"vid":"","albumMid":"004fOpm21zKAMy","title":"去有风的地方","singerName":"郁可唯","singerMid":"000NUoMp2WAEpO","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000004fOpm21zKAMy_2.jpg","mvid":0},{"rank":2,"rankType":4,"rankValue":"0","recType":0,"songId":397455169,"vid":"","albumMid":"000WTmUr0ErncG","title":"念念不忘","singerName":"张靓颖","singerMid":"000aw4WC2EQYTv","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000000WTmUr0ErncG.jpg","mvid":0},{"rank":3,"rankType":2,"rankValue":"1","recType":0,"songId":391610675,"vid":"","albumMid":"000DWU8N34e5Dr","title":"人是_","singerName":"周深","singerMid":"003fA5G40k6hKc","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000000DWU8N34e5Dr.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000001XLWOb45PVBi.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000004Aflqr3wvlfU.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000004Aflqr3wvlfU.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000001XLWOb45PVBi.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_1_0_6_10005_29","rt":0,"updateTips":"每周更新","bannerText":"","AdShareContent":"影视金曲榜 2023年第9周","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"影视金曲榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000004fOpm21zKAMy_2.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000004Ks5Og1HX5s2.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/test_order_channel_hitlist_con/3415257.png","cityName":"","magicColor":{"r":91,"g":84,"b":46},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M000004fOpm21zKAMy_2.jpg","groupType":1,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":65,"recType":10005,"topType":0,"updateType":0,"title":"国风热歌榜","titleDetail":"国风热歌榜 第9周","titleShare":"国风热歌榜 2023年第9周","titleSub":"","intro":"QQ音乐每周播放热度最高的国风歌曲TOP 100，发行期90天内。","cornerMark":0,"period":"2023_9","updateTime":"2023-03-02","history":{"year":[2023,2022,2021,2020,2019],"subPeriod":[[9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[53,52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[51,50,49,48,47,46,45,44,43,42,41,40,39,38,37]]},"listenNum":1910000,"totalNum":100,"song":[{"rank":1,"rankType":4,"rankValue":"0","recType":0,"songId":397629060,"vid":"","albumMid":"001V6BG837lk8c","title":"桃花诺","singerName":"旺仔小乔","singerMid":"0045G50v35VUMG","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001V6BG837lk8c_2.jpg","mvid":0},{"rank":2,"rankType":4,"rankValue":"0","recType":0,"songId":397470213,"vid":"","albumMid":"001uMAko0Ipuww","title":"朝暮","singerName":"摩登兄弟刘宇宁","singerMid":"001Iu4Dv1NzRCD","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001uMAko0Ipuww_1.jpg","mvid":0},{"rank":3,"rankType":2,"rankValue":"2","recType":0,"songId":396659209,"vid":"","albumMid":"002XGizC4YJbJA","title":"花好月圆夜","singerName":"Lil Ghost小鬼","singerMid":"003Xf2W10FZgVW","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002XGizC4YJbJA_1.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000001qE1VM0xhw96.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000003WiPvV29Rbib.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000003WiPvV29Rbib.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000001qE1VM0xhw96.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_1_0_7_10005_65","rt":0,"updateTips":"每周更新","bannerText":"","AdShareContent":"国风热歌榜 2023年第9周","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"国风热歌榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001V6BG837lk8c_2.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000004YKayb2IUYXA.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/test_order_channel_hitlist_con/3415269.png","cityName":"","magicColor":{"r":143,"g":160,"b":179},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001V6BG837lk8c_2.jpg","groupType":1,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":58,"recType":10005,"topType":0,"updateType":0,"title":"说唱榜","titleDetail":"说唱榜 第9周","titleShare":"说唱榜 2023年第9周","titleSub":"","intro":"QQ音乐每周播放热度最高的中文说唱歌曲TOP 100，发行期180天内。","cornerMark":0,"period":"2023_9","updateTime":"2023-03-02","history":{"year":[2023,2022,2021,2020,2019,2018],"subPeriod":[[9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[53,52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0],[51,50,49,48,47,46,45,44,43]]},"listenNum":1972830,"totalNum":50,"song":[{"rank":1,"rankType":1,"rankValue":"1","recType":0,"songId":396710011,"vid":"","albumMid":"0027gqTJ2vh1Fz","title":"苦咖啡·唯一","singerName":"那奇沃夫/KKECHO","singerMid":"0043ujuR27z2p8","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M0000027gqTJ2vh1Fz_1.jpg","mvid":0},{"rank":2,"rankType":4,"rankValue":"0","recType":0,"songId":397151765,"vid":"","albumMid":"001zS5Rq1tjEpl","title":"标签 (TITLE)","singerName":"蔡徐坤","singerMid":"002nXp292LIOGV","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001zS5Rq1tjEpl_2.jpg","mvid":0},{"rank":3,"rankType":4,"rankValue":"0","recType":0,"songId":397151764,"vid":"","albumMid":"001zS5Rq1tjEpl","title":"修行 (NARCISSISM)","singerName":"蔡徐坤","singerMid":"002nXp292LIOGV","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001zS5Rq1tjEpl_2.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000004OtdgR2KZNd4.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000002HR36Z05OXqO.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000002HR36Z05OXqO.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000004OtdgR2KZNd4.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_1_0_8_10005_58","rt":0,"updateTips":"每周更新","bannerText":"","AdShareContent":"说唱榜 2023年第9周","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"说唱榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M0000027gqTJ2vh1Fz_1.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000002Y0Hhm3fsx3Z.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/test_order_channel_hitlist_con/3521171.png","cityName":"","magicColor":{"r":166,"g":146,"b":89},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M0000027gqTJ2vh1Fz_1.jpg","groupType":1,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":72,"recType":10005,"topType":0,"updateType":0,"title":"动漫音乐榜","titleDetail":"动漫音乐榜 第9周","titleShare":"动漫音乐榜 2023年第9周","titleSub":"","intro":"QQ音乐每周播放热度最高的动漫音乐TOP 100。","cornerMark":0,"period":"2023_9","updateTime":"2023-03-02","history":{"year":[2023,2022,2021,2020],"subPeriod":[[9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[53,52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23]]},"listenNum":228385,"totalNum":100,"song":[{"rank":1,"rankType":4,"rankValue":"0","recType":0,"songId":398032816,"vid":"","albumMid":"003pwEuU0KJ5y2","title":"遂愿","singerName":"朱心怡/墨绛","singerMid":"003PNtkN1fihtV","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000003pwEuU0KJ5y2_1.jpg","mvid":0},{"rank":2,"rankType":2,"rankValue":"1","recType":0,"songId":392492653,"vid":"","albumMid":"001WQA7L1Ivusz","title":"再见深海 (微亮的瞬间)","singerName":"唐汉霄","singerMid":"001cmj1c1SxuvI","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001WQA7L1Ivusz_1.jpg","mvid":0},{"rank":3,"rankType":2,"rankValue":"1","recType":0,"songId":392423476,"vid":"","albumMid":"001tM8zg0OnQu5","title":"小丑","singerName":"毛不易","singerMid":"001BHDR33FZVZ0","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001tM8zg0OnQu5.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000003Gy4N51GoYIa.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000002YiB6h3N3z2f.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000002YiB6h3N3z2f.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000003Gy4N51GoYIa.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_1_0_10_10005_72","rt":0,"updateTips":"每周更新","bannerText":"","AdShareContent":"动漫音乐榜 2023年第9周","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"动漫音乐榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000003pwEuU0KJ5y2_1.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000001RPF0U2iSyho.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/test_order_channel_hitlist_con/3521168.png","cityName":"","magicColor":{"r":81,"g":49,"b":47},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M000003pwEuU0KJ5y2_1.jpg","groupType":1,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":73,"recType":10005,"topType":0,"updateType":0,"title":"游戏音乐榜","titleDetail":"游戏音乐榜 第9周","titleShare":"游戏音乐榜 2023年第9周","titleSub":"","intro":"QQ音乐每周播放热度最高的游戏音乐TOP 100。","cornerMark":0,"period":"2023_9","updateTime":"2023-03-02","history":{"year":[2023,2022,2021,2020],"subPeriod":[[9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,12,11,10,9,8,7,6,5,4,3,2,1],[53,52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27]]},"listenNum":177801,"totalNum":110,"song":[{"rank":1,"rankType":3,"rankValue":"0","recType":0,"songId":389987990,"vid":"","albumMid":"000ZbDFV3dhEsy","title":"晚风心里吹","singerName":"李克勤","singerMid":"003nS2v740Lxcw","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000000ZbDFV3dhEsy_1.jpg","mvid":0},{"rank":2,"rankType":1,"rankValue":"2","recType":0,"songId":394357953,"vid":"","albumMid":"000uGJVl25kgwL","title":"黎明的光","singerName":"凤凰传奇","singerMid":"0021sRlK1Ge1aY","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000000uGJVl25kgwL_1.jpg","mvid":0},{"rank":3,"rankType":1,"rankValue":"2","recType":0,"songId":396697344,"vid":"","albumMid":"000jWoOG047bUz","title":"逆光之上","singerName":"木兰/王者荣耀","singerMid":"002san701shf9D","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000000jWoOG047bUz.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M0000020RyCu3QJhZG.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000004g3ASt2UX0Pu.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000004g3ASt2UX0Pu.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M0000020RyCu3QJhZG.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_1_0_11_10005_73","rt":0,"updateTips":"每周更新","bannerText":"","AdShareContent":"游戏音乐榜 2023年第9周","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"游戏音乐榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000000ZbDFV3dhEsy_1.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000004XTQU73ZSy5d.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/test_order_channel_hitlist_con/3415278.png","cityName":"","magicColor":{"r":74,"g":57,"b":61},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M000000ZbDFV3dhEsy_1.jpg","groupType":1,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":70,"recType":10005,"topType":0,"updateType":0,"title":"达人音乐榜","titleDetail":"达人音乐榜 第9周","titleShare":"达人音乐榜 2023年第9周","titleSub":"","intro":"QQ音乐最热门的翻唱作品TOP 100，每周更新。","cornerMark":0,"period":"2023_9","updateTime":"2023-03-02","history":{"year":[2023,2022,2021,2020],"subPeriod":[[9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[53,52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1]]},"listenNum":274387,"totalNum":100,"song":[{"rank":1,"rankType":1,"rankValue":"4","recType":0,"songId":396638696,"vid":"","albumMid":"002UEh2X3XXChj","title":"故事还长","singerName":"毒药","singerMid":"004FoadD2bIrf3","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002UEh2X3XXChj_2.jpg","mvid":0},{"rank":2,"rankType":1,"rankValue":"2","recType":0,"songId":395641346,"vid":"","albumMid":"00179ZGH0jBXca","title":"等不来花开","singerName":"行崽ou","singerMid":"000BajmY23jawM","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M00000179ZGH0jBXca.jpg","mvid":0},{"rank":3,"rankType":2,"rankValue":"2","recType":0,"songId":392157334,"vid":"","albumMid":"002uleqc0W3nUO","title":"很任性","singerName":"原始鸡","singerMid":"002MNRBj3VdBB5","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002uleqc0W3nUO.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000000pEgw33XsVoD.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M0000021REED0WNnSc.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M0000021REED0WNnSc.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000000pEgw33XsVoD.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_1_0_12_10005_70","rt":0,"updateTips":"每周更新","bannerText":"","AdShareContent":"达人音乐榜 2023年第9周","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"达人音乐榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002UEh2X3XXChj_2.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000002UrFVU00jP80.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/test_order_channel_hitlist_con/3415280.png","cityName":"","magicColor":{"r":179,"g":125,"b":131},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002UEh2X3XXChj_2.jpg","groupType":1,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":36,"recType":10005,"topType":0,"updateType":0,"title":"K歌金曲榜","titleDetail":"K歌金曲榜 第9周","titleShare":"K歌金曲榜 2023年第9周","titleSub":"","intro":"全民K歌中最热门的50首点唱作品，每周更新。","cornerMark":0,"period":"2023_9","updateTime":"2023-03-02","history":{"year":[2023,2022,2021,2020,2019,2018],"subPeriod":[[9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2],[53,52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[51,50,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,7,6,5,4,3,2,1],[52,48,47,46,45,44,43,42,32,31,30,29,28,27,26,25,24,23,22,21,20,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0]]},"listenNum":519590,"totalNum":55,"song":[{"rank":1,"rankType":1,"rankValue":"1","recType":0,"songId":938054,"vid":"","albumMid":"001AJcVl2JB8DD","title":"如果爱忘了","singerName":"戚薇","singerMid":"002FMuXL1U6ABd","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001AJcVl2JB8DD_1.jpg","mvid":0},{"rank":2,"rankType":2,"rankValue":"1","recType":0,"songId":449200,"vid":"","albumMid":"002Neh8l0uciQZ","title":"说好的幸福呢","singerName":"周杰伦","singerMid":"0025NhlN2yWrP4","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002Neh8l0uciQZ_1.jpg","mvid":0},{"rank":3,"rankType":3,"rankValue":"0","recType":0,"songId":309058164,"vid":"","albumMid":"001fN0ks2oUDvX","title":"这世界那么多人","singerName":"莫文蔚","singerMid":"000cISVf2QqLc6","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001fN0ks2oUDvX.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000000QEW941Tu8WP.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000001iLBBx4LMLBn.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000001iLBBx4LMLBn.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000000QEW941Tu8WP.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_1_0_13_10005_36","rt":0,"updateTips":"每周更新","bannerText":"","AdShareContent":"K歌金曲榜 2023年第9周","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"K歌金曲榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001AJcVl2JB8DD_1.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000000rVFSo12kfhE.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/test_order_channel_hitlist_con/3415649.png","cityName":"","magicColor":{"r":175,"g":143,"b":179},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001AJcVl2JB8DD_1.jpg","groupType":1,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""}],"type":1,"myFeatureButtonText":"","myFeatureButtonScheme":""},{"groupId":3,"groupName":"全球榜","toplist":[{"topId":108,"recType":10005,"topType":1,"updateType":0,"title":"美国公告牌榜","titleDetail":"美国公告牌榜 第9周","titleShare":"美国公告牌榜 2023年第9周","titleSub":"","intro":"Billboard 公告牌Hot 100榜单集结了当下在美国最流行的全风格歌曲，以周为单位计算，根据流媒体播放量，电台播放影响力及线上单曲订购等数据综合而成，经过数十年的改善，如今Billboard榜单已成为音乐界最著名的榜单。","cornerMark":0,"period":"2023_9","updateTime":"2023-03-01","history":{"year":[2023,2022,2021,2020,2019,2018],"subPeriod":[[9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[53,52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,11,10,9,8,7,6,5,4,3,2,1],[53,52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2]]},"listenNum":1930000,"totalNum":100,"song":[{"rank":1,"rankType":0,"rankValue":"","recType":0,"songId":391573225,"vid":"","albumMid":"002TSEYU4QlxeN","title":"Flowers","singerName":"Miley Cyrus","singerMid":"0037uV5A4O7UGj","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002TSEYU4QlxeN_1.jpg","mvid":0},{"rank":2,"rankType":0,"rankValue":"","recType":0,"songId":387630335,"vid":"","albumMid":"002vCSgU21MqhG","title":"Kill Bill","singerName":"SZA","singerMid":"000Y8Ox33WKXcW","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002vCSgU21MqhG.jpg","mvid":0},{"rank":3,"rankType":0,"rankValue":"","recType":0,"songId":392115440,"vid":"","albumMid":"002MVqft0lfm3u","title":"Boy's a liar Pt. 2","singerName":"PinkPantheress/Ice Spice","singerMid":"0014Q4oi07dHIx","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002MVqft0lfm3u.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M0000009U1Tx385ljj.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M0000010qh3o1nSaiw.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M0000010qh3o1nSaiw.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M0000009U1Tx385ljj.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_3_0_1_10005_108","rt":0,"updateTips":"每周更新","bannerText":"","AdShareContent":"美国公告牌榜 2023年第9周","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"美国公告牌榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002TSEYU4QlxeN_1.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000003PEEo41IGPnK.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/t_order_channel_hitlist_conf/4469667.png","cityName":"","magicColor":{"r":0,"g":88,"b":132},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002TSEYU4QlxeN_1.jpg","groupType":1,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":129,"recType":10005,"topType":1,"updateType":0,"title":"韩国Melon榜","titleDetail":"韩国Melon榜 第9周","titleShare":"韩国Melon榜 2023年第9周","titleSub":"","intro":"韩国Melon周榜，每周一更新。","cornerMark":0,"period":"2023_9","updateTime":"2023-02-27","history":{"year":[2023,2022,2021,2020,2019],"subPeriod":[[9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41]]},"listenNum":1919130,"totalNum":100,"song":[{"rank":1,"rankType":0,"rankValue":"","recType":0,"songId":388821920,"vid":"","albumMid":"003dzmv64ez17A","title":"Ditto","singerName":"NewJeans (뉴진스)","singerMid":"001FEs4D2z3CLR","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000003dzmv64ez17A_1.jpg","mvid":0},{"rank":2,"rankType":0,"rankValue":"","recType":0,"songId":390142723,"vid":"","albumMid":"003dzmv64ez17A","title":"OMG","singerName":"NewJeans (뉴진스)","singerMid":"001FEs4D2z3CLR","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000003dzmv64ez17A_1.jpg","mvid":0},{"rank":3,"rankType":0,"rankValue":"","recType":0,"songId":369475641,"vid":"","albumMid":"001fFuNG0R303z","title":"Hype Boy","singerName":"NewJeans (뉴진스)","singerMid":"001FEs4D2z3CLR","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001fFuNG0R303z_1.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000003jyfq94aM95e.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000002rRxar2K1Axt.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000002rRxar2K1Axt.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000003jyfq94aM95e.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_3_0_3_10005_129","rt":0,"updateTips":"每周更新","bannerText":"","AdShareContent":"韩国Melon榜 2023年第9周","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"韩国Melon榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000003dzmv64ez17A_1.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000002COdzS0PFlqu.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/test_order_channel_hitlist_con/3521190.png","cityName":"","magicColor":{"r":34,"g":34,"b":34},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M000003dzmv64ez17A_1.jpg","groupType":1,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":107,"recType":10005,"topType":1,"updateType":0,"title":"英国UK榜","titleDetail":"英国UK榜 第9周","titleShare":"英国UK榜 2023年第9周","titleSub":"","intro":"英国单曲排行榜（UK Singles Chart），是代表英国唱片工业的权威排行榜。排行榜的资讯会刊登在音乐周刊（Music Week）（前75名）、排行榜+（ChartsPlus）（前200名）等杂志上，并公布在各大网站上（通常只列出前40名）。由约6500家唱片零售商和英国网路影音下载业者负责提供销售资料。","cornerMark":0,"period":"2023_9","updateTime":"2023-02-27","history":{"year":[2023,2022,2021,2020,2019,2018,2017],"subPeriod":[[9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[53,52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[52]]},"listenNum":519055,"totalNum":40,"song":[{"rank":1,"rankType":0,"rankValue":"","recType":0,"songId":391573225,"vid":"","albumMid":"002TSEYU4QlxeN","title":"Flowers","singerName":"Miley Cyrus","singerMid":"0037uV5A4O7UGj","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002TSEYU4QlxeN_1.jpg","mvid":0},{"rank":2,"rankType":0,"rankValue":"","recType":0,"songId":386095049,"vid":"","albumMid":"000cgf283U5b8Y","title":"Boy's a liar (Explicit)","singerName":"PinkPantheress","singerMid":"0014Q4oi07dHIx","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000000cgf283U5b8Y.jpg","mvid":0},{"rank":3,"rankType":0,"rankValue":"","recType":0,"songId":387315191,"vid":"","albumMid":"0042OjLx49RUVU","title":"Kill Bill","singerName":"SZA","singerMid":"000Y8Ox33WKXcW","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M0000042OjLx49RUVU_1.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000000xzyNk3gThaB.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000001Vu4f913wr6c.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000001Vu4f913wr6c.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000000xzyNk3gThaB.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_3_0_4_10005_107","rt":0,"updateTips":"每周更新","bannerText":"","AdShareContent":"英国UK榜 2023年第9周","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"英国UK榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002TSEYU4QlxeN_1.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000004YZvjx1LNNj4.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/test_order_channel_hitlist_con/3521189.png","cityName":"","magicColor":{"r":0,"g":88,"b":132},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002TSEYU4QlxeN_1.jpg","groupType":1,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":105,"recType":10005,"topType":1,"updateType":0,"title":"日本公信榜","titleDetail":"日本公信榜 第9周","titleShare":"日本公信榜 2023年第9周","titleSub":"","intro":"日本公信榜，也称为Oricon榜，是由1968年1月4日正式开始的日本最具知名度的音乐排行榜。不论歌曲是以单曲发行，还是被收录在专辑之中，数字单曲榜根据单首歌曲的下载数量计算而成，每周三更新。","cornerMark":0,"period":"2023_9","updateTime":"2023-03-01","history":{"year":[2023,2022,2021,2020,2019,2018,2017],"subPeriod":[[9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[52]]},"listenNum":131040,"totalNum":20,"song":[{"rank":1,"rankType":0,"rankValue":"","recType":0,"songId":395257693,"vid":"","albumMid":"002Rl2KW0K4oja","title":"星月夜","singerName":"由薫 (YU-KA)","singerMid":"000tnLqi3AhaCJ","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002Rl2KW0K4oja_1.jpg","mvid":0},{"rank":2,"rankType":0,"rankValue":"","recType":0,"songId":397036934,"vid":"","albumMid":"001ERwL10aQxl2","title":"アタシは問題作 (I'm a Controversy)","singerName":"Ado","singerMid":"002D5FGW4Ckwyy","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001ERwL10aQxl2.jpg","mvid":0},{"rank":3,"rankType":0,"rankValue":"","recType":0,"songId":382864440,"vid":"","albumMid":"000lYbvE0i2wUg","title":"第ゼロ感 (第零感)","singerName":"10-FEET (テンフィート)","singerMid":"003WmEiL4bovcS","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000000lYbvE0i2wUg.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000000DYIAQ1iojvy.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000003xsmVE1oEPBH.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000003xsmVE1oEPBH.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000000DYIAQ1iojvy.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_3_0_5_10005_105","rt":0,"updateTips":"每周更新","bannerText":"","AdShareContent":"日本公信榜 2023年第9周","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"日本公信榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002Rl2KW0K4oja_1.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000002uzAWq2tgLOB.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/test_order_channel_hitlist_con/3521192.png","cityName":"","magicColor":{"r":118,"g":149,"b":170},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002Rl2KW0K4oja_1.jpg","groupType":1,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":126,"recType":10005,"topType":1,"updateType":0,"title":"JOOX本地热播榜","titleDetail":"JOOX本地热播榜 第9周","titleShare":"JOOX本地热播榜 2023年第9周","titleSub":"","intro":"JOOX本地热播榜，每周四更新。","cornerMark":0,"period":"2023_9","updateTime":"2023-03-03","history":{"year":[2023,2022,2021,2020,2019],"subPeriod":[[9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[53,52,51,50,49,48,47,46,45,44,43,42,41,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,16,15,14,13,12,11,10,9,8,7,6,4,3,2],[52,51,50,49,48,47,46,45,44,43,42,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,6,4,3,2,1],[51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16]]},"listenNum":153429,"totalNum":100,"song":[{"rank":1,"rankType":0,"rankValue":"","recType":0,"songId":397149068,"vid":"","albumMid":"002xTbWy3pI0Kd","title":"Money","singerName":"卢瀚霆","singerMid":"004S2dKn0X9zo8","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002xTbWy3pI0Kd_1.jpg","mvid":0},{"rank":2,"rankType":0,"rankValue":"","recType":0,"songId":395895651,"vid":"","albumMid":"004KO0ZS47j0V7","title":"世一 (不可一世) [feat. Kiri T]","singerName":"MC 张天赋/Kiri T","singerMid":"000Rsto13Lm8hy","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000004KO0ZS47j0V7.jpg","mvid":0},{"rank":3,"rankType":0,"rankValue":"","recType":0,"songId":392059891,"vid":"","albumMid":"0018VqSW0MzqPh","title":"再见 宁静海","singerName":"陈卓贤","singerMid":"000cek150CnNyK","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M0000018VqSW0MzqPh_1.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000003NATbp3NhU1j.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000004Pqy7x31YkJ8.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000004Pqy7x31YkJ8.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000003NATbp3NhU1j.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_3_0_6_10005_126","rt":0,"updateTips":"每周更新","bannerText":"","AdShareContent":"JOOX本地热播榜 2023年第9周","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"JOOX本地热播榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002xTbWy3pI0Kd_1.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000001e9UkX1gxTaY.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/test_order_channel_hitlist_con/3521186.png","cityName":"","magicColor":{"r":47,"g":83,"b":49},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002xTbWy3pI0Kd_1.jpg","groupType":1,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":130,"recType":10005,"topType":1,"updateType":0,"title":"香港TVB劲歌金榜","titleDetail":"香港TVB劲歌金榜 第4周","titleShare":"香港TVB劲歌金榜 2023年第4周","titleSub":"","intro":"\u201c劲歌金榜\u201d是香港TVB专业流行音乐节目《劲歌金曲》中所介绍的榜单，是香港乐坛重要的流行指标之一。每周更新。","cornerMark":0,"period":"2023_4","updateTime":"2023-02-26","history":{"year":[2023,2022,2021],"subPeriod":[[4,3,2,1],[53,52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,6,5,4,3,2,1],[56,55,54,53,52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,21,20,19,18,17,16,15]]},"listenNum":195298,"totalNum":10,"song":[{"rank":1,"rankType":0,"rankValue":"","recType":0,"songId":387216479,"vid":"","albumMid":"00184cXm37RExo","title":"还有事情可庆祝","singerName":"杨千嬅","singerMid":"000xogLP35ayzS","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M00000184cXm37RExo_1.jpg","mvid":0},{"rank":2,"rankType":0,"rankValue":"","recType":0,"songId":391032669,"vid":"","albumMid":"002GnDl21kYE0z","title":"盲婚哑嫁","singerName":"陈奕迅","singerMid":"003Nz2So3XXYek","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002GnDl21kYE0z.jpg","mvid":0},{"rank":3,"rankType":0,"rankValue":"","recType":0,"songId":390702731,"vid":"","albumMid":"001mGzOb4Gww1p","title":"他不是你","singerName":"连诗雅","singerMid":"0018mI054LNj4a","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001mGzOb4Gww1p_1.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000000vYCSl3rqqUQ.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000002u0gyz1tbzqD.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000002u0gyz1tbzqD.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000000vYCSl3rqqUQ.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_3_0_7_10005_130","rt":0,"updateTips":"每周更新","bannerText":"","AdShareContent":"香港TVB劲歌金榜 2023年第4周","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"香港TVB劲歌金榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M00000184cXm37RExo_1.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000002Be6RK1XFdFA.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/test_order_channel_hitlist_con/3866667.png","cityName":"","magicColor":{"r":76,"g":73,"b":44},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M00000184cXm37RExo_1.jpg","groupType":1,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":127,"recType":10005,"topType":1,"updateType":0,"title":"台湾KKBOX榜","titleDetail":"台湾KKBOX榜 第9周","titleShare":"台湾KKBOX榜 2023年第9周","titleSub":"","intro":"台湾KKBOX华语新歌周榜，每周五更新。","cornerMark":0,"period":"2023_9","updateTime":"2023-03-03","history":{"year":[2023,2022,2021,2020,2019],"subPeriod":[[9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[53,52,51,50,49,48,47,46,45,44,43,42,41,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,2],[51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,1]]},"listenNum":163482,"totalNum":49,"song":[{"rank":1,"rankType":0,"rankValue":"","recType":0,"songId":395913312,"vid":"","albumMid":"00071asp12uBIv","title":"一念之间","singerName":"告五人","singerMid":"002pfVN53lKI7x","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M00000071asp12uBIv_1.jpg","mvid":0},{"rank":2,"rankType":0,"rankValue":"","recType":0,"songId":397264896,"vid":"","albumMid":"002coWQe1g5JlM","title":"情勒 GASLIGHT (feat. ØZI) (Explicit)","singerName":"Marz23/ØZI","singerMid":"002HCVEL3pYdix","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002coWQe1g5JlM.jpg","mvid":0},{"rank":3,"rankType":0,"rankValue":"","recType":0,"songId":392700365,"vid":"","albumMid":"000alQXZ2hUlzf","title":"脑袋都是你","singerName":"陈势安","singerMid":"0049u0DR3G9Rgv","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000000alQXZ2hUlzf.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000001k9x6R2WomNI.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M0000027IbII4b8jay.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M0000027IbII4b8jay.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000001k9x6R2WomNI.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_3_0_8_10005_127","rt":0,"updateTips":"每周更新","bannerText":"","AdShareContent":"台湾KKBOX榜 2023年第9周","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"台湾KKBOX榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M00000071asp12uBIv_1.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M0000026tdTP3J15Fq.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/test_order_channel_hitlist_con/3521194.png","cityName":"","magicColor":{"r":183,"g":185,"b":177},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M00000071asp12uBIv_1.jpg","groupType":1,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":128,"recType":10005,"topType":1,"updateType":0,"title":"YouTube音乐排行榜","titleDetail":"YouTube音乐排行榜 第9周","titleShare":"YouTube音乐排行榜 2023年第9周","titleSub":"","intro":"YouTube是一个视频网站，YouTube热门音乐榜是根据歌曲每周在YouTube播放次数进行排名，每周一更新。","cornerMark":0,"period":"2023_9","updateTime":"2023-02-27","history":{"year":[2023,2022,2021,2020,2019],"subPeriod":[[9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15]]},"listenNum":531895,"totalNum":100,"song":[{"rank":1,"rankType":0,"rankValue":"","recType":0,"songId":391573225,"vid":"","albumMid":"002TSEYU4QlxeN","title":"Flowers","singerName":"Miley Cyrus","singerMid":"0037uV5A4O7UGj","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002TSEYU4QlxeN_1.jpg","mvid":0},{"rank":2,"rankType":0,"rankValue":"","recType":0,"songId":392115440,"vid":"","albumMid":"002MVqft0lfm3u","title":"Boy's a liar Pt. 2","singerName":"PinkPantheress/Ice Spice","singerMid":"0014Q4oi07dHIx","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002MVqft0lfm3u.jpg","mvid":0},{"rank":3,"rankType":0,"rankValue":"","recType":0,"songId":388410750,"vid":"","albumMid":"0043Mf1723zAWw","title":"Bebe Dame","singerName":"Fuerza Regida/Grupo Frontera","singerMid":"002abt4V1VhND1","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M0000043Mf1723zAWw_1.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000002kOI2l3NDP77.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M0000038HYJQ4QseBR.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M0000038HYJQ4QseBR.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000002kOI2l3NDP77.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_3_0_9_10005_128","rt":0,"updateTips":"每周更新","bannerText":"","AdShareContent":"YouTube音乐排行榜 2023年第9周","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"YouTube音乐排行榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002TSEYU4QlxeN_1.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000001LC3LO0i89jg.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/test_order_channel_hitlist_con/3521188.png","cityName":"","magicColor":{"r":0,"g":88,"b":132},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002TSEYU4QlxeN_1.jpg","groupType":1,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""}],"type":1,"myFeatureButtonText":"","myFeatureButtonScheme":""}],"refreshInterval":1,"abt":""}
             */

            private int code;
            private DataBeanXXXXXXX data;

            public int getCode() {
                return code;
            }

            public void setCode(int code) {
                this.code = code;
            }

            public DataBeanXXXXXXX getData() {
                return data;
            }

            public void setData(DataBeanXXXXXXX data) {
                this.data = data;
            }

            public static class DataBeanXXXXXXX {
                /**
                 * group : [{"groupId":0,"groupName":"巅峰榜","toplist":[{"topId":62,"recType":10005,"topType":0,"updateType":1,"title":"飙升榜","titleDetail":"飙升榜 第62天","titleShare":"飙升榜 2023年第62天","titleSub":"","intro":"QQ音乐站内播放热度飙升最快的前100首歌曲，每日更新。","cornerMark":0,"period":"2023-03-03","updateTime":"2023-03-03","history":{"year":[],"subPeriod":[]},"listenNum":18633712,"totalNum":100,"song":[{"rank":1,"rankType":6,"rankValue":"27%","recType":0,"songId":104948863,"vid":"","albumMid":"000PO0jU10ipSb","title":"想把我唱给你听","singerName":"老狼","singerMid":"002WkEWV1TA75B","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000000PO0jU10ipSb_2.jpg","mvid":0},{"rank":2,"rankType":6,"rankValue":"16%","recType":0,"songId":4826371,"vid":"","albumMid":"001eA2gF0dGeWY","title":"那个女孩","singerName":"陶喆/卢广仲","singerMid":"002cK0F12szD9T","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001eA2gF0dGeWY.jpg","mvid":0},{"rank":3,"rankType":6,"rankValue":"15%","recType":0,"songId":397629060,"vid":"","albumMid":"001V6BG837lk8c","title":"桃花诺","singerName":"旺仔小乔","singerMid":"0045G50v35VUMG","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001V6BG837lk8c_2.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000002lyMnK2SywsI.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000002dXVv60ZUwOo.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000000PO0jU10ipSb.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M0000037mBvq0UzatI.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_1_0_2_10005_62","rt":0,"updateTips":"每日更新","bannerText":"","AdShareContent":"飙升榜 2023年第62天","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"飙升榜","musichallSubtitle":"_11首歌新上榜","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000000PO0jU10ipSb_2.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000001FprJ12I00Ie.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/test_order_channel_hitlist_con/3521138.png","cityName":"","magicColor":{"r":143,"g":151,"b":179},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M000000PO0jU10ipSb_2.jpg","groupType":0,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":26,"recType":10005,"topType":0,"updateType":1,"title":"热歌榜","titleDetail":"热歌榜 第62天","titleShare":"热歌榜 2023年第62天","titleSub":"","intro":"QQ音乐站内播放热度前300首歌曲，每日更新。","cornerMark":0,"period":"2023-03-03","updateTime":"2023-03-03","history":{"year":[],"subPeriod":[]},"listenNum":19100000,"totalNum":300,"song":[{"rank":1,"rankType":3,"rankValue":"0","recType":0,"songId":384263699,"vid":"","albumMid":"002PwL9x3TiVdh","title":"乌梅子酱","singerName":"李荣浩","singerMid":"000aHmbL2aPXWH","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002PwL9x3TiVdh_1.jpg","mvid":0},{"rank":2,"rankType":3,"rankValue":"0","recType":0,"songId":368139519,"vid":"","albumMid":"002HcXA60aeTLD","title":"就让这大雨全都落下","singerName":"容祖儿","singerMid":"001uXFgt1kpLyI","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002HcXA60aeTLD_1.jpg","mvid":0},{"rank":3,"rankType":1,"rankValue":"2","recType":0,"songId":326584182,"vid":"","albumMid":"004Kbn3m2HV9Y3","title":"如愿","singerName":"王菲","singerMid":"000GDDuQ3sGQiT","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000004Kbn3m2HV9Y3_1.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M0000011o0JU32ofbv.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000001c0hSr1R862c.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002PwL9x3TiVdh.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000003Ounnt1W11Tz.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_1_0_3_10005_26","rt":0,"updateTips":"每日更新","bannerText":"","AdShareContent":"热歌榜 2023年第62天","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"热歌榜","musichallSubtitle":"_11首歌新上榜","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002PwL9x3TiVdh_1.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000001txncR3TDZoj.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/test_order_channel_hitlist_con/4348759.png","cityName":"","magicColor":{"r":123,"g":35,"b":4},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002PwL9x3TiVdh_1.jpg","groupType":0,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":27,"recType":10005,"topType":0,"updateType":1,"title":"新歌榜","titleDetail":"新歌榜 第62天","titleShare":"新歌榜 2023年第62天","titleSub":"","intro":"QQ音乐站内播放热度排名前100首新歌，每日更新。","cornerMark":0,"period":"2023-03-03","updateTime":"2023-03-03","history":{"year":[],"subPeriod":[]},"listenNum":165581,"totalNum":100,"song":[{"rank":1,"rankType":3,"rankValue":"0","recType":0,"songId":396710011,"vid":"","albumMid":"0027gqTJ2vh1Fz","title":"苦咖啡·唯一","singerName":"那奇沃夫/KKECHO","singerMid":"0043ujuR27z2p8","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M0000027gqTJ2vh1Fz_1.jpg","mvid":0},{"rank":2,"rankType":3,"rankValue":"0","recType":0,"songId":393949802,"vid":"","albumMid":"000WDNPt4XUrXs","title":"谁","singerName":"曲肖冰","singerMid":"001ZVMXf3ZYVX7","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000000WDNPt4XUrXs_2.jpg","mvid":0},{"rank":3,"rankType":1,"rankValue":"1","recType":0,"songId":396112160,"vid":"","albumMid":"0042mJP52iOjn5","title":"忘了","singerName":"周林枫","singerMid":"002LlLHa3jSdoa","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M0000042mJP52iOjn5_2.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000004VcMwE2rNG9p.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M0000015hl0K4VWnJd.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M0000027gqTJ2vh1Fz.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M0000002xW8j2OPQhZ.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_1_0_4_10005_27","rt":0,"updateTips":"每日更新","bannerText":"","AdShareContent":"新歌榜 2023年第62天","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"新歌榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M0000027gqTJ2vh1Fz_1.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000001vYgwU0VGAg3.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/test_order_channel_hitlist_con/3521143.png","cityName":"","magicColor":{"r":166,"g":146,"b":89},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M0000027gqTJ2vh1Fz_1.jpg","groupType":0,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":4,"recType":10005,"topType":0,"updateType":1,"title":"流行指数榜","titleDetail":"流行指数榜 第62天","titleShare":"流行指数榜 2023年第62天","titleSub":"","intro":"QQ音乐站内播放相对涨幅排名前100首歌曲，每日更新。","cornerMark":0,"period":"2023-03-03","updateTime":"2023-03-03","history":{"year":[],"subPeriod":[]},"listenNum":7953220,"totalNum":100,"song":[{"rank":1,"rankType":6,"rankValue":"125%","recType":0,"songId":397629060,"vid":"","albumMid":"001V6BG837lk8c","title":"桃花诺","singerName":"旺仔小乔","singerMid":"0045G50v35VUMG","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001V6BG837lk8c_2.jpg","mvid":0},{"rank":2,"rankType":6,"rankValue":"109%","recType":0,"songId":396112160,"vid":"","albumMid":"0042mJP52iOjn5","title":"忘了","singerName":"周林枫","singerMid":"002LlLHa3jSdoa","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M0000042mJP52iOjn5_2.jpg","mvid":0},{"rank":3,"rankType":6,"rankValue":"64%","recType":0,"songId":326584182,"vid":"","albumMid":"004Kbn3m2HV9Y3","title":"如愿","singerName":"王菲","singerMid":"000GDDuQ3sGQiT","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000004Kbn3m2HV9Y3_1.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M0000035Tt4F3UDdrD.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000003tk5iY15Lpv5.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001V6BG837lk8c.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000001xBRF61nMru2.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_1_0_5_10005_4","rt":0,"updateTips":"每日更新","bannerText":"","AdShareContent":"流行指数榜 2023年第62天","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"流行指数榜","musichallSubtitle":"_每日更新","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001V6BG837lk8c_2.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000002ulDjs1n24zg.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/test_order_channel_hitlist_con/3521144.png","cityName":"","magicColor":{"r":143,"g":160,"b":179},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001V6BG837lk8c_2.jpg","groupType":0,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":57,"recType":10005,"topType":0,"updateType":0,"title":"喜力电音榜","titleDetail":"喜力电音榜 第9周","titleShare":"喜力电音榜 2023年第9周","titleSub":"","intro":"QQ音乐播放热度最高的电音歌曲TOP50，每周更新。","cornerMark":0,"period":"2023_9","updateTime":"2023-03-02","history":{"year":[2023,2022,2021,2020,2019,2018],"subPeriod":[[9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[53,52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0],[51,50,49,48,47,46,45,44,43,42,41,40]]},"listenNum":1403255,"totalNum":50,"song":[{"rank":1,"rankType":4,"rankValue":"0","recType":0,"songId":397447822,"vid":"","albumMid":"001d3W0x4DRn3z","title":"Not Cinderella","singerName":"宋雨琦/하이퍼타임","singerMid":"003GgG3V1fkAFf","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001d3W0x4DRn3z_1.jpg","mvid":0},{"rank":2,"rankType":2,"rankValue":"1","recType":0,"songId":394444590,"vid":"","albumMid":"0035N8lV3X7fWw","title":"冰川之泪 Tears from the Ice River","singerName":"Terry Zhong 钟天利/考拉kora","singerMid":"001pW4WY4TWNk4","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M0000035N8lV3X7fWw_4.jpg","mvid":0},{"rank":3,"rankType":1,"rankValue":"2","recType":0,"songId":390980914,"vid":"","albumMid":"0036ZLdt4djv3M","title":"春时·雪梅赋","singerName":"Onism./Bumpÿ/故茕","singerMid":"004RrX0B0WU9fb","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M0000036ZLdt4djv3M.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000001udetC0yeED3.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000002ua5jF0WSlI3.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001d3W0x4DRn3z.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000003uPdgx0Tr0fu.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_1_0_6_10005_57","rt":0,"updateTips":"每周更新","bannerText":"","AdShareContent":"喜力电音榜 2023年第9周","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"喜力电音榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001d3W0x4DRn3z_1.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000000rBoNt0e3vjA.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/t_order_channel_hitlist_conf/4316437.png","cityName":"","magicColor":{"r":27,"g":33,"b":50},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001d3W0x4DRn3z_1.jpg","groupType":0,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":52,"recType":10005,"topType":0,"updateType":1,"title":"腾讯音乐人原创榜","titleDetail":"腾讯音乐人原创榜 第62天","titleShare":"腾讯音乐人原创榜 2023年第62天","titleSub":"","intro":"QQ音乐最新最热的腾讯音乐人原创作品TOP100。","cornerMark":0,"period":"2023-03-03","updateTime":"2023-03-03","history":{"year":[],"subPeriod":[]},"listenNum":215859,"totalNum":100,"song":[{"rank":1,"rankType":1,"rankValue":"13","recType":0,"songId":397275665,"vid":"","albumMid":"003DnOkh2tRqtL","title":"奇妙的我","singerName":"廖麻酱","singerMid":"003OZSqE3uDM1Z","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000003DnOkh2tRqtL_1.jpg","mvid":0},{"rank":2,"rankType":5,"rankValue":"0","recType":0,"songId":397597953,"vid":"","albumMid":"004WNJUO0fGQjD","title":"兀兀","singerName":"陈粒","singerMid":"004WgCsE3KBddt","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000004WNJUO0fGQjD.jpg","mvid":0},{"rank":3,"rankType":5,"rankValue":"0","recType":0,"songId":398282803,"vid":"","albumMid":"000t9S9F0dXtUA","title":"雪 Distance","singerName":"Capper/罗言RollFlash","singerMid":"001eBoUt4SiKgg","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000000t9S9F0dXtUA_1.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000000UNjRp06k6iT.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000000BhdFW29cCO8.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000003DnOkh2tRqtL.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000002r0kOh1bpfdO.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_1_0_8_10005_52","rt":0,"updateTips":"每日更新","bannerText":"","AdShareContent":"腾讯音乐人原创榜 2023年第62天","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"腾讯音乐人原创榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000003DnOkh2tRqtL_1.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000001U2H121SzQdG.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/t_order_channel_hitlist_conf/4118315.png","cityName":"","magicColor":{"r":204,"g":148,"b":110},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M000003DnOkh2tRqtL_1.jpg","groupType":0,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":67,"recType":10005,"topType":0,"updateType":1,"title":"听歌识曲榜","titleDetail":"听歌识曲榜 第62天","titleShare":"听歌识曲榜 2023年第62天","titleSub":"","intro":"QQ音乐用户使用\u201c听歌识曲\u201d功能捕捉热度最高的歌曲TOP100，每日更新。","cornerMark":0,"period":"2023-03-03","updateTime":"2023-03-03","history":{"year":[],"subPeriod":[]},"listenNum":3049800,"totalNum":100,"song":[{"rank":1,"rankType":4,"rankValue":"0","recType":0,"songId":398354303,"vid":"","albumMid":"003UOXP11qKicA","title":"Someone you Loved","singerName":"美二帆","singerMid":"000frQdA07uHz2","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000003UOXP11qKicA_1.jpg","mvid":0},{"rank":2,"rankType":2,"rankValue":"1","recType":0,"songId":357531938,"vid":"","albumMid":"003DFrnj26SMZU","title":"可能","singerName":"程响","singerMid":"003iPzNg35cWzp","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000003DFrnj26SMZU_2.jpg","mvid":0},{"rank":3,"rankType":2,"rankValue":"1","recType":0,"songId":396710011,"vid":"","albumMid":"0027gqTJ2vh1Fz","title":"苦咖啡·唯一","singerName":"那奇沃夫/KKECHO","singerMid":"0043ujuR27z2p8","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M0000027gqTJ2vh1Fz_1.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000001MJT9r3EsWba.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000002zuUdq4Y5Ny6.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000003UOXP11qKicA.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000004fFtpg1f7i4K.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_1_0_10_10005_67","rt":0,"updateTips":"每日更新","bannerText":"","AdShareContent":"听歌识曲榜 2023年第62天","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"听歌识曲榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000003UOXP11qKicA_1.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000002KAai41Cm5vP.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/test_order_channel_hitlist_con/3521141.png","cityName":"","magicColor":{"r":179,"g":143,"b":155},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M000003UOXP11qKicA_1.jpg","groupType":0,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":201,"recType":10010,"topType":0,"updateType":1,"title":"MV榜","titleDetail":"MV榜 ","titleShare":"MV榜 ","titleSub":"","intro":"QQ音乐播放得分最高的官方MV TOP排行榜，发行期90天内。","cornerMark":0,"period":"","updateTime":"","history":{"year":[],"subPeriod":[]},"listenNum":1450225,"totalNum":20,"song":[{"rank":1,"rankType":0,"rankValue":"","recType":1,"songId":0,"vid":"001BFqNN1ogb9G","albumMid":"001rb1ah0bFKMo","title":"花开忘忧","singerName":"周深","singerMid":"003fA5G40k6hKc","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001rb1ah0bFKMo_1.jpg","mvid":0},{"rank":2,"rankType":0,"rankValue":"","recType":1,"songId":0,"vid":"0034Z4yM2RG9m0","albumMid":"003zzzm62mna7A","title":"부석순 (SEVENTEEN) '파이팅 해야지 (Feat. 이영지)' Official MV (Choreography Version)","singerName":"BSS/李泳知","singerMid":"001J1wmG2twrzz","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000003zzzm62mna7A.jpg","mvid":0},{"rank":3,"rankType":0,"rankValue":"","recType":1,"songId":0,"vid":"000eCTmM20oytM","albumMid":"004aaud01NY6TC","title":"Hadn't Met You","singerName":"Lil Ghost小鬼","singerMid":"003Xf2W10FZgVW","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000004aaud01NY6TC.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000000R5yK4078ovt.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000003YxgiC3yiWSB.jpg","mbFrontPicUrl":"https://y.gtimg.cn/music/photo_new/T002R300x300M000001rb1ah0bFKMo_1.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M0000005m0me4Gnsq1.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"http://y.qq.com/m/client/v5detail/mv.html?navpage=toplist","h5JumpUrl":"https://y.qq.com/m/client/video_rank_list/index.html","url_key":"v5detail_mv","url_params":"","tjreport":"2_1_0_12_10010_201","rt":0,"updateTips":"每10分钟更新","bannerText":"","AdShareContent":"MV榜 ","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"MV榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001rb1ah0bFKMo_1.jpg","specialScheme":"qqmusic://qq.com/ui/openRN?p=%7B%22key%22%3A%22MvToplist%22%2C%22failoverUrl%22%3A%22https%3A%2F%2Fy.qq.com%2Fm%2Fclient%2Fvideo_rank_list%2Findex.html%22%7D","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T002R300x300M000001rb1ah0bFKMo_1.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common","cityName":"","magicColor":{"r":0,"g":0,"b":0},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001rb1ah0bFKMo_1.jpg","groupType":0,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""}],"type":0,"myFeatureButtonText":"","myFeatureButtonScheme":""},{"groupId":1,"groupName":"地区榜","toplist":[{"topId":5,"recType":10005,"topType":0,"updateType":0,"title":"内地榜","titleDetail":"内地榜 第9周","titleShare":"内地榜 2023年第9周","titleSub":"","intro":"QQ音乐每周播放热度最高的内地歌曲TOP100，发行期为90天内。","cornerMark":0,"period":"2023_9","updateTime":"2023-03-02","history":{"year":[2023,2022,2021,2020,2019,2018],"subPeriod":[[9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[53,52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0],[51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0]]},"listenNum":1409345,"totalNum":100,"song":[{"rank":1,"rankType":1,"rankValue":"6","recType":0,"songId":396710011,"vid":"","albumMid":"0027gqTJ2vh1Fz","title":"苦咖啡·唯一","singerName":"那奇沃夫/KKECHO","singerMid":"0043ujuR27z2p8","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M0000027gqTJ2vh1Fz_1.jpg","mvid":0},{"rank":2,"rankType":4,"rankValue":"0","recType":0,"songId":397789721,"vid":"","albumMid":"000O918O2RmZ00","title":"一起跳舞吧","singerName":"丁程鑫","singerMid":"002J81Pr09yjag","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000000O918O2RmZ00_1.jpg","mvid":0},{"rank":3,"rankType":2,"rankValue":"2","recType":0,"songId":384263699,"vid":"","albumMid":"002PwL9x3TiVdh","title":"乌梅子酱","singerName":"李荣浩","singerMid":"000aHmbL2aPXWH","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002PwL9x3TiVdh_1.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M00000227k6J2F0GAO.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000000wqpDL1FYliN.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000000wqpDL1FYliN.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M00000227k6J2F0GAO.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_1_0_1_10005_5","rt":0,"updateTips":"每周更新","bannerText":"","AdShareContent":"内地榜 2023年第9周","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"内地榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M0000027gqTJ2vh1Fz_1.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000003KqzoQ2Vacb0.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/test_order_channel_hitlist_con/3521162.png","cityName":"","magicColor":{"r":166,"g":146,"b":89},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M0000027gqTJ2vh1Fz_1.jpg","groupType":1,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":59,"recType":10005,"topType":0,"updateType":0,"title":"香港地区榜","titleDetail":"香港地区榜 第9周","titleShare":"香港地区榜 2023年第9周","titleSub":"","intro":"QQ音乐每周播放热度最高的中国香港地区歌曲TOP100，发行期为180天内。","cornerMark":0,"period":"2023_9","updateTime":"2023-03-02","history":{"year":[2023,2022,2021,2020,2019],"subPeriod":[[9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[53,52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13]]},"listenNum":916685,"totalNum":100,"song":[{"rank":1,"rankType":4,"rankValue":"0","recType":0,"songId":397443489,"vid":"","albumMid":"004LFx1H3YpNGW","title":"又十年","singerName":"张学友","singerMid":"004Be55m1SJaLk","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000004LFx1H3YpNGW_1.jpg","mvid":0},{"rank":2,"rankType":2,"rankValue":"1","recType":0,"songId":368139519,"vid":"","albumMid":"002HcXA60aeTLD","title":"就让这大雨全都落下","singerName":"容祖儿","singerMid":"001uXFgt1kpLyI","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002HcXA60aeTLD_1.jpg","mvid":0},{"rank":3,"rankType":3,"rankValue":"0","recType":0,"songId":389987990,"vid":"","albumMid":"000ZbDFV3dhEsy","title":"晚风心里吹","singerName":"李克勤","singerMid":"003nS2v740Lxcw","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000000ZbDFV3dhEsy_1.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000002m2j883EjG93.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000003bLFg53vTTiw.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000003bLFg53vTTiw.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000002m2j883EjG93.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_1_0_2_10005_59","rt":0,"updateTips":"每周更新","bannerText":"","AdShareContent":"香港地区榜 2023年第9周","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"香港地区榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000004LFx1H3YpNGW_1.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000003xAnYY0Ya6hy.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/test_order_channel_hitlist_con/3415283.png","cityName":"","magicColor":{"r":125,"g":174,"b":179},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M000004LFx1H3YpNGW_1.jpg","groupType":1,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":61,"recType":10005,"topType":0,"updateType":0,"title":"台湾地区榜","titleDetail":"台湾地区榜 第9周","titleShare":"台湾地区榜 2023年第9周","titleSub":"","intro":"QQ音乐每周播放热度最高的中国台湾地区歌曲TOP100，发行期为90天内。","cornerMark":0,"period":"2023_9","updateTime":"2023-03-02","history":{"year":[2023,2022,2021,2020,2019],"subPeriod":[[9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[53,52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15]]},"listenNum":252296,"totalNum":100,"song":[{"rank":1,"rankType":3,"rankValue":"0","recType":0,"songId":393960841,"vid":"","albumMid":"001qbyMM2byl8Q","title":"达尔文","singerName":"林俊杰","singerMid":"001BLpXF2DyJe2","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001qbyMM2byl8Q_1.jpg","mvid":0},{"rank":2,"rankType":1,"rankValue":"1","recType":0,"songId":393959368,"vid":"","albumMid":"003KCM1p2gta6y","title":"想见你想见你想见你","singerName":"林俊杰","singerMid":"001BLpXF2DyJe2","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000003KCM1p2gta6y_1.jpg","mvid":0},{"rank":3,"rankType":2,"rankValue":"1","recType":0,"songId":393960843,"vid":"","albumMid":"001qbyMM2byl8Q","title":"那女孩对我说","singerName":"林俊杰","singerMid":"001BLpXF2DyJe2","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001qbyMM2byl8Q_1.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M0000016NbPK3FkdkT.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000004WRTWx2VAjuu.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000004WRTWx2VAjuu.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M0000016NbPK3FkdkT.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_1_0_3_10005_61","rt":0,"updateTips":"每周更新","bannerText":"","AdShareContent":"台湾地区榜 2023年第9周","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"台湾地区榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001qbyMM2byl8Q_1.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000003GdHnA3DwOAl.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/test_order_channel_hitlist_con/3415643.png","cityName":"","magicColor":{"r":52,"g":61,"b":90},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001qbyMM2byl8Q_1.jpg","groupType":1,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":3,"recType":10005,"topType":0,"updateType":0,"title":"欧美榜","titleDetail":"欧美榜 第9周","titleShare":"欧美榜 2023年第9周","titleSub":"","intro":"QQ音乐每周播放热度最高的欧美地区歌曲TOP 100，发行期为30天内。","cornerMark":0,"period":"2023_9","updateTime":"2023-03-02","history":{"year":[2023,2022,2021,2020,2019,2018],"subPeriod":[[9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[53,52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0],[51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0]]},"listenNum":1960000,"totalNum":100,"song":[{"rank":1,"rankType":4,"rankValue":"0","recType":0,"songId":397802275,"vid":"","albumMid":"001LI42s2QNkL6","title":"Die For You (Remix)","singerName":"The Weeknd/Ariana Grande","singerMid":"004YnseG2vQN7h","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001LI42s2QNkL6_1.jpg","mvid":0},{"rank":2,"rankType":4,"rankValue":"0","recType":0,"songId":395635270,"vid":"","albumMid":"0026Q7RE0dAvUl","title":"My Stupid Heart (Kids Version)","singerName":"Walk Off the Earth/Luminati Suns","singerMid":"002RXUq04F4DHF","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M0000026Q7RE0dAvUl.jpg","mvid":0},{"rank":3,"rankType":4,"rankValue":"0","recType":0,"songId":393602333,"vid":"","albumMid":"0017wKtn0lTtaq","title":"Body Rock","singerName":"Mike Candys","singerMid":"001GxgEP0IlucW","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M0000017wKtn0lTtaq.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000001Kolpa2KTgqQ.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000001yJ2ig49cYQX.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000001yJ2ig49cYQX.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000001Kolpa2KTgqQ.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_1_0_4_10005_3","rt":0,"updateTips":"每周更新","bannerText":"","AdShareContent":"欧美榜 2023年第9周","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"欧美榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001LI42s2QNkL6_1.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000001ma3Qn3cbthw.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/test_order_channel_hitlist_con/3521170.png","cityName":"","magicColor":{"r":204,"g":3,"b":2},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001LI42s2QNkL6_1.jpg","groupType":1,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":16,"recType":10005,"topType":0,"updateType":0,"title":"韩国榜","titleDetail":"韩国榜 第9周","titleShare":"韩国榜 2023年第9周","titleSub":"","intro":"QQ音乐每周播放热度最高的韩国地区歌曲TOP 100，发行期为90天内。","cornerMark":0,"period":"2023_9","updateTime":"2023-03-02","history":{"year":[2023,2022,2021,2020,2019,2018],"subPeriod":[[9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[53,52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0],[51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0]]},"listenNum":1817220,"totalNum":100,"song":[{"rank":1,"rankType":3,"rankValue":"0","recType":0,"songId":388821920,"vid":"","albumMid":"003dzmv64ez17A","title":"Ditto","singerName":"NewJeans (뉴진스)","singerMid":"001FEs4D2z3CLR","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000003dzmv64ez17A_1.jpg","mvid":0},{"rank":2,"rankType":3,"rankValue":"0","recType":0,"songId":390142723,"vid":"","albumMid":"003dzmv64ez17A","title":"OMG","singerName":"NewJeans (뉴진스)","singerMid":"001FEs4D2z3CLR","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000003dzmv64ez17A_1.jpg","mvid":0},{"rank":3,"rankType":1,"rankValue":"2","recType":0,"songId":392497445,"vid":"","albumMid":"003bWZsB2mEkFY","title":"MOONLIGHT SUNRISE","singerName":"TWICE (트와이스)","singerMid":"001p0vF44ewiwB","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000003bWZsB2mEkFY.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000002q7ZBy3QNak2.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000003XQBFb4TSjv0.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000003XQBFb4TSjv0.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000002q7ZBy3QNak2.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_1_0_5_10005_16","rt":0,"updateTips":"每周更新","bannerText":"","AdShareContent":"韩国榜 2023年第9周","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"韩国榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000003dzmv64ez17A_1.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000001fvswc2w8VGv.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/test_order_channel_hitlist_con/3521166.png","cityName":"","magicColor":{"r":34,"g":34,"b":34},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M000003dzmv64ez17A_1.jpg","groupType":1,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":17,"recType":10005,"topType":0,"updateType":0,"title":"日本榜","titleDetail":"日本榜 第9周","titleShare":"日本榜 2023年第9周","titleSub":"","intro":"QQ音乐每周播放热度最高的日本地区歌曲TOP 100，发行期为180天内。","cornerMark":0,"period":"2023_9","updateTime":"2023-03-02","history":{"year":[2023,2022,2021,2020,2019,2018],"subPeriod":[[9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[53,52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0],[51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0]]},"listenNum":526960,"totalNum":100,"song":[{"rank":1,"rankType":3,"rankValue":"0","recType":0,"songId":395409948,"vid":"","albumMid":"00044qw50t0Qdb","title":"アドベンチャー (冒险)","singerName":"YOASOBI (ヨアソビ)","singerMid":"001Erp1x1jDOoQ","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M00000044qw50t0Qdb_1.jpg","mvid":0},{"rank":2,"rankType":4,"rankValue":"0","recType":0,"songId":397251474,"vid":"","albumMid":"0015G8kF1AIPsj","title":"Easy come, easy go","singerName":"FANTASTICS from EXILE TRIBE (ファンタスティックス)","singerMid":"000YlVzJ3nc675","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M0000015G8kF1AIPsj.jpg","mvid":0},{"rank":3,"rankType":4,"rankValue":"0","recType":0,"songId":396247057,"vid":"","albumMid":"002xsaRF4IlqUE","title":"crossovers","singerName":"Aimer (エメ)","singerMid":"0039EKtl4ec7wv","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002xsaRF4IlqUE.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000002bg4oG0xDWdG.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000000wctsP2uWE9d.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000000wctsP2uWE9d.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000002bg4oG0xDWdG.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_1_0_6_10005_17","rt":0,"updateTips":"每周更新","bannerText":"","AdShareContent":"日本榜 2023年第9周","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"日本榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M00000044qw50t0Qdb_1.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000003nbtBu0rcJhs.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/test_order_channel_hitlist_con/3521167.png","cityName":"","magicColor":{"r":204,"g":85,"b":159},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M00000044qw50t0Qdb_1.jpg","groupType":1,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""}],"type":1,"myFeatureButtonText":"","myFeatureButtonScheme":""},{"groupId":2,"groupName":"特色榜","toplist":[{"topId":28,"recType":10005,"topType":0,"updateType":0,"title":"网络歌曲榜","titleDetail":"网络歌曲榜 第9周","titleShare":"网络歌曲榜 2023年第9周","titleSub":"","intro":"QQ音乐播放热度最高网络歌曲TOP 100，每周更新。","cornerMark":0,"period":"2023_9","updateTime":"2023-03-02","history":{"year":[2023,2022,2021,2020,2019,2018],"subPeriod":[[9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[53,52,51,50,49,48,47,46,45,44,43,42,41,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,0],[51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0]]},"listenNum":3106500,"totalNum":100,"song":[{"rank":1,"rankType":3,"rankValue":"0","recType":0,"songId":395444421,"vid":"","albumMid":"002GGV7X2BYwde","title":"人生的道场","singerName":"魏佳艺","singerMid":"002fAf8s2nwDgu","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002GGV7X2BYwde_2.jpg","mvid":0},{"rank":2,"rankType":3,"rankValue":"0","recType":0,"songId":395463211,"vid":"","albumMid":"000S7U533pd8KZ","title":"感谢有你陪在我身旁","singerName":"薛朋朋/古文豪/左文正","singerMid":"0034EH151w7FdC","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000000S7U533pd8KZ_1.jpg","mvid":0},{"rank":3,"rankType":1,"rankValue":"5","recType":0,"songId":395716808,"vid":"","albumMid":"001xtDh434BKdx","title":"生于人间何罪之有","singerName":"魏佳艺","singerMid":"002fAf8s2nwDgu","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001xtDh434BKdx_1.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000001abDah1bKEZb.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000000b5kax3tEvek.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000000b5kax3tEvek.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000001abDah1bKEZb.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_1_0_1_10005_28","rt":0,"updateTips":"每周更新","bannerText":"","AdShareContent":"网络歌曲榜 2023年第9周","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"网络歌曲榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002GGV7X2BYwde_2.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000000G2dBV1SOaNU.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/test_order_channel_hitlist_con/3415252.png","cityName":"","magicColor":{"r":125,"g":153,"b":179},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002GGV7X2BYwde_2.jpg","groupType":1,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":63,"recType":10005,"topType":0,"updateType":0,"title":"DJ舞曲榜","titleDetail":"DJ舞曲榜 第9周","titleShare":"DJ舞曲榜 2023年第9周","titleSub":"","intro":"QQ音乐播放热度最高的DJ舞曲TOP 100，每周更新。","cornerMark":0,"period":"2023_9","updateTime":"2023-03-02","history":{"year":[2023,2022,2021,2020],"subPeriod":[[9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[53,52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16]]},"listenNum":9648220,"totalNum":100,"song":[{"rank":1,"rankType":4,"rankValue":"0","recType":0,"songId":396252082,"vid":"","albumMid":"000zA0Is0GvcqU","title":"后来没有了我们 (后来的你在哪)","singerName":"树泽","singerMid":"000aoHvu0vx0G9","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000000zA0Is0GvcqU_1.jpg","mvid":0},{"rank":2,"rankType":5,"rankValue":"0","recType":0,"songId":376033339,"vid":"","albumMid":"004cFRQL48FrdU","title":"我们不再是从前 (女版)","singerName":"唐艺","singerMid":"002nsWqw39lyxT","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000004cFRQL48FrdU.jpg","mvid":0},{"rank":3,"rankType":4,"rankValue":"0","recType":0,"songId":393743783,"vid":"","albumMid":"0009phh644SE5p","title":"请你留在我身边","singerName":"陆左左","singerMid":"002lgaBm0C4n18","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M0000009phh644SE5p.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000001XWzYt3duuRP.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M0000046ilyy1JFd7O.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M0000046ilyy1JFd7O.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000001XWzYt3duuRP.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_1_0_2_10005_63","rt":0,"updateTips":"每周更新","bannerText":"","AdShareContent":"DJ舞曲榜 2023年第9周","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"DJ舞曲榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000000zA0Is0GvcqU_1.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000002PGjeH2STMGF.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/test_order_channel_hitlist_con/3415648.png","cityName":"","magicColor":{"r":21,"g":26,"b":35},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M000000zA0Is0GvcqU_1.jpg","groupType":1,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":60,"recType":10005,"topType":0,"updateType":0,"title":"抖快榜","titleDetail":"抖快榜 第9周","titleShare":"抖快榜 2023年第9周","titleSub":"","intro":"当下最流行的短视频热歌TOP 100，每周更新。","cornerMark":0,"period":"2023_9","updateTime":"2023-03-02","history":{"year":[2023,2022,2021,2020,2019],"subPeriod":[[9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[53,52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13]]},"listenNum":4539160,"totalNum":100,"song":[{"rank":1,"rankType":3,"rankValue":"0","recType":0,"songId":384263699,"vid":"","albumMid":"002PwL9x3TiVdh","title":"乌梅子酱","singerName":"李荣浩","singerMid":"000aHmbL2aPXWH","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002PwL9x3TiVdh_1.jpg","mvid":0},{"rank":2,"rankType":1,"rankValue":"3","recType":0,"songId":357531938,"vid":"","albumMid":"003DFrnj26SMZU","title":"可能","singerName":"程响","singerMid":"003iPzNg35cWzp","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000003DFrnj26SMZU_2.jpg","mvid":0},{"rank":3,"rankType":3,"rankValue":"0","recType":0,"songId":202553248,"vid":"","albumMid":"000Vk6tG2kuHDU","title":"桃花诺","singerName":"G.E.M. 邓紫棋","singerMid":"001fNHEf1SFEFN","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000000Vk6tG2kuHDU_1.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000003TWwxC1WYg1S.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000000efxxP1ctsMp.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000000efxxP1ctsMp.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000003TWwxC1WYg1S.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_1_0_4_10005_60","rt":0,"updateTips":"每周更新","bannerText":"","AdShareContent":"抖快榜 2023年第9周","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"抖快榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002PwL9x3TiVdh_1.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000001NZK711Zk9rU.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/test_order_channel_hitlist_con/4262142.png","cityName":"","magicColor":{"r":123,"g":35,"b":4},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002PwL9x3TiVdh_1.jpg","groupType":1,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":64,"recType":10005,"topType":0,"updateType":0,"title":"综艺新歌榜","titleDetail":"综艺新歌榜 第9周","titleShare":"综艺新歌榜 2023年第9周","titleSub":"","intro":"QQ音乐每周播放热度最高的综艺歌曲TOP 100，发行期为180天内。","cornerMark":0,"period":"2023_9","updateTime":"2023-03-02","history":{"year":[2023,2022,2021,2020,2019],"subPeriod":[[9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[53,52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[51,50,49,48,47,46,45,44,43,42,41,40,39,38,37]]},"listenNum":623105,"totalNum":100,"song":[{"rank":1,"rankType":4,"rankValue":"0","recType":0,"songId":397841583,"vid":"","albumMid":"004Z06mG0xCAd1","title":"逆光 (Live)","singerName":"张真源","singerMid":"000c1x452OEKGL","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000004Z06mG0xCAd1_2.jpg","mvid":0},{"rank":2,"rankType":4,"rankValue":"0","recType":0,"songId":397246914,"vid":"","albumMid":"002CLgLY0YRdJd","title":"芽","singerName":"周深","singerMid":"003fA5G40k6hKc","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002CLgLY0YRdJd.jpg","mvid":0},{"rank":3,"rankType":2,"rankValue":"2","recType":0,"songId":396683024,"vid":"","albumMid":"000IhwSe2Ubv4n","title":"水姻缘 (Live)","singerName":"周深","singerMid":"003fA5G40k6hKc","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000000IhwSe2Ubv4n_2.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000003Rydlm1w7DT0.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000003I8Qds1gQdL2.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000003I8Qds1gQdL2.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000003Rydlm1w7DT0.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_1_0_5_10005_64","rt":0,"updateTips":"每周更新","bannerText":"","AdShareContent":"综艺新歌榜 2023年第9周","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"综艺新歌榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000004Z06mG0xCAd1_2.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000001L4btW2WqFeM.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/test_order_channel_hitlist_con/3415268.png","cityName":"","magicColor":{"r":115,"g":58,"b":0},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M000004Z06mG0xCAd1_2.jpg","groupType":1,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":29,"recType":10005,"topType":0,"updateType":0,"title":"影视金曲榜","titleDetail":"影视金曲榜 第9周","titleShare":"影视金曲榜 2023年第9周","titleSub":"","intro":"QQ音乐每周播放热度最高的影视歌曲TOP 100，发行期90天内。","cornerMark":0,"period":"2023_9","updateTime":"2023-03-02","history":{"year":[2023,2022,2021,2020,2019,2018],"subPeriod":[[9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[53,52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,3,2,1],[51,50,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,32,31,30,29,28,27,26,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0],[51,50,49,48,47,46,45,44,43,42,41,40,39,37,36,35,34,33,32,29,28,27,26,25,24,23,22,21,20,19,18,17,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0]]},"listenNum":519887,"totalNum":100,"song":[{"rank":1,"rankType":3,"rankValue":"0","recType":0,"songId":389979699,"vid":"","albumMid":"004fOpm21zKAMy","title":"去有风的地方","singerName":"郁可唯","singerMid":"000NUoMp2WAEpO","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000004fOpm21zKAMy_2.jpg","mvid":0},{"rank":2,"rankType":4,"rankValue":"0","recType":0,"songId":397455169,"vid":"","albumMid":"000WTmUr0ErncG","title":"念念不忘","singerName":"张靓颖","singerMid":"000aw4WC2EQYTv","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000000WTmUr0ErncG.jpg","mvid":0},{"rank":3,"rankType":2,"rankValue":"1","recType":0,"songId":391610675,"vid":"","albumMid":"000DWU8N34e5Dr","title":"人是_","singerName":"周深","singerMid":"003fA5G40k6hKc","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000000DWU8N34e5Dr.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000001XLWOb45PVBi.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000004Aflqr3wvlfU.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000004Aflqr3wvlfU.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000001XLWOb45PVBi.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_1_0_6_10005_29","rt":0,"updateTips":"每周更新","bannerText":"","AdShareContent":"影视金曲榜 2023年第9周","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"影视金曲榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000004fOpm21zKAMy_2.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000004Ks5Og1HX5s2.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/test_order_channel_hitlist_con/3415257.png","cityName":"","magicColor":{"r":91,"g":84,"b":46},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M000004fOpm21zKAMy_2.jpg","groupType":1,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":65,"recType":10005,"topType":0,"updateType":0,"title":"国风热歌榜","titleDetail":"国风热歌榜 第9周","titleShare":"国风热歌榜 2023年第9周","titleSub":"","intro":"QQ音乐每周播放热度最高的国风歌曲TOP 100，发行期90天内。","cornerMark":0,"period":"2023_9","updateTime":"2023-03-02","history":{"year":[2023,2022,2021,2020,2019],"subPeriod":[[9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[53,52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[51,50,49,48,47,46,45,44,43,42,41,40,39,38,37]]},"listenNum":1910000,"totalNum":100,"song":[{"rank":1,"rankType":4,"rankValue":"0","recType":0,"songId":397629060,"vid":"","albumMid":"001V6BG837lk8c","title":"桃花诺","singerName":"旺仔小乔","singerMid":"0045G50v35VUMG","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001V6BG837lk8c_2.jpg","mvid":0},{"rank":2,"rankType":4,"rankValue":"0","recType":0,"songId":397470213,"vid":"","albumMid":"001uMAko0Ipuww","title":"朝暮","singerName":"摩登兄弟刘宇宁","singerMid":"001Iu4Dv1NzRCD","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001uMAko0Ipuww_1.jpg","mvid":0},{"rank":3,"rankType":2,"rankValue":"2","recType":0,"songId":396659209,"vid":"","albumMid":"002XGizC4YJbJA","title":"花好月圆夜","singerName":"Lil Ghost小鬼","singerMid":"003Xf2W10FZgVW","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002XGizC4YJbJA_1.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000001qE1VM0xhw96.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000003WiPvV29Rbib.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000003WiPvV29Rbib.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000001qE1VM0xhw96.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_1_0_7_10005_65","rt":0,"updateTips":"每周更新","bannerText":"","AdShareContent":"国风热歌榜 2023年第9周","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"国风热歌榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001V6BG837lk8c_2.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000004YKayb2IUYXA.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/test_order_channel_hitlist_con/3415269.png","cityName":"","magicColor":{"r":143,"g":160,"b":179},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001V6BG837lk8c_2.jpg","groupType":1,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":58,"recType":10005,"topType":0,"updateType":0,"title":"说唱榜","titleDetail":"说唱榜 第9周","titleShare":"说唱榜 2023年第9周","titleSub":"","intro":"QQ音乐每周播放热度最高的中文说唱歌曲TOP 100，发行期180天内。","cornerMark":0,"period":"2023_9","updateTime":"2023-03-02","history":{"year":[2023,2022,2021,2020,2019,2018],"subPeriod":[[9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[53,52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0],[51,50,49,48,47,46,45,44,43]]},"listenNum":1972830,"totalNum":50,"song":[{"rank":1,"rankType":1,"rankValue":"1","recType":0,"songId":396710011,"vid":"","albumMid":"0027gqTJ2vh1Fz","title":"苦咖啡·唯一","singerName":"那奇沃夫/KKECHO","singerMid":"0043ujuR27z2p8","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M0000027gqTJ2vh1Fz_1.jpg","mvid":0},{"rank":2,"rankType":4,"rankValue":"0","recType":0,"songId":397151765,"vid":"","albumMid":"001zS5Rq1tjEpl","title":"标签 (TITLE)","singerName":"蔡徐坤","singerMid":"002nXp292LIOGV","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001zS5Rq1tjEpl_2.jpg","mvid":0},{"rank":3,"rankType":4,"rankValue":"0","recType":0,"songId":397151764,"vid":"","albumMid":"001zS5Rq1tjEpl","title":"修行 (NARCISSISM)","singerName":"蔡徐坤","singerMid":"002nXp292LIOGV","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001zS5Rq1tjEpl_2.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000004OtdgR2KZNd4.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000002HR36Z05OXqO.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000002HR36Z05OXqO.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000004OtdgR2KZNd4.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_1_0_8_10005_58","rt":0,"updateTips":"每周更新","bannerText":"","AdShareContent":"说唱榜 2023年第9周","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"说唱榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M0000027gqTJ2vh1Fz_1.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000002Y0Hhm3fsx3Z.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/test_order_channel_hitlist_con/3521171.png","cityName":"","magicColor":{"r":166,"g":146,"b":89},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M0000027gqTJ2vh1Fz_1.jpg","groupType":1,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":72,"recType":10005,"topType":0,"updateType":0,"title":"动漫音乐榜","titleDetail":"动漫音乐榜 第9周","titleShare":"动漫音乐榜 2023年第9周","titleSub":"","intro":"QQ音乐每周播放热度最高的动漫音乐TOP 100。","cornerMark":0,"period":"2023_9","updateTime":"2023-03-02","history":{"year":[2023,2022,2021,2020],"subPeriod":[[9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[53,52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23]]},"listenNum":228385,"totalNum":100,"song":[{"rank":1,"rankType":4,"rankValue":"0","recType":0,"songId":398032816,"vid":"","albumMid":"003pwEuU0KJ5y2","title":"遂愿","singerName":"朱心怡/墨绛","singerMid":"003PNtkN1fihtV","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000003pwEuU0KJ5y2_1.jpg","mvid":0},{"rank":2,"rankType":2,"rankValue":"1","recType":0,"songId":392492653,"vid":"","albumMid":"001WQA7L1Ivusz","title":"再见深海 (微亮的瞬间)","singerName":"唐汉霄","singerMid":"001cmj1c1SxuvI","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001WQA7L1Ivusz_1.jpg","mvid":0},{"rank":3,"rankType":2,"rankValue":"1","recType":0,"songId":392423476,"vid":"","albumMid":"001tM8zg0OnQu5","title":"小丑","singerName":"毛不易","singerMid":"001BHDR33FZVZ0","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001tM8zg0OnQu5.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000003Gy4N51GoYIa.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000002YiB6h3N3z2f.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000002YiB6h3N3z2f.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000003Gy4N51GoYIa.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_1_0_10_10005_72","rt":0,"updateTips":"每周更新","bannerText":"","AdShareContent":"动漫音乐榜 2023年第9周","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"动漫音乐榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000003pwEuU0KJ5y2_1.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000001RPF0U2iSyho.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/test_order_channel_hitlist_con/3521168.png","cityName":"","magicColor":{"r":81,"g":49,"b":47},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M000003pwEuU0KJ5y2_1.jpg","groupType":1,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":73,"recType":10005,"topType":0,"updateType":0,"title":"游戏音乐榜","titleDetail":"游戏音乐榜 第9周","titleShare":"游戏音乐榜 2023年第9周","titleSub":"","intro":"QQ音乐每周播放热度最高的游戏音乐TOP 100。","cornerMark":0,"period":"2023_9","updateTime":"2023-03-02","history":{"year":[2023,2022,2021,2020],"subPeriod":[[9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,12,11,10,9,8,7,6,5,4,3,2,1],[53,52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27]]},"listenNum":177801,"totalNum":110,"song":[{"rank":1,"rankType":3,"rankValue":"0","recType":0,"songId":389987990,"vid":"","albumMid":"000ZbDFV3dhEsy","title":"晚风心里吹","singerName":"李克勤","singerMid":"003nS2v740Lxcw","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000000ZbDFV3dhEsy_1.jpg","mvid":0},{"rank":2,"rankType":1,"rankValue":"2","recType":0,"songId":394357953,"vid":"","albumMid":"000uGJVl25kgwL","title":"黎明的光","singerName":"凤凰传奇","singerMid":"0021sRlK1Ge1aY","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000000uGJVl25kgwL_1.jpg","mvid":0},{"rank":3,"rankType":1,"rankValue":"2","recType":0,"songId":396697344,"vid":"","albumMid":"000jWoOG047bUz","title":"逆光之上","singerName":"木兰/王者荣耀","singerMid":"002san701shf9D","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000000jWoOG047bUz.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M0000020RyCu3QJhZG.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000004g3ASt2UX0Pu.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000004g3ASt2UX0Pu.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M0000020RyCu3QJhZG.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_1_0_11_10005_73","rt":0,"updateTips":"每周更新","bannerText":"","AdShareContent":"游戏音乐榜 2023年第9周","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"游戏音乐榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000000ZbDFV3dhEsy_1.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000004XTQU73ZSy5d.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/test_order_channel_hitlist_con/3415278.png","cityName":"","magicColor":{"r":74,"g":57,"b":61},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M000000ZbDFV3dhEsy_1.jpg","groupType":1,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":70,"recType":10005,"topType":0,"updateType":0,"title":"达人音乐榜","titleDetail":"达人音乐榜 第9周","titleShare":"达人音乐榜 2023年第9周","titleSub":"","intro":"QQ音乐最热门的翻唱作品TOP 100，每周更新。","cornerMark":0,"period":"2023_9","updateTime":"2023-03-02","history":{"year":[2023,2022,2021,2020],"subPeriod":[[9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[53,52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1]]},"listenNum":274387,"totalNum":100,"song":[{"rank":1,"rankType":1,"rankValue":"4","recType":0,"songId":396638696,"vid":"","albumMid":"002UEh2X3XXChj","title":"故事还长","singerName":"毒药","singerMid":"004FoadD2bIrf3","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002UEh2X3XXChj_2.jpg","mvid":0},{"rank":2,"rankType":1,"rankValue":"2","recType":0,"songId":395641346,"vid":"","albumMid":"00179ZGH0jBXca","title":"等不来花开","singerName":"行崽ou","singerMid":"000BajmY23jawM","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M00000179ZGH0jBXca.jpg","mvid":0},{"rank":3,"rankType":2,"rankValue":"2","recType":0,"songId":392157334,"vid":"","albumMid":"002uleqc0W3nUO","title":"很任性","singerName":"原始鸡","singerMid":"002MNRBj3VdBB5","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002uleqc0W3nUO.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000000pEgw33XsVoD.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M0000021REED0WNnSc.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M0000021REED0WNnSc.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000000pEgw33XsVoD.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_1_0_12_10005_70","rt":0,"updateTips":"每周更新","bannerText":"","AdShareContent":"达人音乐榜 2023年第9周","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"达人音乐榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002UEh2X3XXChj_2.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000002UrFVU00jP80.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/test_order_channel_hitlist_con/3415280.png","cityName":"","magicColor":{"r":179,"g":125,"b":131},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002UEh2X3XXChj_2.jpg","groupType":1,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":36,"recType":10005,"topType":0,"updateType":0,"title":"K歌金曲榜","titleDetail":"K歌金曲榜 第9周","titleShare":"K歌金曲榜 2023年第9周","titleSub":"","intro":"全民K歌中最热门的50首点唱作品，每周更新。","cornerMark":0,"period":"2023_9","updateTime":"2023-03-02","history":{"year":[2023,2022,2021,2020,2019,2018],"subPeriod":[[9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2],[53,52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[51,50,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,7,6,5,4,3,2,1],[52,48,47,46,45,44,43,42,32,31,30,29,28,27,26,25,24,23,22,21,20,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0]]},"listenNum":519590,"totalNum":55,"song":[{"rank":1,"rankType":1,"rankValue":"1","recType":0,"songId":938054,"vid":"","albumMid":"001AJcVl2JB8DD","title":"如果爱忘了","singerName":"戚薇","singerMid":"002FMuXL1U6ABd","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001AJcVl2JB8DD_1.jpg","mvid":0},{"rank":2,"rankType":2,"rankValue":"1","recType":0,"songId":449200,"vid":"","albumMid":"002Neh8l0uciQZ","title":"说好的幸福呢","singerName":"周杰伦","singerMid":"0025NhlN2yWrP4","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002Neh8l0uciQZ_1.jpg","mvid":0},{"rank":3,"rankType":3,"rankValue":"0","recType":0,"songId":309058164,"vid":"","albumMid":"001fN0ks2oUDvX","title":"这世界那么多人","singerName":"莫文蔚","singerMid":"000cISVf2QqLc6","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001fN0ks2oUDvX.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000000QEW941Tu8WP.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000001iLBBx4LMLBn.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000001iLBBx4LMLBn.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000000QEW941Tu8WP.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_1_0_13_10005_36","rt":0,"updateTips":"每周更新","bannerText":"","AdShareContent":"K歌金曲榜 2023年第9周","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"K歌金曲榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001AJcVl2JB8DD_1.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000000rVFSo12kfhE.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/test_order_channel_hitlist_con/3415649.png","cityName":"","magicColor":{"r":175,"g":143,"b":179},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001AJcVl2JB8DD_1.jpg","groupType":1,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""}],"type":1,"myFeatureButtonText":"","myFeatureButtonScheme":""},{"groupId":3,"groupName":"全球榜","toplist":[{"topId":108,"recType":10005,"topType":1,"updateType":0,"title":"美国公告牌榜","titleDetail":"美国公告牌榜 第9周","titleShare":"美国公告牌榜 2023年第9周","titleSub":"","intro":"Billboard 公告牌Hot 100榜单集结了当下在美国最流行的全风格歌曲，以周为单位计算，根据流媒体播放量，电台播放影响力及线上单曲订购等数据综合而成，经过数十年的改善，如今Billboard榜单已成为音乐界最著名的榜单。","cornerMark":0,"period":"2023_9","updateTime":"2023-03-01","history":{"year":[2023,2022,2021,2020,2019,2018],"subPeriod":[[9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[53,52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,11,10,9,8,7,6,5,4,3,2,1],[53,52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2]]},"listenNum":1930000,"totalNum":100,"song":[{"rank":1,"rankType":0,"rankValue":"","recType":0,"songId":391573225,"vid":"","albumMid":"002TSEYU4QlxeN","title":"Flowers","singerName":"Miley Cyrus","singerMid":"0037uV5A4O7UGj","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002TSEYU4QlxeN_1.jpg","mvid":0},{"rank":2,"rankType":0,"rankValue":"","recType":0,"songId":387630335,"vid":"","albumMid":"002vCSgU21MqhG","title":"Kill Bill","singerName":"SZA","singerMid":"000Y8Ox33WKXcW","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002vCSgU21MqhG.jpg","mvid":0},{"rank":3,"rankType":0,"rankValue":"","recType":0,"songId":392115440,"vid":"","albumMid":"002MVqft0lfm3u","title":"Boy's a liar Pt. 2","singerName":"PinkPantheress/Ice Spice","singerMid":"0014Q4oi07dHIx","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002MVqft0lfm3u.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M0000009U1Tx385ljj.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M0000010qh3o1nSaiw.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M0000010qh3o1nSaiw.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M0000009U1Tx385ljj.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_3_0_1_10005_108","rt":0,"updateTips":"每周更新","bannerText":"","AdShareContent":"美国公告牌榜 2023年第9周","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"美国公告牌榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002TSEYU4QlxeN_1.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000003PEEo41IGPnK.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/t_order_channel_hitlist_conf/4469667.png","cityName":"","magicColor":{"r":0,"g":88,"b":132},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002TSEYU4QlxeN_1.jpg","groupType":1,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":129,"recType":10005,"topType":1,"updateType":0,"title":"韩国Melon榜","titleDetail":"韩国Melon榜 第9周","titleShare":"韩国Melon榜 2023年第9周","titleSub":"","intro":"韩国Melon周榜，每周一更新。","cornerMark":0,"period":"2023_9","updateTime":"2023-02-27","history":{"year":[2023,2022,2021,2020,2019],"subPeriod":[[9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41]]},"listenNum":1919130,"totalNum":100,"song":[{"rank":1,"rankType":0,"rankValue":"","recType":0,"songId":388821920,"vid":"","albumMid":"003dzmv64ez17A","title":"Ditto","singerName":"NewJeans (뉴진스)","singerMid":"001FEs4D2z3CLR","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000003dzmv64ez17A_1.jpg","mvid":0},{"rank":2,"rankType":0,"rankValue":"","recType":0,"songId":390142723,"vid":"","albumMid":"003dzmv64ez17A","title":"OMG","singerName":"NewJeans (뉴진스)","singerMid":"001FEs4D2z3CLR","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000003dzmv64ez17A_1.jpg","mvid":0},{"rank":3,"rankType":0,"rankValue":"","recType":0,"songId":369475641,"vid":"","albumMid":"001fFuNG0R303z","title":"Hype Boy","singerName":"NewJeans (뉴진스)","singerMid":"001FEs4D2z3CLR","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001fFuNG0R303z_1.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000003jyfq94aM95e.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000002rRxar2K1Axt.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000002rRxar2K1Axt.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000003jyfq94aM95e.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_3_0_3_10005_129","rt":0,"updateTips":"每周更新","bannerText":"","AdShareContent":"韩国Melon榜 2023年第9周","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"韩国Melon榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000003dzmv64ez17A_1.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000002COdzS0PFlqu.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/test_order_channel_hitlist_con/3521190.png","cityName":"","magicColor":{"r":34,"g":34,"b":34},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M000003dzmv64ez17A_1.jpg","groupType":1,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":107,"recType":10005,"topType":1,"updateType":0,"title":"英国UK榜","titleDetail":"英国UK榜 第9周","titleShare":"英国UK榜 2023年第9周","titleSub":"","intro":"英国单曲排行榜（UK Singles Chart），是代表英国唱片工业的权威排行榜。排行榜的资讯会刊登在音乐周刊（Music Week）（前75名）、排行榜+（ChartsPlus）（前200名）等杂志上，并公布在各大网站上（通常只列出前40名）。由约6500家唱片零售商和英国网路影音下载业者负责提供销售资料。","cornerMark":0,"period":"2023_9","updateTime":"2023-02-27","history":{"year":[2023,2022,2021,2020,2019,2018,2017],"subPeriod":[[9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[53,52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[52]]},"listenNum":519055,"totalNum":40,"song":[{"rank":1,"rankType":0,"rankValue":"","recType":0,"songId":391573225,"vid":"","albumMid":"002TSEYU4QlxeN","title":"Flowers","singerName":"Miley Cyrus","singerMid":"0037uV5A4O7UGj","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002TSEYU4QlxeN_1.jpg","mvid":0},{"rank":2,"rankType":0,"rankValue":"","recType":0,"songId":386095049,"vid":"","albumMid":"000cgf283U5b8Y","title":"Boy's a liar (Explicit)","singerName":"PinkPantheress","singerMid":"0014Q4oi07dHIx","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000000cgf283U5b8Y.jpg","mvid":0},{"rank":3,"rankType":0,"rankValue":"","recType":0,"songId":387315191,"vid":"","albumMid":"0042OjLx49RUVU","title":"Kill Bill","singerName":"SZA","singerMid":"000Y8Ox33WKXcW","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M0000042OjLx49RUVU_1.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000000xzyNk3gThaB.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000001Vu4f913wr6c.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000001Vu4f913wr6c.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000000xzyNk3gThaB.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_3_0_4_10005_107","rt":0,"updateTips":"每周更新","bannerText":"","AdShareContent":"英国UK榜 2023年第9周","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"英国UK榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002TSEYU4QlxeN_1.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000004YZvjx1LNNj4.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/test_order_channel_hitlist_con/3521189.png","cityName":"","magicColor":{"r":0,"g":88,"b":132},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002TSEYU4QlxeN_1.jpg","groupType":1,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":105,"recType":10005,"topType":1,"updateType":0,"title":"日本公信榜","titleDetail":"日本公信榜 第9周","titleShare":"日本公信榜 2023年第9周","titleSub":"","intro":"日本公信榜，也称为Oricon榜，是由1968年1月4日正式开始的日本最具知名度的音乐排行榜。不论歌曲是以单曲发行，还是被收录在专辑之中，数字单曲榜根据单首歌曲的下载数量计算而成，每周三更新。","cornerMark":0,"period":"2023_9","updateTime":"2023-03-01","history":{"year":[2023,2022,2021,2020,2019,2018,2017],"subPeriod":[[9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[52]]},"listenNum":131040,"totalNum":20,"song":[{"rank":1,"rankType":0,"rankValue":"","recType":0,"songId":395257693,"vid":"","albumMid":"002Rl2KW0K4oja","title":"星月夜","singerName":"由薫 (YU-KA)","singerMid":"000tnLqi3AhaCJ","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002Rl2KW0K4oja_1.jpg","mvid":0},{"rank":2,"rankType":0,"rankValue":"","recType":0,"songId":397036934,"vid":"","albumMid":"001ERwL10aQxl2","title":"アタシは問題作 (I'm a Controversy)","singerName":"Ado","singerMid":"002D5FGW4Ckwyy","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001ERwL10aQxl2.jpg","mvid":0},{"rank":3,"rankType":0,"rankValue":"","recType":0,"songId":382864440,"vid":"","albumMid":"000lYbvE0i2wUg","title":"第ゼロ感 (第零感)","singerName":"10-FEET (テンフィート)","singerMid":"003WmEiL4bovcS","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000000lYbvE0i2wUg.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000000DYIAQ1iojvy.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000003xsmVE1oEPBH.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000003xsmVE1oEPBH.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000000DYIAQ1iojvy.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_3_0_5_10005_105","rt":0,"updateTips":"每周更新","bannerText":"","AdShareContent":"日本公信榜 2023年第9周","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"日本公信榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002Rl2KW0K4oja_1.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000002uzAWq2tgLOB.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/test_order_channel_hitlist_con/3521192.png","cityName":"","magicColor":{"r":118,"g":149,"b":170},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002Rl2KW0K4oja_1.jpg","groupType":1,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":126,"recType":10005,"topType":1,"updateType":0,"title":"JOOX本地热播榜","titleDetail":"JOOX本地热播榜 第9周","titleShare":"JOOX本地热播榜 2023年第9周","titleSub":"","intro":"JOOX本地热播榜，每周四更新。","cornerMark":0,"period":"2023_9","updateTime":"2023-03-03","history":{"year":[2023,2022,2021,2020,2019],"subPeriod":[[9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[53,52,51,50,49,48,47,46,45,44,43,42,41,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,16,15,14,13,12,11,10,9,8,7,6,4,3,2],[52,51,50,49,48,47,46,45,44,43,42,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,6,4,3,2,1],[51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16]]},"listenNum":153429,"totalNum":100,"song":[{"rank":1,"rankType":0,"rankValue":"","recType":0,"songId":397149068,"vid":"","albumMid":"002xTbWy3pI0Kd","title":"Money","singerName":"卢瀚霆","singerMid":"004S2dKn0X9zo8","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002xTbWy3pI0Kd_1.jpg","mvid":0},{"rank":2,"rankType":0,"rankValue":"","recType":0,"songId":395895651,"vid":"","albumMid":"004KO0ZS47j0V7","title":"世一 (不可一世) [feat. Kiri T]","singerName":"MC 张天赋/Kiri T","singerMid":"000Rsto13Lm8hy","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000004KO0ZS47j0V7.jpg","mvid":0},{"rank":3,"rankType":0,"rankValue":"","recType":0,"songId":392059891,"vid":"","albumMid":"0018VqSW0MzqPh","title":"再见 宁静海","singerName":"陈卓贤","singerMid":"000cek150CnNyK","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M0000018VqSW0MzqPh_1.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000003NATbp3NhU1j.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000004Pqy7x31YkJ8.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000004Pqy7x31YkJ8.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000003NATbp3NhU1j.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_3_0_6_10005_126","rt":0,"updateTips":"每周更新","bannerText":"","AdShareContent":"JOOX本地热播榜 2023年第9周","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"JOOX本地热播榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002xTbWy3pI0Kd_1.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000001e9UkX1gxTaY.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/test_order_channel_hitlist_con/3521186.png","cityName":"","magicColor":{"r":47,"g":83,"b":49},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002xTbWy3pI0Kd_1.jpg","groupType":1,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":130,"recType":10005,"topType":1,"updateType":0,"title":"香港TVB劲歌金榜","titleDetail":"香港TVB劲歌金榜 第4周","titleShare":"香港TVB劲歌金榜 2023年第4周","titleSub":"","intro":"\u201c劲歌金榜\u201d是香港TVB专业流行音乐节目《劲歌金曲》中所介绍的榜单，是香港乐坛重要的流行指标之一。每周更新。","cornerMark":0,"period":"2023_4","updateTime":"2023-02-26","history":{"year":[2023,2022,2021],"subPeriod":[[4,3,2,1],[53,52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,6,5,4,3,2,1],[56,55,54,53,52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,21,20,19,18,17,16,15]]},"listenNum":195298,"totalNum":10,"song":[{"rank":1,"rankType":0,"rankValue":"","recType":0,"songId":387216479,"vid":"","albumMid":"00184cXm37RExo","title":"还有事情可庆祝","singerName":"杨千嬅","singerMid":"000xogLP35ayzS","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M00000184cXm37RExo_1.jpg","mvid":0},{"rank":2,"rankType":0,"rankValue":"","recType":0,"songId":391032669,"vid":"","albumMid":"002GnDl21kYE0z","title":"盲婚哑嫁","singerName":"陈奕迅","singerMid":"003Nz2So3XXYek","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002GnDl21kYE0z.jpg","mvid":0},{"rank":3,"rankType":0,"rankValue":"","recType":0,"songId":390702731,"vid":"","albumMid":"001mGzOb4Gww1p","title":"他不是你","singerName":"连诗雅","singerMid":"0018mI054LNj4a","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001mGzOb4Gww1p_1.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000000vYCSl3rqqUQ.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000002u0gyz1tbzqD.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000002u0gyz1tbzqD.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000000vYCSl3rqqUQ.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_3_0_7_10005_130","rt":0,"updateTips":"每周更新","bannerText":"","AdShareContent":"香港TVB劲歌金榜 2023年第4周","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"香港TVB劲歌金榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M00000184cXm37RExo_1.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000002Be6RK1XFdFA.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/test_order_channel_hitlist_con/3866667.png","cityName":"","magicColor":{"r":76,"g":73,"b":44},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M00000184cXm37RExo_1.jpg","groupType":1,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":127,"recType":10005,"topType":1,"updateType":0,"title":"台湾KKBOX榜","titleDetail":"台湾KKBOX榜 第9周","titleShare":"台湾KKBOX榜 2023年第9周","titleSub":"","intro":"台湾KKBOX华语新歌周榜，每周五更新。","cornerMark":0,"period":"2023_9","updateTime":"2023-03-03","history":{"year":[2023,2022,2021,2020,2019],"subPeriod":[[9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[53,52,51,50,49,48,47,46,45,44,43,42,41,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,2],[51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,1]]},"listenNum":163482,"totalNum":49,"song":[{"rank":1,"rankType":0,"rankValue":"","recType":0,"songId":395913312,"vid":"","albumMid":"00071asp12uBIv","title":"一念之间","singerName":"告五人","singerMid":"002pfVN53lKI7x","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M00000071asp12uBIv_1.jpg","mvid":0},{"rank":2,"rankType":0,"rankValue":"","recType":0,"songId":397264896,"vid":"","albumMid":"002coWQe1g5JlM","title":"情勒 GASLIGHT (feat. ØZI) (Explicit)","singerName":"Marz23/ØZI","singerMid":"002HCVEL3pYdix","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002coWQe1g5JlM.jpg","mvid":0},{"rank":3,"rankType":0,"rankValue":"","recType":0,"songId":392700365,"vid":"","albumMid":"000alQXZ2hUlzf","title":"脑袋都是你","singerName":"陈势安","singerMid":"0049u0DR3G9Rgv","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000000alQXZ2hUlzf.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000001k9x6R2WomNI.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M0000027IbII4b8jay.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M0000027IbII4b8jay.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000001k9x6R2WomNI.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_3_0_8_10005_127","rt":0,"updateTips":"每周更新","bannerText":"","AdShareContent":"台湾KKBOX榜 2023年第9周","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"台湾KKBOX榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M00000071asp12uBIv_1.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M0000026tdTP3J15Fq.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/test_order_channel_hitlist_con/3521194.png","cityName":"","magicColor":{"r":183,"g":185,"b":177},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M00000071asp12uBIv_1.jpg","groupType":1,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":128,"recType":10005,"topType":1,"updateType":0,"title":"YouTube音乐排行榜","titleDetail":"YouTube音乐排行榜 第9周","titleShare":"YouTube音乐排行榜 2023年第9周","titleSub":"","intro":"YouTube是一个视频网站，YouTube热门音乐榜是根据歌曲每周在YouTube播放次数进行排名，每周一更新。","cornerMark":0,"period":"2023_9","updateTime":"2023-02-27","history":{"year":[2023,2022,2021,2020,2019],"subPeriod":[[9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15]]},"listenNum":531895,"totalNum":100,"song":[{"rank":1,"rankType":0,"rankValue":"","recType":0,"songId":391573225,"vid":"","albumMid":"002TSEYU4QlxeN","title":"Flowers","singerName":"Miley Cyrus","singerMid":"0037uV5A4O7UGj","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002TSEYU4QlxeN_1.jpg","mvid":0},{"rank":2,"rankType":0,"rankValue":"","recType":0,"songId":392115440,"vid":"","albumMid":"002MVqft0lfm3u","title":"Boy's a liar Pt. 2","singerName":"PinkPantheress/Ice Spice","singerMid":"0014Q4oi07dHIx","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002MVqft0lfm3u.jpg","mvid":0},{"rank":3,"rankType":0,"rankValue":"","recType":0,"songId":388410750,"vid":"","albumMid":"0043Mf1723zAWw","title":"Bebe Dame","singerName":"Fuerza Regida/Grupo Frontera","singerMid":"002abt4V1VhND1","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M0000043Mf1723zAWw_1.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000002kOI2l3NDP77.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M0000038HYJQ4QseBR.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M0000038HYJQ4QseBR.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000002kOI2l3NDP77.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_3_0_9_10005_128","rt":0,"updateTips":"每周更新","bannerText":"","AdShareContent":"YouTube音乐排行榜 2023年第9周","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"YouTube音乐排行榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002TSEYU4QlxeN_1.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000001LC3LO0i89jg.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/test_order_channel_hitlist_con/3521188.png","cityName":"","magicColor":{"r":0,"g":88,"b":132},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002TSEYU4QlxeN_1.jpg","groupType":1,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""}],"type":1,"myFeatureButtonText":"","myFeatureButtonScheme":""}]
                 * refreshInterval : 1
                 * abt :
                 */

                private int refreshInterval;
                private String abt;
                private List<GroupBean> group;

                public int getRefreshInterval() {
                    return refreshInterval;
                }

                public void setRefreshInterval(int refreshInterval) {
                    this.refreshInterval = refreshInterval;
                }

                public String getAbt() {
                    return abt;
                }

                public void setAbt(String abt) {
                    this.abt = abt;
                }

                public List<GroupBean> getGroup() {
                    return group;
                }

                public void setGroup(List<GroupBean> group) {
                    this.group = group;
                }

                public static class GroupBean {
                    /**
                     * groupId : 0
                     * groupName : 巅峰榜
                     * toplist : [{"topId":62,"recType":10005,"topType":0,"updateType":1,"title":"飙升榜","titleDetail":"飙升榜 第62天","titleShare":"飙升榜 2023年第62天","titleSub":"","intro":"QQ音乐站内播放热度飙升最快的前100首歌曲，每日更新。","cornerMark":0,"period":"2023-03-03","updateTime":"2023-03-03","history":{"year":[],"subPeriod":[]},"listenNum":18633712,"totalNum":100,"song":[{"rank":1,"rankType":6,"rankValue":"27%","recType":0,"songId":104948863,"vid":"","albumMid":"000PO0jU10ipSb","title":"想把我唱给你听","singerName":"老狼","singerMid":"002WkEWV1TA75B","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000000PO0jU10ipSb_2.jpg","mvid":0},{"rank":2,"rankType":6,"rankValue":"16%","recType":0,"songId":4826371,"vid":"","albumMid":"001eA2gF0dGeWY","title":"那个女孩","singerName":"陶喆/卢广仲","singerMid":"002cK0F12szD9T","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001eA2gF0dGeWY.jpg","mvid":0},{"rank":3,"rankType":6,"rankValue":"15%","recType":0,"songId":397629060,"vid":"","albumMid":"001V6BG837lk8c","title":"桃花诺","singerName":"旺仔小乔","singerMid":"0045G50v35VUMG","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001V6BG837lk8c_2.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000002lyMnK2SywsI.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000002dXVv60ZUwOo.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000000PO0jU10ipSb.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M0000037mBvq0UzatI.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_1_0_2_10005_62","rt":0,"updateTips":"每日更新","bannerText":"","AdShareContent":"飙升榜 2023年第62天","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"飙升榜","musichallSubtitle":"_11首歌新上榜","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000000PO0jU10ipSb_2.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000001FprJ12I00Ie.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/test_order_channel_hitlist_con/3521138.png","cityName":"","magicColor":{"r":143,"g":151,"b":179},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M000000PO0jU10ipSb_2.jpg","groupType":0,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":26,"recType":10005,"topType":0,"updateType":1,"title":"热歌榜","titleDetail":"热歌榜 第62天","titleShare":"热歌榜 2023年第62天","titleSub":"","intro":"QQ音乐站内播放热度前300首歌曲，每日更新。","cornerMark":0,"period":"2023-03-03","updateTime":"2023-03-03","history":{"year":[],"subPeriod":[]},"listenNum":19100000,"totalNum":300,"song":[{"rank":1,"rankType":3,"rankValue":"0","recType":0,"songId":384263699,"vid":"","albumMid":"002PwL9x3TiVdh","title":"乌梅子酱","singerName":"李荣浩","singerMid":"000aHmbL2aPXWH","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002PwL9x3TiVdh_1.jpg","mvid":0},{"rank":2,"rankType":3,"rankValue":"0","recType":0,"songId":368139519,"vid":"","albumMid":"002HcXA60aeTLD","title":"就让这大雨全都落下","singerName":"容祖儿","singerMid":"001uXFgt1kpLyI","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002HcXA60aeTLD_1.jpg","mvid":0},{"rank":3,"rankType":1,"rankValue":"2","recType":0,"songId":326584182,"vid":"","albumMid":"004Kbn3m2HV9Y3","title":"如愿","singerName":"王菲","singerMid":"000GDDuQ3sGQiT","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000004Kbn3m2HV9Y3_1.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M0000011o0JU32ofbv.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000001c0hSr1R862c.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002PwL9x3TiVdh.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000003Ounnt1W11Tz.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_1_0_3_10005_26","rt":0,"updateTips":"每日更新","bannerText":"","AdShareContent":"热歌榜 2023年第62天","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"热歌榜","musichallSubtitle":"_11首歌新上榜","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002PwL9x3TiVdh_1.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000001txncR3TDZoj.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/test_order_channel_hitlist_con/4348759.png","cityName":"","magicColor":{"r":123,"g":35,"b":4},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M000002PwL9x3TiVdh_1.jpg","groupType":0,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":27,"recType":10005,"topType":0,"updateType":1,"title":"新歌榜","titleDetail":"新歌榜 第62天","titleShare":"新歌榜 2023年第62天","titleSub":"","intro":"QQ音乐站内播放热度排名前100首新歌，每日更新。","cornerMark":0,"period":"2023-03-03","updateTime":"2023-03-03","history":{"year":[],"subPeriod":[]},"listenNum":165581,"totalNum":100,"song":[{"rank":1,"rankType":3,"rankValue":"0","recType":0,"songId":396710011,"vid":"","albumMid":"0027gqTJ2vh1Fz","title":"苦咖啡·唯一","singerName":"那奇沃夫/KKECHO","singerMid":"0043ujuR27z2p8","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M0000027gqTJ2vh1Fz_1.jpg","mvid":0},{"rank":2,"rankType":3,"rankValue":"0","recType":0,"songId":393949802,"vid":"","albumMid":"000WDNPt4XUrXs","title":"谁","singerName":"曲肖冰","singerMid":"001ZVMXf3ZYVX7","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000000WDNPt4XUrXs_2.jpg","mvid":0},{"rank":3,"rankType":1,"rankValue":"1","recType":0,"songId":396112160,"vid":"","albumMid":"0042mJP52iOjn5","title":"忘了","singerName":"周林枫","singerMid":"002LlLHa3jSdoa","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M0000042mJP52iOjn5_2.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000004VcMwE2rNG9p.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M0000015hl0K4VWnJd.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M0000027gqTJ2vh1Fz.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M0000002xW8j2OPQhZ.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_1_0_4_10005_27","rt":0,"updateTips":"每日更新","bannerText":"","AdShareContent":"新歌榜 2023年第62天","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"新歌榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M0000027gqTJ2vh1Fz_1.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000001vYgwU0VGAg3.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/test_order_channel_hitlist_con/3521143.png","cityName":"","magicColor":{"r":166,"g":146,"b":89},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M0000027gqTJ2vh1Fz_1.jpg","groupType":0,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":4,"recType":10005,"topType":0,"updateType":1,"title":"流行指数榜","titleDetail":"流行指数榜 第62天","titleShare":"流行指数榜 2023年第62天","titleSub":"","intro":"QQ音乐站内播放相对涨幅排名前100首歌曲，每日更新。","cornerMark":0,"period":"2023-03-03","updateTime":"2023-03-03","history":{"year":[],"subPeriod":[]},"listenNum":7953220,"totalNum":100,"song":[{"rank":1,"rankType":6,"rankValue":"125%","recType":0,"songId":397629060,"vid":"","albumMid":"001V6BG837lk8c","title":"桃花诺","singerName":"旺仔小乔","singerMid":"0045G50v35VUMG","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001V6BG837lk8c_2.jpg","mvid":0},{"rank":2,"rankType":6,"rankValue":"109%","recType":0,"songId":396112160,"vid":"","albumMid":"0042mJP52iOjn5","title":"忘了","singerName":"周林枫","singerMid":"002LlLHa3jSdoa","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M0000042mJP52iOjn5_2.jpg","mvid":0},{"rank":3,"rankType":6,"rankValue":"64%","recType":0,"songId":326584182,"vid":"","albumMid":"004Kbn3m2HV9Y3","title":"如愿","singerName":"王菲","singerMid":"000GDDuQ3sGQiT","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000004Kbn3m2HV9Y3_1.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M0000035Tt4F3UDdrD.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000003tk5iY15Lpv5.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001V6BG837lk8c.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000001xBRF61nMru2.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_1_0_5_10005_4","rt":0,"updateTips":"每日更新","bannerText":"","AdShareContent":"流行指数榜 2023年第62天","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"流行指数榜","musichallSubtitle":"_每日更新","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001V6BG837lk8c_2.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000002ulDjs1n24zg.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/test_order_channel_hitlist_con/3521144.png","cityName":"","magicColor":{"r":143,"g":160,"b":179},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001V6BG837lk8c_2.jpg","groupType":0,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":57,"recType":10005,"topType":0,"updateType":0,"title":"喜力电音榜","titleDetail":"喜力电音榜 第9周","titleShare":"喜力电音榜 2023年第9周","titleSub":"","intro":"QQ音乐播放热度最高的电音歌曲TOP50，每周更新。","cornerMark":0,"period":"2023_9","updateTime":"2023-03-02","history":{"year":[2023,2022,2021,2020,2019,2018],"subPeriod":[[9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[52,51,50,49,48,47,46,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[53,52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1],[51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0],[51,50,49,48,47,46,45,44,43,42,41,40]]},"listenNum":1403255,"totalNum":50,"song":[{"rank":1,"rankType":4,"rankValue":"0","recType":0,"songId":397447822,"vid":"","albumMid":"001d3W0x4DRn3z","title":"Not Cinderella","singerName":"宋雨琦/하이퍼타임","singerMid":"003GgG3V1fkAFf","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001d3W0x4DRn3z_1.jpg","mvid":0},{"rank":2,"rankType":2,"rankValue":"1","recType":0,"songId":394444590,"vid":"","albumMid":"0035N8lV3X7fWw","title":"冰川之泪 Tears from the Ice River","singerName":"Terry Zhong 钟天利/考拉kora","singerMid":"001pW4WY4TWNk4","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M0000035N8lV3X7fWw_4.jpg","mvid":0},{"rank":3,"rankType":1,"rankValue":"2","recType":0,"songId":390980914,"vid":"","albumMid":"0036ZLdt4djv3M","title":"春时·雪梅赋","singerName":"Onism./Bumpÿ/故茕","singerMid":"004RrX0B0WU9fb","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M0000036ZLdt4djv3M.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000001udetC0yeED3.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000002ua5jF0WSlI3.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001d3W0x4DRn3z.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000003uPdgx0Tr0fu.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_1_0_6_10005_57","rt":0,"updateTips":"每周更新","bannerText":"","AdShareContent":"喜力电音榜 2023年第9周","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"喜力电音榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001d3W0x4DRn3z_1.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000000rBoNt0e3vjA.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/t_order_channel_hitlist_conf/4316437.png","cityName":"","magicColor":{"r":27,"g":33,"b":50},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001d3W0x4DRn3z_1.jpg","groupType":0,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":52,"recType":10005,"topType":0,"updateType":1,"title":"腾讯音乐人原创榜","titleDetail":"腾讯音乐人原创榜 第62天","titleShare":"腾讯音乐人原创榜 2023年第62天","titleSub":"","intro":"QQ音乐最新最热的腾讯音乐人原创作品TOP100。","cornerMark":0,"period":"2023-03-03","updateTime":"2023-03-03","history":{"year":[],"subPeriod":[]},"listenNum":215859,"totalNum":100,"song":[{"rank":1,"rankType":1,"rankValue":"13","recType":0,"songId":397275665,"vid":"","albumMid":"003DnOkh2tRqtL","title":"奇妙的我","singerName":"廖麻酱","singerMid":"003OZSqE3uDM1Z","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000003DnOkh2tRqtL_1.jpg","mvid":0},{"rank":2,"rankType":5,"rankValue":"0","recType":0,"songId":397597953,"vid":"","albumMid":"004WNJUO0fGQjD","title":"兀兀","singerName":"陈粒","singerMid":"004WgCsE3KBddt","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000004WNJUO0fGQjD.jpg","mvid":0},{"rank":3,"rankType":5,"rankValue":"0","recType":0,"songId":398282803,"vid":"","albumMid":"000t9S9F0dXtUA","title":"雪 Distance","singerName":"Capper/罗言RollFlash","singerMid":"001eBoUt4SiKgg","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000000t9S9F0dXtUA_1.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000000UNjRp06k6iT.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000000BhdFW29cCO8.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000003DnOkh2tRqtL.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000002r0kOh1bpfdO.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_1_0_8_10005_52","rt":0,"updateTips":"每日更新","bannerText":"","AdShareContent":"腾讯音乐人原创榜 2023年第62天","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"腾讯音乐人原创榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000003DnOkh2tRqtL_1.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000001U2H121SzQdG.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/t_order_channel_hitlist_conf/4118315.png","cityName":"","magicColor":{"r":204,"g":148,"b":110},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M000003DnOkh2tRqtL_1.jpg","groupType":0,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":67,"recType":10005,"topType":0,"updateType":1,"title":"听歌识曲榜","titleDetail":"听歌识曲榜 第62天","titleShare":"听歌识曲榜 2023年第62天","titleSub":"","intro":"QQ音乐用户使用\u201c听歌识曲\u201d功能捕捉热度最高的歌曲TOP100，每日更新。","cornerMark":0,"period":"2023-03-03","updateTime":"2023-03-03","history":{"year":[],"subPeriod":[]},"listenNum":3049800,"totalNum":100,"song":[{"rank":1,"rankType":4,"rankValue":"0","recType":0,"songId":398354303,"vid":"","albumMid":"003UOXP11qKicA","title":"Someone you Loved","singerName":"美二帆","singerMid":"000frQdA07uHz2","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000003UOXP11qKicA_1.jpg","mvid":0},{"rank":2,"rankType":2,"rankValue":"1","recType":0,"songId":357531938,"vid":"","albumMid":"003DFrnj26SMZU","title":"可能","singerName":"程响","singerMid":"003iPzNg35cWzp","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000003DFrnj26SMZU_2.jpg","mvid":0},{"rank":3,"rankType":2,"rankValue":"1","recType":0,"songId":396710011,"vid":"","albumMid":"0027gqTJ2vh1Fz","title":"苦咖啡·唯一","singerName":"那奇沃夫/KKECHO","singerMid":"0043ujuR27z2p8","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M0000027gqTJ2vh1Fz_1.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000001MJT9r3EsWba.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000002zuUdq4Y5Ny6.jpg","mbFrontPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000003UOXP11qKicA.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000004fFtpg1f7i4K.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"","h5JumpUrl":"","url_key":"","url_params":"","tjreport":"2_1_0_10_10005_67","rt":0,"updateTips":"每日更新","bannerText":"","AdShareContent":"听歌识曲榜 2023年第62天","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"听歌识曲榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000003UOXP11qKicA_1.jpg","specialScheme":"","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T052R300x300M000002KAai41Cm5vP.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common/upload/test_order_channel_hitlist_con/3521141.png","cityName":"","magicColor":{"r":179,"g":143,"b":155},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M000003UOXP11qKicA_1.jpg","groupType":0,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""},{"topId":201,"recType":10010,"topType":0,"updateType":1,"title":"MV榜","titleDetail":"MV榜 ","titleShare":"MV榜 ","titleSub":"","intro":"QQ音乐播放得分最高的官方MV TOP排行榜，发行期90天内。","cornerMark":0,"period":"","updateTime":"","history":{"year":[],"subPeriod":[]},"listenNum":1450225,"totalNum":20,"song":[{"rank":1,"rankType":0,"rankValue":"","recType":1,"songId":0,"vid":"001BFqNN1ogb9G","albumMid":"001rb1ah0bFKMo","title":"花开忘忧","singerName":"周深","singerMid":"003fA5G40k6hKc","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001rb1ah0bFKMo_1.jpg","mvid":0},{"rank":2,"rankType":0,"rankValue":"","recType":1,"songId":0,"vid":"0034Z4yM2RG9m0","albumMid":"003zzzm62mna7A","title":"부석순 (SEVENTEEN) '파이팅 해야지 (Feat. 이영지)' Official MV (Choreography Version)","singerName":"BSS/李泳知","singerMid":"001J1wmG2twrzz","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000003zzzm62mna7A.jpg","mvid":0},{"rank":3,"rankType":0,"rankValue":"","recType":1,"songId":0,"vid":"000eCTmM20oytM","albumMid":"004aaud01NY6TC","title":"Hadn't Met You","singerName":"Lil Ghost小鬼","singerMid":"003Xf2W10FZgVW","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000004aaud01NY6TC.jpg","mvid":0}],"headPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M000000R5yK4078ovt.jpg","frontPicUrl":"http://y.gtimg.cn/music/photo_new/T003R300x300M000003YxgiC3yiWSB.jpg","mbFrontPicUrl":"https://y.gtimg.cn/music/photo_new/T002R300x300M000001rb1ah0bFKMo_1.jpg","mbHeadPicUrl":"http://y.gtimg.cn/music/photo_new/T003R500x500M0000005m0me4Gnsq1.jpg","pcSubTopIds":[],"pcSubTopTitles":[],"subTopIds":[],"adJumpUrl":"http://y.qq.com/m/client/v5detail/mv.html?navpage=toplist","h5JumpUrl":"https://y.qq.com/m/client/video_rank_list/index.html","url_key":"v5detail_mv","url_params":"","tjreport":"2_1_0_12_10010_201","rt":0,"updateTips":"每10分钟更新","bannerText":"","AdShareContent":"MV榜 ","abt":"","cityId":0,"provId":0,"sinceCV":0,"musichallTitle":"MV榜","musichallSubtitle":"","musichallPicUrl":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001rb1ah0bFKMo_1.jpg","specialScheme":"qqmusic://qq.com/ui/openRN?p=%7B%22key%22%3A%22MvToplist%22%2C%22failoverUrl%22%3A%22https%3A%2F%2Fy.qq.com%2Fm%2Fclient%2Fvideo_rank_list%2Findex.html%22%7D","mbFrontLogoUrl":"https://y.gtimg.cn/music/photo_new/T002R300x300M000001rb1ah0bFKMo_1.jpg","mbHeadLogoUrl":"http://y.gtimg.cn/music/common","cityName":"","magicColor":{"r":0,"g":0,"b":0},"topAlbumURL":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001rb1ah0bFKMo_1.jpg","groupType":0,"icon":0,"adID":0,"mbIntroWebUrl":"","mbLogoUrl":""}]
                     * type : 0
                     * myFeatureButtonText :
                     * myFeatureButtonScheme :
                     */

                    private int groupId;
                    private String groupName;
                    private int type;
                    private String myFeatureButtonText;
                    private String myFeatureButtonScheme;
                    private List<ToplistBean> toplist;

                    public int getGroupId() {
                        return groupId;
                    }

                    public void setGroupId(int groupId) {
                        this.groupId = groupId;
                    }

                    public String getGroupName() {
                        return groupName;
                    }

                    public void setGroupName(String groupName) {
                        this.groupName = groupName;
                    }

                    public int getType() {
                        return type;
                    }

                    public void setType(int type) {
                        this.type = type;
                    }

                    public String getMyFeatureButtonText() {
                        return myFeatureButtonText;
                    }

                    public void setMyFeatureButtonText(String myFeatureButtonText) {
                        this.myFeatureButtonText = myFeatureButtonText;
                    }

                    public String getMyFeatureButtonScheme() {
                        return myFeatureButtonScheme;
                    }

                    public void setMyFeatureButtonScheme(String myFeatureButtonScheme) {
                        this.myFeatureButtonScheme = myFeatureButtonScheme;
                    }

                    public List<ToplistBean> getToplist() {
                        return toplist;
                    }

                    public void setToplist(List<ToplistBean> toplist) {
                        this.toplist = toplist;
                    }

                    public static class ToplistBean {
                        /**
                         * topId : 62
                         * recType : 10005
                         * topType : 0
                         * updateType : 1
                         * title : 飙升榜
                         * titleDetail : 飙升榜 第62天
                         * titleShare : 飙升榜 2023年第62天
                         * titleSub :
                         * intro : QQ音乐站内播放热度飙升最快的前100首歌曲，每日更新。
                         * cornerMark : 0
                         * period : 2023-03-03
                         * updateTime : 2023-03-03
                         * history : {"year":[],"subPeriod":[]}
                         * listenNum : 18633712
                         * totalNum : 100
                         * song : [{"rank":1,"rankType":6,"rankValue":"27%","recType":0,"songId":104948863,"vid":"","albumMid":"000PO0jU10ipSb","title":"想把我唱给你听","singerName":"老狼","singerMid":"002WkEWV1TA75B","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000000PO0jU10ipSb_2.jpg","mvid":0},{"rank":2,"rankType":6,"rankValue":"16%","recType":0,"songId":4826371,"vid":"","albumMid":"001eA2gF0dGeWY","title":"那个女孩","singerName":"陶喆/卢广仲","singerMid":"002cK0F12szD9T","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001eA2gF0dGeWY.jpg","mvid":0},{"rank":3,"rankType":6,"rankValue":"15%","recType":0,"songId":397629060,"vid":"","albumMid":"001V6BG837lk8c","title":"桃花诺","singerName":"旺仔小乔","singerMid":"0045G50v35VUMG","songType":0,"uuidCnt":0,"cover":"http://y.gtimg.cn/music/photo_new/T002R300x300M000001V6BG837lk8c_2.jpg","mvid":0}]
                         * headPicUrl : http://y.gtimg.cn/music/photo_new/T003R500x500M000002lyMnK2SywsI.jpg
                         * frontPicUrl : http://y.gtimg.cn/music/photo_new/T003R300x300M000002dXVv60ZUwOo.jpg
                         * mbFrontPicUrl : http://y.gtimg.cn/music/photo_new/T002R300x300M000000PO0jU10ipSb.jpg
                         * mbHeadPicUrl : http://y.gtimg.cn/music/photo_new/T003R500x500M0000037mBvq0UzatI.jpg
                         * pcSubTopIds : []
                         * pcSubTopTitles : []
                         * subTopIds : []
                         * adJumpUrl :
                         * h5JumpUrl :
                         * url_key :
                         * url_params :
                         * tjreport : 2_1_0_2_10005_62
                         * rt : 0
                         * updateTips : 每日更新
                         * bannerText :
                         * AdShareContent : 飙升榜 2023年第62天
                         * abt :
                         * cityId : 0
                         * provId : 0
                         * sinceCV : 0
                         * musichallTitle : 飙升榜
                         * musichallSubtitle : _11首歌新上榜
                         * musichallPicUrl : http://y.gtimg.cn/music/photo_new/T002R300x300M000000PO0jU10ipSb_2.jpg
                         * specialScheme :
                         * mbFrontLogoUrl : https://y.gtimg.cn/music/photo_new/T052R300x300M000001FprJ12I00Ie.jpg
                         * mbHeadLogoUrl : http://y.gtimg.cn/music/common/upload/test_order_channel_hitlist_con/3521138.png
                         * cityName :
                         * magicColor : {"r":143,"g":151,"b":179}
                         * topAlbumURL : http://y.gtimg.cn/music/photo_new/T002R300x300M000000PO0jU10ipSb_2.jpg
                         * groupType : 0
                         * icon : 0
                         * adID : 0
                         * mbIntroWebUrl :
                         * mbLogoUrl :
                         */

                        private int topId;
                        private int recType;
                        private int topType;
                        private int updateType;
                        private String title;
                        private String titleDetail;
                        private String titleShare;
                        private String titleSub;
                        private String intro;
                        private int cornerMark;
                        private String period;
                        private String updateTime;
                        private HistoryBean history;
                        private int listenNum;
                        private int totalNum;
                        private String headPicUrl;
                        private String frontPicUrl;
                        private String mbFrontPicUrl;
                        private String mbHeadPicUrl;
                        private String adJumpUrl;
                        private String h5JumpUrl;
                        private String url_key;
                        private String url_params;
                        private String tjreport;
                        private int rt;
                        private String updateTips;
                        private String bannerText;
                        private String AdShareContent;
                        private String abt;
                        private int cityId;
                        private int provId;
                        private int sinceCV;
                        private String musichallTitle;
                        private String musichallSubtitle;
                        private String musichallPicUrl;
                        private String specialScheme;
                        private String mbFrontLogoUrl;
                        private String mbHeadLogoUrl;
                        private String cityName;
                        private MagicColorBean magicColor;
                        private String topAlbumURL;
                        private int groupType;
                        private int icon;
                        private int adID;
                        private String mbIntroWebUrl;
                        private String mbLogoUrl;
                        private List<SongBean> song;
                        private List<?> pcSubTopIds;
                        private List<?> pcSubTopTitles;
                        private List<?> subTopIds;

                        public int getTopId() {
                            return topId;
                        }

                        public void setTopId(int topId) {
                            this.topId = topId;
                        }

                        public int getRecType() {
                            return recType;
                        }

                        public void setRecType(int recType) {
                            this.recType = recType;
                        }

                        public int getTopType() {
                            return topType;
                        }

                        public void setTopType(int topType) {
                            this.topType = topType;
                        }

                        public int getUpdateType() {
                            return updateType;
                        }

                        public void setUpdateType(int updateType) {
                            this.updateType = updateType;
                        }

                        public String getTitle() {
                            return title;
                        }

                        public void setTitle(String title) {
                            this.title = title;
                        }

                        public String getTitleDetail() {
                            return titleDetail;
                        }

                        public void setTitleDetail(String titleDetail) {
                            this.titleDetail = titleDetail;
                        }

                        public String getTitleShare() {
                            return titleShare;
                        }

                        public void setTitleShare(String titleShare) {
                            this.titleShare = titleShare;
                        }

                        public String getTitleSub() {
                            return titleSub;
                        }

                        public void setTitleSub(String titleSub) {
                            this.titleSub = titleSub;
                        }

                        public String getIntro() {
                            return intro;
                        }

                        public void setIntro(String intro) {
                            this.intro = intro;
                        }

                        public int getCornerMark() {
                            return cornerMark;
                        }

                        public void setCornerMark(int cornerMark) {
                            this.cornerMark = cornerMark;
                        }

                        public String getPeriod() {
                            return period;
                        }

                        public void setPeriod(String period) {
                            this.period = period;
                        }

                        public String getUpdateTime() {
                            return updateTime;
                        }

                        public void setUpdateTime(String updateTime) {
                            this.updateTime = updateTime;
                        }

                        public HistoryBean getHistory() {
                            return history;
                        }

                        public void setHistory(HistoryBean history) {
                            this.history = history;
                        }

                        public int getListenNum() {
                            return listenNum;
                        }

                        public void setListenNum(int listenNum) {
                            this.listenNum = listenNum;
                        }

                        public int getTotalNum() {
                            return totalNum;
                        }

                        public void setTotalNum(int totalNum) {
                            this.totalNum = totalNum;
                        }

                        public String getHeadPicUrl() {
                            return headPicUrl;
                        }

                        public void setHeadPicUrl(String headPicUrl) {
                            this.headPicUrl = headPicUrl;
                        }

                        public String getFrontPicUrl() {
                            return frontPicUrl;
                        }

                        public void setFrontPicUrl(String frontPicUrl) {
                            this.frontPicUrl = frontPicUrl;
                        }

                        public String getMbFrontPicUrl() {
                            return mbFrontPicUrl;
                        }

                        public void setMbFrontPicUrl(String mbFrontPicUrl) {
                            this.mbFrontPicUrl = mbFrontPicUrl;
                        }

                        public String getMbHeadPicUrl() {
                            return mbHeadPicUrl;
                        }

                        public void setMbHeadPicUrl(String mbHeadPicUrl) {
                            this.mbHeadPicUrl = mbHeadPicUrl;
                        }

                        public String getAdJumpUrl() {
                            return adJumpUrl;
                        }

                        public void setAdJumpUrl(String adJumpUrl) {
                            this.adJumpUrl = adJumpUrl;
                        }

                        public String getH5JumpUrl() {
                            return h5JumpUrl;
                        }

                        public void setH5JumpUrl(String h5JumpUrl) {
                            this.h5JumpUrl = h5JumpUrl;
                        }

                        public String getUrl_key() {
                            return url_key;
                        }

                        public void setUrl_key(String url_key) {
                            this.url_key = url_key;
                        }

                        public String getUrl_params() {
                            return url_params;
                        }

                        public void setUrl_params(String url_params) {
                            this.url_params = url_params;
                        }

                        public String getTjreport() {
                            return tjreport;
                        }

                        public void setTjreport(String tjreport) {
                            this.tjreport = tjreport;
                        }

                        public int getRt() {
                            return rt;
                        }

                        public void setRt(int rt) {
                            this.rt = rt;
                        }

                        public String getUpdateTips() {
                            return updateTips;
                        }

                        public void setUpdateTips(String updateTips) {
                            this.updateTips = updateTips;
                        }

                        public String getBannerText() {
                            return bannerText;
                        }

                        public void setBannerText(String bannerText) {
                            this.bannerText = bannerText;
                        }

                        public String getAdShareContent() {
                            return AdShareContent;
                        }

                        public void setAdShareContent(String AdShareContent) {
                            this.AdShareContent = AdShareContent;
                        }

                        public String getAbt() {
                            return abt;
                        }

                        public void setAbt(String abt) {
                            this.abt = abt;
                        }

                        public int getCityId() {
                            return cityId;
                        }

                        public void setCityId(int cityId) {
                            this.cityId = cityId;
                        }

                        public int getProvId() {
                            return provId;
                        }

                        public void setProvId(int provId) {
                            this.provId = provId;
                        }

                        public int getSinceCV() {
                            return sinceCV;
                        }

                        public void setSinceCV(int sinceCV) {
                            this.sinceCV = sinceCV;
                        }

                        public String getMusichallTitle() {
                            return musichallTitle;
                        }

                        public void setMusichallTitle(String musichallTitle) {
                            this.musichallTitle = musichallTitle;
                        }

                        public String getMusichallSubtitle() {
                            return musichallSubtitle;
                        }

                        public void setMusichallSubtitle(String musichallSubtitle) {
                            this.musichallSubtitle = musichallSubtitle;
                        }

                        public String getMusichallPicUrl() {
                            return musichallPicUrl;
                        }

                        public void setMusichallPicUrl(String musichallPicUrl) {
                            this.musichallPicUrl = musichallPicUrl;
                        }

                        public String getSpecialScheme() {
                            return specialScheme;
                        }

                        public void setSpecialScheme(String specialScheme) {
                            this.specialScheme = specialScheme;
                        }

                        public String getMbFrontLogoUrl() {
                            return mbFrontLogoUrl;
                        }

                        public void setMbFrontLogoUrl(String mbFrontLogoUrl) {
                            this.mbFrontLogoUrl = mbFrontLogoUrl;
                        }

                        public String getMbHeadLogoUrl() {
                            return mbHeadLogoUrl;
                        }

                        public void setMbHeadLogoUrl(String mbHeadLogoUrl) {
                            this.mbHeadLogoUrl = mbHeadLogoUrl;
                        }

                        public String getCityName() {
                            return cityName;
                        }

                        public void setCityName(String cityName) {
                            this.cityName = cityName;
                        }

                        public MagicColorBean getMagicColor() {
                            return magicColor;
                        }

                        public void setMagicColor(MagicColorBean magicColor) {
                            this.magicColor = magicColor;
                        }

                        public String getTopAlbumURL() {
                            return topAlbumURL;
                        }

                        public void setTopAlbumURL(String topAlbumURL) {
                            this.topAlbumURL = topAlbumURL;
                        }

                        public int getGroupType() {
                            return groupType;
                        }

                        public void setGroupType(int groupType) {
                            this.groupType = groupType;
                        }

                        public int getIcon() {
                            return icon;
                        }

                        public void setIcon(int icon) {
                            this.icon = icon;
                        }

                        public int getAdID() {
                            return adID;
                        }

                        public void setAdID(int adID) {
                            this.adID = adID;
                        }

                        public String getMbIntroWebUrl() {
                            return mbIntroWebUrl;
                        }

                        public void setMbIntroWebUrl(String mbIntroWebUrl) {
                            this.mbIntroWebUrl = mbIntroWebUrl;
                        }

                        public String getMbLogoUrl() {
                            return mbLogoUrl;
                        }

                        public void setMbLogoUrl(String mbLogoUrl) {
                            this.mbLogoUrl = mbLogoUrl;
                        }

                        public List<SongBean> getSong() {
                            return song;
                        }

                        public void setSong(List<SongBean> song) {
                            this.song = song;
                        }

                        public List<?> getPcSubTopIds() {
                            return pcSubTopIds;
                        }

                        public void setPcSubTopIds(List<?> pcSubTopIds) {
                            this.pcSubTopIds = pcSubTopIds;
                        }

                        public List<?> getPcSubTopTitles() {
                            return pcSubTopTitles;
                        }

                        public void setPcSubTopTitles(List<?> pcSubTopTitles) {
                            this.pcSubTopTitles = pcSubTopTitles;
                        }

                        public List<?> getSubTopIds() {
                            return subTopIds;
                        }

                        public void setSubTopIds(List<?> subTopIds) {
                            this.subTopIds = subTopIds;
                        }

                        public static class HistoryBean {
                            private List<?> year;
                            private List<?> subPeriod;

                            public List<?> getYear() {
                                return year;
                            }

                            public void setYear(List<?> year) {
                                this.year = year;
                            }

                            public List<?> getSubPeriod() {
                                return subPeriod;
                            }

                            public void setSubPeriod(List<?> subPeriod) {
                                this.subPeriod = subPeriod;
                            }
                        }

                        public static class MagicColorBean {
                            /**
                             * r : 143
                             * g : 151
                             * b : 179
                             */

                            private int r;
                            private int g;
                            private int b;

                            public int getR() {
                                return r;
                            }

                            public void setR(int r) {
                                this.r = r;
                            }

                            public int getG() {
                                return g;
                            }

                            public void setG(int g) {
                                this.g = g;
                            }

                            public int getB() {
                                return b;
                            }

                            public void setB(int b) {
                                this.b = b;
                            }
                        }

                        public static class SongBean {
                            /**
                             * rank : 1
                             * rankType : 6
                             * rankValue : 27%
                             * recType : 0
                             * songId : 104948863
                             * vid :
                             * albumMid : 000PO0jU10ipSb
                             * title : 想把我唱给你听
                             * singerName : 老狼
                             * singerMid : 002WkEWV1TA75B
                             * songType : 0
                             * uuidCnt : 0
                             * cover : http://y.gtimg.cn/music/photo_new/T002R300x300M000000PO0jU10ipSb_2.jpg
                             * mvid : 0
                             */

                            private int rank;
                            private int rankType;
                            private String rankValue;
                            private int recType;
                            private int songId;
                            private String vid;
                            private String albumMid;
                            private String title;
                            private String singerName;
                            private String singerMid;
                            private int songType;
                            private int uuidCnt;
                            private String cover;
                            private int mvid;

                            public int getRank() {
                                return rank;
                            }

                            public void setRank(int rank) {
                                this.rank = rank;
                            }

                            public int getRankType() {
                                return rankType;
                            }

                            public void setRankType(int rankType) {
                                this.rankType = rankType;
                            }

                            public String getRankValue() {
                                return rankValue;
                            }

                            public void setRankValue(String rankValue) {
                                this.rankValue = rankValue;
                            }

                            public int getRecType() {
                                return recType;
                            }

                            public void setRecType(int recType) {
                                this.recType = recType;
                            }

                            public int getSongId() {
                                return songId;
                            }

                            public void setSongId(int songId) {
                                this.songId = songId;
                            }

                            public String getVid() {
                                return vid;
                            }

                            public void setVid(String vid) {
                                this.vid = vid;
                            }

                            public String getAlbumMid() {
                                return albumMid;
                            }

                            public void setAlbumMid(String albumMid) {
                                this.albumMid = albumMid;
                            }

                            public String getTitle() {
                                return title;
                            }

                            public void setTitle(String title) {
                                this.title = title;
                            }

                            public String getSingerName() {
                                return singerName;
                            }

                            public void setSingerName(String singerName) {
                                this.singerName = singerName;
                            }

                            public String getSingerMid() {
                                return singerMid;
                            }

                            public void setSingerMid(String singerMid) {
                                this.singerMid = singerMid;
                            }

                            public int getSongType() {
                                return songType;
                            }

                            public void setSongType(int songType) {
                                this.songType = songType;
                            }

                            public int getUuidCnt() {
                                return uuidCnt;
                            }

                            public void setUuidCnt(int uuidCnt) {
                                this.uuidCnt = uuidCnt;
                            }

                            public String getCover() {
                                return cover;
                            }

                            public void setCover(String cover) {
                                this.cover = cover;
                            }

                            public int getMvid() {
                                return mvid;
                            }

                            public void setMvid(int mvid) {
                                this.mvid = mvid;
                            }
                        }
                    }
                }
            }
        }

        public static class FocusBean {
            /**
             * code : 0
             * data : {"content":[{"cover":"","id":49809,"jump_info":{"id":0,"mid":"","url":"004HuV4148SBxr"},"listen_num":0,"pic_info":{"mid":"","url":"http://y.gtimg.cn/music/common/upload/MUSIC_FOCUS/4570109.png","urlex1":"","urlex2":""},"report":"","sub_title":"","title":"","type":10002},{"cover":"","id":49815,"jump_info":{"id":0,"mid":"","url":"000d8x3W1TsLsj"},"listen_num":0,"pic_info":{"mid":"","url":"http://y.gtimg.cn/music/common/upload/MUSIC_FOCUS/4570103.png","urlex1":"","urlex2":""},"report":"","sub_title":"","title":"","type":10002},{"cover":"","id":49810,"jump_info":{"id":0,"mid":"","url":"002OrLAT3CDo2r"},"listen_num":0,"pic_info":{"mid":"","url":"http://y.gtimg.cn/music/common/upload/MUSIC_FOCUS/4569338.jpg","urlex1":"","urlex2":""},"report":"","sub_title":"","title":"","type":10002},{"cover":"","id":49811,"jump_info":{"id":0,"mid":"","url":"8823022173"},"listen_num":0,"pic_info":{"mid":"","url":"http://y.gtimg.cn/music/common/upload/MUSIC_FOCUS/4570207.jpg","urlex1":"","urlex2":""},"report":"","sub_title":"","title":"","type":10014},{"cover":"","id":49823,"jump_info":{"id":0,"mid":"","url":"003zwqCS2jwBy3"},"listen_num":0,"pic_info":{"mid":"","url":"http://y.gtimg.cn/music/common/upload/MUSIC_FOCUS/4569917.png","urlex1":"","urlex2":""},"report":"","sub_title":"","title":"","type":10002},{"cover":"","id":49817,"jump_info":{"id":0,"mid":"","url":"002JM30d1RDH8D"},"listen_num":0,"pic_info":{"mid":"","url":"http://y.gtimg.cn/music/common/upload/MUSIC_FOCUS/4569618.png","urlex1":"","urlex2":""},"report":"","sub_title":"","title":"","type":10002},{"cover":"","id":49818,"jump_info":{"id":0,"mid":"","url":"001PxcdB11KhTf"},"listen_num":0,"pic_info":{"mid":"","url":"http://y.gtimg.cn/music/common/upload/MUSIC_FOCUS/4569620.png","urlex1":"","urlex2":""},"report":"","sub_title":"","title":"","type":10002},{"cover":"","id":49820,"jump_info":{"id":0,"mid":"","url":"001GUOmT1Bwuzv"},"listen_num":0,"pic_info":{"mid":"","url":"http://y.gtimg.cn/music/common/upload/MUSIC_FOCUS/4569704.png","urlex1":"","urlex2":""},"report":"","sub_title":"","title":"","type":10002},{"cover":"","id":49821,"jump_info":{"id":0,"mid":"","url":"0041dlcg0MinSa"},"listen_num":0,"pic_info":{"mid":"","url":"http://y.gtimg.cn/music/common/upload/MUSIC_FOCUS/4569710.png","urlex1":"","urlex2":""},"report":"","sub_title":"","title":"","type":10002},{"cover":"","id":49822,"jump_info":{"id":0,"mid":"","url":"001CbYNG2DPisB"},"listen_num":0,"pic_info":{"mid":"","url":"http://y.gtimg.cn/music/common/upload/MUSIC_FOCUS/4569733.png","urlex1":"","urlex2":""},"report":"","sub_title":"","title":"","type":10002}],"id":1,"sub_cube":[],"title":"焦点图"}
             */

            private int code;
            private DataBeanXXXXXXXX data;

            public int getCode() {
                return code;
            }

            public void setCode(int code) {
                this.code = code;
            }

            public DataBeanXXXXXXXX getData() {
                return data;
            }

            public void setData(DataBeanXXXXXXXX data) {
                this.data = data;
            }

            public static class DataBeanXXXXXXXX {
                /**
                 * content : [{"cover":"","id":49809,"jump_info":{"id":0,"mid":"","url":"004HuV4148SBxr"},"listen_num":0,"pic_info":{"mid":"","url":"http://y.gtimg.cn/music/common/upload/MUSIC_FOCUS/4570109.png","urlex1":"","urlex2":""},"report":"","sub_title":"","title":"","type":10002},{"cover":"","id":49815,"jump_info":{"id":0,"mid":"","url":"000d8x3W1TsLsj"},"listen_num":0,"pic_info":{"mid":"","url":"http://y.gtimg.cn/music/common/upload/MUSIC_FOCUS/4570103.png","urlex1":"","urlex2":""},"report":"","sub_title":"","title":"","type":10002},{"cover":"","id":49810,"jump_info":{"id":0,"mid":"","url":"002OrLAT3CDo2r"},"listen_num":0,"pic_info":{"mid":"","url":"http://y.gtimg.cn/music/common/upload/MUSIC_FOCUS/4569338.jpg","urlex1":"","urlex2":""},"report":"","sub_title":"","title":"","type":10002},{"cover":"","id":49811,"jump_info":{"id":0,"mid":"","url":"8823022173"},"listen_num":0,"pic_info":{"mid":"","url":"http://y.gtimg.cn/music/common/upload/MUSIC_FOCUS/4570207.jpg","urlex1":"","urlex2":""},"report":"","sub_title":"","title":"","type":10014},{"cover":"","id":49823,"jump_info":{"id":0,"mid":"","url":"003zwqCS2jwBy3"},"listen_num":0,"pic_info":{"mid":"","url":"http://y.gtimg.cn/music/common/upload/MUSIC_FOCUS/4569917.png","urlex1":"","urlex2":""},"report":"","sub_title":"","title":"","type":10002},{"cover":"","id":49817,"jump_info":{"id":0,"mid":"","url":"002JM30d1RDH8D"},"listen_num":0,"pic_info":{"mid":"","url":"http://y.gtimg.cn/music/common/upload/MUSIC_FOCUS/4569618.png","urlex1":"","urlex2":""},"report":"","sub_title":"","title":"","type":10002},{"cover":"","id":49818,"jump_info":{"id":0,"mid":"","url":"001PxcdB11KhTf"},"listen_num":0,"pic_info":{"mid":"","url":"http://y.gtimg.cn/music/common/upload/MUSIC_FOCUS/4569620.png","urlex1":"","urlex2":""},"report":"","sub_title":"","title":"","type":10002},{"cover":"","id":49820,"jump_info":{"id":0,"mid":"","url":"001GUOmT1Bwuzv"},"listen_num":0,"pic_info":{"mid":"","url":"http://y.gtimg.cn/music/common/upload/MUSIC_FOCUS/4569704.png","urlex1":"","urlex2":""},"report":"","sub_title":"","title":"","type":10002},{"cover":"","id":49821,"jump_info":{"id":0,"mid":"","url":"0041dlcg0MinSa"},"listen_num":0,"pic_info":{"mid":"","url":"http://y.gtimg.cn/music/common/upload/MUSIC_FOCUS/4569710.png","urlex1":"","urlex2":""},"report":"","sub_title":"","title":"","type":10002},{"cover":"","id":49822,"jump_info":{"id":0,"mid":"","url":"001CbYNG2DPisB"},"listen_num":0,"pic_info":{"mid":"","url":"http://y.gtimg.cn/music/common/upload/MUSIC_FOCUS/4569733.png","urlex1":"","urlex2":""},"report":"","sub_title":"","title":"","type":10002}]
                 * id : 1
                 * sub_cube : []
                 * title : 焦点图
                 */

                private int id;
                private String title;
                private List<ContentBean> content;
                private List<?> sub_cube;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public List<ContentBean> getContent() {
                    return content;
                }

                public void setContent(List<ContentBean> content) {
                    this.content = content;
                }

                public List<?> getSub_cube() {
                    return sub_cube;
                }

                public void setSub_cube(List<?> sub_cube) {
                    this.sub_cube = sub_cube;
                }

                public static class ContentBean {
                    /**
                     * cover :
                     * id : 49809
                     * jump_info : {"id":0,"mid":"","url":"004HuV4148SBxr"}
                     * listen_num : 0
                     * pic_info : {"mid":"","url":"http://y.gtimg.cn/music/common/upload/MUSIC_FOCUS/4570109.png","urlex1":"","urlex2":""}
                     * report :
                     * sub_title :
                     * title :
                     * type : 10002
                     */

                    private String cover;
                    private int id;
                    private JumpInfoBean jump_info;
                    private int listen_num;
                    private PicInfoBean pic_info;
                    private String report;
                    private String sub_title;
                    private String title;
                    private int type;

                    public String getCover() {
                        return cover;
                    }

                    public void setCover(String cover) {
                        this.cover = cover;
                    }

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public JumpInfoBean getJump_info() {
                        return jump_info;
                    }

                    public void setJump_info(JumpInfoBean jump_info) {
                        this.jump_info = jump_info;
                    }

                    public int getListen_num() {
                        return listen_num;
                    }

                    public void setListen_num(int listen_num) {
                        this.listen_num = listen_num;
                    }

                    public PicInfoBean getPic_info() {
                        return pic_info;
                    }

                    public void setPic_info(PicInfoBean pic_info) {
                        this.pic_info = pic_info;
                    }

                    public String getReport() {
                        return report;
                    }

                    public void setReport(String report) {
                        this.report = report;
                    }

                    public String getSub_title() {
                        return sub_title;
                    }

                    public void setSub_title(String sub_title) {
                        this.sub_title = sub_title;
                    }

                    public String getTitle() {
                        return title;
                    }

                    public void setTitle(String title) {
                        this.title = title;
                    }

                    public int getType() {
                        return type;
                    }

                    public void setType(int type) {
                        this.type = type;
                    }

                    public static class JumpInfoBean {
                        /**
                         * id : 0
                         * mid :
                         * url : 004HuV4148SBxr
                         */

                        private int id;
                        private String mid;
                        private String url;

                        public int getId() {
                            return id;
                        }

                        public void setId(int id) {
                            this.id = id;
                        }

                        public String getMid() {
                            return mid;
                        }

                        public void setMid(String mid) {
                            this.mid = mid;
                        }

                        public String getUrl() {
                            return url;
                        }

                        public void setUrl(String url) {
                            this.url = url;
                        }
                    }

                    public static class PicInfoBean {
                        /**
                         * mid :
                         * url : http://y.gtimg.cn/music/common/upload/MUSIC_FOCUS/4570109.png
                         * urlex1 :
                         * urlex2 :
                         */

                        private String mid;
                        private String url;
                        private String urlex1;
                        private String urlex2;

                        public String getMid() {
                            return mid;
                        }

                        public void setMid(String mid) {
                            this.mid = mid;
                        }

                        public String getUrl() {
                            return url;
                        }

                        public void setUrl(String url) {
                            this.url = url;
                        }

                        public String getUrlex1() {
                            return urlex1;
                        }

                        public void setUrlex1(String urlex1) {
                            this.urlex1 = urlex1;
                        }

                        public String getUrlex2() {
                            return urlex2;
                        }

                        public void setUrlex2(String urlex2) {
                            this.urlex2 = urlex2;
                        }
                    }
                }
            }
        }
    }
}
