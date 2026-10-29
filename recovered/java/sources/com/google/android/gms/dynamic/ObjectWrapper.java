            package com.google.android.gms.dynamic;

            import android.os.IBinder;
            import java.lang.reflect.Field;
            import p000.C1951n4;
            import p000.fm0;
            import p000.kb1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ObjectWrapper<T> extends IObjectWrapper.Stub {

                /* JADX INFO: renamed from: a */
                public final Object f3740a;

                public ObjectWrapper(Object obj) {
/* 3 */             super("com.google.android.gms.dynamic.IObjectWrapper");
/* 6 */             this.f3740a = obj;
                }

                /* JADX INFO: renamed from: b */
                public static Object m2045b(IObjectWrapper iObjectWrapper) {
/* 3 */             if (iObjectWrapper instanceof ObjectWrapper) {
/* 7 */                 return ((ObjectWrapper) iObjectWrapper).f3740a;
                    }
/* 10 */            IBinder iBinderAsBinder = iObjectWrapper.asBinder();
/* 18 */            Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
/* 25 */            Field field = null;
/* 26 */            int i = 0;
/* 27 */            for (Field field2 : declaredFields) {
/* 35 */                if (!field2.isSynthetic()) {
/* 37 */                    i++;
/* 39 */                    field = field2;
                        }
                    }
/* 44 */            if (i != 1) {
/* 87 */                int length = declaredFields.length;
/* 109 */               C1951n4.m6859j(fm0.m3788n(new StringBuilder(String.valueOf(length).length() + 53), "Unexpected number of IObjectWrapper declared fields: ", length));
/* 23 */                return null;
                    }
/* 46 */            kb1.m6061n(field);
/* 53 */            if (field.isAccessible()) {
/* 83 */                C1951n4.m6859j("IObjectWrapper declared field not private!");
/* 23 */                return null;
                    }
/* 55 */            field.setAccessible(true);
                    try {
/* 58 */                return field.get(iBinderAsBinder);
                    } catch (IllegalAccessException e) {
/* 71 */                throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
                    } catch (NullPointerException e2) {
/* 80 */                throw new IllegalArgumentException("Binder object is null.", e2);
                    }
                }
            }
