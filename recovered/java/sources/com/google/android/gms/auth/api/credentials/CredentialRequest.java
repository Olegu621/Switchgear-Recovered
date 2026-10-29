            package com.google.android.gms.auth.api.credentials;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.kb1;
            import p000.ub3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Deprecated
            public final class CredentialRequest extends AbstractSafeParcelable {
                public static final Parcelable.Creator<CredentialRequest> CREATOR = new ub3(17);

                /* JADX INFO: renamed from: a */
                public final int f3288a;

                /* JADX INFO: renamed from: b */
                public final boolean f3289b;

                /* JADX INFO: renamed from: c */
                public final String[] f3290c;

                /* JADX INFO: renamed from: d */
                public final CredentialPickerConfig f3291d;

                /* JADX INFO: renamed from: e */
                public final CredentialPickerConfig f3292e;

                /* JADX INFO: renamed from: f */
                public final boolean f3293f;

                /* JADX INFO: renamed from: i */
                public final String f3294i;

                /* JADX INFO: renamed from: v */
                public final String f3295v;

                /* JADX INFO: renamed from: w */
                public final boolean f3296w;

                public CredentialRequest(int i, boolean z, String[] strArr, CredentialPickerConfig credentialPickerConfig, CredentialPickerConfig credentialPickerConfig2, boolean z2, String str, String str2, boolean z3) {
/* 4 */             this.f3288a = i;
/* 6 */             this.f3289b = z;
/* 8 */             kb1.m6061n(strArr);
/* 11 */            this.f3290c = strArr;
/* 26 */            this.f3291d = credentialPickerConfig == null ? new CredentialPickerConfig(2, 1, false, true, false) : credentialPickerConfig;
/* 41 */            this.f3292e = credentialPickerConfig2 == null ? new CredentialPickerConfig(2, 1, false, true, false) : credentialPickerConfig2;
/* 44 */            if (i < 3) {
/* 47 */                this.f3293f = true;
/* 50 */                this.f3294i = null;
/* 52 */                this.f3295v = null;
                    } else {
/* 55 */                this.f3293f = z2;
/* 57 */                this.f3294i = str;
/* 59 */                this.f3295v = str2;
                    }
/* 61 */            this.f3296w = z3;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 9 */             w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.f3289b ? 1 : 0);
/* 21 */            w11.m9411U(parcel, 2, this.f3290c, false);
/* 27 */            w11.m9409S(parcel, 3, this.f3291d, i, false);
/* 32 */            w11.m9409S(parcel, 4, this.f3292e, i, false);
/* 36 */            w11.m9420b0(parcel, 5, 4);
/* 41 */            parcel.writeInt(this.f3293f ? 1 : 0);
/* 47 */            w11.m9410T(parcel, 6, this.f3294i, false);
/* 53 */            w11.m9410T(parcel, 7, this.f3295v, false);
/* 58 */            w11.m9420b0(parcel, 8, 4);
/* 63 */            parcel.writeInt(this.f3296w ? 1 : 0);
/* 68 */            w11.m9420b0(parcel, 1000, 4);
/* 73 */            parcel.writeInt(this.f3288a);
/* 76 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
