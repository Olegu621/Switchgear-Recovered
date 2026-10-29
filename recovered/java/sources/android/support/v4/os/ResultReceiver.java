            package android.support.v4.os;

            import android.os.Bundle;
            import android.os.Handler;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.os.RemoteException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 19 */    public class ResultReceiver implements Parcelable {
                public static final Parcelable.Creator<ResultReceiver> CREATOR = new Parcelable.Creator<ResultReceiver>() { // from class: android.support.v4.os.ResultReceiver.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public ResultReceiver createFromParcel(Parcel parcel) {
/* 3 */                 return new ResultReceiver(parcel);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
/* 5 */             public ResultReceiver[] newArray(int i) {
/* 6 */                 return new ResultReceiver[i];
                    }
                };
                final Handler mHandler;
                final boolean mLocal;
                IResultReceiver mReceiver;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public class MyResultReceiver extends IResultReceiver.Stub {
                    public MyResultReceiver() {
                    }

                    @Override // android.support.v4.os.IResultReceiver
                    public void send(int i, Bundle bundle) {
/* 1 */                 ResultReceiver resultReceiver = ResultReceiver.this;
/* 3 */                 Handler handler = resultReceiver.mHandler;
/* 5 */                 if (handler != null) {
/* 12 */                    handler.post(resultReceiver.new MyRunnable(i, bundle));
                        } else {
/* 16 */                    resultReceiver.onReceiveResult(i, bundle);
                        }
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public class MyRunnable implements Runnable {
                    final int mResultCode;
                    final Bundle mResultData;

                    public MyRunnable(int i, Bundle bundle) {
/* 6 */                 this.mResultCode = i;
/* 8 */                 this.mResultData = bundle;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
/* 7 */                 ResultReceiver.this.onReceiveResult(this.mResultCode, this.mResultData);
                    }
                }

                public ResultReceiver(Parcel parcel) {
/* 5 */             this.mLocal = false;
/* 8 */             this.mHandler = null;
/* 18 */            this.mReceiver = IResultReceiver.Stub.asInterface(parcel.readStrongBinder());
                }

                @Override // android.os.Parcelable
                public int describeContents() {
/* 1 */             return 0;
                }

                public void onReceiveResult(int i, Bundle bundle) {
                }

                public void send(int i, Bundle bundle) {
/* 3 */             if (this.mLocal) {
/* 5 */                 Handler handler = this.mHandler;
/* 7 */                 if (handler != null) {
/* 14 */                    handler.post(new MyRunnable(i, bundle));
/* 17 */                    return;
                        } else {
/* 18 */                    onReceiveResult(i, bundle);
/* 21 */                    return;
                        }
                    }
/* 22 */            IResultReceiver iResultReceiver = this.mReceiver;
/* 24 */            if (iResultReceiver != null) {
                        try {
/* 26 */                    iResultReceiver.send(i, bundle);
                        } catch (RemoteException unused) {
                        }
                    }
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel parcel, int i) {
                    synchronized (this) {
                        try {
/* 4 */                     if (this.mReceiver == null) {
/* 11 */                        this.mReceiver = new MyResultReceiver();
                            }
/* 22 */                    parcel.writeStrongBinder(this.mReceiver.asBinder());
                        } catch (Throwable th) {
/* 28 */                    throw th;
                        }
                    }
                }

/* 20 */        public ResultReceiver(Handler handler) {
/* 22 */            this.mLocal = true;
/* 23 */            this.mHandler = handler;
                }
            }
