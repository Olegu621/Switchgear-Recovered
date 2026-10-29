            package com.google.android.gms.drive;

            import android.os.Parcel;
            import android.os.Parcelable;
            import androidx.core.app.NotificationCompat;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.Arrays;
            import p000.de3;
            import p000.dr3;
            import p000.w11;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzr extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zzr> CREATOR = new dr3(2);

                /* JADX INFO: renamed from: a */
                public String f3733a;

                /* JADX INFO: renamed from: b */
                public int f3734b;

                /* JADX INFO: renamed from: c */
                public String f3735c;

                /* JADX INFO: renamed from: d */
                public String f3736d;

                /* JADX INFO: renamed from: e */
                public int f3737e;

                /* JADX INFO: renamed from: f */
                public boolean f3738f;

                public final boolean equals(Object obj) {
/* 2 */             if (obj != null && obj.getClass() == zzr.class) {
/* 14 */                if (obj == this) {
/* 13 */                    return true;
                        }
/* 17 */                zzr zzrVar = (zzr) obj;
/* 27 */                if (de3.m3029k(this.f3733a, zzrVar.f3733a) && this.f3734b == zzrVar.f3734b && this.f3737e == zzrVar.f3737e && this.f3738f == zzrVar.f3738f) {
/* 13 */                    return true;
                        }
                    }
/* 1 */             return false;
                }

                public final int hashCode() {
/* 25 */            return Arrays.hashCode(new Object[]{this.f3733a, Integer.valueOf(this.f3734b), Integer.valueOf(this.f3737e), Boolean.valueOf(this.f3738f)});
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    String str;
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 7 */             int i2 = this.f3734b;
                    switch (i2) {
                        case NotificationCompat.FLAG_LOCAL_ONLY /* 256 */:
                        case 257:
                        case 258:
/* 14 */                    str = this.f3733a;
                            break;
                        default:
/* 12 */                    str = null;
                            break;
                    }
/* 18 */            w11.m9410T(parcel, 2, str, false);
                    switch (i2) {
                        case NotificationCompat.FLAG_LOCAL_ONLY /* 256 */:
                        case 257:
                        case 258:
                            break;
                        default:
/* 25 */                    i2 = -1;
                            break;
                    }
/* 28 */            w11.m9420b0(parcel, 3, 4);
/* 31 */            parcel.writeInt(i2);
/* 36 */            w11.m9410T(parcel, 4, this.f3735c, false);
/* 42 */            w11.m9410T(parcel, 5, this.f3736d, false);
/* 45 */            int i3 = this.f3737e;
/* 47 */            int i4 = (i3 == 0 || i3 == 1 || i3 == 2 || i3 == 3) ? i3 : -1;
/* 59 */            w11.m9420b0(parcel, 6, 4);
/* 62 */            parcel.writeInt(i4);
/* 65 */            boolean z = this.f3738f;
/* 68 */            w11.m9420b0(parcel, 7, 4);
/* 71 */            parcel.writeInt(z ? 1 : 0);
/* 74 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
