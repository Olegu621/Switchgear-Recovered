            package io.sentry.android.replay;

            import com.appsflyer.internal.AbstractC0298j;
            import java.io.File;
            
            /* JADX INFO: renamed from: io.sentry.android.replay.d */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1313d {

                /* JADX INFO: renamed from: a */
                public final File f10501a;

                /* JADX INFO: renamed from: b */
                public final int f10502b;

                /* JADX INFO: renamed from: c */
                public final long f10503c;

                public C1313d(File file, int i, long j) {
/* 4 */             this.f10501a = file;
/* 6 */             this.f10502b = i;
/* 8 */             this.f10503c = j;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 39 */                return true;
                    }
/* 6 */             if (!(obj instanceof C1313d)) {
/* 37 */                return false;
                    }
/* 9 */             C1313d c1313d = (C1313d) obj;
                    return this.f10501a.equals(c1313d.f10501a) && this.f10502b == c1313d.f10502b && this.f10503c == c1313d.f10503c;
                }

                public final int hashCode() {
/* 22 */            return Long.hashCode(this.f10503c) + AbstractC0298j.m1860a(this.f10502b, this.f10501a.hashCode() * 31, 31);
                }

                public final String toString() {
/* 38 */            return "GeneratedVideo(video=" + this.f10501a + ", frameCount=" + this.f10502b + ", duration=" + this.f10503c + ')';
                }
            }
