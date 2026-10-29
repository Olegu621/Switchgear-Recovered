            package com.appsflyer.lvl;

            import android.content.ComponentName;
            import android.content.Context;
            import android.content.Intent;
            import android.content.ServiceConnection;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.RemoteException;
            import com.android.vending.licensing.C0228b;
            import com.android.vending.licensing.ILicenseResultListener;
            import com.android.vending.licensing.ILicensingService;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 9 */     public class AppsFlyerLVLImpl implements ServiceConnection {
                private final long afNounce;
                private Context ctx;
                private ILicensingService lvlService;
                private final String packageName;
                private AppsFlyerLVL.resultListener resultListener;

                public AppsFlyerLVLImpl(long j, Context context, AppsFlyerLVL.resultListener resultlistener) {
/* 4 */             this.ctx = context;
/* 10 */            this.packageName = context.getPackageName();
/* 12 */            this.afNounce = j;
/* 14 */            this.resultListener = resultlistener;
                }

                public void getLVLResult() {
/* 1 */             ILicensingService iLicensingService = this.lvlService;
/* 3 */             if (iLicensingService != null) {
                        try {
/* 57 */                    iLicensingService.mo1743Z(this.afNounce, this.packageName, new ResultListener(this, 0));
/* 60 */                    return;
                        } catch (RemoteException e) {
/* 64 */                    this.resultListener.onLvlFailure(e);
/* 67 */                    return;
                        }
                    }
                    try {
/* 25 */                if (this.ctx.bindService(new Intent("com.android.vending.licensing.ILicensingService").setPackage("com.android.vending"), this, 1)) {
/* 67 */                    return;
                        }
/* 36 */                this.resultListener.onLvlFailure(new Exception("LVLException: could not bind service"));
                    } catch (SecurityException e2) {
/* 43 */                this.resultListener.onLvlFailure(e2);
                    }
                }

                @Override // android.content.ServiceConnection
                public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                    ILicensingService iLicensingService;
/* 1 */             int i = ILicensingService.Stub.f3042a;
/* 3 */             if (iBinder == null) {
/* 5 */                 iLicensingService = null;
                    } else {
/* 9 */                 IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.android.vending.licensing.ILicensingService");
/* 13 */                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ILicensingService)) {
/* 24 */                    C0228b c0228b = new C0228b();
/* 27 */                    c0228b.f3044a = iBinder;
                            iLicensingService = c0228b;
                        } else {
/* 19 */                    iLicensingService = (ILicensingService) iInterfaceQueryLocalInterface;
                        }
                    }
/* 29 */            this.lvlService = iLicensingService;
                    try {
/* 41 */                iLicensingService.mo1743Z(this.afNounce, this.packageName, new ResultListener(this, 0));
                    } catch (RemoteException e) {
/* 48 */                this.resultListener.onLvlFailure(e);
                    }
                }

                @Override // android.content.ServiceConnection
                public void onServiceDisconnected(ComponentName componentName) {
/* 2 */             this.lvlService = null;
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
/* 10 */        public class ResultListener extends ILicenseResultListener.Stub {
                    private ResultListener() {
/* 8 */                 attachInterface(this, "com.android.vending.licensing.ILicenseResultListener");
                    }

                    @Override // com.android.vending.licensing.ILicenseResultListener
                    public void verifyLicense(int i, String str, String str2) {
/* 7 */                 AppsFlyerLVLImpl.this.resultListener.onLvlResult(str, str2);
                        try {
/* 18 */                    AppsFlyerLVLImpl.this.ctx.unbindService(AppsFlyerLVLImpl.this);
                        } catch (Throwable unused) {
                        }
                    }

/* 11 */            public /* synthetic */ ResultListener(AppsFlyerLVLImpl appsFlyerLVLImpl, int i) {
/* 12 */                this();
                    }
                }
            }
