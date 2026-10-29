            package io.sentry;

            import io.sentry.internal.debugmeta.C1505c;
            import io.sentry.util.AbstractC1714m;
            import io.sentry.util.AbstractC1717p;
            import java.util.Objects;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: renamed from: io.sentry.d7 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1430d7 implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: b */
                public static final C1430d7 f10856b = new C1430d7("00000000-0000-0000-0000-000000000000".replace("-", HttpUrl.FRAGMENT_ENCODE_SET).substring(0, 16));

                /* JADX INFO: renamed from: a */
                public volatile String f10857a;

                public C1430d7(String str) {
/* 6 */             Objects.requireNonNull(str, "value is required");
/* 9 */             this.f10857a = str;
                }

                /* JADX INFO: renamed from: a */
                public final String m5198a() {
                    String str;
/* 1 */             String str2 = this.f10857a;
/* 3 */             if (str2 != null) {
/* 71 */                return str2;
                    }
                    synchronized (this) {
                        try {
/* 6 */                     str = this.f10857a;
/* 8 */                     if (str == null) {
/* 16 */                        byte[] bArr = new byte[8];
/* 18 */                        AbstractC1714m.m5481a().m5479b(bArr);
/* 26 */                        byte b = (byte) (bArr[6] & 15);
/* 27 */                        bArr[6] = b;
/* 32 */                        bArr[6] = (byte) (b | 64);
/* 34 */                        long j = 0;
/* 37 */                        for (int i = 0; i < 8; i++) {
/* 45 */                            j = (j << 8) | ((long) (bArr[i] & 255));
                                }
/* 51 */                        char[] cArr = new char[16];
/* 53 */                        AbstractC1717p.m5487a(cArr, j);
/* 58 */                        String str3 = new String(cArr);
/* 61 */                        this.f10857a = str3;
/* 63 */                        str = str3;
                            }
                        } catch (Throwable th) {
/* 70 */                    throw th;
                        }
                    }
/* 68 */            return str;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 5 */             if (obj == null || C1430d7.class != obj.getClass()) {
/* 31 */                return false;
                    }
/* 26 */            return m5198a().equals(((C1430d7) obj).m5198a());
                }

                public final int hashCode() {
/* 5 */             return m5198a().hashCode();
                }

                @Override // io.sentry.InterfaceC1458g2
                public final void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) {
/* 7 */             ((C1505c) interfaceC1518j3).m5300y(m5198a());
                }

                public final String toString() {
/* 1 */             return m5198a();
                }
            }
