package com.androidapp.talent.bean;

import java.util.List;

/**
 * Created by etenel on 2017/7/8.
 */

public class LikeBean {

    /**
     * meta : {"status":0,"server_time":"2017-07-08 11:54:05","account_id":0,"cost":0.58337712287903,"errdata":null,"errmsg":""}
     * version : 1
     * data : {"has_more":true,"num_items":"49","items":{"user_id":"1502","user_name":"张悦然","is_daren":"1","email":"karmakarma@qq.com","user_image":{"self_img":"1","orig":"http://imgs-qn.iliangcang.com/ware/userhead/orig/2/1/1502.jpg?t=1499486044","mid":"http://imgs-qn.iliangcang.com/ware/userhead/mid/2/1/1502.jpg?t=1499486044","tmb":"http://imgs-qn.iliangcang.com/ware/userhead/tmb/2/1/1502.jpg?t=1499486044"},"user_desc":"作家","friend":"0","like_count":"49","recommendation_count":"12","following_count":"26","followed_count":"2444","template_id":"0","goods":[{"goods_id":"35963","goods_image":"http://imgs-qn.iliangcang.com/ware/goods/big/2/35/35963.jpg","goods_name":"金色鸟笼","price":"915.00","owner_id":"0","comment_count":"0","like_count":"499","liked":"0","is_outter":"0","sale_by":"liangcang","promotion_imgurl":"http://imgs-qn.iliangcang.com"},{"goods_id":"27404","goods_image":"http://imgs-qn.iliangcang.com/ware/goods/big/2/27/27404.jpg?t=1392521201","goods_name":"Glasscape鱼缸","price":"495.20","owner_id":"597","comment_count":"25","like_count":"946","liked":"0","is_outter":"1","sale_by":"other","promotion_imgurl":"http://imgs-qn.iliangcang.com"},{"goods_id":"32302","goods_image":"http://imgs-qn.iliangcang.com/ware/goods/big/2/32/32302.jpg?t=1392521199","goods_name":"Disney Pinocchio皮诺曹 匹诺曹树脂挂饰/摆件","price":"268.00","owner_id":"1093","comment_count":"1","like_count":"445","liked":"0","is_outter":"1","sale_by":"other","promotion_imgurl":"http://imgs-qn.iliangcang.com"},{"goods_id":"32592","goods_image":"http://imgs-qn.iliangcang.com/ware/goods/big/2/32/32592.jpg?t=1392521199","goods_name":"Vitamix 6300 搅拌机","price":"4750.00","owner_id":"26","comment_count":"0","like_count":"325","liked":"0","is_outter":"1","sale_by":"other","promotion_imgurl":"http://imgs-qn.iliangcang.com"},{"goods_id":"33322","goods_image":"http://imgs-qn.iliangcang.com/ware/goods/big/2/33/33322.jpg?t=1390286289","goods_name":"MEZZO 渐变色玻璃杯","price":"288.00","owner_id":"34083","comment_count":"1","like_count":"643","liked":"0","is_outter":"1","sale_by":"other","promotion_imgurl":"http://imgs-qn.iliangcang.com"},{"goods_id":"33627","goods_image":"http://imgs-qn.iliangcang.com/ware/goods/big/2/33/33627.jpg?t=1392521199","goods_name":"Olympia Le-Tan   Manners For Men 刺绣手拿包","price":"11181.63","owner_id":"68","comment_count":"0","like_count":"442","liked":"0","is_outter":"1","sale_by":"other","promotion_imgurl":"http://imgs-qn.iliangcang.com"},{"goods_id":"22356","goods_image":"http://imgs-qn.iliangcang.com/ware/goods/big/2/22/22356.jpg?t=1392521203","goods_name":"CARVEN Oxford Bib","price":"866.61","owner_id":"220","comment_count":"0","like_count":"33","liked":"0","is_outter":"1","sale_by":"other","promotion_imgurl":"http://imgs-qn.iliangcang.com"},{"goods_id":"14781","goods_image":"http://imgs-qn.iliangcang.com/ware/goods/big/2/14/14781.jpg?t=1392521206","goods_name":"Moschino 折纸船手拎包","price":"4800.00","owner_id":"33","comment_count":"0","like_count":"105","liked":"0","is_outter":"1","sale_by":"other","promotion_imgurl":"http://imgs-qn.iliangcang.com"},{"goods_id":"4231","goods_image":"http://imgs-qn.iliangcang.com/ware/goods/big/2/4/4231.jpg?t=1392521213","goods_name":"木制雪茄包","price":"1779.12","owner_id":"23","comment_count":"2","like_count":"46","liked":"0","is_outter":"1","sale_by":"other","promotion_imgurl":"http://imgs-qn.iliangcang.com"},{"goods_id":"13700","goods_image":"http://imgs-qn.iliangcang.com/ware/goods/big/2/13/13700.jpg?t=1392521207","goods_name":"habitrol戒烟咀嚼胶4mg","price":"148.00","owner_id":"18","comment_count":"1","like_count":"42","liked":"0","is_outter":"1","sale_by":"other","promotion_imgurl":"http://imgs-qn.iliangcang.com"}]}}
     */

