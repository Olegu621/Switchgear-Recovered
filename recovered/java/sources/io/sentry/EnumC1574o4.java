            package io.sentry;

            import java.math.BigInteger;
            import java.util.Collection;
            import java.util.Locale;
            import java.util.concurrent.atomic.AtomicInteger;
            import java.util.concurrent.atomic.AtomicLong;
            
            /* JADX INFO: renamed from: io.sentry.o4 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public enum EnumC1574o4 {
                STRING,
                BOOLEAN,
                INTEGER,
                DOUBLE,
                ARRAY;

                public static EnumC1574o4 inferFrom(Object obj) {
/* 3 */             if (obj instanceof Boolean) {
/* 5 */                 return BOOLEAN;
                    }
/* 10 */            if ((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof Byte) || (obj instanceof BigInteger) || (obj instanceof AtomicInteger) || (obj instanceof AtomicLong)) {
/* 67 */                return INTEGER;
                    }
/* 39 */            if (obj instanceof Number) {
/* 41 */                return DOUBLE;
                    }
                    return ((obj instanceof Collection) || (obj != null && obj.getClass().isArray())) ? ARRAY : STRING;
                }

                public String apiName() {
/* 7 */             return name().toLowerCase(Locale.ROOT);
                }
            }
