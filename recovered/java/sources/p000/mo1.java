            package p000;

            import android.app.PendingIntent;
            import androidx.core.graphics.drawable.IconCompat;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class mo1 {

                /* JADX INFO: renamed from: a */
                public PendingIntent f13887a;

                /* JADX INFO: renamed from: b */
                public IconCompat f13888b;

                /* JADX INFO: renamed from: c */
                public int f13889c;

                /* JADX INFO: renamed from: d */
                public int f13890d;

                /* JADX INFO: renamed from: e */
                public int f13891e;

                /* JADX INFO: renamed from: f */
                public PendingIntent f13892f;

                /* JADX INFO: renamed from: g */
                public String f13893g;

                /* JADX INFO: renamed from: a */
                public final void m6716a(int i, boolean z) {
/* 1 */             int i2 = this.f13891e;
/* 3 */             if (z) {
/* 6 */                 this.f13891e = i | i2;
                    } else {
/* 11 */                this.f13891e = (~i) & i2;
                    }
                }
            }
