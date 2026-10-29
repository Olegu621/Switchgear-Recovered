            package p000;

            import java.util.Map;
            
            /* JADX INFO: renamed from: cz */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0825cz {

                /* JADX INFO: renamed from: c */
                public static final /* synthetic */ u21[] f6937c = {new sy1(C0825cz.class, "documentId", "getDocumentId()Ljava/lang/String;", 0), fm0.m3778d(j22.f12033a, C0825cz.class, "documentVersion", "getDocumentVersion()Ljava/lang/String;", 0), new sy1(C0825cz.class, "documentName", "getDocumentName()Ljava/lang/String;", 0), new sy1(C0825cz.class, "documentDescription", "getDocumentDescription()Ljava/lang/String;", 0)};

                /* JADX INFO: renamed from: a */
                public final Map f6938a;

                /* JADX INFO: renamed from: b */
                public final Map f6939b;

                public C0825cz(Map map) {
/* 1 */             map.getClass();
/* 7 */             this.f6938a = map;
/* 19 */            this.f6939b = mc1.m6639b(map, new C0197bz(0));
                }

                /* JADX INFO: renamed from: a */
                public final C0161az m2898a() {
/* 4 */             u21[] u21VarArr = f6937c;
/* 8 */             String name = u21VarArr[0].getName();
/* 12 */            Map map = this.f6938a;
/* 33 */            C0161az c0161az = new C0161az((String) mc1.m6638a(map, name), (String) mc1.m6638a(map, u21VarArr[1].getName()));
/* 39 */            String name2 = u21VarArr[2].getName();
/* 43 */            Map map2 = this.f6939b;
/* 49 */            String str = (String) mc1.m6638a(map2, name2);
/* 51 */            if (str != null) {
/* 53 */                c0161az.f2141d = str;
                    }
/* 66 */            String str2 = (String) mc1.m6638a(map2, u21VarArr[3].getName());
/* 68 */            if (str2 != null) {
/* 70 */                c0161az.f2142e = str2;
                    }
/* 72 */            return c0161az;
                }
            }
