            package io.sentry;

            import io.sentry.internal.debugmeta.C1505c;
            import java.io.IOException;
            import java.util.Locale;
            
            /* JADX INFO: renamed from: io.sentry.f7 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 7 */     public enum EnumC1451f7 implements InterfaceC1458g2 {
                OK(0, 399),
                CANCELLED(499),
                INTERNAL_ERROR(500),
                UNKNOWN(500),
                UNKNOWN_ERROR(500),
                INVALID_ARGUMENT(400),
                DEADLINE_EXCEEDED(504),
                NOT_FOUND(404),
                ALREADY_EXISTS(409),
                PERMISSION_DENIED(403),
                RESOURCE_EXHAUSTED(429),
                FAILED_PRECONDITION(400),
                ABORTED(409),
                OUT_OF_RANGE(400),
                UNIMPLEMENTED(501),
                UNAVAILABLE(503),
                DATA_LOSS(500),
                UNAUTHENTICATED(401);

                private final int maxHttpStatusCode;
                private final int minHttpStatusCode;

                EnumC1451f7(int i) {
/* 4 */             this.minHttpStatusCode = i;
/* 6 */             this.maxHttpStatusCode = i;
                }

                public static EnumC1451f7 fromApiNameSafely(String str) {
/* 2 */             if (str == null) {
/* 1 */                 return null;
                    }
                    try {
/* 11 */                return valueOf(str.toUpperCase(Locale.ROOT));
                    } catch (IllegalArgumentException unused) {
/* 1 */                 return null;
                    }
                }

                public static EnumC1451f7 fromHttpStatusCode(int i) {
/* 7 */             for (EnumC1451f7 enumC1451f7 : values()) {
/* 15 */                if (enumC1451f7.matches(i)) {
/* 17 */                    return enumC1451f7;
                        }
                    }
/* 21 */            return null;
                }

                private boolean matches(int i) {
                    return i >= this.minHttpStatusCode && i <= this.maxHttpStatusCode;
                }

                public String apiName() {
/* 7 */             return name().toLowerCase(Locale.ROOT);
                }

                @Override // io.sentry.InterfaceC1458g2
                public void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 7 */             ((C1505c) interfaceC1518j3).m5300y(apiName());
                }

/* 8 */         EnumC1451f7(int i, int i2) {
/* 10 */            this.minHttpStatusCode = i;
/* 11 */            this.maxHttpStatusCode = i2;
                }

/* 22 */        public static EnumC1451f7 fromHttpStatusCode(Integer num, EnumC1451f7 enumC1451f7) {
/* 23 */            EnumC1451f7 enumC1451f7FromHttpStatusCode = num != null ? fromHttpStatusCode(num.intValue()) : enumC1451f7;
                    return enumC1451f7FromHttpStatusCode != null ? enumC1451f7FromHttpStatusCode : enumC1451f7;
                }
            }
