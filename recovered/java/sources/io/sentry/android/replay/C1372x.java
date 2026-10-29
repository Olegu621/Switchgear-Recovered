            package io.sentry.android.replay;

            import com.appsflyer.internal.AbstractC0298j;
            import p000.AbstractC0886en;
            
            /* JADX INFO: renamed from: io.sentry.android.replay.x */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1372x {

                /* JADX INFO: renamed from: a */
                public final int f10703a;

                /* JADX INFO: renamed from: b */
                public final int f10704b;

                /* JADX INFO: renamed from: c */
                public final float f10705c;

                /* JADX INFO: renamed from: d */
                public final float f10706d;

                /* JADX INFO: renamed from: e */
                public final int f10707e;

                /* JADX INFO: renamed from: f */
                public final int f10708f;

                public C1372x(int i, int i2, float f, float f2, int i3, int i4) {
/* 4 */             this.f10703a = i;
/* 6 */             this.f10704b = i2;
/* 8 */             this.f10705c = f;
/* 10 */            this.f10706d = f2;
/* 12 */            this.f10707e = i3;
/* 14 */            this.f10708f = i4;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof C1372x)) {
/* 7 */                 return false;
                    }
/* 11 */            C1372x c1372x = (C1372x) obj;
                    return this.f10703a == c1372x.f10703a && this.f10704b == c1372x.f10704b && Float.compare(this.f10705c, c1372x.f10705c) == 0 && Float.compare(this.f10706d, c1372x.f10706d) == 0 && this.f10707e == c1372x.f10707e && this.f10708f == c1372x.f10708f;
                }

                public final int hashCode() {
/* 44 */            return Integer.hashCode(this.f10708f) + AbstractC0298j.m1860a(this.f10707e, (Float.hashCode(this.f10706d) + ((Float.hashCode(this.f10705c) + AbstractC0298j.m1860a(this.f10704b, Integer.hashCode(this.f10703a) * 31, 31)) * 31)) * 31, 31);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("ScreenshotRecorderConfig(recordingWidth=");
/* 10 */            sb.append(this.f10703a);
/* 15 */            sb.append(", recordingHeight=");
/* 20 */            sb.append(this.f10704b);
/* 25 */            sb.append(", scaleFactorX=");
/* 30 */            sb.append(this.f10705c);
/* 35 */            sb.append(", scaleFactorY=");
/* 40 */            sb.append(this.f10706d);
/* 45 */            sb.append(", frameRate=");
/* 50 */            sb.append(this.f10707e);
/* 55 */            sb.append(", bitRate=");
/* 62 */            return AbstractC0886en.m3510n(sb, this.f10708f, ')');
                }
            }
