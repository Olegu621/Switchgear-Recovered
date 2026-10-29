            package p000;

            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ud1 {

                /* JADX INFO: renamed from: d */
                public static final /* synthetic */ u21[] f17471d = {new sy1(ud1.class, "name", "getName()Ljava/lang/String;", 0), fm0.m3778d(j22.f12033a, ud1.class, "breakId", "getBreakId()Ljava/lang/String;", 0), new sy1(ud1.class, "breakType", "getBreakType()Ljava/lang/String;", 0), new sy1(ud1.class, "podSize", "getPodSize()Ljava/lang/Integer;", 0)};

                /* JADX INFO: renamed from: a */
                public final Map f17472a;

                /* JADX INFO: renamed from: b */
                public final Map f17473b;

                /* JADX INFO: renamed from: c */
                public final hk2 f17474c = r51.m8065b(new C1997od(this, 4));

                public ud1(Map map) {
/* 14 */            this.f17472a = mc1.m6639b(map, new C0197bz(6));
/* 16 */            this.f17473b = map;
                }

                /* JADX INFO: renamed from: a */
                public final td1 m9004a() {
/* 4 */             u21[] u21VarArr = f17471d;
/* 18 */            String str = (String) mc1.m6638a(this.f17473b, u21VarArr[1].getName());
/* 23 */            String name = u21VarArr[0].getName();
/* 27 */            Map map = this.f17472a;
/* 33 */            String str2 = (String) mc1.m6638a(map, name);
/* 41 */            wd1 wd1Var = (wd1) this.f17474c.getValue();
/* 54 */            Integer num = (Integer) mc1.m6638a(map, u21VarArr[3].getName());
/* 56 */            str.getClass();
/* 59 */            td1 td1Var = new td1();
/* 62 */            td1Var.f17046a = str;
/* 64 */            td1Var.f17047b = str2;
/* 66 */            td1Var.f17048c = wd1Var;
/* 68 */            td1Var.f17049d = num;
/* 70 */            return td1Var;
                }
            }
