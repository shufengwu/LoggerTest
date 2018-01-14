package com.example.wushufeng.loggertest;

import java.util.List;

/**
 * Created by wushufeng on 2018/1/14.
 */

public class WeatherBean {

    /**
     * date : 20180114
     * message : Success !
     * status : 200
     * city : 北京
     * count : 956
     * data : {"shidu":"61%","pm25":196,"pm10":214,"quality":"重度污染","wendu":"-6","ganmao":"老年人及心脏、呼吸系统疾病患者人群应停留在室内，停止户外运动，一般人群减少户外运动","yesterday":{"date":"13日星期六","sunrise":"07:36","high":"高温 3.0℃","low":"低温 -7.0℃","sunset":"17:10","aqi":91,"fx":"南风","fl":"<3级","type":"多云","notice":"绵绵的云朵，形状千变万化"},"forecast":[{"date":"14日星期日","sunrise":"07:35","high":"高温 6.0℃","low":"低温 -6.0℃","sunset":"17:11","aqi":159,"fx":"西北风","fl":"<3级","type":"晴","notice":"阳光明媚，带着好心情出发吧！"},{"date":"15日星期一","sunrise":"07:35","high":"高温 2.0℃","low":"低温 -5.0℃","sunset":"17:13","aqi":124,"fx":"东南风","fl":"<3级","type":"多云","notice":"最宜出门的天气，别在家宅啦"},{"date":"16日星期二","sunrise":"07:35","high":"高温 5.0℃","low":"低温 -6.0℃","sunset":"17:14","aqi":144,"fx":"西南风","fl":"<3级","type":"晴","notice":"阳光明媚，带着好心情出发吧！"},{"date":"17日星期三","sunrise":"07:34","high":"高温 3.0℃","low":"低温 -5.0℃","sunset":"17:15","aqi":150,"fx":"北风","fl":"<3级","type":"阴","notice":"不要被阴云遮挡住一天的好心情"},{"date":"18日星期四","sunrise":"07:34","high":"高温 3.0℃","low":"低温 -7.0℃","sunset":"17:16","aqi":81,"fx":"西南风","fl":"<3级","type":"晴","notice":"阳光明媚，带着好心情出发吧！"}]}
     */

    private String date;
    private String message;
    private int status;
    private String city;
    private int count;
    private DataBean data;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * shidu : 61%
         * pm25 : 196
         * pm10 : 214
         * quality : 重度污染
         * wendu : -6
         * ganmao : 老年人及心脏、呼吸系统疾病患者人群应停留在室内，停止户外运动，一般人群减少户外运动
         * yesterday : {"date":"13日星期六","sunrise":"07:36","high":"高温 3.0℃","low":"低温 -7.0℃","sunset":"17:10","aqi":91,"fx":"南风","fl":"<3级","type":"多云","notice":"绵绵的云朵，形状千变万化"}
         * forecast : [{"date":"14日星期日","sunrise":"07:35","high":"高温 6.0℃","low":"低温 -6.0℃","sunset":"17:11","aqi":159,"fx":"西北风","fl":"<3级","type":"晴","notice":"阳光明媚，带着好心情出发吧！"},{"date":"15日星期一","sunrise":"07:35","high":"高温 2.0℃","low":"低温 -5.0℃","sunset":"17:13","aqi":124,"fx":"东南风","fl":"<3级","type":"多云","notice":"最宜出门的天气，别在家宅啦"},{"date":"16日星期二","sunrise":"07:35","high":"高温 5.0℃","low":"低温 -6.0℃","sunset":"17:14","aqi":144,"fx":"西南风","fl":"<3级","type":"晴","notice":"阳光明媚，带着好心情出发吧！"},{"date":"17日星期三","sunrise":"07:34","high":"高温 3.0℃","low":"低温 -5.0℃","sunset":"17:15","aqi":150,"fx":"北风","fl":"<3级","type":"阴","notice":"不要被阴云遮挡住一天的好心情"},{"date":"18日星期四","sunrise":"07:34","high":"高温 3.0℃","low":"低温 -7.0℃","sunset":"17:16","aqi":81,"fx":"西南风","fl":"<3级","type":"晴","notice":"阳光明媚，带着好心情出发吧！"}]
         */

        private String shidu;
        private int pm25;
        private int pm10;
        private String quality;
        private String wendu;
        private String ganmao;
        private YesterdayBean yesterday;
        private List<ForecastBean> forecast;

        public String getShidu() {
            return shidu;
        }

        public void setShidu(String shidu) {
            this.shidu = shidu;
        }

        public int getPm25() {
            return pm25;
        }

        public void setPm25(int pm25) {
            this.pm25 = pm25;
        }

        public int getPm10() {
            return pm10;
        }

        public void setPm10(int pm10) {
            this.pm10 = pm10;
        }

        public String getQuality() {
            return quality;
        }

        public void setQuality(String quality) {
            this.quality = quality;
        }

        public String getWendu() {
            return wendu;
        }

        public void setWendu(String wendu) {
            this.wendu = wendu;
        }

