            package androidx.webkit;

            import java.lang.reflect.Field;
            import java.util.HashMap;
            import java.util.concurrent.atomic.AtomicReference;
            import org.chromium.support_lib_boundary.ProcessGlobalConfigConstants;
            import p000.AbstractC2210t9;
            import p000.b73;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ProcessGlobalConfig {

                /* JADX INFO: renamed from: a */
                public String f2033a;

                /* JADX INFO: renamed from: b */
                public String f2034b;

                /* JADX INFO: renamed from: c */
                public String f2035c;
                private static final AtomicReference<HashMap<String, Object>> sProcessGlobalConfig = new AtomicReference<>();

                /* JADX INFO: renamed from: d */
                public static final Object f2031d = new Object();

                /* JADX INFO: renamed from: e */
                public static boolean f2032e = false;

                /* JADX INFO: renamed from: a */
                public static void m1145a(ProcessGlobalConfig processGlobalConfig) {
                    synchronized (f2031d) {
/* 6 */                 if (f2032e) {
/* 118 */                   throw new IllegalStateException("ProcessGlobalConfig#apply was called more than once, which is an illegal operation. The configuration settings provided by ProcessGlobalConfig take effect only once, when WebView is first loaded into the current process. Every process should only ever create a single instance of ProcessGlobalConfig and apply it once, before any calls to android.webkit APIs, such as during early app startup.");
                        }
/* 9 */                 f2032e = true;
                    }
/* 14 */            HashMap map = new HashMap();
                    try {
/* 26 */                Field declaredField = Class.forName("android.webkit.WebViewFactory").getDeclaredField("sProviderInstance");
/* 30 */                declaredField.setAccessible(true);
/* 37 */                if (declaredField.get(null) != null) {
/* 42 */                    f42.m3656l("WebView has already been loaded in the current process, so any attempt to apply the settings in ProcessGlobalConfig will have no effect. ProcessGlobalConfig#apply needs to be called before any calls to android.webkit APIs, such as during early app startup.");
/* 45 */                    return;
                        }
                    } catch (Exception unused) {
                    }
/* 48 */            if (processGlobalConfig.f2033a != null) {
/* 52 */                boolean zM6648b = b73.f2285A.m6648b();
/* 56 */                String str = processGlobalConfig.f2033a;
/* 58 */                if (zM6648b) {
/* 60 */                    AbstractC2210t9.m8735e(str);
                        } else {
/* 66 */                    map.put(ProcessGlobalConfigConstants.DATA_DIRECTORY_SUFFIX, str);
                        }
                    }
/* 69 */            String str2 = processGlobalConfig.f2034b;
/* 71 */            if (str2 != null) {
/* 75 */                map.put(ProcessGlobalConfigConstants.DATA_DIRECTORY_BASE_PATH, str2);
                    }
/* 78 */            String str3 = processGlobalConfig.f2035c;
/* 80 */            if (str3 != null) {
/* 84 */                map.put(ProcessGlobalConfigConstants.CACHE_DIRECTORY_BASE_PATH, str3);
                    }
/* 87 */            AtomicReference<HashMap<String, Object>> atomicReference = sProcessGlobalConfig;
/* 93 */            while (!atomicReference.compareAndSet(null, (HashMap<String, Object>) map)) {
/* 100 */               if (atomicReference.get() != null) {
/* 105 */                   f42.m3663s("Attempting to set ProcessGlobalConfig#sProcessGlobalConfig when it was already set");
/* 108 */                   return;
                        }
                    }
                }
            }
