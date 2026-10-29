            package io.sentry.protocol;

            import com.appsflyer.internal.AbstractC0298j;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1458g2;
            import io.sentry.InterfaceC1518j3;
            import io.sentry.internal.debugmeta.C1505c;
            import java.io.IOException;
            import java.util.HashMap;
            import java.util.List;
            
            /* JADX INFO: renamed from: io.sentry.protocol.l0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C1612l0 implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: U */
                public Double f11383U;

                /* JADX INFO: renamed from: V */
                public List f11384V;

                /* JADX INFO: renamed from: W */
                public HashMap f11385W;

                /* JADX INFO: renamed from: a */
                public String f11386a;

                /* JADX INFO: renamed from: b */
                public String f11387b;

                /* JADX INFO: renamed from: c */
                public String f11388c;

                /* JADX INFO: renamed from: d */
                public String f11389d;

                /* JADX INFO: renamed from: e */
                public Double f11390e;

                /* JADX INFO: renamed from: f */
                public Double f11391f;

                /* JADX INFO: renamed from: i */
                public Double f11392i;

                /* JADX INFO: renamed from: v */
                public Double f11393v;

                /* JADX INFO: renamed from: w */
                public String f11394w;

                @Override // io.sentry.InterfaceC1458g2
                public final void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 1 */             C1505c c1505c = (C1505c) interfaceC1518j3;
/* 3 */             c1505c.m5287i();
/* 8 */             if (this.f11386a != null) {
/* 12 */                c1505c.m5291p("rendering_system");
/* 17 */                c1505c.m5300y(this.f11386a);
                    }
/* 22 */            if (this.f11387b != null) {
/* 26 */                c1505c.m5291p("type");
/* 31 */                c1505c.m5300y(this.f11387b);
                    }
/* 36 */            if (this.f11388c != null) {
/* 40 */                c1505c.m5291p("identifier");
/* 45 */                c1505c.m5300y(this.f11388c);
                    }
/* 50 */            if (this.f11389d != null) {
/* 54 */                c1505c.m5291p("tag");
/* 59 */                c1505c.m5300y(this.f11389d);
                    }
/* 64 */            if (this.f11390e != null) {
/* 68 */                c1505c.m5291p("width");
/* 73 */                c1505c.m5299x(this.f11390e);
                    }
/* 78 */            if (this.f11391f != null) {
/* 82 */                c1505c.m5291p("height");
/* 87 */                c1505c.m5299x(this.f11391f);
                    }
/* 92 */            if (this.f11392i != null) {
/* 96 */                c1505c.m5291p("x");
/* 101 */               c1505c.m5299x(this.f11392i);
                    }
/* 106 */           if (this.f11393v != null) {
/* 110 */               c1505c.m5291p("y");
/* 115 */               c1505c.m5299x(this.f11393v);
                    }
/* 120 */           if (this.f11394w != null) {
/* 124 */               c1505c.m5291p("visibility");
/* 129 */               c1505c.m5300y(this.f11394w);
                    }
/* 134 */           if (this.f11383U != null) {
/* 138 */               c1505c.m5291p("alpha");
/* 143 */               c1505c.m5299x(this.f11383U);
                    }
/* 146 */           List list = this.f11384V;
/* 148 */           if (list != null && !list.isEmpty()) {
/* 158 */               c1505c.m5291p("children");
/* 163 */               c1505c.m5297v(iLogger, this.f11384V);
                    }
/* 166 */           HashMap map = this.f11385W;
/* 168 */           if (map != null) {
/* 182 */               for (String str : map.keySet()) {
/* 192 */                   AbstractC0298j.m1862c(this.f11385W, str, c1505c, str, iLogger);
                        }
                    }
/* 196 */           c1505c.m5288l();
                }
            }
