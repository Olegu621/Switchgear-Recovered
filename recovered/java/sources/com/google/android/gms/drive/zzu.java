            package com.google.android.gms.drive;

            import android.os.Parcel;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.kb1;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzu extends AbstractSafeParcelable {
                private volatile transient boolean zzbt = false;

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel parcel, int i) {
/* 5 */             kb1.m6065r(!this.zzbt);
/* 8 */             this.zzbt = true;
/* 10 */            zza(parcel, i);
                }

                public abstract void zza(Parcel parcel, int i);
            }
