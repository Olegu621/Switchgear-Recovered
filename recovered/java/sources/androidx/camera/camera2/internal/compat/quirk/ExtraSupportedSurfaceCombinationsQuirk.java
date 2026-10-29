            package androidx.camera.camera2.internal.compat.quirk;

            import android.os.Build;
            import java.util.Arrays;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.Locale;
            import p000.C2143rg;
            import p000.dj2;
            import p000.ej2;
            import p000.fm0;
            import p000.h02;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ExtraSupportedSurfaceCombinationsQuirk implements h02 {

                /* JADX INFO: renamed from: a */
                public static final dj2 f783a;

                /* JADX INFO: renamed from: b */
                public static final dj2 f784b;

                /* JADX INFO: renamed from: c */
                public static final HashSet f785c;

                /* JADX INFO: renamed from: d */
                public static final HashSet f786d;

                static {
/* 3 */             dj2 dj2Var = new dj2();
/* 7 */             ej2 ej2Var = ej2.VGA;
/* 11 */            fm0.m3795u(2, ej2Var, 0L, dj2Var);
/* 15 */            ej2 ej2Var2 = ej2.PREVIEW;
/* 17 */            fm0.m3795u(1, ej2Var2, 0L, dj2Var);
/* 20 */            ej2 ej2Var3 = ej2.MAXIMUM;
/* 22 */            fm0.m3795u(2, ej2Var3, 0L, dj2Var);
/* 25 */            f783a = dj2Var;
/* 29 */            dj2 dj2Var2 = new dj2();
/* 37 */            dj2Var2.m3140a(new C2143rg(1, ej2Var2, 0L));
/* 45 */            dj2Var2.m3140a(new C2143rg(1, ej2Var, 0L));
/* 48 */            fm0.m3795u(2, ej2Var3, 0L, dj2Var2);
/* 51 */            f784b = dj2Var2;
/* 78 */            f785c = new HashSet(Arrays.asList("PIXEL 6", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO"));
/* 107 */           f786d = new HashSet(Arrays.asList("SM-S921", "SC-51E", "SCG25", "SM-S926", "SM-S928", "SC-52E", "SCG26"));
                }

                /* JADX INFO: renamed from: b */
                public static boolean m443b() {
/* 9 */             if (!"samsung".equalsIgnoreCase(Build.BRAND)) {
/* 46 */                return false;
                    }
/* 16 */            String upperCase = Build.MODEL.toUpperCase(Locale.US);
/* 22 */            Iterator it = f786d.iterator();
/* 30 */            while (it.hasNext()) {
/* 42 */                if (upperCase.startsWith((String) it.next())) {
/* 44 */                    return true;
                        }
                    }
/* 46 */            return false;
                }
            }
