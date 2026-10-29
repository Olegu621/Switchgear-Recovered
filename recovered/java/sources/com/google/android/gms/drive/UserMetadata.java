            package com.google.android.gms.drive;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.ReflectedParcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.AbstractC0886en;
            import p000.dr3;
            import p000.fm0;
            import p000.w11;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class UserMetadata extends AbstractSafeParcelable implements ReflectedParcelable {
                public static final Parcelable.Creator<UserMetadata> CREATOR = new dr3(7);

                /* JADX INFO: renamed from: a */
                public final String f3646a;

                /* JADX INFO: renamed from: b */
                public final String f3647b;

                /* JADX INFO: renamed from: c */
                public final String f3648c;

                /* JADX INFO: renamed from: d */
                public final boolean f3649d;

                /* JADX INFO: renamed from: e */
                public final String f3650e;

                public UserMetadata(boolean z, String str, String str2, String str3, String str4) {
/* 4 */             this.f3646a = str;
/* 6 */             this.f3647b = str2;
/* 8 */             this.f3648c = str3;
/* 10 */            this.f3649d = z;
/* 12 */            this.f3650e = str4;
                }

                public final String toString() {
/* 11 */            StringBuilder sbM3514r = AbstractC0886en.m3514r("Permission ID: '", this.f3646a, "', Display Name: '", this.f3647b, "', Picture URL: '");
/* 17 */            sbM3514r.append(this.f3648c);
/* 22 */            sbM3514r.append("', Authenticated User: ");
/* 27 */            sbM3514r.append(this.f3649d);
/* 32 */            sbM3514r.append(", Email: '");
/* 39 */            return fm0.m3789o(sbM3514r, this.f3650e, "'");
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9410T(parcel, 2, this.f3646a, false);
/* 17 */            w11.m9410T(parcel, 3, this.f3647b, false);
/* 23 */            w11.m9410T(parcel, 4, this.f3648c, false);
/* 27 */            w11.m9420b0(parcel, 5, 4);
/* 32 */            parcel.writeInt(this.f3649d ? 1 : 0);
/* 38 */            w11.m9410T(parcel, 6, this.f3650e, false);
/* 41 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