    private MetaBean meta;
    private int version;
    private DataBean data;

    public MetaBean getMeta() {
        return meta;
    }

    public void setMeta(MetaBean meta) {
        this.meta = meta;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class MetaBean {
        /**
         * status : 0
         * server_time : 2017-07-08 11:54:05
         * account_id : 0
         * cost : 0.58337712287903
         * errdata : null
         * errmsg :
         */

        private int status;
        private String server_time;
        private int account_id;
        private double cost;
        private Object errdata;
        private String errmsg;

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getServer_time() {
            return server_time;
        }

        public void setServer_time(String server_time) {
            this.server_time = server_time;
        }

        public int getAccount_id() {
            return account_id;
        }

        public void setAccount_id(int account_id) {
            this.account_id = account_id;
        }

        public double getCost() {
            return cost;
        }

        public void setCost(double cost) {
            this.cost = cost;
        }

        public Object getErrdata() {
            return errdata;
        }

        public void setErrdata(Object errdata) {
            this.errdata = errdata;
        }

        public String getErrmsg() {
            return errmsg;
        }

        public void setErrmsg(String errmsg) {
            this.errmsg = errmsg;
        }
    }

    public static class DataBean {
        /**
         * has_more : true
         * num_items : 49
         * items : {"user_id":"1502","user_name":"张悦然","is_daren":"1","email":"karmakarma@qq.com","user_image":{"self_img":"1","orig":"http://imgs-qn.iliangcang.com/ware/userhead/orig/2/1/1502.jpg?t=1499486044","mid":"http://imgs-qn.iliangcang.com/ware/userhead/mid/2/1/1502.jpg?t=1499486044","tmb":"http://imgs-qn.iliangcang.com/ware/userhead/tmb/2/1/1502.jpg?t=1499486044"},"user_desc":"作家","friend":"0","like_count":"49","recommendation_count":"12","following_count":"26","followed_count":"2444","template_id":"0","goods":[{"goods_id":"35963","goods_image":"http://imgs-qn.iliangcang.com/ware/goods/big/2/35/35963.jpg","goods_name":"金色鸟笼","price":"915.00","owner_id":"0","comment_count":"0","like_count":"499","liked":"0","is_outter":"0","sale_by":"liangcang","promotion_imgurl":"http://imgs-qn.iliangcang.com"},{"goods_id":"27404","goods_image":"http://imgs-qn.iliangcang.com/ware/goods/big/2/27/27404.jpg?t=1392521201","goods_name":"Glasscape鱼缸","price":"495.20","owner_id":"597","comment_count":"25","like_count":"946","liked":"0","is_outter":"1","sale_by":"other","promotion_imgurl":"http://imgs-qn.iliangcang.com"},{"goods_id":"32302","goods_image":"http://imgs-qn.iliangcang.com/ware/goods/big/2/32/32302.jpg?t=1392521199","goods_name":"Disney Pinocchio皮诺曹 匹诺曹树脂挂饰/摆件","price":"268.00","owner_id":"1093","comment_count":"1","like_count":"445","liked":"0","is_outter":"1","sale_by":"other","promotion_imgurl":"http://imgs-qn.iliangcang.com"},{"goods_id":"32592","goods_image":"http://imgs-qn.iliangcang.com/ware/goods/big/2/32/32592.jpg?t=1392521199","goods_name":"Vitamix 6300 搅拌机","price":"4750.00","owner_id":"26","comment_count":"0","like_count":"325","liked":"0","is_outter":"1","sale_by":"other","promotion_imgurl":"http://imgs-qn.iliangcang.com"},{"goods_id":"33322","goods_image":"http://imgs-qn.iliangcang.com/ware/goods/big/2/33/33322.jpg?t=1390286289","goods_name":"MEZZO 渐变色玻璃杯","price":"288.00","owner_id":"34083","comment_count":"1","like_count":"643","liked":"0","is_outter":"1","sale_by":"other","promotion_imgurl":"http://imgs-qn.iliangcang.com"},{"goods_id":"33627","goods_image":"http://imgs-qn.iliangcang.com/ware/goods/big/2/33/33627.jpg?t=1392521199","goods_name":"Olympia Le-Tan   Manners For Men 刺绣手拿包","price":"11181.63","owner_id":"68","comment_count":"0","like_count":"442","liked":"0","is_outter":"1","sale_by":"other","promotion_imgurl":"http://imgs-qn.iliangcang.com"},{"goods_id":"22356","goods_image":"http://imgs-qn.iliangcang.com/ware/goods/big/2/22/22356.jpg?t=1392521203","goods_name":"CARVEN Oxford Bib","price":"866.61","owner_id":"220","comment_count":"0","like_count":"33","liked":"0","is_outter":"1","sale_by":"other","promotion_imgurl":"http://imgs-qn.iliangcang.com"},{"goods_id":"14781","goods_image":"http://imgs-qn.iliangcang.com/ware/goods/big/2/14/14781.jpg?t=1392521206","goods_name":"Moschino 折纸船手拎包","price":"4800.00","owner_id":"33","comment_count":"0","like_count":"105","liked":"0","is_outter":"1","sale_by":"other","promotion_imgurl":"http://imgs-qn.iliangcang.com"},{"goods_id":"4231","goods_image":"http://imgs-qn.iliangcang.com/ware/goods/big/2/4/4231.jpg?t=1392521213","goods_name":"木制雪茄包","price":"1779.12","owner_id":"23","comment_count":"2","like_count":"46","liked":"0","is_outter":"1","sale_by":"other","promotion_imgurl":"http://imgs-qn.iliangcang.com"},{"goods_id":"13700","goods_image":"http://imgs-qn.iliangcang.com/ware/goods/big/2/13/13700.jpg?t=1392521207","goods_name":"habitrol戒烟咀嚼胶4mg","price":"148.00","owner_id":"18","comment_count":"1","like_count":"42","liked":"0","is_outter":"1","sale_by":"other","promotion_imgurl":"http://imgs-qn.iliangcang.com"}]}
         */

        private boolean has_more;
        private String num_items;
        private ItemsBean items;

        public boolean isHas_more() {
            return has_more;
        }

        public void setHas_more(boolean has_more) {
            this.has_more = has_more;
        }

        public String getNum_items() {
            return num_items;
        }

        public void setNum_items(String num_items) {
            this.num_items = num_items;
        }

        public ItemsBean getItems() {
            return items;
        }

        public void setItems(ItemsBean items) {
            this.items = items;
        }

        public static class ItemsBean {
            /**
             * user_id : 1502
             * user_name : 张悦然
             * is_daren : 1
             * email : karmakarma@qq.com
             * user_image : {"self_img":"1","orig":"http://imgs-qn.iliangcang.com/ware/userhead/orig/2/1/1502.jpg?t=1499486044","mid":"http://imgs-qn.iliangcang.com/ware/userhead/mid/2/1/1502.jpg?t=1499486044","tmb":"http://imgs-qn.iliangcang.com/ware/userhead/tmb/2/1/1502.jpg?t=1499486044"}
             * user_desc : 作家
             * friend : 0
             * like_count : 49
             * recommendation_count : 12
             * following_count : 26
             * followed_count : 2444
             * template_id : 0
             * goods : [{"goods_id":"35963","goods_image":"http://imgs-qn.iliangcang.com/ware/goods/big/2/35/35963.jpg","goods_name":"金色鸟笼","price":"915.00","owner_id":"0","comment_count":"0","like_count":"499","liked":"0","is_outter":"0","sale_by":"liangcang","promotion_imgurl":"http://imgs-qn.iliangcang.com"},{"goods_id":"27404","goods_image":"http://imgs-qn.iliangcang.com/ware/goods/big/2/27/27404.jpg?t=1392521201","goods_name":"Glasscape鱼缸","price":"495.20","owner_id":"597","comment_count":"25","like_count":"946","liked":"0","is_outter":"1","sale_by":"other","promotion_imgurl":"http://imgs-qn.iliangcang.com"},{"goods_id":"32302","goods_image":"http://imgs-qn.iliangcang.com/ware/goods/big/2/32/32302.jpg?t=1392521199","goods_name":"Disney Pinocchio皮诺曹 匹诺曹树脂挂饰/摆件","price":"268.00","owner_id":"1093","comment_count":"1","like_count":"445","liked":"0","is_outter":"1","sale_by":"other","promotion_imgurl":"http://imgs-qn.iliangcang.com"},{"goods_id":"32592","goods_image":"http://imgs-qn.iliangcang.com/ware/goods/big/2/32/32592.jpg?t=1392521199","goods_name":"Vitamix 6300 搅拌机","price":"4750.00","owner_id":"26","comment_count":"0","like_count":"325","liked":"0","is_outter":"1","sale_by":"other","promotion_imgurl":"http://imgs-qn.iliangcang.com"},{"goods_id":"33322","goods_image":"http://imgs-qn.iliangcang.com/ware/goods/big/2/33/33322.jpg?t=1390286289","goods_name":"MEZZO 渐变色玻璃杯","price":"288.00","owner_id":"34083","comment_count":"1","like_count":"643","liked":"0","is_outter":"1","sale_by":"other","promotion_imgurl":"http://imgs-qn.iliangcang.com"},{"goods_id":"33627","goods_image":"http://imgs-qn.iliangcang.com/ware/goods/big/2/33/33627.jpg?t=1392521199","goods_name":"Olympia Le-Tan   Manners For Men 刺绣手拿包","price":"11181.63","owner_id":"68","comment_count":"0","like_count":"442","liked":"0","is_outter":"1","sale_by":"other","promotion_imgurl":"http://imgs-qn.iliangcang.com"},{"goods_id":"22356","goods_image":"http://imgs-qn.iliangcang.com/ware/goods/big/2/22/22356.jpg?t=1392521203","goods_name":"CARVEN Oxford Bib","price":"866.61","owner_id":"220","comment_count":"0","like_count":"33","liked":"0","is_outter":"1","sale_by":"other","promotion_imgurl":"http://imgs-qn.iliangcang.com"},{"goods_id":"14781","goods_image":"http://imgs-qn.iliangcang.com/ware/goods/big/2/14/14781.jpg?t=1392521206","goods_name":"Moschino 折纸船手拎包","price":"4800.00","owner_id":"33","comment_count":"0","like_count":"105","liked":"0","is_outter":"1","sale_by":"other","promotion_imgurl":"http://imgs-qn.iliangcang.com"},{"goods_id":"4231","goods_image":"http://imgs-qn.iliangcang.com/ware/goods/big/2/4/4231.jpg?t=1392521213","goods_name":"木制雪茄包","price":"1779.12","owner_id":"23","comment_count":"2","like_count":"46","liked":"0","is_outter":"1","sale_by":"other","promotion_imgurl":"http://imgs-qn.iliangcang.com"},{"goods_id":"13700","goods_image":"http://imgs-qn.iliangcang.com/ware/goods/big/2/13/13700.jpg?t=1392521207","goods_name":"habitrol戒烟咀嚼胶4mg","price":"148.00","owner_id":"18","comment_count":"1","like_count":"42","liked":"0","is_outter":"1","sale_by":"other","promotion_imgurl":"http://imgs-qn.iliangcang.com"}]
             */

            private String user_id;
            private String user_name;
            private String is_daren;
            private String email;
            private UserImageBean user_image;
            private String user_desc;
            private String friend;
            private String like_count;
            private String recommendation_count;
            private String following_count;
            private String followed_count;
            private String template_id;
            private List<GoodsBean> goods;

            public String getUser_id() {
                return user_id;
            }

            public void setUser_id(String user_id) {
                this.user_id = user_id;
            }

            public String getUser_name() {
                return user_name;
            }

            public void setUser_name(String user_name) {
                this.user_name = user_name;
            }

            public String getIs_daren() {
                return is_daren;
            }

            public void setIs_daren(String is_daren) {
                this.is_daren = is_daren;
            }

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }

            public UserImageBean getUser_image() {
                return user_image;
            }

            public void setUser_image(UserImageBean user_image) {
                this.user_image = user_image;
            }

            public String getUser_desc() {
                return user_desc;
            }

            public void setUser_desc(String user_desc) {
                this.user_desc = user_desc;
            }

            public String getFriend() {
                return friend;
            }

            public void setFriend(String friend) {
                this.friend = friend;
            }

            public String getLike_count() {
                return like_count;
            }

            public void setLike_count(String like_count) {
                this.like_count = like_count;
            }

            public String getRecommendation_count() {
                return recommendation_count;
            }

            public void setRecommendation_count(String recommendation_count) {
                this.recommendation_count = recommendation_count;
            }

            public String getFollowing_count() {
                return following_count;
            }

            public void setFollowing_count(String following_count) {
                this.following_count = following_count;
            }

            public String getFollowed_count() {
                return followed_count;
            }

            public void setFollowed_count(String followed_count) {
                this.followed_count = followed_count;
            }

            public String getTemplate_id() {
                return template_id;
            }

            public void setTemplate_id(String template_id) {
                this.template_id = template_id;
            }

            public List<GoodsBean> getGoods() {
                return goods;
            }

            public void setGoods(List<GoodsBean> goods) {
                this.goods = goods;
            }

            public static class UserImageBean {
                /**
                 * self_img : 1
                 * orig : http://imgs-qn.iliangcang.com/ware/userhead/orig/2/1/1502.jpg?t=1499486044
                 * mid : http://imgs-qn.iliangcang.com/ware/userhead/mid/2/1/1502.jpg?t=1499486044
                 * tmb : http://imgs-qn.iliangcang.com/ware/userhead/tmb/2/1/1502.jpg?t=1499486044
                 */

                private String self_img;
                private String orig;
                private String mid;
                private String tmb;

                public String getSelf_img() {
                    return self_img;
                }

                public void setSelf_img(String self_img) {
                    this.self_img = self_img;
                }

                public String getOrig() {
                    return orig;
                }

                public void setOrig(String orig) {
                    this.orig = orig;
                }

                public String getMid() {
                    return mid;
                }

                public void setMid(String mid) {
                    this.mid = mid;
                }

                public String getTmb() {
                    return tmb;
                }

                public void setTmb(String tmb) {
                    this.tmb = tmb;
                }
            }

            public static class GoodsBean {
                /**
                 * goods_id : 35963
                 * goods_image : http://imgs-qn.iliangcang.com/ware/goods/big/2/35/35963.jpg
                 * goods_name : 金色鸟笼
                 * price : 915.00
                 * owner_id : 0
                 * comment_count : 0
                 * like_count : 499
                 * liked : 0
                 * is_outter : 0
                 * sale_by : liangcang
                 * promotion_imgurl : http://imgs-qn.iliangcang.com
                 */

                private String goods_id;
                private String goods_image;
                private String goods_name;
                private String price;
                private String owner_id;
                private String comment_count;
                private String like_count;
                private String liked;
                private String is_outter;
                private String sale_by;
                private String promotion_imgurl;

                public String getGoods_id() {
                    return goods_id;
                }

                public void setGoods_id(String goods_id) {
                    this.goods_id = goods_id;
                }

                public String getGoods_image() {
                    return goods_image;
                }

                public void setGoods_image(String goods_image) {
                    this.goods_image = goods_image;
                }

                public String getGoods_name() {
                    return goods_name;
                }

                public void setGoods_name(String goods_name) {
                    this.goods_name = goods_name;
                }

                public String getPrice() {
                    return price;
                }

                public void setPrice(String price) {
                    this.price = price;
                }

                public String getOwner_id() {
                    return owner_id;
                }

                public void setOwner_id(String owner_id) {
                    this.owner_id = owner_id;
                }

                public String getComment_count() {
                    return comment_count;
                }

                public void setComment_count(String comment_count) {
                    this.comment_count = comment_count;
                }

                public String getLike_count() {
                    return like_count;
                }

                public void setLike_count(String like_count) {
                    this.like_count = like_count;
                }

                public String getLiked() {
                    return liked;
                }

                public void setLiked(String liked) {
                    this.liked = liked;
                }

                public String getIs_outter() {
                    return is_outter;
                }

                public void setIs_outter(String is_outter) {
                    this.is_outter = is_outter;
                }

                public String getSale_by() {
                    return sale_by;
                }

                public void setSale_by(String sale_by) {
                    this.sale_by = sale_by;
                }

                public String getPromotion_imgurl() {
                    return promotion_imgurl;
                }

                public void setPromotion_imgurl(String promotion_imgurl) {
                    this.promotion_imgurl = promotion_imgurl;
                }
            }
        }
    }
}
