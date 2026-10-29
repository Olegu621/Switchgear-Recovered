            package io.sentry.transport;

            import java.net.Authenticator;
            import java.net.PasswordAuthentication;
            
            /* JADX INFO: renamed from: io.sentry.transport.l */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C1686l extends Authenticator {

                /* JADX INFO: renamed from: a */
                public final String f11701a;

                /* JADX INFO: renamed from: b */
                public final String f11702b;

                public C1686l(String str, String str2) {
/* 4 */             this.f11701a = str;
/* 6 */             this.f11702b = str2;
                }

                @Override // java.net.Authenticator
                public final PasswordAuthentication getPasswordAuthentication() {
/* 7 */             if (getRequestorType() != Authenticator.RequestorType.PROXY) {
/* 23 */                return null;
                    }
/* 19 */            return new PasswordAuthentication(this.f11701a, this.f11702b.toCharArray());
                }
            }
