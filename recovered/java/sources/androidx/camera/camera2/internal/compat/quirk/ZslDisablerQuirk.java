            package androidx.camera.camera2.internal.compat.quirk;

            import android.os.Build;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Locale;
            import p000.h02;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ZslDisablerQuirk implements h02 {

                /* JADX INFO: renamed from: a */
                public static final List f806a = Arrays.asList("SM-F936", "SM-S901U", "SM-S908U", "SM-S908U1");

                /* JADX INFO: renamed from: b */
                public static final List f807b = Arrays.asList("MI 8");

                /* JADX INFO: renamed from: b */
                public static boolean m444b(List list) {
/* 1 */             Iterator it = list.iterator();
/* 9 */             while (it.hasNext()) {
/* 29 */                if (Build.MODEL.toUpperCase(Locale.US).startsWith((String) it.next())) {
/* 31 */                    return true;
                        }
                    }
/* 33 */            return false;
                }
            }
