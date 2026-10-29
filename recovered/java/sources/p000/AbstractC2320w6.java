            package p000;

            import java.util.Collections;
            import java.util.EnumMap;
            import java.util.HashMap;
            import java.util.Map;
            
            /* JADX INFO: renamed from: w6 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC2320w6 {

                /* JADX INFO: renamed from: a */
                public static final jr1 f18449a;

                /* JADX INFO: renamed from: b */
                public static final ir1 f18450b;

                /* JADX INFO: renamed from: c */
                public static final t31 f18451c;

                /* JADX INFO: renamed from: d */
                public static final p31 f18452d;

                /* JADX INFO: renamed from: e */
                public static final Map f18453e;

                static {
/* 3 */             C2335wl c2335wlM7290b = p13.m7290b("type.googleapis.com/google.crypto.tink.AesSivKey");
/* 14 */            f18449a = new jr1(C2282v6.class);
/* 21 */            f18450b = new ir1(c2335wlM7290b);
/* 30 */            f18451c = new t31(C2133r6.class);
/* 43 */            f18452d = new p31(c2335wlM7290b, new C1951n4(6));
/* 47 */            HashMap map = new HashMap();
/* 50 */            C2244u6 c2244u6 = C2244u6.f17369d;
/* 52 */            wq1 wq1Var = wq1.RAW;
/* 54 */            map.put(c2244u6, wq1Var);
/* 57 */            C2244u6 c2244u7 = C2244u6.f17367b;
/* 59 */            wq1 wq1Var2 = wq1.TINK;
/* 61 */            map.put(c2244u7, wq1Var2);
/* 64 */            C2244u6 c2244u8 = C2244u6.f17368c;
/* 66 */            wq1 wq1Var3 = wq1.CRUNCHY;
/* 68 */            map.put(c2244u8, wq1Var3);
/* 71 */            Collections.unmodifiableMap(map);
/* 78 */            EnumMap enumMap = new EnumMap(wq1.class);
/* 81 */            enumMap.put(wq1Var, c2244u6);
/* 84 */            enumMap.put(wq1Var2, c2244u7);
/* 87 */            enumMap.put(wq1Var3, c2244u8);
/* 92 */            enumMap.put(wq1.LEGACY, c2244u8);
/* 99 */            f18453e = Collections.unmodifiableMap(enumMap);
                }
            }
