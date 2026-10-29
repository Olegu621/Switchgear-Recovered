            package com.google.android.gms.internal.drive;

            import java.lang.reflect.Field;
            import java.security.PrivilegedExceptionAction;
            import sun.misc.Unsafe;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzne implements PrivilegedExceptionAction<Unsafe> {
                @Override // java.security.PrivilegedExceptionAction
                public final /* synthetic */ Unsafe run() throws Exception {
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
