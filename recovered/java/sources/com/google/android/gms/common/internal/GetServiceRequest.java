            package com.google.android.gms.common.internal;

            import android.accounts.Account;
            import android.os.Binder;
            import android.os.Bundle;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.os.RemoteException;
            import com.google.android.gms.common.Feature;
            import com.google.android.gms.common.api.Scope;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import io.sentry.android.core.AbstractC1245n0;
            import p000.cl3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class GetServiceRequest extends AbstractSafeParcelable {
                public static final Parcelable.Creator<GetServiceRequest> CREATOR = new cl3(9);

                /* JADX INFO: renamed from: Z */
                public static final Scope[] f3487Z = new Scope[0];

                /* JADX INFO: renamed from: a0 */
                public static final Feature[] f3488a0 = new Feature[0];

                /* JADX INFO: renamed from: U */
                public Feature[] f3489U;

                /* JADX INFO: renamed from: V */
                public final boolean f3490V;

                /* JADX INFO: renamed from: W */
                public final int f3491W;

                /* JADX INFO: renamed from: X */
                public boolean f3492X;

                /* JADX INFO: renamed from: Y */
                public final String f3493Y;

                /* JADX INFO: renamed from: a */
                public final int f3494a;

                /* JADX INFO: renamed from: b */
                public final int f3495b;

                /* JADX INFO: renamed from: c */
                public final int f3496c;

                /* JADX INFO: renamed from: d */
                public String f3497d;

                /* JADX INFO: renamed from: e */
                public IBinder f3498e;

                /* JADX INFO: renamed from: f */
                public Scope[] f3499f;

                /* JADX INFO: renamed from: i */
                public Bundle f3500i;

                /* JADX INFO: renamed from: v */
                public Account f3501v;

                /* JADX INFO: renamed from: w */
                public Feature[] f3502w;

                public GetServiceRequest(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, Feature[] featureArr, Feature[] featureArr2, boolean z, int i4, boolean z2, String str2) {
/* 6 */             scopeArr = scopeArr == null ? f3487Z : scopeArr;
/* 12 */            bundle = bundle == null ? new Bundle() : bundle;
/* 15 */            Feature[] featureArr3 = f3488a0;
/* 17 */            featureArr = featureArr == null ? featureArr3 : featureArr;
/* 20 */            featureArr2 = featureArr2 == null ? featureArr3 : featureArr2;
/* 23 */            this.f3494a = i;
/* 25 */            this.f3495b = i2;
/* 27 */            this.f3496c = i3;
/* 35 */            if ("com.google.android.gms".equals(str)) {
/* 37 */                this.f3497d = "com.google.android.gms";
                    } else {
/* 40 */                this.f3497d = str;
                    }
/* 43 */            if (i < 2) {
/* 45 */                Account accountZzb = null;
/* 46 */                if (iBinder != null) {
/* 48 */                    int i5 = IAccountAccessor.Stub.f3503a;
/* 52 */                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
/* 65 */                    IAccountAccessor zztVar = iInterfaceQueryLocalInterface instanceof IAccountAccessor ? (IAccountAccessor) iInterfaceQueryLocalInterface : new zzt(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
/* 68 */                    int i6 = AccountAccessor.f3476b;
/* 70 */                    long jClearCallingIdentity = Binder.clearCallingIdentity();
                            try {
                                try {
/* 74 */                            accountZzb = zztVar.zzb();
                                } catch (RemoteException unused) {
/* 88 */                            AbstractC1245n0.m4889q("AccountAccessor", "Remote account accessor probably died");
                                }
/* 78 */                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                            } catch (Throwable th) {
/* 92 */                        Binder.restoreCallingIdentity(jClearCallingIdentity);
/* 95 */                        throw th;
                            }
                        }
/* 96 */                this.f3501v = accountZzb;
                    } else {
/* 99 */                this.f3498e = iBinder;
/* 101 */               this.f3501v = account;
                    }
/* 103 */           this.f3499f = scopeArr;
/* 105 */           this.f3500i = bundle;
/* 107 */           this.f3502w = featureArr;
/* 109 */           this.f3489U = featureArr2;
/* 111 */           this.f3490V = z;
/* 113 */           this.f3491W = i4;
/* 115 */           this.f3492X = z2;
/* 117 */           this.f3493Y = str2;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             cl3.m1722a(this, parcel, i);
                }
            }
