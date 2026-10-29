            package com.google.android.gms.common;

            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.os.RemoteException;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import com.google.android.gms.common.internal.zzv;
            import com.google.android.gms.common.internal.zzw;
            import com.google.android.gms.common.internal.zzx;
            import com.google.android.gms.dynamic.IObjectWrapper;
            import com.google.android.gms.dynamic.ObjectWrapper;
            import io.sentry.android.core.AbstractC1245n0;
            import p000.al3;
            import p000.dr3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 69 */    public final class zzt extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zzt> CREATOR = new dr3(11);

                /* JADX INFO: renamed from: a */
                public final String f3627a;

                /* JADX INFO: renamed from: b */
                public final al3 f3628b;

                /* JADX INFO: renamed from: c */
                public final boolean f3629c;

                /* JADX INFO: renamed from: d */
                public final boolean f3630d;

                public zzt(String str, IBinder iBinder, boolean z, boolean z2) {
/* 8 */             this.f3627a = str;
/* 10 */            al3 al3Var = null;
/* 11 */            if (iBinder != null) {
                        try {
/* 14 */                    int i = zzw.f3547a;
/* 18 */                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
/* 34 */                    IObjectWrapper iObjectWrapperZzd = (iInterfaceQueryLocalInterface instanceof zzx ? (zzx) iInterfaceQueryLocalInterface : new zzv(iBinder, "com.google.android.gms.common.internal.ICertData")).zzd();
/* 46 */                    byte[] bArr = iObjectWrapperZzd == null ? null : (byte[]) ObjectWrapper.m2045b(iObjectWrapperZzd);
/* 48 */                    if (bArr != null) {
/* 52 */                        al3Var = new al3(bArr);
                            } else {
/* 56 */                        AbstractC1245n0.m4876d("GoogleCertificatesQuery", "Could not unwrap certificate");
                            }
                        } catch (RemoteException e) {
/* 61 */                    AbstractC1245n0.m4877e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
                        }
                    }
/* 64 */            this.f3628b = al3Var;
/* 66 */            this.f3629c = z;
/* 68 */            this.f3630d = z2;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9410T(parcel, 1, this.f3627a, false);
/* 14 */            al3 al3Var = this.f3628b;
/* 16 */            if (al3Var == null) {
/* 22 */                AbstractC1245n0.m4889q("GoogleCertificatesQuery", "certificate binder is null");
/* 25 */                al3Var = null;
                    }
/* 27 */            w11.m9405O(parcel, 2, al3Var);
/* 32 */            w11.m9420b0(parcel, 3, 4);
/* 37 */            parcel.writeInt(this.f3629c ? 1 : 0);
/* 40 */            w11.m9420b0(parcel, 4, 4);
/* 45 */            parcel.writeInt(this.f3630d ? 1 : 0);
/* 48 */            w11.m9428f0(iM9422c0, parcel);
                }

/* 70 */        public zzt(String str, al3 al3Var, boolean z, boolean z2) {
/* 72 */            this.f3627a = str;
                    this.f3628b = al3Var;
                    this.f3629c = z;
                    this.f3630d = z2;
                }
            }
