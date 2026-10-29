            package com.google.android.gms.signin.internal;

            import android.content.Intent;
            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.api.Status;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.p42;
            import p000.qd3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zaa extends AbstractSafeParcelable implements p42 {
                public static final Parcelable.Creator<zaa> CREATOR = new qd3(22);

                /* JADX INFO: renamed from: a */
                public final int f4269a;

                /* JADX INFO: renamed from: b */
                public final int f4270b;

                /* JADX INFO: renamed from: c */
                public final Intent f4271c;

                public zaa(int i, int i2, Intent intent) {
/* 4 */             this.f4269a = i;
/* 6 */             this.f4270b = i2;
/* 8 */             this.f4271c = intent;
                }

                @Override // p000.p42
                public final Status getStatus() {
                    return this.f4270b == 0 ? Status.f3440e : Status.f3444w;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 9 */             w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.f4269a);
/* 18 */            w11.m9420b0(parcel, 2, 4);
/* 23 */            parcel.writeInt(this.f4270b);
/* 30 */            w11.m9409S(parcel, 3, this.f4271c, i, false);
/* 33 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
