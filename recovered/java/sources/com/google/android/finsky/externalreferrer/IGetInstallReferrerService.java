            package com.google.android.finsky.externalreferrer;

            import android.os.Bundle;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.p005a.BinderC0311b;
            import com.google.android.p005a.C0310a;
            import p000.oa3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public interface IGetInstallReferrerService extends IInterface {

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static abstract class Stub extends BinderC0311b implements IGetInstallReferrerService {

                    /* JADX INFO: renamed from: a */
                    public static final /* synthetic */ int f3126a = 0;

                    /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                    public static class Proxy extends C0310a implements IGetInstallReferrerService {
                        @Override // com.google.android.finsky.externalreferrer.IGetInstallReferrerService
                        /* JADX INFO: renamed from: c */
                        public final Bundle mo1902c(Bundle bundle) {
/* 1 */                     Parcel parcelObtain = Parcel.obtain();
/* 7 */                     parcelObtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
/* 10 */                    int i = oa3.f14695a;
/* 13 */                    parcelObtain.writeInt(1);
/* 17 */                    bundle.writeToParcel(parcelObtain, 0);
/* 20 */                    Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                try {
/* 26 */                            this.f3123a.transact(1, parcelObtain, parcelObtain2, 0);
/* 29 */                            parcelObtain2.readException();
/* 32 */                            parcelObtain.recycle();
/* 51 */                            Bundle bundle2 = (Bundle) (parcelObtain2.readInt() == 0 ? null : (Parcelable) Bundle.CREATOR.createFromParcel(parcelObtain2));
/* 53 */                            parcelObtain2.recycle();
/* 56 */                            return bundle2;
                                } catch (RuntimeException e) {
/* 60 */                            parcelObtain2.recycle();
/* 63 */                            throw e;
                                }
                            } catch (Throwable th) {
/* 64 */                        parcelObtain.recycle();
/* 67 */                        throw th;
                            }
                        }
                    }

                    @Override // com.google.android.p005a.BinderC0311b
                    /* JADX INFO: renamed from: a */
                    public final boolean mo1901a(int i, Parcel parcel, Parcel parcel2) {
/* 3 */                 if (i != 1) {
/* 1 */                     return false;
                        }
/* 5 */                 Parcelable.Creator creator = Bundle.CREATOR;
/* 7 */                 int i2 = oa3.f14695a;
/* 25 */                Bundle bundleMo1902c = mo1902c((Bundle) (parcel.readInt() == 0 ? null : (Parcelable) creator.createFromParcel(parcel)));
/* 29 */                parcel2.writeNoException();
/* 32 */                if (bundleMo1902c == null) {
/* 34 */                    parcel2.writeInt(0);
/* 2 */                     return true;
                        }
/* 38 */                parcel2.writeInt(1);
/* 41 */                bundleMo1902c.writeToParcel(parcel2, 1);
/* 2 */                 return true;
                    }
                }

                /* JADX INFO: renamed from: c */
                Bundle mo1902c(Bundle bundle);
            }
