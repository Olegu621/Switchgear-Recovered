            package com.google.android.gms.drive.query.internal;

            import android.os.Bundle;
            import android.os.Parcel;
            import com.google.android.gms.drive.metadata.internal.MetadataBundle;
            import java.util.Collection;
            import p000.eq3;
            import p000.je3;
            import p000.lf3;
            import p000.w11;
            import p000.xe2;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzp<T> extends zza {
                public static final eq3 CREATOR = new eq3();

                /* JADX INFO: renamed from: a */
                public final MetadataBundle f3719a;

                /* JADX INFO: renamed from: b */
                public final je3 f3720b;

                public zzp(MetadataBundle metadataBundle) {
/* 4 */             this.f3719a = metadataBundle;
/* 12 */            this.f3720b = (je3) xe2.m9764H(metadataBundle);
                }

                @Override // com.google.android.gms.drive.query.Filter
                /* JADX INFO: renamed from: a0 */
                public final String mo2035a0(lf3 lf3Var) {
/* 3 */             Bundle bundle = this.f3719a.f3683a;
/* 5 */             je3 je3Var = this.f3720b;
/* 31 */            return String.format("contains(%s,%s)", je3Var.getName(), ((Collection) je3Var.zza(bundle)).iterator().next());
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9409S(parcel, 1, this.f3719a, i, false);
/* 14 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
