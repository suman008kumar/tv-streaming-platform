package com.example.tv.controller;


import com.example.tv.model.Channel;
import java.util.ArrayList;
import java.util.List;
public class ChannelDataProvider3 {

    public static List<Channel> getChannels() {

        List<Channel> channels = new ArrayList<>();

        channels.add(new Channel(920L, "https://i.imgur.com/oNFOKFI.png", "BHTV (1080p)", "https://sc1.wasidata.com/Bhtv/index.fmp4.m3u8"));
        channels.add(new Channel(921L, "https://i.imgur.com/RLwmrk3.png", "Bibel TV (720p)", "https://bibint01.iptv-playoutcenter.de/bibint01/bibint01.stream_all/playlist.m3u8"));
        channels.add(new Channel(922L, "https://i.imgur.com/k4tbW3W.png", "Bibel TV Impuls (720p)", "https://bibeltv02.iptv-playoutcenter.de/bibeltv02/bibeltv02.stream_1/playlist.m3u8"));
        channels.add(new Channel(923L, "https://i.imgur.com/yIqOcP5.png", "Bibel TV Musik (720p)", "https://bibeltv03.iptv-playoutcenter.de/bibeltv03/bibeltv03.stream_1/playlist.m3u8"));
        channels.add(new Channel(924L, null, "Big 12 Studios", "https://amg01258-raycom-amg01258c7-xumo-us-5514.playouts.now.amagi.tv/playlist.m3u8"));
        channels.add(new Channel(925L, null, "Big 12 Studios (720p) [Geo-blocked]", "https://aegis-cloudfront-1.tubi.video/d61265ac-4c98-4243-8e23-31fff4d399e1/playlist.m3u8"));

        /* 🇮🇳 INDIAN CHANNEL */
        channels.add(new Channel(926L, "https://xstreamcp-assets-msp.streamready.in/assets/LIVETV/LIVECHANNEL/LIVETV_LIVETVCHANNEL_BIG_MAGIC/images/LOGO_HD/LOGO_HD_image.png",
                "Big Magic (576p) 🇮🇳", "http://163.61.227.29:8000/play/a04f/index.m3u8"));

        channels.add(new Channel(927L, "https://upload.wikimedia.org/wikipedia/en/thumb/3/39/Big_Ten_Network_Logo.svg/512px-Big_Ten_Network_Logo.svg.png",
                "Big Ten Network", "https://fl1.moveonjoy.com/BIG_TEN_NETWORK/index.m3u8"));

        channels.add(new Channel(928L, "https://shahid.mbc.net/mediaObject/4e042cb6-500b-4e4c-a8ca-21a5a7a7a71b",
                "Big Time Plus (1080p)", "https://shd-gcp-live.edgenextcdn.net/live/bitmovin-big-time-plus/924283f994779a311c1389698ff7e736/index.m3u8"));

        channels.add(new Channel(929L, null, "Big Time Rush",
                "http://cfd-v4-service-channel-stitcher-use1-1.prd.pluto.tv/stitch/hls/channel/663385cd06839f0008e00e93/master.m3u8"));

        channels.add(new Channel(930L, "https://i.imgur.com/7RVcgiv.png", "Big Time Rush",
                "http://cfd-v4-service-channel-stitcher-use1-1.prd.pluto.tv/stitch/hls/channel/663385cd06839f0008e00e93/master.m3u8"));

        /* 🇮🇳 INDIAN CHANNEL */
        channels.add(new Channel(931L, "https://xstreamcp-assets-msp.streamready.in/assets/LIVETV/LIVECHANNEL/LIVETV_LIVETVCHANNEL_BIG_TV/images/LOGO_HD/image.png",
                "BIG TV (720p) 🇮🇳", "https://cdn-1.pishow.tv/live/1059/master.m3u8"));

        /* 🇮🇳 INDIAN CHANNEL */
        channels.add(new Channel(932L, "https://i.imgur.com/WrNxg2k.png", "Bike (720p) 🇮🇳",
                "http://backup.superstreaming.inaria.me/BikeSmartMobilityDTT/playlist.m3u8"));

        channels.add(new Channel(933L, null, "Billiard TV",
                "http://cfd-v4-service-channel-stitcher-use1-1.prd.pluto.tv/stitch/hls/channel/65df0cff66eec8000897b3a4/master.m3u8"));

        channels.add(new Channel(934L, null, "Billiards+",
                "https://streams2.sofast.tv/WiseM3U8_18/sofast/cleanhls/master.m3u8"));

        /* 🇮🇳 INDIAN CHANNEL */
        channels.add(new Channel(935L, "https://i.imgur.com/GlfrYs7.png", "Blessing TV Tamil (576p) 🇮🇳",
                "http://202.164.50.194:8000/play/a02p/index.m3u8"));

        /* 🇮🇳 INDIAN CHANNEL */
        channels.add(new Channel(936L, "https://i.imgur.com/ugPo6ca.png", "Bollywood Classic 🇮🇳",
                "https://d35j504z0x2vu2.cloudfront.net/v1/master/0bc8e8376bd8417a1b6761138aa41c26c7309312/bollywood-classic/manifest.m3u8"));

        /* 🇮🇳 INDIAN CHANNEL */
        channels.add(new Channel(937L, "https://i.imgur.com/scDKOLS.png", "Bollywood HD 🇮🇳",
                "https://d35j504z0x2vu2.cloudfront.net/v1/master/0bc8e8376bd8417a1b6761138aa41c26c7309312/bollywood-hd/manifest.m3u8"));

        channels.add(new Channel(938L, "https://i.imgur.com/tUgEAUJ.png",
                "Bolton Community Voice Channel (CVC) Education (Bolton CT) (480p)",
                "https://dlttx48mxf9m3.cloudfront.net/vod_clients/bolton/live/ch2/video.m3u8"));

        channels.add(new Channel(939L, "https://i.imgur.com/qLJhNhq.png",
                "Bolton Community Voice Channel (CVC) Government (Bolton CT) (480p)",
                "https://dlttx48mxf9m3.cloudfront.net/vod_clients/bolton/live/ch3/video.m3u8"));

        /*Last 939 Bolton community Voice Channel (cvc) */

        return channels;
    }
}
