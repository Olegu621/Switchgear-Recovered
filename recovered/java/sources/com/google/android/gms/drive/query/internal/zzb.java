            package com.google.android.gms.drive.query.internal;

            import android.os.Bundle;
            import android.os.Parcel;
            import com.google.android.gms.drive.metadata.internal.MetadataBundle;
            import p000.ii1;
            import p000.lf3;
            import p000.w11;
            import p000.xe2;
            import p000.ye3;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzb<T> extends zza {
                public static final ye3 CREATOR = new ye3();

                /* JADX INFO: renamed from: a */
                public final zzx f3709a;

                /* JADX INFO: renamed from: b */
                public final MetadataBundle f3710b;

                /* JADX INFO: renamed from: c */
                public final ii1 f3711c;

                public zzb(zzx zzxVar, MetadataBundle metadataBundle) {
/* 4 */             this.f3709a = zzxVar;
/* 6 */             this.f3710b = metadataBundle;
/* 12 */            this.f3711c = xe2.m9764H(metadataBundle);
                }

                @Override // com.google.android.gms.drive.query.Filter
                /* JADX INFO: renamed from: a0 */
                public final String mo2035a0(lf3 lf3Var) {
/* 3 */             Bundle bundle = this.f3710b.f3683a;
/* 5 */             ii1 ii1Var = this.f3711c;
/* 25 */            return String.format("cmp(%s,%s,%s)", this.f3709a.f3726a, ii1Var.getName(), ii1Var.zza(bundle));
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9409S(parcel, 1, this.f3709a, i, false);
/* 17 */            w11.m9409S(parcel, 2, this.f3710b, i, false);
/* 20 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
