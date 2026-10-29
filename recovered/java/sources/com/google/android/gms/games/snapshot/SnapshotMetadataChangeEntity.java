            package com.google.android.gms.games.snapshot;

            import android.net.Uri;
            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.data.BitmapTeleporter;
            import com.google.android.gms.games.internal.zzh;
            import p000.kb1;
            import p000.mf2;
            import p000.re3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class SnapshotMetadataChangeEntity extends zzh implements mf2 {
                public static final Parcelable.Creator<SnapshotMetadataChangeEntity> CREATOR = new re3(15);

                /* JADX INFO: renamed from: a */
                public final String f4044a;

                /* JADX INFO: renamed from: b */
                public final Long f4045b;

                /* JADX INFO: renamed from: c */
                public final Uri f4046c;

                /* JADX INFO: renamed from: d */
                public final BitmapTeleporter f4047d;

                /* JADX INFO: renamed from: e */
                public final Long f4048e;

                public SnapshotMetadataChangeEntity(String str, Long l, BitmapTeleporter bitmapTeleporter, Uri uri, Long l2) {
/* 4 */             this.f4044a = str;
/* 6 */             this.f4045b = l;
/* 8 */             this.f4047d = bitmapTeleporter;
/* 10 */            this.f4046c = uri;
/* 12 */            this.f4048e = l2;
/* 14 */            boolean z = true;
/* 15 */            if (bitmapTeleporter != null && uri != null) {
/* 20 */                z = false;
                    }
/* 23 */            kb1.m6063p("Cannot set both a URI and an image", z);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9410T(parcel, 1, this.f4044a, false);
/* 17 */            w11.m9408R(parcel, 2, this.f4045b);
/* 23 */            w11.m9409S(parcel, 4, this.f4046c, i, false);
/* 29 */            w11.m9409S(parcel, 5, this.f4047d, i, false);
/* 35 */            w11.m9408R(parcel, 6, this.f4048e);
/* 38 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
