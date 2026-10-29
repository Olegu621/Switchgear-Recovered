            package io.sentry.android.replay.video;

            import com.appsflyer.internal.AbstractC0298j;
            import java.io.File;
            
            /* JADX INFO: renamed from: io.sentry.android.replay.video.a */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1360a {

                /* JADX INFO: renamed from: a */
                public final File f10667a;

                /* JADX INFO: renamed from: b */
                public final int f10668b;

                /* JADX INFO: renamed from: c */
                public final int f10669c;

                /* JADX INFO: renamed from: d */
                public final int f10670d;

                /* JADX INFO: renamed from: e */
                public final int f10671e;

                /* JADX INFO: renamed from: f */
                public final String f10672f = "video/avc";

                public C1360a(File file, int i, int i2, int i3, int i4) {
/* 4 */             this.f10667a = file;
/* 6 */             this.f10668b = i;
/* 8 */             this.f10669c = i2;
/* 10 */            this.f10670d = i3;
/* 12 */            this.f10671e = i4;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 62 */                return true;
                    }
/* 6 */             if (!(obj instanceof C1360a)) {
/* 60 */                return false;
                    }
/* 9 */             C1360a c1360a = (C1360a) obj;
                    return this.f10667a.equals(c1360a.f10667a) && this.f10668b == c1360a.f10668b && this.f10669c == c1360a.f10669c && this.f10670d == c1360a.f10670d && this.f10671e == c1360a.f10671e && this.f10672f.equals(c1360a.f10672f);
                }

                public final int hashCode() {
/* 40 */            return this.f10672f.hashCode() + AbstractC0298j.m1860a(this.f10671e, AbstractC0298j.m1860a(this.f10670d, AbstractC0298j.m1860a(this.f10669c, AbstractC0298j.m1860a(this.f10668b, this.f10667a.hashCode() * 31, 31), 31), 31), 31);
                }

                public final String toString() {
/* 68 */            return "MuxerConfig(file=" + this.f10667a + ", recordingWidth=" + this.f10668b + ", recordingHeight=" + this.f10669c + ", frameRate=" + this.f10670d + ", bitRate=" + this.f10671e + ", mimeType=" + this.f10672f + ')';
                }
            }
