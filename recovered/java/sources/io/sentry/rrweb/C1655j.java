            package io.sentry.rrweb;

            import com.appsflyer.internal.AbstractC0298j;
            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataContentProvider;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1458g2;
            import io.sentry.InterfaceC1518j3;
            import io.sentry.internal.debugmeta.C1505c;
            import io.sentry.util.AbstractC1704c;
            import java.io.IOException;
            import java.util.Arrays;
            import java.util.HashMap;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: renamed from: io.sentry.rrweb.j */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C1655j extends AbstractC1647b implements InterfaceC1458g2 {

                /* JADX INFO: renamed from: c */
                public String f11608c;

                /* JADX INFO: renamed from: d */
                public int f11609d;

                /* JADX INFO: renamed from: e */
                public int f11610e;

                /* JADX INFO: renamed from: f */
                public HashMap f11611f;

                public C1655j() {
/* 3 */             super(EnumC1648c.Meta);
/* 8 */             this.f11608c = HttpUrl.FRAGMENT_ENCODE_SET;
                }

                @Override // io.sentry.rrweb.AbstractC1647b
                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj == null || C1655j.class != obj.getClass() || !super.equals(obj)) {
/* 5 */                 return false;
                    }
/* 24 */            C1655j c1655j = (C1655j) obj;
                    return this.f11609d == c1655j.f11609d && this.f11610e == c1655j.f11610e && AbstractC1704c.m5453h(this.f11608c, c1655j.f11608c);
                }

                @Override // io.sentry.rrweb.AbstractC1647b
                public final int hashCode() {
/* 27 */            return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), this.f11608c, Integer.valueOf(this.f11609d), Integer.valueOf(this.f11610e)});
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
/* 36 */            c1505c.m5291p("href");
/* 41 */            c1505c.m5300y(this.f11608c);
/* 46 */            c1505c.m5291p("height");
/* 52 */            c1505c.m5296u(this.f11609d);
/* 57 */            c1505c.m5291p("width");
/* 63 */            c1505c.m5296u(this.f11610e);
/* 66 */            HashMap map = this.f11611f;
/* 68 */            if (map != null) {
/* 82 */                for (String str : map.keySet()) {
/* 92 */                    AbstractC0298j.m1862c(this.f11611f, str, c1505c, str, iLogger);
                        }
                    }
/* 96 */            c1505c.m5288l();
/* 99 */            c1505c.m5288l();
                }
            }
