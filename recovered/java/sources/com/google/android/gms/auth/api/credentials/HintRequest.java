            package com.google.android.gms.auth.api.credentials;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.ReflectedParcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.kb1;
            import p000.ub3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Deprecated
            public final class HintRequest extends AbstractSafeParcelable implements ReflectedParcelable {
                public static final Parcelable.Creator<HintRequest> CREATOR = new ub3(19);

                /* JADX INFO: renamed from: a */
                public final int f3297a;

                /* JADX INFO: renamed from: b */
                public final CredentialPickerConfig f3298b;

                /* JADX INFO: renamed from: c */
                public final boolean f3299c;

                /* JADX INFO: renamed from: d */
                public final boolean f3300d;

                /* JADX INFO: renamed from: e */
                public final String[] f3301e;

                /* JADX INFO: renamed from: f */
                public final boolean f3302f;

                /* JADX INFO: renamed from: i */
                public final String f3303i;

                /* JADX INFO: renamed from: v */
                public final String f3304v;

                public HintRequest(int i, CredentialPickerConfig credentialPickerConfig, boolean z, boolean z2, String[] strArr, boolean z3, String str, String str2) {
/* 4 */             this.f3297a = i;
/* 6 */             kb1.m6061n(credentialPickerConfig);
/* 9 */             this.f3298b = credentialPickerConfig;
/* 11 */            this.f3299c = z;
/* 13 */            this.f3300d = z2;
/* 15 */            kb1.m6061n(strArr);
/* 18 */            this.f3301e = strArr;
/* 21 */            if (i < 2) {
/* 24 */                this.f3302f = true;
/* 27 */                this.f3303i = null;
/* 29 */                this.f3304v = null;
                    } else {
/* 32 */                this.f3302f = z3;
/* 34 */                this.f3303i = str;
/* 36 */                this.f3304v = str2;
                    }
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9409S(parcel, 1, this.f3298b, i, false);
/* 16 */            w11.m9420b0(parcel, 2, 4);
/* 21 */            parcel.writeInt(this.f3299c ? 1 : 0);
/* 25 */            w11.m9420b0(parcel, 3, 4);
/* 30 */            parcel.writeInt(this.f3300d ? 1 : 0);
/* 35 */            w11.m9411U(parcel, 4, this.f3301e, false);
/* 39 */            w11.m9420b0(parcel, 5, 4);
/* 44 */            parcel.writeInt(this.f3302f ? 1 : 0);
/* 50 */            w11.m9410T(parcel, 6, this.f3303i, false);
/* 56 */            w11.m9410T(parcel, 7, this.f3304v, false);
/* 61 */            w11.m9420b0(parcel, 1000, 4);
/* 66 */            parcel.writeInt(this.f3297a);
/* 69 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
