            package okhttp3.internal.platform.android;

            import java.lang.reflect.Method;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m6176d2 = {"Lokhttp3/internal/platform/android/CloseGuard;", HttpUrl.FRAGMENT_ENCODE_SET, "getMethod", "Ljava/lang/reflect/Method;", "openMethod", "warnIfOpenMethod", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "createAndOpen", "closer", HttpUrl.FRAGMENT_ENCODE_SET, "warnIfOpen", HttpUrl.FRAGMENT_ENCODE_SET, "closeGuardInstance", "Companion", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 2 */     public final class CloseGuard {

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                private final Method getMethod;
                private final Method openMethod;
                private final Method warnIfOpenMethod;

                public CloseGuard(Method method, Method method2, Method method3) {
/* 4 */             this.getMethod = method;
/* 6 */             this.openMethod = method2;
/* 8 */             this.warnIfOpenMethod = method3;
                }

                public final Object createAndOpen(String closer) {
/* 1 */             closer.getClass();
/* 4 */             Method method = this.getMethod;
/* 7 */             if (method != null) {
                        try {
/* 9 */                     Object objInvoke = method.invoke(null, null);
/* 13 */                    Method method2 = this.openMethod;
/* 15 */                    method2.getClass();
/* 22 */                    method2.invoke(objInvoke, closer);
/* 25 */                    return objInvoke;
                        } catch (Exception unused) {
                        }
                    }
/* 6 */             return null;
                }

                public final boolean warnIfOpen(Object closeGuardInstance) {
/* 1 */             if (closeGuardInstance == null) {
/* 14 */                return false;
                    }
                    try {
/* 3 */                 Method method = this.warnIfOpenMethod;
/* 5 */                 method.getClass();
/* 9 */                 method.invoke(closeGuardInstance, null);
/* 12 */                return true;
                    } catch (Exception unused) {
/* 14 */                return false;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m6176d2 = {"Lokhttp3/internal/platform/android/CloseGuard$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "get", "Lokhttp3/internal/platform/android/CloseGuard;", "okhttp"}, m6177k = 1, m6178mv = {1, 6, 0}, m6180xi = 48)
/* 3 */         public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    public final CloseGuard get() throws NoSuchMethodException {
                        Method method;
                        Method method2;
/* 1 */                 Method method3 = null;
                        try {
/* 4 */                     Class<?> cls = Class.forName("dalvik.system.CloseGuard");
/* 10 */                    Method method4 = cls.getMethod("get", null);
/* 22 */                    method2 = cls.getMethod("open", String.class);
/* 28 */                    method = cls.getMethod("warnIfOpen", null);
/* 33 */                    method3 = method4;
                        } catch (Exception unused) {
/* 35 */                    method = null;
/* 36 */                    method2 = null;
                        }
/* 39 */                return new CloseGuard(method3, method2, method);
                    }

/* 4 */             private Companion() {
                    }
                }
            }
