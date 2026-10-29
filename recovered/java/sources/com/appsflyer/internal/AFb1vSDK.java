            package com.appsflyer.internal;

            import android.content.ComponentName;
            import android.content.Context;
            import android.content.Intent;
            import android.content.ServiceConnection;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Looper;
            import android.os.Parcel;
            import android.os.RemoteException;
            import com.appsflyer.AFLogger;
            import java.util.concurrent.LinkedBlockingQueue;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.TimeoutException;
            import p000.ds0;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Deprecated
            public final class AFb1vSDK {

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static final class AFa1tSDK implements IInterface {
                    private final IBinder getCurrencyIso4217Code;

                    public AFa1tSDK(IBinder iBinder) {
/* 4 */                 this.getCurrencyIso4217Code = iBinder;
                    }

                    public final boolean AFAdRevenueData() throws RemoteException {
/* 1 */                 Parcel parcelObtain = Parcel.obtain();
/* 5 */                 Parcel parcelObtain2 = Parcel.obtain();
                        try {
/* 11 */                    parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
/* 15 */                    parcelObtain.writeInt(1);
/* 22 */                    this.getCurrencyIso4217Code.transact(2, parcelObtain, parcelObtain2, 0);
/* 25 */                    parcelObtain2.readException();
/* 32 */                    return parcelObtain2.readInt() != 0;
                        } finally {
/* 44 */                    parcelObtain2.recycle();
/* 47 */                    parcelObtain.recycle();
                        }
                    }

                    @Override // android.os.IInterface
                    public final IBinder asBinder() {
/* 1 */                 return this.getCurrencyIso4217Code;
                    }

                    public final String getRevenue() throws RemoteException {
/* 1 */                 Parcel parcelObtain = Parcel.obtain();
/* 5 */                 Parcel parcelObtain2 = Parcel.obtain();
                        try {
/* 11 */                    parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
/* 18 */                    this.getCurrencyIso4217Code.transact(1, parcelObtain, parcelObtain2, 0);
/* 21 */                    parcelObtain2.readException();
/* 24 */                    return parcelObtain2.readString();
                        } finally {
/* 36 */                    parcelObtain2.recycle();
/* 39 */                    parcelObtain.recycle();
                        }
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static final class AFa1ySDK {
                    public final String getCurrencyIso4217Code;
                    private final boolean getMediationNetwork;

                    public AFa1ySDK(String str, boolean z) {
/* 4 */                 this.getCurrencyIso4217Code = str;
/* 6 */                 this.getMediationNetwork = z;
                    }

                    public final boolean AFAdRevenueData() {
/* 1 */                 return this.getMediationNetwork;
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static final class AFa1zSDK implements ServiceConnection {
                    final LinkedBlockingQueue<IBinder> getRevenue = new LinkedBlockingQueue<>(1);
                    boolean AFAdRevenueData = false;

                    @Override // android.content.ServiceConnection
                    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                        try {
/* 3 */                     this.getRevenue.put(iBinder);
                        } catch (InterruptedException e) {
/* 10 */                    AFLogger.afErrorLogForExcManagerOnly("onServiceConnected Interrupted", e);
                        }
                    }

                    @Override // android.content.ServiceConnection
                    public final void onServiceDisconnected(ComponentName componentName) {
                    }
                }

                public static AFa1ySDK AFAdRevenueData(Context context) throws Exception {
/* 10 */            if (Looper.myLooper() == Looper.getMainLooper()) {
/* 121 */               f42.m3656l("Cannot be called from the main thread");
/* 9 */                 return null;
                    }
/* 19 */            context.getPackageManager().getPackageInfo("com.android.vending", 0);
/* 24 */            AFa1zSDK aFa1zSDK = new AFa1zSDK();
/* 31 */            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
/* 36 */            intent.setPackage("com.google.android.gms");
                    try {
/* 44 */                if (!context.bindService(intent, aFa1zSDK, 1)) {
/* 106 */                   context.unbindService(aFa1zSDK);
/* 111 */                   ds0.m3195l("Google Play connection failed");
/* 9 */                     return null;
                        }
/* 50 */                if (aFa1zSDK.AFAdRevenueData) {
/* 105 */                   throw new IllegalStateException("Cannot call get on this connection more than once");
                        }
/* 52 */                aFa1zSDK.AFAdRevenueData = true;
/* 60 */                IBinder iBinderPoll = aFa1zSDK.getRevenue.poll(10L, TimeUnit.SECONDS);
/* 66 */                if (iBinderPoll == null) {
/* 97 */                    throw new TimeoutException("Timed out waiting for the service connection");
                        }
/* 68 */                AFa1tSDK aFa1tSDK = new AFa1tSDK(iBinderPoll);
/* 81 */                AFa1ySDK aFa1ySDK = new AFa1ySDK(aFa1tSDK.getRevenue(), aFa1tSDK.AFAdRevenueData());
/* 84 */                context.unbindService(aFa1zSDK);
/* 87 */                return aFa1ySDK;
                    } catch (Throwable th) {
/* 115 */               context.unbindService(aFa1zSDK);
/* 118 */               throw th;
                    }
                }
            }