        public String getGanmao() {
            return ganmao;
        }

        public void setGanmao(String ganmao) {
            this.ganmao = ganmao;
        }

        public YesterdayBean getYesterday() {
            return yesterday;
        }

        public void setYesterday(YesterdayBean yesterday) {
            this.yesterday = yesterday;
        }

        public List<ForecastBean> getForecast() {
            return forecast;
        }

        public void setForecast(List<ForecastBean> forecast) {
            this.forecast = forecast;
        }

        public static class YesterdayBean {
            /**
             * date : 13日星期六
             * sunrise : 07:36
             * high : 高温 3.0℃
             * low : 低温 -7.0℃
             * sunset : 17:10
             * aqi : 91
             * fx : 南风
             * fl : <3级
             * type : 多云
             * notice : 绵绵的云朵，形状千变万化
             */

            private String date;
            private String sunrise;
            private String high;
            private String low;
            private String sunset;
            private int aqi;
            private String fx;
            private String fl;
            private String type;
            private String notice;

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getSunrise() {
                return sunrise;
            }

            public void setSunrise(String sunrise) {
                this.sunrise = sunrise;
            }

            public String getHigh() {
                return high;
            }

            public void setHigh(String high) {
                this.high = high;
            }

            public String getLow() {
                return low;
            }

            public void setLow(String low) {
                this.low = low;
            }

            public String getSunset() {
                return sunset;
            }

            public void setSunset(String sunset) {
                this.sunset = sunset;
            }

            public int getAqi() {
                return aqi;
            }

            public void setAqi(int aqi) {
                this.aqi = aqi;
            }

            public String getFx() {
                return fx;
            }

            public void setFx(String fx) {
                this.fx = fx;
            }

            public String getFl() {
                return fl;
            }

            public void setFl(String fl) {
                this.fl = fl;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getNotice() {
                return notice;
            }

            public void setNotice(String notice) {
                this.notice = notice;
            }

            @Override
            public String toString() {
                return "YesterdayBean{" +
                        "date='" + date + '\'' +
                        ", sunrise='" + sunrise + '\'' +
                        ", high='" + high + '\'' +
                        ", low='" + low + '\'' +
                        ", sunset='" + sunset + '\'' +
                        ", aqi=" + aqi +
                        ", fx='" + fx + '\'' +
                        ", fl='" + fl + '\'' +
                        ", type='" + type + '\'' +
                        ", notice='" + notice + '\'' +
                        '}';
            }
        }

        public static class ForecastBean {
            /**
             * date : 14日星期日
             * sunrise : 07:35
             * high : 高温 6.0℃
             * low : 低温 -6.0℃
             * sunset : 17:11
             * aqi : 159
             * fx : 西北风
             * fl : <3级
             * type : 晴
             * notice : 阳光明媚，带着好心情出发吧！
             */

            private String date;
            private String sunrise;
            private String high;
            private String low;
            private String sunset;
            private int aqi;
            private String fx;
            private String fl;
            private String type;
            private String notice;

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getSunrise() {
                return sunrise;
            }

            public void setSunrise(String sunrise) {
                this.sunrise = sunrise;
            }

            public String getHigh() {
                return high;
            }

            public void setHigh(String high) {
                this.high = high;
            }

            public String getLow() {
                return low;
            }

            public void setLow(String low) {
                this.low = low;
            }

            public String getSunset() {
                return sunset;
            }

            public void setSunset(String sunset) {
                this.sunset = sunset;
            }

            public int getAqi() {
                return aqi;
            }

            public void setAqi(int aqi) {
                this.aqi = aqi;
            }

            public String getFx() {
                return fx;
            }

            public void setFx(String fx) {
                this.fx = fx;
            }

            public String getFl() {
                return fl;
            }

            public void setFl(String fl) {
                this.fl = fl;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getNotice() {
                return notice;
            }

            public void setNotice(String notice) {
                this.notice = notice;
            }

            @Override
            public String toString() {
                return "ForecastBean{" +
                        "date='" + date + '\'' +
                        ", sunrise='" + sunrise + '\'' +
                        ", high='" + high + '\'' +
                        ", low='" + low + '\'' +
                        ", sunset='" + sunset + '\'' +
                        ", aqi=" + aqi +
                        ", fx='" + fx + '\'' +
                        ", fl='" + fl + '\'' +
                        ", type='" + type + '\'' +
                        ", notice='" + notice + '\'' +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "shidu='" + shidu + '\'' +
                    ", pm25=" + pm25 +
                    ", pm10=" + pm10 +
                    ", quality='" + quality + '\'' +
                    ", wendu='" + wendu + '\'' +
                    ", ganmao='" + ganmao + '\'' +
                    ", yesterday=" + yesterday +
                    ", forecast=" + forecast +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "WeatherBean{" +
                "date='" + date + '\'' +
                ", message='" + message + '\'' +
                ", status=" + status +
                ", city='" + city + '\'' +
                ", count=" + count +
                ", data=" + data +
                '}';
    }
}
