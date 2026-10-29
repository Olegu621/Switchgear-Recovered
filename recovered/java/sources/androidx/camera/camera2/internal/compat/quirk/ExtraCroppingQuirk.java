            package androidx.camera.camera2.internal.compat.quirk;

            import android.os.Build;
            import android.util.Range;
            import android.util.Size;
            import io.flutter.plugin.platform.PlatformPlugin;
            import java.util.HashMap;
            import java.util.Locale;
            import p000.AbstractC0886en;
            import p000.h02;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ExtraCroppingQuirk implements h02 {

                /* JADX INFO: renamed from: a */
                public static final HashMap f782a;

                static {
/* 3 */             HashMap map = new HashMap();
/* 6 */             f782a = map;
/* 11 */            map.put("SM-T580", null);
/* 33 */            map.put("SM-J710MN", new Range(21, 26));
/* 38 */            map.put("SM-A320FL", null);
/* 43 */            map.put("SM-G570M", null);
/* 48 */            map.put("SM-G610F", null);
/* 58 */            map.put("SM-G610M", new Range(21, 26));
                }

                /* JADX INFO: renamed from: b */
                public static Size m441b(int i) {
/* 5 */             if (!m442c()) {
/* 50 */                return null;
                    }
/* 7 */             int iM3520y = AbstractC0886en.m3520y(i);
/* 11 */            if (iM3520y == 0) {
/* 46 */                return new Size(1920, 1080);
                    }
/* 14 */            if (iM3520y == 1) {
/* 36 */                return new Size(PlatformPlugin.DEFAULT_SYSTEM_UI, 720);
                    }
/* 17 */            if (iM3520y != 2) {
/* 50 */                return null;
                    }
/* 26 */            return new Size(3264, 1836);
                }

                /* JADX INFO: renamed from: c */
                public static boolean m442c() {
/* 9 */             if (!"samsung".equalsIgnoreCase(Build.BRAND)) {
/* 52 */                return false;
                    }
/* 11 */            String str = Build.MODEL;
/* 13 */            Locale locale = Locale.US;
/* 15 */            String upperCase = str.toUpperCase(locale);
/* 19 */            HashMap map = f782a;
/* 25 */            if (!map.containsKey(upperCase)) {
/* 52 */                return false;
                    }
/* 35 */            Range range = (Range) map.get(str.toUpperCase(locale));
/* 37 */            if (range == null) {
/* 39 */                return true;
                    }
/* 47 */            return range.contains(Integer.valueOf(Build.VERSION.SDK_INT));
                }
            }
