            package io.sentry.protocol;

            import io.sentry.ILogger;
            import io.sentry.InterfaceC1458g2;
            import io.sentry.InterfaceC1518j3;
            import io.sentry.internal.debugmeta.C1505c;
            import io.sentry.util.AbstractC1704c;
            import java.io.IOException;
            import java.util.AbstractMap;
            import java.util.Arrays;
            
            /* JADX INFO: renamed from: io.sentry.protocol.k */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C1609k implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: a */
                public String f11369a;

                /* JADX INFO: renamed from: b */
                public String f11370b;

                /* JADX INFO: renamed from: c */
                public String f11371c;

                /* JADX INFO: renamed from: d */
                public C1626w f11372d;

                /* JADX INFO: renamed from: e */
                public C1626w f11373e;

                /* JADX INFO: renamed from: f */
                public String f11374f;

                /* JADX INFO: renamed from: i */
                public AbstractMap f11375i;

                public C1609k(String str) {
/* 10 */            if (str.length() > 4096) {
/* 17 */                this.f11369a = str.substring(0, 4096);
                    } else {
/* 20 */                this.f11369a = str;
                    }
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 81 */                return true;
                    }
/* 6 */             if (!(obj instanceof C1609k)) {
/* 83 */                return false;
                    }
/* 9 */             C1609k c1609k = (C1609k) obj;
                    return AbstractC1704c.m5453h(this.f11369a, c1609k.f11369a) && AbstractC1704c.m5453h(this.f11370b, c1609k.f11370b) && AbstractC1704c.m5453h(this.f11371c, c1609k.f11371c) && AbstractC1704c.m5453h(this.f11372d, c1609k.f11372d) && AbstractC1704c.m5453h(this.f11373e, c1609k.f11373e) && AbstractC1704c.m5453h(this.f11374f, c1609k.f11374f) && AbstractC1704c.m5453h(this.f11375i, c1609k.f11375i);
                }

                public final int hashCode() {
/* 19 */            return Arrays.hashCode(new Object[]{this.f11369a, this.f11370b, this.f11371c, this.f11372d, this.f11373e, this.f11374f, this.f11375i});
                }

                @Override // io.sentry.InterfaceC1458g2
                public final void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 1 */             C1505c c1505c = (C1505c) interfaceC1518j3;
/* 3 */             c1505c.m5287i();
/* 8 */             c1505c.m5291p("message");
/* 13 */            c1505c.m5300y(this.f11369a);
/* 18 */            if (this.f11370b != null) {
/* 22 */                c1505c.m5291p("contact_email");
/* 27 */                c1505c.m5300y(this.f11370b);
                    }
/* 32 */            if (this.f11371c != null) {
/* 36 */                c1505c.m5291p("name");
/* 41 */                c1505c.m5300y(this.f11371c);
                    }
/* 46 */            if (this.f11372d != null) {
/* 50 */                c1505c.m5291p("associated_event_id");
/* 55 */                this.f11372d.serialize(c1505c, iLogger);
                    }
/* 60 */            if (this.f11373e != null) {
/* 64 */                c1505c.m5291p("replay_id");
/* 69 */                this.f11373e.serialize(c1505c, iLogger);
                    }
/* 74 */            if (this.f11374f != null) {
/* 78 */                c1505c.m5291p("url");
/* 83 */                c1505c.m5300y(this.f11374f);
                    }
/* 86 */            AbstractMap abstractMap = this.f11375i;
/* 88 */            if (abstractMap != null) {
/* 102 */               for (String str : abstractMap.keySet()) {
/* 112 */                   Object obj = this.f11375i.get(str);
/* 116 */                   c1505c.m5291p(str);
/* 119 */                   c1505c.m5297v(iLogger, obj);
                        }
                    }
/* 123 */           c1505c.m5288l();
                }

                public final String toString() {
/* 78 */            return "Feedback{message='" + this.f11369a + "', contactEmail='" + this.f11370b + "', name='" + this.f11371c + "', associatedEventId=" + this.f11372d + ", replayId=" + this.f11373e + ", url='" + this.f11374f + "', unknown=" + this.f11375i + '}';
                }
            }
