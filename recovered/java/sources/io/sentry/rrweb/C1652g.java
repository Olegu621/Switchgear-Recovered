            package io.sentry.rrweb;

            import com.appsflyer.internal.AbstractC0298j;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataContentProvider;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1458g2;
            import io.sentry.InterfaceC1518j3;
            import io.sentry.internal.debugmeta.C1505c;
            import java.io.IOException;
            import java.util.HashMap;
            
            /* JADX INFO: renamed from: io.sentry.rrweb.g */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C1652g extends AbstractC1650e implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: U */
                public HashMap f11591U;

                /* JADX INFO: renamed from: V */
                public HashMap f11592V;

                /* JADX INFO: renamed from: d */
                public EnumC1651f f11593d;

                /* JADX INFO: renamed from: e */
                public int f11594e;

                /* JADX INFO: renamed from: f */
                public float f11595f;

                /* JADX INFO: renamed from: i */
                public float f11596i;

                /* JADX INFO: renamed from: v */
                public int f11597v;

                /* JADX INFO: renamed from: w */
                public int f11598w;

                public C1652g() {
/* 3 */             super(EnumC1649d.MouseInteraction);
/* 7 */             this.f11597v = 2;
                }

                @Override // io.sentry.InterfaceC1458g2
                public final void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 1 */             C1505c c1505c = (C1505c) interfaceC1518j3;
/* 3 */             c1505c.m5287i();
/* 8 */             c1505c.m5291p("type");
/* 13 */            c1505c.m5297v(iLogger, this.f11588a);
/* 18 */            c1505c.m5291p("timestamp");
/* 23 */            c1505c.m5296u(this.f11589b);
/* 28 */            c1505c.m5291p(SharedDataContentProvider.BASE_PATH);
/* 31 */            c1505c.m5287i();
/* 36 */            c1505c.m5291p(FirebaseAnalytics.Param.SOURCE);
/* 41 */            c1505c.m5297v(iLogger, this.f11590c);
/* 44 */            c1505c.m5291p("type");
/* 49 */            c1505c.m5297v(iLogger, this.f11593d);
/* 54 */            c1505c.m5291p("id");
/* 60 */            c1505c.m5296u(this.f11594e);
/* 65 */            c1505c.m5291p("x");
/* 71 */            c1505c.m5295t(this.f11595f);
/* 76 */            c1505c.m5291p("y");
/* 82 */            c1505c.m5295t(this.f11596i);
/* 87 */            c1505c.m5291p("pointerType");
/* 93 */            c1505c.m5296u(this.f11597v);
/* 98 */            c1505c.m5291p("pointerId");
/* 104 */           c1505c.m5296u(this.f11598w);
/* 107 */           HashMap map = this.f11592V;
/* 109 */           if (map != null) {
/* 123 */               for (String str : map.keySet()) {
/* 133 */                   AbstractC0298j.m1862c(this.f11592V, str, c1505c, str, iLogger);
                        }
                    }
/* 137 */           c1505c.m5288l();
/* 140 */           HashMap map2 = this.f11591U;
/* 142 */           if (map2 != null) {
/* 156 */               for (String str2 : map2.keySet()) {
/* 166 */                   AbstractC0298j.m1862c(this.f11591U, str2, c1505c, str2, iLogger);
                        }
                    }
/* 170 */           c1505c.m5288l();
                }
            }
