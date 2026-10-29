            package p000;

            import java.lang.reflect.Field;
            import java.security.PrivilegedExceptionAction;
            import sun.misc.Unsafe;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class pq3 implements PrivilegedExceptionAction {
                @Override // java.security.PrivilegedExceptionAction
                public final /* bridge */ /* synthetic */ Object run() throws IllegalAccessException {
/* 10 */            for (Field field : Unsafe.class.getDeclaredFields()) {
/* 15 */                field.setAccessible(true);
/* 18 */                Object obj = field.get(null);
/* 26 */                if (Unsafe.class.isInstance(obj)) {
/* 32 */                    return (Unsafe) Unsafe.class.cast(obj);
                        }
                    }
/* 9 */             return null;
                }
            }
