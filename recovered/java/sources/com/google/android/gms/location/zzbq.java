            package com.google.android.gms.location;

            import android.app.PendingIntent;
            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import com.google.android.gms.internal.location.zzbs;
            import java.util.List;
            import p000.re3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzbq extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zzbq> CREATOR = new re3(7);

                /* JADX INFO: renamed from: a */
                public final zzbs f4173a;

                /* JADX INFO: renamed from: b */
                public final PendingIntent f4174b;

                /* JADX INFO: renamed from: c */
                public final String f4175c;

                public zzbq(List list, PendingIntent pendingIntent, String str) {
/* 15 */            this.f4173a = list == null ? zzbs.zzi() : zzbs.zzj(list);
/* 17 */            this.f4174b = pendingIntent;
/* 19 */            this.f4175c = str;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 10 */            w11.m9412V(parcel, this.f4173a, 1);
/* 17 */            w11.m9409S(parcel, 2, this.f4174b, i, false);
/* 23 */            w11.m9410T(parcel, 3, this.f4175c, false);
/* 26 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
