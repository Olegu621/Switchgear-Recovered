            package io.sentry.android.replay;

            import com.appsflyer.internal.AbstractC0298j;
            import io.sentry.EnumC1567n6;
            import java.util.Date;
            import java.util.List;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: renamed from: io.sentry.android.replay.e */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1315e {

                /* JADX INFO: renamed from: a */
                public final C1372x f10506a;

                /* JADX INFO: renamed from: b */
                public final C1326k f10507b;

                /* JADX INFO: renamed from: c */
                public final Date f10508c;

                /* JADX INFO: renamed from: d */
                public final int f10509d;

                /* JADX INFO: renamed from: e */
                public final long f10510e;

                /* JADX INFO: renamed from: f */
                public final EnumC1567n6 f10511f;

                /* JADX INFO: renamed from: g */
                public final String f10512g;

                /* JADX INFO: renamed from: h */
                public final List f10513h;

                public C1315e(C1372x c1372x, C1326k c1326k, Date date, int i, long j, EnumC1567n6 enumC1567n6, String str, List list) {
/* 1 */             list.getClass();
/* 7 */             this.f10506a = c1372x;
/* 9 */             this.f10507b = c1326k;
/* 11 */            this.f10508c = date;
/* 13 */            this.f10509d = i;
/* 15 */            this.f10510e = j;
/* 17 */            this.f10511f = enumC1567n6;
/* 19 */            this.f10512g = str;
/* 21 */            this.f10513h = list;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 86 */                return true;
                    }
/* 7 */             if (obj instanceof C1315e) {
/* 10 */                C1315e c1315e = (C1315e) obj;
/* 20 */                if (this.f10506a.equals(c1315e.f10506a) && this.f10507b == c1315e.f10507b && this.f10508c.equals(c1315e.f10508c) && this.f10509d == c1315e.f10509d && this.f10510e == c1315e.f10510e && this.f10511f == c1315e.f10511f && Intrinsics.m6216a(this.f10512g, c1315e.f10512g) && Intrinsics.m6216a(this.f10513h, c1315e.f10513h)) {
/* 86 */                    return true;
                        }
                    }
/* 6 */             return false;
                }

                public final int hashCode() {
/* 47 */            int iHashCode = (this.f10511f.hashCode() + ((Long.hashCode(this.f10510e) + AbstractC0298j.m1860a(this.f10509d, (this.f10508c.hashCode() + ((this.f10507b.hashCode() + (this.f10506a.hashCode() * 31)) * 31)) * 31, 31)) * 31)) * 31;
/* 48 */            String str = this.f10512g;
/* 66 */            return this.f10513h.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
                }

                public final String toString() {
/* 88 */            return "LastSegmentData(recorderConfig=" + this.f10506a + ", cache=" + this.f10507b + ", timestamp=" + this.f10508c + ", id=" + this.f10509d + ", duration=" + this.f10510e + ", replayType=" + this.f10511f + ", screenAtStart=" + this.f10512g + ", events=" + this.f10513h + ')';
                }
            }
