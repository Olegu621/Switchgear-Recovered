            package p000;

            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ae1 {

                /* JADX INFO: renamed from: c */
                public static final /* synthetic */ u21[] f200c = {new sy1(ae1.class, "name", "getName()Ljava/lang/String;", 0), fm0.m3778d(j22.f12033a, ae1.class, "adId", "getAdId()Ljava/lang/String;", 0), new sy1(ae1.class, "creativeId", "getCreativeId()Ljava/lang/String;", 0), new sy1(ae1.class, "podPosition", "getPodPosition()Ljava/lang/Integer;", 0), new sy1(ae1.class, "duration", "getDuration()Ljava/lang/Double;", 0), new sy1(ae1.class, "skippable", "getSkippable()Ljava/lang/Boolean;", 0)};

                /* JADX INFO: renamed from: a */
                public final Map f201a;

                /* JADX INFO: renamed from: b */
                public final Map f202b;

                public ae1(Map map) {
/* 14 */            this.f201a = mc1.m6639b(map, new C0197bz(7));
/* 16 */            this.f202b = map;
                }

                /* JADX INFO: renamed from: a */
                public final zd1 m210a() {
/* 4 */             u21[] u21VarArr = f200c;
/* 18 */            String str = (String) mc1.m6638a(this.f202b, u21VarArr[1].getName());
/* 23 */            String name = u21VarArr[0].getName();
/* 27 */            Map map = this.f201a;
/* 33 */            String str2 = (String) mc1.m6638a(map, name);
/* 46 */            String str3 = (String) mc1.m6638a(map, u21VarArr[2].getName());
/* 59 */            Integer num = (Integer) mc1.m6638a(map, u21VarArr[3].getName());
/* 72 */            Double d = (Double) mc1.m6638a(map, u21VarArr[4].getName());
/* 85 */            Boolean bool = (Boolean) mc1.m6638a(map, u21VarArr[5].getName());
/* 87 */            str.getClass();
/* 90 */            zd1 zd1Var = new zd1();
/* 93 */            zd1Var.f20100a = str;
/* 95 */            zd1Var.f20101b = str2;
/* 97 */            zd1Var.f20102c = str3;
/* 99 */            zd1Var.f20103d = num;
/* 101 */           zd1Var.f20104e = d;
/* 103 */           zd1Var.f20105f = bool;
/* 105 */           return zd1Var;
                }
            }
