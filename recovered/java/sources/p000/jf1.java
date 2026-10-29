            package p000;

            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class jf1 {

                /* JADX INFO: renamed from: c */
                public static final /* synthetic */ u21[] f12248c = {new sy1(jf1.class, "currentTime", "getCurrentTime()Ljava/lang/Double;", 0), fm0.m3778d(j22.f12033a, jf1.class, "duration", "getDuration()Ljava/lang/Double;", 0), new sy1(jf1.class, "ended", "getEnded()Ljava/lang/Boolean;", 0), new sy1(jf1.class, "fullscreen", "getFullscreen()Ljava/lang/Boolean;", 0), new sy1(jf1.class, "livestream", "getLivestream()Ljava/lang/Boolean;", 0), new sy1(jf1.class, "label", "getLabel()Ljava/lang/String;", 0), new sy1(jf1.class, "loop", "getLoop()Ljava/lang/Boolean;", 0), new sy1(jf1.class, "mediaType", "getMediaType()Ljava/lang/String;", 0), new sy1(jf1.class, "muted", "getMuted()Ljava/lang/Boolean;", 0), new sy1(jf1.class, "paused", "getPaused()Ljava/lang/Boolean;", 0), new sy1(jf1.class, "pictureInPicture", "getPictureInPicture()Ljava/lang/Boolean;", 0), new sy1(jf1.class, "playerType", "getPlayerType()Ljava/lang/String;", 0), new sy1(jf1.class, "playbackRate", "getPlaybackRate()Ljava/lang/Double;", 0), new sy1(jf1.class, "quality", "getQuality()Ljava/lang/String;", 0), new sy1(jf1.class, "volume", "getVolume()Ljava/lang/Integer;", 0)};

                /* JADX INFO: renamed from: a */
                public final Map f12249a;

                /* JADX INFO: renamed from: b */
                public final hk2 f12250b = r51.m8065b(new C1997od(this, 5));

                public jf1(Map map) {
/* 15 */            this.f12249a = mc1.m6639b(map, new C0197bz(11));
                }

                /* JADX INFO: renamed from: a */
                public final if1 m5800a() {
/* 6 */             u21[] u21VarArr = f12248c;
/* 10 */            String name = u21VarArr[0].getName();
/* 14 */            Map map = this.f12249a;
/* 226 */           return new if1((Double) mc1.m6638a(map, name), (Double) mc1.m6638a(map, u21VarArr[1].getName()), (Boolean) mc1.m6638a(map, u21VarArr[2].getName()), (Boolean) mc1.m6638a(map, u21VarArr[3].getName()), (Boolean) mc1.m6638a(map, u21VarArr[4].getName()), (String) mc1.m6638a(map, u21VarArr[5].getName()), (Boolean) mc1.m6638a(map, u21VarArr[6].getName()), (wf1) this.f12250b.getValue(), (Boolean) mc1.m6638a(map, u21VarArr[8].getName()), (Boolean) mc1.m6638a(map, u21VarArr[9].getName()), (Boolean) mc1.m6638a(map, u21VarArr[10].getName()), (String) mc1.m6638a(map, u21VarArr[11].getName()), (Double) mc1.m6638a(map, u21VarArr[12].getName()), (String) mc1.m6638a(map, u21VarArr[13].getName()), (Integer) mc1.m6638a(map, u21VarArr[14].getName()));
                }
            }
