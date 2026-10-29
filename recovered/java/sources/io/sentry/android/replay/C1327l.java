            package io.sentry.android.replay;

            import java.io.File;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: renamed from: io.sentry.android.replay.l */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1327l {

                /* JADX INFO: renamed from: a */
                public final File f10561a;

                /* JADX INFO: renamed from: b */
                public final long f10562b;

                /* JADX INFO: renamed from: c */
                public final String f10563c;

                public C1327l(File file, long j, String str) {
/* 4 */             this.f10561a = file;
/* 6 */             this.f10562b = j;
/* 8 */             this.f10563c = str;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 43 */                return true;
                    }
/* 6 */             if (!(obj instanceof C1327l)) {
/* 41 */                return false;
                    }
/* 9 */             C1327l c1327l = (C1327l) obj;
                    return this.f10561a.equals(c1327l.f10561a) && this.f10562b == c1327l.f10562b && Intrinsics.m6216a(this.f10563c, c1327l.f10563c);
                }

                public final int hashCode() {
/* 16 */            int iHashCode = (Long.hashCode(this.f10562b) + (this.f10561a.hashCode() * 31)) * 31;
/* 18 */            String str = this.f10563c;
/* 28 */            return iHashCode + (str == null ? 0 : str.hashCode());
                }

                public final String toString() {
/* 38 */            return "ReplayFrame(screenshot=" + this.f10561a + ", timestamp=" + this.f10562b + ", screen=" + this.f10563c + ')';
                }
            }
