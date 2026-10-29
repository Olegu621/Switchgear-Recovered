            package p000;

            import android.app.PendingIntent;
            import android.os.Bundle;
            import androidx.core.graphics.drawable.IconCompat;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 60 */    public final class yn1 {

                /* JADX INFO: renamed from: a */
                public final Bundle f19714a;

                /* JADX INFO: renamed from: b */
                public IconCompat f19715b;

                /* JADX INFO: renamed from: c */
                public final g32[] f19716c;

                /* JADX INFO: renamed from: d */
                public final boolean f19717d;

                /* JADX INFO: renamed from: e */
                public final boolean f19718e;

                /* JADX INFO: renamed from: f */
                public final int f19719f;

                /* JADX INFO: renamed from: g */
                public final boolean f19720g;

                /* JADX INFO: renamed from: h */
                public final int f19721h;

                /* JADX INFO: renamed from: i */
                public final CharSequence f19722i;

                /* JADX INFO: renamed from: j */
                public final PendingIntent f19723j;

                /* JADX INFO: renamed from: k */
                public final boolean f19724k;

                public yn1(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, g32[] g32VarArr, boolean z, int i, boolean z2, boolean z3, boolean z4) {
/* 5 */             this.f19718e = true;
/* 7 */             this.f19715b = iconCompat;
/* 9 */             if (iconCompat != null) {
/* 11 */                int i2 = iconCompat.f1246a;
/* 23 */                if ((i2 == -1 ? gv0.m4020d(iconCompat.f1247b) : i2) == 2) {
/* 29 */                    this.f19721h = iconCompat.m587c();
                        }
                    }
/* 35 */            this.f19722i = po1.m7524b(charSequence);
/* 37 */            this.f19723j = pendingIntent;
/* 47 */            this.f19714a = bundle == null ? new Bundle() : bundle;
/* 49 */            this.f19716c = g32VarArr;
/* 51 */            this.f19717d = z;
/* 53 */            this.f19719f = i;
/* 55 */            this.f19718e = z2;
/* 57 */            this.f19720g = z3;
/* 59 */            this.f19724k = z4;
                }

/* 61 */        public yn1(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, g32[] g32VarArr, boolean z, int i2, boolean z2, boolean z3, boolean z4) {
/* 62 */            this(i == 0 ? null : IconCompat.m586b(i, HttpUrl.FRAGMENT_ENCODE_SET), charSequence, pendingIntent, bundle, g32VarArr, z, i2, z2, z3, z4);
                }
            }
