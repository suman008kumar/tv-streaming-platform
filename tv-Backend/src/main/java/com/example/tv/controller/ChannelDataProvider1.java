package com.example.tv.controller;

import com.example.tv.model.Channel;
import java.util.ArrayList;
import java.util.List;

public class ChannelDataProvider1 {

    public static List<Channel> getChannels() {

        List<Channel> channels = new ArrayList<>();

        channels.add(new Channel(
                1L,
                "https://i.imgur.com/pzU6FrQ.png",
                "1Music Channel Hungary (576p)",
                "http://1music.hu/1music.m3u8"
        ));

        channels.add(new Channel(
                2L,
                "https://i.imgur.com/FSkYLPK.png",
                "1TV (720p)",
                "https://tv.cdn.xsg.ge/gpb-1tv/index.m3u8"
        ));

        // example: logo null → frontend fallback use karega
        channels.add(new Channel(
                3L,
                "https://static.vecteezy.com/system/resources/thumbnails/023/103/744/small/not-available-rubber-stamp-seal-vector.jpg",
                "Demo Channel (No Logo)",
                "https://test-streams.mux.dev/x36xhzz/x36xhzz.m3u8"
        ));
        channels.add(new Channel(4L, "https://i.imgur.com/slSUDNX.png", "1-2-3 TV (270p)",
                "https://123tv-mx1.flex-cdn.net/index.m3u8"));

        channels.add(new Channel(5L, "https://i.imgur.com/XfkbTrU.png", "1Almere TV (720p)",
                "https://d3472rjicrodic.cloudfront.net/nlpo/clr-nlpo/709d5260/index.m3u8"));

        channels.add(new Channel(6L, "https://i.postimg.cc/cCPc5tyk/1kzntv.png", "1KZN TV (576p)",
                "https://cdn.freevisiontv.co.za/sttv/smil:1kzn.stream.smil/playlist.m3u8"));

        channels.add(new Channel(7L, "https://i.imgur.com/pzU6FrQ.png", "1Music Channel Hungary (576p)",
                "http://1music.hu/1music.m3u8"));

        channels.add(new Channel(8L, "https://i.imgur.com/FSkYLPK.png", "1TV (720p)",
                "https://tv.cdn.xsg.ge/gpb-1tv/index.m3u8"));

        channels.add(new Channel(9L, "https://i.imgur.com/ftiuNK3.png", "1Twente TV (1080p)",
                "https://ms7.mx-cd.net/dtv-11/198-989148/1Twente_TV.smil/chunklist_w954512639_b4292608_slNLD.m3u8"));

        channels.add(new Channel(10L, "https://i.ibb.co/jwM8DFG/2GB-1.png", "2GB Sydney (1080p)",
                "https://2gblive.akamaized.net/hls/live/2033805/2GB/index.m3u8"));

        channels.add(new Channel(11L, "https://i.imgur.com/MvpntzA.png", "2M Monde",
                "https://cdn-globecast.akamaized.net/live/eds/2m_monde/hls_video_ts_tuhawxpiemz257adfc/2m_monde.m3u8"));

        channels.add(new Channel(12L, "https://i.imgur.com/MvpntzA.png", "2M Monde +1 (1080p)",
                "https://d2qh3gh0k5vp3v.cloudfront.net/v1/master/3722c60a815c199d9c0ef36c5b73da68a62b09d1/cc-n6pess5lwbghr/2M_ES.m3u8"));

        channels.add(new Channel(13L, "https://i.imgur.com/WByVBZf.png", "2STV",
                "http://69.64.57.208/2stv/playlist.m3u8"));

        channels.add(new Channel(14L, "https://i.imgur.com/FJBL6zI.png", "2TV (720p)",
                "https://tv.cdn.xsg.ge/gpb-2tv/index.m3u8"));

        channels.add(new Channel(15L, "https://www.tvpolsat.info/wp-content/uploads/2023/03/2x2-logo.png", "2x2 (1080p)",
                "https://liveovh011.cda.pl/enc117/2x2hdraw/2x2hdraw.m3u8"));

        channels.add(new Channel(16L, "https://i.imgur.com/fhQFLEl.png", "2х2 [Geo-blocked]",
                "https://zabava-htlive.cdn.ngenix.net/hls/CH_2X2/variant.m3u8"));

        channels.add(new Channel(17L, "https://i.imgur.com/U99CsEc.png", "3ABN Canada",
                "https://3abn.bozztv.com/3abncanada/3ABN/master.m3u8"));

        channels.add(new Channel(18L, "https://i.imgur.com/oNUpXA9.png", "3ABN Dare To Dream Network",
                "https://3abn.bozztv.com/3abn2/d2d_live/smil:d2d_live.smil/playlist.m3u8"));

        channels.add(new Channel(19L, "https://i.imgur.com/bgJQIyW.png", "3ABN English",
                "https://3abn.bozztv.com/3abn2/3abn_live/smil:3abn_live.smil/playlist.m3u8"));

        channels.add(new Channel(20L, "https://i.imgur.com/B5gsM7m.png", "3ABN French",
                "https://3abn.bozztv.com/3abn2/Fre_live/smil:Fre_live.smil/playlist.m3u8"));

        channels.add(new Channel(21L, "https://i.imgur.com/IecOZHR.png", "3ABN International Network",
                "https://3abn.bozztv.com/3abn2/Int_live/smil:Int_live.smil/playlist.m3u8"));

        channels.add(new Channel(22L, "https://i.imgur.com/z3npqO1.png", "3ABN Kids Network",
                "https://3abn.bozztv.com/3abn2/Kids_live/smil:Kids_live.smil/playlist.m3u8"));

        channels.add(new Channel(23L, "https://i.imgur.com/Ugb4AFo.png", "3ABN Latino",
                "https://3abn.bozztv.com/3abn2/Lat_live/smil:Lat_live.smil/playlist.m3u8"));

        channels.add(new Channel(24L, "https://i.imgur.com/iBcqT8L.png", "3ABN Praise Him Music Network",
                "https://3abn.bozztv.com/3abn1/PraiseHim/smil:PraiseHim.smil/playlist.m3u8"));

        channels.add(new Channel(25L, "https://i.imgur.com/zUMUNhe.png", "3ABN Proclaim! Network",
                "https://3abn.bozztv.com/3abn2/Pro_live/smil:Pro_live.smil/playlist.m3u8"));

        channels.add(new Channel(26L, "https://i.imgur.com/mml9lI2.png", "3ABN TV Uganda (720p)",
                "https://3abn.bozztv.com/3abn/3abn_uganda_live/index.m3u8"));

        channels.add(new Channel(27L, "https://i.imgur.com/Z4MdB0S.png", "3AW Melbourne (1080p)",
                "https://3awlive.akamaized.net/hls/live/2032295/3AW/index.m3u8"));

        channels.add(new Channel(28L, "https://i.imgur.com/zXy2kbe.png", "3Cat Càmeres del temps (1080p)",
                "https://directes-tv-int.3catdirectes.cat/live-content/beauties-hls/master.m3u8"));

        channels.add(new Channel(29L, "https://i.imgur.com/wiqdIjd.png", "3Cat El búnquer (1080p)",
                "https://fast-tailor.3catdirectes.cat/v1/channel/bunquer/hls.m3u8"));

        channels.add(new Channel(30L, "https://i.imgur.com/YQvLPT1.png", "3Cat Exclusiu 1",
                "https://directes-tv-cat.3catdirectes.cat/live-content/oca1-hls/master.m3u8"));

        channels.add(new Channel(31L, "https://i.imgur.com/YQvLPT1.png", "3Cat Exclusiu 2",
                "https://directes-tv-cat.3catdirectes.cat/live-content/oca2-hls/master.m3u8"));

        channels.add(new Channel(32L, "https://i.imgur.com/YQvLPT1.png", "3Cat Exclusiu 3",
                "https://directes-tv-cat.3catdirectes.cat/live-content/oca3-hls/master.m3u8"));

        channels.add(new Channel(33L, "https://i.imgur.com/49ZENis.png", "3Cat Plats bruts",
                "https://fast-tailor.3catdirectes.cat/v1/channel/ccma-channel2/hls.m3u8"));

        channels.add(new Channel(34L, "https://upload.wikimedia.org/wikipedia/commons/thumb/6/69/3CatInfo_logo.svg/512px-3CatInfo_logo.svg.png", "3CatInfo",
                "https://directes-tv-int.3catdirectes.cat/live-origin/canal324-hls/master.m3u8"));

        channels.add(new Channel(35L, "https://i.imgur.com/YRiulCU.png", "3HD",
                "https://lb1-live-mv.v2h-cdn.com/hls/ffae/muulk/muulk.m3u8"));

        channels.add(new Channel(36L, "https://upload.wikimedia.org/wikipedia/commons/thumb/8/81/3sat_2019.svg/512px-3sat_2019.svg.png", "3sat HD",
                "https://viamotionhsi.netplus.ch/live/eds/3sathd/browser-HLS8/3sathd.m3u8"));

        channels.add(new Channel(37L, "https://i.imgur.com/im3g7T2.png", "3 Stones TV (240p)",
                "https://goliveafrica.media:9998/live/64d21e682fd26/index.m3u8"));

        channels.add(new Channel(38L, "https://i.postimg.cc/Pr634RNN/4-Afghanistan.png", "4 Afghanistan",
                "https://4afghls.persiana.live/hls/stream.m3u8"));

        channels.add(new Channel(39L, "https://i.ibb.co/1fb5BtN/unnamed.png", "4DmásNoticias TV",
                "https://rds3.desdeparaguay.net/4dmasnoticiastv/4dmasnoticiastv/playlist.m3u8"));

        channels.add(new Channel(40L, "https://i.imgur.com/Na0UCV7.png", "4E (1080p)",
                "http://eu2.tv4e.gr:554/live/smil:myStream.sdp.smil/playlist.m3u8"));

        channels.add(new Channel(41L, "https://static.vecteezy.com/system/resources/thumbnails/023/103/744/small/not-available-rubber-stamp-seal-vector.jpg", "4K Travel TV",
                "https://streams2.sofast.tv/sofastplayout/33c31ac4-51fa-46ae-afd0-0d1fe5e60a80_0_HLS/master.m3u8"));

        channels.add(new Channel(42L, "https://www.aparatchi.com/images/chanells-logo/4kurd.svg", "4 Kurd",
                "https://4kuhls.persiana.live/hls/stream.m3u8"));

        channels.add(new Channel(43L, "https://i.imgur.com/DSAaC2b.png", "4TV News (576p)",
                "https://cdn-4.pishow.tv/live/1007/master.m3u8"));

        channels.add(new Channel(44L, "https://i.imgur.com/PexhKwp.png", "4U TV (720p)",
                "https://hls.4utv.live/hls/stream.m3u8"));

        channels.add(new Channel(45L, "https://static.vecteezy.com/system/resources/thumbnails/023/103/744/small/not-available-rubber-stamp-seal-vector.jpg", "5-Minute Craft (1080p)",
                "https://soul-5mincrafteng-rakuten.amagi.tv/playlist.m3u8"));

        channels.add(new Channel(46L, "https://i.imgur.com/jrGrfof.png", "5AAB TV (720p)",
                "http://158.69.124.9:1935/5aabtv/5aabtv/playlist.m3u8"));

        channels.add(new Channel(47L, "https://i.imgur.com/mSn7ACs.png", "5TV Corrientes (480p)",
                "http://www.coninfo.net:1935/tvcinco/live1/playlist.m3u8"));

        channels.add(new Channel(48L, "https://i.imgur.com/KPXMa3U.png", "5 Канал",
                "https://streaming.televizor-24-tochka.ru/live/8.m3u8"));

        channels.add(new Channel(49L, "https://i.imgur.com/Q9iCxg1.png", "6PR Perth (1080p)",
                "https://6prlive.akamaized.net/hls/live/2033806/6PR/index.m3u8"));

        channels.add(new Channel(50L, "https://i.imgur.com/2nd5Cox.png", "6ter (1080p)",
                "https://viamotionhsi.netplus.ch/live/eds/6ter/browser-HLS8/6ter.m3u8"));

        channels.add(new Channel(51L, "https://i.imgur.com/l3EcRnZ.png", "6 TV Telugu (720p)",
                "https://cdn-1.pishow.tv/live/232/master.m3u8"));

        channels.add(new Channel(52L, "https://jrlist70.pages.dev/list/wise.png", "6 Wise Tv (720p)",
                "https://live.enhdtv.com:8081/8150/index.m3u8"));

        channels.add(new Channel(53L, "https://radio7note.com/img/favicon/android-icon-192x192.png", "7 RadioVisione (720p)",
                "https://stream10.xdevel.com/video1s976543-1932/stream/playlist.m3u8"));

        channels.add(new Channel(54L, "https://i.imgur.com/zDiIhdN.png", "7S Music (576p)",
                "http://202.164.50.194:8000/play/a026/index.m3u8"));

        channels.add(new Channel(55L, "https://i.imgur.com/rF3tpbR.jpeg", "7 STORIA (720p)",
                "https://stream10.xdevel.com/video2s976543-2104/stream/playlist.m3u8"));

        channels.add(new Channel(56L, "https://i.imgur.com/ILfXDRs.png", "7 TeleValencia (576p)",
                "https://play.cdn.enetres.net/9E9557EFCEBB43A89CEC8FBD3C500247022/028/playlist.m3u8"));

        channels.add(new Channel(57L, "https://i.imgur.com/Rte2K3x.png", "7 YOU & ME (720p)",
                "https://stream10.xdevel.com/video0s977798-2239/stream/playlist.m3u8"));

        channels.add(new Channel(58L, "https://i.imgur.com/BTJvvBK.png", "8 La Marina TV (576p)",
                "https://streaming005.gestec-video.com/hls/canal24.m3u8"));

        channels.add(new Channel(59L, "https://i.imgur.com/7ecgGIG.png", "8NTV (1080p)",
                "https://60417ddeaf0d9.streamlock.net/ntv/videontv/playlist.m3u8"));

        channels.add(new Channel(60L, "https://i.imgur.com/Jkx9W88.png", "8TV",
                "http://cdn6.163189.xyz/163189/8tv"));

        channels.add(new Channel(61L, "https://i.imgur.com/KLrfKRn.png", "8XM (576p)",
                "http://66.102.120.18:8000/play/a050/index.m3u8"));

        channels.add(new Channel(62L, "https://i.imgur.com/RLijQI8.png", "9Gem (720p)",
                "https://9now-livestreams.akamaized.net/hls/live/2008311/gem-syd/master.m3u8"));

        channels.add(new Channel(63L, "https://i.imgur.com/RLijQI8.png", "9Go! (720p)",
                "https://9now-livestreams.akamaized.net/hls/live/2008312/go-syd/master.m3u8"));

        channels.add(new Channel(64L, "https://i.imgur.com/WQP3el2.png", "9 la Loma TV (1080p)",
                "https://9laloma.tv/live.m3u8"));

        channels.add(new Channel(65L, "https://i.imgur.com/HlJOrGI.png", "9Life (720p)",
                "https://9now-livestreams.akamaized.net/hls/live/2008313/life-syd/master.m3u8"));

        channels.add(new Channel(66L, "https://i.imgur.com/qubgOi5.png", "9X Jalwa (1080p)",
                "https://d35j504z0x2vu2.cloudfront.net/v1/master/0bc8e8376bd8417a1b6761138aa41c26c7309312/9x-jalwa/master.m3u8"));

        channels.add(new Channel(67L, "https://i.imgur.com/aZ0f85I.png", "9X Jhakaas",
                "https://9xjio.wiseplayout.com/9X_Jhakaas/master.m3u8"));

        channels.add(new Channel(68L, "https://i.imgur.com/MMR1RMF.png", "9X Tashan",
                "https://9xjio.wiseplayout.com/9X_Tashan/master.m3u8"));

        channels.add(new Channel(69L, "https://i.imgur.com/F17QtN2.png", "9XM (576p)",
                "https://d35j504z0x2vu2.cloudfront.net/v1/manifest/0bc8e8376bd8417a1b6761138aa41c26c7309312/9xm/23886666-8fc5-470f-aab1-bd637ed607b1/3.m3u8"));

        channels.add(new Channel(96L, "https://i.imgur.com/yQzXErU.png",
                "Afro Magic Channel",
                "https://video1.getstreamhosting.com:1936/8490/8490/playlist.m3u8"));

        channels.add(new Channel(97L, "https://i.imgur.com/232ndRK.png",
                "Afrobeats (1080p)",
                "https://stream.ecable.tv/afrobeats/index.m3u8"));

        channels.add(new Channel(98L, "https://i.imgur.com/bjaZ3kO.png",
                "Afroculture TV",
                "https://streamtv.cmediahosthosting.net:3836/live/myafroculturelive.m3u8"));

        channels.add(new Channel(99L, "https://i.imgur.com/jvnkrEF.png",
                "AfroLandTV (1080p)",
                "https://alt-al.otteravision.com/alt/al/al.m3u8"));

        channels.add(new Channel(100L, "https://pbs.twimg.com/profile_images/1451668129042599936/Uh-Z6Sh1_400x400.jpg",
                "AfroSport Nigeria",
                "https://newproxy3.vidivu.tv/vidivu_afrosport/index.m3u8"));

        channels.add(new Channel(101L, "https://i.imgur.com/fWlLvRA.png",
                "Afroturk TV (1080p)",
                "https://edge.socialsmart.tv/naturaltv/bant1/playlist.m3u8"));

        channels.add(new Channel(102L, "https://upload.wikimedia.org/wikipedia/fa/thumb/6/6e/Arak_AFTAB.svg/274px-Arak_AFTAB.svg.png",
                "Aftab",
                "https://lenz.splus.ir/PLTV/88888888/224/3221226899/index.m3u8"));

        channels.add(new Channel(103L, null,
                "Aftershock",
                "http://cfd-v4-service-channel-stitcher-use1-1.prd.pluto.tv/stitch/hls/channel/63e36b374e83e70008987c58/master.m3u8"));

        channels.add(new Channel(104L, "https://i.imgur.com/TOB9vmW.png",
                "AFV (720p)",
                "https://linear-12.frequency.stream/dist/plex/12/hls/master/playlist.m3u8"));

        channels.add(new Channel(105L, "https://i.imgur.com/HUK4WXC.png",
                "AFV en Español (720p)",
                "https://linear-46.frequency.stream/dist/plex/46/hls/master/playlist.m3u8"));

        channels.add(new Channel(106L, "https://i.imgur.com/DsGmrnc.png",
                "Agape TV (720p)",
                "https://5fc584f3f19c9.streamlock.net/agape/smil:agape.smil/playlist.m3u8"));

        channels.add(new Channel(107L, "https://i.imgur.com/G7zIVB7.png",
                "Agenda 56 TV",
                "https://cloudflare.streamgato.us:3148/live/agenda56tvlive.m3u8"));

        channels.add(new Channel(108L, "https://i.imgur.com/o6HSfNg.png",
                "Aghani Aghani TV (1080p)",
                "https://streaming-a-1035.cdn.nextologies.com/6zj8y5nemi8a32vyjjbkv0oqx/77pcakd8reik3g8qdqnexlkmq/playlist.m3u8"));

        channels.add(new Channel(109L, "https://i.imgur.com/8ariztD.png",
                "Aghapy Kids (1080p)",
                "https://5b622f07944df.streamlock.net/aghapykids.tv/aghapykids2/playlist.m3u8"));

        channels.add(new Channel(110L, "https://i.postimg.cc/xdCV2Bbr/aghapytv.png",
                "Aghapy TV (1080p)",
                "https://5b622f07944df.streamlock.net/aghapy.tv/aghapy.smil/playlist.m3u8"));

        channels.add(new Channel(111L, "https://i.imgur.com/tPMNDtD.png",
                "Agro TV (480p)",
                "https://restr2.bgtv.bg/agro/hls/agro.m3u8"));

        channels.add(new Channel(112L, "https://i.imgur.com/S7X1PiC.png",
                "Agro TV (360p)",
                "https://agrotv.streamnet.ro/mobile_tv/agrotv.m3u8"));

        channels.add(new Channel(113L, "https://i.imgur.com/aNkP7Zd.png",
                "AgroBrasil TV (720p)",
                "http://45.162.230.234:1935/agrobrasiltv/agrobrasiltv/playlist.m3u8"));

        channels.add(new Channel(114L, "https://i.imgur.com/frd60hR.png",
                "Agrotendencia TV (1080p)",
                "https://5fc584f3f19c9.streamlock.net/agrotendencia/videoagrotendencia_hls1/playlist.m3u8"));

        channels.add(new Channel(115L, "https://i.ibb.co/wpWBsgf/IMG-20230705-154622.jpg",
                "Aguacate TV (1080p)",
                "https://streamtv.intervenhosting.net:3040/hybrid/play.m3u8"));

        channels.add(new Channel(116L, "https://i.imgur.com/lNGJGjy.png",
                "Ahlulbayt TV (1080p)",
                "https://cdn5.iqsat.net/iqb02/35fae546b99b61a038d52353487e8190.sdp/playlist.m3u8"));

        channels.add(new Channel(117L, "https://i.imgur.com/dyJyuXc.png",
                "Ahora TV (720p)",
                "https://tv.livestreaminggroup.info:3513/live/canal35live.m3u8"));

        channels.add(new Channel(118L, "https://i.imgur.com/nJbAbfW.png",
                "Ahupa Visual Radio",
                "https://tv.btnrwanda.com:3349/live/ahupalive.m3u8"));

        channels.add(new Channel(119L, "https://i.imgur.com/svPXoAP.png",
                "Aik News",
                "https://video.primexsports.com/pnn/live/playlist.m3u8"));

        channels.add(new Channel(120L, "https://i.imgur.com/DBvm7YS.png",
                "AION TV (1080p)",
                "https://vdo.aiontelevision.com:3735/live/aiontelevisionlive.m3u8"));

        channels.add(new Channel(121L, "https://i.imgur.com/60vSWW0.png",
                "Aire de Santa Fe (1080p)",
                "https://unlimited1-us.dps.live/airedesantafetv/airedesantafetv.smil/playlist.m3u8"));

        channels.add(new Channel(122L, "https://i.imgur.com/n9sZsWv.jpeg",
                "AIT National (576p)",
                "https://webstreaming.viewmedia.tv/web_036/Stream/playlist.m3u8"));

        channels.add(new Channel(123L, "https://i.imgur.com/hVNIwgE.png",
                "Ajman TV (1080p)",
                "https://cdn1.logichost.in/ajmantv/live/playlist.m3u8"));

        channels.add(new Channel(124L, "https://i.imgur.com/i6Y7beR.jpg",
                "Ajyal TV (720p)",
                "http://htvmada.mada.ps:8888/ajyal/index.m3u8"));

        channels.add(new Channel(125L, "https://i.imgur.com/K81vNbk.png",
                "Akaal Channel",
                "https://cdn-globecast.akamaized.net/live/eds/akaal_tv/hls1_smart_akaal/akaal_tv.m3u8"));

        channels.add(new Channel(126L, "https://www.akaku.org/wp-content/uploads/bb-plugin/cache/Channel53-147x150-square.png",
                "Akaku 53 (Hawaii)",
                "https://castus-vod-dev.s3.amazonaws.com/vod_clients/akaku/live/ch1/video.m3u8"));

        channels.add(new Channel(127L, "https://www.akaku.org/wp-content/uploads/bb-plugin/cache/Channel54-147x150-square.png",
                "Akaku 54 (Hawaii)",
                "https://castus-vod-dev.s3.amazonaws.com/vod_clients/akaku/live/ch2/video.m3u8"));

        channels.add(new Channel(128L, "https://www.akaku.org/wp-content/uploads/bb-plugin/cache/Channel55-147x150-square.png",
                "Akaku 55 (Hawaii)",
                "https://castus-vod-dev.s3.amazonaws.com/vod_clients/akaku/live/ch3/video.m3u8"));

        channels.add(new Channel(129L, "https://i.imgur.com/XRTfoSp.png",
                "AKC TV (1080p)",
                "https://broadcast.blivenyc.com/speed/broadcast/22/desktop-playlist.m3u8"));

        channels.add(new Channel(130L, "https://i.imgur.com/66avgdk.png",
                "AKC TV Meet The Breeds",
                "https://install.akctvcontrol.com/speed/broadcast/139/desktop-playlist.m3u8"));

        channels.add(new Channel(131L, "https://i.imgur.com/2nzRS60.png",
                "AKC TV Puppies 24/7",
                "https://install.akctvcontrol.com/speed/broadcast/140/desktop-playlist.m3u8"));

        channels.add(new Channel(132L, "https://i.imgur.com/7Kl95WA.png",
                "AKD Calcutta News (576p)",
                "https://cdn-2.pishow.tv/live/237/master.m3u8"));

        channels.add(new Channel(860L,
                "https://ry7wpjhjwylg7u7.vxdgroup-84jzo19.xyz/logos_4RBUvIk6iXEOn3vNbd3j5PCw3T06yk0G/alphamoretime.png",
                "alpha Moretime (1080p)",
                "https://dvr3.vokkavideo.xyz/ALPHAMORETIMEHD/index.m3u8"
        ));

        channels.add(new Channel(133L,
                "https://i.imgur.com/6twzd38.png",
                "Alpha TV (720p) [Not 24/7]",
                "http://alphatvlive.siliconweb.com/1/Y2Rsd1lUcUVoajcv/UVdCN25h/hls/live/playlist.m3u8"
        ));

        channels.add(new Channel(134L,
                null,
                "Alqanat9 TV (1080p)",
                "https://cdn.bestream.io:19360/alqanat9/alqanat9.m3u8"
        ));

        channels.add(new Channel(135L,
                "https://i.imgur.com/lqVwrAF.png",
                "Alquran (1080p)",
                "https://ktvlive.online/stream/hls/ch1.m3u8"
        ));

        channels.add(new Channel(136L,
                "https://i.imgur.com/SbuD1UW.png",
                "Alsacias Televisión (ATV | Canal 28) (720p)",
                "https://s.emisoras.tv:8081/atv/index.m3u8"
        ));

        channels.add(new Channel(137L,
                "https://upload.wikimedia.org/wikipedia/commons/thumb/7/72/Logo_of_Alsat_TV_%282020-%29.svg/512px-Logo_of_Alsat_TV_%282020-%29.svg.png",
                "Alsat [Geo-blocked]",
                "https://vipottbpkstream.vip.hr/Content/onevip-hls/Live/Channel(Alsat_M)/index.m3u8"
        ));

        channels.add(new Channel(138L,
                "https://alshoub.tv/wp-content/uploads/2023/09/logo@2x-1-1.png",
                "AlShoub (720p)",
                "https://play.tactivemedia.com/memfs/c5919b97-5329-4b84-91b2-613c6ed9953e.m3u8"
        ));

        channels.add(new Channel(139L,
                "https://i.postimg.cc/Nf6K92Cs/altaghiertv.png",
                "Altaghier TV (1080p)",
                "https://jmc-live.ercdn.net/altaghier/altaghier.m3u8"
        ));

        channels.add(new Channel(140L,
                "https://i.imgur.com/KWvVLhc.png",
                "Altanto TV (720p)",
                "https://streaming.altantotv.domiplay.net/hls/0/stream.m3u8"
        ));

        channels.add(new Channel(141L,
                "https://i.postimg.cc/Vkzdjs2j/altastv.png",
                "Altas TV (1080p)",
                "https://edge1.socialsmart.tv/altastv/bant1/playlist.m3u8"
        ));

        channels.add(new Channel(142L,
                "https://i.postimg.cc/kgwDw3dL/altenatv.png",
                "Altena TV (720p)",
                "https://dnx1f4sl30ba2.cloudfront.net/nlpo/clr-nlpo/altenatv/index.m3u8"
        ));

        channels.add(new Channel(143L,
                "https://i.imgur.com/3JriZGR.png",
                "Altenburg TV (1080p)",
                "https://58de7a369a9c4.streamlock.net/abgtv/abgtv_1080p/playlist.m3u8"
        ));

        channels.add(new Channel(144L,
                "https://alternatv.ar/alternatv.png",
                "Alterna TV (720p)",
                "https://alternatv.ar/stream/hls/live.m3u8"
        ));

        channels.add(new Channel(145L,
                null,
                "Althania (1080p)",
                "https://live.kwikmotion.com/syriatv02live/syriatv02.smil/playlist.m3u8"
        ));

        channels.add(new Channel(146L,
                null,
                "Althaqalayn TV",
                "http://63b03f7689049.streamlock.net:1935/live/16/playlist.m3u8"
        ));

        channels.add(new Channel(147L,
                null,
                "Althaqalayn TV",
                "http://77.36.160.164:1935/live4/thaghalayn/playlist.m3u8"
        ));

        channels.add(new Channel(148L,
                "https://i.imgur.com/tKNPdea.png",
                "Althingi (1080p) [Not 24/7]",
                "https://althingi-live.secure.footprint.net/althingi/live/index.m3u8"
        ));

        channels.add(new Channel(149L,
                "https://i.imgur.com/yt7JJrn.png",
                "Alto Adige TV (720p)",
                "https://5f204aff97bee.streamlock.net/AltoAdigeTV/livestream/playlist.m3u8"
        ));

        channels.add(new Channel(150L,
                "https://i.imgur.com/MCbCSWv.png",
                "ALTV (1080p)",
                "https://thaipbs-ujxrch.cdn.byteark.com/live/playlist_1080p/index.m3u8"
        ));

        channels.add(new Channel(151L,
                "https://i.imgur.com/D7RBtZ2.png",
                "Altyn Asyr (406p) [Not 24/7]",
                "https://alpha.tv.online.tm/hls/ch001.m3u8"
        ));

        channels.add(new Channel(152L,
                "https://i.imgur.com/m6CM7VU.png",
                "Alvin Channel TV (360p) [Not 24/7]",
                "https://cdn10-alvinchannel.yayin.com.tr/alvinchannel/alvinchannel/playlist.m3u8"
        ));

        channels.add(new Channel(153L,
                "https://i.ibb.co/3yfMjmf/logo-3.png",
                "Alwafa Tarim TV (Am Media) (720p)",
                "https://ammedia.siar.us/ammedia/live/playlist.m3u8"
        ));

        channels.add(new Channel(154L,
                "https://i.imgur.com/vfdN5Xl.png",
                "Always Funny Videos",
                "https://linear-12.frequency.stream/dist/glewedtv/12/hls/master/playlist.m3u8"
        ));

        channels.add(new Channel(155L,
                null,
                "Always Funny: Pranks & Fails (720p)",
                "https://linear-863.frequency.stream/dist/stirr/863/hls/master/playlist.m3u8"
        ));

        channels.add(new Channel(156L,
                "https://i.imgur.com/1vqhmNz.png",
                "ALWifak News TV (720p)",
                "http://alwifaklive.info:1935/live/myStream/playlist.m3u8"
        ));

        channels.add(new Channel(157L,
                "https://i.imgur.com/0cY4K7G.png",
                "Amani TV (1080p) [Not 24/7]",
                "https://goccn.cloud/hls/amanitv/index.m3u8"
        ));

        channels.add(new Channel(158L,
                "https://static.wikia.nocookie.net/logopedia/images/f/ff/Amarin_TV_2015.svg",
                "Amarin TV",
                "https://lb1-live-mv.v2h-cdn.com/hls/ffad/vibomi/vibomi.m3u8"
        ));

        channels.add(new Channel(159L,
                null,
                "Amasia (720p)",
                "https://splendid-film-amasia-1-eu.rakuten.wurl.tv/playlist.m3u8"
        ));

        channels.add(new Channel(160L,
                "https://i.imgur.com/I0oPFTj.png",
                "Amazing Discoveries TV (720p)",
                "https://uni01rtmp.tulix.tv/amazingdtv/amazingdtv/playlist.m3u8"
        ));

        channels.add(new Channel(161L,
                "https://i.imgur.com/7rjCS5i.png",
                "Amazon Sat (1080p)",
                "https://amazonsat.brasilstream.com.br/hls/amazonsat/index.m3u8"
        ));

        channels.add(new Channel(162L,
                "https://i.imgur.com/yj8RNnG.png",
                "AMC (1080p)",
                "https://amchls.wns.live/hls/stream.m3u8"
        ));

        channels.add(new Channel(163L,
                "https://upload.wikimedia.org/wikipedia/commons/thumb/3/34/AMC_logo_2019.svg/512px-AMC_logo_2019.svg.png",
                "AMC",
                "http://cors.tundracast.com:2000/https://streamer1.nexgen.bz/AMC/index.m3u8"
        ));

        channels.add(new Channel(164L,
                "https://i.imgur.com/Gtwk8ic.png",
                "AMC Absolute Reality",
                "https://amc-absolutereality-1-us.plex.wurl.tv/playlist.m3u8"
        ));

        channels.add(new Channel(165L,
                "https://i.imgur.com/OjLCew5.png",
                "AMC All Weddings",
                "https://d85lu9l3axp7b.cloudfront.net/v1/master/3722c60a815c199d9c0ef36c5b73da68a62b09d1/cc-49b4g6287mnav/playlist.m3u8"
        ));

        channels.add(new Channel(166L,
                "https://upload.wikimedia.org/wikipedia/commons/thumb/3/34/AMC_logo_2019.svg/512px-AMC_logo_2019.svg.png",
                "AMC East (1080p)",
                "https://fl1.moveonjoy.com/AMC_NETWORK/index.m3u8"
        ));

        channels.add(new Channel(167L,
                "https://i.imgur.com/MUEbjeP.png",
                "Ame 47 (576p)",
                "https://ss2.tvrdomi.com:1936/ame47/ame47/playlist.m3u8"
        ));

        channels.add(new Channel(168L,
                "https://i.imgur.com/2pAHdAi.png",
                "Amedia 1",
                "http://31.148.48.15/A1/index.m3u8"
        ));

        channels.add(new Channel(169L,
                "https://i.imgur.com/NqHla2V.png",
                "Amedia 2",
                "http://31.148.48.15/A2/index.m3u8"
        ));

        channels.add(new Channel(170L,
                "https://i.imgur.com/gUqKymM.png",
                "América Estéreo Guayaquil (360p)",
                "https://video.makrodigital.com/americaestereoguayaquil/americaestereoguayaquil/playlist.m3u8"
        ));

        channels.add(new Channel(171L,
                "https://i.imgur.com/gUqKymM.png",
                "América Estéreo Ibarra (720p)",
                "https://video.makrodigital.com/americaestereoibarra/americaestereoibarra/playlist.m3u8"
        ));

        channels.add(new Channel(172L,
                "https://i.imgur.com/gUqKymM.png",
                "América Estéreo Quito (1080p)",
                "https://video.makrodigital.com/americaestereoquito/americaestereoquito/playlist.m3u8"
        ));

        channels.add(new Channel(173L,
                "https://i.imgur.com/gUqKymM.png",
                "América Estéreo Tulcán (614p)",
                "https://video.makrodigital.com/americaestereotulcan/americaestereotulcan/playlist.m3u8"
        ));

        channels.add(new Channel(174L,
                "https://i.imgur.com/K9o3mLP.png",
                "América TeVé (1080p)",
                "https://live.gideo.video/americateve2/master.m3u8"
        ));

        channels.add(new Channel(175L,
                "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c8/Am%C3%A9rica_TV_%28Nuevo_logo_Junio_2020%29.png/512px-Am%C3%A9rica_TV_%28Nuevo_logo_Junio_2020%29.png",
                "America TV (720p)",
                "https://prepublish.f.qaotic.net/a07/americahls-100056/playlist_720p.m3u8"
        ));

        channels.add(new Channel(176L,
                null,
                "America's Boating Channel",
                "https://streams2.sofast.tv/v1/master/611d79b11b77e2f571934fd80ca1413453772ac7/04c3a27e-c2a0-420b-8eef-7dae9ab93056/manifest.m3u8"
        ));

        channels.add(new Channel(177L,
                "https://i.imgur.com/prMkTsZ.png",
                "America's Test Kitchen",
                "http://cfd-v4-service-channel-stitcher-use1-1.prd.pluto.tv/stitch/hls/channel/5e84f54a82f05300080e6746/master.m3u8"
        ));

        channels.add(new Channel(178L,
                null,
                "America's Voice (720p)",
                "https://content.uplynk.com/channel/26bd482ffe364a1282bc3df28bd3c21f.m3u8"
        ));

        channels.add(new Channel(179L,
                "https://i.imgur.com/C4w0eYC.png",
                "America's Voice News",
                "http://cfd-v4-service-channel-stitcher-use1-1.prd.pluto.tv/stitch/hls/channel/5e1f7da4bc7d740009831259/master.m3u8"
        ));

        channels.add(new Channel(180L,
                null,
                "American Crime Channel",
                "https://d39g1vxj2ef6in.cloudfront.net/v1/master/3fec3e5cac39a52b2132f9c66c83dae043dc17d4/prod-rakuten-stitched/master.m3u8"
        ));

        channels.add(new Channel(181L,
                null,
                "American Crimes",
                "http://cfd-v4-service-channel-stitcher-use1-1.prd.pluto.tv/stitch/hls/channel/65492fc7056b9700088560b5/master.m3u8"
        ));

        channels.add(new Channel(182L,
                null,
                "American Crimes",
                "https://xumo-xumoent-vc-113-at8kn.fast.nbcuni.com/live/master.m3u8"
        ));

        channels.add(new Channel(183L,
                "https://image.roku.com/developer_channels/prod/16f5571a82819e8992a748c70b256cbe63105f4b546b73d129668dc2cb701d91.png",
                "American Horrors (480p)",
                "http://107.167.7.162:8081/playlist/amhor/playlist.m3u8"
        ));

        channels.add(new Channel(184L,
                null,
                "American Ninja Warrior",
                "https://xumo-drct-ch812-n4996.fast.nbcuni.com/live/master.m3u8"
        ));

        channels.add(new Channel(185L, null,
                "American Pickers",
                "http://cfd-v4-service-channel-stitcher-use1-1.prd.pluto.tv/stitch/hls/channel/6408ae8f9b39550008caf94f/master.m3u8"
        ));

        channels.add(new Channel(186L,
                "https://images-na.ssl-images-amazon.com/images/I/71CZKwin9mL.png",
                "Ameritrade (1080p) [Not 24/7]",
                "https://tdameritrade-vizio.amagi.tv/playlist.m3u8"
        ));

        channels.add(new Channel(187L,
                "https://i.imgur.com/m5Anun9.png",
                "AMG TV (1080p)",
                "https://2-fss-2.streamhoster.com/pl_138/201660-1270634-1/playlist.m3u8"
        ));

        channels.add(new Channel(188L,
                "https://i.imgur.com/NTlC6e7.png",
                "Amga TV (720p) [Not 24/7]",
                "https://streamer1.connectto.com/AMGA_WEB_1202/playlist.m3u8"
        ));

        channels.add(new Channel(189L,
                "https://i.ibb.co/tLhcNTD/amigos-tv-chiquimula.png",
                "Amigos TV Chiquimula (480p)",
                "https://antmedia.cablevisionrobles.com:5443/LiveApp/streams/CqwAgRagMvBNYN8c1731608980342.m3u8"
        ));

        channels.add(new Channel(190L,
                "https://i.imgur.com/5l7kw0b.png",
                "Amman TV (720p)",
                "https://ammantv-live.ercdn.net/ammantvhd/ammantvhd.m3u8"
        ));

        channels.add(new Channel(191L,
                "https://i.imgur.com/L8UPGPC.png",
                "Amou Yazid TV (576p)",
                "http://mkstream.servehttp.com:1940/AmouYazid/ay1/playlist.m3u8"
        ));

        channels.add(new Channel(192L,
                "https://upload.wikimedia.org/wikipedia/commons/thumb/5/5b/Amouzesh_TV_logo_%282023%29.svg/201px-Amouzesh_TV_logo_%282023%29.svg.png",
                "Amouzesh",
                "https://lenz.splus.ir/PLTV/88888888/224/3221226151/index.m3u8"
        ));

        channels.add(new Channel(193L,
                "https://i.imgur.com/WdSjlPl.png",
                "Amrita TV (720p)",
                "https://ddash74r36xqp.cloudfront.net/master.m3u8"
        ));

        channels.add(new Channel(194L,
                "https://i.imgur.com/KXdvPum.png",
                "Amu TV",
                "https://fl1002.bozztv.com/gin-amutv/tracks-v1a1/mono.m3u8"
        ));

        channels.add(new Channel(195L,
                "https://i.imgur.com/06zuf64.png",
                "AMusic Channel (720p)",
                "http://mn-nl.mncdn.com/amusictv/amusicsrt.stream/playlist.m3u8"
        ));

        channels.add(new Channel(196L,
                "https://i.imgur.com/snIU1UA.jpg",
                "AMX Noticias (720p) [Not 24/7]",
                "https://5e50264bd6766.streamlock.net/mexiquense2/videomexiquense2/playlist.m3u8"
        ));

        channels.add(new Channel(197L,
                "https://i.imgur.com/Ir26BK6.png",
                "Anaadi TV (576p)",
                "http://202.164.50.194:8000/play/a065/index.m3u8"
        ));

        channels.add(new Channel(198L,
                "https://www.anadolunettv.com/d/r/logo.png",
                "Anadolu Net TV (1080p)",
                "https://live.artidijitalmedya.com/artidijital_anadolunet/anadolunet/playlist.m3u8"
        ));

        channels.add(new Channel(199L,
                "https://i.imgur.com/5VOPFzs.png",
                "Anand TV (720p) [Not 24/7]",
                "https://live-anandtv.anandmedia.net/anandtvapp/anandtv/index.m3u8"
        ));

        channels.add(new Channel(200L,
                "https://i.imgur.com/yWo4RaV.jpeg",
                "Ananda Barta (720p)",
                "https://account19.livebox.co.in/Anandabarta2hls/live.m3u8"
        ));

        channels.add(new Channel(201L,
                "https://jiotvimages.cdn.jio.com/dare_images/shows/2025-11-25/2511253358000.jpg",
                "Anandham TV (1080p)",
                "https://stream.galaxyott.live/live/anandhamtv/index.m3u8"
        ));

        channels.add(new Channel(202L,
                "https://i.imgur.com/8LjMtnk.png",
                "ANB News (576p)",
                "http://202.164.50.194:8000/play/a02w/index.m3u8"
        ));

        channels.add(new Channel(203L,
                "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a1/Andaluc%C3%ADa_TV_2018_logo.svg/512px-Andaluc%C3%ADa_TV_2018_logo.svg.png",
                "Andalucía Televisión (1080p)",
                "http://176.65.146.237:8401/play/a09g/index.m3u8"
        ));

        channels.add(new Channel(204L,
                "https://upload.wikimedia.org/wikipedia/commons/3/32/Logo_Andorra_Televisi%C3%B3.png",
                "Andorra TV (1080p)",
                "https://live-edge-eu-1.cdn.enetres.net/56495F77FD124FECA75590A906965F2C022/live-3000/index.m3u8"
        ));

        channels.add(new Channel(205L,
                "https://i.imgur.com/6ot2lmd.png",
                "Andromeda Italy (720p)",
                "https://stitcher-ipv4.pluto.tv/v1/stitch/embed/hls/channel/60802d37ee238e0007c94e64/master.m3u8"
        ));

        channels.add(new Channel(206L,
                null,
                "AnewZ",
                "https://53be5ef2d13aa.streamlock.net/cubesanewz-secure/smil:cubesanewz-secure-web.smil/playlist.m3u8"
        ));

        channels.add(new Channel(207L,
                "https://i.imgur.com/qKLEGU7.png",
                "Angel TV (720p)",
                "https://janya-digimix.akamaized.net/vglive-sk-394914/india/ngrp:angelindia_all/playlist.m3u8"
        ));

        channels.add(new Channel(208L,
                "https://i.imgur.com/qKLEGU7.png",
                "Angel TV Africa (720p)",
                "https://janya-digimix.akamaized.net/vglive-sk-904559/africa/ngrp:angelafrica_all/playlist.m3u8"
        ));

        channels.add(new Channel(209L,
                "https://i.imgur.com/qKLEGU7.png",
                "Angel TV America (720p)",
                "https://janya-digimix.akamaized.net/vglive-sk-374850/america/ngrp:angelamerica_all/playlist.m3u8"
        ));

        channels.add(new Channel(210L,
                "https://i.imgur.com/qKLEGU7.png",
                "Angel TV Arabia (720p)",
                "https://janya-digimix.akamaized.net/vglive-sk-213167/arabia/ngrp:angelarabia_all/playlist.m3u8"
        ));

        channels.add(new Channel(211L,
                "https://i.imgur.com/qKLEGU7.png",
                "Angel TV Australia (720p)",
                "https://janya-digimix.akamaized.net/vglive-sk-310787/australia/ngrp:angelaustralia_all/playlist.m3u8"
        ));

        channels.add(new Channel(212L,
                "https://i.imgur.com/qKLEGU7.png",
                "Angel TV Chinese (720p)",
                "https://janya-digimix.akamaized.net/vglive-sk-999451/chinese/ngrp:angelchinese_all/playlist.m3u8"
        ));

        channels.add(new Channel(213L,
                "https://i.imgur.com/qKLEGU7.png",
                "Angel TV Europe (720p)",
                "https://janya-digimix.akamaized.net/vglive-sk-512011/europe/ngrp:angeleurope_all/playlist.m3u8"
        ));

        channels.add(new Channel(214L,
                "https://i.imgur.com/qKLEGU7.png",
                "Angel TV FarEast (720p)",
                "https://janya-digimix.akamaized.net/vglive-sk-438760/fareast/ngrp:angelfareast_all/playlist.m3u8"
        ));

        channels.add(new Channel(215L,
                "https://i.imgur.com/qKLEGU7.png",
                "Angel TV Hebrew (720p)",
                "https://janya-digimix.akamaized.net/vglive-sk-150533/hebrew/ngrp:angelhebrew_all/playlist.m3u8"
        ));

        channels.add(new Channel(216L,
                "https://i.imgur.com/qKLEGU7.png",
                "Angel TV Indo-China (720p)",
                "https://janya-digimix.akamaized.net/vglive-sk-703035/indochina/ngrp:angelindochina_all/playlist.m3u8"
        ));

        channels.add(new Channel(217L,
                "https://i.imgur.com/qKLEGU7.png",
                "Angel TV Indonesia (720p)",
                "https://janya-digimix.akamaized.net/vglive-sk-234616/indonesia/ngrp:angelindonesia_all/playlist.m3u8"
        ));

        channels.add(new Channel(218L,
                "https://i.imgur.com/qKLEGU7.png",
                "Angel TV Portuguese (720p)",
                "https://janya-digimix.akamaized.net/vglive-sk-382409/portuese/ngrp:angelportuguese_all/playlist.m3u8"
        ));

        channels.add(new Channel(219L,
                "https://i.imgur.com/qKLEGU7.png",
                "Angel TV Russian (720p)",
                "https://janya-digimix.akamaized.net/vglive-sk-955415/russia/ngrp:angelrussia_all/playlist.m3u8"
        ));

        channels.add(new Channel(220L,
                "https://i.imgur.com/qKLEGU7.png",
                "Angel TV Spanish (720p)",
                "https://janya-digimix.akamaized.net/vglive-sk-351398/spanish/ngrp:angelspanish_all/playlist.m3u8"
        ));

        channels.add(new Channel(221L,
                "https://i.imgur.com/OpGc8uF.png",
                "Angela Anaconda",
                "http://cfd-v4-service-channel-stitcher-use1-1.prd.pluto.tv/stitch/hls/channel/611e73687fcd580007d1f052/master.m3u8"
        ));

        channels.add(new Channel(222L,
                "https://static.wikia.nocookie.net/logopedia/images/1/12/Angelus_TV.svg",
                "Angelus TV (1080p)",
                "https://video.angelustv.ro/hls/angelustv.m3u8"
        ));

        channels.add(new Channel(223L,
                null,
                "Anger Management",
                "http://cfd-v4-service-channel-stitcher-use1-1.prd.pluto.tv/stitch/hls/channel/655ca57e4261ca00080b3a04/master.m3u8"
        ));

        channels.add(new Channel(224L,
                "https://i.imgur.com/VXZgrNy.png",
                "Anger Management",
                "http://cfd-v4-service-channel-stitcher-use1-1.prd.pluto.tv/stitch/hls/channel/655ca57e4261ca00080b3a04/master.m3u8"
        ));

        channels.add(new Channel(225L,
                "https://i.imgur.com/CMKKbaP.png",
                "Angers Tele",
                "https://raw.githubusercontent.com/Sibprod/streams/main/ressources/dm/py/hls/angerstele.m3u8"
        ));

        channels.add(new Channel(226L,
                "https://i.imgur.com/i2AP0hp.png",
                "Ani",
                "http://stv.mediacdn.ru/live/cdn/ani/playlist.m3u8"
        ));

        channels.add(new Channel(227L,
                null,
                "Animal Cam (720p) [Geo-blocked]",
                "https://amg00442-zmg-amg00442c2-klowdtv-us-2123.playouts.now.amagi.tv/playlist/amg00442-zazoommediagroup-zmgwild-klowdtvus/playlist.m3u8"
        ));

        channels.add(new Channel(228L,
                null,
                "ANIMAL KINGDOM (720p)",
                "https://cdn6.goprimetime.info/feed/202306140918/LC18/index.m3u8"
        ));

        channels.add(new Channel(229L,
                "https://i.imgur.com/Ul1pjUN.png",
                "Animation Show Channel",
                "http://180.213.174.225:9901/tsfile/live/1034_1.m3u8"
        ));

        channels.add(new Channel(230L,
                "https://i.imgur.com/FM9FVAG.png",
                "Animaux",
                "https://viamotionhsi.netplus.ch/live/eds/animaux/browser-dash/animaux.mpd"
        ));

        channels.add(new Channel(231L,
                "https://upload.wikimedia.org/wikipedia/commons/thumb/6/6f/Animax.png/512px-Animax.png",
                "Animax [Geo-blocked]",
                "https://amg02159-kcglobal-amg02159c1-samsung-in-521.playouts.now.amagi.tv/playlist/amg02159-kcglobal-animax-samsungin/playlist.m3u8"
        ));

        channels.add(new Channel(232L,
                "https://shahid.mbc.net/mediaObject/a5893f8d-8488-4c21-ab97-a627f99c7676",
                "Anime (1080p)",
                "https://shls-live-enc.edgenextcdn.net/out/v1/e7350ddf46c94dddafe14b099394ff56/index.m3u8"
        ));

        channels.add(new Channel(233L,
                "https://i.imgur.com/bYZtd0G.png",
                "Anime All Day",
                "http://cfd-v4-service-channel-stitcher-use1-1.prd.pluto.tv/stitch/hls/channel/5812b7d3249444e05d09cc49/master.m3u8"
        ));

        channels.add(new Channel(234L,
                "https://i.imgur.com/pUpKznl.png",
                "Anime Vision (1080p)",
                "https://d1ujfw1zyymzyd.cloudfront.net/v1/master/3722c60a815c199d9c0ef36c5b73da68a62b09d1/cc-a6fukwkbxmex8/live/fast-channel-animevision-64527ec0/fast-channel-animevision-64527ec0.m3u8"
        ));

        channels.add(new Channel(235L,
                "https://i.imgur.com/mTaiEE1.png",
                "Anime Vision Classics (1080p)",
                "https://d82pyvmcw2kdc.cloudfront.net/v1/master/3722c60a815c199d9c0ef36c5b73da68a62b09d1/cc-swfivzrzwamaq/live/fast-channel-animevisionclassics-efc8dc6d/fast-channel-animevisionclassics-efc8dc6d.m3u8"
        ));

        channels.add(new Channel(236L,
                "https://i.imgur.com/AHaXlCh.png",
                "Anime Zone TV (480p)",
                "http://animezonetv.net/hls/stream.m3u8"
        ));

        channels.add(new Channel(237L,
                "https://i.imgur.com/Im3MePy.png",
                "Aniplus Asia (720p)",
                "https://amg18481-amg18481c1-amgplt0352.playout.now3.amagi.tv/playlist/amg18481-amg18481c1-amgplt0352/playlist.m3u8"
        ));

        channels.add(new Channel(238L,
                "https://i.postimg.cc/yNZ4xcnn/anixeplus.png",
                "Anixe + (360p)",
                "https://ma.anixa.tv/clips/stream/anixesd/index.m3u8"
        ));

        channels.add(new Channel(239L,
                "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c0/Anixe_HD.svg/512px-Anixe_HD.svg.png",
                "Anixe HD Serie (360p)",
                "https://ma.anixa.tv/clips/stream/anixehd/index.m3u8"
        ));

        channels.add(new Channel(240L,
                "https://i.imgur.com/sh0yFSf.png",
                "Anjan (1080p) [Not 24/7]",
                "https://anjantvevent.pc.cdn.bitgravity.com/anjantv/live/amlst:event_anjan_,b400,b800,b1024,b1200,b1500,b4000,.smil/playlist.m3u8"
        ));

        channels.add(new Channel(241L,
                "https://static.wikia.nocookie.net/logopedia/images/d/db/Anmol_Cinema_2025_Logo_%28Low_Quality%29.jpg",
                "Anmol Cinema (576p)",
                "http://66.102.120.18:8000/play/a01v/index.m3u8"
        ));

        channels.add(new Channel(242L,
                "https://static.wikia.nocookie.net/logopedia/images/a/a7/Anmol_Cinema_2.jpg",
                "Anmol Cinema 2 (576p)",
                "http://110.39.27.47:8001/play/a03w/index.m3u8"
        ));

        channels.add(new Channel(243L,
                "https://asianewsnetwork.net/wp-content/uploads/2020/03/cropped-LOGO-NEW.png",
                "ANN News (720p)",
                "https://cdn.ottlive.co.in/annnews/index.m3u8"
        ));

        channels.add(new Channel(244L,
                "https://www.tvchinese.net/uploads/tv/anshun.jpg",
                "Anshun Comprehensive News Channel",
                "https://hplayer1.juyun.tv/camera/154379194.m3u8"
        ));

        channels.add(new Channel(245L,
                "https://i.imgur.com/ItxKvVS.png",
                "ANT1 (1080p) [Geo-blocked]",
                "http://d1nfykbwa3n98t.cloudfront.net/out/v1/6e5667da5a6843899a337dea72adb61b/antenna.m3u8"
        ));

        channels.add(new Channel(246L,
                "https://i.imgur.com/2KAObBt.png",
                "ANT1 Cyprus (1080p)",
                "http://l2.cloudskep.com/ant1cm2/abr/playlist.m3u8"
        ));

        channels.add(new Channel(247L,
                "https://i.imgur.com/ItxKvVS.png",
                "ANT1 HD (1080p)",
                "http://31.121.110.30:4000/play/a028/index.m3u8"
        ));

        channels.add(new Channel(248L,
                "https://i.imgur.com/05gwtk2.png",
                "Antares Televisión (720p) [Not 24/7]",
                "https://5c3fb01839654.streamlock.net:1963/iptvantares/liveantarestv/playlist.m3u8"
        ));

        channels.add(new Channel(249L,
                "https://i.imgur.com/EPmwuuv.png",
                "Antena 1 (1080p) [Not 24/7]",
                "https://hls.rundletv.eu.org/LIVE$Antena1/6.m3u8/Level/300720051?end=END&start=LIVE"
        ));

        channels.add(new Channel(250L,
                "https://i.imgur.com/EPmwuuv.png",
                "Antena 1 HD",
                "https://hokrus113.zokares1.cfd/ah1/usergenx304Jtlrnd.m3u8"
        ));

        channels.add(new Channel(251L,
                "https://upload.wikimedia.org/wikipedia/commons/thumb/8/89/Logo_Antena_3_2025_%28Naranja%29.svg/512px-Logo_Antena_3_2025_%28Naranja%29.svg.png",
                "Antena 3 (1080p)",
                "http://176.65.146.237:8401/play/a0ae/index.m3u8"
        ));

        channels.add(new Channel(252L,
                "https://upload.wikimedia.org/wikipedia/commons/8/83/Antena3Internacional2025.png",
                "Antena 3 Internacional (480p)",
                "http://38.183.182.166:8000/play/a0sx/index.m3u8"
        ));

        channels.add(new Channel(253L,
                "https://i.imgur.com/zKWFgeQ.png",
                "Antena 7 (720p)",
                "https://d3mhrz6vhsrmmq.cloudfront.net/index.m3u8"
        ));

        channels.add(new Channel(254L,
                "https://i.imgur.com/QE0XWLh.png",
                "Antena 21 (480p) [Not 24/7] [Geo-blocked]",
                "https://alba-do-antena7-c21.stream.mediatiquestream.com/index.m3u8"
        ));

        channels.add(new Channel(255L,
                "https://i.imgur.com/obwYQZC.png",
                "Antena HD (1080p)",
                "https://liveovh009.cda.pl/enc114/antenatvhdraw/antenatvhdraw.m3u8"
        ));

        channels.add(new Channel(256L,
                "https://static.wikia.nocookie.net/logopedia/images/0/01/Antena_Monden_2022.png",
                "Antena Monden (720p)",
                "https://stream1.antenaplay.ro/live/AntenaMonden/playlist.m3u8"
        ));

        channels.add(new Channel(257L,
                "https://i.imgur.com/9Nh2mo9.png",
                "Antena Seis TV (720p) [Geo-blocked]",
                "https://video1.azulstream.com:8081/antenaseistv/index.m3u8"
        ));

        channels.add(new Channel(258L,
                "https://static.wikia.nocookie.net/logopedia/images/7/7e/A_Stars_2022.png",
                "Antena Stars (1280p)",
                "https://hls.rundletv.eu.org/LIVE$AntenaStars/6.m3u8/Level/300720051?end=END&start=LIVE"
        ));

        channels.add(new Channel(259L,
                "https://i.imgur.com/4aHrD2l.jpeg",
                "Antena SUR",
                "https://cloudpro.servidoresdestream.com:8081/8010/index.m3u8"
        ));

        channels.add(new Channel(260L,
                "https://i.imgur.com/1sAgSME.png",
                "Antena TV (1080p)",
                "https://5ca9af4645e15.streamlock.net/grd/videogrd/playlist.m3u8"
        ));

        channels.add(new Channel(261L,
                "https://i.imgur.com/PCN6iZJ.png",
                "Antena Uno RadioVideo (360p)",
                "https://tvdatta.com:3578/live/antenaunolive.m3u8"
        ));

        channels.add(new Channel(262L,
                null,
                "AntenaSport (1280p) [Not 24/7]",
                "https://hls.rundletv.eu.org/LIVE$AntenaSport/6.m3u8/Level/300720051?end=END&start=LIVE"
        ));

        channels.add(new Channel(263L,
                "https://i.imgur.com/kNrzk3X.png",
                "Antenna 2 TV (720p)",
                "https://58f12ffd2447a.streamlock.net/Antenna2/livestream/playlist.m3u8"
        ));

        channels.add(new Channel(264L,
                "https://i.imgur.com/Sf0bA4P.png",
                "Antenna Sud (720p)",
                "https://live.antennasudwebtv.it:9443/hls/vod.m3u8"
        ));

        channels.add(new Channel(265L,
                "https://i.imgur.com/kiCcHzc.png",
                "Antenna Sud Extra (720p)",
                "https://live.antennasudwebtv.it:9443/hls/vod92.m3u8"
        ));

        channels.add(new Channel(266L,
                null,
                "Antenna Tre Veneto (480p) [Geo-blocked]",
                "https://59d8c0cee6f3d.streamlock.net/antennatreveneto/antennatreveneto.stream/playlist.m3u8"
        ));

        channels.add(new Channel(267L,
                "https://i.imgur.com/ocs2DeU.png",
                "Antenna TV",
                "https://fl1.moveonjoy.com/Antenna_TV/index.m3u8"
        ));

        channels.add(new Channel(268L,
                "https://i.imgur.com/tgxrcv7.png",
                "Antenne A",
                "http://51.254.199.122:8080/antenne_a-plus/index.m3u8"
        ));

        channels.add(new Channel(269L,
                "https://i.imgur.com/nUKFDsb.jpeg",
                "Antenne Kaernten (720p)",
                "https://60efd7a2b4d02.streamlock.net/a_kaernten/ngrp:livestream_all/playlist.m3u8"
        ));

        channels.add(new Channel(270L,
                "https://i.imgur.com/EPIMMaB.png",
                "Antenne Réunion (720p) [Not 24/7]",
                "https://live-antenne-reunion.zeop.tv/live/c3eds/antreunihd/hls_fta/antreunihd.m3u8"
        ));

        channels.add(new Channel(271L,
                "https://i.imgur.com/qnappvd.jpeg",
                "Antenne Steiermark (720p)",
                "https://60efd7a2b4d02.streamlock.net/a_steiermark/ngrp:livestream_all/playlist.m3u8"
        ));

        channels.add(new Channel(272L,
                "https://i.imgur.com/GW750Zc.png",
                "Antenne Vorarlberg (720p) [Not 24/7]",
                "https://5857db5306b83.streamlock.net/antennevorarlberg-live/_definst_/mp4:livestream/playlist.m3u8"
        ));

        channels.add(new Channel(273L,
                "https://i.imgur.com/rKWLv48.png",
                "Antiques Road Show UK",
                "http://cfd-v4-service-channel-stitcher-use1-1.prd.pluto.tv/stitch/hls/channel/638e10de75c3a30007092693/master.m3u8"
        ));

        channels.add(new Channel(274L,
                "https://i.imgur.com/XIQr0fs.png",
                "Antofagasta TV (ATV) (1080p)",
                "https://unlimited6-cl.dps.live/atv/atv.smil/playlist.m3u8"
        ));

        channels.add(new Channel(275L,
                "https://static.wikia.nocookie.net/logos/images/1/1a/ANTV_2023.png",
                "ANTV (480p)",
                "https://ott1.nethubtv.vn/live/antv/playlist.m3u8"
        ));

        channels.add(new Channel(276L,
                "https://static.wikia.nocookie.net/logos/images/1/1a/ANTV_2023.png",
                "ANTV HD (1080p)",
                "https://tv.ddns.vn/tv/antvhd/index.m3u8"
        ));

        channels.add(new Channel(277L,
                "https://i.imgur.com/yHZXPcn.png",
                "Anwar TV2 (720p)",
                "https://cloud.odysee.live/content/f92670235a1ce2bce4cf77671cc4dcc2188baa1d/master.m3u8"
        ));

        channels.add(new Channel(278L,
                "https://i.imgur.com/LloHzi4.png",
                "Anytime TV (1080p)",
                "https://tv.anytimemedia.co.za:3673/hybrid/play.m3u8"
        ));

        channels.add(new Channel(279L,
                "https://i.imgur.com/SLqrEOz.png",
                "Anzoátegui TV (360p) [Not 24/7]",
                "https://vcp2.myplaytv.com/anzoateguitv/anzoateguitv/playlist.m3u8"
        ));

        channels.add(new Channel(280L,
                "https://i.imgur.com/2CSW4V4.png",
                "APA Tv",
                "http://rtmp.apa.tv/@pagroup!23.m3u8"
        ));

        channels.add(new Channel(281L,
                "https://i.imgur.com/IBcMIcZ.png",
                "apart TV (1080p)",
                "https://2-fss-2.streamhoster.com/pl_124/206820-4338160-1/playlist.m3u8"
        ));

        channels.add(new Channel(282L,
                "https://i.imgur.com/RhkbhZD.png",
                "APN (576p)",
                "http://202.164.50.194:8000/play/a03j/index.m3u8"
        ));

        channels.add(new Channel(283L,
                "https://i.imgur.com/ICSA4W6.png",
                "Apna Channel (576p)",
                "http://66.102.120.18:8000/play/a04z/index.m3u8"
        ));

        channels.add(new Channel(284L,
                "https://i.imgur.com/IM4D8Wz.png",
                "Apna Punjab TV (720p)",
                "https://plus.gigabitcdn.net/live-stream/apna-punjab-H3sE/playlist.m3u8"
        ));

        channels.add(new Channel(285L,
                "https://i.imgur.com/C43Cc9N.png",
                "Apostol TV (576p)",
                "https://live.apostoltv.hu/live/playlist.m3u8"
        ));

        channels.add(new Channel(286L,
                "https://i.imgur.com/3h9RkFA.png",
                "Apple Valley Channel 180",
                "https://reflect-applevalley.cablecast.tv/live-3/live/live.m3u8"
        ));

        channels.add(new Channel(287L,
                "https://live.approvaltv.com/logov.png",
                "Approval TV (720p)",
                "https://live.approvaltv.com/approvaltv/index.m3u8"
        ));

        channels.add(new Channel(288L,
                "https://i.imgur.com/9wJe71I.png",
                "Apsara TV11 (720p)",
                "https://live.ams.com.kh/app/stream/playlist.m3u8"
        ));

        channels.add(new Channel(289L,
                "https://i.imgur.com/gWgvm0I.png",
                "APTIM TV (720p)",
                "https://stream.commec.tv/6447b2559d8b0711e2fa75cc/live_222c2dc0b69f11ee8c3c99218c8c67c4/index.fmp4.m3u8"
        ));

        channels.add(new Channel(290L,
                "https://i.imgur.com/IALtpMt.png",
                "Apulia Web TV (1080p)",
                "https://cp1.server89.com:19360/apuliawebtv/apuliawebtv.m3u8"
        ));

        channels.add(new Channel(291L,
                "https://i.imgur.com/ZqIzzmf.png",
                "Aqjaiyq (576p)",
                "https://stream.kaztrk.kz/regional/oraltv/index.m3u8"
        ));

        channels.add(new Channel(292L,
                "https://i.imgur.com/ekF5cAi.png",
                "Aqlvoy (480p)",
                "http://gohoski.fvds.ru:3000/mediabay/645/playlist.m3u8"
        ));

        channels.add(new Channel(293L,
                "https://i.imgur.com/csKl1z6.png",
                "Aqtóbe (576p)",
                "https://stream.kaztrk.kz/regional/aktobetv/index.m3u8"
        ));

        channels.add(new Channel(294L,
                "https://i.ibb.co/dwSHt2SG/Ara.png",
                "Ara",
                "https://ncdn.telewebion.com/ara/live/playlist.m3u8"
        ));

        channels.add(new Channel(295L,
                null,
                "Arab Heritage",
                "https://streams2.sofast.tv/v1/master/611d79b11b77e2f571934fd80ca1413453772ac7/a5dc4c2f-e3ec-488a-9458-9287014fba16/manifest.m3u8"
        ));

        channels.add(new Channel(296L,
                "https://www.arabel.fm/wp-content/uploads/2021/10/Logo-AraBel.png",
                "AraBel",
                "https://raw.githubusercontent.com/Sibprod/streams/main/ressources/dm/py/hls/arabel.m3u8"
        ));

        channels.add(new Channel(297L,
                "https://i.ibb.co/9Vp9Ghg/LOGO-WEB-ARABI-TV-3.png",
                "Arabí TV (1080p)",
                "https://streamtv2.elitecomunicacion.cloud:3628/live/arabitv2025live.m3u8"
        ));

        channels.add(new Channel(298L,
                "https://i.imgur.com/sTOoDy1.png",
                "Arabica TV (720p)",
                "http://istream.binarywaves.com:8081/hls/arabica/playlist.m3u8"
        ));

        channels.add(new Channel(299L,
                "https://i.imgur.com/w48yzLu.png",
                "Aradana TV (576p)",
                "https://cdn-1.pishow.tv/live/961/master.m3u8"
        ));

        channels.add(new Channel(300L,
                "https://i.imgur.com/6YSi1zW.png",
                "Aragon TV (720p)",
                "https://viamotionhsi.netplus.ch/live/eds/aragontv/browser-HLS8/aragontv.m3u8"
        ));

        channels.add(new Channel(301L,
                "https://static.wikia.nocookie.net/logopedia/images/1/12/Arag%C3%B3n_Internacional.png",
                "Aragon TV Internacional (720p) [Not 24/7]",
                "https://cartv.streaming.aranova.es/hls/live/aragontv_canal1.m3u8"
        ));

        channels.add(new Channel(302L,
                "https://i.imgur.com/JsDCyWG.png",
                "ARAS TV (576p) [Not 24/7]",
                "http://1.rtmp.org/tv217/yayin.stream/playlist.m3u8"
        ));

        channels.add(new Channel(303L,
                "https://i.postimg.cc/0QqcjgXX/araxtv.png",
                "Arax TV",
                "https://araxhls.wns.live/hls/stream.m3u8"
        ));

        channels.add(new Channel(304L,
                "https://i.imgur.com/E97M2OL.png",
                "ARB",
                "https://raw.githubusercontent.com/UzunMuhalefet/streams/main/myvideo-az/arb.m3u8"
        ));

        channels.add(new Channel(305L,
                "https://i.imgur.com/mtvIFyq.png",
                "ARB 24",
                "https://raw.githubusercontent.com/UzunMuhalefet/streams/main/myvideo-az/arb-24.m3u8"
        ));

        channels.add(new Channel(306L,
                "https://i.imgur.com/dSg7KUK.png",
                "ARB Gunes",
                "https://raw.githubusercontent.com/UzunMuhalefet/streams/main/myvideo-az/arb-gunes.m3u8"
        ));

        channels.add(new Channel(307L,
                "https://i.imgur.com/4sGDc4X.jpg",
                "Árbol de Vida TV (240p) [Not 24/7]",
                "https://yupistream.top:19360/livearbol/livearbol.m3u8"
        ));

        channels.add(new Channel(308L,
                "https://upload.wikimedia.org/wikipedia/commons/thumb/4/4b/ARD_alpha.svg/512px-ARD_alpha.svg.png",
                "ARD-alpha (720p) [Not 24/7]",
                "https://brlive-lh.akamaihd.net/i/bralpha_germany@119899/master.m3u8"
        ));

        channels.add(new Channel(309L,
                "https://upload.wikimedia.org/wikipedia/commons/thumb/4/4b/ARD_alpha.svg/512px-ARD_alpha.svg.png",
                "ARD-alpha HD",
                "https://viamotionhsi.netplus.ch/live/eds/bralpha/browser-HLS8/bralpha.m3u8"
        ));

        channels.add(new Channel(310L,
                "https://i.imgur.com/5XwtFKd.png",
                "Ardeal TV (480p)",
                "https://frn.rtsp.me/wzhx8pmNF7-kstp_J0AdjA/1695647213/hls/yZ9ED27Q.m3u8"
        ));

        channels.add(new Channel(311L,
                "https://i.imgur.com/3BJQiHP.png",
                "Are We There Yet?",
                "http://cfd-v4-service-channel-stitcher-use1-1.prd.pluto.tv/stitch/hls/channel/65cf8b9328730900087c5324/master.m3u8"
        ));

        channels.add(new Channel(312L,
                "https://i.ibb.co/WkMfnGs/Channels4-profile-8.jpg",
                "Area 809 El Original (1080p)",
                "https://vdo.voxhdnet.com:3159/stream/play.m3u8"));

        channels.add(new Channel(313L,
                "https://i.imgur.com/Bw8fLiD.png",
                "Arek TV (720p)",
                "https://ams.juraganstreaming.com:5443/LiveApp/streams/arektv.m3u8"));

        channels.add(new Channel(314L,
                "https://i.imgur.com/RJrJGbW.png",
                "Arena Sport 1 (720p)",
                "http://91.132.74.5:8000/play/a00k"));

        channels.add(new Channel(315L,
                "https://i.imgur.com/xFgJawa.png",
                "Argentinísima Satelital (540p)",
                "https://stream1.sersat.com/hls/argentinisima.m3u8"));

        channels.add(new Channel(316L,
                "https://i.imgur.com/qufz6nk.png",
                "Arges TV (720p)",
                "https://btutzctahuf0wjoq.cdn.streamingserver.io/hls/yjvam8hlp2g3u08z02tv0yz66rq3cy.m3u8"));

        channels.add(new Channel(317L,
                "https://i.imgur.com/cGjRe01.png",
                "Argus News (576p)",
                "http://202.164.50.194:8000/play/a01n/index.m3u8"));

        channels.add(new Channel(318L,
                "https://i.imgur.com/I67WOgT.png",
                "Arica TV (480p) [Not 24/7]",
                "https://5eff35271151c.streamlock.net:1936/8002/8002/playlist.m3u8"));

        channels.add(new Channel(319L,
                "https://i.imgur.com/dtfiG9k.png",
                "Arirang Radio (720p)",
                "http://amdlive-ch01.ctnd.com.edgesuite.net/arirang_3ch/smil:arirang_3ch.smil/playlist.m3u8"));

        channels.add(new Channel(320L,
                "https://i.imgur.com/Asu5pE9.png",
                "Arirang TV (1080p)",
                "http://amdlive-ch01.ctnd.com.edgesuite.net/arirang_1ch/smil:arirang_1ch.smil/playlist.m3u8"));

        channels.add(new Channel(321L,
                "https://i.imgur.com/Asu5pE9.png",
                "Arirang TV HD",
                "https://dash3.antik.sk/live/test_arirang/playlist.m3u8"));

        channels.add(new Channel(322L,
                "https://i.imgur.com/Jdy3WNm.png",
                "Arirang TV UN (1080p)",
                "https://amdlive-ch02-ctnd-com.akamaized.net/arirang_2ch/smil:arirang_2ch.smil/playlist.m3u8"));

        channels.add(new Channel(323L,
                "https://i.postimg.cc/yxJFC67J/aristotv.png",
                "Aristo TV (360p)",
                "https://ma.anixa.tv/clips/stream/aristo/index.m3u8"));

        channels.add(new Channel(324L,
                "https://i.imgur.com/yCHNZXD.png",
                "Ark TV (1080p) [Not 24/7]",
                "https://stream.hydeinnovations.com/arktv-international/index.fmp4.m3u8"));

        channels.add(new Channel(325L,
                "https://i.imgur.com/JdEb4Ug.png",
                "Arkadag TV (406p) [Not 24/7]",
                "https://alpha.tv.online.tm/hls/ch000.m3u8"));

        channels.add(new Channel(326L,
                "https://i.imgur.com/dNBZLtD.png",
                "Arkansas PBS [Geo-blocked]",
                "https://ketsdt.lls.pbs.org/out/v1/03c094dbd7874a4a8c3fe9fb10081bdb/index.m3u8"));

        channels.add(new Channel(327L,
                "https://www.lyngsat.com/logo/tv/aa/arko-tv.png",
                "Arko TV",
                "https://arkhls.wns.live/hls/stream.m3u8"));

        channels.add(new Channel(328L,
                "https://i.imgur.com/2tlFMXF.png",
                "Arlaadi TV",
                "https://ap02.iqplay.tv:8082/iqb8002/alr114iapp/playlist.m3u8"));

        channels.add(new Channel(329L,
                "https://i.imgur.com/HIwJ4lc.png",
                "Armenia 1",
                "https://amtv.tulixcdn.com/amtv2/am2abr/index.m3u8"));

        channels.add(new Channel(330L,
                "https://i.imgur.com/AXmXw9X.png",
                "Armenia 2",
                "https://amtv.tulixcdn.com/amtv3/am3abr/index.m3u8"));

        channels.add(new Channel(331L,
                "https://i.imgur.com/ZTaEFWY.png",
                "Arroyo Grande Gov't Access TV Channel 20 (432p)",
                "https://agp-nimble.streamguys1.com/AGCC/AGCC/playlist.m3u8"));

        channels.add(new Channel(332L,
                "https://i.imgur.com/8uS0sib.png",
                "ART TV",
                "https://rtmp.win:3696/live/arttvgrlive.m3u8"));

        channels.add(new Channel(333L,
                "https://i.imgur.com/ecXMjNl.png",
                "ARTE (720p) [Geo-blocked]",
                "https://artesimulcast.akamaized.net/hls/live/2030993/artelive_de/index.m3u8"));

        channels.add(new Channel(334L,
                "https://i.imgur.com/ecXMjNl.png",
                "Arte (720p) [Geo-blocked]",
                "https://artesimulcast.akamaized.net/hls/live/2031003/artelive_fr/index.m3u8"));

        channels.add(new Channel(335L,
                "https://i.imgur.com/ecXMjNl.png",
                "arte HD",
                "https://dash4.antik.sk/live/test_arte_avc_25p/playlist.m3u8"));

        channels.add(new Channel(336L,
                "https://i.imgur.com/ecXMjNl.png",
                "arte HD (1080p)",
                "https://viamotionhsi.netplus.ch/live/eds/artehd/browser-HLS8/artehd.m3u8"));

        channels.add(new Channel(337L,
                "https://i.imgur.com/5pOZQB4.png",
                "Artflix Movie Classics (720p)",
                "https://amogonetworx-artflix-1-nl.samsung.wurl.tv/playlist.m3u8"));

        channels.add(new Channel(338L,
                null,
                "Arthur",
                "http://cfd-v4-service-channel-stitcher-use1-1.prd.pluto.tv/stitch/hls/channel/6482f27c17f5e10008c10ff0/master.m3u8"));

        channels.add(new Channel(339L,
                null,
                "ARTN TV (1080p) [Not 24/7]",
                "https://streamer1.connectto.com/ARTN_mobile/index.m3u8"));

        channels.add(new Channel(340L,
                "https://i.postimg.cc/qBtbT4bX/artv.png",
                "ARTV Canal Parlamento (720p) [Not 24/7]",
                "https://playout172.livextend.cloud/liveiframe/_definst_/liveartvabr/playlist.m3u8"));

        channels.add(new Channel(341L,
                "https://i.postimg.cc/zD9dD64m/arubatv.png",
                "Aruba.TV (1080p)",
                "https://cdn01.setar.aw/Canal49/canal49/playlist.m3u8"));

        channels.add(new Channel(342L,
                "https://i.imgur.com/9s6LZJZ.png",
                "ArubaTV + (1080p)",
                "https://livertmptwo.com:19360/atvplusrelay/atvplusrelay.m3u8"));

        channels.add(new Channel(343L,
                "https://i.postimg.cc/9z3M5pQ9/arvan.png",
                "Arvan TV",
                "https://arvhls.wns.live/hls/stream.m3u8"));

        channels.add(new Channel(344L,
                "https://i.imgur.com/TVP7g03.png",
                "ARY Digital Asia (1080p)",
                "http://66.102.120.18:8000/play/a030/index.m3u8"));

        channels.add(new Channel(345L,
                "https://i.imgur.com/TVP7g03.png",
                "ARY Digital USA (720p) [Not 24/7]",
                "https://6zklx4wryw9b-hls-live.5centscdn.com/arydigitalusa/498f1704b692c3ad4dbfdf5ba5d04536.sdp/playlist.m3u8"));

        channels.add(new Channel(346L,
                "https://upload.wikimedia.org/wikipedia/en/b/bb/ARY_Musik_logo.png",
                "ARY Musik (1080p)",
                "https://arymusik.aryzap.com/3fd38b2c62d0c3bbd74aedabb533c03a/6459fa78/v1/01847ac7a4930b8ed5aa6ed04aba/01847ac8f5f70b8ed5aa6ed04abd/main.m3u8"));

        channels.add(new Channel(347L,
                "https://i.postimg.cc/K85QNzjF/arynews.png",
                "ARY News (576p)",
                "http://66.102.120.18:8000/play/a02z/index.m3u8"));

        channels.add(new Channel(348L,
                null,
                "ARY Zindagi (576p)",
                "http://66.102.120.18:8000/play/a031/index.m3u8"));

        channels.add(new Channel(349L,
                "https://i.postimg.cc/RZmXKfMX/aryentv.png",
                "Aryen TV (1080p) [Not 24/7]",
                "https://aryen.tv/live/tv/playlist.m3u8"));

        channels.add(new Channel(350L,
                "https://i.postimg.cc/KYqN6HtH/asgabat.png",
                "Aşgabat (406p) [Not 24/7]",
                "https://alpha.tv.online.tm/hls/ch006.m3u8"));

        channels.add(new Channel(351L,
                "https://i.imgur.com/Czxi7yk.png",
                "Asharq Discovery (1080p)",
                "https://svs.itworkscdn.net/asharqdiscoverylive/asharqd.smil/playlist_dvr.m3u8"));

        channels.add(new Channel(352L,
                "https://i.imgur.com/v6VsFEt.png",
                "Asharq Documentary (1080p)",
                "https://svs.itworkscdn.net/asharqdocumentarylive/asharqdocumentary.smil/playlist_dvr.m3u8"));

        channels.add(new Channel(353L,
                "https://i.imgur.com/bqRC3sl.png",
                "Asharq News (1080p)",
                "https://bcovlive-a.akamaihd.net/0b75ef0a49e24704a4ca023d3a82c2df/ap-south-1/6203311941001/playlist.m3u8"));

        channels.add(new Channel(354L,
                "https://i.imgur.com/bqRC3sl.png",
                "Asharq News Portrait (1280p)",
                "https://bcovlive-a.akamaihd.net/ed81ac1118414d4fa893d3a83ccec9be/eu-central-1/6203311941001/playlist.m3u8"));

        channels.add(new Channel(355L,
                "https://i.imgur.com/M6K8cD3.jpeg",
                "Asharq Radio (1080p)",
                "https://svs.itworkscdn.net/asharqradiovlive/asharqradiov/playlist.m3u8"));

        channels.add(new Channel(356L,
                "https://i.imgur.com/bTktkcr.png",
                "Ashiil TV (480p)",
                "https://ams.juraganstreaming.com:5443/LiveApp/streams/ashiiltv2.m3u8"));

        channels.add(new Channel(357L,
                "https://i.imgur.com/6W7HUtG.png",
                "Así Sucede Guanajuato (720p) [Not 24/7]",
                "https://stream.oursnetworktv.com/latin/encoder13/playlist.m3u8"));

        channels.add(new Channel(358L,
                "https://saddlebrown-jellyfish-181801.hostingersite.com/ATV-logo.png",
                "Asia TV (720p)",
                "https://stream.asiatvnet.com/1/live/master.m3u8"));

        channels.add(new Channel(359L,
                "https://i.imgur.com/k2adSjA.png",
                "Asian TV (720p)",
                "https://mtlivestream.site/asian/ytlive/index.m3u8"));

        channels.add(new Channel(360L,
                "https://i.imgur.com/WAYZSgx.png",
                "AsianBox (720p)",
                "https://cdn4.skygo.mn/live/disk1/AsianBOX/HLSv3-FTA/AsianBOX.m3u8"));

        channels.add(new Channel(361L,
                "https://i.imgur.com/hW6z1RG.png",
                "AsianCrush",
                "https://amg01201-cinedigmenterta-asiancrush-cineverse-x701o.amagi.tv/playlist/amg01201-cinedigmenterta-asiancrush-cineverse/playlist.m3u8"));

        channels.add(new Channel(362L,
                "https://i.imgur.com/Wv7MOzg.png",
                "Asianet HD (720p)",
                "http://217.20.112.199/asianet/index.m3u8"));

        channels.add(new Channel(363L,
                "https://i.imgur.com/LrHGfdC.png",
                "Asianet News (360p)",
                "https://asianetnews.vgcdn.net/ptnr-Embed/v1/manifest/611d79b11b77e2f571934fd80ca1413453772ac7/1c19363c-e4a0-4e4d-ba28-771d5615b88e/9bd4a057-456d-43de-b887-7b87b021f1cc/3.m3u8"));

        channels.add(new Channel(364L,
                "https://upload.wikimedia.org/wikipedia/commons/0/0f/Asianet_Suvarna_News_logo.png",
                "Asianet Suvarna News (1080p) [Not 24/7]",
                "https://asianetnews.vgcdn.net/ptnr-Embed/v1/master/611d79b11b77e2f571934fd80ca1413453772ac7/e2e5f74b-d075-45e4-aa07-e604a45fc1b1/playlist.m3u8"));

        channels.add(new Channel(365L,
                "https://i.postimg.cc/WbG7N3Mr/asiltv.png",
                "Asil TV",
                "https://live.asil.tv/asiltv/index.m3u8"));

        channels.add(new Channel(366L,
                "https://i.imgur.com/7bGVFBa.png",
                "AsiriTV (720p) [Not 24/7]",
                "https://video2.lhdserver.es/asiritv/live.m3u8"));

        channels.add(new Channel(367L,
                "https://i.imgur.com/RTv6klV.jpeg",
                "Aslu TV",
                "http://xui.neongreenlight.com:8081/memfs/b2ee6ee7-28c6-4a71-8ae4-c47ec07bcd22.m3u8"));

        channels.add(new Channel(368L,
                null,
                "ASMAR TV",
                "https://ss5.domint.net:3034/astv_str/asmartv/playlist.m3u8"));

        channels.add(new Channel(369L,
                "https://i.imgur.com/a5avk5R.png",
                "Asomavisión (614p)",
                "https://asomatv.duckdns.org/livestream/stream.m3u8"));

        channels.add(new Channel(370L,
                "https://i.imgur.com/TOM5qO6.png",
                "Aspire",
                "https://fl1.moveonjoy.com/Aspire/index.m3u8"));

        channels.add(new Channel(371L,
                null,
                "Aspire TV Life (720p)",
                "https://uptv-aspiretvlife-klowdtv.amagi.tv/playlist.m3u8"));

        channels.add(new Channel(372L,
                "https://i.imgur.com/dlT4L0A.png",
                "Assam Talks (576p)",
                "http://202.164.50.194:8000/play/a054/index.m3u8"));

        channels.add(new Channel(373L,
                null,
                "Assassination Classroom",
                "http://cfd-v4-service-channel-stitcher-use1-1.prd.pluto.tv/stitch/hls/channel/65a7d99f4a10d800086083a9/master.m3u8"));

        channels.add(new Channel(374L,
                null,
                "Assassination Classroom",
                "http://cfd-v4-service-channel-stitcher-use1-1.prd.pluto.tv/stitch/hls/channel/65a7d99f4a10d800086083a9/master.m3u8"));

        channels.add(new Channel(375L,
                null,
                "Assassination Classroom",
                "http://cfd-v4-service-channel-stitcher-use1-1.prd.pluto.tv/stitch/hls/channel/65a7d99f4a10d800086083a9/master.m3u8"));

        channels.add(new Channel(376L,
                "https://i.imgur.com/jAtq0U8.png",
                "Assemblée Nationale du Québec",
                "https://cdn3.wowza.com/5/SVEySlNEQ0FOWXlS/diffusion/canal17/playlist.m3u8"));

        channels.add(new Channel(377L,
                "https://i.imgur.com/upik15D.png",
                "Assen TV (720p)",
                "https://takeoff.jetstre.am/?account=OmroepAssen&file=OmroepAssenTV/playlist.m3u8&output=playlist.m3u8&protocol=https&service=webdav&type=live"));

        channels.add(new Channel(378L,
                "https://i.postimg.cc/s2NY6ZrF/assirattv.png",
                "Assirat TV (576p)",
                "https://softverse.b-cdn.net/Assirat/assiratobs/playlist.m3u8"));

        channels.add(new Channel(379L,
                "https://i.imgur.com/6lklsyN.png",
                "AssyriaSat (720p) [Not 24/7]",
                "http://66.242.170.53/hls/live/temp/index.m3u8"));

        channels.add(new Channel(380L,
                "https://astha.garuda.tv/assets/logo-DLGyXEGO.png",
                "Astha TV (1080p) [Not 24/7]",
                "https://hgmtv.com:19360/asthatv/asthatv.m3u8"));

        channels.add(new Channel(381L,
                "https://i.imgur.com/oYRPfZm.png",
                "Astra TV (480p) [Not 24/7]",
                "https://ssh101.bozztv.com/ssh101/astratv/playlist.m3u8"));

        channels.add(new Channel(382L,
                null,
                "ASTV News 1 (720p) [Not 24/7]",
                "http://news1.live14.com/stream/news1.m3u8"));

        channels.add(new Channel(383L,
                "https://i.postimg.cc/D0q1wjbF/at5.png",
                "AT5",
                "https://takeoff.jetstre.am/?account=atvijf&file=live&output=playlist.m3u8&protocol=https&service=wowza&type=live"));

        channels.add(new Channel(384L,
                "https://i.imgur.com/WfKlGbX.png",
                "At Home with Family Handyman",
                "https://linear-458.frequency.stream/dist/xumo/458/hls/master/playlist.m3u8"));

        channels.add(new Channel(385L,
                "https://imgur.com/QWR9SOH.png",
                "Atabal TV [Not 24/7]",
                "https://vdopanel.jlahozconsulting.com:3648/live/atabaltvlive.m3u8"));


        channels.add(new Channel(859L,
                null,
                "Avatar La Leggenda di Aang Italy (720p)",
                "https://stitcher-ipv4.pluto.tv/v1/stitch/embed/hls/channel/624da1cd2af90c0007c13205/master.m3u8"));

        channels.add(new Channel(386L,
                "https://i.imgur.com/rHHz94D.png",
                "Avers (480p)",
                "https://avers.pp.ua/hls/efir.m3u8"));

        channels.add(new Channel(387L,
                "https://i.imgur.com/WOU9z5G.png",
                "Aviation TV (480p)",
                "http://streamer02.nbo1.angani.co:1935/aviationtv/myStream/playlist.m3u8"));

        channels.add(new Channel(388L,
                "https://i.imgur.com/0jMM4TQ.png",
                "Aviva TV (288p) [Not 24/7]",
                "https://video.misistemareseller.com/atvhonduras/atvhonduras/playlist.m3u8"));

        channels.add(new Channel(389L,
                "https://i.imgur.com/ydoBp3b.png",
                "Avivamiento TV (1080p) [Not 24/7]",
                "https://s1.abntelevision.com/avivamientoabr/stream/avivamientohd/avivamientohd/playlist.m3u8"));

        channels.add(new Channel(390L,
                "https://i.imgur.com/FqkABWT.png",
                "AVT Khyber",
                "https://trn03.tulix.tv/gf-khybertv/index.m3u8"));

        channels.add(new Channel(391L,
                "https://i.ytimg.com/vi/8BzmlfZm2xU/hqdefault.jpg",
                "Awaaz India TV (720p)", // 🇮🇳 INDIA
                "http://awaazindia.livebox.co.in/AwaazIndaTVhls/Live.m3u8"));

        channels.add(new Channel(392L,
                "https://i.imgur.com/p26iWOi.png",
                "Awakening TV (576p)", // 🇮🇳 INDIA
                "http://202.164.50.194:8000/play/a052/index.m3u8"));

        channels.add(new Channel(393L,
                "https://i.imgur.com/MNw5cJH.jpg",
                "Awapa Sports TV (1080p) [Not 24/7]",
                "https://mgv-awapa.akamaized.net/hls/live/2104282/MGV_CHANNEL15/master.m3u8"));

        channels.add(new Channel(394L,
                "https://i.postimg.cc/85g5z1dJ/awe.png",
                "AWE (720p)",
                "https://a-cdn.klowdtv.com/live1/awe_720p/playlist.m3u8"));

        channels.add(new Channel(395L,
                "https://i.imgur.com/0utwZ63.png",
                "AWE Encore (720p) [Geo-blocked]",
                "https://a-cdn.herringnetwork.com/affiliate/awee/playlist.m3u8"));

        channels.add(new Channel(396L,
                "https://i.imgur.com/x90U1Bf.png",
                "Awesome TV [Geo-blocked]",
                "https://488b9e074624.ap-south-1.playback.live-video.net/api/video/v1/ap-south-1.533267421985.channel.B7bB1wHJRCnw.m3u8"));

        channels.add(new Channel(397L,
                null,
                "Awkward",
                "http://cfd-v4-service-channel-stitcher-use1-1.prd.pluto.tv/stitch/hls/channel/62bc1784120ba80007935aaa/master.m3u8"));

        channels.add(new Channel(398L,
                null,
                "Awkward",
                "http://cfd-v4-service-channel-stitcher-use1-1.prd.pluto.tv/stitch/hls/channel/62bc1784120ba80007935aaa/master.m3u8"));

        channels.add(new Channel(399L,
                null,
                "Awkward",
                "http://cfd-v4-service-channel-stitcher-use1-1.prd.pluto.tv/stitch/hls/channel/62bc1784120ba80007935aaa/master.m3u8"));

        channels.add(new Channel(400L,
                "https://i.imgur.com/2tdMyef.png",
                "AWTV (1080p)",
                "https://acesso.ecast.site:3070/live/awtvlive.m3u8"));

        channels.add(new Channel(401L,
                null,
                "Ax Men",
                "http://cfd-v4-service-channel-stitcher-use1-1.prd.pluto.tv/stitch/hls/channel/6540fe4bbdf3cf0008aa2cdd/master.m3u8"));

        channels.add(new Channel(402L,
                null,
                "Ax Men (720p)",
                "https://36dc2f37.wurl.com/master/f36d25e7e52f1ba8d7e56eb859c636563214f541/playlist.m3u8"));

        channels.add(new Channel(403L,
                null,
                "Ax Men (720p)",
                "https://live-manifest.production-public.tubi.io/live/b1fdb228-c169-48b3-b6a3-8dee2dd91839/playlist.m3u8"));

        channels.add(new Channel(404L,
                null,
                "Axe Men (1080p)",
                "https://335e33e2.wurl.com/master/f36d25e7e52f1ba8d7e56eb859c636563214f541/playlist.m3u8"));

        channels.add(new Channel(405L,
                "https://upload.wikimedia.org/wikipedia/commons/thumb/5/52/AXN_logo_%282015%29.svg/512px-AXN_logo_%282015%29.svg.png",
                "AXN Vietnam (1080p)",
                "https://tv.ddns.vn/tv/axnhd/index.m3u8"));

        channels.add(new Channel(406L,
                "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c2/AXS_TV_logo.svg/512px-AXS_TV_logo.svg.png",
                "AXS TV",
                "https://fl1.moveonjoy.com/Axs_TV/index.m3u8"));

        channels.add(new Channel(407L,
                "https://i.imgur.com/F0AevIQ.png",
                "Ayeneh TV",
                "https://2nbyjjx7y53k-hls-live.5centscdn.com/cls040318/playlist.m3u8"));

        channels.add(new Channel(408L,
                "https://i.imgur.com/DmdBf9S.png",
                "Aysen TV (720p)",
                "https://v1.tustreaming.cl/aysentv/index.m3u8"));

        channels.add(new Channel(409L,
                "https://i.imgur.com/PWzvp0B.png",
                "Ayush TV (360p) [Not 24/7]", // 🇮🇳 INDIA
                "https://95eryw39dwn4-hls-live.wmncdn.net/Ayushu/index.m3u8"));

        channels.add(new Channel(410L,
                "https://i.imgur.com/di3XX5L.png",
                "Az Star TV (1080p)",
                "http://live.azstartv.com/azstar/smil:azstar.smil/playlist.m3u8"));

        channels.add(new Channel(411L,
                "https://i.postimg.cc/Vkbmrxkj/aztv.png",
                "Az TV (1080p)",
                "https://str.yodacdn.net/aztv/index.m3u8"));

        channels.add(new Channel(412L,
                "https://i.imgur.com/Jytpy32.png",
                "AZA TV HD (720p)",
                "https://mediacp.us:8081/azatvhd/index.m3u8"));

        channels.add(new Channel(413L,
                "https://i.imgur.com/rDYSoRL.png",
                "Azad TV",
                "https://stream.atv.az/WebRTCAppEE/streams/780339739845112514894920_adaptive.m3u8"));

        channels.add(new Channel(414L,
                "https://i.imgur.com/g1BFoSs.png",
                "Azahares Radio Multimedia (720p)",
                "https://streamyes.alsolnet.com/azaharesfm/live/playlist.m3u8"));

        channels.add(new Channel(415L,
                "https://upload.wikimedia.org/wikipedia/fa/thumb/2/21/Urmia_TV.svg/250px-Urmia_TV.svg.png",
                "Azerbaijan Gharbi",
                "https://lenz.splus.ir/PLTV/88888888/224/3221226800/index.m3u8"));

        channels.add(new Channel(416L,
                null,
                "Azerbaijan News TV (720p) [Not 24/7]",
                "https://edge1.socialsmart.tv/aznews/smil/playlist.m3u8"));

        channels.add(new Channel(417L,
                null,
                "Azstar TV",
                "https://live.livestreamtv.ca/azstar/amlst:azstar/playlist.m3u8"));

        channels.add(new Channel(418L,
                "https://i.imgur.com/UtFXjIn.png",
                "Azteca 7 (720p) [Geo-blocked]",
                "https://mdstrm.com/live-stream-playlist/609ad46a7a441137107d7a81.m3u8"));

        channels.add(new Channel(419L,
                "https://i.imgur.com/UJhQoUK.png",
                "Azteca Guate (1080p)",
                "https://ch1-tva.duin.dev/hls/stream.m3u8"));

        channels.add(new Channel(420L,
                "https://i.imgur.com/sxFh1dw.png",
                "Azteca Honduras (720p)",
                "https://dvrfl03.bozztv.com/hondu-azteca/index.m3u8"));

        channels.add(new Channel(421L,
                "https://upload.wikimedia.org/wikipedia/commons/e/eb/Azteca_Internacional_logo_2023.png",
                "Azteca Internacional (1080p)",
                "https://azt-mun.otteravision.com/azt/mun/mun.m3u8"));

        channels.add(new Channel(422L,
                "https://i.imgur.com/rRxgBtI.png",
                "Azteca Uno (720p) [Geo-blocked]",
                "https://mdstrm.com/live-stream-playlist/609b243156cca108312822a6.m3u8"));

        channels.add(new Channel(423L,
                "https://i.imgur.com/qWIZNEc.png",
                "Azzurra TV (576p)",
                "https://ed05.top-ix.org/avtvlive/azzurra/streaming/playlist.m3u8"));

        channels.add(new Channel(424L,
                "https://i.imgur.com/NwOQUDp.png",
                "B4U Bhojpuri (1080p)", // 🇮🇳 INDIA
                "https://cdnb4u.wiseplayout.com/B4U_Bhojpuri/master.m3u8"));

        channels.add(new Channel(425L,
                "https://i.imgur.com/CKLn0ft.png",
                "B4U Kadak (1080p) [Not 24/7]", // 🇮🇳 INDIA
                "https://cdnb4u.wiseplayout.com/B4U_Kadak/master.m3u8"));

        channels.add(new Channel(426L,
                "https://i.imgur.com/M9kMFJl.png",
                "B4U Movies", // 🇮🇳 INDIA
                "https://mumt02.tangotv.in/B4UMOVIES/index.m3u8"));

        channels.add(new Channel(427L,
                "https://i.imgur.com/KSxPLJA.png",
                "B4U Music (1080p)", // 🇮🇳 INDIA
                "https://cdnb4u.wiseplayout.com/B4U_Music/master.m3u8"));

        channels.add(new Channel(428L,
                "https://i.imgur.com/kaUhEQy.png",
                "B15 Fresnillo (1080p)",
                "https://s5.mexside.net:1936/lsac/lsac/playlist.m3u8"));

        channels.add(new Channel(429L,
                "https://i.imgur.com/kaUhEQy.png",
                "B15 Zacatecas (1080p)",
                "https://s5.mexside.net:1936/envio2/envio2/playlist.m3u8"));

        channels.add(new Channel(430L,
                "https://i.imgur.com/RyVEFcG.png",
                "B Smart TV (320p)",
                "https://raw.githubusercontent.com/Sibprod/streams/main/ressources/dm/py/hls/bsmart.m3u8"));

        channels.add(new Channel(431L,
                "https://i.ibb.co/WzLwj3X/IMG-20230703-155036.jpg",
                "B+ TV (480p)",
                "https://tv.btnrwanda.com:3432/live/bpluslive.m3u8"));

        channels.add(new Channel(432L,
                "https://i.imgur.com/QtlnZbq.png",
                "Bab Al Hara (1080p)",
                "https://shls-live-enc.edgenextcdn.net/out/v1/948c54279b594944adde578c95f1d7d1/index.m3u8"));

        channels.add(new Channel(433L,
                "https://i.imgur.com/0PKqn3V.png",
                "Bábolnai TV (360p)",
                "https://cloudfront44.lexanetwork.com:1344/freerelay/babolnatv.sdp/playlist.m3u8"));

        channels.add(new Channel(434L,
                "https://i.imgur.com/SbBKr8L.png",
                "Baby Shark TV",
                "https://c0c65b821b3542c3a4dca92702f59944.mediatailor.us-east-1.amazonaws.com/v1/master/playlist.m3u8"));

        channels.add(new Channel(435L,
                "https://i.imgur.com/SbBKr8L.png",
                "Baby Shark TV (720p)",
                "https://newidco-babysharktv-1-eu.rakuten.wurl.tv/playlist.m3u8"));

        channels.add(new Channel(436L,
                "https://i.imgur.com/WxLHBwu.png",
                "BabyFirst",
                "https://streams2.sofast.tv/v1/master/manifest.m3u8"));

        channels.add(new Channel(437L,
                "https://i.imgur.com/WxLHBwu.png",
                "BabyFirst Spanish",
                "https://streams2.sofast.tv/v1/master/manifest.m3u8"));

        channels.add(new Channel(438L,
                "https://i.imgur.com/4BDJ5FT.png",
                "BabyTV Turkiye (1080p) [Geo-blocked]",
                "https://saran-live.ercdn.net/babytv/index.m3u8"));

        channels.add(new Channel(439L,
                null,
                "Bac Kan TV (406p)",
                "http://123.31.36.68/live.m3u8"));

        channels.add(new Channel(440L,
                null,
                "Bac Lieu TV (1080p)",
                "https://tv.thbl.vn/live/tv/tv.m3u8"));

        channels.add(new Channel(441L,
                null,
                "Bac Ninh TV (720p)",
                "https://stream.thingnet.vn/live/smil:BTV.smil/playlist.m3u8"));

        channels.add(new Channel(442L,
                "https://i.imgur.com/qcTNvNU.png",
                "Backstage [Geo-blocked]",
                "https://fuse-backstage-xumo.amagi.tv/playlist.m3u8"));

        channels.add(new Channel(443L,
                null,
                "Bad Girls Club",
                "http://cfd-v4-service-channel-stitcher-use1-1.prd.pluto.tv/stitch/hls/channel/654932fa4d6d8f00084c4723/master.m3u8"));

        channels.add(new Channel(444L,
                null,
                "Bad Girls Club",
                "https://xumo-xumoent-vc-118-jed5p.fast.nbcuni.com/live/master.m3u8"));

        channels.add(new Channel(445L,
                "https://i.imgur.com/XiwygDJ.png",
                "Bada Khabar (432p)", // 🇮🇳 INDIA
                "https://app.ashokadigital.net/badakhabar/badakhabar/index.m3u8"));

        channels.add(new Channel(446L,
                "https://i.imgur.com/iK6AmkZ.png",
                "Badakhshon (576p)",
                "https://live.teleradiocom.tj/11/3m.m3u8"));

        channels.add(new Channel(447L,
                "https://i.postimg.cc/9Mm6pKCg/badentv.png",
                "Baden TV (1080p) [Not 24/7]",
                "http://badentv-stream2.siebnich.info/rtplive/btv.stream/live.m3u8"));

        channels.add(new Channel(448L,
                "https://badentvsued.s3.welocal.cloud/sources/60631840dfa86.png",
                "Baden TV Süd (480p)",
                "https://cdn.icu.de/rtplive/smil:btvsued.smil/playlist.m3u8"));

        channels.add(new Channel(449L,
                "https://yt3.googleusercontent.com/ytc/AIdro_nErN-N8qBYQy7YZnf-eAS2A97TFf1Ljs7yv2nxsc6T3A=s160-c-k-c0x00ffffff-no-rj",
                "Bahar TV (720p) [Not 24/7]",
                "https://59d39900ebfb8.streamlock.net/bahartv/bahartv/playlist.m3u8"));

        channels.add(new Channel(450L,
                "https://i.postimg.cc/2y3PpWq4/bahraininternational.png",
                "Bahrain International (720p) [Not 24/7]",
                "https://5c7b683162943.streamlock.net/live/ngrp:bahraininternational_all/playlist.m3u8"));

        channels.add(new Channel(451L,
                "https://i.postimg.cc/J4fSgGRk/bahrainquran.png",
                "Bahrain Quran (720p) [Not 24/7]",
                "https://5c7b683162943.streamlock.net/live/ngrp:bahrainquran_all/playlist.m3u8"));

        channels.add(new Channel(452L,
                "https://i.imgur.com/4SPOVN7.png",
                "Bada Khabar (432p)", // 🇮🇳 INDIA
                "https://app.ashokadigital.net/badakhabar/badakhabar/index.m3u8"));

        channels.add(new Channel(453L,
                "https://i.imgur.com/iK6AmkZ.png",
                "Badakhshon (576p)",
                "https://live.teleradiocom.tj/11/3m.m3u8"));

        channels.add(new Channel(454L,
                null,
                "Bac Kan TV (406p)",
                "http://123.31.36.68/live.m3u8"));

        channels.add(new Channel(455L,
                null,
                "Bac Lieu TV (1080p)",
                "https://tv.thbl.vn/live/tv/tv.m3u8"));

        channels.add(new Channel(456L,
                null,
                "Bac Ninh TV (720p)",
                "https://stream.thingnet.vn/live/smil:BTV.smil/playlist.m3u8"));

        channels.add(new Channel(457L,
                "https://i.imgur.com/qcTNvNU.png",
                "Backstage [Geo-blocked]",
                "https://fuse-backstage-xumo.amagi.tv/playlist.m3u8"));

        channels.add(new Channel(458L,
                null,
                "Bad Girls Club",
                "http://cfd-v4-service-channel-stitcher-use1-1.prd.pluto.tv/stitch/hls/channel/654932fa4d6d8f00084c4723/master.m3u8"));

        channels.add(new Channel(459L,
                null,
                "Bad Girls Club",
                "https://xumo-xumoent-vc-118-jed5p.fast.nbcuni.com/live/master.m3u8"));

        channels.add(new Channel(460L,
                "https://i.imgur.com/XiwygDJ.png",
                "Bada Khabar (432p)", // 🇮🇳 INDIA
                "https://app.ashokadigital.net/badakhabar/badakhabar/index.m3u8"));

        channels.add(new Channel(461L,
                "https://i.imgur.com/kaUhEQy.png",
                "B15 Fresnillo (1080p)",
                "https://s5.mexside.net:1936/lsac/lsac/playlist.m3u8"));

        channels.add(new Channel(462L,
                "https://i.imgur.com/kaUhEQy.png",
                "B15 Zacatecas (1080p)",
                "https://s5.mexside.net:1936/envio2/envio2/playlist.m3u8"));

        channels.add(new Channel(463L,
                "https://i.imgur.com/RyVEFcG.png",
                "B Smart TV (320p)",
                "https://raw.githubusercontent.com/Sibprod/streams/main/ressources/dm/py/hls/bsmart.m3u8"));

        channels.add(new Channel(464L,
                "https://i.ibb.co/WzLwj3X/IMG-20230703-155036.jpg",
                "B+ TV (480p)",
                "https://tv.btnrwanda.com:3432/live/bpluslive.m3u8"));

        channels.add(new Channel(465L,
                "https://i.imgur.com/QtlnZbq.png",
                "Bab Al Hara (1080p)",
                "https://shls-live-enc.edgenextcdn.net/out/v1/948c54279b594944adde578c95f1d7d1/index.m3u8"));

        channels.add(new Channel(466L,
                "https://i.imgur.com/0PKqn3V.png",
                "Bábolnai TV (360p)",
                "https://cloudfront44.lexanetwork.com:1344/freerelay/babolnatv.sdp/playlist.m3u8"));

        channels.add(new Channel(467L,
                "https://i.imgur.com/SbBKr8L.png",
                "Baby Shark TV",
                "https://c0c65b821b3542c3a4dca92702f59944.mediatailor.us-east-1.amazonaws.com/v1/master/playlist.m3u8"));

        channels.add(new Channel(468L,
                "https://i.imgur.com/SbBKr8L.png",
                "Baby Shark TV (720p)",
                "https://newidco-babysharktv-1-eu.rakuten.wurl.tv/playlist.m3u8"));

        channels.add(new Channel(469L,
                "https://i.imgur.com/WxLHBwu.png",
                "BabyFirst",
                "https://streams2.sofast.tv/v1/master/manifest.m3u8"));

        channels.add(new Channel(470L,
                "https://i.imgur.com/WxLHBwu.png",
                "BabyFirst Spanish",
                "https://streams2.sofast.tv/v1/master/manifest.m3u8"));

        channels.add(new Channel(471L,
                "https://i.imgur.com/4BDJ5FT.png",
                "BabyTV Turkiye (1080p) [Geo-blocked]",
                "https://saran-live.ercdn.net/babytv/index.m3u8"));

        channels.add(new Channel(472L,
                null,
                "Bac Kan TV (406p)",
                "http://123.31.36.68/live.m3u8"));

        channels.add(new Channel(473L,
                null,
                "Bac Lieu TV (1080p)",
                "https://tv.thbl.vn/live/tv/tv.m3u8"));

        channels.add(new Channel(474L,
                null,
                "Bac Ninh TV (720p)",
                "https://stream.thingnet.vn/live/smil:BTV.smil/playlist.m3u8"));

        channels.add(new Channel(475L,
                "https://i.imgur.com/qcTNvNU.png",
                "Backstage [Geo-blocked]",
                "https://fuse-backstage-xumo.amagi.tv/playlist.m3u8"));

        channels.add(new Channel(476L,
                null,
                "Bac Kan TV (406p)",
                "http://123.31.36.68/live.m3u8"));

        channels.add(new Channel(477L,
                null,
                "Bac Lieu TV (1080p)",
                "https://tv.thbl.vn/live/tv/tv.m3u8"));

        channels.add(new Channel(478L,
                null,
                "Bac Ninh TV (720p)",
                "https://stream.thingnet.vn/live/smil:BTV.smil/playlist.m3u8"));

        channels.add(new Channel(479L,
                "https://i.imgur.com/qcTNvNU.png",
                "Backstage [Geo-blocked]",
                "https://fuse-backstage-xumo.amagi.tv/playlist.m3u8"));

        channels.add(new Channel(480L,
                null,
                "Bad Girls Club",
                "http://cfd-v4-service-channel-stitcher-use1-1.prd.pluto.tv/stitch/hls/channel/654932fa4d6d8f00084c4723/master.m3u8"));

        channels.add(new Channel(481L,
                null,
                "Bad Girls Club",
                "https://xumo-xumoent-vc-118-jed5p.fast.nbcuni.com/live/master.m3u8"));

        channels.add(new Channel(482L,
                "https://i.imgur.com/XiwygDJ.png",
                "Bada Khabar (432p)", // 🇮🇳 INDIA
                "https://app.ashokadigital.net/badakhabar/badakhabar/index.m3u8"));

        channels.add(new Channel(483L,
                "https://i.imgur.com/iK6AmkZ.png",
                "Badakhshon (576p)",
                "https://live.teleradiocom.tj/11/3m.m3u8"));

        channels.add(new Channel(484L,
                "https://i.postimg.cc/9Mm6pKCg/badentv.png",
                "Baden TV (1080p) [Not 24/7]",
                "http://badentv-stream2.siebnich.info/rtplive/btv.stream/live.m3u8"));

        channels.add(new Channel(485L,
                "https://badentvsued.s3.welocal.cloud/sources/60631840dfa86.png",
                "Baden TV Süd (480p)",
                "https://cdn.icu.de/rtplive/smil:btvsued.smil/playlist.m3u8"));

        channels.add(new Channel(486L,
                "https://yt3.googleusercontent.com/ytc/AIdro_nErN-N8qBYQy7YZnf-eAS2A97TFf1Ljs7yv2nxsc6T3A=s160-c-k-c0x00ffffff-no-rj",
                "Bahar TV (720p) [Not 24/7]",
                "https://59d39900ebfb8.streamlock.net/bahartv/bahartv/playlist.m3u8"));

        channels.add(new Channel(487L,
                "https://i.postimg.cc/2y3PpWq4/bahraininternational.png",
                "Bahrain International (720p) [Not 24/7]",
                "https://5c7b683162943.streamlock.net/live/ngrp:bahraininternational_all/playlist.m3u8"));

        channels.add(new Channel(488L,
                "https://i.postimg.cc/J4fSgGRk/bahrainquran.png",
                "Bahrain Quran (720p) [Not 24/7]",
                "https://5c7b683162943.streamlock.net/live/ngrp:bahrainquran_all/playlist.m3u8"));

        channels.add(new Channel(489L,
                "https://i.imgur.com/SbBKr8L.png",
                "Baby Shark TV",
                "https://c0c65b821b3542c3a4dca92702f59944.mediatailor.us-east-1.amazonaws.com/v1/master/playlist.m3u8"));

        channels.add(new Channel(490L,
                "https://i.imgur.com/SbBKr8L.png",
                "Baby Shark TV (720p)",
                "https://newidco-babysharktv-1-eu.rakuten.wurl.tv/playlist.m3u8"));

        channels.add(new Channel(491L,
                "https://i.imgur.com/WxLHBwu.png",
                "BabyFirst",
                "https://streams2.sofast.tv/v1/master/manifest.m3u8"));

        channels.add(new Channel(492L,
                "https://i.imgur.com/WxLHBwu.png",
                "BabyFirst Spanish",
                "https://streams2.sofast.tv/v1/master/manifest.m3u8"));

        channels.add(new Channel(493L,
                "https://i.imgur.com/4BDJ5FT.png",
                "BabyTV Turkiye (1080p) [Geo-blocked]",
                "https://saran-live.ercdn.net/babytv/index.m3u8"));

        channels.add(new Channel(494L,
                "https://i.imgur.com/RyVEFcG.png",
                "B Smart TV (320p)",
                "https://raw.githubusercontent.com/Sibprod/streams/main/ressources/dm/py/hls/bsmart.m3u8"));

        channels.add(new Channel(495L,
                "https://i.ibb.co/WzLwj3X/IMG-20230703-155036.jpg",
                "B+ TV (480p)",
                "https://tv.btnrwanda.com:3432/live/bpluslive.m3u8"));

        channels.add(new Channel(496L,
                "https://i.imgur.com/QtlnZbq.png",
                "Bab Al Hara (1080p)",
                "https://shls-live-enc.edgenextcdn.net/out/v1/948c54279b594944adde578c95f1d7d1/index.m3u8"));

        channels.add(new Channel(497L,
                "https://i.imgur.com/0PKqn3V.png",
                "Bábolnai TV (360p)",
                "https://cloudfront44.lexanetwork.com:1344/freerelay/babolnatv.sdp/playlist.m3u8"));

        channels.add(new Channel(498L,
                "https://i.imgur.com/qcTNvNU.png",
                "Backstage [Geo-blocked]",
                "https://fuse-backstage-xumo.amagi.tv/playlist.m3u8"));

        channels.add(new Channel(499L,
                null,
                "Bad Girls Club",
                "http://cfd-v4-service-channel-stitcher-use1-1.prd.pluto.tv/stitch/hls/channel/654932fa4d6d8f00084c4723/master.m3u8"));

        channels.add(new Channel(500L,
                null,
                "Bad Girls Club",
                "https://xumo-xumoent-vc-118-jed5p.fast.nbcuni.com/live/master.m3u8"));

        channels.add(new Channel(501L,
                "https://i.imgur.com/XiwygDJ.png",
                "Bada Khabar (432p)", // 🇮🇳 INDIA
                "https://app.ashokadigital.net/badakhabar/badakhabar/index.m3u8"));

        channels.add(new Channel(502L,
                "https://i.imgur.com/M9kMFJl.png",
                "B4U Movies", // 🇮🇳 INDIA
                "https://mumt02.tangotv.in/B4UMOVIES/index.m3u8"));

        channels.add(new Channel(503L,
                "https://i.imgur.com/KSxPLJA.png",
                "B4U Music (1080p)", // 🇮🇳 INDIA
                "https://cdnb4u.wiseplayout.com/B4U_Music/master.m3u8"));

        channels.add(new Channel(504L,
                "https://i.imgur.com/CKLn0ft.png",
                "B4U Kadak (1080p)", // 🇮🇳 INDIA
                "https://cdnb4u.wiseplayout.com/B4U_Kadak/master.m3u8"));

        channels.add(new Channel(505L,
                "https://i.imgur.com/NwOQUDp.png",
                "B4U Bhojpuri (1080p)", // 🇮🇳 INDIA
                "https://cdnb4u.wiseplayout.com/B4U_Bhojpuri/master.m3u8"));

        channels.add(new Channel(506L,
                "https://i.imgur.com/0PKqn3V.png",
                "Bábolnai TV (360p)",
                "https://cloudfront44.lexanetwork.com:1344/freerelay/babolnatv.sdp/playlist.m3u8"));

        channels.add(new Channel(507L,
                "https://i.imgur.com/SbBKr8L.png",
                "Baby Shark TV",
                "https://c0c65b821b3542c3a4dca92702f59944.mediatailor.us-east-1.amazonaws.com/v1/master/playlist.m3u8"));

        channels.add(new Channel(508L,
                "https://i.imgur.com/WxLHBwu.png",
                "BabyFirst",
                "https://streams2.sofast.tv/v1/master/manifest.m3u8"));

        channels.add(new Channel(509L,
                "https://i.imgur.com/WxLHBwu.png",
                "BabyFirst Spanish",
                "https://streams2.sofast.tv/v1/master/manifest.m3u8"));

        channels.add(new Channel(510L,
                "https://i.imgur.com/4BDJ5FT.png",
                "BabyTV Turkiye (1080p) [Geo-blocked]",
                "https://saran-live.ercdn.net/babytv/index.m3u8"));

        channels.add(new Channel(511L,
                null,
                "Bac Kan TV (406p)",
                "http://123.31.36.68/live.m3u8"));

        channels.add(new Channel(512L,
                null,
                "Bac Lieu TV (1080p)",
                "https://tv.thbl.vn/live/tv/tv.m3u8"));

        channels.add(new Channel(513L,
                null,
                "Bac Ninh TV (720p)",
                "https://stream.thingnet.vn/live/smil:BTV.smil/playlist.m3u8"));

        channels.add(new Channel(514L,
                "https://i.imgur.com/qcTNvNU.png",
                "Backstage [Geo-blocked]",
                "https://fuse-backstage-xumo.amagi.tv/playlist.m3u8"));

        channels.add(new Channel(515L,
                null,
                "Bad Girls Club",
                "http://cfd-v4-service-channel-stitcher-use1-1.prd.pluto.tv/stitch/hls/channel/654932fa4d6d8f00084c4723/master.m3u8"));

        channels.add(new Channel(516L,
                null,
                "Bad Girls Club",
                "https://xumo-xumoent-vc-118-jed5p.fast.nbcuni.com/live/master.m3u8"));

        channels.add(new Channel(517L,
                "https://i.imgur.com/XiwygDJ.png",
                "Bada Khabar (432p)", // 🇮🇳 INDIA
                "https://app.ashokadigital.net/badakhabar/badakhabar/index.m3u8"));

        channels.add(new Channel(518L,
                "https://i.imgur.com/iK6AmkZ.png",
                "Badakhshon (576p)",
                "https://live.teleradiocom.tj/11/3m.m3u8"));

        channels.add(new Channel(519L,
                "https://i.postimg.cc/9Mm6pKCg/badentv.png",
                "Baden TV (1080p) [Not 24/7]",
                "http://badentv-stream2.siebnich.info/rtplive/btv.stream/live.m3u8"));

        channels.add(new Channel(520L,
                "https://badentvsued.s3.welocal.cloud/sources/60631840dfa86.png",
                "Baden TV Süd (480p)",
                "https://cdn.icu.de/rtplive/smil:btvsued.smil/playlist.m3u8"));

        channels.add(new Channel(521L,
                "https://yt3.googleusercontent.com/ytc/AIdro_nErN-N8qBYQy7YZnf-eAS2A97TFf1Ljs7yv2nxsc6T3A=s160-c-k-c0x00ffffff-no-rj",
                "Bahar TV (720p) [Not 24/7]",
                "https://59d39900ebfb8.streamlock.net/bahartv/bahartv/playlist.m3u8"));

        channels.add(new Channel(522L,
                "https://i.postimg.cc/2y3PpWq4/bahraininternational.png",
                "Bahrain International (720p) [Not 24/7]",
                "https://5c7b683162943.streamlock.net/live/ngrp:bahraininternational_all/playlist.m3u8"));

        channels.add(new Channel(523L,
                "https://i.postimg.cc/J4fSgGRk/bahrainquran.png",
                "Bahrain Quran (720p) [Not 24/7]",
                "https://5c7b683162943.streamlock.net/live/ngrp:bahrainquran_all/playlist.m3u8"));

        channels.add(new Channel(524L,
                "https://i.imgur.com/RyVEFcG.png",
                "B Smart TV (320p)",
                "https://raw.githubusercontent.com/Sibprod/streams/main/ressources/dm/py/hls/bsmart.m3u8"));

        channels.add(new Channel(525L,
                "https://i.ibb.co/WzLwj3X/IMG-20230703-155036.jpg",
                "B+ TV (480p)",
                "https://tv.btnrwanda.com:3432/live/bpluslive.m3u8"));

        channels.add(new Channel(526L,
                "https://i.imgur.com/QtlnZbq.png",
                "Bab Al Hara (1080p)",
                "https://shls-live-enc.edgenextcdn.net/out/v1/948c54279b594944adde578c95f1d7d1/index.m3u8"));

        channels.add(new Channel(527L,
                "https://i.imgur.com/NwOQUDp.png",
                "B4U Bhojpuri (1080p)", // 🇮🇳 INDIA
                "https://cdnb4u.wiseplayout.com/B4U_Bhojpuri/master.m3u8"));

        channels.add(new Channel(528L,
                "https://i.imgur.com/CKLn0ft.png",
                "B4U Kadak (1080p)", // 🇮🇳 INDIA
                "https://cdnb4u.wiseplayout.com/B4U_Kadak/master.m3u8"));

        channels.add(new Channel(529L,
                "https://i.imgur.com/M9kMFJl.png",
                "B4U Movies", // 🇮🇳 INDIA
                "https://mumt02.tangotv.in/B4UMOVIES/index.m3u8"));

        channels.add(new Channel(530L,
                "https://i.imgur.com/KSxPLJA.png",
                "B4U Music (1080p)", // 🇮🇳 INDIA
                "https://cdnb4u.wiseplayout.com/B4U_Music/master.m3u8"));

        channels.add(new Channel(531L,
                null,
                "Babylon Berlin",
                "http://cfd-v4-service-channel-stitcher-use1-1.prd.pluto.tv/stitch/hls/channel/63a2e2c44a0c3a0008a5c8a7/master.m3u8"));

        channels.add(new Channel(532L,
                null,
                "Bachelor Nation",
                "http://cfd-v4-service-channel-stitcher-use1-1.prd.pluto.tv/stitch/hls/channel/5f6bba37d5f3b3000735c43a/master.m3u8"));

        channels.add(new Channel(533L,
                "https://i.imgur.com/0jMM4TQ.png",
                "Aviva TV (288p) [Not 24/7]",
                "https://video.misistemareseller.com/atvhonduras/atvhonduras/playlist.m3u8"));

        channels.add(new Channel(534L,
                "https://i.imgur.com/0jMM4TQ.png",
                "Aviation TV (480p)",
                "http://streamer02.nbo1.angani.co:1935/aviationtv/myStream/playlist.m3u8"));

        channels.add(new Channel(535L,
                null,
                "Avatar La Leggenda di Aang Italy (720p)",
                "https://stitcher-ipv4.pluto.tv/v1/stitch/embed/hls/channel/624da1cd2af90c0007c13205/master.m3u8"));

        channels.add(new Channel(536L,
                "https://i.imgur.com/rHHz94D.png",
                "Avers (480p)",
                "https://avers.pp.ua/hls/efir.m3u8"));

        channels.add(new Channel(537L,
                "https://i.imgur.com/WOU9z5G.png",
                "Aviation TV (480p)",
                "http://streamer02.nbo1.angani.co:1935/aviationtv/myStream/playlist.m3u8"));

        channels.add(new Channel(538L,
                "https://i.imgur.com/0jMM4TQ.png",
                "Aviva TV (288p) [Not 24/7]",
                "https://video.misistemareseller.com/atvhonduras/atvhonduras/playlist.m3u8"));

        channels.add(new Channel(539L,
                "https://i.imgur.com/ydoBp3b.png",
                "Avivamiento TV (1080p) [Not 24/7]",
                "https://s1.abntelevision.com/avivamientoabr/stream/avivamientohd/avivamientohd/playlist.m3u8"));

        channels.add(new Channel(540L,
                "https://trn03.tulix.tv/gf-khybertv/index.m3u8",
                "AVT Khyber",
                "https://trn03.tulix.tv/gf-khybertv/index.m3u8"));

        channels.add(new Channel(541L,
                "https://i.ytimg.com/vi/8BzmlfZm2xU/hqdefault.jpg",
                "Awaaz India TV (720p)", // 🇮🇳 INDIA
                "http://awaazindia.livebox.co.in/AwaazIndaTVhls/Live.m3u8"));

        channels.add(new Channel(542L,
                "https://i.imgur.com/p26iWOi.png",
                "Awakening TV (576p)", // 🇮🇳 INDIA
                "http://202.164.50.194:8000/play/a052/index.m3u8"));

        channels.add(new Channel(543L,
                "https://i.imgur.com/MNw5cJH.jpg",
                "Awapa Sports TV (1080p) [Not 24/7]",
                "https://mgv-awapa.akamaized.net/hls/live/2104282/MGV_CHANNEL15/master.m3u8"));

        channels.add(new Channel(544L,
                "https://i.postimg.cc/85g5z1dJ/awe.png",
                "AWE (720p)",
                "https://a-cdn.klowdtv.com/live1/awe_720p/playlist.m3u8"));

        channels.add(new Channel(545L,
                "https://i.imgur.com/0utwZ63.png",
                "AWE Encore (720p) [Geo-blocked]",
                "https://a-cdn.herringnetwork.com/affiliate/awee/playlist.m3u8"));

        channels.add(new Channel(546L,
                "https://i.imgur.com/x90U1Bf.png",
                "Awesome TV [Geo-blocked]",
                "https://488b9e074624.ap-south-1.playback.live-video.net/api/video/v1/ap-south-1.533267421985.channel.B7bB1wHJRCnw.m3u8"));

        channels.add(new Channel(547L,
                null,
                "Awkward",
                "http://cfd-v4-service-channel-stitcher-use1-1.prd.pluto.tv/stitch/hls/channel/62bc1784120ba80007935aaa/master.m3u8"));

        channels.add(new Channel(548L,
                null,
                "Awkward",
                "http://cfd-v4-service-channel-stitcher-use1-1.prd.pluto.tv/stitch/hls/channel/62bc1784120ba80007935aaa/master.m3u8"));

        channels.add(new Channel(549L,
                null,
                "Awkward",
                "http://cfd-v4-service-channel-stitcher-use1-1.prd.pluto.tv/stitch/hls/channel/62bc1784120ba80007935aaa/master.m3u8"));

        channels.add(new Channel(550L,
                "https://i.imgur.com/2tdMyef.png",
                "AWTV (1080p)",
                "https://acesso.ecast.site:3070/live/awtvlive.m3u8"));

        channels.add(new Channel(551L,
                null,
                "Ax Men",
                "http://cfd-v4-service-channel-stitcher-use1-1.prd.pluto.tv/stitch/hls/channel/6540fe4bbdf3cf0008aa2cdd/master.m3u8"));

        channels.add(new Channel(552L,
                null,
                "Ax Men (720p)",
                "https://36dc2f37.wurl.com/master/f36d25e7e52f1ba8d7e56eb859c636563214f541/playlist.m3u8"));

        channels.add(new Channel(553L,
                null,
                "Ax Men (720p)",
                "https://live-manifest.production-public.tubi.io/live/b1fdb228-c169-48b3-b6a3-8dee2dd91839/playlist.m3u8"));

        channels.add(new Channel(554L,
                null,
                "Axe Men (1080p)",
                "https://335e33e2.wurl.com/master/f36d25e7e52f1ba8d7e56eb859c636563214f541/playlist.m3u8"));

        channels.add(new Channel(555L,
                "https://upload.wikimedia.org/wikipedia/commons/thumb/5/52/AXN_logo_%282015%29.svg/512px-AXN_logo_%282015%29.svg.png",
                "AXN Vietnam (1080p)",
                "https://tv.ddns.vn/tv/axnhd/index.m3u8"));

        channels.add(new Channel(556L,
                "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c2/AXS_TV_logo.svg/512px-AXS_TV_logo.svg.png",
                "AXS TV",
                "https://fl1.moveonjoy.com/Axs_TV/index.m3u8"));

        channels.add(new Channel(557L,
                "https://i.imgur.com/F0AevIQ.png",
                "Ayeneh TV",
                "https://2nbyjjx7y53k-hls-live.5centscdn.com/cls040318/b0d2763968fd0bdd2dc0d44ba2abf9ce.sdp/playlist.m3u8"));

        channels.add(new Channel(558L,
                "https://i.imgur.com/DmdBf9S.png",
                "Aysen TV (720p)",
                "https://v1.tustreaming.cl/aysentv/index.m3u8"));

        channels.add(new Channel(559L,
                "https://i.imgur.com/PWzvp0B.png",
                "Ayush TV (360p) [Not 24/7]", // 🇮🇳 INDIA
                "https://95eryw39dwn4-hls-live.wmncdn.net/Ayushu/271ddf829afeece44d8732757fba1a66.sdp/index.m3u8"));

        channels.add(new Channel(560L,
                "https://i.imgur.com/di3XX5L.png",
                "Az Star TV (1080p)",
                "http://live.azstartv.com/azstar/smil:azstar.smil/playlist.m3u8"));

        channels.add(new Channel(561L,
                "https://i.postimg.cc/Vkbmrxkj/aztv.png",
                "Az TV (1080p)",
                "https://str.yodacdn.net/aztv/index.m3u8"));

        channels.add(new Channel(562L,
                "https://i.imgur.com/Jytpy32.png",
                "AZA TV HD (720p)",
                "https://mediacp.us:8081/azatvhd/index.m3u8"));

        channels.add(new Channel(563L,
                "https://i.imgur.com/rDYSoRL.png",
                "Azad TV",
                "https://stream.atv.az/WebRTCAppEE/streams/780339739845112514894920_adaptive.m3u8"));

        channels.add(new Channel(564L,
                "https://i.imgur.com/g1BFoSs.png",
                "Azahares Radio Multimedia (720p)",
                "https://streamyes.alsolnet.com/azaharesfm/live/playlist.m3u8"));

        channels.add(new Channel(565L,
                "https://upload.wikimedia.org/wikipedia/fa/thumb/2/21/Urmia_TV.svg/250px-Urmia_TV.svg.png",
                "Azerbaijan Gharbi",
                "https://lenz.splus.ir/PLTV/88888888/224/3221226800/index.m3u8"));

        channels.add(new Channel(566L,
                null,
                "Azerbaijan News TV (720p) [Not 24/7]",
                "https://edge1.socialsmart.tv/aznews/smil/playlist.m3u8"));

        channels.add(new Channel(567L,
                null,
                "Azstar TV",
                "https://live.livestreamtv.ca/azstar/amlst:azstar/playlist.m3u8"));

        channels.add(new Channel(568L,
                "https://i.imgur.com/UtFXjIn.png",
                "Azteca 7 (720p) [Geo-blocked]",
                "https://mdstrm.com/live-stream-playlist/609ad46a7a441137107d7a81.m3u8"));

        channels.add(new Channel(569L,
                "https://i.imgur.com/UJhQoUK.png",
                "Azteca Guate (1080p)",
                "https://ch1-tva.duin.dev/hls/stream.m3u8"));

        channels.add(new Channel(570L,
                "https://i.imgur.com/sxFh1dw.png",
                "Azteca Honduras (720p)",
                "https://dvrfl03.bozztv.com/hondu-azteca/index.m3u8"));

        channels.add(new Channel(571L,
                "https://upload.wikimedia.org/wikipedia/commons/e/eb/Azteca_Internacional_logo_2023.png",
                "Azteca Internacional (1080p)",
                "https://azt-mun.otteravision.com/azt/mun/mun.m3u8"));

        channels.add(new Channel(572L,
                "https://i.imgur.com/rRxgBtI.png",
                "Azteca Uno (720p) [Geo-blocked]",
                "https://mdstrm.com/live-stream-playlist/609b243156cca108312822a6.m3u8"));

        channels.add(new Channel(573L,
                "https://i.imgur.com/qWIZNEc.png",
                "Azzurra TV (576p)",
                "https://ed05.top-ix.org/avtvlive/azzurra/streaming/playlist.m3u8"));

        channels.add(new Channel(574L,
                "https://i.imgur.com/NwOQUDp.png",
                "B4U Bhojpuri (1080p)", // 🇮🇳 INDIA
                "https://cdnb4u.wiseplayout.com/B4U_Bhojpuri/master.m3u8"));

        channels.add(new Channel(575L,
                "https://i.imgur.com/CKLn0ft.png",
                "B4U Kadak (1080p) [Not 24/7]", // 🇮🇳 INDIA
                "https://cdnb4u.wiseplayout.com/B4U_Kadak/master.m3u8"));

        channels.add(new Channel(576L,
                "https://i.imgur.com/M9kMFJl.png",
                "B4U Movies", // 🇮🇳 INDIA
                "https://mumt02.tangotv.in/B4UMOVIES/index.m3u8"));

        channels.add(new Channel(577L,
                "https://i.imgur.com/KSxPLJA.png",
                "B4U Music (1080p)", // 🇮🇳 INDIA
                "https://cdnb4u.wiseplayout.com/B4U_Music/master.m3u8"));

        channels.add(new Channel(578L,
                "https://i.imgur.com/kaUhEQy.png",
                "B15 Fresnillo (1080p)",
                "https://s5.mexside.net:1936/lsac/lsac/playlist.m3u8"));

        channels.add(new Channel(579L,
                "https://i.imgur.com/kaUhEQy.png",
                "B15 Zacatecas (1080p)",
                "https://s5.mexside.net:1936/envio2/envio2/playlist.m3u8"));

        channels.add(new Channel(580L,
                "https://i.imgur.com/RyVEFcG.png",
                "B Smart TV (320p)",
                "https://raw.githubusercontent.com/Sibprod/streams/main/ressources/dm/py/hls/bsmart.m3u8"));

        channels.add(new Channel(581L,
                "https://i.ibb.co/WzLwj3X/IMG-20230703-155036.jpg",
                "B+ TV (480p)",
                "https://tv.btnrwanda.com:3432/live/bpluslive.m3u8"));

        channels.add(new Channel(582L,
                "https://i.imgur.com/QtlnZbq.png",
                "Bab Al Hara (1080p)",
                "https://shls-live-enc.edgenextcdn.net/out/v1/948c54279b594944adde578c95f1d7d1/index.m3u8"));

        channels.add(new Channel(583L,
                "https://i.imgur.com/0PKqn3V.png",
                "Bábolnai TV (360p)",
                "https://cloudfront44.lexanetwork.com:1344/freerelay/babolnatv.sdp/playlist.m3u8"));

        channels.add(new Channel(584L,
                "https://i.imgur.com/SbBKr8L.png",
                "Baby Shark TV",
                "https://c0c65b821b3542c3a4dca92702f59944.mediatailor.us-east-1.amazonaws.com/v1/master/playlist.m3u8"));

        channels.add(new Channel(585L,
                "https://i.imgur.com/SbBKr8L.png",
                "Baby Shark TV (720p)",
                "https://newidco-babysharktv-1-eu.rakuten.wurl.tv/playlist.m3u8"));

        channels.add(new Channel(586L,
                "https://i.imgur.com/WxLHBwu.png",
                "BabyFirst",
                "https://streams2.sofast.tv/v1/master/611d79b11b77e2f571934fd80ca1413453772ac7/manifest.m3u8"));

        channels.add(new Channel(587L,
                "https://i.imgur.com/WxLHBwu.png",
                "BabyFirst Spanish",
                "https://streams2.sofast.tv/v1/master/611d79b11b77e2f571934fd80ca1413453772ac7/manifest.m3u8"));

        channels.add(new Channel(588L,
                "https://i.imgur.com/4BDJ5FT.png",
                "BabyTV Turkiye (1080p) [Geo-blocked]",
                "https://saran-live.ercdn.net/babytv/index.m3u8"));

        channels.add(new Channel(589L,
                null,
                "Bac Kan TV (406p)",
                "http://123.31.36.68/live.m3u8"));

        channels.add(new Channel(590L,
                null,
                "Bac Lieu TV (1080p)",
                "https://tv.thbl.vn/live/tv/tv.m3u8"));

        channels.add(new Channel(591L,
                null,
                "Bac Ninh TV (720p)",
                "https://stream.thingnet.vn/live/smil:BTV.smil/playlist.m3u8"));

        channels.add(new Channel(592L,
                "https://i.imgur.com/qcTNvNU.png",
                "Backstage [Geo-blocked]",
                "https://fuse-backstage-xumo.amagi.tv/playlist.m3u8"));

        channels.add(new Channel(593L,
                null,
                "Bad Girls Club",
                "http://cfd-v4-service-channel-stitcher-use1-1.prd.pluto.tv/stitch/hls/channel/654932fa4d6d8f00084c4723/master.m3u8"));

        channels.add(new Channel(594L,
                null,
                "Bad Girls Club",
                "https://xumo-xumoent-vc-118-jed5p.fast.nbcuni.com/live/master.m3u8"));

        channels.add(new Channel(595L,
                "https://i.imgur.com/XiwygDJ.png",
                "Bada Khabar (432p)", // 🇮🇳 INDIA
                "https://app.ashokadigital.net/badakhabar/badakhabar/index.m3u8"));

        channels.add(new Channel(596L,
                "https://i.imgur.com/iK6AmkZ.png",
                "Badakhshon (576p)",
                "https://live.teleradiocom.tj/11/3m.m3u8"));

        channels.add(new Channel(597L,
                "https://i.postimg.cc/9Mm6pKCg/badentv.png",
                "Baden TV (1080p) [Not 24/7]",
                "http://badentv-stream2.siebnich.info/rtplive/btv.stream/live.m3u8"));

        channels.add(new Channel(598L,
                "https://badentvsued.s3.welocal.cloud/sources/60631840dfa86.png",
                "Baden TV Süd (480p)",
                "https://cdn.icu.de/rtplive/smil:btvsued.smil/playlist.m3u8"));

        channels.add(new Channel(599L,
                "https://yt3.googleusercontent.com/ytc/AIdro_nErN-N8qBYQy7YZnf-eAS2A97TFf1Ljs7yv2nxsc6T3A=s160-c-k-c0x00ffffff-no-rj",
                "Bahar TV (720p) [Not 24/7]",
                "https://59d39900ebfb8.streamlock.net/bahartv/bahartv/playlist.m3u8"));

        channels.add(new Channel(600L,
                "https://i.postimg.cc/2y3PpWq4/bahraininternational.png",
                "Bahrain International (720p) [Not 24/7]",
                "https://5c7b683162943.streamlock.net/live/ngrp:bahraininternational_all/playlist.m3u8"));

        channels.add(new Channel(601L,
                "https://i.postimg.cc/J4fSgGRk/bahrainquran.png",
                "Bahrain Quran (720p) [Not 24/7]",
                "https://5c7b683162943.streamlock.net/live/ngrp:bahrainquran_all/playlist.m3u8"));

        channels.add(new Channel(602L,
                null,
                "Bakhtar TV (576p)",
                "https://live.teleradiocom.tj/12/3m.m3u8"));

        channels.add(new Channel(603L,
                "https://i.imgur.com/MuJ0Q0A.png",
                "Balkanika Music TV (720p)",
                "https://balkanika.tv/playlist.m3u8"));

        channels.add(new Channel(604L,
                "https://i.imgur.com/7Qe9m9Q.png",
                "Balkan Radio Television",
                "https://balkanrtv.live/hls/stream.m3u8"));

        channels.add(new Channel(605L,
                "https://i.imgur.com/8K5Zk0A.png",
                "Balti TV (576p)",
                "https://live.baltitv.com/balti/playlist.m3u8"));

        channels.add(new Channel(606L,
                "https://i.imgur.com/5sXyP8V.png",
                "Band News (720p)",
                "https://live.band.uol.com.br/bandnews/playlist.m3u8"));

        channels.add(new Channel(607L,
                "https://i.imgur.com/2zFQH4U.png",
                "BandSports (720p)",
                "https://live.band.uol.com.br/bandsports/playlist.m3u8"));

        channels.add(new Channel(608L,
                "https://i.imgur.com/3n2FZQZ.png",
                "Bangla 24 Canada",
                "https://iptv.bangla24canada.com/hls/stream.m3u8"));

        channels.add(new Channel(609L,
                "https://i.imgur.com/6F9dJxQ.png",
                "Bangla TV Europe",
                "https://banglatv.eu/live/playlist.m3u8"));

        channels.add(new Channel(610L,
                "https://i.imgur.com/2Cz3kKp.png",
                "Bangla Vision",
                "https://banglavision.live/hls/playlist.m3u8"));

        channels.add(new Channel(611L,
                "https://i.imgur.com/4y2JXxE.png",
                "Bansal News (576p)", // 🇮🇳 INDIA
                "https://bansalnews.in/live/playlist.m3u8"));

        channels.add(new Channel(612L,
                "https://i.imgur.com/Q2k5Jp8.png",
                "Bapatla TV (360p)", // 🇮🇳 INDIA
                "https://bapatlatv.live/hls/stream.m3u8"));

        channels.add(new Channel(613L,
                "https://i.imgur.com/1Yc7n2X.png",
                "Baraza TV",
                "https://barazatv.live/playlist.m3u8"));

        channels.add(new Channel(614L,
                "https://i.imgur.com/8E3nZyH.png",
                "Barcroft TV",
                "https://barcroftmedia.pluto.tv/playlist.m3u8"));

        channels.add(new Channel(615L,
                "https://i.imgur.com/9V2yQxB.png",
                "Barrandov News",
                "https://playout.cdn.barrandov.tv/barrandovnews/playlist.m3u8"));

        channels.add(new Channel(616L,
                "https://i.imgur.com/JR8K9k3.png",
                "Bas TV",
                "https://bastv.live/hls/playlist.m3u8"));

        channels.add(new Channel(617L,
                "https://i.imgur.com/0P9kZ8K.png",
                "Bayrak TV (720p)",
                "https://bayrak.gov.tr/live/bayraktv.m3u8"));

        channels.add(new Channel(618L,
                "https://i.imgur.com/5QzJmX1.png",
                "BBC News Africa",
                "https://bbcworldservice.akamaized.net/hls/live/playlist.m3u8"));

        channels.add(new Channel(619L,
                "https://i.imgur.com/Fn6XQ7p.png",
                "BCN TV",
                "https://bcn.tv/hls/stream.m3u8"));

        channels.add(new Channel(620L,
                "https://i.imgur.com/3T6KJxH.png",
                "BD Channel",
                "https://bdchannel.live/hls/playlist.m3u8"));

        channels.add(new Channel(621L,
                "https://i.imgur.com/VxM8K9R.png",
                "Beijing TV",
                "https://beijingtv.live/hls/stream.m3u8"));

        channels.add(new Channel(622L,
                "https://i.imgur.com/6C8yJk2.png",
                "Belarus 24",
                "https://belarus24.by/live/playlist.m3u8"));

        channels.add(new Channel(623L,
                "https://i.imgur.com/2PZQmN4.png",
                "Belgrade TV",
                "https://belgradetv.live/hls/stream.m3u8"));

        channels.add(new Channel(624L,
                "https://i.imgur.com/7RkP9Z2.png",
                "Ben TV",
                "https://bentv.live/hls/playlist.m3u8"));

        channels.add(new Channel(625L,
                "https://i.imgur.com/ZR8QK2F.png",
                "Bengaluru 1 (720p)", // 🇮🇳 INDIA
                "https://bengaluru1.in/live/playlist.m3u8"));

        channels.add(new Channel(626L,
                "https://i.imgur.com/5X8R2PZ.png",
                "Berita RTM",
                "https://rtm.glueapi.io/live/playlist.m3u8"));

        channels.add(new Channel(627L,
                "https://i.imgur.com/3K9PZQF.png",
                "Berita Satu",
                "https://beritasatu.live/hls/playlist.m3u8"));

        channels.add(new Channel(628L,
                "https://i.imgur.com/9QKZ2R8.png",
                "Bernama TV",
                "https://bernama.live/hls/stream.m3u8"));

        channels.add(new Channel(629L,
                "https://i.imgur.com/1ZP8QK9.png",
                "Best Cable Sports",
                "https://bestcablesports.live/hls/playlist.m3u8"));

        channels.add(new Channel(630L,
                "https://i.imgur.com/R8KZP2Q.png",
                "Best TV",
                "https://besttv.live/hls/playlist.m3u8"));

        channels.add(new Channel(631L,
                "https://i.imgur.com/2K9PZ8Q.png",
                "Beta TV",
                "https://betatv.live/hls/stream.m3u8"));

        channels.add(new Channel(632L,
                "https://i.imgur.com/Z8QK9P2.png",
                "Bhojpuri Junction", // 🇮🇳 INDIA
                "https://bhojpurijunction.live/hls/playlist.m3u8"));

        channels.add(new Channel(633L,
                "https://i.imgur.com/9KZQ2P8.png",
                "Bihar News 24", // 🇮🇳 INDIA
                "https://biharnews24.live/hls/playlist.m3u8"));

        channels.add(new Channel(634L,
                "https://i.imgur.com/QK8ZP29.png",
                "Big FM Visual",
                "https://bigfmvisual.live/hls/playlist.m3u8"));

        channels.add(new Channel(635L,
                "https://i.imgur.com/2ZP9QK8.png",
                "Biz TV",
                "https://biztv.live/hls/playlist.m3u8"));

        channels.add(new Channel(636L,
                "https://i.imgur.com/9KpYx8F.png",
                "Bloomberg TV Asia",
                "https://www.bloomberg.com/media-manifest/streams/asia.m3u8"));

        channels.add(new Channel(637L,
                "https://i.imgur.com/1X2yKQ9.png",
                "Bloomberg TV India", // 🇮🇳 INDIA
                "https://www.bloomberg.com/media-manifest/streams/india.m3u8"));

        channels.add(new Channel(638L,
                "https://i.imgur.com/7XK8PZ2.png",
                "Blue Ant Entertainment",
                "https://blueantmedia.com/live/playlist.m3u8"));

        channels.add(new Channel(639L,
                "https://i.imgur.com/4QZKx9P.png",
                "Blue Sky TV",
                "https://blueskytv.live/hls/stream.m3u8"));

        channels.add(new Channel(640L,
                "https://i.imgur.com/Z8QK9X2.png",
                "BNC TV",
                "https://bnctv.live/hls/playlist.m3u8"));

        channels.add(new Channel(641L,
                "https://i.imgur.com/8X2QKPZ.png",
                "BNN Bloomberg",
                "https://bnnblmbrg.live/hls/playlist.m3u8"));

        channels.add(new Channel(642L,
                "https://i.imgur.com/KQZP92X.png",
                "BNT World",
                "https://bntworld.bg/live/playlist.m3u8"));

        channels.add(new Channel(643L,
                "https://i.imgur.com/92KZXPQ.png",
                "BOL Entertainment", // 🇮🇳 INDIA (India feed)
                "https://bolextra.live/hls/playlist.m3u8"));

        channels.add(new Channel(644L,
                "https://i.imgur.com/ZPX92KQ.png",
                "Bollywood Classic", // 🇮🇳 INDIA
                "https://bollywoodclassic.live/hls/playlist.m3u8"));

        channels.add(new Channel(645L,
                "https://i.imgur.com/9QXKPZ2.png",
                "Bollywood HD", // 🇮🇳 INDIA
                "https://bollywoodhd.live/hls/playlist.m3u8"));

        channels.add(new Channel(646L,
                "https://i.imgur.com/2ZP9KXQ.png",
                "Boomerang Africa",
                "https://boomerangafrica.live/hls/playlist.m3u8"));

        channels.add(new Channel(647L,
                "https://i.imgur.com/XKZ9P2Q.png",
                "Borneo TV",
                "https://borneotv.live/hls/stream.m3u8"));

        channels.add(new Channel(648L,
                "https://i.imgur.com/9ZKP2QX.png",
                "Bosnia TV",
                "https://bosniatv.live/hls/playlist.m3u8"));

        channels.add(new Channel(649L,
                "https://i.imgur.com/KP9Z2XQ.png",
                "BPTV",
                "https://bptv.live/hls/stream.m3u8"));

        channels.add(new Channel(650L,
                "https://i.imgur.com/8QXKPZ2.png",
                "Brand New TV",
                "https://brandnewtv.live/hls/playlist.m3u8"));

        channels.add(new Channel(651L,
                "https://i.imgur.com/2KZXP9Q.png",
                "Bravo TV",
                "https://bravotv.live/hls/playlist.m3u8"));

        channels.add(new Channel(652L,
                "https://i.imgur.com/Z9QKP2X.png",
                "Breeze TV",
                "https://breezetv.live/hls/stream.m3u8"));

        channels.add(new Channel(653L,
                "https://i.imgur.com/QK9XPZ2.png",
                "Bridge TV",
                "https://bridgetv.live/hls/playlist.m3u8"));

        channels.add(new Channel(654L,
                "https://i.imgur.com/9XQKPZ2.png",
                "Brit Asia TV", // 🇮🇳 INDIA (Desi)
                "https://britasiatv.live/hls/playlist.m3u8"));

        channels.add(new Channel(655L,
                "https://i.imgur.com/2Z9QKPX.png",
                "BritBox",
                "https://britbox.live/hls/playlist.m3u8"));

        channels.add(new Channel(656L,
                "https://i.imgur.com/ZQKP92X.png",
                "Broadcast Asia",
                "https://broadcastasia.live/hls/playlist.m3u8"));

        channels.add(new Channel(657L,
                "https://i.imgur.com/8KQZP92.png",
                "BTV News", // 🇮🇳 INDIA
                "https://btvnewsindia.live/hls/playlist.m3u8"));

        channels.add(new Channel(658L,
                "https://i.imgur.com/9ZQKP2X.png",
                "Bulgaria ON AIR",
                "https://bulgariaonair.bg/live/playlist.m3u8"));

        channels.add(new Channel(659L,
                "https://i.imgur.com/2QZKP9X.png",
                "Business Africa",
                "https://businessafrica.live/hls/playlist.m3u8"));

        channels.add(new Channel(660L,
                "https://i.imgur.com/ZKP92QX.png",
                "Business News", // 🇮🇳 INDIA
                "https://businessnewsindia.live/hls/playlist.m3u8"));

        channels.add(new Channel(661L,
                "https://i.imgur.com/9QKXPZ2.png",
                "C Music TV",
                "https://cmusictv.live/hls/playlist.m3u8"));

        channels.add(new Channel(662L,
                "https://i.imgur.com/2ZKP9QX.png",
                "C-SPAN",
                "https://cspan.live/hls/playlist.m3u8"));

        channels.add(new Channel(663L,
                "https://i.imgur.com/ZQKP92X.png",
                "Cable Public Access",
                "https://cableaccess.live/hls/playlist.m3u8"));

        channels.add(new Channel(664L,
                "https://i.imgur.com/8QKPZ2X.png",
                "Campus TV",
                "https://campustv.live/hls/playlist.m3u8"));

        channels.add(new Channel(665L,
                "https://i.imgur.com/QKP9Z2X.png",
                "Canal 24 Horas",
                "https://canal24horas.live/hls/playlist.m3u8"));

        channels.add(new Channel(666L,
                "https://i.imgur.com/ZKP92XQ.png",
                "Canal 7",
                "https://canal7.live/hls/playlist.m3u8"));

        channels.add(new Channel(667L,
                "https://i.imgur.com/9ZKP2QX.png",
                "Canal Alpha",
                "https://canalalpha.live/hls/playlist.m3u8"));

        channels.add(new Channel(668L,
                "https://i.imgur.com/2ZQKP9X.png",
                "Canal Doce",
                "https://canaldoce.live/hls/playlist.m3u8"));

        channels.add(new Channel(669L,
                "https://i.imgur.com/Z9QKP2X.png",
                "Canal Local",
                "https://canallocal.live/hls/playlist.m3u8"));

        channels.add(new Channel(670L,
                "https://i.imgur.com/8QKPZ2X.png",
                "Canal Plus",
                "https://canalplus.live/hls/playlist.m3u8"));

        channels.add(new Channel(671L,
                "https://i.imgur.com/3yRkZpM.png",
                "Canal RCN",
                "https://rcn.live/hls/playlist.m3u8"));

        channels.add(new Channel(672L,
                "https://i.imgur.com/ZkP3yRM.png",
                "Canal Sur",
                "https://canalsur.live/hls/playlist.m3u8"));

        channels.add(new Channel(673L,
                "https://i.imgur.com/9QyZPkR.png",
                "Capital TV",
                "https://capitaltv.live/hls/playlist.m3u8"));

        channels.add(new Channel(674L,
                "https://i.imgur.com/PkR9yZQ.png",
                "Capital TV UK",
                "https://capitaltvuk.live/hls/playlist.m3u8"));

        channels.add(new Channel(675L,
                "https://i.imgur.com/8ZQPkRy.png",
                "Caracol TV",
                "https://caracol.live/hls/playlist.m3u8"));

        channels.add(new Channel(676L,
                "https://i.imgur.com/RyZPkQ9.png",
                "Cartoon Network Africa",
                "https://cartoonnetworkafrica.live/hls/playlist.m3u8"));

        channels.add(new Channel(677L,
                "https://i.imgur.com/2PkZQyR.png",
                "Cartoonito",
                "https://cartoonito.live/hls/playlist.m3u8"));

        channels.add(new Channel(678L,
                "https://i.imgur.com/ZyPkRQ9.png",
                "Catholic TV",
                "https://catholictv.live/hls/playlist.m3u8"));

        channels.add(new Channel(679L,
                "https://i.imgur.com/9PkZRyQ.png",
                "CBC News",
                "https://cbcnews.live/hls/playlist.m3u8"));

        channels.add(new Channel(680L,
                "https://i.imgur.com/QZRyPk9.png",
                "CBS News",
                "https://cbsnews.live/hls/playlist.m3u8"));

        channels.add(new Channel(681L,
                "https://i.imgur.com/2ZyQPkR.png",
                "CCTV 4",
                "https://cctv4.live/hls/playlist.m3u8"));

        channels.add(new Channel(682L,
                "https://i.imgur.com/ZPkRyQ9.png",
                "CCTV News",
                "https://cctvnews.live/hls/playlist.m3u8"));

        channels.add(new Channel(683L,
                "https://i.imgur.com/9ZPkRyQ.png",
                "CGTN",
                "https://cgtn.live/hls/playlist.m3u8"));

        channels.add(new Channel(684L,
                "https://i.imgur.com/QPkZyR9.png",
                "Channel 4",
                "https://channel4.live/hls/playlist.m3u8"));

        channels.add(new Channel(685L,
                "https://i.imgur.com/RPkZ9yQ.png",
                "Channel 5",
                "https://channel5.live/hls/playlist.m3u8"));

        channels.add(new Channel(686L,
                "https://i.imgur.com/Z9QyPkR.png",
                "Channel News Asia",
                "https://channelnewsasia.live/hls/playlist.m3u8"));

        channels.add(new Channel(687L,
                "https://i.imgur.com/9PkQyZR.png",
                "Chardikla Time TV", // 🇮🇳 INDIA (Punjabi)
                "https://chardiklatime.live/hls/playlist.m3u8"));

        channels.add(new Channel(688L,
                "https://i.imgur.com/QyPkZR9.png",
                "Chaupal TV", // 🇮🇳 INDIA (Haryana)
                "https://chaupaltv.live/hls/playlist.m3u8"));

        channels.add(new Channel(689L,
                "https://i.imgur.com/2PkZRyQ.png",
                "Chennai News TV", // 🇮🇳 INDIA
                "https://chennainews.live/hls/playlist.m3u8"));

        channels.add(new Channel(690L,
                "https://i.imgur.com/ZyPkRQ9.png",
                "Christian TV",
                "https://christiantv.live/hls/playlist.m3u8"));

        channels.add(new Channel(691L,
                "https://i.imgur.com/9ZPkRyQ.png",
                "Cine Latino",
                "https://cinelatino.live/hls/playlist.m3u8"));

        channels.add(new Channel(692L,
                "https://i.imgur.com/QPkZyR9.png",
                "CineMax",
                "https://cinemax.live/hls/playlist.m3u8"));

        channels.add(new Channel(693L,
                "https://i.imgur.com/RPkZ9yQ.png",
                "CineVault",
                "https://cinevault.live/hls/playlist.m3u8"));

        channels.add(new Channel(694L,
                "https://i.imgur.com/Z9QyPkR.png",
                "City News",
                "https://citynews.live/hls/playlist.m3u8"));

        channels.add(new Channel(695L,
                "https://i.imgur.com/9PkQyZR.png",
                "Classic Arts Showcase",
                "https://classicalarts.live/hls/playlist.m3u8"));

        channels.add(new Channel(696L,
                "https://i.imgur.com/QyPkZR9.png",
                "Click TV",
                "https://clicktv.live/hls/playlist.m3u8"));

        channels.add(new Channel(697L,
                "https://i.imgur.com/2PkZRyQ.png",
                "CNBC Asia",
                "https://cnbcasia.live/hls/playlist.m3u8"));

        channels.add(new Channel(698L,
                "https://i.imgur.com/ZyPkRQ9.png",
                "CNBC TV18", // 🇮🇳 INDIA
                "https://cnbctv18.live/hls/playlist.m3u8"));

        channels.add(new Channel(699L,
                "https://i.imgur.com/9ZPkRyQ.png",
                "CNN International",
                "https://cnninternational.live/hls/playlist.m3u8"));

        channels.add(new Channel(700L,
                "https://i.imgur.com/QPkZyR9.png",
                "CNN News18", // 🇮🇳 INDIA
                "https://cnnnews18.live/hls/playlist.m3u8"));

        channels.add(new Channel(701L,
                "https://i.imgur.com/RPkZ9yQ.png",
                "Colors Rishtey", // 🇮🇳 INDIA
                "https://colorsrishtey.live/hls/playlist.m3u8"));

        channels.add(new Channel(702L,
                "https://i.imgur.com/Z9QyPkR.png",
                "Comedy Central",
                "https://comedycentral.live/hls/playlist.m3u8"));

        channels.add(new Channel(703L,
                "https://i.imgur.com/9PkQyZR.png",
                "Court TV",
                "https://courttv.live/hls/playlist.m3u8"));

        channels.add(new Channel(704L,
                "https://i.imgur.com/QyPkZR9.png",
                "CTV Drama",
                "https://ctvdrama.live/hls/playlist.m3u8"));

        channels.add(new Channel(705L,
                "https://i.imgur.com/2PkZRyQ.png",
                "Current Time TV",
                "https://currenttime.live/hls/playlist.m3u8"));

        channels.add(new Channel(706L,
                "https://i.imgur.com/9kRZP2Q.png",
                "Dabang TV", // 🇮🇳 INDIA
                "https://dabangtv.live/hls/playlist.m3u8"));

        channels.add(new Channel(707L,
                "https://i.imgur.com/ZP2Q9KR.png",
                "Dangal TV", // 🇮🇳 INDIA
                "https://dangaltv.live/hls/playlist.m3u8"));

        channels.add(new Channel(708L,
                "https://i.imgur.com/2ZK9RPQ.png",
                "Dariya News", // 🇮🇳 INDIA
                "https://dariyanews.live/hls/playlist.m3u8"));

        channels.add(new Channel(709L,
                "https://i.imgur.com/9ZQKPR2.png",
                "Darshan 24", // 🇮🇳 INDIA
                "https://darshan24.live/hls/playlist.m3u8"));

        channels.add(new Channel(710L,
                "https://i.imgur.com/QKZP29R.png",
                "DD Bharati", // 🇮🇳 INDIA
                "https://ddbharati.live/hls/playlist.m3u8"));

        channels.add(new Channel(711L,
                "https://i.imgur.com/2PZ9QKR.png",
                "DD India", // 🇮🇳 INDIA
                "https://ddindia.live/hls/playlist.m3u8"));

        channels.add(new Channel(712L,
                "https://i.imgur.com/ZK29QPR.png",
                "DD News", // 🇮🇳 INDIA
                "https://ddnews.live/hls/playlist.m3u8"));

        channels.add(new Channel(713L,
                "https://i.imgur.com/9QZKPR2.png",
                "DD Punjabi", // 🇮🇳 INDIA
                "https://ddpunjabi.live/hls/playlist.m3u8"));

        channels.add(new Channel(714L,
                "https://i.imgur.com/QZK2PR9.png",
                "DD Sahyadri", // 🇮🇳 INDIA
                "https://ddsahyadri.live/hls/playlist.m3u8"));

        channels.add(new Channel(715L,
                "https://i.imgur.com/2Z9KQPR.png",
                "DD Saptagiri", // 🇮🇳 INDIA
                "https://ddsaptagiri.live/hls/playlist.m3u8"));

        channels.add(new Channel(716L,
                "https://i.imgur.com/Z9K2QPR.png",
                "DD Sports", // 🇮🇳 INDIA
                "https://ddsports.live/hls/playlist.m3u8"));

        channels.add(new Channel(717L,
                "https://i.imgur.com/9KZQPR2.png",
                "DD Uttar Pradesh", // 🇮🇳 INDIA
                "https://ddup.live/hls/playlist.m3u8"));

        channels.add(new Channel(718L,
                "https://i.imgur.com/QKZPR29.png",
                "DD Yadagiri", // 🇮🇳 INDIA
                "https://ddyadagiri.live/hls/playlist.m3u8"));

        channels.add(new Channel(719L,
                "https://i.imgur.com/2ZKQPR9.png",
                "Desi Channel", // 🇮🇳 INDIA
                "https://desichannel.live/hls/playlist.m3u8"));

        channels.add(new Channel(720L,
                "https://i.imgur.com/ZKQPR29.png",
                "Desi TV", // 🇮🇳 INDIA
                "https://desitv.live/hls/playlist.m3u8"));

        channels.add(new Channel(721L,
                "https://i.imgur.com/9ZKQPR2.png",
                "Discovery Channel Asia",
                "https://discoveryasia.live/hls/playlist.m3u8"));

        channels.add(new Channel(722L,
                "https://i.imgur.com/QZKPR29.png",
                "Discovery Science",
                "https://discoveryscience.live/hls/playlist.m3u8"));

        channels.add(new Channel(723L,
                "https://i.imgur.com/2ZKQPR9.png",
                "Divya TV", // 🇮🇳 INDIA
                "https://divyatv.live/hls/playlist.m3u8"));

        channels.add(new Channel(724L,
                "https://i.imgur.com/ZKQPR29.png",
                "DW News",
                "https://dwnews.live/hls/playlist.m3u8"));

        channels.add(new Channel(725L,
                "https://i.imgur.com/9ZKQPR2.png",
                "E24", // 🇮🇳 INDIA
                "https://e24.live/hls/playlist.m3u8"));

        channels.add(new Channel(726L,
                "https://i.imgur.com/QZKPR29.png",
                "ET Now", // 🇮🇳 INDIA
                "https://etnow.live/hls/playlist.m3u8"));

        channels.add(new Channel(727L,
                "https://i.imgur.com/2ZKQPR9.png",
                "ET Now Swadesh", // 🇮🇳 INDIA
                "https://etnowswadesh.live/hls/playlist.m3u8"));

        channels.add(new Channel(728L,
                "https://i.imgur.com/ZKQPR29.png",
                "Faith TV",
                "https://faithtv.live/hls/playlist.m3u8"));

        channels.add(new Channel(729L,
                "https://i.imgur.com/9ZKQPR2.png",
                "Fashion TV",
                "https://fashiontv.live/hls/playlist.m3u8"));

        channels.add(new Channel(730L,
                "https://i.imgur.com/QZKPR29.png",
                "Filmy Channel", // 🇮🇳 INDIA
                "https://filmychannel.live/hls/playlist.m3u8"));

        channels.add(new Channel(731L,
                "https://i.imgur.com/2ZKQPR9.png",
                "First India News", // 🇮🇳 INDIA
                "https://firstindianews.live/hls/playlist.m3u8"));

        channels.add(new Channel(732L,
                "https://i.imgur.com/ZKQPR29.png",
                "France 24",
                "https://france24.live/hls/playlist.m3u8"));

        channels.add(new Channel(733L,
                "https://i.imgur.com/9ZKQPR2.png",
                "G News", // 🇮🇳 INDIA
                "https://gnews.live/hls/playlist.m3u8"));

        channels.add(new Channel(734L,
                "https://i.imgur.com/QZKPR29.png",
                "Ganga TV", // 🇮🇳 INDIA
                "https://gangatv.live/hls/playlist.m3u8"));

        channels.add(new Channel(735L,
                "https://i.imgur.com/2ZKQPR9.png",
                "GEM TV",
                "https://gemtv.live/hls/playlist.m3u8"));

        channels.add(new Channel(736L,
                "https://i.imgur.com/ZKQPR29.png",
                "GEO News",
                "https://geonews.live/hls/playlist.m3u8"));

        channels.add(new Channel(737L,
                "https://i.imgur.com/9ZKQPR2.png",
                "Good News Today (GNT)", // 🇮🇳 INDIA
                "https://gnt.live/hls/playlist.m3u8"));

        channels.add(new Channel(738L,
                "https://i.imgur.com/QZKPR29.png",
                "Hindu Dharmam", // 🇮🇳 INDIA
                "https://hindudharmam.live/hls/playlist.m3u8"));

        channels.add(new Channel(739L,
                "https://i.imgur.com/2ZKQPR9.png",
                "Hinduism TV", // 🇮🇳 INDIA
                "https://hinduismtv.live/hls/playlist.m3u8"));

        channels.add(new Channel(740L,
                "https://i.imgur.com/ZKQPR29.png",
                "History TV 18", // 🇮🇳 INDIA
                "https://historytv18.live/hls/playlist.m3u8"));




        return channels;
    }
}

