            package io.sentry.protocol;

            import io.sentry.ILogger;
            import io.sentry.InterfaceC1458g2;
            import io.sentry.InterfaceC1518j3;
            import io.sentry.config.AbstractC1417a;
            import io.sentry.internal.debugmeta.C1505c;
            import okhttp3.HttpUrl;
            import p000.C1951n4;
            
            /* JADX INFO: renamed from: io.sentry.protocol.w */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C1626w implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: b */
                public static final C1626w f11478b = new C1626w("00000000-0000-0000-0000-000000000000".replace("-", HttpUrl.FRAGMENT_ENCODE_SET));

                /* JADX INFO: renamed from: a */
                public volatile String f11479a;

                public C1626w(String str) {
/* 15 */            String str2 = str.equals("0000-0000") ? "00000000-0000-0000-0000-000000000000" : str;
/* 24 */            if (str2.length() == 32 || str2.length() == 36) {
/* 58 */                this.f11479a = str2.length() == 36 ? str2.replace("-", HttpUrl.FRAGMENT_ENCODE_SET) : str2;
                    } else {
/* 39 */                C1951n4.m6859j("String representation of SentryId has either 32 (UUID no dashes) or 36 characters long (completed UUID). Received: ".concat(str));
/* 43 */                throw null;
                    }
                }

                /* JADX INFO: renamed from: a */
                public final String m5380a() {
                    String strM5172j;
/* 1 */             String str = this.f11479a;
/* 3 */             if (str != null) {
/* 23 */                return str;
                    }
                    synchronized (this) {
                        try {
/* 6 */                     strM5172j = this.f11479a;
/* 8 */                     if (strM5172j == null) {
/* 10 */                        strM5172j = AbstractC1417a.m5172j();
/* 14 */                        this.f11479a = strM5172j;
                            }
                        } catch (Throwable th) {
/* 22 */                    throw th;
                        }
                    }
/* 20 */            return strM5172j;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 5 */             if (obj == null || C1626w.class != obj.getClass()) {
/* 31 */                return false;
                    }
/* 26 */            return m5380a().equals(((C1626w) obj).m5380a());
                }

                public final int hashCode() {
/* 5 */             return m5380a().hashCode();
                }

                @Override // io.sentry.InterfaceC1458g2
                public final void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) {
/* 7 */             ((C1505c) interfaceC1518j3).m5300y(m5380a());
                }

                public final String toString() {
/* 1 */             return m5380a();
                }
            }
