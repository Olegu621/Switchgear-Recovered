            package com.google.android.gms.drive;

            import android.os.Parcel;
            import android.os.Parcelable;
            import android.util.Base64;
            import com.google.android.gms.common.internal.ReflectedParcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import com.google.android.gms.internal.drive.zzfb;
            import com.google.android.gms.internal.drive.zzkk;
            import okhttp3.HttpUrl;
            import p000.kb1;
            import p000.tf3;
            import p000.w11;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class DriveId extends AbstractSafeParcelable implements ReflectedParcelable {
                public static final Parcelable.Creator<DriveId> CREATOR = new tf3(29);

                /* JADX INFO: renamed from: a */
                public final String f3637a;

                /* JADX INFO: renamed from: b */
                public final long f3638b;

                /* JADX INFO: renamed from: c */
                public final long f3639c;

                /* JADX INFO: renamed from: d */
                public final int f3640d;

                /* JADX INFO: renamed from: e */
                public volatile String f3641e = null;

                public DriveId(String str, long j, long j2, int i) {
/* 7 */             this.f3637a = str;
/* 15 */            boolean z = true;
/* 17 */            kb1.m6054g(!HttpUrl.FRAGMENT_ENCODE_SET.equals(str));
/* 20 */            if (str == null && j == -1) {
/* 29 */                z = false;
                    }
/* 30 */            kb1.m6054g(z);
/* 33 */            this.f3638b = j;
/* 35 */            this.f3639c = j2;
/* 37 */            this.f3640d = i;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj != null && obj.getClass() == DriveId.class) {
/* 13 */                DriveId driveId = (DriveId) obj;
/* 15 */                String str = driveId.f3637a;
/* 23 */                if (driveId.f3639c != this.f3639c) {
/* 1 */                     return false;
                        }
/* 26 */                long j = driveId.f3638b;
/* 32 */                String str2 = this.f3637a;
/* 34 */                long j2 = this.f3638b;
/* 36 */                if (j == -1 && j2 == -1) {
/* 42 */                    return str.equals(str2);
                        }
/* 48 */                if (str2 != null && str != null) {
                            return j == j2 && str.equals(str2);
                        }
/* 67 */                if (j == j2) {
/* 47 */                    return true;
                        }
                    }
/* 1 */             return false;
                }

                public final int hashCode() {
/* 3 */             long j = this.f3638b;
/* 7 */             if (j == -1) {
/* 11 */                return this.f3637a.hashCode();
                    }
/* 22 */            String strValueOf = String.valueOf(String.valueOf(this.f3639c));
/* 30 */            String strValueOf2 = String.valueOf(String.valueOf(j));
/* 51 */            return (strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf)).hashCode();
                }

                public final String toString() {
/* 3 */             if (this.f3641e == null) {
/* 10 */                zzfb.zza zzaVarZzm = zzfb.zzan().zzm(1);
/* 14 */                String str = this.f3637a;
/* 16 */                if (str == null) {
/* 18 */                    str = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
/* 60 */                String strValueOf = String.valueOf(Base64.encodeToString(((zzfb) ((zzkk) zzaVarZzm.zze(str).zzg(this.f3638b).zzh(this.f3639c).zzn(this.f3640d).zzdf())).toByteArray(), 10));
/* 82 */                this.f3641e = strValueOf.length() != 0 ? "DriveId:".concat(strValueOf) : new String("DriveId:");
                    }
/* 84 */            return this.f3641e;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9410T(parcel, 2, this.f3637a, false);
/* 17 */            w11.m9420b0(parcel, 3, 8);
/* 22 */            parcel.writeLong(this.f3638b);
/* 26 */            w11.m9420b0(parcel, 4, 8);
/* 31 */            parcel.writeLong(this.f3639c);
/* 35 */            w11.m9420b0(parcel, 5, 4);
/* 40 */            parcel.writeInt(this.f3640d);
/* 43 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
